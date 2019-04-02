package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentInfoProperties extends js.Object {
  /**
    * The content type of the attachment. For example, `'image/jpeg'`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) for more information on supported attachment types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#contentType)
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of [ExifInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#ExifInfo) for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#exifInfo)
    */
  var exifInfo: js.UndefOr[js.Array[ExifInfo]] = js.undefined
  /**
    * The identifier for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#id)
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
    * Keywords used for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#keywords)
    */
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String value indicating the name of the file attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The parent or the feature object id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#parentObjectId)
    */
  var parentObjectId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The file size of the attachment. This is specified in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#size)
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * The URL of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object AttachmentInfoProperties {
  @scala.inline
  def apply(
    contentType: java.lang.String = null,
    exifInfo: js.Array[ExifInfo] = null,
    id: scala.Int | scala.Double = null,
    keywords: java.lang.String = null,
    name: java.lang.String = null,
    parentObjectId: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): AttachmentInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (exifInfo != null) __obj.updateDynamic("exifInfo")(exifInfo)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentObjectId != null) __obj.updateDynamic("parentObjectId")(parentObjectId.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AttachmentInfoProperties]
  }
}

