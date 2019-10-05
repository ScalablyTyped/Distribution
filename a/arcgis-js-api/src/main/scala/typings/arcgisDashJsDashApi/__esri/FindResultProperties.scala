package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindResultProperties extends js.Object {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.undefined
  /**
    * The found feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.undefined
  /**
    * The name of the field that contains the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#foundFieldName)
    */
  var foundFieldName: js.UndefOr[String] = js.undefined
  /**
    * Unique ID of the layer that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#layerId)
    */
  var layerId: js.UndefOr[Double] = js.undefined
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#layerName)
    */
  var layerName: js.UndefOr[String] = js.undefined
  /**
    * The value of the `foundFieldName` in the feature's attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#value)
    */
  var value: js.UndefOr[Unit] = js.undefined
}

object FindResultProperties {
  @scala.inline
  def apply(
    displayFieldName: String = null,
    feature: GraphicProperties = null,
    foundFieldName: String = null,
    layerId: Int | Double = null,
    layerName: String = null,
    value: js.UndefOr[Unit] = js.undefined
  ): FindResultProperties = {
    val __obj = js.Dynamic.literal()
    if (displayFieldName != null) __obj.updateDynamic("displayFieldName")(displayFieldName)
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (foundFieldName != null) __obj.updateDynamic("foundFieldName")(foundFieldName)
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (layerName != null) __obj.updateDynamic("layerName")(layerName)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FindResultProperties]
  }
}

