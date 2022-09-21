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
import typings.arcgisJsApi.arcgisJsApiStrings.`travel-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-minutes`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-travel-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`truck-with-trailers-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-preferred-hazmat-routes`
import typings.arcgisJsApi.arcgisJsApiStrings.`use-preferred-truck-routes`
import typings.arcgisJsApi.arcgisJsApiStrings.`walk-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`weight-restriction`
import typings.arcgisJsApi.arcgisJsApiStrings.automobile
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.other
import typings.arcgisJsApi.arcgisJsApiStrings.points
import typings.arcgisJsApi.arcgisJsApiStrings.truck
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import typings.arcgisJsApi.arcgisJsApiStrings.walk
import typings.arcgisJsApi.arcgisJsApiStrings.walking
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TravelMode
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Lists the parameterized attributes used by the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#attributeParameterValues)
    */
  var attributeParameterValues: js.Array[TravelModeAttributeParameterValues] = js.native
  
  /**
    * A short text description of the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#description)
    */
  var description: String = js.native
  
  /**
    * Indicates the distance-based cost attribute for reporting directions and for solving vehicle routing problems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#distanceAttributeName)
    */
  var distanceAttributeName: kilometers_ | miles_ | String = js.native
  
  /**
    * The unique identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#id)
    */
  var id: String = js.native
  
  /**
    * The network cost attribute used as impedance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#impedanceAttributeName)
    */
  var impedanceAttributeName: kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String = js.native
  
  /**
    * The unique name of the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#name)
    */
  var name: String = js.native
  
  /**
    * The list of the restriction attributes used when solving network analysis problems with this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#restrictionAttributeNames)
    */
  var restrictionAttributeNames: js.Array[
    `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
  ] = js.native
  
  /**
    * Specifies whether the travel mode generalizes the geometry of analysis results and by how much.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationTolerance)
    */
  var simplificationTolerance: Double = js.native
  
  /**
    * The linear units associated with [simplificationTolerance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationTolerance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationToleranceUnits)
    */
  var simplificationToleranceUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | unknown | yards = js.native
  
  /**
    * Indicates the time-based cost attribute for reporting directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#timeAttributeName)
    */
  var timeAttributeName: minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String = js.native
  
  /**
    * Indicates the category of travel or vehicle represented by this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#type)
    */
  var `type`: automobile | truck | walk | other = js.native
  
  /**
    * Indicates whether the travel mode uses a hierarchy attribute while performing the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#useHierarchy)
    */
  var useHierarchy: Boolean = js.native
  
  /**
    * Indicates how the U-turns at junctions that could occur during network traversal are handled by the solver.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#uturnAtJunctions)
    */
  var uturnAtJunctions: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections` = js.native
}
