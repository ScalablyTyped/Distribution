package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#maxStops)
    *
    * @default 50
    */
  var maxStops: js.UndefOr[Double] = js.undefined
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeServiceUrl)
    *
    * @default "https://route.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World"
    */
  var routeServiceUrl: js.UndefOr[String] = js.undefined
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeSymbol)
    */
  var routeSymbol: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  /**
    * Controls the default properties used when [searching](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html). Note that the default `searchProperties` differ slightly from the [Search widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#searchProperties)
    *
    * @default null
    */
  var searchProperties: js.UndefOr[DirectionsSearchProperties] = js.undefined
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var stopSymbols: js.UndefOr[DirectionsStopSymbols] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DirectionsViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#viewModel)
    */
  var viewModel: js.UndefOr[DirectionsViewModelProperties] = js.undefined
}

object DirectionsProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Unit = null,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    maxStops: Int | Double = null,
    routeServiceUrl: String = null,
    routeSymbol: SimpleLineSymbolProperties = null,
    searchProperties: DirectionsSearchProperties = null,
    stopSymbols: DirectionsStopSymbols = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: DirectionsViewModelProperties = null
  ): DirectionsProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2(goToOverride))
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxStops != null) __obj.updateDynamic("maxStops")(maxStops.asInstanceOf[js.Any])
    if (routeServiceUrl != null) __obj.updateDynamic("routeServiceUrl")(routeServiceUrl)
    if (routeSymbol != null) __obj.updateDynamic("routeSymbol")(routeSymbol)
    if (searchProperties != null) __obj.updateDynamic("searchProperties")(searchProperties)
    if (stopSymbols != null) __obj.updateDynamic("stopSymbols")(stopSymbols)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[DirectionsProperties]
  }
}

