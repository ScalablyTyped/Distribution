package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentQueryProperties extends StObject {
  
  /**
    * The file format that is supported by query attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#attachmentTypes)
    */
  var attachmentTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The where clause to be applied to attachment queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#attachmentsWhere)
    */
  var attachmentsWhere: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the service should cache the attachment query results.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#cacheHint)
    */
  var cacheHint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of globalIds for the features in the layer being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#globalIds)
    */
  var globalIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Used to query for attachments that match the provided `keywords`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#keywords)
    */
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Used to query for attachments that match this `name`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of features to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#num)
    */
  var num: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of objectIds of the features to be queried for attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If `true`, the [Exchangeable image file format](https://en.wikipedia.org/wiki/Exif) for the attachment will be included in [attachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html#exifInfo).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#returnMetadata)
    */
  var returnMetadata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file size of the attachment is specified in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#size)
    */
  var size: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * This option fetches query results by skipping a specified number of records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#start)
    */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
    * The `where` clause to be applied to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html#where)
    */
  var where: js.UndefOr[String] = js.undefined
}
object AttachmentQueryProperties {
  
  inline def apply(): AttachmentQueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentQueryProperties]
  }
  
  extension [Self <: AttachmentQueryProperties](x: Self) {
    
    inline def setAttachmentTypes(value: js.Array[String]): Self = StObject.set(x, "attachmentTypes", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTypesUndefined: Self = StObject.set(x, "attachmentTypes", js.undefined)
    
    inline def setAttachmentTypesVarargs(value: String*): Self = StObject.set(x, "attachmentTypes", js.Array(value*))
    
    inline def setAttachmentsWhere(value: String): Self = StObject.set(x, "attachmentsWhere", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsWhereUndefined: Self = StObject.set(x, "attachmentsWhere", js.undefined)
    
    inline def setCacheHint(value: Boolean): Self = StObject.set(x, "cacheHint", value.asInstanceOf[js.Any])
    
    inline def setCacheHintUndefined: Self = StObject.set(x, "cacheHint", js.undefined)
    
    inline def setGlobalIds(value: js.Array[Double]): Self = StObject.set(x, "globalIds", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdsUndefined: Self = StObject.set(x, "globalIds", js.undefined)
    
    inline def setGlobalIdsVarargs(value: Double*): Self = StObject.set(x, "globalIds", js.Array(value*))
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setObjectIds(value: js.Array[Double]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: Double*): Self = StObject.set(x, "objectIds", js.Array(value*))
    
    inline def setReturnMetadata(value: Boolean): Self = StObject.set(x, "returnMetadata", value.asInstanceOf[js.Any])
    
    inline def setReturnMetadataUndefined: Self = StObject.set(x, "returnMetadata", js.undefined)
    
    inline def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
