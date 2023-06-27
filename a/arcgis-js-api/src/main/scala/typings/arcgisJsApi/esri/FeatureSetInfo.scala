package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureSetInfo extends StObject {
  
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
  
  inline def apply(featureSet: FeatureSet, layer: FeatureLayer): FeatureSetInfo = {
    val __obj = js.Dynamic.literal(featureSet = featureSet.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSetInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureSetInfo] (val x: Self) extends AnyVal {
    
    inline def setFeatureSet(value: FeatureSet): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: FeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
  }
}
