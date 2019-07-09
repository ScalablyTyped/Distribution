package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVLayerCapabilitiesOperations
  extends stdLib.Object {
  /**
    * Indicates if new features can be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits) to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsAdd: scala.Boolean
  /**
    * Indicates if values of one or more field values in the layer can be updated. See the [Calculate REST operation](https://developers.arcgis.com/rest/services-reference/calculate-feature-service-layer-.htm) document for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsCalculate: scala.Boolean
  /**
    * Indicates if features can be [deleted](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits) from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDelete: scala.Boolean
  /**
    * Indicates if features in the layer can be [edited](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits). Use `supportsAdd`, `supportsUpdate` and `supportsDelete` to determine which editing operations are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsEditing: scala.Boolean
  /**
    * Indicates if features in the layer can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQuery: scala.Boolean
  /**
    * Indicates if the layer supports [REST API queryAttachments](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) operation, which is supported with hosted feature services at version 10.5 and greater. If `false`, [queryAttachments() method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#queryAttachments) can only return attachments for one feature at a time. If `true`, `queryAttachments()` can return attachments for array of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQueryAttachments: scala.Boolean
  /**
    * Indicates if resized attachments are supported in the layer. This is useful for showing thumbnails in [Popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsResizeAttachments: scala.Boolean
  /**
    * Indicates if features in the layer can be [updated](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsUpdate: scala.Boolean
  /**
    * Indicates if the layer supports a SQL-92 expression or where clause. This operation is only supported in ArcGIS Online hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsValidateSql: scala.Boolean
}

object CSVLayerCapabilitiesOperations {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    supportsAdd: scala.Boolean,
    supportsCalculate: scala.Boolean,
    supportsDelete: scala.Boolean,
    supportsEditing: scala.Boolean,
    supportsQuery: scala.Boolean,
    supportsQueryAttachments: scala.Boolean,
    supportsResizeAttachments: scala.Boolean,
    supportsUpdate: scala.Boolean,
    supportsValidateSql: scala.Boolean
  ): CSVLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdd = supportsAdd, supportsCalculate = supportsCalculate, supportsDelete = supportsDelete, supportsEditing = supportsEditing, supportsQuery = supportsQuery, supportsQueryAttachments = supportsQueryAttachments, supportsResizeAttachments = supportsResizeAttachments, supportsUpdate = supportsUpdate, supportsValidateSql = supportsValidateSql)
  
    __obj.asInstanceOf[CSVLayerCapabilitiesOperations]
  }
}

