package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers some settings which are allowed even for objects which are not yet inserted into a draw page.
  * @deprecated Deprecatedreplaced by com::sun::star::lang::XServiceName
  */
@js.native
trait XShapeDescriptor extends XInterface {
  
  /** @returns the programmatic name of the shape type. */
  val ShapeType: String = js.native
  
  /** @returns the programmatic name of the shape type. */
  def getShapeType(): String = js.native
}
object XShapeDescriptor {
  
  @scala.inline
  def apply(
    ShapeType: String,
    acquire: () => Unit,
    getShapeType: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XShapeDescriptor = {
    val __obj = js.Dynamic.literal(ShapeType = ShapeType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getShapeType = js.Any.fromFunction0(getShapeType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XShapeDescriptor]
  }
  
  @scala.inline
  implicit class XShapeDescriptorMutableBuilder[Self <: XShapeDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetShapeType(value: () => String): Self = StObject.set(x, "getShapeType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShapeType(value: String): Self = StObject.set(x, "ShapeType", value.asInstanceOf[js.Any])
  }
}
