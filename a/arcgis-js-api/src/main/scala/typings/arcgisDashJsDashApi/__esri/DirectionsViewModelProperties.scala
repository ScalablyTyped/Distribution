package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsViewModelProperties extends GoToProperties {
  /**
    * The network attribute name to be used as the impedance attribute in the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty array, it will default to the default of the service.  For example, set `impedanceAttribute = "Time"` for the quickest route and `impedanceAttribute = "Length"` for shortest drive, assuming the service has those two esriNAUTCost attributes.  For more information, see [Understanding the network attribute](http://resources.arcgis.com/en/help/main/10.2/index.html#//00470000000m000000).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#maxStops)
    *
    * @default 50
    */
  var maxStops: js.UndefOr[Double] = js.undefined
  /**
    * Route Parameters object used to call the service. Please refer to the [RouteParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html) documentation for the list of available settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeParameters)
    */
  var routeParameters: js.UndefOr[RouteParametersProperties] = js.undefined
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeServiceUrl)
    *
    * @default "https://route.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World"
    */
  var routeServiceUrl: js.UndefOr[String] = js.undefined
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeSymbol)
    */
  var routeSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  /**
    * The selected travel mode. More information can be found in the [ArcGIS Online documentation](https://doc.arcgis.com/en/arcgis-online/reference/travel-modes.htm#GUID-96DF7F50-E0B2-4BF3-8271-EB515D3F0107).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    *
    * @default null | 'Driving Time'
    */
  var selectedTravelMode: js.UndefOr[DirectionsViewModelSelectedTravelMode] = js.undefined
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var stopSymbols: js.UndefOr[DirectionsViewModelStopSymbols] = js.undefined
  /**
    * An array of graphics that define the stop locations along the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stops)
    */
  var stops: js.UndefOr[CollectionProperties[GraphicProperties]] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object DirectionsViewModelProperties {
  @scala.inline
  def apply(
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Unit = null,
    impedanceAttribute: String = null,
    maxStops: Int | Double = null,
    routeParameters: RouteParametersProperties = null,
    routeServiceUrl: String = null,
    routeSymbol: SimpleLineSymbolProperties = null,
    selectedTravelMode: DirectionsViewModelSelectedTravelMode = null,
    stopSymbols: DirectionsViewModelStopSymbols = null,
    stops: CollectionProperties[GraphicProperties] = null,
    view: MapViewProperties | SceneViewProperties = null
  ): DirectionsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2(goToOverride))
    if (impedanceAttribute != null) __obj.updateDynamic("impedanceAttribute")(impedanceAttribute.asInstanceOf[js.Any])
    if (maxStops != null) __obj.updateDynamic("maxStops")(maxStops.asInstanceOf[js.Any])
    if (routeParameters != null) __obj.updateDynamic("routeParameters")(routeParameters.asInstanceOf[js.Any])
    if (routeServiceUrl != null) __obj.updateDynamic("routeServiceUrl")(routeServiceUrl.asInstanceOf[js.Any])
    if (routeSymbol != null) __obj.updateDynamic("routeSymbol")(routeSymbol.asInstanceOf[js.Any])
    if (selectedTravelMode != null) __obj.updateDynamic("selectedTravelMode")(selectedTravelMode.asInstanceOf[js.Any])
    if (stopSymbols != null) __obj.updateDynamic("stopSymbols")(stopSymbols.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelProperties]
  }
}

