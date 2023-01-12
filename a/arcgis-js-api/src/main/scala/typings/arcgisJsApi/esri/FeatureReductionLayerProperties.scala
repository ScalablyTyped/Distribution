package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.FeatureReductionBinningPr
import typings.arcgisJsApi.anon.FeatureReductionClusterPr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureReductionLayerProperties extends StObject {
  
  /**
    * Configures the method for reducing the number of point features in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureReductionLayer.html#featureReduction)
    */
  var featureReduction: js.UndefOr[
    FeatureReductionBinningPr | FeatureReductionClusterPr | typings.arcgisJsApi.anon.FeatureReductionSelection
  ] = js.undefined
}
object FeatureReductionLayerProperties {
  
  inline def apply(): FeatureReductionLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureReductionLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureReductionLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setFeatureReduction(
      value: FeatureReductionBinningPr | FeatureReductionClusterPr | typings.arcgisJsApi.anon.FeatureReductionSelection
    ): Self = StObject.set(x, "featureReduction", value.asInstanceOf[js.Any])
    
    inline def setFeatureReductionUndefined: Self = StObject.set(x, "featureReduction", js.undefined)
  }
}
