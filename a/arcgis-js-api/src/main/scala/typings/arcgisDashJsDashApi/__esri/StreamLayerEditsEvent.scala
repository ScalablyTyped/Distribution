package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerEditsEvent extends js.Object {
  var addedFeatures: js.Array[StreamLayerEditsEventAddedFeatures]
  var deletedFeatures: js.Array[StreamLayerEditsEventDeletedFeatures]
  var updatedFeatures: js.Array[StreamLayerEditsEventUpdatedFeatures]
}

object StreamLayerEditsEvent {
  @scala.inline
  def apply(
    addedFeatures: js.Array[StreamLayerEditsEventAddedFeatures],
    deletedFeatures: js.Array[StreamLayerEditsEventDeletedFeatures],
    updatedFeatures: js.Array[StreamLayerEditsEventUpdatedFeatures]
  ): StreamLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StreamLayerEditsEvent]
  }
}

