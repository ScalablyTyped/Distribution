package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typings.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typings.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typings.arcgisJsApi.arcgisJsApiStrings.`from-facility`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typings.arcgisJsApi.arcgisJsApiStrings.`to-facility`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape-with-measure`
import typings.arcgisJsApi.arcgisJsApiStrings.`true-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.detailed
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.points
import typings.arcgisJsApi.arcgisJsApiStrings.simplified
import typings.arcgisJsApi.arcgisJsApiStrings.straight
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAreaParametersProperties extends js.Object {
  
  /**
    * The list of network attribute names to be accumulated with the analysis (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A set of attribute parameter values that can be parameterized to determine which network elements can be used by a vehicle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * An array of numbers defining the breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#defaultBreaks)
    */
  var defaultBreaks: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * When `true`, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of network source names to NOT use when generating polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#excludeSourcesFromPolygons)
    */
  var excludeSourcesFromPolygons: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The set of facilities loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#facilities)
    */
  var facilities: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The network attribute name used as the impedance attribute in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  
  /**
    * If `true`, similar ranges will be merged in the resulting polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#mergeSimilarPolygonRanges)
    */
  var mergeSimilarPolygonRanges: js.UndefOr[Boolean] = js.native
  
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The precision of the output geometry after generalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.native
  
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  
  /**
    * The type of output lines to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none | straight | `true-shape` | `true-shape-with-measure`] = js.native
  
  /**
    * The type of output polygons to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#outputPolygons)
    */
  var outputPolygons: js.UndefOr[none | simplified | detailed] = js.native
  
  /**
    * Indicates if the lines should overlap from multiple facilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#overlapLines)
    */
  var overlapLines: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the polygons should overlap from multiple facilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#overlapPolygons)
    */
  var overlapPolygons: js.UndefOr[Boolean] = js.native
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The set of polygon barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * The set of polyline barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  
  /**
    * Specifies how U-turns should be handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.native
  
  /**
    * The list of network attribute names to be used as restrictions with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnFacilities)
    */
  var returnFacilities: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, point barriers will be returned in the [pointBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#pointBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPointBarriers)
    */
  var returnPointBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, polygon barriers will be returned in the [polygonBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polygonBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, polyline barriers will be returned in the [polylineBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polylineBarriers) property of the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, lines will be split at breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#splitLinesAtBreaks)
    */
  var splitLinesAtBreaks: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, polygons will be split at breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#splitPolygonsAtBreaks)
    */
  var splitPolygonsAtBreaks: js.UndefOr[Boolean] = js.native
  
  /**
    * Local date and time at the facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#timeOfDay)
    */
  var timeOfDay: js.UndefOr[DateProperties] = js.native
  
  /**
    * Options for traveling to or from the facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#travelDirection)
    */
  var travelDirection: js.UndefOr[`from-facility` | `to-facility`] = js.native
  
  /**
    * A travel mode represents a means of transportation, such as driving or walking.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the outermost polygon (at the maximum break value) will be trimmed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimOuterPolygon)
    */
  var trimOuterPolygon: js.UndefOr[Boolean] = js.native
  
  /**
    * If polygons are being trimmed, provides the distance to trim.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistance)
    */
  var trimPolygonDistance: js.UndefOr[Double] = js.native
  
  /**
    * If polygons are being trimmed, specifies the units of [trimPolygonDistance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#trimPolygonDistanceUnits)
    */
  var trimPolygonDistanceUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  
  /**
    * When `true`, the hierarchy attributes for the network will be used in the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[Boolean] = js.native
}
object ServiceAreaParametersProperties {
  
  @scala.inline
  def apply(): ServiceAreaParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAreaParametersProperties]
  }
  
  @scala.inline
  implicit class ServiceAreaParametersPropertiesOps[Self <: ServiceAreaParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setAttributeParameterValuesVarargs(value: js.Any*): Self = this.set("attributeParameterValues", js.Array(value :_*))
    
    @scala.inline
    def setAttributeParameterValues(value: js.Array[_]): Self = this.set("attributeParameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeParameterValues: Self = this.set("attributeParameterValues", js.undefined)
    
    @scala.inline
    def setDefaultBreaksVarargs(value: Double*): Self = this.set("defaultBreaks", js.Array(value :_*))
    
    @scala.inline
    def setDefaultBreaks(value: js.Array[Double]): Self = this.set("defaultBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBreaks: Self = this.set("defaultBreaks", js.undefined)
    
    @scala.inline
    def setDoNotLocateOnRestrictedElements(value: Boolean): Self = this.set("doNotLocateOnRestrictedElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotLocateOnRestrictedElements: Self = this.set("doNotLocateOnRestrictedElements", js.undefined)
    
    @scala.inline
    def setExcludeSourcesFromPolygonsVarargs(value: String*): Self = this.set("excludeSourcesFromPolygons", js.Array(value :_*))
    
    @scala.inline
    def setExcludeSourcesFromPolygons(value: js.Array[String]): Self = this.set("excludeSourcesFromPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeSourcesFromPolygons: Self = this.set("excludeSourcesFromPolygons", js.undefined)
    
    @scala.inline
    def setFacilities(value: DataLayerProperties | FeatureSetProperties): Self = this.set("facilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacilities: Self = this.set("facilities", js.undefined)
    
    @scala.inline
    def setImpedanceAttribute(value: String): Self = this.set("impedanceAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpedanceAttribute: Self = this.set("impedanceAttribute", js.undefined)
    
    @scala.inline
    def setMergeSimilarPolygonRanges(value: Boolean): Self = this.set("mergeSimilarPolygonRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeSimilarPolygonRanges: Self = this.set("mergeSimilarPolygonRanges", js.undefined)
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = this.set("outSpatialReference", value.asInstanceOf[js.Any])
    
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
    def setOutputPolygons(value: none | simplified | detailed): Self = this.set("outputPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPolygons: Self = this.set("outputPolygons", js.undefined)
    
    @scala.inline
    def setOverlapLines(value: Boolean): Self = this.set("overlapLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlapLines: Self = this.set("overlapLines", js.undefined)
    
    @scala.inline
    def setOverlapPolygons(value: Boolean): Self = this.set("overlapPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlapPolygons: Self = this.set("overlapPolygons", js.undefined)
    
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
    def setReturnFacilities(value: Boolean): Self = this.set("returnFacilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFacilities: Self = this.set("returnFacilities", js.undefined)
    
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
    def setSplitLinesAtBreaks(value: Boolean): Self = this.set("splitLinesAtBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitLinesAtBreaks: Self = this.set("splitLinesAtBreaks", js.undefined)
    
    @scala.inline
    def setSplitPolygonsAtBreaks(value: Boolean): Self = this.set("splitPolygonsAtBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitPolygonsAtBreaks: Self = this.set("splitPolygonsAtBreaks", js.undefined)
    
    @scala.inline
    def setTimeOfDay(value: DateProperties): Self = this.set("timeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOfDay: Self = this.set("timeOfDay", js.undefined)
    
    @scala.inline
    def setTravelDirection(value: `from-facility` | `to-facility`): Self = this.set("travelDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTravelDirection: Self = this.set("travelDirection", js.undefined)
    
    @scala.inline
    def setTravelMode(value: String): Self = this.set("travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTravelMode: Self = this.set("travelMode", js.undefined)
    
    @scala.inline
    def setTrimOuterPolygon(value: Boolean): Self = this.set("trimOuterPolygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimOuterPolygon: Self = this.set("trimOuterPolygon", js.undefined)
    
    @scala.inline
    def setTrimPolygonDistance(value: Double): Self = this.set("trimPolygonDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimPolygonDistance: Self = this.set("trimPolygonDistance", js.undefined)
    
    @scala.inline
    def setTrimPolygonDistanceUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = this.set("trimPolygonDistanceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimPolygonDistanceUnits: Self = this.set("trimPolygonDistanceUnits", js.undefined)
    
    @scala.inline
    def setUseHierarchy(value: Boolean): Self = this.set("useHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHierarchy: Self = this.set("useHierarchy", js.undefined)
  }
}
