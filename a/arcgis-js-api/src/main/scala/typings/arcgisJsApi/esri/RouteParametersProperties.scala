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
  
  @scala.inline
  def apply(): RouteParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteParametersProperties]
  }
  
  @scala.inline
  implicit class RouteParametersPropertiesMutableBuilder[Self <: RouteParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccumulateAttributes(value: js.Array[String]): Self = StObject.set(x, "accumulateAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccumulateAttributesUndefined: Self = StObject.set(x, "accumulateAttributes", js.undefined)
    
    @scala.inline
    def setAccumulateAttributesVarargs(value: String*): Self = StObject.set(x, "accumulateAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributeParameterValues(value: js.Array[AttributeParamValue]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    @scala.inline
    def setAttributeParameterValuesVarargs(value: AttributeParamValue*): Self = StObject.set(x, "attributeParameterValues", js.Array(value :_*))
    
    @scala.inline
    def setBarriers(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "barriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarriersUndefined: Self = StObject.set(x, "barriers", js.undefined)
    
    @scala.inline
    def setDirectionsLanguage(value: String): Self = StObject.set(x, "directionsLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsLanguageUndefined: Self = StObject.set(x, "directionsLanguage", js.undefined)
    
    @scala.inline
    def setDirectionsLengthUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "directionsLengthUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsLengthUnitsUndefined: Self = StObject.set(x, "directionsLengthUnits", js.undefined)
    
    @scala.inline
    def setDirectionsOutputType(value: complete | `complete-no-events` | `instructions-only` | standard | `summary-only`): Self = StObject.set(x, "directionsOutputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsOutputTypeUndefined: Self = StObject.set(x, "directionsOutputType", js.undefined)
    
    @scala.inline
    def setDirectionsStyleName(value: String): Self = StObject.set(x, "directionsStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsStyleNameUndefined: Self = StObject.set(x, "directionsStyleName", js.undefined)
    
    @scala.inline
    def setDirectionsTimeAttribute(value: String): Self = StObject.set(x, "directionsTimeAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsTimeAttributeUndefined: Self = StObject.set(x, "directionsTimeAttribute", js.undefined)
    
    @scala.inline
    def setDoNotLocateOnRestrictedElements(value: Boolean): Self = StObject.set(x, "doNotLocateOnRestrictedElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotLocateOnRestrictedElementsUndefined: Self = StObject.set(x, "doNotLocateOnRestrictedElements", js.undefined)
    
    @scala.inline
    def setFindBestSequence(value: Boolean): Self = StObject.set(x, "findBestSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindBestSequenceUndefined: Self = StObject.set(x, "findBestSequence", js.undefined)
    
    @scala.inline
    def setIgnoreInvalidLocations(value: Boolean): Self = StObject.set(x, "ignoreInvalidLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreInvalidLocationsUndefined: Self = StObject.set(x, "ignoreInvalidLocations", js.undefined)
    
    @scala.inline
    def setImpedanceAttribute(value: String): Self = StObject.set(x, "impedanceAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpedanceAttributeUndefined: Self = StObject.set(x, "impedanceAttribute", js.undefined)
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties | String): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    @scala.inline
    def setOutputGeometryPrecision(value: Double): Self = StObject.set(x, "outputGeometryPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputGeometryPrecisionUndefined: Self = StObject.set(x, "outputGeometryPrecision", js.undefined)
    
    @scala.inline
    def setOutputGeometryPrecisionUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "outputGeometryPrecisionUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputGeometryPrecisionUnitsUndefined: Self = StObject.set(x, "outputGeometryPrecisionUnits", js.undefined)
    
    @scala.inline
    def setOutputLines(value: none | straight | `true-shape` | `true-shape-with-measure`): Self = StObject.set(x, "outputLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLinesUndefined: Self = StObject.set(x, "outputLines", js.undefined)
    
    @scala.inline
    def setPointBarriers(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    @scala.inline
    def setPolygonBarriers(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    @scala.inline
    def setPolylineBarriers(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    @scala.inline
    def setPreserveFirstStop(value: Boolean): Self = StObject.set(x, "preserveFirstStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveFirstStopUndefined: Self = StObject.set(x, "preserveFirstStop", js.undefined)
    
    @scala.inline
    def setPreserveLastStop(value: Boolean): Self = StObject.set(x, "preserveLastStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveLastStopUndefined: Self = StObject.set(x, "preserveLastStop", js.undefined)
    
    @scala.inline
    def setRestrictUTurns(value: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`): Self = StObject.set(x, "restrictUTurns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictUTurnsUndefined: Self = StObject.set(x, "restrictUTurns", js.undefined)
    
    @scala.inline
    def setRestrictionAttributes(value: js.Array[String]): Self = StObject.set(x, "restrictionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionAttributesUndefined: Self = StObject.set(x, "restrictionAttributes", js.undefined)
    
    @scala.inline
    def setRestrictionAttributesVarargs(value: String*): Self = StObject.set(x, "restrictionAttributes", js.Array(value :_*))
    
    @scala.inline
    def setReturnBarriers(value: Boolean): Self = StObject.set(x, "returnBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnBarriersUndefined: Self = StObject.set(x, "returnBarriers", js.undefined)
    
    @scala.inline
    def setReturnDirections(value: Boolean): Self = StObject.set(x, "returnDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnDirectionsUndefined: Self = StObject.set(x, "returnDirections", js.undefined)
    
    @scala.inline
    def setReturnPolygonBarriers(value: Boolean): Self = StObject.set(x, "returnPolygonBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPolygonBarriersUndefined: Self = StObject.set(x, "returnPolygonBarriers", js.undefined)
    
    @scala.inline
    def setReturnPolylineBarriers(value: Boolean): Self = StObject.set(x, "returnPolylineBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPolylineBarriersUndefined: Self = StObject.set(x, "returnPolylineBarriers", js.undefined)
    
    @scala.inline
    def setReturnRoutes(value: Boolean): Self = StObject.set(x, "returnRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnRoutesUndefined: Self = StObject.set(x, "returnRoutes", js.undefined)
    
    @scala.inline
    def setReturnStops(value: Boolean): Self = StObject.set(x, "returnStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStopsUndefined: Self = StObject.set(x, "returnStops", js.undefined)
    
    @scala.inline
    def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateProperties): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeIsUTC(value: Boolean): Self = StObject.set(x, "startTimeIsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeIsUTCUndefined: Self = StObject.set(x, "startTimeIsUTC", js.undefined)
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStops(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setTravelMode(value: js.Any): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
    
    @scala.inline
    def setUseHierarchy(value: Boolean): Self = StObject.set(x, "useHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHierarchyUndefined: Self = StObject.set(x, "useHierarchy", js.undefined)
    
    @scala.inline
    def setUseTimeWindows(value: Boolean): Self = StObject.set(x, "useTimeWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTimeWindowsUndefined: Self = StObject.set(x, "useTimeWindows", js.undefined)
  }
}
