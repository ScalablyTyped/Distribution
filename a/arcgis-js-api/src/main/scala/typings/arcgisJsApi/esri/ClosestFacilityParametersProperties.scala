package typings.arcgisJsApi.esri

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
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.points
import typings.arcgisJsApi.arcgisJsApiStrings.standard
import typings.arcgisJsApi.arcgisJsApiStrings.start
import typings.arcgisJsApi.arcgisJsApiStrings.straight
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosestFacilityParametersProperties extends js.Object {
  
  /**
    * The list of network attribute names to be accumulated with the analysis, i.e., which attributes should be returned as part of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of attribute parameter values that determine which network elements can be used by a vehicle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[ClosestFacilityParametersAttributeParameterValues]] = js.native
  
  /**
    * The cutoff value used to determine when to stop traversing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultCutoff)
    */
  var defaultCutoff: js.UndefOr[Double] = js.native
  
  /**
    * The number of facilities to find.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultTargetFacilityCount)
    */
  var defaultTargetFacilityCount: js.UndefOr[Double] = js.native
  
  /**
    * The language used when generating driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[String] = js.native
  
  /**
    * The length units used when computing driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  
  /**
    * Defines the amount of direction information returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[
    complete | `complete-no-events` | `instructions-only` | standard | `summary-only`
  ] = js.native
  
  /**
    * The style to be used when returning directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[String] = js.native
  
  /**
    * The name of the attribute field that contains the drive time values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[String] = js.native
  
  /**
    * When `true`, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.native
  
  /**
    * The set of facilities loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#facilities)
    */
  var facilities: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The network attribute name used as the impedance attribute in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  
  /**
    * The set of incidents loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#incidents)
    */
  var incidents: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The well-known id of the spatial reference or the spatial reference object for the geometries returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties | String] = js.native
  
  /**
    * The output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.native
  
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  
  /**
    * The type of output lines to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none | straight | `true-shape` | `true-shape-with-measure`] = js.native
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The set of polygon barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The set of polyline barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * Specifies how U-Turns should be handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.native
  
  /**
    * The list of network attribute names to be used as restrictions with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections)
    */
  var returnDirections: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnFacilities)
    */
  var returnFacilities: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, incidents will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnIncidents)
    */
  var returnIncidents: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, point barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPointBarriers)
    */
  var returnPointBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, polygon barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, polyline barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, closest facility routes will be generated and returned in the route property of each [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnRoutes)
    */
  var returnRoutes: js.UndefOr[Boolean] = js.native
  
  /**
    * The arrival or departure date and time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDay)
    */
  var timeOfDay: js.UndefOr[DateProperties] = js.native
  
  /**
    * Defines the way the `timeOfDay` value is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDayUsage)
    */
  var timeOfDayUsage: js.UndefOr[start | end] = js.native
  
  /**
    * Options for traveling to or from the facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelDirection)
    */
  var travelDirection: js.UndefOr[`from-facility` | `to-facility`] = js.native
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the hierarchy attribute for the network will be used in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[Boolean] = js.native
}
object ClosestFacilityParametersProperties {
  
