package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentInfoProperties extends StObject {
  
  /**
    * The content type of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#contentType)
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * An array of [ExifInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo) for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#exifInfo)
    */
  var exifInfo: js.UndefOr[js.Array[ExifInfo]] = js.undefined
  
  /**
    * The global identifier for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#globalId)
    */
  var globalId: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#id)
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * Keywords used for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#keywords)
    */
  var keywords: js.UndefOr[String] = js.undefined
  
  /**
    * String value indicating the name of the file attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The parent or the feature global id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#parentGlobalId)
    */
  var parentGlobalId: js.UndefOr[Double] = js.undefined
  
  /**
    * The parent or the feature object id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#parentObjectId)
    */
  var parentObjectId: js.UndefOr[Double] = js.undefined
  
  /**
    * The file size of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#size)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object AttachmentInfoProperties {
  
  @scala.inline
  def apply(): AttachmentInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentInfoProperties]
  }
  
  @scala.inline
  implicit class AttachmentInfoPropertiesMutableBuilder[Self <: AttachmentInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setExifInfo(value: js.Array[ExifInfo]): Self = StObject.set(x, "exifInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExifInfoUndefined: Self = StObject.set(x, "exifInfo", js.undefined)
    
    @scala.inline
    def setExifInfoVarargs(value: ExifInfo*): Self = StObject.set(x, "exifInfo", js.Array(value :_*))
    
    @scala.inline
    def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIdUndefined: Self = StObject.set(x, "globalId", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentGlobalId(value: Double): Self = StObject.set(x, "parentGlobalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGlobalIdUndefined: Self = StObject.set(x, "parentGlobalId", js.undefined)
    
    @scala.inline
    def setParentObjectId(value: Double): Self = StObject.set(x, "parentObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentObjectIdUndefined: Self = StObject.set(x, "parentObjectId", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
