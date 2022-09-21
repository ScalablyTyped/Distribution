package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.DataLayerPropertiestypela
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
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.points
import typings.arcgisJsApi.arcgisJsApiStrings.simplified
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAreaParametersProperties extends StObject {
  
  /**
    * The list of network attribute names to be accumulated with the analysis (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#apiKey)
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
    * A set of attribute parameter values that can be parameterized to determine which network elements can be used by a vehicle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * An array of numbers defining the breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#defaultBreaks)
    */
  var defaultBreaks: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * An array of network source names to NOT use when generating polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#excludeSourcesFromPolygons)
    */
  var excludeSourcesFromPolygons: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The set of facilities loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#facilities)
    */
  var facilities: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * The network attribute name used as the impedance attribute in analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, similar ranges will be merged in the resulting polygons.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#mergeSimilarPolygonRanges)
    */
  var mergeSimilarPolygonRanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The precision of the output geometry after generalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * The units of the output geometry precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
    * The type of output lines to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[none_ | `true-shape` | `true-shape-with-measure`] = js.undefined
  
  /**
    * The type of output polygons to be generated in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#outputPolygons)
    */
  var outputPolygons: js.UndefOr[none_ | simplified | detailed] = js.undefined
  
  /**
    * Indicates if the lines should overlap from multiple facilities.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overlapLines)
    */
  var overlapLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the polygons should overlap from multiple facilities.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#overlapPolygons)
    */
  var overlapPolygons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The set of point barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * The set of polygon barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * The set of polyline barriers loaded as network locations during analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[
    DataLayerPropertiestypela | FeatureSetProperties | NetworkFeatureSetProperties | NetworkUrlProperties
  ] = js.undefined
  
  /**
    * Specifies how U-turns should be handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.undefined
  
  /**
    * The list of network attribute names to be used as restrictions with the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnFacilities)
    */
  var returnFacilities: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, point barriers will be returned in the [pointBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html#pointBarriers) property of the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPointBarriers)
    */
  var returnPointBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, polygon barriers will be returned in the [polygonBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html#polygonBarriers) property of the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPolygonBarriers)
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, polyline barriers will be returned in the [polylineBarriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html#polylineBarriers) property of the analysis results.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#returnPolylineBarriers)
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, lines will be split at breaks.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#splitLinesAtBreaks)
    */
  var splitLinesAtBreaks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, polygons will be split at breaks.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#splitPolygonsAtBreaks)
    */
  var splitPolygonsAtBreaks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Local date and time at the facility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#timeOfDay)
    */
  var timeOfDay: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * Options for traveling to or from the facility.
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
    * If `true`, the outermost polygon (at the maximum break value) will be trimmed.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimOuterPolygon)
    */
  var trimOuterPolygon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If polygons are being trimmed, provides the distance to trim.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistance)
    */
  var trimPolygonDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * If polygons are being trimmed, specifies the units of [trimPolygonDistance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html#trimPolygonDistanceUnits)
    */
  var trimPolygonDistanceUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.undefined
  
  /**
    * When `true`, the hierarchy attributes for the network will be used in the analysis.
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
  
  extension [Self <: ServiceAreaParametersProperties](x: Self) {
    
    inline def setAccumulateAttributes(value: js.Array[String]): Self = StObject.set(x, "accumulateAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccumulateAttributesUndefined: Self = StObject.set(x, "accumulateAttributes", js.undefined)
    
    inline def setAccumulateAttributesVarargs(value: String*): Self = StObject.set(x, "accumulateAttributes", js.Array(value*))
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAttributeParameterValues(value: js.Array[Any]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    inline def setAttributeParameterValuesVarargs(value: Any*): Self = StObject.set(x, "attributeParameterValues", js.Array(value*))
    
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
    
    inline def setImpedanceAttribute(value: String): Self = StObject.set(x, "impedanceAttribute", value.asInstanceOf[js.Any])
    
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
    
    inline def setOutputLines(value: none_ | `true-shape` | `true-shape-with-measure`): Self = StObject.set(x, "outputLines", value.asInstanceOf[js.Any])
    
    inline def setOutputLinesUndefined: Self = StObject.set(x, "outputLines", js.undefined)
    
    inline def setOutputPolygons(value: none_ | simplified | detailed): Self = StObject.set(x, "outputPolygons", value.asInstanceOf[js.Any])
    
    inline def setOutputPolygonsUndefined: Self = StObject.set(x, "outputPolygons", js.undefined)
    
    inline def setOverlapLines(value: Boolean): Self = StObject.set(x, "overlapLines", value.asInstanceOf[js.Any])
    
    inline def setOverlapLinesUndefined: Self = StObject.set(x, "overlapLines", js.undefined)
    
    inline def setOverlapPolygons(value: Boolean): Self = StObject.set(x, "overlapPolygons", value.asInstanceOf[js.Any])
    
    inline def setOverlapPolygonsUndefined: Self = StObject.set(x, "overlapPolygons", js.undefined)
    
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
    
    inline def setTimeOfDay(value: DateProperties): Self = StObject.set(x, "timeOfDay", value.asInstanceOf[js.Any])
    
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
