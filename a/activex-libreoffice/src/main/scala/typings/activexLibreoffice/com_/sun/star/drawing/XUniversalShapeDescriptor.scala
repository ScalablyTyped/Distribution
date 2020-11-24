package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XUniversalShapeDescriptor extends XShapeDescriptor {
  
  def setShapeType(aShapeTypeName: String): Unit = js.native
}
object XUniversalShapeDescriptor {
  
  @scala.inline
  def apply(
    ShapeType: String,
    acquire: () => Unit,
    getShapeType: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setShapeType: String => Unit
  ): XUniversalShapeDescriptor = {
    val __obj = js.Dynamic.literal(ShapeType = ShapeType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getShapeType = js.Any.fromFunction0(getShapeType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setShapeType = js.Any.fromFunction1(setShapeType))
    __obj.asInstanceOf[XUniversalShapeDescriptor]
  }
  
  @scala.inline
  implicit class XUniversalShapeDescriptorOps[Self <: XUniversalShapeDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetShapeType(value: String => Unit): Self = this.set("setShapeType", js.Any.fromFunction1(value))
  }
}
