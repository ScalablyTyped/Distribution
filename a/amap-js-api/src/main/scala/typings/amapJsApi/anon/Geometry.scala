package typings.amapJsApi.anon

import typings.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typings.amapJsApi.amapJsApiStrings.Feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry
  extends StObject
     with GeoJSONObject {
  
  var geometry: typings.amapJsApi.AMap.GeoJSON.Geometry
  
  var properties: Any
  
  var `type`: Feature
}
object Geometry {
  
  inline def apply(geometry: typings.amapJsApi.AMap.GeoJSON.Geometry, properties: Any): Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Feature")
    __obj.asInstanceOf[Geometry]
  }
  
  extension [Self <: Geometry](x: Self) {
    
    inline def setGeometry(value: typings.amapJsApi.AMap.GeoJSON.Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
