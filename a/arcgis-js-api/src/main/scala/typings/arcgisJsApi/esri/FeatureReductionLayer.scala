package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureReductionLayer extends StObject {
  
  /**
    * Configures the method for reducing the number of point features in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureReductionLayer.html#featureReduction)
    */
  var featureReduction: FeatureReductionBinning | FeatureReductionCluster | FeatureReductionSelection
}
object FeatureReductionLayer {
  
  inline def apply(featureReduction: FeatureReductionBinning | FeatureReductionCluster | FeatureReductionSelection): FeatureReductionLayer = {
    val __obj = js.Dynamic.literal(featureReduction = featureReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureReductionLayer]
  }
  
  extension [Self <: FeatureReductionLayer](x: Self) {
    
    inline def setFeatureReduction(value: FeatureReductionBinning | FeatureReductionCluster | FeatureReductionSelection): Self = StObject.set(x, "featureReduction", value.asInstanceOf[js.Any])
  }
}
