package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentInfoProperties extends js.Object {
  
  /**
    * The content type of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#contentType)
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * An array of [ExifInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo) for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#exifInfo)
    */
  var exifInfo: js.UndefOr[js.Array[ExifInfo]] = js.native
  
  /**
    * The global identifier for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#globalId)
    */
  var globalId: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#id)
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * Keywords used for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#keywords)
    */
  var keywords: js.UndefOr[String] = js.native
  
  /**
    * String value indicating the name of the file attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The parent or the feature global id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#parentGlobalId)
    */
  var parentGlobalId: js.UndefOr[Double] = js.native
  
  /**
    * The parent or the feature object id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#parentObjectId)
    */
  var parentObjectId: js.UndefOr[Double] = js.native
  
  /**
    * The file size of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#size)
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * The URL of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#url)
    */
  var url: js.UndefOr[String] = js.native
}
object AttachmentInfoProperties {
  
  @scala.inline
  def apply(): AttachmentInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentInfoProperties]
  }
  
  @scala.inline
  implicit class AttachmentInfoPropertiesOps[Self <: AttachmentInfoProperties] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setExifInfoVarargs(value: ExifInfo*): Self = this.set("exifInfo", js.Array(value :_*))
    
    @scala.inline
    def setExifInfo(value: js.Array[ExifInfo]): Self = this.set("exifInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExifInfo: Self = this.set("exifInfo", js.undefined)
    
    @scala.inline
    def setGlobalId(value: String): Self = this.set("globalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalId: Self = this.set("globalId", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentGlobalId(value: Double): Self = this.set("parentGlobalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentGlobalId: Self = this.set("parentGlobalId", js.undefined)
    
    @scala.inline
    def setParentObjectId(value: Double): Self = this.set("parentObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentObjectId: Self = this.set("parentObjectId", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
