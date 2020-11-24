package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureEffectProperties extends js.Object {
  
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
  implicit class FeatureEffectPropertiesOps[Self <: FeatureEffectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcludedEffect(value: String): Self = this.set("excludedEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedEffect: Self = this.set("excludedEffect", js.undefined)
    
    @scala.inline
    def setExcludedLabelsVisible(value: Boolean): Self = this.set("excludedLabelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedLabelsVisible: Self = this.set("excludedLabelsVisible", js.undefined)
    
    @scala.inline
    def setFilter(value: FeatureFilterProperties): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIncludedEffect(value: String): Self = this.set("includedEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedEffect: Self = this.set("includedEffect", js.undefined)
  }
}
