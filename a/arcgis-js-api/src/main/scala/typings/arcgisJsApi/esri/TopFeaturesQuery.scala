package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typings.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.contains
import typings.arcgisJsApi.arcgisJsApiStrings.crosses
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.intersects
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.overlaps
import typings.arcgisJsApi.arcgisJsApiStrings.relation
import typings.arcgisJsApi.arcgisJsApiStrings.touches
import typings.arcgisJsApi.arcgisJsApiStrings.within
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopFeaturesQuery
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Indicates if the service should cache the query results.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#cacheHint)
  		 */
  var cacheHint: Boolean = js.native
  
  /**
  		 * Specifies a search distance from a given [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#geometry) in a spatial query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#distance)
  		 */
  var distance: Double = js.native
  
  /**
  		 * The geometry to apply to the spatial filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#geometry)
  		 */
  var geometry: Geometry_ = js.native
  
  /**
  		 * Specifies the number of decimal places for geometries returned by the query operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#geometryPrecision)
  		 */
  var geometryPrecision: Double = js.native
  
  /**
  		 * The maximum distance in units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#outSpatialReference) used for generalizing geometries returned by the query operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#maxAllowableOffset)
  		 */
  var maxAllowableOffset: Double = js.native
  
  /**
  		 * The number of features to retrieve.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#num)
  		 */
  var num: Double = js.native
  
  /**
  		 * An array of ObjectIDs to be used to query for features in a layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#objectIds)
  		 */
  var objectIds: js.Array[Double] = js.native
  
  /**
  		 * One or more field names used to order the query results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#orderByFields)
  		 */
  var orderByFields: js.Array[String] = js.native
  
  /**
  		 * Attribute fields to include in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#outFields)
  		 */
  var outFields: js.Array[String] = js.native
  
  /**
  		 * The spatial reference for the returned geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#outSpatialReference)
  		 */
  var outSpatialReference: SpatialReference = js.native
  
  /**
  		 * If `true`, each feature in the returned [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) includes the geometry.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnGeometry)
  		 */
  var returnGeometry: Boolean = js.native
  
  /**
  		 * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnGeometry) is `true`, then m-values are included in the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnM)
  		 */
  var returnM: Boolean = js.native
  
  /**
  		 * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnGeometry) is `true`, then z-values are included in the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnZ)
  		 */
  var returnZ: Boolean = js.native
  
  /**
  		 * For spatial queries, this parameter defines the spatial relationship to query features in the layer or layer view against the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#geometry).
  		 *
  		 * @default intersects
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#spatialRelationship)
  		 */
  var spatialRelationship: intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation = js.native
  
  /**
  		 * The zero-based index indicating where to begin retrieving features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#start)
  		 */
  var start: Double = js.native
  
  /**
  		 * A time extent for a temporal query against [time-aware layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#timeInfo).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#timeExtent)
  		 */
  var timeExtent: TimeExtent = js.native
  
  /**
  		 * The `topFilter` parameter is used to set the [groupByFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#groupByFields), [orderByFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#orderByFields), and [topCount](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#topCount) criteria used in generating the result.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#topFilter)
  		 */
  var topFilter: TopFilter = js.native
  
  /**
  		 * The unit for calculating the buffer distance when [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#distance) is specified in spatial queries.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#units)
  		 */
  var units: feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_ = js.native
  
  /**
  		 * A where clause for the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#where)
  		 */
  var where: String = js.native
}
