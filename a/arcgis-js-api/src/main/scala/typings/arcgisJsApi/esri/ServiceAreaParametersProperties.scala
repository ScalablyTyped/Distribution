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

trait ServiceAreaParametersProperties extends StObject {
  
  /**
  		 * Use this property to specify whether the operation should accumulate values other than the value specified for [impedanceAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#impedanceAttribute).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#accumulateAttributes)
  		 */
  var accumulateAttributes: js.UndefOr[
    js.Array[
      kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
    ]
  ] = js.undefined
  
  /**
  		 * An authorization string used to access a resource or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#apiKey)
  		 */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
  		 * Use this property to specify additional values required by an attribute or restriction, such as to specify whether the restriction prohibits, avoids, or prefers travel on restricted roads.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#attributeParameterValues)
  		 */
  var attributeParameterValues: js.UndefOr[js.Array[ServiceAreaParametersAttributeParameterValue]] = js.undefined
  
  /**
  		 * Use this parameter to specify the size and number of service areas to generate for each facility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#defaultBreaks)
  		 */
  var defaultBreaks: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
  		 * An array of network source names to not use when generating polygons.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#excludeSourcesFromPolygons)
  		 */
  var excludeSourcesFromPolygons: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The input locations around which service areas are generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#facilities)
  		 */
  var facilities: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
  		 * Use this property to specify the number of decimal places in the response geometries returned by solve operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#geometryPrecision)
  		 */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Use this property to specify the number of decimal places in the response geometries returned by solve operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#geometryPrecisionM)
  		 */
  var geometryPrecisionM: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Use this property to specify the number of decimal places in the response geometries returned by a solve operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#geometryPrecisionZ)
  		 */
  var geometryPrecisionZ: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specify whether invalid input locations should be ignored when finding the best solution.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#ignoreInvalidLocations)
  		 */
  var ignoreInvalidLocations: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies the impedance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#impedanceAttribute)
  		 */
  var impedanceAttribute: js.UndefOr[
    kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
  ] = js.undefined
  
