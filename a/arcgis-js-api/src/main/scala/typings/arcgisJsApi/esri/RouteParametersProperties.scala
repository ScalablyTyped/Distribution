package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`complete-no-events`
import typings.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typings.arcgisJsApi.arcgisJsApiStrings.`instructions-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`summary-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.points
import typings.arcgisJsApi.arcgisJsApiStrings.standard
import typings.arcgisJsApi.arcgisJsApiStrings.straight
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteParametersProperties extends StObject {
  
  /**
    * The list of network attribute names to be accumulated with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Each element in the array is an object that describes the parameter values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[AttributeParamValue]] = js.undefined
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#barriers)
    */
  var barriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  
  /**
    * The language used when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The length units to use when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
    * Defines the amount of direction information returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[
    complete | `complete-no-events` | `instructions-only` | standard | `summary-only`
  ] = js.undefined
  
  /**
    * The style to be used when returning directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of network attribute to use for the drive time when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, avoids network elements restricted by barriers or restrictions specified in [restrictionAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) can help you find the most efficient path for visiting a given list of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#findBestSequence)
    */
  var findBestSequence: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In routes where a stop is not located on a network or a stop could not be reached, the results will differ depending on the value of this property:.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#ignoreInvalidLocations)
    */
  var ignoreInvalidLocations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The network attribute name to be used as the impedance attribute in the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties | String] = js.undefined
  
  /**
    * The precision of the output geometry after generalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
    * The type of output lines to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none | straight | `true-shape` | `true-shape-with-measure`] = js.undefined
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  
  /**
    * The set of polygon barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  
  /**
    * The set of polyline barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  
  /**
    * If `true`, keeps the first stop fixed in the sequence even when `findBestSequence = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveFirstStop)
    */
  var preserveFirstStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, keeps the last stop fixed in the sequence even when `findBestSequence = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveLastStop)
    */
  var preserveLastStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how U-Turns should be handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.undefined
  
  /**
    * The list of network attribute names to be used as restrictions with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If `true`, barriers are returned with the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnBarriers)
    */
  var returnBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnDirections)
    */
  var returnDirections: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, polygon barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, polyline barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, routes are generated and returned in the route property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnRoutes)
    */
  var returnRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, stops are returned in the stops property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnStops)
    */
  var returnStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, `z` values are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time the route begins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTime)
    */
  var startTime: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * If `true`, the start time will be in UTC format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTimeIsUTC)
    */
  var startTimeIsUTC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The set of stops loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops)
    */
  var stops: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[js.Any] = js.undefined
  
  /**
    * If `true`, the hierarchy attribute for the network should be used in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A useful feature of the [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) is the ability to constrain stop visits to certain times of day, or "time windows".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useTimeWindows)
    */
  var useTimeWindows: js.UndefOr[Boolean] = js.undefined
}
object RouteParametersProperties {
  
  inline def apply(): RouteParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteParametersProperties]
  }
  
  extension [Self <: RouteParametersProperties](x: Self) {
    
    inline def setAccumulateAttributes(value: js.Array[String]): Self = StObject.set(x, "accumulateAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccumulateAttributesUndefined: Self = StObject.set(x, "accumulateAttributes", js.undefined)
    
    inline def setAccumulateAttributesVarargs(value: String*): Self = StObject.set(x, "accumulateAttributes", js.Array(value :_*))
    
    inline def setAttributeParameterValues(value: js.Array[AttributeParamValue]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    inline def setAttributeParameterValuesVarargs(value: AttributeParamValue*): Self = StObject.set(x, "attributeParameterValues", js.Array(value :_*))
    
    inline def setBarriers(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "barriers", value.asInstanceOf[js.Any])
    
    inline def setBarriersUndefined: Self = StObject.set(x, "barriers", js.undefined)
    
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
    
    inline def setDoNotLocateOnRestrictedElements(value: Boolean): Self = StObject.set(x, "doNotLocateOnRestrictedElements", value.asInstanceOf[js.Any])
    
    inline def setDoNotLocateOnRestrictedElementsUndefined: Self = StObject.set(x, "doNotLocateOnRestrictedElements", js.undefined)
    
    inline def setFindBestSequence(value: Boolean): Self = StObject.set(x, "findBestSequence", value.asInstanceOf[js.Any])
    
    inline def setFindBestSequenceUndefined: Self = StObject.set(x, "findBestSequence", js.undefined)
    
    inline def setIgnoreInvalidLocations(value: Boolean): Self = StObject.set(x, "ignoreInvalidLocations", value.asInstanceOf[js.Any])
    
    inline def setIgnoreInvalidLocationsUndefined: Self = StObject.set(x, "ignoreInvalidLocations", js.undefined)
    
    inline def setImpedanceAttribute(value: String): Self = StObject.set(x, "impedanceAttribute", value.asInstanceOf[js.Any])
    
    inline def setImpedanceAttributeUndefined: Self = StObject.set(x, "impedanceAttribute", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties | String): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setOutputGeometryPrecision(value: Double): Self = StObject.set(x, "outputGeometryPrecision", value.asInstanceOf[js.Any])
    
    inline def setOutputGeometryPrecisionUndefined: Self = StObject.set(x, "outputGeometryPrecision", js.undefined)
    
    inline def setOutputGeometryPrecisionUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "outputGeometryPrecisionUnits", value.asInstanceOf[js.Any])
    
    inline def setOutputGeometryPrecisionUnitsUndefined: Self = StObject.set(x, "outputGeometryPrecisionUnits", js.undefined)
    
    inline def setOutputLines(value: none | straight | `true-shape` | `true-shape-with-measure`): Self = StObject.set(x, "outputLines", value.asInstanceOf[js.Any])
    
    inline def setOutputLinesUndefined: Self = StObject.set(x, "outputLines", js.undefined)
    
    inline def setPointBarriers(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    inline def setPolygonBarriers(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    inline def setPolylineBarriers(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    inline def setPreserveFirstStop(value: Boolean): Self = StObject.set(x, "preserveFirstStop", value.asInstanceOf[js.Any])
    
    inline def setPreserveFirstStopUndefined: Self = StObject.set(x, "preserveFirstStop", js.undefined)
    
    inline def setPreserveLastStop(value: Boolean): Self = StObject.set(x, "preserveLastStop", value.asInstanceOf[js.Any])
    
    inline def setPreserveLastStopUndefined: Self = StObject.set(x, "preserveLastStop", js.undefined)
    
    inline def setRestrictUTurns(value: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`): Self = StObject.set(x, "restrictUTurns", value.asInstanceOf[js.Any])
    
    inline def setRestrictUTurnsUndefined: Self = StObject.set(x, "restrictUTurns", js.undefined)
    
    inline def setRestrictionAttributes(value: js.Array[String]): Self = StObject.set(x, "restrictionAttributes", value.asInstanceOf[js.Any])
    
    inline def setRestrictionAttributesUndefined: Self = StObject.set(x, "restrictionAttributes", js.undefined)
    
    inline def setRestrictionAttributesVarargs(value: String*): Self = StObject.set(x, "restrictionAttributes", js.Array(value :_*))
    
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
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    inline def setStartTime(value: DateProperties): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeIsUTC(value: Boolean): Self = StObject.set(x, "startTimeIsUTC", value.asInstanceOf[js.Any])
    
    inline def setStartTimeIsUTCUndefined: Self = StObject.set(x, "startTimeIsUTC", js.undefined)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStops(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setTravelMode(value: js.Any): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    inline def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
    
    inline def setUseHierarchy(value: Boolean): Self = StObject.set(x, "useHierarchy", value.asInstanceOf[js.Any])
    
    inline def setUseHierarchyUndefined: Self = StObject.set(x, "useHierarchy", js.undefined)
    
    inline def setUseTimeWindows(value: Boolean): Self = StObject.set(x, "useTimeWindows", value.asInstanceOf[js.Any])
    
    inline def setUseTimeWindowsUndefined: Self = StObject.set(x, "useTimeWindows", js.undefined)
  }
}