  @scala.inline
  def apply(): ClosestFacilityParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosestFacilityParametersProperties]
  }
  
  @scala.inline
  implicit class ClosestFacilityParametersPropertiesOps[Self <: ClosestFacilityParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccumulateAttributesVarargs(value: String*): Self = this.set("accumulateAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAccumulateAttributes(value: js.Array[String]): Self = this.set("accumulateAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccumulateAttributes: Self = this.set("accumulateAttributes", js.undefined)
    
    @scala.inline
    def setAttributeParameterValuesVarargs(value: ClosestFacilityParametersAttributeParameterValues*): Self = this.set("attributeParameterValues", js.Array(value :_*))
    
    @scala.inline
    def setAttributeParameterValues(value: js.Array[ClosestFacilityParametersAttributeParameterValues]): Self = this.set("attributeParameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeParameterValues: Self = this.set("attributeParameterValues", js.undefined)
    
    @scala.inline
    def setDefaultCutoff(value: Double): Self = this.set("defaultCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCutoff: Self = this.set("defaultCutoff", js.undefined)
    
    @scala.inline
    def setDefaultTargetFacilityCount(value: Double): Self = this.set("defaultTargetFacilityCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTargetFacilityCount: Self = this.set("defaultTargetFacilityCount", js.undefined)
    
    @scala.inline
    def setDirectionsLanguage(value: String): Self = this.set("directionsLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionsLanguage: Self = this.set("directionsLanguage", js.undefined)
    
    @scala.inline
    def setDirectionsLengthUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = this.set("directionsLengthUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionsLengthUnits: Self = this.set("directionsLengthUnits", js.undefined)
    
    @scala.inline
    def setDirectionsOutputType(value: complete | `complete-no-events` | `instructions-only` | standard | `summary-only`): Self = this.set("directionsOutputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionsOutputType: Self = this.set("directionsOutputType", js.undefined)
    
    @scala.inline
    def setDirectionsStyleName(value: String): Self = this.set("directionsStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionsStyleName: Self = this.set("directionsStyleName", js.undefined)
    
    @scala.inline
    def setDirectionsTimeAttribute(value: String): Self = this.set("directionsTimeAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionsTimeAttribute: Self = this.set("directionsTimeAttribute", js.undefined)
    
    @scala.inline
    def setDoNotLocateOnRestrictedElements(value: Boolean): Self = this.set("doNotLocateOnRestrictedElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotLocateOnRestrictedElements: Self = this.set("doNotLocateOnRestrictedElements", js.undefined)
    
    @scala.inline
    def setFacilities(value: DataLayerProperties | FeatureSetProperties): Self = this.set("facilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacilities: Self = this.set("facilities", js.undefined)
    
    @scala.inline
    def setImpedanceAttribute(value: String): Self = this.set("impedanceAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpedanceAttribute: Self = this.set("impedanceAttribute", js.undefined)
    
    @scala.inline
    def setIncidents(value: DataLayerProperties | FeatureSetProperties): Self = this.set("incidents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncidents: Self = this.set("incidents", js.undefined)
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties | String): Self = this.set("outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutSpatialReference: Self = this.set("outSpatialReference", js.undefined)
    
    @scala.inline
    def setOutputGeometryPrecision(value: Double): Self = this.set("outputGeometryPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputGeometryPrecision: Self = this.set("outputGeometryPrecision", js.undefined)
    
    @scala.inline
    def setOutputGeometryPrecisionUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = this.set("outputGeometryPrecisionUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputGeometryPrecisionUnits: Self = this.set("outputGeometryPrecisionUnits", js.undefined)
    
    @scala.inline
    def setOutputLines(value: none | straight | `true-shape` | `true-shape-with-measure`): Self = this.set("outputLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLines: Self = this.set("outputLines", js.undefined)
    
    @scala.inline
    def setPointBarriers(value: DataLayerProperties | FeatureSetProperties): Self = this.set("pointBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointBarriers: Self = this.set("pointBarriers", js.undefined)
    
    @scala.inline
    def setPolygonBarriers(value: DataLayerProperties | FeatureSetProperties): Self = this.set("polygonBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonBarriers: Self = this.set("polygonBarriers", js.undefined)
    
    @scala.inline
    def setPolylineBarriers(value: DataLayerProperties | FeatureSetProperties): Self = this.set("polylineBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineBarriers: Self = this.set("polylineBarriers", js.undefined)
    
    @scala.inline
    def setRestrictUTurns(value: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`): Self = this.set("restrictUTurns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictUTurns: Self = this.set("restrictUTurns", js.undefined)
    
    @scala.inline
    def setRestrictionAttributesVarargs(value: String*): Self = this.set("restrictionAttributes", js.Array(value :_*))
    
    @scala.inline
    def setRestrictionAttributes(value: js.Array[String]): Self = this.set("restrictionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictionAttributes: Self = this.set("restrictionAttributes", js.undefined)
    
    @scala.inline
    def setReturnDirections(value: Boolean): Self = this.set("returnDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnDirections: Self = this.set("returnDirections", js.undefined)
    
    @scala.inline
    def setReturnFacilities(value: Boolean): Self = this.set("returnFacilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFacilities: Self = this.set("returnFacilities", js.undefined)
    
    @scala.inline
    def setReturnIncidents(value: Boolean): Self = this.set("returnIncidents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnIncidents: Self = this.set("returnIncidents", js.undefined)
    
    @scala.inline
    def setReturnPointBarriers(value: Boolean): Self = this.set("returnPointBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPointBarriers: Self = this.set("returnPointBarriers", js.undefined)
    
    @scala.inline
    def setReturnPolygonBarriers(value: Boolean): Self = this.set("returnPolygonBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPolygonBarriers: Self = this.set("returnPolygonBarriers", js.undefined)
    
    @scala.inline
    def setReturnPolylineBarriers(value: Boolean): Self = this.set("returnPolylineBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPolylineBarriers: Self = this.set("returnPolylineBarriers", js.undefined)
    
    @scala.inline
    def setReturnRoutes(value: Boolean): Self = this.set("returnRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnRoutes: Self = this.set("returnRoutes", js.undefined)
    
    @scala.inline
    def setTimeOfDay(value: DateProperties): Self = this.set("timeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOfDay: Self = this.set("timeOfDay", js.undefined)
    
    @scala.inline
    def setTimeOfDayUsage(value: start | end): Self = this.set("timeOfDayUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOfDayUsage: Self = this.set("timeOfDayUsage", js.undefined)
    
    @scala.inline
    def setTravelDirection(value: `from-facility` | `to-facility`): Self = this.set("travelDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTravelDirection: Self = this.set("travelDirection", js.undefined)
    
    @scala.inline
    def setTravelMode(value: String): Self = this.set("travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTravelMode: Self = this.set("travelMode", js.undefined)
    
    @scala.inline
    def setUseHierarchy(value: Boolean): Self = this.set("useHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHierarchy: Self = this.set("useHierarchy", js.undefined)
  }
}
