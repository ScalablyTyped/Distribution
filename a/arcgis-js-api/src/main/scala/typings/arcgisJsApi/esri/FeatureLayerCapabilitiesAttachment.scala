package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilitiesAttachment extends Object {
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) by their content types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsContentType: Boolean
  /**
    * Indicates if the attachment [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) support `exifInfo`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsExifInfo: Boolean
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) by their keywords.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsKeywords: Boolean
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) by their names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsName: Boolean
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) by their sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsSize: Boolean
}

object FeatureLayerCapabilitiesAttachment {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsContentType: Boolean,
    supportsExifInfo: Boolean,
    supportsKeywords: Boolean,
    supportsName: Boolean,
    supportsSize: Boolean
  ): FeatureLayerCapabilitiesAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsContentType = supportsContentType.asInstanceOf[js.Any], supportsExifInfo = supportsExifInfo.asInstanceOf[js.Any], supportsKeywords = supportsKeywords.asInstanceOf[js.Any], supportsName = supportsName.asInstanceOf[js.Any], supportsSize = supportsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesAttachment]
  }
}

