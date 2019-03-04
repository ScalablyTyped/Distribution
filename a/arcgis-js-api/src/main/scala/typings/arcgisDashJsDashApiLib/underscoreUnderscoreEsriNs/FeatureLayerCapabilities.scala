package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilities
  extends stdLib.Object {
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var data: FeatureLayerCapabilitiesData
  /**
    * Describes editing capabilities that can be performed on the features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var editing: FeatureLayerCapabilitiesEditing
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var operations: FeatureLayerCapabilitiesOperations
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var query: FeatureLayerCapabilitiesQuery
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var queryRelated: FeatureLayerCapabilitiesQueryRelated
}

object FeatureLayerCapabilities {
  @scala.inline
  def apply(
    constructor: js.Function,
    data: FeatureLayerCapabilitiesData,
    editing: FeatureLayerCapabilitiesEditing,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    operations: FeatureLayerCapabilitiesOperations,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    query: FeatureLayerCapabilitiesQuery,
    queryRelated: FeatureLayerCapabilitiesQueryRelated
  ): FeatureLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor, data = data, editing = editing, hasOwnProperty = hasOwnProperty, operations = operations, propertyIsEnumerable = propertyIsEnumerable, query = query, queryRelated = queryRelated)
  
    __obj.asInstanceOf[FeatureLayerCapabilities]
  }
}

