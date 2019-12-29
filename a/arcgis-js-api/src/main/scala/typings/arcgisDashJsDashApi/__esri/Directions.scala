package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directions
  extends Widget
     with GoTo {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * The most recent route result. Returns an object containing properties for any barriers used when generating the route, messages that may arise when solving the route, and finally an array of returned [RouteResults](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    *
    * @default null
    */
  val lastRoute: DirectionsLastRoute = js.native
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#maxStops)
    *
    * @default 50
    */
  var maxStops: Double = js.native
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeServiceUrl)
    *
    * @default "https://route.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World"
    */
  var routeServiceUrl: String = js.native
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeSymbol)
    */
  var routeSymbol: SimpleLineSymbol = js.native
  /**
    * Controls the default properties used when [searching](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html). Note that the default `searchProperties` differ slightly from the [Search widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#searchProperties)
    *
    * @default null
    */
  var searchProperties: DirectionsSearchProperties = js.native
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var stopSymbols: DirectionsStopSymbols = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DirectionsViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#viewModel)
    */
  var viewModel: DirectionsViewModel = js.native
  /**
    * Calculate the route to the input locations and display the list of directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#getDirections)
    *
    *
    */
  def getDirections(): js.Promise[RouteResult] = js.native
  /**
    * Zoom so that the full route is displayed within the current map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#zoomToRoute)
    *
    *
    */
  def zoomToRoute(): Unit = js.native
}

@JSGlobal("__esri.Directions")
@js.native
object Directions extends TopLevel[DirectionsConstructor]

