package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`allow-backtrack`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`at-dead-ends-and-intersections`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`at-dead-ends-only`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`complete-no-events`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`decimal-degrees`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`instructions-only`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`no-backtrack`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`summary-only`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`true-shape-with-measure`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`true-shape`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.complete
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.millimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.points
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.standard
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.straight
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteParameters
  extends Accessor
     with JSONSupport {
  /**
    * The list of network attribute names to be accumulated with the analysis. For example, which attributes should be returned as part of the response. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. See also [Understanding the network attribute](http://resources.arcgis.com/en/help/main/10.2/index.html#//00470000000m000000).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.Array[String] = js.native
  /**
    * Each element in the array is an object that describes the parameter values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.Array[AttributeParamValue] = js.native
  /**
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1 an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#barriers)
    */
  var barriers: DataLayer | FeatureSet = js.native
  /**
    * The language used when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). By default, NAServer gets installed with `en_US` only - it is up to the server administrator to add additional languages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLanguage)
    */
  var directionsLanguage: String = js.native
  /**
    * The length units to use when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: centimeters | `decimal-degrees` | decimeters | feet | inches | kilometers | meters | miles | millimeters | `nautical-miles` | points | yards = js.native
  /**
    * Defines the amount of direction information returned.  **Possible Values:** complete | complete-no-events | instructions-only | standard | summary-only
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType)
    */
  var directionsOutputType: complete | `complete-no-events` | `instructions-only` | standard | `summary-only` = js.native
  /**
    * The style to be used when returning directions. The default will be as defined in the network layer. View the REST layer description for your network service to see a list of supported styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsStyleName)
    */
  var directionsStyleName: String = js.native
  /**
    * The name of network attribute to use for the drive time when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: String = js.native
  /**
    * If `true`, avoids network elements restricted by barriers or restrictions specified in [restrictionAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: Boolean = js.native
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
  var findBestSequence: Boolean = js.native
  /**
    * In routes where a stop is not located on a network or a stop could not be reached, the results will differ depending on the value of this property:
    *   * When `false`, the solve operation will fail if at least one of the stops specified cannot be located or reached.
    *   * When `true`, as long as there are at least two valid stops that have been connected by a route, a valid result is returned. If multiple routes are processed in a single request, as long as least one route is built, a valid result is returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#ignoreInvalidLocations)
    */
  var ignoreInvalidLocations: Boolean = js.native
  /**
    * The network attribute name to be used as the impedance attribute in the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty array, it will default to the default of the service.  For example, set `impedanceAttribute = "Time"` for the quickest route and `impedanceAttribute = "Length"` for shortest drive, assuming the service has those two esriNAUTCost attributes.  For more information, see [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: String = js.native
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results. If not specified, the geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference | String = js.native
  /**
    * The precision of the output geometry after generalization. If `0`, no generalization of output geometry is performed. If present and positive, it represents the `MaximumAllowableOffset` parameter and generalization is performed according to `IPolycurve.Generalize`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: Double = js.native
  /**
    * The units of the output geometry precision.  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: centimeters | `decimal-degrees` | decimeters | feet | inches | kilometers | meters | miles | millimeters | `nautical-miles` | points | yards = js.native
  /**
    * The type of output lines to be generated in the result. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * Possible Value | Description
    * ---------------|------------
    * none | No lines are returned
    * straight | Only returns straight lines
    * true-shape | Return the true shape of the lines
    * true-shape-with-measure | Return the true shape of the lines with their measurements
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outputLines)
    */
  var outputLines: none | straight | `true-shape` | `true-shape-with-measure` = js.native
  /**
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1 an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#pointBarriers)
    */
  var pointBarriers: DataLayer | FeatureSet = js.native
  /**
    * The set of polygon barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the `features` or `url` property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polygonBarriers)
    */
  var polygonBarriers: DataLayer | FeatureSet = js.native
  /**
    * The set of polyline barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the `features` or `url` property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polylineBarriers)
    */
  var polylineBarriers: DataLayer | FeatureSet = js.native
  /**
    * If `true`, keeps the first stop fixed in the sequence even when `findBestSequence = true`. Only applicable if `findBestSequence = true`. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveFirstStop)
    */
  var preserveFirstStop: Boolean = js.native
  /**
    * If `true`, keeps the last stop fixed in the sequence even when `findBestSequence = true`. Only applicable if `findBestSequence = true`. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveLastStop)
    */
  var preserveLastStop: Boolean = js.native
  /**
    * Specifies how U-Turns should be handled. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).  **Possible Values:**  allow-backtrack | at-dead-ends-only | no-backtrack | at-dead-ends-and-intersections
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictUTurns)
    */
  var restrictUTurns: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections` = js.native
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). Possible values are listed in the Service Directory under `Network Dataset -> Network Attributes`. You can also specify a value of `none` to indicate that no network attributes should be used as restrictions. If you specify an empty array, it will default to the default of the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.Array[String] = js.native
  /**
    * If `true`, barriers are returned with the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnBarriers)
    *
    * @default false
    */
  var returnBarriers: Boolean = js.native
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnDirections)
    *
    * @default false
    */
  var returnDirections: Boolean = js.native
  /**
    * If `true`, polygon barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: Boolean = js.native
  /**
    * If `true`, polyline barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: Boolean = js.native
  /**
    * If `true`, routes are generated and returned in the route property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnRoutes)
    */
  var returnRoutes: Boolean = js.native
  /**
    * If `true`, stops are returned in the stops property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnStops)
    */
  var returnStops: Boolean = js.native
  /**
    * If `true`, `z` values are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnZ)
    */
  var returnZ: Boolean = js.native
  /**
    * The time the route begins. If not specified, the default is the time specified in the route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTime)
    */
  var startTime: Date = js.native
  /**
    * If `true`, the start time will be in UTC format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTimeIsUTC)
    */
  var startTimeIsUTC: Boolean = js.native
  /**
    * The set of stops loaded as network locations during analysis. When `stops` takes a FeatureSet, each feature in the FeatureSet must have a defined spatial reference. If the feature contains `x` and `y` attributes, those values are used for the stop, even if the feature includes geometry.  At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The `url` property can be specified using DataFile Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops)
    */
  var stops: DataLayer | FeatureSet = js.native
  /**
    * Travel modes define how a pedestrian, car, truck or other medium of transportation moves through the street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#travelMode)
    */
  var travelMode: String = js.native
  /**
    * If `true`, the hierarchy attribute for the network should be used in analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useHierarchy)
    *
    * @default false
    */
  var useHierarchy: Boolean = js.native
  /**
    * A useful feature of the [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) is the ability to constrain stop visits to certain times of day, or "time windows". If you were required to deliver orders to four homes and each customer was available during a limited time period during the day, the route task could help you find the most efficient path for making all the deliveries.  Time windows are treated as a "soft" constraint. This means that although the solver attempts to honor time windows, if necessary, it will violate the time windows of some stops in order to reach them. Remember, the stops will be visited in the order they were added unless you set `RouteParameters.findBestSequence = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useTimeWindows)
    *
    * @default false
    */
  var useTimeWindows: Boolean = js.native
}

@JSGlobal("__esri.RouteParameters")
@js.native
class RouteParametersCls () extends RouteParameters {
  def this(properties: RouteParametersProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

