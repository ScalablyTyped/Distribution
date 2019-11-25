package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerEditsEvent extends js.Object {
  var addedFeatures: js.Array[FeatureLayerEditsEventAddedFeatures]
  var deletedFeatures: js.Array[FeatureLayerEditsEventDeletedFeatures]
  var updatedFeatures: js.Array[FeatureLayerEditsEventUpdatedFeatures]
}

object FeatureLayerEditsEvent {
  @scala.inline
  def apply(
    addedFeatures: js.Array[FeatureLayerEditsEventAddedFeatures],
    deletedFeatures: js.Array[FeatureLayerEditsEventDeletedFeatures],
    updatedFeatures: js.Array[FeatureLayerEditsEventUpdatedFeatures]
  ): FeatureLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureLayerEditsEvent]
  }
}

