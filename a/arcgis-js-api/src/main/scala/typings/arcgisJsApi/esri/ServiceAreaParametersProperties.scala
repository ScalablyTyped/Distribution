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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAreaParametersProperties extends StObject {
  
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
  implicit class ServiceAreaParametersPropertiesMutableBuilder[Self <: ServiceAreaParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccumulateAttributes(value: js.Array[String]): Self = StObject.set(x, "accumulateAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccumulateAttributesUndefined: Self = StObject.set(x, "accumulateAttributes", js.undefined)
    
    @scala.inline
    def setAccumulateAttributesVarargs(value: String*): Self = StObject.set(x, "accumulateAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributeParameterValues(value: js.Array[_]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    @scala.inline
    def setAttributeParameterValuesVarargs(value: js.Any*): Self = StObject.set(x, "attributeParameterValues", js.Array(value :_*))
    
    @scala.inline
    def setDefaultBreaks(value: js.Array[Double]): Self = StObject.set(x, "defaultBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBreaksUndefined: Self = StObject.set(x, "defaultBreaks", js.undefined)
    
    @scala.inline
    def setDefaultBreaksVarargs(value: Double*): Self = StObject.set(x, "defaultBreaks", js.Array(value :_*))
    
    @scala.inline
    def setDoNotLocateOnRestrictedElements(value: Boolean): Self = StObject.set(x, "doNotLocateOnRestrictedElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotLocateOnRestrictedElementsUndefined: Self = StObject.set(x, "doNotLocateOnRestrictedElements", js.undefined)
    
    @scala.inline
    def setExcludeSourcesFromPolygons(value: js.Array[String]): Self = StObject.set(x, "excludeSourcesFromPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeSourcesFromPolygonsUndefined: Self = StObject.set(x, "excludeSourcesFromPolygons", js.undefined)
    
    @scala.inline
    def setExcludeSourcesFromPolygonsVarargs(value: String*): Self = StObject.set(x, "excludeSourcesFromPolygons", js.Array(value :_*))
    
    @scala.inline
    def setFacilities(value: DataLayerProperties | FeatureSetProperties): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
    @scala.inline
    def setImpedanceAttribute(value: String): Self = StObject.set(x, "impedanceAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpedanceAttributeUndefined: Self = StObject.set(x, "impedanceAttribute", js.undefined)
    
    @scala.inline
    def setMergeSimilarPolygonRanges(value: Boolean): Self = StObject.set(x, "mergeSimilarPolygonRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeSimilarPolygonRangesUndefined: Self = StObject.set(x, "mergeSimilarPolygonRanges", js.undefined)
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
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
    def setOutputPolygons(value: none | simplified | detailed): Self = StObject.set(x, "outputPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputPolygonsUndefined: Self = StObject.set(x, "outputPolygons", js.undefined)
    
    @scala.inline
    def setOverlapLines(value: Boolean): Self = StObject.set(x, "overlapLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapLinesUndefined: Self = StObject.set(x, "overlapLines", js.undefined)
    
    @scala.inline
    def setOverlapPolygons(value: Boolean): Self = StObject.set(x, "overlapPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapPolygonsUndefined: Self = StObject.set(x, "overlapPolygons", js.undefined)
    
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
    def setReturnFacilities(value: Boolean): Self = StObject.set(x, "returnFacilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnFacilitiesUndefined: Self = StObject.set(x, "returnFacilities", js.undefined)
    
    @scala.inline
    def setReturnPointBarriers(value: Boolean): Self = StObject.set(x, "returnPointBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPointBarriersUndefined: Self = StObject.set(x, "returnPointBarriers", js.undefined)
    
    @scala.inline
    def setReturnPolygonBarriers(value: Boolean): Self = StObject.set(x, "returnPolygonBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPolygonBarriersUndefined: Self = StObject.set(x, "returnPolygonBarriers", js.undefined)
    
    @scala.inline
    def setReturnPolylineBarriers(value: Boolean): Self = StObject.set(x, "returnPolylineBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPolylineBarriersUndefined: Self = StObject.set(x, "returnPolylineBarriers", js.undefined)
    
    @scala.inline
    def setSplitLinesAtBreaks(value: Boolean): Self = StObject.set(x, "splitLinesAtBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitLinesAtBreaksUndefined: Self = StObject.set(x, "splitLinesAtBreaks", js.undefined)
    
    @scala.inline
    def setSplitPolygonsAtBreaks(value: Boolean): Self = StObject.set(x, "splitPolygonsAtBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitPolygonsAtBreaksUndefined: Self = StObject.set(x, "splitPolygonsAtBreaks", js.undefined)
    
    @scala.inline
    def setTimeOfDay(value: DateProperties): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOfDayUndefined: Self = StObject.set(x, "timeOfDay", js.undefined)
    
    @scala.inline
    def setTravelDirection(value: `from-facility` | `to-facility`): Self = StObject.set(x, "travelDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelDirectionUndefined: Self = StObject.set(x, "travelDirection", js.undefined)
    
    @scala.inline
    def setTravelMode(value: String): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
    
    @scala.inline
    def setTrimOuterPolygon(value: Boolean): Self = StObject.set(x, "trimOuterPolygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimOuterPolygonUndefined: Self = StObject.set(x, "trimOuterPolygon", js.undefined)
    
    @scala.inline
    def setTrimPolygonDistance(value: Double): Self = StObject.set(x, "trimPolygonDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimPolygonDistanceUndefined: Self = StObject.set(x, "trimPolygonDistance", js.undefined)
    
    @scala.inline
    def setTrimPolygonDistanceUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
    ): Self = StObject.set(x, "trimPolygonDistanceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimPolygonDistanceUnitsUndefined: Self = StObject.set(x, "trimPolygonDistanceUnits", js.undefined)
    
    @scala.inline
    def setUseHierarchy(value: Boolean): Self = StObject.set(x, "useHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHierarchyUndefined: Self = StObject.set(x, "useHierarchy", js.undefined)
  }
}
