package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentInfoProperties extends js.Object {
  /**
    * The content type of the attachment. For example, `'image/jpeg'`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) for more information on supported attachment types.
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
    * The file size of the attachment. This is specified in bytes.
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
  def apply(
    contentType: String = null,
    exifInfo: js.Array[ExifInfo] = null,
    globalId: String = null,
    id: Int | Double = null,
    keywords: String = null,
    name: String = null,
    parentGlobalId: Int | Double = null,
    parentObjectId: Int | Double = null,
    size: Int | Double = null,
    url: String = null
  ): AttachmentInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (exifInfo != null) __obj.updateDynamic("exifInfo")(exifInfo.asInstanceOf[js.Any])
    if (globalId != null) __obj.updateDynamic("globalId")(globalId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentGlobalId != null) __obj.updateDynamic("parentGlobalId")(parentGlobalId.asInstanceOf[js.Any])
    if (parentObjectId != null) __obj.updateDynamic("parentObjectId")(parentObjectId.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentInfoProperties]
  }
}

