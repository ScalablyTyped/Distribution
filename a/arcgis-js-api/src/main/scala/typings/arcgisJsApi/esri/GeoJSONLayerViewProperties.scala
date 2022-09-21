package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerViewProperties
  extends StObject
     with LayerViewProperties {
  
  /**
    * The effect applied to the layerView.
    *
    * @deprecated since version 4.22. Use [featureEffect](#featureEffect) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#effect)
    */
  var effect: js.UndefOr[FeatureEffectProperties] = js.undefined
  
  /**
    * The featureEffect can be used to draw attention features of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#featureEffect)
    */
  var featureEffect: js.UndefOr[FeatureEffectProperties] = js.undefined
  
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#timeExtent) filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
  
  /**
    * The maximum number of features that can be displayed at a time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[Double] = js.undefined
  
  /**
    * Signifies whether the maximum number of features has been exceeded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.undefined
}
object GeoJSONLayerViewProperties {
  
  inline def apply(): GeoJSONLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONLayerViewProperties]
  }
  
  extension [Self <: GeoJSONLayerViewProperties](x: Self) {
    
    inline def setEffect(value: FeatureEffectProperties): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
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
