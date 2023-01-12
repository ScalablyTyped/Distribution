package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.DataLayerPropertiestypela
import typings.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`any-hazmat-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-carpool-roads`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-express-lanes`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-ferries`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-gates`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-limited-access-roads`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-private-roads`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-roads-unsuitable-for-pedestrians`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-stairways`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-toll-roads-for-trucks`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-toll-roads`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-truck-restricted-roads`
import typings.arcgisJsApi.arcgisJsApiStrings.`avoid-unpaved-roads`
import typings.arcgisJsApi.arcgisJsApiStrings.`axle-count-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`complete-no-events`
import typings.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-a-bus`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-a-taxi`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-a-truck`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-an-automobile`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-an-emergency-vehicle`
import typings.arcgisJsApi.arcgisJsApiStrings.`height-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`instructions-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`kingpin-to-rear-axle-length-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`length-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`preferred-for-pedestrians`
import typings.arcgisJsApi.arcgisJsApiStrings.`riding-a-motorcycle`
import typings.arcgisJsApi.arcgisJsApiStrings.`roads-under-construction-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`semi-or-tractor-with-one-or-more-trailers-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`single-axle-vehicles-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`summary-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`tandem-axle-vehicles-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`through-traffic-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`travel-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-minutes`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-travel-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-with-trailers-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-preferred-hazmat-routes`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-preferred-truck-routes`
import typings.arcgisJsApi.arcgisJsApiStrings.`walk-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`weight-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.campus
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.desktop
import typings.arcgisJsApi.arcgisJsApiStrings.featuresets
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.navigation
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.now
import typings.arcgisJsApi.arcgisJsApiStrings.points
import typings.arcgisJsApi.arcgisJsApiStrings.standard
import typings.arcgisJsApi.arcgisJsApiStrings.straight
import typings.arcgisJsApi.arcgisJsApiStrings.walking
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteParametersProperties extends StObject {
  
  /**
    * Use this property to specify whether the operation should accumulate values other than the value specified for [impedanceAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#impedanceAttribute).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[
    js.Array[
      kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
    ]
  ] = js.undefined
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#apiKey)
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
    * Use this property to specify additional values required by an attribute or restriction, such as to specify whether the restriction prohibits, avoids, or prefers travel on restricted roads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[RouteParametersAttributeParameterValue]] = js.undefined
  
  /**
    * The language that will be used when generating travel directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the units for displaying travel distance in the driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
    * Define the content and verbosity of the driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[
    complete | `complete-no-events` | featuresets | `instructions-only` | standard | `summary-only`
  ] = js.undefined
  
  /**
    * Specify the name of the formatting style for the directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[desktop | navigation | campus] = js.undefined
  
  /**
    * Set the time-based impedance attribute to display the duration of a maneuver, such as "Go northwest on Alvorado St.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[
    `travel-time` | `truck-travel-time` | `walk-time` | minutes | `truck-time` | String
  ] = js.undefined
  
  /**
    * Use this property to specify whether the operation should reorder stops to find the optimized route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#findBestSequence)
    */
  var findBestSequence: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this property to specify the number of decimal places in the response geometries returned by solve operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * Use this property to specify the number of decimal places in the response geometries returned by solve operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#geometryPrecisionM)
    */
  var geometryPrecisionM: js.UndefOr[Double] = js.undefined
  
  /**
    * Use this property to specify the number of decimal places in the response geometries returned by a solve operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#geometryPrecisionZ)
    */
  var geometryPrecisionZ: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify whether invalid input locations should be ignored when finding the best solution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#ignoreInvalidLocations)
    */
  var ignoreInvalidLocations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the impedance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[
    kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
  ] = js.undefined
  
  /**
    * Use this property to specify the spatial reference of the geometries, such as line or point features, returned by a solve operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * Use this property to specify by how much you want to simplify the route geometry returned by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * Use this property to specify the units for the value specified for the [outputGeometryPrecision](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outputGeometryPrecision) parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
    * Use this property to specify the type of route features that are output by the operation.
    *
    * @default "true-shape"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none_ | straight | `true-shape` | `true-shape-with-measure`] = js.undefined
  
  /**
    * Specify additional settings that can influence the behavior of the solver when finding solutions for the network analysis problems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#overrides)
    */
  var overrides: js.UndefOr[Any] = js.undefined
  
  /**
    * Use this property to specify one or more points that will act as temporary restrictions or represent additional time or distance that may be required to travel on the underlying streets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[
    CollectionProperties[PointBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * Use this property to specify polygons that either completely restrict travel or proportionately scale the time or distance required to travel on the streets intersected by the polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[
    CollectionProperties[PolygonBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * Use this property to specify one or more lines that prohibit travel anywhere the lines intersect the streets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[
    CollectionProperties[PolylineBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * Use this property to indicate whether the operation should keep the first stop fixed when reordering the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#preserveFirstStop)
    */
  var preserveFirstStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this property to indicate whether the operation should keep the last stop fixed when reordering the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#preserveLastStop)
    */
  var preserveLastStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this property to specify if the Object IDs specified for input locations such as stops or barriers should be preserved when the input locations are returned as output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#preserveObjectID)
    */
  var preserveObjectID: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this property to restrict or permit the route from making U-turns at junctions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.undefined
  
  /**
    * Use this property to specify which restrictions should be honored by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[
    js.Array[
      `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
    ]
  ] = js.undefined
  
  /**
    * Specify whether [point barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#pointBarriers) will be returned by the routing operation.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnBarriers)
    */
  var returnBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify whether the operation should generate driving directions for each route.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnDirections)
    */
  var returnDirections: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify whether [polygon barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#polygonBarriers) will be returned by the routing operation.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify whether [polyline barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#polylineBarriers) will be returned by the routing operation.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this property to specify if the operation should return routes.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnRoutes)
    */
  var returnRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this property to specify whether [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops) will be returned by the routing operation.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnStops)
    */
  var returnStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify whether traversed edges will be returned by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnTraversedEdges)
    */
  var returnTraversedEdges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify whether traversed junctions will be returned by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnTraversedJunctions)
    */
  var returnTraversedJunctions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify whether traversed turns will be returned by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnTraversedTurns)
    */
  var returnTraversedTurns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include z values for the returned geometries if supported by the underlying network.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicate the time that travel should begin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#startTime)
    */
  var startTime: js.UndefOr[DateProperties | now] = js.undefined
  
  /**
    * Specify the time zone or zones of the [startTime](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#startTime) property.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#startTimeIsUTC)
    */
  var startTimeIsUTC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the locations the output route or routes will visit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops)
    */
  var stops: js.UndefOr[
    CollectionProperties[StopProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * Specify whether the timeWindowStart and timeWindowEnd property values on [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops) are specified in UTC or geographically local time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#timeWindowsAreUTC)
    */
  var timeWindowsAreUTC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[TravelModeProperties] = js.undefined
  
  /**
    * Specify whether hierarchy should be used when finding the shortest paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this property to indicate whether the operation should consider time windows specified on the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops) when finding the best route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#useTimeWindows)
    */
  var useTimeWindows: js.UndefOr[Boolean] = js.undefined
}
object RouteParametersProperties {
  
  inline def apply(): RouteParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setAccumulateAttributes(
      value: js.Array[
          kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
        ]
    ): Self = StObject.set(x, "accumulateAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccumulateAttributesUndefined: Self = StObject.set(x, "accumulateAttributes", js.undefined)
    
    inline def setAccumulateAttributesVarargs(
      value: (kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String)*
    ): Self = StObject.set(x, "accumulateAttributes", js.Array(value*))
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAttributeParameterValues(value: js.Array[RouteParametersAttributeParameterValue]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    inline def setAttributeParameterValuesVarargs(value: RouteParametersAttributeParameterValue*): Self = StObject.set(x, "attributeParameterValues", js.Array(value*))
    
    inline def setDirectionsLanguage(value: String): Self = StObject.set(x, "directionsLanguage", value.asInstanceOf[js.Any])
    
    inline def setDirectionsLanguageUndefined: Self = StObject.set(x, "directionsLanguage", js.undefined)
    
    inline def setDirectionsLengthUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "directionsLengthUnits", value.asInstanceOf[js.Any])
    
    inline def setDirectionsLengthUnitsUndefined: Self = StObject.set(x, "directionsLengthUnits", js.undefined)
    
    inline def setDirectionsOutputType(
      value: complete | `complete-no-events` | featuresets | `instructions-only` | standard | `summary-only`
    ): Self = StObject.set(x, "directionsOutputType", value.asInstanceOf[js.Any])
    
    inline def setDirectionsOutputTypeUndefined: Self = StObject.set(x, "directionsOutputType", js.undefined)
    
    inline def setDirectionsStyleName(value: desktop | navigation | campus): Self = StObject.set(x, "directionsStyleName", value.asInstanceOf[js.Any])
    
    inline def setDirectionsStyleNameUndefined: Self = StObject.set(x, "directionsStyleName", js.undefined)
    
    inline def setDirectionsTimeAttribute(value: `travel-time` | `truck-travel-time` | `walk-time` | minutes | `truck-time` | String): Self = StObject.set(x, "directionsTimeAttribute", value.asInstanceOf[js.Any])
    
    inline def setDirectionsTimeAttributeUndefined: Self = StObject.set(x, "directionsTimeAttribute", js.undefined)
    
    inline def setFindBestSequence(value: Boolean): Self = StObject.set(x, "findBestSequence", value.asInstanceOf[js.Any])
    
    inline def setFindBestSequenceUndefined: Self = StObject.set(x, "findBestSequence", js.undefined)
    
    inline def setGeometryPrecision(value: Double): Self = StObject.set(x, "geometryPrecision", value.asInstanceOf[js.Any])
    
    inline def setGeometryPrecisionM(value: Double): Self = StObject.set(x, "geometryPrecisionM", value.asInstanceOf[js.Any])
    
    inline def setGeometryPrecisionMUndefined: Self = StObject.set(x, "geometryPrecisionM", js.undefined)
    
    inline def setGeometryPrecisionUndefined: Self = StObject.set(x, "geometryPrecision", js.undefined)
    
    inline def setGeometryPrecisionZ(value: Double): Self = StObject.set(x, "geometryPrecisionZ", value.asInstanceOf[js.Any])
    
    inline def setGeometryPrecisionZUndefined: Self = StObject.set(x, "geometryPrecisionZ", js.undefined)
    
    inline def setIgnoreInvalidLocations(value: Boolean): Self = StObject.set(x, "ignoreInvalidLocations", value.asInstanceOf[js.Any])
    
    inline def setIgnoreInvalidLocationsUndefined: Self = StObject.set(x, "ignoreInvalidLocations", js.undefined)
    
    inline def setImpedanceAttribute(
      value: kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
    ): Self = StObject.set(x, "impedanceAttribute", value.asInstanceOf[js.Any])
    
    inline def setImpedanceAttributeUndefined: Self = StObject.set(x, "impedanceAttribute", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setOutputGeometryPrecision(value: Double): Self = StObject.set(x, "outputGeometryPrecision", value.asInstanceOf[js.Any])
    
    inline def setOutputGeometryPrecisionUndefined: Self = StObject.set(x, "outputGeometryPrecision", js.undefined)
    
    inline def setOutputGeometryPrecisionUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "outputGeometryPrecisionUnits", value.asInstanceOf[js.Any])
    
    inline def setOutputGeometryPrecisionUnitsUndefined: Self = StObject.set(x, "outputGeometryPrecisionUnits", js.undefined)
    
    inline def setOutputLines(value: none_ | straight | `true-shape` | `true-shape-with-measure`): Self = StObject.set(x, "outputLines", value.asInstanceOf[js.Any])
    
    inline def setOutputLinesUndefined: Self = StObject.set(x, "outputLines", js.undefined)
    
    inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPointBarriers(
      value: CollectionProperties[PointBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    inline def setPointBarriersVarargs(value: PointBarrierProperties*): Self = StObject.set(x, "pointBarriers", js.Array(value*))
    
    inline def setPolygonBarriers(
      value: CollectionProperties[PolygonBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    inline def setPolygonBarriersVarargs(value: PolygonBarrierProperties*): Self = StObject.set(x, "polygonBarriers", js.Array(value*))
    
    inline def setPolylineBarriers(
      value: CollectionProperties[PolylineBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    inline def setPolylineBarriersVarargs(value: PolylineBarrierProperties*): Self = StObject.set(x, "polylineBarriers", js.Array(value*))
    
    inline def setPreserveFirstStop(value: Boolean): Self = StObject.set(x, "preserveFirstStop", value.asInstanceOf[js.Any])
    
    inline def setPreserveFirstStopUndefined: Self = StObject.set(x, "preserveFirstStop", js.undefined)
    
    inline def setPreserveLastStop(value: Boolean): Self = StObject.set(x, "preserveLastStop", value.asInstanceOf[js.Any])
    
    inline def setPreserveLastStopUndefined: Self = StObject.set(x, "preserveLastStop", js.undefined)
    
    inline def setPreserveObjectID(value: Boolean): Self = StObject.set(x, "preserveObjectID", value.asInstanceOf[js.Any])
    
    inline def setPreserveObjectIDUndefined: Self = StObject.set(x, "preserveObjectID", js.undefined)
    
    inline def setRestrictUTurns(value: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`): Self = StObject.set(x, "restrictUTurns", value.asInstanceOf[js.Any])
    
    inline def setRestrictUTurnsUndefined: Self = StObject.set(x, "restrictUTurns", js.undefined)
    
    inline def setRestrictionAttributes(
      value: js.Array[
          `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
        ]
    ): Self = StObject.set(x, "restrictionAttributes", value.asInstanceOf[js.Any])
    
    inline def setRestrictionAttributesUndefined: Self = StObject.set(x, "restrictionAttributes", js.undefined)
    
    inline def setRestrictionAttributesVarargs(
      value: (`any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String)*
    ): Self = StObject.set(x, "restrictionAttributes", js.Array(value*))
    
    inline def setReturnBarriers(value: Boolean): Self = StObject.set(x, "returnBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnBarriersUndefined: Self = StObject.set(x, "returnBarriers", js.undefined)
    
    inline def setReturnDirections(value: Boolean): Self = StObject.set(x, "returnDirections", value.asInstanceOf[js.Any])
    
    inline def setReturnDirectionsUndefined: Self = StObject.set(x, "returnDirections", js.undefined)
    
    inline def setReturnPolygonBarriers(value: Boolean): Self = StObject.set(x, "returnPolygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnPolygonBarriersUndefined: Self = StObject.set(x, "returnPolygonBarriers", js.undefined)
    
    inline def setReturnPolylineBarriers(value: Boolean): Self = StObject.set(x, "returnPolylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnPolylineBarriersUndefined: Self = StObject.set(x, "returnPolylineBarriers", js.undefined)
    
    inline def setReturnRoutes(value: Boolean): Self = StObject.set(x, "returnRoutes", value.asInstanceOf[js.Any])
    
    inline def setReturnRoutesUndefined: Self = StObject.set(x, "returnRoutes", js.undefined)
    
    inline def setReturnStops(value: Boolean): Self = StObject.set(x, "returnStops", value.asInstanceOf[js.Any])
    
    inline def setReturnStopsUndefined: Self = StObject.set(x, "returnStops", js.undefined)
    
    inline def setReturnTraversedEdges(value: Boolean): Self = StObject.set(x, "returnTraversedEdges", value.asInstanceOf[js.Any])
    
    inline def setReturnTraversedEdgesUndefined: Self = StObject.set(x, "returnTraversedEdges", js.undefined)
    
    inline def setReturnTraversedJunctions(value: Boolean): Self = StObject.set(x, "returnTraversedJunctions", value.asInstanceOf[js.Any])
    
    inline def setReturnTraversedJunctionsUndefined: Self = StObject.set(x, "returnTraversedJunctions", js.undefined)
    
    inline def setReturnTraversedTurns(value: Boolean): Self = StObject.set(x, "returnTraversedTurns", value.asInstanceOf[js.Any])
    
    inline def setReturnTraversedTurnsUndefined: Self = StObject.set(x, "returnTraversedTurns", js.undefined)
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    inline def setStartTime(value: DateProperties | now): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeIsUTC(value: Boolean): Self = StObject.set(x, "startTimeIsUTC", value.asInstanceOf[js.Any])
    
    inline def setStartTimeIsUTCUndefined: Self = StObject.set(x, "startTimeIsUTC", js.undefined)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStops(
      value: CollectionProperties[StopProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: StopProperties*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setTimeWindowsAreUTC(value: Boolean): Self = StObject.set(x, "timeWindowsAreUTC", value.asInstanceOf[js.Any])
    
    inline def setTimeWindowsAreUTCUndefined: Self = StObject.set(x, "timeWindowsAreUTC", js.undefined)
    
    inline def setTravelMode(value: TravelModeProperties): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    inline def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
    
    inline def setUseHierarchy(value: Boolean): Self = StObject.set(x, "useHierarchy", value.asInstanceOf[js.Any])
    
    inline def setUseHierarchyUndefined: Self = StObject.set(x, "useHierarchy", js.undefined)
    
    inline def setUseTimeWindows(value: Boolean): Self = StObject.set(x, "useTimeWindows", value.asInstanceOf[js.Any])
    
    inline def setUseTimeWindowsUndefined: Self = StObject.set(x, "useTimeWindows", js.undefined)
  }
}
