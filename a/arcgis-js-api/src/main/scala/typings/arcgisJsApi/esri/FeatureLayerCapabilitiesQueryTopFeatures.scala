package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerCapabilitiesQueryTopFeatures
  extends StObject
     with Object {
  
  /**
    * Indicates if the [top query operation](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) supports a cache hint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsCacheHint: Boolean
}
object FeatureLayerCapabilitiesQueryTopFeatures {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsCacheHint: Boolean
  ): FeatureLayerCapabilitiesQueryTopFeatures = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesQueryTopFeatures]
  }
  
  extension [Self <: FeatureLayerCapabilitiesQueryTopFeatures](x: Self) {
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
  }
}
