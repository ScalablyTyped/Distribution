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

trait TravelModeProperties extends StObject {
  
  /**
  		 * Lists the parameterized attributes used by the travel mode.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#attributeParameterValues)
  		 */
  var attributeParameterValues: js.UndefOr[js.Array[TravelModeAttributeParameterValues]] = js.undefined
  
  /**
  		 * A short text description of the travel mode.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#description)
  		 */
  var description: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates the distance-based cost attribute for reporting directions and for solving vehicle routing problems.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#distanceAttributeName)
  		 */
  var distanceAttributeName: js.UndefOr[kilometers_ | miles_ | meters_ | String] = js.undefined
  
  /**
  		 * The unique identifier.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * The network cost attribute used as impedance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#impedanceAttributeName)
  		 */
  var impedanceAttributeName: js.UndefOr[
    kilometers_ | miles_ | meters_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
  ] = js.undefined
  
  /**
  		 * The unique name of the travel mode.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * The list of the restriction attributes used when solving network analysis problems with this travel mode.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#restrictionAttributeNames)
  		 */
  var restrictionAttributeNames: js.UndefOr[
    js.Array[
      `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
    ]
  ] = js.undefined
  
  /**
  		 * Specifies whether the travel mode generalizes the geometry of analysis results and by how much.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationTolerance)
  		 */
  var simplificationTolerance: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The linear units associated with [simplificationTolerance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationTolerance).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationToleranceUnits)
  		 */
  var simplificationToleranceUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | unknown | yards
  ] = js.undefined
  
  /**
  		 * Indicates the time-based cost attribute for reporting directions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#timeAttributeName)
  		 */
  var timeAttributeName: js.UndefOr[
    minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
  ] = js.undefined
  
  /**
  		 * Indicates the category of travel or vehicle represented by this travel mode.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#type)
  		 */
  var `type`: js.UndefOr[automobile | truck | walk | other] = js.undefined
  
  /**
  		 * Indicates whether the travel mode uses a hierarchy attribute while performing the analysis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#useHierarchy)
  		 */
  var useHierarchy: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates how the U-turns at junctions that could occur during network traversal are handled by the solver.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#uturnAtJunctions)
  		 */
  var uturnAtJunctions: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.undefined
}
object TravelModeProperties {
  
  inline def apply(): TravelModeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TravelModeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TravelModeProperties] (val x: Self) extends AnyVal {
    
    inline def setAttributeParameterValues(value: js.Array[TravelModeAttributeParameterValues]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    inline def setAttributeParameterValuesVarargs(value: TravelModeAttributeParameterValues*): Self = StObject.set(x, "attributeParameterValues", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistanceAttributeName(value: kilometers_ | miles_ | meters_ | String): Self = StObject.set(x, "distanceAttributeName", value.asInstanceOf[js.Any])
    
    inline def setDistanceAttributeNameUndefined: Self = StObject.set(x, "distanceAttributeName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImpedanceAttributeName(
      value: kilometers_ | miles_ | meters_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
    ): Self = StObject.set(x, "impedanceAttributeName", value.asInstanceOf[js.Any])
    
    inline def setImpedanceAttributeNameUndefined: Self = StObject.set(x, "impedanceAttributeName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestrictionAttributeNames(
      value: js.Array[
          `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
        ]
    ): Self = StObject.set(x, "restrictionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setRestrictionAttributeNamesUndefined: Self = StObject.set(x, "restrictionAttributeNames", js.undefined)
    
    inline def setRestrictionAttributeNamesVarargs(
      value: (`any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String)*
    ): Self = StObject.set(x, "restrictionAttributeNames", js.Array(value*))
    
    inline def setSimplificationTolerance(value: Double): Self = StObject.set(x, "simplificationTolerance", value.asInstanceOf[js.Any])
    
    inline def setSimplificationToleranceUndefined: Self = StObject.set(x, "simplificationTolerance", js.undefined)
    
    inline def setSimplificationToleranceUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | unknown | yards
    ): Self = StObject.set(x, "simplificationToleranceUnits", value.asInstanceOf[js.Any])
    
    inline def setSimplificationToleranceUnitsUndefined: Self = StObject.set(x, "simplificationToleranceUnits", js.undefined)
    
    inline def setTimeAttributeName(value: minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String): Self = StObject.set(x, "timeAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTimeAttributeNameUndefined: Self = StObject.set(x, "timeAttributeName", js.undefined)
    
    inline def setType(value: automobile | truck | walk | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseHierarchy(value: Boolean): Self = StObject.set(x, "useHierarchy", value.asInstanceOf[js.Any])
    
    inline def setUseHierarchyUndefined: Self = StObject.set(x, "useHierarchy", js.undefined)
    
    inline def setUturnAtJunctions(value: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`): Self = StObject.set(x, "uturnAtJunctions", value.asInstanceOf[js.Any])
    
    inline def setUturnAtJunctionsUndefined: Self = StObject.set(x, "uturnAtJunctions", js.undefined)
  }
}
