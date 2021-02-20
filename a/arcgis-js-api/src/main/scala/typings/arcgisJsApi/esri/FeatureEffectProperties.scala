package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureEffectProperties extends StObject {
  
  /**
    * The graphical [css filter](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) operation applied to the features that do not meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect)
    */
  var excludedEffect: js.UndefOr[String] = js.native
  
  /**
    * Indicates if labels for features that are [excluded](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) from the effect are visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedLabelsVisible)
    */
  var excludedLabelsVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The filter that drives the effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.native
  
  /**
    * The graphical [css filter](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) operation applied to the features that meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect)
    */
  var includedEffect: js.UndefOr[String] = js.native
}
object FeatureEffectProperties {
  
  @scala.inline
  def apply(): FeatureEffectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureEffectProperties]
  }
  
  @scala.inline
  implicit class FeatureEffectPropertiesMutableBuilder[Self <: FeatureEffectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedEffect(value: String): Self = StObject.set(x, "excludedEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedEffectUndefined: Self = StObject.set(x, "excludedEffect", js.undefined)
    
    @scala.inline
    def setExcludedLabelsVisible(value: Boolean): Self = StObject.set(x, "excludedLabelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedLabelsVisibleUndefined: Self = StObject.set(x, "excludedLabelsVisible", js.undefined)
    
    @scala.inline
    def setFilter(value: FeatureFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIncludedEffect(value: String): Self = StObject.set(x, "includedEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedEffectUndefined: Self = StObject.set(x, "includedEffect", js.undefined)
  }
}
