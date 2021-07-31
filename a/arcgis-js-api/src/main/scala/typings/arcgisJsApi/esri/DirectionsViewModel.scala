package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsViewModel
  extends StObject
     with Accessor
     with GoTo {
  
  /**
    * Centers the map at the specified maneuver or stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#centerAt)
    */
  def centerAt(stopOrManeuver: Graphic): Unit = js.native
  
  /**
    * Clears any highlighted route segments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#clearHighlights)
    */
  def clearHighlights(): Unit = js.native
  
  /**
    * Removes the route directions from the directions list, leaving the inputs untouched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#clearResults)
    */
  def clearResults(): Unit = js.native
  
  /**
    * Returns cost attribute name specific to a particular route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#getCostAttribute)
    */
  def getCostAttribute(attributeName: String): String = js.native
  
  /**
    * Calculate the route to the input locations and display the list of directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#getDirections)
    */
  def getDirections(): js.Promise[RouteResult] = js.native
  
  /**
    * Highlights the specified route segment on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#highlightSegment)
    */
  def highlightSegment(maneuver: Graphic): Unit = js.native
  
  /**
    * The network attribute name to be used as the impedance attribute in the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#impedanceAttribute)
    */
  var impedanceAttribute: String = js.native
  
  /**
    * The most recent route result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  val lastRoute: DirectionsViewModelLastRoute = js.native
  
  /**
    * This method should be called to load the view model's routing resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#load)
    */
  def load(): js.Promise[js.Any] = js.native
  
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#maxStops)
    */
  var maxStops: Double = js.native
  
  /**
    * Resets the state of the ViewModel, clearing all the input stops and results in the widget and in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#reset)
    */
  def reset(): Unit = js.native
  
  /**
    * Route Parameters object used to call the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeParameters)
    */
  var routeParameters: RouteParameters = js.native
  
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeServiceUrl)
    */
  var routeServiceUrl: String = js.native
  
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeSymbol)
    */
  var routeSymbol: SimpleLineSymbol = js.native
  
  /**
    * The selected travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  var selectedTravelMode: DirectionsViewModelSelectedTravelMode = js.native
  
  /**
    * The Service Description object returned by the Route REST Endpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#serviceDescription)
    */
  val serviceDescription: js.Any = js.native
  
  /**
    * The current state of the view model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#state)
    */
  val state: disabled | ready = js.native
  
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
  val timeAttribute: DirectionsViewModelTimeAttribute = js.native
  
  /**
    * Array of objects containing properties specific to either an ArcGIS service or organization's travel modes.
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
    * Zoom so that the full route is displayed within the current map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#zoomToRoute)
    */
  def zoomToRoute(): Unit = js.native
}
