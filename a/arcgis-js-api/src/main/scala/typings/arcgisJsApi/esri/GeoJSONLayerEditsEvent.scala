package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerEditsEvent extends js.Object {
  var addedFeatures: js.Array[GeoJSONLayerEditsEventAddedFeatures]
  var deletedFeatures: js.Array[GeoJSONLayerEditsEventDeletedFeatures]
  var updatedFeatures: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]
}

object GeoJSONLayerEditsEvent {
  @scala.inline
  def apply(
    addedFeatures: js.Array[GeoJSONLayerEditsEventAddedFeatures],
    deletedFeatures: js.Array[GeoJSONLayerEditsEventDeletedFeatures],
    updatedFeatures: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]
  ): GeoJSONLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerEditsEvent]
  }
}

