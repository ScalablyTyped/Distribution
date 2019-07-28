package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsViewModel
  extends Accessor
     with GoTo {
  /**
    * The network attribute name to be used as the impedance attribute in the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty array, it will default to the default of the service.  For example, set `impedanceAttribute = "Time"` for the quickest route and `impedanceAttribute = "Length"` for shortest drive, assuming the service has those two esriNAUTCost attributes.  For more information, see [Understanding the network attribute](http://resources.arcgis.com/en/help/main/10.2/index.html#//00470000000m000000).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#impedanceAttribute)
    */
  var impedanceAttribute: String = js.native
  /**
    * The most recent route result. Returns an object containing properties for any barriers used when generating the route, messages that may arise when solving the route, and finally an array of returned [RouteResults](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    *
    * @default null
    */
  val lastRoute: DirectionsViewModelLastRoute = js.native
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#maxStops)
    *
    * @default 50
    */
  var maxStops: Double = js.native
  /**
    * Route Parameters object used to call the service. Please refer to the [RouteParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html) documentation for the list of available settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeParameters)
    */
  var routeParameters: RouteParameters = js.native
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeServiceUrl)
    *
    * @default "https://route.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World"
    */
  var routeServiceUrl: String = js.native
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeSymbol)
    */
  var routeSymbol: SimpleLineSymbol = js.native
  /**
    * The selected travel mode. More information can be found in the [ArcGIS Online documentation](https://doc.arcgis.com/en/arcgis-online/reference/travel-modes.htm#GUID-96DF7F50-E0B2-4BF3-8271-EB515D3F0107).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    *
    * @default null | 'Driving Time'
    */
  var selectedTravelMode: DirectionsViewModelSelectedTravelMode = js.native
  /**
    * The Service Description object returned by the Route REST Endpoint. This object contains service specific details like available Cost attributes, supported Restrictions, default Attribute Parameter Values, Service Limits (like maximum input stop count), default Impedance Attribute, etc. This information is useful when implementing complex logistics scenarios operating with limitations or preferences on vehicle or stop properties, for example avoiding toll roads, dealing with hazardous materials, working with stop service times, etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#serviceDescription)
    *
    * @default null
    */
  val serviceDescription: js.Any = js.native
  /**
    * The current state of the view model.  **Possible Values:** disabled | ready
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var stopSymbols: DirectionsViewModelStopSymbols = js.native
  /**
    * An array of graphics that define the stop locations along the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stops)
    */
  var stops: Collection[Graphic] = js.native
  /**
    * The name of the network attribute to use for the drive time when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#timeAttribute)
    */
  var timeAttribute: DirectionsViewModelTimeAttribute = js.native
  /**
    * Array of objects containing properties specific to either an ArcGIS service or organization's travel modes. More information can be found in the [ArcGIS Online documentation](https://doc.arcgis.com/en/arcgis-online/reference/travel-modes.htm#GUID-96DF7F50-E0B2-4BF3-8271-EB515D3F0107).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#travelModes)
    */
  val travelModes: js.Array[TravelMode] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Centers the map at the specified maneuver or stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#centerAt)
    *
    * @param stopOrManeuver The stop or maneuver where the map should be centered.
    *
    */
  def centerAt(stopOrManeuver: Graphic): Unit = js.native
  /**
    * Clears any highlighted route segments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#clearHighlights)
    *
    *
    */
  def clearHighlights(): Unit = js.native
  /**
    * Removes the route directions from the directions list, leaving the inputs untouched. The route and locations persist on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#clearResults)
    *
    *
    */
  def clearResults(): Unit = js.native
  /**
    * Returns cost attribute name specific to a particular route service. This can be used as a [travel mode impedance](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#getCostAttribute)
    *
    * @param attributeName The attribute name specifying the cost attribute used as an impedance.
    *
    */
  def getCostAttribute(attributeName: String): String = js.native
  /**
    * Calculate the route to the input locations and display the list of directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#getDirections)
    *
    *
    */
  def getDirections(): IPromise[RouteResult] = js.native
  /**
    * Highlights the specified route segment on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#highlightSegment)
    *
    * @param maneuver The route segment to highlight.
    *
    */
  def highlightSegment(maneuver: Graphic): Unit = js.native
  /**
    * This method should be called to load the view model's routing resources.
    * > You must first call this before using `DirectionsViewModel`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#load)
    *
    *
    */
  def load(): IPromise[_] = js.native
  /**
    * Resets the state of the ViewModel, clearing off all the input stops, and results in the widget. The results persist in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#reset)
    *
    *
    */
  def reset(): Unit = js.native
  /**
    * Zoom so that the full route is displayed within the current map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#zoomToRoute)
    *
    *
    */
  def zoomToRoute(): Unit = js.native
}

@JSGlobal("__esri.DirectionsViewModel")
@js.native
class DirectionsViewModelCls () extends DirectionsViewModel {
  def this(properties: DirectionsViewModelProperties) = this()
}

