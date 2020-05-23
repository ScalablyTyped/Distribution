package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentQueryProperties extends js.Object {
  /**
    * The file format that is supported by query attachment. For example, `image/jpeg`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) for more information on supported attachment types.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#attachmentTypes)
    */
  var attachmentTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The where clause to be applied to attachment queries. Only attachments that satisfy the `attachmentsWhere` clause will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#attachmentsWhere)
    */
  var attachmentsWhere: js.UndefOr[String] = js.undefined
  /**
    * An array of globalIds for the features in the layer being queried. The query results will return attachments only for specified global ids.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#globalIds)
    */
  var globalIds: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Used to query for attachments that match the provided `keywords`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#keywords)
    */
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Used to query for attachments that match this `name`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The number of features to retrieve. This option should be used in conjunction with the [start property](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#start). Use this to implement paging (i.e. to retrieve "pages" of results when querying). Default Value is `10`.  If not provided, but an instance of AttachmentQuery has a `start` property, then the default value of `num` is `maxRecordCount`. The maximum value for this parameter is the value of the layer's `maxRecordCount` of the service, which can be found at the REST endpoint of the feature layer.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#num)
    */
  var num: js.UndefOr[Double] = js.undefined
  /**
    * An array of objectIds of the features to be queried for attachments. When the feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property is `false`, it only accepts a single `objectId`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * If `true`, the [Exchangeable image file format](https://en.wikipedia.org/wiki/Exif) for the attachment will be included in [attachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#exifInfo). The layer's capabilities.attachment.supportsExifInfo must be `true` for the attachment query to return `exifInfo` for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#returnMetadata)
    *
    * @default false
    */
  var returnMetadata: js.UndefOr[Boolean] = js.undefined
  /**
    * The file size of the attachment is specified in bytes. You can enter a file size range [1000,15000] to query for attachments. The query result will return all attachments within the specified file size range (1000 - 15000).  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#size)
    */
  var size: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * This option fetches query results by skipping a specified number of records. The query results start from the next record. The default value is `0`. This parameter only applies when the feature layer's [capabilities.query.supportsPagination](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`. You can use this option to fetch records that are beyond `maxRecordCount`.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#start)
    */
  var start: js.UndefOr[Double] = js.undefined
  /**
    * The `where` clause to be applied to the layer. Only features that satisfy the `where` clause and are in the list of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds) will be returned. Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#where)
    */
  var where: js.UndefOr[String] = js.undefined
}

object AttachmentQueryProperties {
  @scala.inline
  def apply(
    attachmentTypes: js.Array[String] = null,
    attachmentsWhere: String = null,
    globalIds: js.Array[Double] = null,
    keywords: js.Array[String] = null,
    name: String = null,
    num: js.UndefOr[Double] = js.undefined,
    objectIds: js.Array[Double] = null,
    returnMetadata: js.UndefOr[Boolean] = js.undefined,
    size: js.Array[Double] = null,
    start: js.UndefOr[Double] = js.undefined,
    where: String = null
  ): AttachmentQueryProperties = {
    val __obj = js.Dynamic.literal()
    if (attachmentTypes != null) __obj.updateDynamic("attachmentTypes")(attachmentTypes.asInstanceOf[js.Any])
    if (attachmentsWhere != null) __obj.updateDynamic("attachmentsWhere")(attachmentsWhere.asInstanceOf[js.Any])
    if (globalIds != null) __obj.updateDynamic("globalIds")(globalIds.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(num)) __obj.updateDynamic("num")(num.get.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    if (!js.isUndefined(returnMetadata)) __obj.updateDynamic("returnMetadata")(returnMetadata.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentQueryProperties]
  }
}

