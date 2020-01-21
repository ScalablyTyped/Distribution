package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifyResultProperties extends js.Object {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.undefined
  /**
    * An identified feature from the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.undefined
  /**
    * Unique ID of the layer that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerId)
    */
  var layerId: js.UndefOr[Double] = js.undefined
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerName)
    */
  var layerName: js.UndefOr[String] = js.undefined
}

object IdentifyResultProperties {
  @scala.inline
  def apply(
    displayFieldName: String = null,
    feature: GraphicProperties = null,
    layerId: Int | Double = null,
    layerName: String = null
  ): IdentifyResultProperties = {
    val __obj = js.Dynamic.literal()
    if (displayFieldName != null) __obj.updateDynamic("displayFieldName")(displayFieldName.asInstanceOf[js.Any])
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (layerName != null) __obj.updateDynamic("layerName")(layerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifyResultProperties]
  }
}

