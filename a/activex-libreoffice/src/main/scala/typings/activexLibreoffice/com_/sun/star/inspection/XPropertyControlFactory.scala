package typings.activexLibreoffice.com_.sun.star.inspection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a factory for XPropertyControls
  * @since OOo 2.0.3
  */
@js.native
trait XPropertyControlFactory extends StObject {
  
  /**
    * creates a {@link XPropertyControl}
    *
    * A {@link XPropertyControlFactory} can create any of the control types denoted by the {@link PropertyControlType} constants.
    * @param ControlType the type of the requested control
    * @param CreateReadOnly determines whether the newly created control should be readonly.  If this argument is `TRUE` , this does not necessarily mean that
    * @returns a control of the given type.
    * @throws com::sun::star::lang::IllegalArgumentException if the given ControlType is not a value {@link PropertyControlType}
    */
  def createPropertyControl(ControlType: Double, CreateReadOnly: Boolean): XPropertyControl = js.native
}
object XPropertyControlFactory {
  
  @scala.inline
  def apply(createPropertyControl: (Double, Boolean) => XPropertyControl): XPropertyControlFactory = {
    val __obj = js.Dynamic.literal(createPropertyControl = js.Any.fromFunction2(createPropertyControl))
    __obj.asInstanceOf[XPropertyControlFactory]
  }
  
  @scala.inline
  implicit class XPropertyControlFactoryMutableBuilder[Self <: XPropertyControlFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatePropertyControl(value: (Double, Boolean) => XPropertyControl): Self = StObject.set(x, "createPropertyControl", js.Any.fromFunction2(value))
  }
}
