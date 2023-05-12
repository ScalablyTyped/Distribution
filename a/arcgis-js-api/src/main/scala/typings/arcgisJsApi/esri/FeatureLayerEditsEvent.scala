package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerEditsEvent extends StObject {
  
  var addedAttachments: js.Array[FeatureEditResult]
  
  var addedFeatures: js.Array[FeatureEditResult]
  
  var deletedAttachments: js.Array[FeatureEditResult]
  
  var deletedFeatures: js.Array[FeatureEditResult]
  
  var editedFeatures: EditedFeatureResult
  
  var exceededTransferLimit: Boolean
  
  var updatedAttachments: js.Array[FeatureEditResult]
  
  var updatedFeatures: js.Array[FeatureEditResult]
}
object FeatureLayerEditsEvent {
  
  inline def apply(
    addedAttachments: js.Array[FeatureEditResult],
    addedFeatures: js.Array[FeatureEditResult],
    deletedAttachments: js.Array[FeatureEditResult],
    deletedFeatures: js.Array[FeatureEditResult],
    editedFeatures: EditedFeatureResult,
    exceededTransferLimit: Boolean,
    updatedAttachments: js.Array[FeatureEditResult],
    updatedFeatures: js.Array[FeatureEditResult]
  ): FeatureLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedAttachments = addedAttachments.asInstanceOf[js.Any], addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedAttachments = deletedAttachments.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], editedFeatures = editedFeatures.asInstanceOf[js.Any], exceededTransferLimit = exceededTransferLimit.asInstanceOf[js.Any], updatedAttachments = updatedAttachments.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerEditsEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerEditsEvent] (val x: Self) extends AnyVal {
    
    inline def setAddedAttachments(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "addedAttachments", value.asInstanceOf[js.Any])
    
    inline def setAddedAttachmentsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "addedAttachments", js.Array(value*))
    
    inline def setAddedFeatures(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "addedFeatures", value.asInstanceOf[js.Any])
    
    inline def setAddedFeaturesVarargs(value: FeatureEditResult*): Self = StObject.set(x, "addedFeatures", js.Array(value*))
    
    inline def setDeletedAttachments(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "deletedAttachments", value.asInstanceOf[js.Any])
    
    inline def setDeletedAttachmentsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "deletedAttachments", js.Array(value*))
    
    inline def setDeletedFeatures(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "deletedFeatures", value.asInstanceOf[js.Any])
    
    inline def setDeletedFeaturesVarargs(value: FeatureEditResult*): Self = StObject.set(x, "deletedFeatures", js.Array(value*))
    
    inline def setEditedFeatures(value: EditedFeatureResult): Self = StObject.set(x, "editedFeatures", value.asInstanceOf[js.Any])
    
    inline def setExceededTransferLimit(value: Boolean): Self = StObject.set(x, "exceededTransferLimit", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAttachments(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "updatedAttachments", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAttachmentsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "updatedAttachments", js.Array(value*))
    
    inline def setUpdatedFeatures(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "updatedFeatures", value.asInstanceOf[js.Any])
    
    inline def setUpdatedFeaturesVarargs(value: FeatureEditResult*): Self = StObject.set(x, "updatedFeatures", js.Array(value*))
  }
}
