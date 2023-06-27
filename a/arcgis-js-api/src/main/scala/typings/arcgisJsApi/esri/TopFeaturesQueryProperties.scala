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

trait TopFeaturesQueryProperties extends StObject {
  
  /**
  		 * Indicates if the service should cache the query results.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#cacheHint)
  		 */
  var cacheHint: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies a search distance from a given [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#geometry) in a spatial query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#distance)
  		 */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The geometry to apply to the spatial filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#geometry)
  		 */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  
  /**
  		 * Specifies the number of decimal places for geometries returned by the query operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#geometryPrecision)
  		 */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The maximum distance in units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#outSpatialReference) used for generalizing geometries returned by the query operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#maxAllowableOffset)
  		 */
  var maxAllowableOffset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The number of features to retrieve.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#num)
  		 */
  var num: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An array of ObjectIDs to be used to query for features in a layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#objectIds)
  		 */
  var objectIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
  		 * One or more field names used to order the query results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#orderByFields)
  		 */
  var orderByFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * Attribute fields to include in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#outFields)
  		 */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The spatial reference for the returned geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#outSpatialReference)
  		 */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * If `true`, each feature in the returned [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) includes the geometry.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnGeometry)
  		 */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnGeometry) is `true`, then m-values are included in the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnM)
  		 */
  var returnM: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnGeometry) is `true`, then z-values are included in the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#returnZ)
  		 */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * For spatial queries, this parameter defines the spatial relationship to query features in the layer or layer view against the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#geometry).
  		 *
  		 * @default intersects
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#spatialRelationship)
  		 */
  var spatialRelationship: js.UndefOr[
    intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
  ] = js.undefined
  
  /**
  		 * The zero-based index indicating where to begin retrieving features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#start)
  		 */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
  		 * A time extent for a temporal query against [time-aware layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#timeInfo).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#timeExtent)
  		 */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
  		 * The `topFilter` parameter is used to set the [groupByFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#groupByFields), [orderByFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#orderByFields), and [topCount](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html#topCount) criteria used in generating the result.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#topFilter)
  		 */
  var topFilter: js.UndefOr[TopFilterProperties] = js.undefined
  
  /**
  		 * The unit for calculating the buffer distance when [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#distance) is specified in spatial queries.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#units)
  		 */
  var units: js.UndefOr[feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_] = js.undefined
  
  /**
  		 * A where clause for the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html#where)
  		 */
  var where: js.UndefOr[String] = js.undefined
}
object TopFeaturesQueryProperties {
  
  inline def apply(): TopFeaturesQueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopFeaturesQueryProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopFeaturesQueryProperties] (val x: Self) extends AnyVal {
    
    inline def setCacheHint(value: Boolean): Self = StObject.set(x, "cacheHint", value.asInstanceOf[js.Any])
    
    inline def setCacheHintUndefined: Self = StObject.set(x, "cacheHint", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setGeometry(value: GeometryProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryPrecision(value: Double): Self = StObject.set(x, "geometryPrecision", value.asInstanceOf[js.Any])
    
    inline def setGeometryPrecisionUndefined: Self = StObject.set(x, "geometryPrecision", js.undefined)
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setMaxAllowableOffset(value: Double): Self = StObject.set(x, "maxAllowableOffset", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableOffsetUndefined: Self = StObject.set(x, "maxAllowableOffset", js.undefined)
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setObjectIds(value: js.Array[Double]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: Double*): Self = StObject.set(x, "objectIds", js.Array(value*))
    
    inline def setOrderByFields(value: js.Array[String]): Self = StObject.set(x, "orderByFields", value.asInstanceOf[js.Any])
    
    inline def setOrderByFieldsUndefined: Self = StObject.set(x, "orderByFields", js.undefined)
    
    inline def setOrderByFieldsVarargs(value: String*): Self = StObject.set(x, "orderByFields", js.Array(value*))
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setReturnGeometry(value: Boolean): Self = StObject.set(x, "returnGeometry", value.asInstanceOf[js.Any])
    
    inline def setReturnGeometryUndefined: Self = StObject.set(x, "returnGeometry", js.undefined)
    
    inline def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    inline def setReturnMUndefined: Self = StObject.set(x, "returnM", js.undefined)
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    inline def setSpatialRelationship(
      value: intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
    ): Self = StObject.set(x, "spatialRelationship", value.asInstanceOf[js.Any])
    
    inline def setSpatialRelationshipUndefined: Self = StObject.set(x, "spatialRelationship", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setTopFilter(value: TopFilterProperties): Self = StObject.set(x, "topFilter", value.asInstanceOf[js.Any])
    
    inline def setTopFilterUndefined: Self = StObject.set(x, "topFilter", js.undefined)
    
    inline def setUnits(value: feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
