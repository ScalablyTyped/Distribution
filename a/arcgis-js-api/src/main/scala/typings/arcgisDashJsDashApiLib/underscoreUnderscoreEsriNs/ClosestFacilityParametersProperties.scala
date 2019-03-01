package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosestFacilityParametersProperties extends js.Object {
  /**
    * The list of network attribute names to be accumulated with the analysis, i.e., which attributes should be returned as part of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An array of attribute parameter values that determine which network elements can be used by a vehicle. View the object specifications below for properties of the individual objects in this array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[ClosestFacilityParametersAttributeParameterValues]] = js.undefined
  /**
    * The cutoff value used to determine when to stop traversing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultCutoff)
    */
  var defaultCutoff: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of facilities to find.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultTargetFacilityCount)
    */
  var defaultTargetFacilityCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The language used when generating driving directions. This parameter applies only when [returnDirections](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections) parameter is set to `true`. If an unsupported language code is specified, the service returns the directions using the default language, English.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The length units used when computing driving directions. This parameter applies only when [returnDirections](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections) parameter is set to `true`. If not specified the task will use the value defined by the routing network layer is used.  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the amount of direction information returned. The default value is standard.  **Possible Values:** complete | complete-no-events | instructions-only | standard | summary-only
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The style to be used when returning directions. The default will be as defined in the network layer. View the REST layer description for your network service to see a list of supported styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the attribute field that contains the drive time values. If not specified, the task will use the attribute field defined by the routing network layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When `true`, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#doNotLocateOnRestrictedElements)
    *
    * @default true
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The set of facilities loaded as network locations during analysis. These can be specified as either a [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html).  At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url  property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#facilities)
    */
  var facilities: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The network attribute name used as the impedance attribute in analysis. The default is as defined in the routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty string, it will use the default of the service.  For example, set `impedanceAttribute = 'Time'` for quickest route and `impedanceAttribute = 'Length'` for shortest drive, assuming the service has those two esriNAUTCost attributes.  View the [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm) ArcGIS desktop help topic for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The set of incidents loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#incidents)
    */
  var incidents: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The well-known id of the spatial reference or the spatial reference object for the geometries returned with the analysis results. If `outSpatialReference` is not specified, the geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties | java.lang.String] = js.undefined
  /**
    * The output geometry precision. When `0`, no generalization of the output geometry is performed. Positive values represent the `MaximumAllowableOffset` parameter used by generalize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[scala.Double] = js.undefined
  /**
    * The units of the output geometry precision.  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of output lines to be generated in the result. The default is defined in the specific routing network layer used in your RouteTask.
    *
    * Possible Value | Description
    * ---------------|------------
    * none | No lines are returned
    * straight | Only returns straight lines
    * true-shape | Return the true shape of the lines
    * true-shape-with-measure | Return the true shape of the lines with their measurements
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputLines)
    */
  var outputLines: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The set of point barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The set of polygon barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The set of polyline barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * Specifies how U-Turns should be handled. The default is as defined in the specific routing network layer used in your module:"esri/tasks/ClosestFacilityTask".  **Possible Values:**  allow-backtrack | at-dead-ends-only | no-backtrack | at-dead-ends-and-intersections
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your RouteTask. Possible values are listed in the Service Directory under Network Dataset > Network Attributes. You can also specify a value of none to indicate that no network attributes should be used as restrictions. If you specify an empty array, it will default to the default of the service. Use `["none"]` to override the service defaults and specify that no restrictions should be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections)
    *
    * @default false
    */
  var returnDirections: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnFacilities)
    *
    * @default false
    */
  var returnFacilities: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, incidents will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnIncidents)
    *
    * @default false
    */
  var returnIncidents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, point barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPointBarriers)
    *
    * @default false
    */
  var returnPointBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, polygon barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, polyline barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true`, closest facility routes will be generated and returned in the route property of each [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnRoutes)
    *
    * @default true
    */
  var returnRoutes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The arrival or departure date and time. For example, if the travelDirection is set to `to-facility` and `timeOfDayUsage` is set to `end` and `timeOfDay` is set to 8:00 a.m., the returned route(s) will be setup to arrive at the facility at 8:00 a.m. local time. *Requires ArcGIS Server service version 10.1 or greater.*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDay)
    */
  var timeOfDay: js.UndefOr[DateProperties] = js.undefined
  /**
    * Defines the way the `timeOfDay` value is used. The default value is defined in the network layer. *Requires ArcGIS Server service version 10.1 or greater.*  **Possible Values:** start | end
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDayUsage)
    */
  var timeOfDayUsage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options for traveling to or from the facility. Default values are defined by the network layer.
    *
    * Possible Value | Description
    * ---------------|------------
    * from-facility | Sets travel direction from the facility
    * to-facility | Sets travel direction to the facility
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelDirection)
    */
  var travelDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Travel modes define how a pedestrian, car, truck or other medium of transportation moves through the street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[js.Any] = js.undefined
  /**
    * If `true`, the hierarchy attribute for the network will be used in analysis. The default is defined in the routing network layer used by the [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#useHierarchy)
    *
    * @default false
    */
  var useHierarchy: js.UndefOr[scala.Boolean] = js.undefined
}

object ClosestFacilityParametersProperties {
  @scala.inline
  def apply(
    accumulateAttributes: js.Array[java.lang.String] = null,
    attributeParameterValues: js.Array[ClosestFacilityParametersAttributeParameterValues] = null,
    defaultCutoff: scala.Int | scala.Double = null,
    defaultTargetFacilityCount: scala.Int | scala.Double = null,
    directionsLanguage: java.lang.String = null,
    directionsLengthUnits: java.lang.String = null,
    directionsOutputType: java.lang.String = null,
    directionsStyleName: java.lang.String = null,
    directionsTimeAttribute: java.lang.String = null,
    doNotLocateOnRestrictedElements: js.UndefOr[scala.Boolean] = js.undefined,
    facilities: DataLayerProperties | FeatureSetProperties = null,
    impedanceAttribute: java.lang.String = null,
    incidents: DataLayerProperties | FeatureSetProperties = null,
    outSpatialReference: SpatialReferenceProperties | java.lang.String = null,
    outputGeometryPrecision: scala.Int | scala.Double = null,
    outputGeometryPrecisionUnits: java.lang.String = null,
    outputLines: java.lang.String = null,
    pointBarriers: DataLayerProperties | FeatureSetProperties = null,
    polygonBarriers: DataLayerProperties | FeatureSetProperties = null,
    polylineBarriers: DataLayerProperties | FeatureSetProperties = null,
    restrictUTurns: java.lang.String = null,
    restrictionAttributes: js.Array[java.lang.String] = null,
    returnDirections: js.UndefOr[scala.Boolean] = js.undefined,
    returnFacilities: js.UndefOr[scala.Boolean] = js.undefined,
    returnIncidents: js.UndefOr[scala.Boolean] = js.undefined,
    returnPointBarriers: js.UndefOr[scala.Boolean] = js.undefined,
    returnPolygonBarriers: js.UndefOr[scala.Boolean] = js.undefined,
    returnPolylineBarriers: js.UndefOr[scala.Boolean] = js.undefined,
    returnRoutes: js.UndefOr[scala.Boolean] = js.undefined,
    timeOfDay: DateProperties = null,
    timeOfDayUsage: java.lang.String = null,
    travelDirection: java.lang.String = null,
    travelMode: js.Any = null,
    useHierarchy: js.UndefOr[scala.Boolean] = js.undefined
  ): ClosestFacilityParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (accumulateAttributes != null) __obj.updateDynamic("accumulateAttributes")(accumulateAttributes)
    if (attributeParameterValues != null) __obj.updateDynamic("attributeParameterValues")(attributeParameterValues)
    if (defaultCutoff != null) __obj.updateDynamic("defaultCutoff")(defaultCutoff.asInstanceOf[js.Any])
    if (defaultTargetFacilityCount != null) __obj.updateDynamic("defaultTargetFacilityCount")(defaultTargetFacilityCount.asInstanceOf[js.Any])
    if (directionsLanguage != null) __obj.updateDynamic("directionsLanguage")(directionsLanguage)
    if (directionsLengthUnits != null) __obj.updateDynamic("directionsLengthUnits")(directionsLengthUnits)
    if (directionsOutputType != null) __obj.updateDynamic("directionsOutputType")(directionsOutputType)
    if (directionsStyleName != null) __obj.updateDynamic("directionsStyleName")(directionsStyleName)
    if (directionsTimeAttribute != null) __obj.updateDynamic("directionsTimeAttribute")(directionsTimeAttribute)
    if (!js.isUndefined(doNotLocateOnRestrictedElements)) __obj.updateDynamic("doNotLocateOnRestrictedElements")(doNotLocateOnRestrictedElements)
    if (facilities != null) __obj.updateDynamic("facilities")(facilities.asInstanceOf[js.Any])
    if (impedanceAttribute != null) __obj.updateDynamic("impedanceAttribute")(impedanceAttribute)
    if (incidents != null) __obj.updateDynamic("incidents")(incidents.asInstanceOf[js.Any])
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference.asInstanceOf[js.Any])
    if (outputGeometryPrecision != null) __obj.updateDynamic("outputGeometryPrecision")(outputGeometryPrecision.asInstanceOf[js.Any])
    if (outputGeometryPrecisionUnits != null) __obj.updateDynamic("outputGeometryPrecisionUnits")(outputGeometryPrecisionUnits)
    if (outputLines != null) __obj.updateDynamic("outputLines")(outputLines)
    if (pointBarriers != null) __obj.updateDynamic("pointBarriers")(pointBarriers.asInstanceOf[js.Any])
    if (polygonBarriers != null) __obj.updateDynamic("polygonBarriers")(polygonBarriers.asInstanceOf[js.Any])
    if (polylineBarriers != null) __obj.updateDynamic("polylineBarriers")(polylineBarriers.asInstanceOf[js.Any])
    if (restrictUTurns != null) __obj.updateDynamic("restrictUTurns")(restrictUTurns)
    if (restrictionAttributes != null) __obj.updateDynamic("restrictionAttributes")(restrictionAttributes)
    if (!js.isUndefined(returnDirections)) __obj.updateDynamic("returnDirections")(returnDirections)
    if (!js.isUndefined(returnFacilities)) __obj.updateDynamic("returnFacilities")(returnFacilities)
    if (!js.isUndefined(returnIncidents)) __obj.updateDynamic("returnIncidents")(returnIncidents)
    if (!js.isUndefined(returnPointBarriers)) __obj.updateDynamic("returnPointBarriers")(returnPointBarriers)
    if (!js.isUndefined(returnPolygonBarriers)) __obj.updateDynamic("returnPolygonBarriers")(returnPolygonBarriers)
    if (!js.isUndefined(returnPolylineBarriers)) __obj.updateDynamic("returnPolylineBarriers")(returnPolylineBarriers)
    if (!js.isUndefined(returnRoutes)) __obj.updateDynamic("returnRoutes")(returnRoutes)
    if (timeOfDay != null) __obj.updateDynamic("timeOfDay")(timeOfDay.asInstanceOf[js.Any])
    if (timeOfDayUsage != null) __obj.updateDynamic("timeOfDayUsage")(timeOfDayUsage)
    if (travelDirection != null) __obj.updateDynamic("travelDirection")(travelDirection)
    if (travelMode != null) __obj.updateDynamic("travelMode")(travelMode)
    if (!js.isUndefined(useHierarchy)) __obj.updateDynamic("useHierarchy")(useHierarchy)
    __obj.asInstanceOf[ClosestFacilityParametersProperties]
  }
}

