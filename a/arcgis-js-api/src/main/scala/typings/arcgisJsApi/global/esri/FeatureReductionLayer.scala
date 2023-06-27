package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FeatureReductionLayer")
@js.native
open class FeatureReductionLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.FeatureReductionLayer {
  
  /**
  		 * Configures the method for reducing the number of point features in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureReductionLayer.html#featureReduction)
  		 */
  /* CompleteClass */
  var featureReduction: typings.arcgisJsApi.esri.FeatureReductionBinning | typings.arcgisJsApi.esri.FeatureReductionCluster | typings.arcgisJsApi.esri.FeatureReductionSelection = js.native
}
