package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerCapabilitiesOperations extends Object {
  /**
    * Indicates if new features can be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits) to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsAdd: Boolean
  /**
    * Indicates if values of one or more field values in the layer can be updated. See the [Calculate REST operation](https://developers.arcgis.com/rest/services-reference/calculate-feature-service-layer-.htm) document for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsCalculate: Boolean
  /**
    * Indicates if features can be [deleted](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits) from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsDelete: Boolean
  /**
    * Indicates if features in the layer can be [edited](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits). Use `supportsAdd`, `supportsUpdate` and `supportsDelete` to determine which editing operations are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsEditing: Boolean
  /**
    * Indicates if features in the layer can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsQuery: Boolean
  /**
    * Indicates if the layer supports [REST API queryAttachments](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) operation, which is supported with hosted feature services at version 10.5 and greater. If `false`, [queryAttachments() method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#queryAttachments) can only return attachments for one feature at a time. If `true`, `queryAttachments()` can return attachments for array of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsQueryAttachments: Boolean
  /**
    * Indicates if resized attachments are supported in the layer. This is useful for showing thumbnails in [Popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsResizeAttachments: Boolean
  /**
    * Indicates if features in the layer can be [updated](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsUpdate: Boolean
  /**
    * Indicates if the layer supports a SQL-92 expression or where clause. This operation is only supported in ArcGIS Online hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsValidateSql: Boolean
}

object GeoJSONLayerCapabilitiesOperations {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAdd: Boolean,
    supportsCalculate: Boolean,
    supportsDelete: Boolean,
    supportsEditing: Boolean,
    supportsQuery: Boolean,
    supportsQueryAttachments: Boolean,
    supportsResizeAttachments: Boolean,
    supportsUpdate: Boolean,
    supportsValidateSql: Boolean
  ): GeoJSONLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdd = supportsAdd, supportsCalculate = supportsCalculate, supportsDelete = supportsDelete, supportsEditing = supportsEditing, supportsQuery = supportsQuery, supportsQueryAttachments = supportsQueryAttachments, supportsResizeAttachments = supportsResizeAttachments, supportsUpdate = supportsUpdate, supportsValidateSql = supportsValidateSql)
  
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesOperations]
  }
}

