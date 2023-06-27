package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This object contains a helper method for generating default labels to be set on a layer's [binning configuration](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#labelingInfo).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html)
	 */
trait bins extends StObject {
  
  /**
  		 * Generates default [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html#labelingInfo) schemes to be set on a FeatureLayer's [featureReduction](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html#getLabelSchemes)
  		 */
  def getLabelSchemes(params: binsGetLabelSchemesParams): js.Promise[Schemes]
}
object bins {
  
  inline def apply(getLabelSchemes: binsGetLabelSchemesParams => js.Promise[Schemes]): bins = {
    val __obj = js.Dynamic.literal(getLabelSchemes = js.Any.fromFunction1(getLabelSchemes))
    __obj.asInstanceOf[bins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: bins] (val x: Self) extends AnyVal {
    
    inline def setGetLabelSchemes(value: binsGetLabelSchemesParams => js.Promise[Schemes]): Self = StObject.set(x, "getLabelSchemes", js.Any.fromFunction1(value))
  }
}
