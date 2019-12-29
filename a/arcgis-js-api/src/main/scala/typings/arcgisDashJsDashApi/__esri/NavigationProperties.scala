package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProperties extends js.Object {
  /**
    * Indicates if single finger touch [drag](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#event-drag) events are enabled or disabled. When `false`, the map cannot be panned with single finger touch gesture on touch devices. This will allow web pages to scroll down without panning the map on touch devices. While single touch panning and zooming is disabled, the map can still be panned, zoomed, and rotated (if unconstrained) with _two_ fingers. This property does not affect mouse-based dragging.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#browserTouchPanEnabled)
    *
    * @default true
    */
  var browserTouchPanEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Gamepad navigation specific configuration settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#gamepad)
    */
  var gamepad: js.UndefOr[gamepadGamepadSettingsProperties] = js.undefined
  /**
    * When `true`, the view will temporarily continue to pan after the pointer (e.g. mouse, stylus, finger) has lifted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#momentumEnabled)
    *
    * @default true
    */
  var momentumEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the view can be zoomed in or out with the mouse wheel. When a map occupies part the screen, page navigation may be difficult at times since mouse wheel movement over the map can be interpreted as map zooming rather than page scrolling. In some cases, setting `mouseWheelZoomEnabled` to `false` can make scrollable webpages with maps easier to navigate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#mouseWheelZoomEnabled)
    *
    * @default true
    */
  var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.undefined
}

object NavigationProperties {
  @scala.inline
  def apply(
    browserTouchPanEnabled: js.UndefOr[Boolean] = js.undefined,
    gamepad: gamepadGamepadSettingsProperties = null,
    momentumEnabled: js.UndefOr[Boolean] = js.undefined,
    mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.undefined
  ): NavigationProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browserTouchPanEnabled)) __obj.updateDynamic("browserTouchPanEnabled")(browserTouchPanEnabled.asInstanceOf[js.Any])
    if (gamepad != null) __obj.updateDynamic("gamepad")(gamepad.asInstanceOf[js.Any])
    if (!js.isUndefined(momentumEnabled)) __obj.updateDynamic("momentumEnabled")(momentumEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoomEnabled)) __obj.updateDynamic("mouseWheelZoomEnabled")(mouseWheelZoomEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProperties]
  }
}

