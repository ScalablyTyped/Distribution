package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The content type of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#contentType)
    */
  var contentType: String = js.native
  
  /**
    * An array of [ExifInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo) for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#exifInfo)
    */
  var exifInfo: js.Array[ExifInfo] = js.native
  
  /**
    * The global identifier for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#globalId)
    */
  var globalId: String = js.native
  
  /**
    * The identifier for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#id)
    */
  var id: Double = js.native
  
  /**
    * Keywords used for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#keywords)
    */
  var keywords: String = js.native
  
  /**
    * String value indicating the name of the file attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#name)
    */
  var name: String = js.native
  
  /**
    * The [OrientationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#OrientationInfo) for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#orientationInfo)
    */
  val orientationInfo: OrientationInfo = js.native
  
  /**
    * The parent or the feature global id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#parentGlobalId)
    */
  var parentGlobalId: Double = js.native
  
  /**
    * The parent or the feature object id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#parentObjectId)
    */
  var parentObjectId: Double = js.native
  
  /**
    * The file size of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#size)
    */
  var size: Double = js.native
  
  /**
    * The URL of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#url)
    */
  var url: String = js.native
}
