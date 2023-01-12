package typings.amapJsApi.anon

import typings.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typings.amapJsApi.amapJsApiStrings.FeatureCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features
  extends StObject
     with GeoJSONObject {
  
  var features: js.Array[GeoJSONObject]
  
  var properties: Any
  
  var `type`: FeatureCollection
}
object Features {
  
  inline def apply(features: js.Array[GeoJSONObject], properties: Any): Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FeatureCollection")
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[GeoJSONObject]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: GeoJSONObject*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
