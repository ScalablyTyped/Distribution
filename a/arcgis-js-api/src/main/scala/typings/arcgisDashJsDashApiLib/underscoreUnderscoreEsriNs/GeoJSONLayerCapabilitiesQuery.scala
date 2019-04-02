package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerCapabilitiesQuery
  extends stdLib.Object {
  /**
    * Indicates if the geometry centroid associated with each polygon feature can be returned. This operation is only supported in ArcGIS Online hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsCentroid: scala.Boolean
  /**
    * Indicates if the query operation supports `disjoint` [spatial relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship). This is valid only for [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsDisjointSpatialRelationship: scala.Boolean
  /**
    * Indicates if the layer's query operation supports a buffer distance for input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsDistance: scala.Boolean
  /**
    * Indicates if the layer supports queries for distinct values based on fields specified in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#outFields).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsDistinct: scala.Boolean
  /**
    * Indicates if the layer's query response includes the extent of features. At 10.3, this option is only available for hosted feature services. At 10.3.1, it is available for hosted and non-hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsExtent: scala.Boolean
  /**
    * Indicates if the layer's query response contains geometry attributes, including shape area and length attributes. This operation is only supported in ArcGIS Online hosted feature services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsGeometryProperties: scala.Boolean
  /**
    * Indicates if the layer supports the [having](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#having) clause on the service. Requires an ArcGIS Server service 10.6.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsHavingClause: scala.Boolean
  /**
    * Indicates if the layer supports historic moment query. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsHistoricMoment: scala.Boolean
  /**
    * Indicates if features returned in the query response can be ordered by one or more fields. Requires an ArcGIS Server service 10.3 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsOrderBy: scala.Boolean
  /**
    * Indicates if the query response supports pagination. Requires an ArcGIS Server service 10.3 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsPagination: scala.Boolean
  /**
    * Indicates if the query operation supports the projection of geometries onto a virtual grid. Requires an ArcGIS Server service 10.6.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsQuantization: scala.Boolean
  /**
    * Indicates if the query operation supports quantization designed to be used in edit mode (highest resolution at the given spatial reference). Requires an ArcGIS Server service 10.6.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsQuantizationEditMode: scala.Boolean
  /**
    * Indicates if the query response includes the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry). This is valid only for [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsQueryGeometry: scala.Boolean
  /**
    * Indicates if the number of features returned by the query operation can be controlled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsResultType: scala.Boolean
  /**
    * Indicates if the query operation supports SQL expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsSqlExpression: scala.Boolean
  /**
    * Indicates if the query operation supports using standardized queries. Learn more about [standardized queries here](http://server.arcgis.com/en/server/latest/administer/linux/about-standardized-queries.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsStandardizedQueriesOnly: scala.Boolean
  /**
    * Indicates if the layer supports field-based statistical functions. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsStatistics: scala.Boolean
}

object GeoJSONLayerCapabilitiesQuery {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    supportsCentroid: scala.Boolean,
    supportsDisjointSpatialRelationship: scala.Boolean,
    supportsDistance: scala.Boolean,
    supportsDistinct: scala.Boolean,
    supportsExtent: scala.Boolean,
    supportsGeometryProperties: scala.Boolean,
    supportsHavingClause: scala.Boolean,
    supportsHistoricMoment: scala.Boolean,
    supportsOrderBy: scala.Boolean,
    supportsPagination: scala.Boolean,
    supportsQuantization: scala.Boolean,
    supportsQuantizationEditMode: scala.Boolean,
    supportsQueryGeometry: scala.Boolean,
    supportsResultType: scala.Boolean,
    supportsSqlExpression: scala.Boolean,
    supportsStandardizedQueriesOnly: scala.Boolean,
    supportsStatistics: scala.Boolean
  ): GeoJSONLayerCapabilitiesQuery = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCentroid = supportsCentroid, supportsDisjointSpatialRelationship = supportsDisjointSpatialRelationship, supportsDistance = supportsDistance, supportsDistinct = supportsDistinct, supportsExtent = supportsExtent, supportsGeometryProperties = supportsGeometryProperties, supportsHavingClause = supportsHavingClause, supportsHistoricMoment = supportsHistoricMoment, supportsOrderBy = supportsOrderBy, supportsPagination = supportsPagination, supportsQuantization = supportsQuantization, supportsQuantizationEditMode = supportsQuantizationEditMode, supportsQueryGeometry = supportsQueryGeometry, supportsResultType = supportsResultType, supportsSqlExpression = supportsSqlExpression, supportsStandardizedQueriesOnly = supportsStandardizedQueriesOnly, supportsStatistics = supportsStatistics)
  
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesQuery]
  }
}

