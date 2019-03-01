package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVLayerViewProperties extends LayerViewProperties {
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to SceneView. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[scala.Double] = js.undefined
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[scala.Boolean] = js.undefined
}

object CSVLayerViewProperties {
  @scala.inline
  def apply(
    maximumNumberOfFeatures: scala.Int | scala.Double = null,
    maximumNumberOfFeaturesExceeded: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): CSVLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    if (maximumNumberOfFeatures != null) __obj.updateDynamic("maximumNumberOfFeatures")(maximumNumberOfFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumNumberOfFeaturesExceeded)) __obj.updateDynamic("maximumNumberOfFeaturesExceeded")(maximumNumberOfFeaturesExceeded)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[CSVLayerViewProperties]
  }
}

