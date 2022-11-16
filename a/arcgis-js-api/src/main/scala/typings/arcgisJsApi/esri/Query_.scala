package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typings.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.contains
import typings.arcgisJsApi.arcgisJsApiStrings.crosses
import typings.arcgisJsApi.arcgisJsApiStrings.disjoint
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.intersects
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.native
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.overlaps
import typings.arcgisJsApi.arcgisJsApiStrings.relation
import typings.arcgisJsApi.arcgisJsApiStrings.standard
import typings.arcgisJsApi.arcgisJsApiStrings.touches
import typings.arcgisJsApi.arcgisJsApiStrings.within
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query_
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * An array of Object IDs representing [aggregate](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#isAggregate) (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#aggregateIds)
    */
  var aggregateIds: js.Array[Double] = js.native
  
  /**
    * Indicates if the service should cache the query results.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#cacheHint)
    */
  var cacheHint: Boolean = js.native
  
  /**
    * Datum transformation used for projecting geometries in the query results when [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#outSpatialReference) is different than the layer's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#datumTransformation)
    */
  var datumTransformation: Double = js.native
  
  /**
    * Specifies a search distance from a given [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#geometry) in a spatial query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#distance)
    */
  var distance: Double = js.native
  
  /**
    * Specifies the geodatabase version to display for feature service queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  
  /**
    * The geometry to apply to the spatial filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#geometry)
    */
  var geometry: Geometry_ = js.native
  
  /**
    * Specifies the number of decimal places for geometries returned by the [JSON query operation](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeQueryJSON).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#geometryPrecision)
    */
  var geometryPrecision: Double = js.native
  
  /**
    * Used only in [statistical queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#statistic).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#groupByFieldsForStatistics)
    */
  var groupByFieldsForStatistics: js.Array[String] = js.native
  
  /**
    * A condition used with [outStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#outStatistics) and [groupByFieldsForStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#groupByFieldsForStatistics) to limit query results to groups that satisfy the aggregation function(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#having)
    */
  var having: String = js.native
  
  /**
    * The historic moment to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#historicMoment)
    */
  var historicMoment: js.Date = js.native
  
  /**
    * The maximum distance in units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#outSpatialReference) used for generalizing geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#maxAllowableOffset)
    */
  var maxAllowableOffset: Double = js.native
  
  /**
    * When set, the maximum number of features returned by the query will equal the `maxRecordCount` of the service multiplied by this factor.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#maxRecordCountFactor)
    */
  var maxRecordCountFactor: Double = js.native
  
  /**
    * Parameter dictates how the geometry of a multipatch feature will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#multipatchOption)
    */
  var multipatchOption: String = js.native
  
  /**
    * The number of features to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#num)
    */
  var num: Double = js.native
  
  /**
    * An array of ObjectIDs to be used to query for features in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#objectIds)
    */
  var objectIds: js.Array[Double] = js.native
  
  /**
    * One or more field names used to order the query results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#orderByFields)
    */
  var orderByFields: js.Array[String] = js.native
  
  /**
    * Attribute fields to include in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * The spatial reference for the returned geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * The definitions for one or more field-based statistics to be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#outStatistics)
    */
  var outStatistics: js.Array[StatisticDefinition] = js.native
  
  /**
    * Filters features from the layer based on pre-authored parameterized filters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#parameterValues)
    */
  var parameterValues: js.Array[QueryParameterValues] = js.native
  
  /**
    * Specifies the pixel level to be identified on the X and Y axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#pixelSize)
    */
  var pixelSize: Point = js.native
  
  /**
    * Used to project the geometry onto a virtual grid, likely representing pixels on the screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#quantizationParameters)
    */
  var quantizationParameters: QueryQuantizationParameters = js.native
  
  /**
    * Filters features from the layer that are within the specified range values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#rangeValues)
    */
  var rangeValues: js.Array[QueryRangeValues] = js.native
  
  /**
    * The Dimensionally Extended 9 Intersection Model (DE-9IM) matrix relation (encoded as a string) to query the spatial relationship of the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#geometry) to the layer's features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#relationParameter)
    */
  var relationParameter: String = js.native
  
  /**
    * If `true`, each feature in the returned [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) will be returned with a centroid.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnCentroid)
    */
  var returnCentroid: Boolean = js.native
  
  /**
    * If `true` then the query returns distinct values based on the field(s) specified in [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#outFields).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnDistinctValues)
    */
  var returnDistinctValues: Boolean = js.native
  
  /**
    * If `true`, then all features are returned for each tile request, even if they exceed the maximum record limit per query indicated on the service by `maxRecordCount`.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnExceededLimitFeatures)
    */
  var returnExceededLimitFeatures: Boolean = js.native
  
  /**
    * If `true`, each feature in the returned [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) includes the geometry.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnGeometry)
    */
  var returnGeometry: Boolean = js.native
  
  /**
    * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnGeometry) is `true`, then m-values are included in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnM)
    */
  var returnM: Boolean = js.native
  
  /**
    * If `true`, the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html#queryGeometry) will be returned with the query results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnQueryGeometry)
    */
  var returnQueryGeometry: Boolean = js.native
  
  /**
    * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnGeometry) is `true`, then z-values are included in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#returnZ)
    */
  var returnZ: Boolean = js.native
  
  /**
    * For spatial queries, this parameter defines the spatial relationship to query features in the layer or layer view against the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#geometry).
    *
    * @default intersects
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#spatialRelationship)
    */
  var spatialRelationship: intersects | contains | crosses | disjoint | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation = js.native
  
  /**
    * This parameter can be either standard SQL92 `standard` or it can use the native SQL of the underlying datastore `native`.
    *
    * @default none
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#sqlFormat)
    */
  var sqlFormat: none_ | standard | native = js.native
  
  /**
    * The zero-based index indicating where to begin retrieving features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#start)
    */
  var start: Double = js.native
  
  /**
    * Shorthand for a where clause using "like".
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#text)
    */
  var text: String = js.native
  
  /**
    * A time extent for a temporal query against [time-aware layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#timeInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
  
  /**
    * The unit for calculating the buffer distance when [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#distance) is specified in spatial queries.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#units)
    */
  var units: feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_ = js.native
  
  /**
    * A where clause for the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#where)
    */
  var where: String = js.native
}
