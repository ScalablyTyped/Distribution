package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSVLayerViewProperties extends LayerViewProperties {
  
  /**
    * The effect applied to the layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#effect)
    */
  var effect: js.UndefOr[FeatureEffectProperties] = js.native
  
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.native
  
  /**
    * The maximum number of features that can be displayed at a time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[Double] = js.native
  
  /**
    * Signifies whether the maximum number of features has been exceeded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.native
}
object CSVLayerViewProperties {
  
  @scala.inline
  def apply(): CSVLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVLayerViewProperties]
  }
  
  @scala.inline
  implicit class CSVLayerViewPropertiesMutableBuilder[Self <: CSVLayerViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: FeatureEffectProperties): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setFilter(value: FeatureFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaximumNumberOfFeatures(value: Double): Self = StObject.set(x, "maximumNumberOfFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNumberOfFeaturesExceeded(value: Boolean): Self = StObject.set(x, "maximumNumberOfFeaturesExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNumberOfFeaturesExceededUndefined: Self = StObject.set(x, "maximumNumberOfFeaturesExceeded", js.undefined)
    
    @scala.inline
    def setMaximumNumberOfFeaturesUndefined: Self = StObject.set(x, "maximumNumberOfFeatures", js.undefined)
  }
}
