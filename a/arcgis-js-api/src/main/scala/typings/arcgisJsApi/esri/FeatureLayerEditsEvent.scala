package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerEditsEvent extends js.Object {
  
  var addedAttachments: js.Array[FeatureEditResult] = js.native
  
  var addedFeatures: js.Array[FeatureEditResult] = js.native
  
  var deletedAttachments: js.Array[FeatureEditResult] = js.native
  
  var deletedFeatures: js.Array[FeatureEditResult] = js.native
  
  var updatedAttachments: js.Array[FeatureEditResult] = js.native
  
  var updatedFeatures: js.Array[FeatureEditResult] = js.native
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
  
  @scala.inline
  implicit class FeatureLayerEditsEventOps[Self <: FeatureLayerEditsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddedAttachmentsVarargs(value: FeatureEditResult*): Self = this.set("addedAttachments", js.Array(value :_*))
    
    @scala.inline
    def setAddedAttachments(value: js.Array[FeatureEditResult]): Self = this.set("addedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedFeaturesVarargs(value: FeatureEditResult*): Self = this.set("addedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setAddedFeatures(value: js.Array[FeatureEditResult]): Self = this.set("addedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedAttachmentsVarargs(value: FeatureEditResult*): Self = this.set("deletedAttachments", js.Array(value :_*))
    
    @scala.inline
    def setDeletedAttachments(value: js.Array[FeatureEditResult]): Self = this.set("deletedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedFeaturesVarargs(value: FeatureEditResult*): Self = this.set("deletedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDeletedFeatures(value: js.Array[FeatureEditResult]): Self = this.set("deletedFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAttachmentsVarargs(value: FeatureEditResult*): Self = this.set("updatedAttachments", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedAttachments(value: js.Array[FeatureEditResult]): Self = this.set("updatedAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFeaturesVarargs(value: FeatureEditResult*): Self = this.set("updatedFeatures", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedFeatures(value: js.Array[FeatureEditResult]): Self = this.set("updatedFeatures", value.asInstanceOf[js.Any])
  }
}
