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
import scala.scalajs.js.annotation._

@js.native
trait RouteParametersProperties extends js.Object {
  /**
    * The list of network attribute names to be accumulated with the analysis. For example, which attributes should be returned as part of the response. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. See also [Understanding the network attribute](http://resources.arcgis.com/en/help/main/10.2/index.html#//00470000000m000000).
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
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1 an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#barriers)
    */
  var barriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The language used when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). By default, NAServer gets installed with `en_US` only - it is up to the server administrator to add additional languages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLanguage)
    */
  var directionsLanguage: js.UndefOr[String] = js.native
  /**
    * The length units to use when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | yards
  ] = js.native
  /**
    * Defines the amount of direction information returned.  See the [directionsOutputType descriptions](https://developers.arcgis.com/rest/network/api-reference/route-synchronous-service.htm#GUID-AC59C317-CB41-4E1B-A660-1A31C9EB2E44) for more information about what each property value means.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType)
    */
  var directionsOutputType: js.UndefOr[
    complete | `complete-no-events` | `instructions-only` | standard | `summary-only`
  ] = js.native
  /**
    * The style to be used when returning directions. The default will be as defined in the network layer. View the REST layer description for your network service to see a list of supported styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsStyleName)
    */
  var directionsStyleName: js.UndefOr[String] = js.native
  /**
    * The name of network attribute to use for the drive time when computing directions. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: js.UndefOr[String] = js.native
  /**
    * If `true`, avoids network elements restricted by barriers or restrictions specified in [restrictionAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#doNotLocateOnRestrictedElements)
    *
    * @default true
    */
  var doNotLocateOnRestrictedElements: js.UndefOr[Boolean] = js.native
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
  var findBestSequence: js.UndefOr[Boolean] = js.native
  /**
    * In routes where a stop is not located on a network or a stop could not be reached, the results will differ depending on the value of this property:
    *   * When `false`, the solve operation will fail if at least one of the stops specified cannot be located or reached.
    *   * When `true`, as long as there are at least two valid stops that have been connected by a route, a valid result is returned. If multiple routes are processed in a single request, as long as least one route is built, a valid result is returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#ignoreInvalidLocations)
    */
  var ignoreInvalidLocations: js.UndefOr[Boolean] = js.native
  /**
    * The network attribute name to be used as the impedance attribute in the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty array, it will default to the default of the service.  For example, set `impedanceAttribute = "Time"` for the quickest route and `impedanceAttribute = "Length"` for shortest drive, assuming the service has those two esriNAUTCost attributes.  For more information, see [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  /**
    * The well-known ID of the spatial reference for the geometries returned with the analysis results. If not specified, the geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties | String] = js.native
  /**
    * The precision of the output geometry after generalization. If `0`, no generalization of output geometry is performed. If present and positive, it represents the `MaximumAllowableOffset` parameter and generalization is performed according to `IPolycurve.Generalize`.
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
  var outputLines: js.UndefOr[none | straight | `true-shape` | `true-shape-with-measure`] = js.native
  /**
    * The set of point barriers loaded as network locations during analysis. At ArcGIS Server 10.1 an optional url property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The set of polygon barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the `features` or `url` property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * The set of polyline barriers loaded as network locations during analysis. At ArcGIS Server 10.1, an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Note that either the `features` or `url` property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * If `true`, keeps the first stop fixed in the sequence even when `findBestSequence = true`. Only applicable if `findBestSequence = true`. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveFirstStop)
    */
  var preserveFirstStop: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, keeps the last stop fixed in the sequence even when `findBestSequence = true`. Only applicable if `findBestSequence = true`. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#preserveLastStop)
    */
  var preserveLastStop: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how U-Turns should be handled. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictUTurns)
    */
  var restrictUTurns: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.native
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). Possible values are listed in the Service Directory under `Network Dataset -> Network Attributes`. You can also specify a value of `none` to indicate that no network attributes should be used as restrictions. If you specify an empty array, it will default to the default of the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * If `true`, barriers are returned with the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnBarriers)
    *
    * @default false
    */
  var returnBarriers: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnDirections)
    *
    * @default false
    */
  var returnDirections: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polygon barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, polyline barriers are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, routes are generated and returned in the route property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnRoutes)
    *
    * @default true
    */
  var returnRoutes: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, stops are returned in the stops property of each [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnStops)
    *
    * @default false
    */
  var returnStops: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, `z` values are returned in the [RouteResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#returnZ)
    *
    * @default true
    */
  var returnZ: js.UndefOr[Boolean] = js.native
  /**
    * The time the route begins. If not specified, the default is the time specified in the route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTime)
    */
  var startTime: js.UndefOr[DateProperties] = js.native
  /**
    * If `true`, the start time will be in UTC format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#startTimeIsUTC)
    *
    * @default true
    */
  var startTimeIsUTC: js.UndefOr[Boolean] = js.native
  /**
    * The set of stops loaded as network locations during analysis. When `stops` takes a FeatureSet, each feature in the FeatureSet must have a defined spatial reference. If the feature contains `x` and `y` attributes, those values are used for the stop, even if the feature includes geometry.  At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The `url` property can be specified using DataFile Note that either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops)
    */
  var stops: js.UndefOr[DataLayerProperties | FeatureSetProperties] = js.native
  /**
    * A travel mode represents a means of transportation, such as driving or walking. Travel modes define the physical characteristics of a vehicle or pedestrian.  The value for the `travelMode` parameter is the JSON object containing the settings for a travel mode supported by your service. To get the supported travel modes, execute the `retrieveTravelModes` operation. You can make a request to retrieve travel modes using the following form: `https://route.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World/retrieveTravelModes?f=json`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#travelMode)
    */
  var travelMode: js.UndefOr[js.Any] = js.native
  /**
    * If `true`, the hierarchy attribute for the network should be used in analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useHierarchy)
    *
    * @default false
    */
  var useHierarchy: js.UndefOr[Boolean] = js.native
  /**
    * A useful feature of the [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) is the ability to constrain stop visits to certain times of day, or "time windows". If you were required to deliver orders to four homes and each customer was available during a limited time period during the day, the route task could help you find the most efficient path for making all the deliveries.  Time windows are treated as a "soft" constraint. This means that although the solver attempts to honor time windows, if necessary, it will violate the time windows of some stops in order to reach them. Remember, the stops will be visited in the order they were added unless you set `RouteParameters.findBestSequence = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#useTimeWindows)
    *
    * @default false
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

