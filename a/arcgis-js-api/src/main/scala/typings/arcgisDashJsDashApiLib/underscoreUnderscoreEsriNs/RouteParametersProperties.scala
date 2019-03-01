package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteParametersProperties extends js.Object {
  /**
    * The list of network attribute names to be accumulated with the analysis. For example, which attributes should be returned as part of the response. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. See also [Understanding the network attribute](http://resources.arcgis.com/en/help/main/10.2/index.html#//00470000000m000000).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Each element in the array is an object that describes the parameter values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[AttributeParamValue] = js.undefined
  /**
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1 an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#barriers)
    */
  var barriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The language used when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). By default, NAServer gets installed with `en_US` only - it is up to the server administrator to add additional languages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The length units to use when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the amount of direction information returned.  **Possible Values:** complete | complete-no-events | instructions-only | standard | summary-only
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType)
    *
    * @default standard
    */
  var directionsOutputType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The style to be used when returning directions. The default will be as defined in the network layer. View the REST layer description for your network service to see a list of supported styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of network attribute to use for the drive time when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `true`, avoids network elements restricted by barriers or restrictions specified in [restrictionAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#doNotLocateOnRestrictedElements)
    *
    * @default true
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) can help you find the most efficient path for visiting a given list of stops. This is sometimes known as the "traveling salesperson" problem. When the `findBestSequence = true`, the route solver is solving the Traveling Salesperson problem by computing the optimal sequence to visit the stops. As this is a combinatorial problem, we employ heuristics to solve this in a reasonable time. The heuristics do not guarantee the optimal sequence (as there is no good/fast way to prove optimality for large number of stops). It returns a solution that is close to optimal if not the optimal. The heuristic performs favorably when tested with known TSP benchmarks available in the OR research community. For these stops to be visited in the most efficient way, specify the following parameters:
    * ```js
    * routeParams.findBestSequence = true;
    * routeParams.preserveFirstStop = false;
    * routeParams.preserveLastStop = false;
    * routeParams.returnStops = true;
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#findBestSequence)
    */
  var findBestSequence: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * In routes where a stop is not located on a network or a stop could not be reached, the results will differ depending on the value of this property:
    *   * When `false`, the solve operation will fail if at least one of the stops specified cannot be located or reached.
    *   * When `true`, as long as there are at least two valid stops that have been connected by a route, a valid result is returned. If multiple routes are processed in a single request, as long as least one route is built, a valid result is returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#ignoreInvalidLocations)
    */
  var ignoreInvalidLocations: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The network attribute name to be used as the impedance attribute in the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty array, it will default to the default of the service.  For example, set `impedanceAttribute = "Time"` for the quickest route and `impedanceAttribute = "Length"` for shortest drive, assuming the service has those two esriNAUTCost attributes.  For more information, see [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results. If not specified, the geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The precision of the output geometry after generalization. If `0`, no generalization of output geometry is performed. If present and positive, it represents the `MaximumAllowableOffset` parameter and generalization is performed according to `IPolycurve.Generalize`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: js.UndefOr[scala.Double] = js.undefined
  /**
    * The units of the output geometry precision.  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of output lines to be generated in the result. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).  **Possible Values:** none | straight | true-shape | true-shape-with-measure
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputLines)
    *
    * @default true-shape
    */
  var outputLines: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The set of polygon barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the `features` or `url` property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * The set of polyline barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the `features` or `url` property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * If `true`, keeps the first stop fixed in the sequence even when `findBestSequence = true`. Only applicable if `findBestSequence = true`. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveFirstStop)
    */
  var preserveFirstStop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, keeps the last stop fixed in the sequence even when `findBestSequence = true`. Only applicable if `findBestSequence = true`. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveLastStop)
    */
  var preserveLastStop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies how U-Turns should be handled. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).  **Possible Values:**  allow-backtrack | at-dead-ends-only | no-backtrack | at-dead-ends-and-intersections
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). Possible values are listed in the Service Directory under `Network Dataset -> Network Attributes`. You can also specify a value of `none` to indicate that no network attributes should be used as restrictions. If you specify an empty array, it will default to the default of the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If `true`, barriers are returned with the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnBarriers)
    *
    * @default false
    */
  var returnBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, barriers are returned in the [directions property of each RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#directions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnDirections)
    *
    * @default false
    */
  var returnDirections: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, polygon barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, polyline barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, routes are generated and returned in the route property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnRoutes)
    *
    * @default true
    */
  var returnRoutes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, stops are returned in the stops property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnStops)
    *
    * @default false
    */
  var returnStops: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, `z` values are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnZ)
    *
    * @default true
    */
  var returnZ: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The time the route begins. If not specified, the default is the time specified in the route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTime)
    */
  var startTime: js.UndefOr[DateProperties] = js.undefined
  /**
    * If `true`, the start time will be in UTC format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTimeIsUTC)
    */
  var startTimeIsUTC: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The set of stops loaded as network locations during analysis. When `stops` takes a FeatureSet, each feature in the FeatureSet must have a defined spatial reference. If the feature contains `x` and `y` attributes, those values are used for the stop, even if the feature includes geometry.  At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The `url` property can be specified using DataFile Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops)
    */
  var stops: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.undefined
  /**
    * Travel modes define how a pedestrian, car, truck or other medium of transportation moves through the street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[js.Any] = js.undefined
  /**
    * If `true`, the hierarchy attribute for the network should be used in analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A useful feature of the [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) is the ability to constrain stop visits to certain times of day, or "time windows". If you were required to deliver orders to four homes and each customer was available during a limited time period during the day, the route task could help you find the most efficient path for making all the deliveries.  Time windows are treated as a "soft" constraint. This means that although the solver attempts to honor time windows, if necessary, it will violate the time windows of some stops in order to reach them. Remember, the stops will be visited in the order they were added unless you set `RouteParameters.findBestSequence = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useTimeWindows)
    */
  var useTimeWindows: js.UndefOr[scala.Boolean] = js.undefined
}

