package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryDescriptor[T /* <: Geometry[_] */] extends StObject {
  
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
  implicit class GeometryDescriptorMutableBuilder[Self <: GeometryDescriptor[_], T /* <: Geometry[_] */] (val x: Self with GeometryDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: GeometryConstructor[T]): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Schema_[js.Object]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
