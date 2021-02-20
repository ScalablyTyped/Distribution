package typings.arcgisJsApi.esri

import typings.std.Blob
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentEditAttachment extends Object {
  
  /**
    * The content type of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The attachment data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var data: js.UndefOr[Blob | js.Any | String] = js.native
  
  /**
    * The globalId of the attachment to be added or updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var globalId: String = js.native
  
  /**
    * The name of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The id of pre-loaded attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var uploadId: js.UndefOr[String] = js.native
}
object AttachmentEditAttachment {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    globalId: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AttachmentEditAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], globalId = globalId.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AttachmentEditAttachment]
  }
  
  @scala.inline
  implicit class AttachmentEditAttachmentMutableBuilder[Self <: AttachmentEditAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: Blob | js.Any | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
  }
}
