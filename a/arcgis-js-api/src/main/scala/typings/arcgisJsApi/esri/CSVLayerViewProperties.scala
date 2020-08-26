package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVLayerViewProperties extends LayerViewProperties {
  /**
    * The effect applied to the layer view. The effect allows for the selection of features via a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter), and an [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) are applied to those features that respectively pass or fail the filter requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#effect)
    */
  var effect: js.UndefOr[FeatureEffectProperties] = js.native
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter. Only the features that satisfy the filter are displayed on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.native
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to SceneView. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[Double] = js.native
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to SceneView.
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
  implicit class CSVLayerViewPropertiesOps[Self <: CSVLayerViewProperties] (val x: Self) extends AnyVal {
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
    def setEffect(value: FeatureEffectProperties): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setFilter(value: FeatureFilterProperties): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMaximumNumberOfFeatures(value: Double): Self = this.set("maximumNumberOfFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNumberOfFeatures: Self = this.set("maximumNumberOfFeatures", js.undefined)
    @scala.inline
    def setMaximumNumberOfFeaturesExceeded(value: Boolean): Self = this.set("maximumNumberOfFeaturesExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNumberOfFeaturesExceeded: Self = this.set("maximumNumberOfFeaturesExceeded", js.undefined)
  }
  
}

