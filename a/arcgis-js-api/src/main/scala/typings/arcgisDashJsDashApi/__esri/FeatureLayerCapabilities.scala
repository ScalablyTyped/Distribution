package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilities extends Object {
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
    * Describes the metadata contained on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var metadata: FeatureLayerCapabilitiesMetadata
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
    hasOwnProperty: PropertyKey => Boolean,
    metadata: FeatureLayerCapabilitiesMetadata,
    operations: FeatureLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: FeatureLayerCapabilitiesQuery,
    queryRelated: FeatureLayerCapabilitiesQueryRelated
  ): FeatureLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor, data = data, editing = editing, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), metadata = metadata, operations = operations, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query, queryRelated = queryRelated)
  
    __obj.asInstanceOf[FeatureLayerCapabilities]
  }
}

