package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneLayerViewProperties extends LayerViewProperties {
  /**
    * Applies a client-side [FeatureFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html) to the displayed data. Only the features that satisfy the filter are displayed.  For 3D object scene layers, only spatial filters with [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship) set to `contains`, `intersects` or `disjoint` are supported.  The fields to be used for the filter must be present in the layer view's [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields) list.  The [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) property is not supported on a SceneLayerView filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to point scene layers. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[Double] = js.undefined
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to point scene layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.undefined
}

object SceneLayerViewProperties {
  @scala.inline
  def apply(
    filter: FeatureFilterProperties = null,
    maximumNumberOfFeatures: Int | Double = null,
    maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SceneLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (maximumNumberOfFeatures != null) __obj.updateDynamic("maximumNumberOfFeatures")(maximumNumberOfFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumNumberOfFeaturesExceeded)) __obj.updateDynamic("maximumNumberOfFeaturesExceeded")(maximumNumberOfFeaturesExceeded)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SceneLayerViewProperties]
  }
}

