package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerApplyEditsEdits extends StObject {
  
  /**
    * An array of attachments to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#applyEdits)
    */
  var addAttachments: js.UndefOr[js.Array[SubtypeGroupLayerAttachmentEdit]] = js.undefined
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.undefined
  
  /**
    * An array of [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#AttachmentEdit)s for attachments to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#applyEdits)
    */
  var deleteAttachments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or an array of objects with `objectId` or `globalId` of each feature to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[(js.Array[Any | Graphic]) | Collection[Graphic]] = js.undefined
  
  /**
    * An array of attachments to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#applyEdits)
    */
  var updateAttachments: js.UndefOr[js.Array[SubtypeGroupLayerAttachmentEdit]] = js.undefined
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.undefined
}
object SubtypeGroupLayerApplyEditsEdits {
  
  inline def apply(): SubtypeGroupLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtypeGroupLayerApplyEditsEdits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeGroupLayerApplyEditsEdits] (val x: Self) extends AnyVal {
    
    inline def setAddAttachments(value: js.Array[SubtypeGroupLayerAttachmentEdit]): Self = StObject.set(x, "addAttachments", value.asInstanceOf[js.Any])
    
    inline def setAddAttachmentsUndefined: Self = StObject.set(x, "addAttachments", js.undefined)
    
    inline def setAddAttachmentsVarargs(value: SubtypeGroupLayerAttachmentEdit*): Self = StObject.set(x, "addAttachments", js.Array(value*))
    
    inline def setAddFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = StObject.set(x, "addFeatures", value.asInstanceOf[js.Any])
    
    inline def setAddFeaturesUndefined: Self = StObject.set(x, "addFeatures", js.undefined)
    
    inline def setAddFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "addFeatures", js.Array(value*))
    
    inline def setDeleteAttachments(value: js.Array[String]): Self = StObject.set(x, "deleteAttachments", value.asInstanceOf[js.Any])
    
    inline def setDeleteAttachmentsUndefined: Self = StObject.set(x, "deleteAttachments", js.undefined)
    
    inline def setDeleteAttachmentsVarargs(value: String*): Self = StObject.set(x, "deleteAttachments", js.Array(value*))
    
    inline def setDeleteFeatures(value: (js.Array[Any | Graphic]) | Collection[Graphic]): Self = StObject.set(x, "deleteFeatures", value.asInstanceOf[js.Any])
    
    inline def setDeleteFeaturesUndefined: Self = StObject.set(x, "deleteFeatures", js.undefined)
    
    inline def setDeleteFeaturesVarargs(value: (Any | Graphic)*): Self = StObject.set(x, "deleteFeatures", js.Array(value*))
    
    inline def setUpdateAttachments(value: js.Array[SubtypeGroupLayerAttachmentEdit]): Self = StObject.set(x, "updateAttachments", value.asInstanceOf[js.Any])
    
    inline def setUpdateAttachmentsUndefined: Self = StObject.set(x, "updateAttachments", js.undefined)
    
    inline def setUpdateAttachmentsVarargs(value: SubtypeGroupLayerAttachmentEdit*): Self = StObject.set(x, "updateAttachments", js.Array(value*))
    
    inline def setUpdateFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = StObject.set(x, "updateFeatures", value.asInstanceOf[js.Any])
    
    inline def setUpdateFeaturesUndefined: Self = StObject.set(x, "updateFeatures", js.undefined)
    
    inline def setUpdateFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "updateFeatures", js.Array(value*))
  }
}
