package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigation extends Accessor {
  /**
    * Indicates if single finger touch [drag](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#event-drag) events are enabled or disabled. When `false`, the map cannot be panned with single finger touch gesture on touch devices. This will allow web pages to scroll down without panning the map on touch devices. While single touch panning and zooming is disabled, the map can still be panned, zoomed, and rotated (if unconstrained) with _two_ fingers. This property does not affect mouse-based dragging.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#browserTouchPanEnabled)
    *
    * @default true
    */
  var browserTouchPanEnabled: Boolean = js.native
  /**
    * Gamepad navigation specific configuration settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#gamepad)
    */
  var gamepad: gamepadGamepadSettings = js.native
  /**
    * When `true`, the view will temporarily continue to pan after the pointer (e.g. mouse, stylus, finger) has lifted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#momentumEnabled)
    *
    * @default true
    */
  var momentumEnabled: Boolean = js.native
  /**
    * Indicates whether the view can be zoomed in or out with the mouse wheel. When a map occupies part the screen, page navigation may be difficult at times since mouse wheel movement over the map can be interpreted as map zooming rather than page scrolling. In some cases, setting `mouseWheelZoomEnabled` to `false` can make scrollable webpages with maps easier to navigate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html#mouseWheelZoomEnabled)
    *
    * @default true
    */
  var mouseWheelZoomEnabled: Boolean = js.native
}

