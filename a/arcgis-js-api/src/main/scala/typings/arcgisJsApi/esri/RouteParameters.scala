package typings.arcgisJsApi.esri

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

@js.native
trait RouteParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Use this property to specify whether the operation should accumulate values other than the value specified for [impedanceAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#impedanceAttribute).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.Array[String] = js.native
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#apiKey)
    */
  var apiKey: String = js.native
  
  /**
    * Use this property to specify additional values required by an attribute or restriction, such as to specify whether the restriction prohibits, avoids, or prefers travel on restricted roads.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.Array[AttributeParameterValue] = js.native
  
  /**
    * The language that will be used when generating travel directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsLanguage)
    */
  var directionsLanguage: String = js.native
  
  /**
    * Specify the units for displaying travel distance in the driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards = js.native
  
  /**
    * Define the content and verbosity of the driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsOutputType)
    */
  var directionsOutputType: complete | `complete-no-events` | featuresets | `instructions-only` | standard | `summary-only` = js.native
  
  /**
    * Specify the name of the formatting style for the directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsStyleName)
    */
  var directionsStyleName: desktop | navigation | campus = js.native
  
  /**
    * Set the time-based impedance attribute to display the duration of a maneuver, such as "Go northwest on Alvorado St.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: `travel-time` | `truck-travel-time` | `walk-time` | minutes | `truck-time` | String = js.native
  
  /**
    * Use this property to specify whether the operation should reorder stops to find the optimized route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#findBestSequence)
    */
  var findBestSequence: Boolean = js.native
  
  /**
    * Use this property to specify the number of decimal places in the response geometries returned by solve operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#geometryPrecision)
    */
  var geometryPrecision: Double = js.native
  
  /**
    * Use this property to specify the number of decimal places in the response geometries returned by solve operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#geometryPrecisionM)
    */
  var geometryPrecisionM: Double = js.native
  
  /**
    * Use this property to specify the number of decimal places in the response geometries returned by a solve operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#geometryPrecisionZ)
    */
  var geometryPrecisionZ: Double = js.native
  
  /**
    * Specify whether invalid input locations should be ignored when finding the best solution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#ignoreInvalidLocations)
    */
  var ignoreInvalidLocations: Boolean = js.native
  
  /**
    * Specifies the impedance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String = js.native
  
  /**
    * Use this property to specify the spatial reference of the geometries, such as line or point features, returned by a solve operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * Use this property to specify by how much you want to simplify the route geometry returned by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: Double = js.native
  
  /**
    * Use this property to specify the units for the value specified for the [outputGeometryPrecision](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outputGeometryPrecision) parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards = js.native
  
  /**
    * Use this property to specify the type of route features that are output by the operation.
    *
    * @default "true-shape"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#outputLines)
    */
  var outputLines: none_ | straight | `true-shape` | `true-shape-with-measure` = js.native
  
  /**
    * Specify additional settings that can influence the behavior of the solver when finding solutions for the network analysis problems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#overrides)
    */
  var overrides: Any = js.native
  
  /**
    * Use this property to specify one or more points that will act as temporary restrictions or represent additional time or distance that may be required to travel on the underlying streets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#pointBarriers)
    */
  var pointBarriers: Collection[PointBarrier] | DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
    * Use this property to specify polygons that either completely restrict travel or proportionately scale the time or distance required to travel on the streets intersected by the polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#polygonBarriers)
    */
  var polygonBarriers: Collection[PolygonBarrier] | DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
    * Use this property to specify one or more lines that prohibit travel anywhere the lines intersect the streets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#polylineBarriers)
    */
  var polylineBarriers: Collection[PolylineBarrier] | DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
    * Use this property to indicate whether the operation should keep the first stop fixed when reordering the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#preserveFirstStop)
    */
  var preserveFirstStop: Boolean = js.native
  
  /**
    * Use this property to indicate whether the operation should keep the last stop fixed when reordering the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#preserveLastStop)
    */
  var preserveLastStop: Boolean = js.native
  
  /**
    * Use this property to specify if the Object IDs specified for input locations such as stops or barriers should be preserved when the input locations are returned as output.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#preserveObjectID)
    */
  var preserveObjectID: Boolean = js.native
  
  /**
    * Use this property to restrict or permit the route from making U-turns at junctions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#restrictUTurns)
    */
  var restrictUTurns: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections` = js.native
  
  /**
    * Use this property to specify which restrictions should be honored by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.Array[
    `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
  ] = js.native
  
  /**
    * Specify whether [point barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#pointBarriers) will be returned by the routing operation.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnBarriers)
    */
  var returnBarriers: Boolean = js.native
  
  /**
    * Specify whether the operation should generate driving directions for each route.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnDirections)
    */
  var returnDirections: Boolean = js.native
  
  /**
    * Specify whether [polygon barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#polygonBarriers) will be returned by the routing operation.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: Boolean = js.native
  
  /**
    * Specify whether [polyline barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#polylineBarriers) will be returned by the routing operation.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: Boolean = js.native
  
  /**
    * Use this property to specify if the operation should return routes.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnRoutes)
    */
  var returnRoutes: Boolean = js.native
  
  /**
    * Use this property to specify whether [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops) will be returned by the routing operation.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnStops)
    */
  var returnStops: Boolean = js.native
  
  /**
    * Specify whether traversed edges will be returned by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnTraversedEdges)
    */
  var returnTraversedEdges: Boolean = js.native
  
  /**
    * Specify whether traversed junctions will be returned by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnTraversedJunctions)
    */
  var returnTraversedJunctions: Boolean = js.native
  
  /**
    * Specify whether traversed turns will be returned by the operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnTraversedTurns)
    */
  var returnTraversedTurns: Boolean = js.native
  
  /**
    * Include z values for the returned geometries if supported by the underlying network.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#returnZ)
    */
  var returnZ: Boolean = js.native
  
  /**
    * Indicate the time that travel should begin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#startTime)
    */
  var startTime: js.Date | now = js.native
  
  /**
    * Specify the time zone or zones of the [startTime](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#startTime) property.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#startTimeIsUTC)
    */
  var startTimeIsUTC: Boolean = js.native
  
  /**
    * Specifies the locations the output route or routes will visit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops)
    */
  var stops: Collection[Stop] | DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
    * Specify whether the timeWindowStart and timeWindowEnd property values on [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops) are specified in UTC or geographically local time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#timeWindowsAreUTC)
    */
  var timeWindowsAreUTC: Boolean = js.native
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#travelMode)
    */
  var travelMode: TravelMode = js.native
  
  /**
    * Specify whether hierarchy should be used when finding the shortest paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#useHierarchy)
    */
  var useHierarchy: Boolean = js.native
  
  /**
    * Use this property to indicate whether the operation should consider time windows specified on the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops) when finding the best route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#useTimeWindows)
    */
  var useTimeWindows: Boolean = js.native
}
