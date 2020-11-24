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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteParametersProperties extends js.Object {
  
  /**
    * The list of network attribute names to be accumulated with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Each element in the array is an object that describes the parameter values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[AttributeParamValue]] = js.native
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#barriers)
    */
  var barriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The language used when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[String] = js.native
  
  /**
    * The length units to use when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  
  /**
    * Defines the amount of direction information returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[
    complete | `complete-no-events` | `instructions-only` | standard | `summary-only`
  ] = js.native
  
  /**
    * The style to be used when returning directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[String] = js.native
  
  /**
    * The name of network attribute to use for the drive time when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[String] = js.native
  
  /**
    * If `true`, avoids network elements restricted by barriers or restrictions specified in [restrictionAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.native
  
  /**
    * The [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) can help you find the most efficient path for visiting a given list of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#findBestSequence)
    */
  var findBestSequence: js.UndefOr[Boolean] = js.native
  
  /**
    * In routes where a stop is not located on a network or a stop could not be reached, the results will differ depending on the value of this property:.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#ignoreInvalidLocations)
    */
  var ignoreInvalidLocations: js.UndefOr[Boolean] = js.native
  
  /**
    * The network attribute name to be used as the impedance attribute in the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties | String] = js.native
  
  /**
    * The precision of the output geometry after generalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.native
  
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  
  /**
    * The type of output lines to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none | straight | `true-shape` | `true-shape-with-measure`] = js.native
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The set of polygon barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The set of polyline barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * If `true`, keeps the first stop fixed in the sequence even when `findBestSequence = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveFirstStop)
    */
  var preserveFirstStop: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, keeps the last stop fixed in the sequence even when `findBestSequence = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveLastStop)
    */
  var preserveLastStop: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies how U-Turns should be handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.native
  
  /**
    * The list of network attribute names to be used as restrictions with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If `true`, barriers are returned with the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnBarriers)
    */
  var returnBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnDirections)
    */
  var returnDirections: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, polygon barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, polyline barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, routes are generated and returned in the route property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnRoutes)
    */
  var returnRoutes: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, stops are returned in the stops property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnStops)
    */
  var returnStops: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, `z` values are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.native
  
  /**
    * The time the route begins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTime)
    */
  var startTime: js.UndefOr[DateProperties] = js.native
  
  /**
    * If `true`, the start time will be in UTC format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTimeIsUTC)
    */
  var startTimeIsUTC: js.UndefOr[Boolean] = js.native
  
  /**
    * The set of stops loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops)
    */
  var stops: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[js.Any] = js.native
  
  /**
    * If `true`, the hierarchy attribute for the network should be used in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[Boolean] = js.native
  
  /**
    * A useful feature of the [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) is the ability to constrain stop visits to certain times of day, or "time windows".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useTimeWindows)
    */
  var useTimeWindows: js.UndefOr[Boolean] = js.native
}
object RouteParametersProperties {
  
  @scala.inline
  def apply(): RouteParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteParametersProperties]
  }
  
  @scala.inline
  implicit class RouteParametersPropertiesOps[Self <: RouteParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setAttributeParameterValuesVarargs(value: AttributeParamValue*): Self = this.set("attributeParameterValues", js.Array(value :_*))
    
    @scala.inline
    def setAttributeParameterValues(value: js.Array[AttributeParamValue]): Self = this.set("attributeParameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeParameterValues: Self = this.set("attributeParameterValues", js.undefined)
    
    @scala.inline
    def setBarriers(value: DataLayerProperties | FeatureSetProperties): Self = this.set("barriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarriers: Self = this.set("barriers", js.undefined)
    
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
    def setFindBestSequence(value: Boolean): Self = this.set("findBestSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindBestSequence: Self = this.set("findBestSequence", js.undefined)
    
    @scala.inline
    def setIgnoreInvalidLocations(value: Boolean): Self = this.set("ignoreInvalidLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreInvalidLocations: Self = this.set("ignoreInvalidLocations", js.undefined)
    
    @scala.inline
    def setImpedanceAttribute(value: String): Self = this.set("impedanceAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpedanceAttribute: Self = this.set("impedanceAttribute", js.undefined)
    
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
    def setPreserveFirstStop(value: Boolean): Self = this.set("preserveFirstStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveFirstStop: Self = this.set("preserveFirstStop", js.undefined)
    
    @scala.inline
    def setPreserveLastStop(value: Boolean): Self = this.set("preserveLastStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveLastStop: Self = this.set("preserveLastStop", js.undefined)
    
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
    def setReturnBarriers(value: Boolean): Self = this.set("returnBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnBarriers: Self = this.set("returnBarriers", js.undefined)
    
    @scala.inline
    def setReturnDirections(value: Boolean): Self = this.set("returnDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnDirections: Self = this.set("returnDirections", js.undefined)
    
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
    def setReturnStops(value: Boolean): Self = this.set("returnStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnStops: Self = this.set("returnStops", js.undefined)
    
    @scala.inline
    def setReturnZ(value: Boolean): Self = this.set("returnZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnZ: Self = this.set("returnZ", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateProperties): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStartTimeIsUTC(value: Boolean): Self = this.set("startTimeIsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeIsUTC: Self = this.set("startTimeIsUTC", js.undefined)
    
    @scala.inline
    def setStops(value: DataLayerProperties | FeatureSetProperties): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    
    @scala.inline
    def setTravelMode(value: js.Any): Self = this.set("travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTravelMode: Self = this.set("travelMode", js.undefined)
    
    @scala.inline
    def setUseHierarchy(value: Boolean): Self = this.set("useHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHierarchy: Self = this.set("useHierarchy", js.undefined)
    
    @scala.inline
    def setUseTimeWindows(value: Boolean): Self = this.set("useTimeWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTimeWindows: Self = this.set("useTimeWindows", js.undefined)
  }
}
