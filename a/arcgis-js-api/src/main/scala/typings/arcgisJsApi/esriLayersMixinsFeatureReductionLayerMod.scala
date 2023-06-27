package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureReductionBinning
import typings.arcgisJsApi.esri.FeatureReductionCluster
import typings.arcgisJsApi.esri.FeatureReductionLayer
import typings.arcgisJsApi.esri.FeatureReductionSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsFeatureReductionLayerMod {
  
  @JSImport("esri/layers/mixins/FeatureReductionLayer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FeatureReductionLayer {
    
    /**
    		 * Configures the method for reducing the number of point features in the view.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureReductionLayer.html#featureReduction)
    		 */
    /* CompleteClass */
    var featureReduction: FeatureReductionBinning | FeatureReductionCluster | FeatureReductionSelection = js.native
  }
}
