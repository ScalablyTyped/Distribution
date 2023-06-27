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
import typings.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-a-bus`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-a-taxi`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-a-truck`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-an-automobile`
import typings.arcgisJsApi.arcgisJsApiStrings.`driving-an-emergency-vehicle`
import typings.arcgisJsApi.arcgisJsApiStrings.`from-facility`
import typings.arcgisJsApi.arcgisJsApiStrings.`height-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`kingpin-to-rear-axle-length-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`length-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`preferred-for-pedestrians`
import typings.arcgisJsApi.arcgisJsApiStrings.`riding-a-motorcycle`
import typings.arcgisJsApi.arcgisJsApiStrings.`roads-under-construction-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`semi-or-tractor-with-one-or-more-trailers-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`single-axle-vehicles-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`tandem-axle-vehicles-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`through-traffic-prohibited`
import typings.arcgisJsApi.arcgisJsApiStrings.`to-facility`
import typings.arcgisJsApi.arcgisJsApiStrings.`travel-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-minutes`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-travel-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-with-trailers-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-preferred-hazmat-routes`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-preferred-truck-routes`
import typings.arcgisJsApi.arcgisJsApiStrings.`walk-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`weight-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.detailed
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.now
import typings.arcgisJsApi.arcgisJsApiStrings.points
import typings.arcgisJsApi.arcgisJsApiStrings.simplified
import typings.arcgisJsApi.arcgisJsApiStrings.straight
import typings.arcgisJsApi.arcgisJsApiStrings.walking
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAreaParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Use this property to specify whether the operation should accumulate values other than the value specified for [impedanceAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#impedanceAttribute).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#accumulateAttributes)
  		 */
  var accumulateAttributes: js.Array[
    kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
  ] = js.native
  
  /**
  		 * An authorization string used to access a resource or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#apiKey)
  		 */
  var apiKey: String = js.native
  
  /**
  		 * Use this property to specify additional values required by an attribute or restriction, such as to specify whether the restriction prohibits, avoids, or prefers travel on restricted roads.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#attributeParameterValues)
  		 */
  var attributeParameterValues: js.Array[ServiceAreaParametersAttributeParameterValue] = js.native
  
  /**
  		 * Use this parameter to specify the size and number of service areas to generate for each facility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#defaultBreaks)
  		 */
  var defaultBreaks: js.Array[Double] = js.native
  
  /**
  		 * An array of network source names to not use when generating polygons.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#excludeSourcesFromPolygons)
  		 */
  var excludeSourcesFromPolygons: js.Array[String] = js.native
  
  /**
  		 * The input locations around which service areas are generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#facilities)
  		 */
  var facilities: DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
  		 * Use this property to specify the number of decimal places in the response geometries returned by solve operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#geometryPrecision)
  		 */
  var geometryPrecision: Double = js.native
  
  /**
  		 * Use this property to specify the number of decimal places in the response geometries returned by solve operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#geometryPrecisionM)
  		 */
  var geometryPrecisionM: Double = js.native
  
  /**
  		 * Use this property to specify the number of decimal places in the response geometries returned by a solve operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#geometryPrecisionZ)
  		 */
  var geometryPrecisionZ: Double = js.native
  
  /**
  		 * Specify whether invalid input locations should be ignored when finding the best solution.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#ignoreInvalidLocations)
  		 */
  var ignoreInvalidLocations: Boolean = js.native
  
  /**
  		 * Specifies the impedance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#impedanceAttribute)
  		 */
  var impedanceAttribute: kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String = js.native
  
  /**
  		 * Use this parameter to specify whether the service areas from different facilities that have the same break value should be joined together or split at break values.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#mergeSimilarPolygonRanges)
  		 */
  var mergeSimilarPolygonRanges: Boolean = js.native
  
  /**
  		 * Use this property to specify the spatial reference of the geometries, such as line or point features, returned by a solve operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outSpatialReference)
  		 */
  var outSpatialReference: SpatialReference = js.native
  
  /**
  		 * Use this property to specify by how much you want to simplify the route geometry returned by the operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecision)
  		 */
  var outputGeometryPrecision: Double = js.native
  
  /**
  		 * Use this property to specify the units for the value specified for the [outputGeometryPrecision](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecision) parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecisionUnits)
  		 */
  var outputGeometryPrecisionUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards = js.native
  
  /**
  		 * Use this property to specify the type of route features that are output by the operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputLines)
  		 */
  var outputLines: none_ | straight | `true-shape` | `true-shape-with-measure` = js.native
  
  /**
  		 * This parameter sets whether service area polygons should be returned and to what detail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputPolygons)
  		 */
  var outputPolygons: none_ | simplified | detailed = js.native
  
  /**
  		 * Specifies whether the service area lines from different facilities can overlap each other.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overlapLines)
  		 */
  var overlapLines: Boolean = js.native
  
  /**
  		 * Specifies whether the service areas from different facilities can overlap each other.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overlapPolygons)
  		 */
  var overlapPolygons: Boolean = js.native
  
  /**
  		 * Specify additional settings that can influence the behavior of the solver when finding solutions for the network analysis problems.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overrides)
  		 */
  var overrides: Any = js.native
  
  /**
  		 * Use this property to specify one or more points that will act as temporary restrictions or represent additional time or distance that may be required to travel on the underlying streets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#pointBarriers)
  		 */
  var pointBarriers: Collection[PointBarrier] | DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
  		 * Use this property to specify polygons that either completely restrict travel or proportionately scale the time or distance required to travel on the streets intersected by the polygons.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polygonBarriers)
  		 */
  var polygonBarriers: Collection[PolygonBarrier] | DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
  		 * Use this property to specify one or more lines that prohibit travel anywhere the lines intersect the streets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polylineBarriers)
  		 */
  var polylineBarriers: Collection[PolylineBarrier] | DataLayer | FeatureSet | NetworkFeatureSet | NetworkUrl = js.native
  
  /**
  		 * Use this property to specify if the Object IDs specified for input locations such as stops or barriers should be preserved when the input locations are returned as output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#preserveObjectID)
  		 */
  var preserveObjectID: Boolean = js.native
  
  /**
  		 * Specifies how U-Turns should be handled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#restrictUTurns)
  		 */
  var restrictUTurns: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections` = js.native
  
  /**
  		 * Use this property to specify which restrictions should be honored by the operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#restrictionAttributes)
  		 */
  var restrictionAttributes: js.Array[
    `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
  ] = js.native
  
  /**
  		 * Determines if facilities will be returned by the service.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnFacilities)
  		 */
  var returnFacilities: Boolean = js.native
  
  /**
  		 * Specify whether [point barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#pointBarriers) will be returned by the routing operation.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPointBarriers)
  		 */
  var returnPointBarriers: Boolean = js.native
  
  /**
  		 * Specify whether [polygon barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polygonBarriers) will be returned by the routing operation.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPolygonBarriers)
  		 */
  var returnPolygonBarriers: Boolean = js.native
  
  /**
  		 * Specify whether [polyline barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polylineBarriers) will be returned by the routing operation.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPolylineBarriers)
  		 */
  var returnPolylineBarriers: Boolean = js.native
  
  /**
  		 * Specifies whether the service area lines should be split at break values.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#splitLinesAtBreaks)
  		 */
  var splitLinesAtBreaks: Boolean = js.native
  
  /**
  		 * Specifies whether multiple service areas around a facility are created as disks or rings.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#splitPolygonsAtBreaks)
  		 */
  var splitPolygonsAtBreaks: Boolean = js.native
  
  /**
  		 * Specify the time and date to depart from or arrive at incidents or facilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#timeOfDay)
  		 */
  var timeOfDay: js.Date | now = js.native
  
  /**
  		 * Specify the time zone or zones of the [timeOfDay](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#timeOfDay) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#timeOfDayIsUTC)
  		 */
  var timeOfDayIsUTC: Boolean = js.native
  
  /**
  		 * Specifies whether the direction of travel used to generate the service area polygons is toward or away from the facilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#travelDirection)
  		 */
  var travelDirection: `from-facility` | `to-facility` = js.native
  
  /**
  		 * A travel mode represents a means of transportation, such as driving or walking.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#travelMode)
  		 */
  var travelMode: TravelMode = js.native
  
  /**
  		 * Specifies whether the service areas are trimmed.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimOuterPolygon)
  		 */
  var trimOuterPolygon: Boolean = js.native
  
  /**
  		 * The property defines the distance that can be reached from the network.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistance)
  		 */
  var trimPolygonDistance: Double = js.native
  
  /**
  		 * Specifies the units of the value specified [trimPolygonDistance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistance).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistanceUnits)
  		 */
  var trimPolygonDistanceUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards = js.native
  
  /**
  		 * Specify whether hierarchy should be used when finding the shortest paths.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#useHierarchy)
  		 */
  var useHierarchy: Boolean = js.native
}
