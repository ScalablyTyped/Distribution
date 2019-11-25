package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * The HTML5 Geolocation Position options for locating. Refer to [Geolocation API Specification](http://www.w3.org/TR/geolocation-API/#position-options) for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#geolocationOptions)
    *
    * @default { maximumAge: 0, timeout: 15000, enableHighAccuracy: true }
    */
  var geolocationOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * Indicates whether the widget should navigate the view to the position and scale of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#goToLocationEnabled)
    *
    * @default true
    */
  var goToLocationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * Indicates the scale to set on the view when navigating to the position of the geolocated result once a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#event-track) event. If a scale value is not explicitly set, then the view will navigate to a default scale of `2500`. For 2D views the value should be within the [effectiveMinScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints) and [effectiveMaxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#scale)
    *
    * @default null
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether the widget will automatically [rotate to user's direction](https://www.w3.org/TR/geolocation-API/#coordinates_interface). Set to `false` to disable this behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#useHeadingEnabled)
    *
    * @default true
    */
  var useHeadingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [LocateViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#viewModel)
    */
  var viewModel: js.UndefOr[LocateViewModelProperties] = js.undefined
}

object LocateProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    geolocationOptions: js.Any = null,
    goToLocationEnabled: js.UndefOr[Boolean] = js.undefined,
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Unit = null,
    graphic: GraphicProperties = null,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    scale: Int | Double = null,
    useHeadingEnabled: js.UndefOr[Boolean] = js.undefined,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: LocateViewModelProperties = null
  ): LocateProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (geolocationOptions != null) __obj.updateDynamic("geolocationOptions")(geolocationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(goToLocationEnabled)) __obj.updateDynamic("goToLocationEnabled")(goToLocationEnabled.asInstanceOf[js.Any])
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2(goToOverride))
    if (graphic != null) __obj.updateDynamic("graphic")(graphic.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(useHeadingEnabled)) __obj.updateDynamic("useHeadingEnabled")(useHeadingEnabled.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateProperties]
  }
}

