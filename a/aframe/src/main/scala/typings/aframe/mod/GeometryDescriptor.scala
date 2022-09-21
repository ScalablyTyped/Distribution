package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryDescriptor[T /* <: Geometry[Any] */] extends StObject {
  
  var Geometry: GeometryConstructor[T]
  
  var schema: Schema_[js.Object]
}
object GeometryDescriptor {
  
  inline def apply[T /* <: Geometry[Any] */](Geometry: GeometryConstructor[T], schema: Schema_[js.Object]): GeometryDescriptor[T] = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryDescriptor[T]]
  }
  
  extension [Self <: GeometryDescriptor[?], T /* <: Geometry[Any] */](x: Self & GeometryDescriptor[T]) {
    
    inline def setGeometry(value: GeometryConstructor[T]): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Schema_[js.Object]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
