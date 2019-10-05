package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendLayerProperties extends js.Object {
  /**
    * The id of the operational layer to include in the printout's legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#layerId)
    */
  var layerId: js.UndefOr[String] = js.undefined
  /**
    * The ids of the sublayers to include in the printout's legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#subLayerIds)
    */
  var subLayerIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The title of the feature layer. Use this property to modify feature layer name in the legend for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}

object LegendLayerProperties {
  @scala.inline
  def apply(layerId: String = null, subLayerIds: js.Array[String] = null, title: String = null): LegendLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (layerId != null) __obj.updateDynamic("layerId")(layerId)
    if (subLayerIds != null) __obj.updateDynamic("subLayerIds")(subLayerIds)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LegendLayerProperties]
  }
}

