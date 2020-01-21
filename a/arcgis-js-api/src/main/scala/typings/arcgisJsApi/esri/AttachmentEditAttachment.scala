package typings.arcgisJsApi.esri

import typings.std.Blob
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentEditAttachment extends Object {
  /**
    * The content type of the attachment. For example, `'image/jpeg'`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) for more information on supported attachment types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * The attachment data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var data: js.UndefOr[Blob | js.Any | String] = js.undefined
  /**
    * The globalId of the attachment to be added or updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var globalId: String
  /**
    * The name of the attachment. This parameter must be set if the attachment type is `Blob`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The id of pre-loaded attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var uploadId: js.UndefOr[String] = js.undefined
}

object AttachmentEditAttachment {
  @scala.inline
  def apply(
    constructor: js.Function,
    globalId: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    contentType: String = null,
    data: Blob | js.Any | String = null,
    name: String = null,
    uploadId: String = null
  ): AttachmentEditAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], globalId = globalId.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentEditAttachment]
  }
}

