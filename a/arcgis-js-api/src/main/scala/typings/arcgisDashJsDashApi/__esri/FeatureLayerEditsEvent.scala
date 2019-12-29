package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerEditsEvent extends js.Object {
  var addedAttachments: js.Array[FeatureEditResult]
  var addedFeatures: js.Array[FeatureEditResult]
  var deletedAttachments: js.Array[FeatureEditResult]
  var deletedFeatures: js.Array[FeatureEditResult]
  var updatedAttachments: js.Array[FeatureEditResult]
  var updatedFeatures: js.Array[FeatureEditResult]
}

object FeatureLayerEditsEvent {
  @scala.inline
  def apply(
    addedAttachments: js.Array[FeatureEditResult],
    addedFeatures: js.Array[FeatureEditResult],
    deletedAttachments: js.Array[FeatureEditResult],
    deletedFeatures: js.Array[FeatureEditResult],
    updatedAttachments: js.Array[FeatureEditResult],
    updatedFeatures: js.Array[FeatureEditResult]
  ): FeatureLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedAttachments = addedAttachments.asInstanceOf[js.Any], addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedAttachments = deletedAttachments.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedAttachments = updatedAttachments.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureLayerEditsEvent]
  }
}

