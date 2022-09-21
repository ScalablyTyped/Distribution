package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureSetInfo
  extends StObject
     with Object {
  
  /**
    * The [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FeatureSetInfo)
    */
  var featureSet: FeatureSet
  
  /**
    * The [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FeatureSetInfo)
    */
  var layer: FeatureLayer
}
object FeatureSetInfo {
  
  inline def apply(
    constructor: js.Function,
    featureSet: FeatureSet,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureSetInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], featureSet = featureSet.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureSetInfo]
  }
  
  extension [Self <: FeatureSetInfo](x: Self) {
    
    inline def setFeatureSet(value: FeatureSet): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: FeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
  }
}