object RouteParametersProperties {
  @scala.inline
  def apply(
    accumulateAttributes: js.Array[java.lang.String] = null,
    attributeParameterValues: AttributeParamValue = null,
    barriers: DataLayerProperties | FeatureSetProperties = null,
    directionsLanguage: java.lang.String = null,
    directionsLengthUnits: java.lang.String = null,
    directionsOutputType: java.lang.String = null,
    directionsStyleName: java.lang.String = null,
    directionsTimeAttribute: java.lang.String = null,
    doNotLocateOnRestrictedElements: js.UndefOr[scala.Boolean] = js.undefined,
    findBestSequence: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreInvalidLocations: js.UndefOr[scala.Boolean] = js.undefined,
    impedanceAttribute: java.lang.String = null,
    outSpatialReference: SpatialReferenceProperties = null,
    outputGeometryPrecision: scala.Int | scala.Double = null,
    outputGeometryPrecisionUnits: java.lang.String = null,
    outputLines: java.lang.String = null,
    polygonBarriers: DataLayerProperties | FeatureSetProperties = null,
    polylineBarriers: DataLayerProperties | FeatureSetProperties = null,
    preserveFirstStop: js.UndefOr[scala.Boolean] = js.undefined,
    preserveLastStop: js.UndefOr[scala.Boolean] = js.undefined,
    restrictUTurns: java.lang.String = null,
    restrictionAttributes: js.Array[java.lang.String] = null,
    returnBarriers: js.UndefOr[scala.Boolean] = js.undefined,
    returnDirections: js.UndefOr[scala.Boolean] = js.undefined,
    returnPolygonBarriers: js.UndefOr[scala.Boolean] = js.undefined,
    returnPolylineBarriers: js.UndefOr[scala.Boolean] = js.undefined,
    returnRoutes: js.UndefOr[scala.Boolean] = js.undefined,
    returnStops: js.UndefOr[scala.Boolean] = js.undefined,
    returnZ: js.UndefOr[scala.Boolean] = js.undefined,
    startTime: DateProperties = null,
    startTimeIsUTC: js.UndefOr[scala.Boolean] = js.undefined,
    stops: DataLayerProperties | FeatureSetProperties = null,
    travelMode: js.Any = null,
    useHierarchy: js.UndefOr[scala.Boolean] = js.undefined,
    useTimeWindows: js.UndefOr[scala.Boolean] = js.undefined
  ): RouteParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (accumulateAttributes != null) __obj.updateDynamic("accumulateAttributes")(accumulateAttributes)
    if (attributeParameterValues != null) __obj.updateDynamic("attributeParameterValues")(attributeParameterValues)
    if (barriers != null) __obj.updateDynamic("barriers")(barriers.asInstanceOf[js.Any])
    if (directionsLanguage != null) __obj.updateDynamic("directionsLanguage")(directionsLanguage)
    if (directionsLengthUnits != null) __obj.updateDynamic("directionsLengthUnits")(directionsLengthUnits)
    if (directionsOutputType != null) __obj.updateDynamic("directionsOutputType")(directionsOutputType)
    if (directionsStyleName != null) __obj.updateDynamic("directionsStyleName")(directionsStyleName)
    if (directionsTimeAttribute != null) __obj.updateDynamic("directionsTimeAttribute")(directionsTimeAttribute)
    if (!js.isUndefined(doNotLocateOnRestrictedElements)) __obj.updateDynamic("doNotLocateOnRestrictedElements")(doNotLocateOnRestrictedElements)
    if (!js.isUndefined(findBestSequence)) __obj.updateDynamic("findBestSequence")(findBestSequence)
    if (!js.isUndefined(ignoreInvalidLocations)) __obj.updateDynamic("ignoreInvalidLocations")(ignoreInvalidLocations)
    if (impedanceAttribute != null) __obj.updateDynamic("impedanceAttribute")(impedanceAttribute)
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference)
    if (outputGeometryPrecision != null) __obj.updateDynamic("outputGeometryPrecision")(outputGeometryPrecision.asInstanceOf[js.Any])
    if (outputGeometryPrecisionUnits != null) __obj.updateDynamic("outputGeometryPrecisionUnits")(outputGeometryPrecisionUnits)
    if (outputLines != null) __obj.updateDynamic("outputLines")(outputLines)
    if (polygonBarriers != null) __obj.updateDynamic("polygonBarriers")(polygonBarriers.asInstanceOf[js.Any])
    if (polylineBarriers != null) __obj.updateDynamic("polylineBarriers")(polylineBarriers.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFirstStop)) __obj.updateDynamic("preserveFirstStop")(preserveFirstStop)
    if (!js.isUndefined(preserveLastStop)) __obj.updateDynamic("preserveLastStop")(preserveLastStop)
    if (restrictUTurns != null) __obj.updateDynamic("restrictUTurns")(restrictUTurns)
    if (restrictionAttributes != null) __obj.updateDynamic("restrictionAttributes")(restrictionAttributes)
    if (!js.isUndefined(returnBarriers)) __obj.updateDynamic("returnBarriers")(returnBarriers)
    if (!js.isUndefined(returnDirections)) __obj.updateDynamic("returnDirections")(returnDirections)
    if (!js.isUndefined(returnPolygonBarriers)) __obj.updateDynamic("returnPolygonBarriers")(returnPolygonBarriers)
    if (!js.isUndefined(returnPolylineBarriers)) __obj.updateDynamic("returnPolylineBarriers")(returnPolylineBarriers)
    if (!js.isUndefined(returnRoutes)) __obj.updateDynamic("returnRoutes")(returnRoutes)
    if (!js.isUndefined(returnStops)) __obj.updateDynamic("returnStops")(returnStops)
    if (!js.isUndefined(returnZ)) __obj.updateDynamic("returnZ")(returnZ)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (!js.isUndefined(startTimeIsUTC)) __obj.updateDynamic("startTimeIsUTC")(startTimeIsUTC)
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (travelMode != null) __obj.updateDynamic("travelMode")(travelMode)
    if (!js.isUndefined(useHierarchy)) __obj.updateDynamic("useHierarchy")(useHierarchy)
    if (!js.isUndefined(useTimeWindows)) __obj.updateDynamic("useTimeWindows")(useTimeWindows)
    __obj.asInstanceOf[RouteParametersProperties]
  }
}

