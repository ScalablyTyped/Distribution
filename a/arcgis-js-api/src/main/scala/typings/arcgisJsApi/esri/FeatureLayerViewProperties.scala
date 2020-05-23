package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerViewProperties extends LayerViewProperties {
  /**
    * The effect applied to the layer view. The effect allows for the selection of features via a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter), and an [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) are applied to those features that respectively pass or fail the filter requirements.
    * > **Known Limitations**  FeatureEffect is not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#effect)
    */
  var effect: js.UndefOr[FeatureEffectProperties] = js.undefined
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter. Only the features that satisfy the filter are displayed on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to SceneView. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[Double] = js.undefined
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.undefined
}

object FeatureLayerViewProperties {
  @scala.inline
  def apply(
    effect: FeatureEffectProperties = null,
    filter: FeatureFilterProperties = null,
    maximumNumberOfFeatures: js.UndefOr[Double] = js.undefined,
    maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): FeatureLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumNumberOfFeatures)) __obj.updateDynamic("maximumNumberOfFeatures")(maximumNumberOfFeatures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumNumberOfFeaturesExceeded)) __obj.updateDynamic("maximumNumberOfFeaturesExceeded")(maximumNumberOfFeaturesExceeded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerViewProperties]
  }
}

