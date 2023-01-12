package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry[T] extends StObject {
  
  var data: T
  
  var geometry: typings.three.examplesJsmDeprecatedGeometryMod.Geometry
  
  def init(data: Any): Unit
  
  var name: String
  
  var schema: Schema_[Any]
}
object Geometry {
  
  inline def apply[T](
    data: T,
    geometry: typings.three.examplesJsmDeprecatedGeometryMod.Geometry,
    init: Any => Unit,
    name: String,
    schema: Schema_[Any]
  ): Geometry[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Geometry[?], T] (val x: Self & Geometry[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: typings.three.examplesJsmDeprecatedGeometryMod.Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Schema_[Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
