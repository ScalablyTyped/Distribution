package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerEditsEvent extends StObject {
  
  var addedAttachments: js.Array[SubtypeGroupLayerFeatureEditResult]
  
  var addedFeatures: js.Array[SubtypeGroupLayerFeatureEditResult]
  
  var deletedAttachments: js.Array[SubtypeGroupLayerFeatureEditResult]
  
  var deletedFeatures: js.Array[SubtypeGroupLayerFeatureEditResult]
  
  var updatedAttachments: js.Array[SubtypeGroupLayerFeatureEditResult]
  
  var updatedFeatures: js.Array[SubtypeGroupLayerFeatureEditResult]
}
object SubtypeGroupLayerEditsEvent {
  
  inline def apply(
    addedAttachments: js.Array[SubtypeGroupLayerFeatureEditResult],
    addedFeatures: js.Array[SubtypeGroupLayerFeatureEditResult],
    deletedAttachments: js.Array[SubtypeGroupLayerFeatureEditResult],
    deletedFeatures: js.Array[SubtypeGroupLayerFeatureEditResult],
    updatedAttachments: js.Array[SubtypeGroupLayerFeatureEditResult],
    updatedFeatures: js.Array[SubtypeGroupLayerFeatureEditResult]
  ): SubtypeGroupLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedAttachments = addedAttachments.asInstanceOf[js.Any], addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedAttachments = deletedAttachments.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedAttachments = updatedAttachments.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerEditsEvent]
  }
  
  extension [Self <: SubtypeGroupLayerEditsEvent](x: Self) {
    
    inline def setAddedAttachments(value: js.Array[SubtypeGroupLayerFeatureEditResult]): Self = StObject.set(x, "addedAttachments", value.asInstanceOf[js.Any])
    
    inline def setAddedAttachmentsVarargs(value: SubtypeGroupLayerFeatureEditResult*): Self = StObject.set(x, "addedAttachments", js.Array(value*))
    
    inline def setAddedFeatures(value: js.Array[SubtypeGroupLayerFeatureEditResult]): Self = StObject.set(x, "addedFeatures", value.asInstanceOf[js.Any])
    
    inline def setAddedFeaturesVarargs(value: SubtypeGroupLayerFeatureEditResult*): Self = StObject.set(x, "addedFeatures", js.Array(value*))
    
    inline def setDeletedAttachments(value: js.Array[SubtypeGroupLayerFeatureEditResult]): Self = StObject.set(x, "deletedAttachments", value.asInstanceOf[js.Any])
    
    inline def setDeletedAttachmentsVarargs(value: SubtypeGroupLayerFeatureEditResult*): Self = StObject.set(x, "deletedAttachments", js.Array(value*))
    
    inline def setDeletedFeatures(value: js.Array[SubtypeGroupLayerFeatureEditResult]): Self = StObject.set(x, "deletedFeatures", value.asInstanceOf[js.Any])
    
    inline def setDeletedFeaturesVarargs(value: SubtypeGroupLayerFeatureEditResult*): Self = StObject.set(x, "deletedFeatures", js.Array(value*))
    
    inline def setUpdatedAttachments(value: js.Array[SubtypeGroupLayerFeatureEditResult]): Self = StObject.set(x, "updatedAttachments", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAttachmentsVarargs(value: SubtypeGroupLayerFeatureEditResult*): Self = StObject.set(x, "updatedAttachments", js.Array(value*))
    
    inline def setUpdatedFeatures(value: js.Array[SubtypeGroupLayerFeatureEditResult]): Self = StObject.set(x, "updatedFeatures", value.asInstanceOf[js.Any])
    
    inline def setUpdatedFeaturesVarargs(value: SubtypeGroupLayerFeatureEditResult*): Self = StObject.set(x, "updatedFeatures", js.Array(value*))
  }
}
