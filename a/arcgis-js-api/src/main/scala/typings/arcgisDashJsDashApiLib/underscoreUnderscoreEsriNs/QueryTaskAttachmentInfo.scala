package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTaskAttachmentInfo
  extends stdLib.Object {
  /**
    * The content type of the attachment. For example, `image/jpeg`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) for more information on supported attachment types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#AttachmentInfo)
    */
  var contentType: java.lang.String
  /**
    * The identifier for the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#AttachmentInfo)
    */
  var id: scala.Double
  /**
    * The name of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#AttachmentInfo)
    */
  var name: java.lang.String
  /**
    * The parent or the feature object id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#AttachmentInfo)
    */
  var parentObjectId: scala.Double
  /**
    * The size of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#AttachmentInfo)
    */
  var size: scala.Double
  /**
    * The URL of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#AttachmentInfo)
    */
  var url: java.lang.String
}

object QueryTaskAttachmentInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    contentType: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    parentObjectId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    size: scala.Double,
    url: java.lang.String
  ): QueryTaskAttachmentInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, contentType = contentType, hasOwnProperty = hasOwnProperty, id = id, name = name, parentObjectId = parentObjectId, propertyIsEnumerable = propertyIsEnumerable, size = size, url = url)
  
    __obj.asInstanceOf[QueryTaskAttachmentInfo]
  }
}

