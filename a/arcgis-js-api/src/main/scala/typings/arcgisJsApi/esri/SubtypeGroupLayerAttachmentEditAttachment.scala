package typings.arcgisJsApi.esri

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerAttachmentEditAttachment extends StObject {
  
  /**
    * The content type of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#AttachmentEdit)
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The attachment data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#AttachmentEdit)
    */
  var data: js.UndefOr[Blob | Any | String] = js.undefined
  
  /**
    * The globalId of the attachment to be added or updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#AttachmentEdit)
    */
  var globalId: String
  
  /**
    * The name of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#AttachmentEdit)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The id of pre-loaded attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#AttachmentEdit)
    */
  var uploadId: js.UndefOr[String] = js.undefined
}
object SubtypeGroupLayerAttachmentEditAttachment {
  
  inline def apply(globalId: String): SubtypeGroupLayerAttachmentEditAttachment = {
    val __obj = js.Dynamic.literal(globalId = globalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerAttachmentEditAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeGroupLayerAttachmentEditAttachment] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setData(value: Blob | Any | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
