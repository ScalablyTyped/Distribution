package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerViewProperties
  extends StObject
     with LayerViewProperties {
  
  /**
    * Applies a client-side [FeatureFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html) to the displayed data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
  
  /**
    * The maximum number of features that can be displayed at a time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[Double] = js.undefined
  
  /**
    * Signifies whether the maximum number of features has been exceeded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.undefined
}
object SceneLayerViewProperties {
  
  @scala.inline
  def apply(): SceneLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneLayerViewProperties]
  }
  
  @scala.inline
  implicit class SceneLayerViewPropertiesMutableBuilder[Self <: SceneLayerViewProperties] (val x: Self) extends AnyVal {
    
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
