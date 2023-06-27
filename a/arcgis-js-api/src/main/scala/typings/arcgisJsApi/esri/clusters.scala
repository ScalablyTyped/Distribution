package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This object contains a helper method for generating default labels to be set on a layer's [cluster configuration](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html)
	 */
trait clusters extends StObject {
  
  /**
  		 * Generates default [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) schemes to be set on a FeatureLayer's [featureReduction](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction) configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#getLabelSchemes)
  		 */
  def getLabelSchemes(params: clustersGetLabelSchemesParams): js.Promise[clustersSchemes]
}
object clusters {
  
  inline def apply(getLabelSchemes: clustersGetLabelSchemesParams => js.Promise[clustersSchemes]): clusters = {
    val __obj = js.Dynamic.literal(getLabelSchemes = js.Any.fromFunction1(getLabelSchemes))
    __obj.asInstanceOf[clusters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: clusters] (val x: Self) extends AnyVal {
    
    inline def setGetLabelSchemes(value: clustersGetLabelSchemesParams => js.Promise[clustersSchemes]): Self = StObject.set(x, "getLabelSchemes", js.Any.fromFunction1(value))
  }
}
