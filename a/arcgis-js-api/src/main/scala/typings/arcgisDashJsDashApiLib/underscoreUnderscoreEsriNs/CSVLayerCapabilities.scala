package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVLayerCapabilities
  extends stdLib.Object {
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var data: CSVLayerCapabilitiesData
  /**
    * Describes editing capabilities that can be performed on the features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var editing: CSVLayerCapabilitiesEditing
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var operations: CSVLayerCapabilitiesOperations
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var query: CSVLayerCapabilitiesQuery
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var queryRelated: CSVLayerCapabilitiesQueryRelated
}

object CSVLayerCapabilities {
  @scala.inline
  def apply(
    constructor: js.Function,
    data: CSVLayerCapabilitiesData,
    editing: CSVLayerCapabilitiesEditing,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    operations: CSVLayerCapabilitiesOperations,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    query: CSVLayerCapabilitiesQuery,
    queryRelated: CSVLayerCapabilitiesQueryRelated
  ): CSVLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor, data = data, editing = editing, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query, queryRelated = queryRelated)
  
    __obj.asInstanceOf[CSVLayerCapabilities]
  }
}

