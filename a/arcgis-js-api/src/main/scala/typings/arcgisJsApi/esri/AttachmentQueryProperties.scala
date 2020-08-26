package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentQueryProperties extends js.Object {
  /**
    * The file format that is supported by query attachment. For example, `image/jpeg`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) for more information on supported attachment types.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#attachmentTypes)
    */
  var attachmentTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The where clause to be applied to attachment queries. Only attachments that satisfy the `attachmentsWhere` clause will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#attachmentsWhere)
    */
  var attachmentsWhere: js.UndefOr[String] = js.native
  /**
    * An array of globalIds for the features in the layer being queried. The query results will return attachments only for specified global ids.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#globalIds)
    */
  var globalIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Used to query for attachments that match the provided `keywords`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#keywords)
    */
  var keywords: js.UndefOr[js.Array[String]] = js.native
  /**
    * Used to query for attachments that match this `name`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The number of features to retrieve. This option should be used in conjunction with the [start property](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#start). Use this to implement paging (i.e. to retrieve "pages" of results when querying). Default Value is `10`.  If not provided, but an instance of AttachmentQuery has a `start` property, then the default value of `num` is `maxRecordCount`. The maximum value for this parameter is the value of the layer's `maxRecordCount` of the service, which can be found at the REST endpoint of the feature layer.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#num)
    */
  var num: js.UndefOr[Double] = js.native
  /**
    * An array of objectIds of the features to be queried for attachments. When the feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property is `false`, it only accepts a single `objectId`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * If `true`, the [Exchangeable image file format](https://en.wikipedia.org/wiki/Exif) for the attachment will be included in [attachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#exifInfo). The layer's capabilities.attachment.supportsExifInfo must be `true` for the attachment query to return `exifInfo` for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#returnMetadata)
    *
    * @default false
    */
  var returnMetadata: js.UndefOr[Boolean] = js.native
  /**
    * The file size of the attachment is specified in bytes. You can enter a file size range [1000,15000] to query for attachments. The query result will return all attachments within the specified file size range (1000 - 15000).  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#size)
    */
  var size: js.UndefOr[js.Array[Double]] = js.native
  /**
    * This option fetches query results by skipping a specified number of records. The query results start from the next record. The default value is `0`. This parameter only applies when the feature layer's [capabilities.query.supportsPagination](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`. You can use this option to fetch records that are beyond `maxRecordCount`.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#start)
    */
  var start: js.UndefOr[Double] = js.native
  /**
    * The `where` clause to be applied to the layer. Only features that satisfy the `where` clause and are in the list of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds) will be returned. Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#where)
    */
  var where: js.UndefOr[String] = js.native
}

object AttachmentQueryProperties {
  @scala.inline
  def apply(): AttachmentQueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentQueryProperties]
  }
  @scala.inline
  implicit class AttachmentQueryPropertiesOps[Self <: AttachmentQueryProperties] (val x: Self) extends AnyVal {
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
    def setAttachmentTypesVarargs(value: String*): Self = this.set("attachmentTypes", js.Array(value :_*))
    @scala.inline
    def setAttachmentTypes(value: js.Array[String]): Self = this.set("attachmentTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentTypes: Self = this.set("attachmentTypes", js.undefined)
    @scala.inline
    def setAttachmentsWhere(value: String): Self = this.set("attachmentsWhere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentsWhere: Self = this.set("attachmentsWhere", js.undefined)
    @scala.inline
    def setGlobalIdsVarargs(value: Double*): Self = this.set("globalIds", js.Array(value :_*))
    @scala.inline
    def setGlobalIds(value: js.Array[Double]): Self = this.set("globalIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalIds: Self = this.set("globalIds", js.undefined)
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNum(value: Double): Self = this.set("num", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNum: Self = this.set("num", js.undefined)
    @scala.inline
    def setObjectIdsVarargs(value: Double*): Self = this.set("objectIds", js.Array(value :_*))
    @scala.inline
    def setObjectIds(value: js.Array[Double]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
    @scala.inline
    def setReturnMetadata(value: Boolean): Self = this.set("returnMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnMetadata: Self = this.set("returnMetadata", js.undefined)
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    @scala.inline
    def setSize(value: js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

