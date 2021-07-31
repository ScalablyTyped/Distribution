package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry[T] extends StObject {
  
  var data: T
  
  var geometry: typings.three.mod.Geometry
  
  def init(data: js.Any): Unit
  
  var name: String
  
  var schema: Schema_[js.Any]
}
object Geometry {
  
  @scala.inline
  def apply[T](
    data: T,
    geometry: typings.three.mod.Geometry,
    init: js.Any => Unit,
    name: String,
    schema: Schema_[js.Any]
  ): Geometry[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry[T]]
  }
  
  @scala.inline
  implicit class GeometryMutableBuilder[Self <: Geometry[?], T] (val x: Self & Geometry[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: typings.three.mod.Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: js.Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Schema_[js.Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
