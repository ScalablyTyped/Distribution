package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerCapabilitiesQuery
  extends StObject
     with Object {
  
  /**
    * The maximum number of records that will be returned for a given query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var maxRecordCount: Double
  
  /**
    * Indicates if the query operation supports a [cache hint](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#cacheHint).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsCacheHint: Boolean
  
  /**
    * Indicates if the geometry centroid associated with each polygon feature can be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsCentroid: Boolean
  
  /**
    * Indicates if the query operation supports `disjoint` [spatial relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsDisjointSpatialRelationship: Boolean
  
  /**
    * Indicates if the layer's query operation supports a buffer distance for input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsDistance: Boolean
  
  /**
    * Indicates if the layer supports queries for distinct values based on fields specified in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsDistinct: Boolean
  
  /**
    * Indicates if the layer's query response includes the extent of features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsExtent: Boolean
  
  /**
    * Indicates if the layer's query response contains geometry attributes, including shape area and length attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsGeometryProperties: Boolean
  
  /**
    * Indicates if the layer supports the [having](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#having) clause on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsHavingClause: Boolean
  
  /**
    * Indicates if the layer supports historic moment query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsHistoricMoment: Boolean
  
  /**
    * Indicates if features returned in the query response can be ordered by one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsOrderBy: Boolean
  
  /**
    * Indicates if the query response supports pagination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsPagination: Boolean
  
  /**
    * Indicates if the layer supports [percentile statisticType](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsPercentileStatistics: Boolean
  
  /**
    * Indicates if the query operation supports the projection of geometries onto a virtual grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsQuantization: Boolean
  
  /**
    * Indicates if the query operation supports quantization designed to be used in edit mode (highest resolution at the given spatial reference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsQuantizationEditMode: Boolean
  
  /**
    * Indicates if the query response includes the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsQueryGeometry: Boolean
  
  /**
    * Indicates if the number of features returned by the query operation can be controlled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsResultType: Boolean
  
  /**
    * Indicates if the query operation supports SQL expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsSqlExpression: Boolean
  
  /**
    * Indicates if the query operation supports using standardized queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsStandardizedQueriesOnly: Boolean
  
  /**
    * Indicates if the layer supports field-based statistical functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsStatistics: Boolean
}
object FeatureLayerCapabilitiesQuery {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxRecordCount: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsCacheHint: Boolean,
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
    supportsPercentileStatistics: Boolean,
    supportsQuantization: Boolean,
    supportsQuantizationEditMode: Boolean,
    supportsQueryGeometry: Boolean,
    supportsResultType: Boolean,
    supportsSqlExpression: Boolean,
    supportsStandardizedQueriesOnly: Boolean,
    supportsStatistics: Boolean
  ): FeatureLayerCapabilitiesQuery = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxRecordCount = maxRecordCount.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any], supportsCentroid = supportsCentroid.asInstanceOf[js.Any], supportsDisjointSpatialRelationship = supportsDisjointSpatialRelationship.asInstanceOf[js.Any], supportsDistance = supportsDistance.asInstanceOf[js.Any], supportsDistinct = supportsDistinct.asInstanceOf[js.Any], supportsExtent = supportsExtent.asInstanceOf[js.Any], supportsGeometryProperties = supportsGeometryProperties.asInstanceOf[js.Any], supportsHavingClause = supportsHavingClause.asInstanceOf[js.Any], supportsHistoricMoment = supportsHistoricMoment.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any], supportsPercentileStatistics = supportsPercentileStatistics.asInstanceOf[js.Any], supportsQuantization = supportsQuantization.asInstanceOf[js.Any], supportsQuantizationEditMode = supportsQuantizationEditMode.asInstanceOf[js.Any], supportsQueryGeometry = supportsQueryGeometry.asInstanceOf[js.Any], supportsResultType = supportsResultType.asInstanceOf[js.Any], supportsSqlExpression = supportsSqlExpression.asInstanceOf[js.Any], supportsStandardizedQueriesOnly = supportsStandardizedQueriesOnly.asInstanceOf[js.Any], supportsStatistics = supportsStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesQuery]
  }
  
  extension [Self <: FeatureLayerCapabilitiesQuery](x: Self) {
    
    inline def setMaxRecordCount(value: Double): Self = StObject.set(x, "maxRecordCount", value.asInstanceOf[js.Any])
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
    
    inline def setSupportsCentroid(value: Boolean): Self = StObject.set(x, "supportsCentroid", value.asInstanceOf[js.Any])
    
    inline def setSupportsDisjointSpatialRelationship(value: Boolean): Self = StObject.set(x, "supportsDisjointSpatialRelationship", value.asInstanceOf[js.Any])
    
    inline def setSupportsDistance(value: Boolean): Self = StObject.set(x, "supportsDistance", value.asInstanceOf[js.Any])
    
    inline def setSupportsDistinct(value: Boolean): Self = StObject.set(x, "supportsDistinct", value.asInstanceOf[js.Any])
    
    inline def setSupportsExtent(value: Boolean): Self = StObject.set(x, "supportsExtent", value.asInstanceOf[js.Any])
    
    inline def setSupportsGeometryProperties(value: Boolean): Self = StObject.set(x, "supportsGeometryProperties", value.asInstanceOf[js.Any])
    
    inline def setSupportsHavingClause(value: Boolean): Self = StObject.set(x, "supportsHavingClause", value.asInstanceOf[js.Any])
    
    inline def setSupportsHistoricMoment(value: Boolean): Self = StObject.set(x, "supportsHistoricMoment", value.asInstanceOf[js.Any])
    
    inline def setSupportsOrderBy(value: Boolean): Self = StObject.set(x, "supportsOrderBy", value.asInstanceOf[js.Any])
    
    inline def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
    
    inline def setSupportsPercentileStatistics(value: Boolean): Self = StObject.set(x, "supportsPercentileStatistics", value.asInstanceOf[js.Any])
    
    inline def setSupportsQuantization(value: Boolean): Self = StObject.set(x, "supportsQuantization", value.asInstanceOf[js.Any])
    
    inline def setSupportsQuantizationEditMode(value: Boolean): Self = StObject.set(x, "supportsQuantizationEditMode", value.asInstanceOf[js.Any])
    
    inline def setSupportsQueryGeometry(value: Boolean): Self = StObject.set(x, "supportsQueryGeometry", value.asInstanceOf[js.Any])
    
    inline def setSupportsResultType(value: Boolean): Self = StObject.set(x, "supportsResultType", value.asInstanceOf[js.Any])
    
    inline def setSupportsSqlExpression(value: Boolean): Self = StObject.set(x, "supportsSqlExpression", value.asInstanceOf[js.Any])
    
    inline def setSupportsStandardizedQueriesOnly(value: Boolean): Self = StObject.set(x, "supportsStandardizedQueriesOnly", value.asInstanceOf[js.Any])
    
    inline def setSupportsStatistics(value: Boolean): Self = StObject.set(x, "supportsStatistics", value.asInstanceOf[js.Any])
  }
}
