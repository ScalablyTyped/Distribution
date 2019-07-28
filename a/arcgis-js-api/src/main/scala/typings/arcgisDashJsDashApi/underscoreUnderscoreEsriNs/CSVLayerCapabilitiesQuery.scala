package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVLayerCapabilitiesQuery extends Object {
  /**
    * Indicates if the geometry centroid associated with each polygon feature can be returned. This operation is only supported in ArcGIS Online hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsCentroid: Boolean
  /**
    * Indicates if the query operation supports `disjoint` [spatial relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship). This is valid only for [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDisjointSpatialRelationship: Boolean
  /**
    * Indicates if the layer's query operation supports a buffer distance for input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDistance: Boolean
  /**
    * Indicates if the layer supports queries for distinct values based on fields specified in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#outFields).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsDistinct: Boolean
  /**
    * Indicates if the layer's query response includes the extent of features. At 10.3, this option is only available for hosted feature services. At 10.3.1, it is available for hosted and non-hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsExtent: Boolean
  /**
    * Indicates if the layer's query response contains geometry attributes, including shape area and length attributes. This operation is only supported in ArcGIS Online hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsGeometryProperties: Boolean
  /**
    * Indicates if the layer supports the [having](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#having) clause on the service. Requires an ArcGIS Server service 10.6.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsHavingClause: Boolean
  /**
    * Indicates if the layer supports historic moment query. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsHistoricMoment: Boolean
  /**
    * Indicates if features returned in the query response can be ordered by one or more fields. Requires an ArcGIS Server service 10.3 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsOrderBy: Boolean
  /**
    * Indicates if the query response supports pagination. Requires an ArcGIS Server service 10.3 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsPagination: Boolean
  /**
    * Indicates if the query operation supports the projection of geometries onto a virtual grid. Requires an ArcGIS Server service 10.6.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQuantization: Boolean
  /**
    * Indicates if the query operation supports quantization designed to be used in edit mode (highest resolution at the given spatial reference). Requires an ArcGIS Server service 10.6.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQuantizationEditMode: Boolean
  /**
    * Indicates if the query response includes the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry). This is valid only for [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsQueryGeometry: Boolean
  /**
    * Indicates if the number of features returned by the query operation can be controlled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsResultType: Boolean
  /**
    * Indicates if the query operation supports SQL expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsSqlExpression: Boolean
  /**
    * Indicates if the query operation supports using standardized queries. Learn more about [standardized queries here](http://server.arcgis.com/en/server/latest/administer/linux/about-standardized-queries.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsStandardizedQueriesOnly: Boolean
  /**
    * Indicates if the layer supports field-based statistical functions. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsStatistics: Boolean
}

object CSVLayerCapabilitiesQuery {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsCentroid: Boolean,
    supportsDisjointSpatialRelationship: Boolean,
    supportsDistance: Boolean,
    supportsDistinct: Boolean,
    supportsExtent: Boolean,
    supportsGeometryProperties: Boolean,
    supportsHavingClause: Boolean,
    supportsHistoricMoment: Boolean,
    supportsOrderBy: Boolean,
    supportsPagination: Boolean,
    supportsQuantization: Boolean,
    supportsQuantizationEditMode: Boolean,
    supportsQueryGeometry: Boolean,
    supportsResultType: Boolean,
    supportsSqlExpression: Boolean,
    supportsStandardizedQueriesOnly: Boolean,
    supportsStatistics: Boolean
  ): CSVLayerCapabilitiesQuery = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCentroid = supportsCentroid, supportsDisjointSpatialRelationship = supportsDisjointSpatialRelationship, supportsDistance = supportsDistance, supportsDistinct = supportsDistinct, supportsExtent = supportsExtent, supportsGeometryProperties = supportsGeometryProperties, supportsHavingClause = supportsHavingClause, supportsHistoricMoment = supportsHistoricMoment, supportsOrderBy = supportsOrderBy, supportsPagination = supportsPagination, supportsQuantization = supportsQuantization, supportsQuantizationEditMode = supportsQuantizationEditMode, supportsQueryGeometry = supportsQueryGeometry, supportsResultType = supportsResultType, supportsSqlExpression = supportsSqlExpression, supportsStandardizedQueriesOnly = supportsStandardizedQueriesOnly, supportsStatistics = supportsStatistics)
  
    __obj.asInstanceOf[CSVLayerCapabilitiesQuery]
  }
}

