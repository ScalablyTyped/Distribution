package typings.amapJsApi.anon

import typings.amapJsApi.amapJsApiStrings.GeometryCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometries
  extends StObject
     with typings.amapJsApi.AMap.GeoJSON.Geometry {
  
  var geometries: js.Array[typings.amapJsApi.AMap.GeoJSON.Geometry]
  
  var `type`: GeometryCollection
}
object Geometries {
  
  inline def apply(geometries: js.Array[typings.amapJsApi.AMap.GeoJSON.Geometry]): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GeometryCollection")
    __obj.asInstanceOf[Geometries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Geometries] (val x: Self) extends AnyVal {
    
    inline def setGeometries(value: js.Array[typings.amapJsApi.AMap.GeoJSON.Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesVarargs(value: typings.amapJsApi.AMap.GeoJSON.Geometry*): Self = StObject.set(x, "geometries", js.Array(value*))
    
    inline def setType(value: GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
