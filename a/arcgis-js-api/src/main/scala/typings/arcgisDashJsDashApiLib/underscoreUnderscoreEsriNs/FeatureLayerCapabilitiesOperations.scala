package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilitiesOperations
  extends stdLib.Object {
  /**
    * Indicates if new features can be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAdd: scala.Boolean
  /**
    * Indicates if values of one or more field values in the layer can be updated. See the [Calculate REST operation](https://developers.arcgis.com/rest/services-reference/calculate-feature-service-layer-.htm) document for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsCalculate: scala.Boolean
  /**
    * Indicates if features can be [deleted](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsDelete: scala.Boolean
  /**
    * Indicates if features in the layer can be [edited](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits). Use `supportsAdd`, `supportsUpdate` and `supportsDelete` to determine which editing operations are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsEditing: scala.Boolean
  /**
    * Indicates if features in the layer can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsQuery: scala.Boolean
  /**
    * Indicates if the layer supports [REST API queryAttachments](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) operation, which is supported with hosted feature services at version 10.5 and greater. If `false`, [queryAttachments() method](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryAttachments) can only return attachments for one feature at a time. If `true`, `queryAttachments()` can return attachments for array of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsQueryAttachments: scala.Boolean
  /**
    * Indicates if resized attachments are supported in the feature layer. This is useful for showing thumbnails in [Popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsResizeAttachments: scala.Boolean
  /**
    * Indicates if features in the layer can be [updated](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsUpdate: scala.Boolean
  /**
    * Indicates if the layer supports a SQL-92 expression or where clause. This operation is only supported in ArcGIS Online hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsValidateSql: scala.Boolean
}

object FeatureLayerCapabilitiesOperations {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    supportsAdd: scala.Boolean,
    supportsCalculate: scala.Boolean,
    supportsDelete: scala.Boolean,
    supportsEditing: scala.Boolean,
    supportsQuery: scala.Boolean,
    supportsQueryAttachments: scala.Boolean,
    supportsResizeAttachments: scala.Boolean,
    supportsUpdate: scala.Boolean,
    supportsValidateSql: scala.Boolean
  ): FeatureLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("supportsAdd")(supportsAdd)
    __obj.updateDynamic("supportsCalculate")(supportsCalculate)
    __obj.updateDynamic("supportsDelete")(supportsDelete)
    __obj.updateDynamic("supportsEditing")(supportsEditing)
    __obj.updateDynamic("supportsQuery")(supportsQuery)
    __obj.updateDynamic("supportsQueryAttachments")(supportsQueryAttachments)
    __obj.updateDynamic("supportsResizeAttachments")(supportsResizeAttachments)
    __obj.updateDynamic("supportsUpdate")(supportsUpdate)
    __obj.updateDynamic("supportsValidateSql")(supportsValidateSql)
    __obj.asInstanceOf[FeatureLayerCapabilitiesOperations]
  }
}

