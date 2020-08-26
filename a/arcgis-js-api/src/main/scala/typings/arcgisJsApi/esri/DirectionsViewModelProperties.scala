package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsViewModelProperties extends GoToProperties {
  /**
    * The network attribute name to be used as the impedance attribute in the analysis. The default is as defined in the specific routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset -> Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty array, it will default to the default of the service.  For example, set `impedanceAttribute = "Time"` for the quickest route and `impedanceAttribute = "Length"` for shortest drive, assuming the service has those two esriNAUTCost attributes.  For more information, see [Understanding the network attribute](http://resources.arcgis.com/en/help/main/10.2/index.html#//00470000000m000000).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#impedanceAttribute)
    */
  var impedanceAttribute: js.UndefOr[String] = js.native
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#maxStops)
    *
    * @default 50
    */
  var maxStops: js.UndefOr[Double] = js.native
  /**
    * Route Parameters object used to call the service. Please refer to the [RouteParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html) documentation for the list of available settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeParameters)
    */
  var routeParameters: js.UndefOr[RouteParametersProperties] = js.native
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeServiceUrl)
    *
    * @default "https://route.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World"
    */
  var routeServiceUrl: js.UndefOr[String] = js.native
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeSymbol)
    */
  var routeSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.native
  /**
    * The selected travel mode. More information can be found in the [ArcGIS Online documentation](https://doc.arcgis.com/en/arcgis-online/reference/travel-modes.htm#GUID-96DF7F50-E0B2-4BF3-8271-EB515D3F0107).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    *
    * @default null | 'Driving Time'
    */
  var selectedTravelMode: js.UndefOr[DirectionsViewModelSelectedTravelMode] = js.native
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var stopSymbols: js.UndefOr[DirectionsViewModelStopSymbols] = js.native
  /**
    * An array of graphics that define the stop locations along the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stops)
    */
  var stops: js.UndefOr[CollectionProperties[GraphicProperties]] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object DirectionsViewModelProperties {
  @scala.inline
  def apply(): DirectionsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsViewModelProperties]
  }
  @scala.inline
  implicit class DirectionsViewModelPropertiesOps[Self <: DirectionsViewModelProperties] (val x: Self) extends AnyVal {
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
    def setImpedanceAttribute(value: String): Self = this.set("impedanceAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpedanceAttribute: Self = this.set("impedanceAttribute", js.undefined)
    @scala.inline
    def setMaxStops(value: Double): Self = this.set("maxStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStops: Self = this.set("maxStops", js.undefined)
    @scala.inline
    def setRouteParameters(value: RouteParametersProperties): Self = this.set("routeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteParameters: Self = this.set("routeParameters", js.undefined)
    @scala.inline
    def setRouteServiceUrl(value: String): Self = this.set("routeServiceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteServiceUrl: Self = this.set("routeServiceUrl", js.undefined)
    @scala.inline
    def setRouteSymbol(value: SimpleLineSymbolProperties): Self = this.set("routeSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteSymbol: Self = this.set("routeSymbol", js.undefined)
    @scala.inline
    def setSelectedTravelMode(value: DirectionsViewModelSelectedTravelMode): Self = this.set("selectedTravelMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTravelMode: Self = this.set("selectedTravelMode", js.undefined)
    @scala.inline
    def setStopSymbols(value: DirectionsViewModelStopSymbols): Self = this.set("stopSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopSymbols: Self = this.set("stopSymbols", js.undefined)
    @scala.inline
    def setStopsVarargs(value: GraphicProperties*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: CollectionProperties[GraphicProperties]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

