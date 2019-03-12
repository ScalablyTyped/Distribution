package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a factory for XPropertyControls
  * @since OOo 2.0.3
  */
trait XPropertyControlFactory extends js.Object {
  /**
    * creates a {@link XPropertyControl}
    *
    * A {@link XPropertyControlFactory} can create any of the control types denoted by the {@link PropertyControlType} constants.
    * @param ControlType the type of the requested control
    * @param CreateReadOnly determines whether the newly created control should be readonly.  If this argument is `TRUE` , this does not necessarily mean that
    * @returns a control of the given type.
    * @throws com::sun::star::lang::IllegalArgumentException if the given ControlType is not a value {@link PropertyControlType}
    */
  def createPropertyControl(ControlType: scala.Double, CreateReadOnly: scala.Boolean): XPropertyControl
}

object XPropertyControlFactory {
  @scala.inline
  def apply(createPropertyControl: (scala.Double, scala.Boolean) => XPropertyControl): XPropertyControlFactory = {
    val __obj = js.Dynamic.literal(createPropertyControl = js.Any.fromFunction2(createPropertyControl))
  
    __obj.asInstanceOf[XPropertyControlFactory]
  }
}

