package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerCapabilities
  extends stdLib.Object {
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var data: GeoJSONLayerCapabilitiesData
  /**
    * Describes editing capabilities that can be performed on the features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var editing: GeoJSONLayerCapabilitiesEditing
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var operations: GeoJSONLayerCapabilitiesOperations
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var query: GeoJSONLayerCapabilitiesQuery
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var queryRelated: GeoJSONLayerCapabilitiesQueryRelated
}

object GeoJSONLayerCapabilities {
  @scala.inline
  def apply(
    constructor: js.Function,
    data: GeoJSONLayerCapabilitiesData,
    editing: GeoJSONLayerCapabilitiesEditing,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    operations: GeoJSONLayerCapabilitiesOperations,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    query: GeoJSONLayerCapabilitiesQuery,
    queryRelated: GeoJSONLayerCapabilitiesQueryRelated
  ): GeoJSONLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor, data = data, editing = editing, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query, queryRelated = queryRelated)
  
    __obj.asInstanceOf[GeoJSONLayerCapabilities]
  }
}

