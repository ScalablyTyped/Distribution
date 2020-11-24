package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryDescriptor[T /* <: Geometry[_] */] extends js.Object {
  
  var Geometry: GeometryConstructor[T] = js.native
  
  var schema: Schema_[js.Object] = js.native
}
object GeometryDescriptor {
  
  @scala.inline
  def apply[T /* <: Geometry[_] */](Geometry: GeometryConstructor[T], schema: Schema_[js.Object]): GeometryDescriptor[T] = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryDescriptor[T]]
  }
  
  @scala.inline
  implicit class GeometryDescriptorOps[Self <: GeometryDescriptor[_], T /* <: Geometry[_] */] (val x: Self with GeometryDescriptor[T]) extends AnyVal {
    
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
    def setGeometry(value: GeometryConstructor[T]): Self = this.set("Geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Schema_[js.Object]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
}
