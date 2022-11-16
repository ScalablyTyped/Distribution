package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVLayerViewProperties
  extends StObject
     with LayerViewProperties {
  
  /**
    * The featureEffect can be used to draw attention features of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#featureEffect)
    */
  var featureEffect: js.UndefOr[FeatureEffectProperties] = js.undefined
  
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#timeExtent) filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
  
  /**
    * The maximum number of features that can be displayed at a time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[Double] = js.undefined
  
  /**
    * Signifies whether the maximum number of features has been exceeded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.undefined
}
object CSVLayerViewProperties {
  
  inline def apply(): CSVLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVLayerViewProperties]
  }
  
  extension [Self <: CSVLayerViewProperties](x: Self) {
    
    inline def setFeatureEffect(value: FeatureEffectProperties): Self = StObject.set(x, "featureEffect", value.asInstanceOf[js.Any])
    
    inline def setFeatureEffectUndefined: Self = StObject.set(x, "featureEffect", js.undefined)
    
    inline def setFilter(value: FeatureFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaximumNumberOfFeatures(value: Double): Self = StObject.set(x, "maximumNumberOfFeatures", value.asInstanceOf[js.Any])
    
    inline def setMaximumNumberOfFeaturesExceeded(value: Boolean): Self = StObject.set(x, "maximumNumberOfFeaturesExceeded", value.asInstanceOf[js.Any])
    
    inline def setMaximumNumberOfFeaturesExceededUndefined: Self = StObject.set(x, "maximumNumberOfFeaturesExceeded", js.undefined)
    
    inline def setMaximumNumberOfFeaturesUndefined: Self = StObject.set(x, "maximumNumberOfFeatures", js.undefined)
  }
}