  /**
  		 * Use this parameter to specify whether the service areas from different facilities that have the same break value should be joined together or split at break values.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#mergeSimilarPolygonRanges)
  		 */
  var mergeSimilarPolygonRanges: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Use this property to specify the spatial reference of the geometries, such as line or point features, returned by a solve operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outSpatialReference)
  		 */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * Use this property to specify by how much you want to simplify the route geometry returned by the operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecision)
  		 */
  var outputGeometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Use this property to specify the units for the value specified for the [outputGeometryPrecision](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecision) parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecisionUnits)
  		 */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
  		 * Use this property to specify the type of route features that are output by the operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputLines)
  		 */
  var outputLines: js.UndefOr[none_ | straight | `true-shape` | `true-shape-with-measure`] = js.undefined
  
  /**
  		 * This parameter sets whether service area polygons should be returned and to what detail.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputPolygons)
  		 */
  var outputPolygons: js.UndefOr[none_ | simplified | detailed] = js.undefined
  
  /**
  		 * Specifies whether the service area lines from different facilities can overlap each other.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overlapLines)
  		 */
  var overlapLines: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies whether the service areas from different facilities can overlap each other.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overlapPolygons)
  		 */
  var overlapPolygons: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specify additional settings that can influence the behavior of the solver when finding solutions for the network analysis problems.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overrides)
  		 */
  var overrides: js.UndefOr[Any] = js.undefined
  
  /**
  		 * Use this property to specify one or more points that will act as temporary restrictions or represent additional time or distance that may be required to travel on the underlying streets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#pointBarriers)
  		 */
  var pointBarriers: js.UndefOr[
    CollectionProperties[PointBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
  		 * Use this property to specify polygons that either completely restrict travel or proportionately scale the time or distance required to travel on the streets intersected by the polygons.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polygonBarriers)
  		 */
  var polygonBarriers: js.UndefOr[
    CollectionProperties[PolygonBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
  		 * Use this property to specify one or more lines that prohibit travel anywhere the lines intersect the streets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polylineBarriers)
  		 */
  var polylineBarriers: js.UndefOr[
    CollectionProperties[PolylineBarrierProperties] | DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
  		 * Use this property to specify if the Object IDs specified for input locations such as stops or barriers should be preserved when the input locations are returned as output.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#preserveObjectID)
  		 */
  var preserveObjectID: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies how U-Turns should be handled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#restrictUTurns)
  		 */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.undefined
  
  /**
  		 * Use this property to specify which restrictions should be honored by the operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#restrictionAttributes)
  		 */
  var restrictionAttributes: js.UndefOr[
    js.Array[
      `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
    ]
  ] = js.undefined
  
  /**
  		 * Determines if facilities will be returned by the service.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnFacilities)
  		 */
  var returnFacilities: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specify whether [point barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#pointBarriers) will be returned by the routing operation.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPointBarriers)
  		 */
  var returnPointBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specify whether [polygon barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polygonBarriers) will be returned by the routing operation.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPolygonBarriers)
  		 */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specify whether [polyline barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polylineBarriers) will be returned by the routing operation.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPolylineBarriers)
  		 */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies whether the service area lines should be split at break values.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#splitLinesAtBreaks)
  		 */
  var splitLinesAtBreaks: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies whether multiple service areas around a facility are created as disks or rings.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#splitPolygonsAtBreaks)
  		 */
  var splitPolygonsAtBreaks: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specify the time and date to depart from or arrive at incidents or facilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#timeOfDay)
  		 */
  var timeOfDay: js.UndefOr[DateProperties | now] = js.undefined
  
  /**
  		 * Specify the time zone or zones of the [timeOfDay](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#timeOfDay) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#timeOfDayIsUTC)
  		 */
  var timeOfDayIsUTC: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies whether the direction of travel used to generate the service area polygons is toward or away from the facilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#travelDirection)
  		 */
  var travelDirection: js.UndefOr[`from-facility` | `to-facility`] = js.undefined
  
  /**
  		 * A travel mode represents a means of transportation, such as driving or walking.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#travelMode)
  		 */
  var travelMode: js.UndefOr[TravelModeProperties] = js.undefined
  
  /**
  		 * Specifies whether the service areas are trimmed.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimOuterPolygon)
  		 */
  var trimOuterPolygon: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The property defines the distance that can be reached from the network.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistance)
  		 */
  var trimPolygonDistance: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specifies the units of the value specified [trimPolygonDistance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistance).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistanceUnits)
  		 */
  var trimPolygonDistanceUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
  		 * Specify whether hierarchy should be used when finding the shortest paths.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#useHierarchy)
  		 */
  var useHierarchy: js.UndefOr[Boolean] = js.undefined
}
object ServiceAreaParametersProperties {
  
  inline def apply(): ServiceAreaParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAreaParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceAreaParametersProperties] (val x: Self) extends AnyVal {
    
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
    
    inline def setAttributeParameterValues(value: js.Array[ServiceAreaParametersAttributeParameterValue]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    inline def setAttributeParameterValuesVarargs(value: ServiceAreaParametersAttributeParameterValue*): Self = StObject.set(x, "attributeParameterValues", js.Array(value*))
    
    inline def setDefaultBreaks(value: js.Array[Double]): Self = StObject.set(x, "defaultBreaks", value.asInstanceOf[js.Any])
    
    inline def setDefaultBreaksUndefined: Self = StObject.set(x, "defaultBreaks", js.undefined)
    
    inline def setDefaultBreaksVarargs(value: Double*): Self = StObject.set(x, "defaultBreaks", js.Array(value*))
    
    inline def setExcludeSourcesFromPolygons(value: js.Array[String]): Self = StObject.set(x, "excludeSourcesFromPolygons", value.asInstanceOf[js.Any])
    
    inline def setExcludeSourcesFromPolygonsUndefined: Self = StObject.set(x, "excludeSourcesFromPolygons", js.undefined)
    
    inline def setExcludeSourcesFromPolygonsVarargs(value: String*): Self = StObject.set(x, "excludeSourcesFromPolygons", js.Array(value*))
    
    inline def setFacilities(
      value: DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    inline def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
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
    
    inline def setMergeSimilarPolygonRanges(value: Boolean): Self = StObject.set(x, "mergeSimilarPolygonRanges", value.asInstanceOf[js.Any])
    
    inline def setMergeSimilarPolygonRangesUndefined: Self = StObject.set(x, "mergeSimilarPolygonRanges", js.undefined)
    
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
    
    inline def setOutputPolygons(value: none_ | simplified | detailed): Self = StObject.set(x, "outputPolygons", value.asInstanceOf[js.Any])
    
    inline def setOutputPolygonsUndefined: Self = StObject.set(x, "outputPolygons", js.undefined)
    
    inline def setOverlapLines(value: Boolean): Self = StObject.set(x, "overlapLines", value.asInstanceOf[js.Any])
    
    inline def setOverlapLinesUndefined: Self = StObject.set(x, "overlapLines", js.undefined)
    
    inline def setOverlapPolygons(value: Boolean): Self = StObject.set(x, "overlapPolygons", value.asInstanceOf[js.Any])
    
    inline def setOverlapPolygonsUndefined: Self = StObject.set(x, "overlapPolygons", js.undefined)
    
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
    
    inline def setReturnFacilities(value: Boolean): Self = StObject.set(x, "returnFacilities", value.asInstanceOf[js.Any])
    
    inline def setReturnFacilitiesUndefined: Self = StObject.set(x, "returnFacilities", js.undefined)
    
    inline def setReturnPointBarriers(value: Boolean): Self = StObject.set(x, "returnPointBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnPointBarriersUndefined: Self = StObject.set(x, "returnPointBarriers", js.undefined)
    
    inline def setReturnPolygonBarriers(value: Boolean): Self = StObject.set(x, "returnPolygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnPolygonBarriersUndefined: Self = StObject.set(x, "returnPolygonBarriers", js.undefined)
    
    inline def setReturnPolylineBarriers(value: Boolean): Self = StObject.set(x, "returnPolylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnPolylineBarriersUndefined: Self = StObject.set(x, "returnPolylineBarriers", js.undefined)
    
    inline def setSplitLinesAtBreaks(value: Boolean): Self = StObject.set(x, "splitLinesAtBreaks", value.asInstanceOf[js.Any])
    
    inline def setSplitLinesAtBreaksUndefined: Self = StObject.set(x, "splitLinesAtBreaks", js.undefined)
    
    inline def setSplitPolygonsAtBreaks(value: Boolean): Self = StObject.set(x, "splitPolygonsAtBreaks", value.asInstanceOf[js.Any])
    
    inline def setSplitPolygonsAtBreaksUndefined: Self = StObject.set(x, "splitPolygonsAtBreaks", js.undefined)
    
    inline def setTimeOfDay(value: DateProperties | now): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDayIsUTC(value: Boolean): Self = StObject.set(x, "timeOfDayIsUTC", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDayIsUTCUndefined: Self = StObject.set(x, "timeOfDayIsUTC", js.undefined)
    
    inline def setTimeOfDayUndefined: Self = StObject.set(x, "timeOfDay", js.undefined)
    
    inline def setTravelDirection(value: `from-facility` | `to-facility`): Self = StObject.set(x, "travelDirection", value.asInstanceOf[js.Any])
    
    inline def setTravelDirectionUndefined: Self = StObject.set(x, "travelDirection", js.undefined)
    
    inline def setTravelMode(value: TravelModeProperties): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    inline def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
    
    inline def setTrimOuterPolygon(value: Boolean): Self = StObject.set(x, "trimOuterPolygon", value.asInstanceOf[js.Any])
    
    inline def setTrimOuterPolygonUndefined: Self = StObject.set(x, "trimOuterPolygon", js.undefined)
    
    inline def setTrimPolygonDistance(value: Double): Self = StObject.set(x, "trimPolygonDistance", value.asInstanceOf[js.Any])
    
    inline def setTrimPolygonDistanceUndefined: Self = StObject.set(x, "trimPolygonDistance", js.undefined)
    
    inline def setTrimPolygonDistanceUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "trimPolygonDistanceUnits", value.asInstanceOf[js.Any])
    
    inline def setTrimPolygonDistanceUnitsUndefined: Self = StObject.set(x, "trimPolygonDistanceUnits", js.undefined)
    
    inline def setUseHierarchy(value: Boolean): Self = StObject.set(x, "useHierarchy", value.asInstanceOf[js.Any])
    
    inline def setUseHierarchyUndefined: Self = StObject.set(x, "useHierarchy", js.undefined)
  }
}
