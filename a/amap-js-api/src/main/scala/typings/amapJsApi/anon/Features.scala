package typings.amapJsApi.anon

import typings.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typings.amapJsApi.amapJsApiStrings.FeatureCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features
  extends StObject
     with GeoJSONObject {
  
  var features: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
  ]
  
  var properties: js.Any
  
  var `type`: FeatureCollection
}
object Features {
  
  inline def apply(
    features: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
    ],
    properties: js.Any
  ): Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FeatureCollection")
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setFeatures(
      value: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
        ]
    ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object)*
    ): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
