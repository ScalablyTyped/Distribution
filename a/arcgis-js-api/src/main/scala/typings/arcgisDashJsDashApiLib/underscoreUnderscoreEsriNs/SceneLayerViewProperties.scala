package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneLayerViewProperties extends LayerViewProperties {
  /**
    * Applies a client-side [FeatureFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html) to the displayed data.   For 3D object scene layers, only spatial filters are supported, that is, a filter where the geometry is set and spatialRelationship is one of `contains`, `intersects`, `disjoint`.  For point scene layers, the full FeatureFilter functionality is supported.  Only the features that satisfy the filter are displayed. Filters with unsupported fields are rejected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to point scene layers. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[scala.Double] = js.undefined
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to point scene layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[scala.Boolean] = js.undefined
}

object SceneLayerViewProperties {
  @scala.inline
  def apply(
    filter: FeatureFilterProperties = null,
    maximumNumberOfFeatures: scala.Int | scala.Double = null,
    maximumNumberOfFeaturesExceeded: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): SceneLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (maximumNumberOfFeatures != null) __obj.updateDynamic("maximumNumberOfFeatures")(maximumNumberOfFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumNumberOfFeaturesExceeded)) __obj.updateDynamic("maximumNumberOfFeaturesExceeded")(maximumNumberOfFeaturesExceeded)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SceneLayerViewProperties]
  }
}

