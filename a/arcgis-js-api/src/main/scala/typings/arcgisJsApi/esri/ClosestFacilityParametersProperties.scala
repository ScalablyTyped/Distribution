package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.DataLayerPropertiestypela
import typings.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`complete-no-events`
import typings.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typings.arcgisJsApi.arcgisJsApiStrings.`from-facility`
import typings.arcgisJsApi.arcgisJsApiStrings.`instructions-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`summary-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`to-facility`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.end
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.points
import typings.arcgisJsApi.arcgisJsApiStrings.standard
import typings.arcgisJsApi.arcgisJsApiStrings.start
import typings.arcgisJsApi.arcgisJsApiStrings.straight
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosestFacilityParametersProperties extends StObject {
  
  /**
    * The list of network attribute names to be accumulated with the analysis, i.e., which attributes should be returned as part of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#apiKey)
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
    * An array of attribute parameter values that determine which network elements can be used by a vehicle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[ClosestFacilityParametersAttributeParameterValues]] = js.undefined
  
  /**
    * The cutoff value used to determine when to stop traversing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#defaultCutoff)
    */
  var defaultCutoff: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of facilities to find.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#defaultTargetFacilityCount)
    */
  var defaultTargetFacilityCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The language used when generating driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The length units used when computing driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
    * Defines the amount of direction information returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[
    complete | `complete-no-events` | `instructions-only` | standard | `summary-only`
  ] = js.undefined
  
  /**
    * The style to be used when returning directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the attribute field that contains the drive time values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * The set of facilities loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#facilities)
    */
  var facilities: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * The network attribute name used as the impedance attribute in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * The set of incidents loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#incidents)
    */
  var incidents: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * The well-known id of the spatial reference or the spatial reference object for the geometries returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties | String] = js.undefined
  
  /**
    * The output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
    * The type of output lines to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none_ | straight | `true-shape` | `true-shape-with-measure`] = js.undefined
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * The set of polygon barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * The set of polyline barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * Specifies how U-Turns should be handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.undefined
  
  /**
    * The list of network attribute names to be used as restrictions with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#returnDirections)
    */
  var returnDirections: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#returnFacilities)
    */
  var returnFacilities: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, incidents will be returned with the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#returnIncidents)
    */
  var returnIncidents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, point barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#returnPointBarriers)
    */
  var returnPointBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, polygon barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, polyline barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, closest facility routes will be generated and returned in the route property of each [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#returnRoutes)
    */
  var returnRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The arrival or departure date and time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#timeOfDay)
    */
  var timeOfDay: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * Defines the way the `timeOfDay` value is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#timeOfDayUsage)
    */
  var timeOfDayUsage: js.UndefOr[start | end] = js.undefined
  
  /**
    * Options for traveling to or from the facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#travelDirection)
    */
  var travelDirection: js.UndefOr[`from-facility` | `to-facility`] = js.undefined
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[TravelModeProperties] = js.undefined
  
  /**
    * If `true`, the hierarchy attribute for the network will be used in analysis.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[Boolean] = js.undefined
}
object ClosestFacilityParametersProperties {
  
  inline def apply(): ClosestFacilityParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosestFacilityParametersProperties]
  }
  
  extension [Self <: ClosestFacilityParametersProperties](x: Self) {
    
    inline def setAccumulateAttributes(value: js.Array[String]): Self = StObject.set(x, "accumulateAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccumulateAttributesUndefined: Self = StObject.set(x, "accumulateAttributes", js.undefined)
    
    inline def setAccumulateAttributesVarargs(value: String*): Self = StObject.set(x, "accumulateAttributes", js.Array(value*))
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAttributeParameterValues(value: js.Array[ClosestFacilityParametersAttributeParameterValues]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    inline def setAttributeParameterValuesVarargs(value: ClosestFacilityParametersAttributeParameterValues*): Self = StObject.set(x, "attributeParameterValues", js.Array(value*))
    
    inline def setDefaultCutoff(value: Double): Self = StObject.set(x, "defaultCutoff", value.asInstanceOf[js.Any])
    
    inline def setDefaultCutoffUndefined: Self = StObject.set(x, "defaultCutoff", js.undefined)
    
    inline def setDefaultTargetFacilityCount(value: Double): Self = StObject.set(x, "defaultTargetFacilityCount", value.asInstanceOf[js.Any])
    
    inline def setDefaultTargetFacilityCountUndefined: Self = StObject.set(x, "defaultTargetFacilityCount", js.undefined)
    
    inline def setDirectionsLanguage(value: String): Self = StObject.set(x, "directionsLanguage", value.asInstanceOf[js.Any])
    
    inline def setDirectionsLanguageUndefined: Self = StObject.set(x, "directionsLanguage", js.undefined)
    
    inline def setDirectionsLengthUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "directionsLengthUnits", value.asInstanceOf[js.Any])
    
    inline def setDirectionsLengthUnitsUndefined: Self = StObject.set(x, "directionsLengthUnits", js.undefined)
    
    inline def setDirectionsOutputType(value: complete | `complete-no-events` | `instructions-only` | standard | `summary-only`): Self = StObject.set(x, "directionsOutputType", value.asInstanceOf[js.Any])
    
    inline def setDirectionsOutputTypeUndefined: Self = StObject.set(x, "directionsOutputType", js.undefined)
    
    inline def setDirectionsStyleName(value: String): Self = StObject.set(x, "directionsStyleName", value.asInstanceOf[js.Any])
    
    inline def setDirectionsStyleNameUndefined: Self = StObject.set(x, "directionsStyleName", js.undefined)
    
    inline def setDirectionsTimeAttribute(value: String): Self = StObject.set(x, "directionsTimeAttribute", value.asInstanceOf[js.Any])
    
    inline def setDirectionsTimeAttributeUndefined: Self = StObject.set(x, "directionsTimeAttribute", js.undefined)
    
    inline def setFacilities(
      value: DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    inline def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
    inline def setImpedanceAttribute(value: String): Self = StObject.set(x, "impedanceAttribute", value.asInstanceOf[js.Any])
    
    inline def setImpedanceAttributeUndefined: Self = StObject.set(x, "impedanceAttribute", js.undefined)
    
    inline def setIncidents(
      value: DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "incidents", value.asInstanceOf[js.Any])
    
    inline def setIncidentsUndefined: Self = StObject.set(x, "incidents", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties | String): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setOutputGeometryPrecision(value: Double): Self = StObject.set(x, "outputGeometryPrecision", value.asInstanceOf[js.Any])
    
    inline def setOutputGeometryPrecisionUndefined: Self = StObject.set(x, "outputGeometryPrecision", js.undefined)
    
    inline def setOutputGeometryPrecisionUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "outputGeometryPrecisionUnits", value.asInstanceOf[js.Any])
    
    inline def setOutputGeometryPrecisionUnitsUndefined: Self = StObject.set(x, "outputGeometryPrecisionUnits", js.undefined)
    
    inline def setOutputLines(value: none_ | straight | `true-shape` | `true-shape-with-measure`): Self = StObject.set(x, "outputLines", value.asInstanceOf[js.Any])
    
    inline def setOutputLinesUndefined: Self = StObject.set(x, "outputLines", js.undefined)
    
    inline def setPointBarriers(
      value: DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    inline def setPolygonBarriers(
      value: DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    inline def setPolylineBarriers(
      value: DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
    ): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    inline def setRestrictUTurns(value: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`): Self = StObject.set(x, "restrictUTurns", value.asInstanceOf[js.Any])
    
    inline def setRestrictUTurnsUndefined: Self = StObject.set(x, "restrictUTurns", js.undefined)
    
    inline def setRestrictionAttributes(value: js.Array[String]): Self = StObject.set(x, "restrictionAttributes", value.asInstanceOf[js.Any])
    
    inline def setRestrictionAttributesUndefined: Self = StObject.set(x, "restrictionAttributes", js.undefined)
    
    inline def setRestrictionAttributesVarargs(value: String*): Self = StObject.set(x, "restrictionAttributes", js.Array(value*))
    
    inline def setReturnDirections(value: Boolean): Self = StObject.set(x, "returnDirections", value.asInstanceOf[js.Any])
    
    inline def setReturnDirectionsUndefined: Self = StObject.set(x, "returnDirections", js.undefined)
    
    inline def setReturnFacilities(value: Boolean): Self = StObject.set(x, "returnFacilities", value.asInstanceOf[js.Any])
    
    inline def setReturnFacilitiesUndefined: Self = StObject.set(x, "returnFacilities", js.undefined)
    
    inline def setReturnIncidents(value: Boolean): Self = StObject.set(x, "returnIncidents", value.asInstanceOf[js.Any])
    
    inline def setReturnIncidentsUndefined: Self = StObject.set(x, "returnIncidents", js.undefined)
    
    inline def setReturnPointBarriers(value: Boolean): Self = StObject.set(x, "returnPointBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnPointBarriersUndefined: Self = StObject.set(x, "returnPointBarriers", js.undefined)
    
    inline def setReturnPolygonBarriers(value: Boolean): Self = StObject.set(x, "returnPolygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnPolygonBarriersUndefined: Self = StObject.set(x, "returnPolygonBarriers", js.undefined)
    
    inline def setReturnPolylineBarriers(value: Boolean): Self = StObject.set(x, "returnPolylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setReturnPolylineBarriersUndefined: Self = StObject.set(x, "returnPolylineBarriers", js.undefined)
    
    inline def setReturnRoutes(value: Boolean): Self = StObject.set(x, "returnRoutes", value.asInstanceOf[js.Any])
    
    inline def setReturnRoutesUndefined: Self = StObject.set(x, "returnRoutes", js.undefined)
    
    inline def setTimeOfDay(value: DateProperties): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDayUndefined: Self = StObject.set(x, "timeOfDay", js.undefined)
    
    inline def setTimeOfDayUsage(value: start | end): Self = StObject.set(x, "timeOfDayUsage", value.asInstanceOf[js.Any])
    
    inline def setTimeOfDayUsageUndefined: Self = StObject.set(x, "timeOfDayUsage", js.undefined)
    
    inline def setTravelDirection(value: `from-facility` | `to-facility`): Self = StObject.set(x, "travelDirection", value.asInstanceOf[js.Any])
    
    inline def setTravelDirectionUndefined: Self = StObject.set(x, "travelDirection", js.undefined)
    
    inline def setTravelMode(value: TravelModeProperties): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    inline def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
    
    inline def setUseHierarchy(value: Boolean): Self = StObject.set(x, "useHierarchy", value.asInstanceOf[js.Any])
    
    inline def setUseHierarchyUndefined: Self = StObject.set(x, "useHierarchy", js.undefined)
  }
}
