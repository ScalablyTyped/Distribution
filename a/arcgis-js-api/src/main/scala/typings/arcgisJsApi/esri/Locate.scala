package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`locate-error`
import typings.arcgisJsApi.arcgisJsApiStrings.locate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locate
  extends Widget_
     with GoTo {
  /**
    * The HTML5 Geolocation Position options for locating. Refer to [Geolocation API Specification](http://www.w3.org/TR/geolocation-API/#position-options) for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#geolocationOptions)
    *
    * @default { maximumAge: 0, timeout: 15000, enableHighAccuracy: true }
    */
  var geolocationOptions: js.Any = js.native
  /**
    * Indicates whether the widget should navigate the view to the position and scale of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#goToLocationEnabled)
    *
    * @default true
    */
  var goToLocationEnabled: Boolean = js.native
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#graphic)
    */
  var graphic: Graphic = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * Indicates the scale to set on the view when navigating to the position of the geolocated result once a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#event-track) event. If a scale value is not explicitly set, then the view will navigate to a default scale of `2500`. For 2D views the value should be within the [effectiveMinScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints) and [effectiveMaxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#scale)
    *
    * @default null
    */
  var scale: Double = js.native
  /**
    * Indicates whether the widget will automatically [rotate to user's direction](https://www.w3.org/TR/geolocation-API/#coordinates_interface). Set to `false` to disable this behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#useHeadingEnabled)
    *
    * @default true
    */
  var useHeadingEnabled: Boolean = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [LocateViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#viewModel)
    */
  var viewModel: LocateViewModel = js.native
  /**
    * This function provides the ability to interrupt and cancel the process of programmatically obtaining the location of the user's device.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#cancelLocate)
    *
    *
    */
  def cancelLocate(): Unit = js.native
  /**
    * Animates the view to the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#locate)
    *
    *
    */
  def locate(): js.Promise[_] = js.native
  @JSName("on")
  def on_locate(name: locate, eventHandler: LocateLocateEventHandler): IHandle = js.native
  @JSName("on")
  def on_locateerror(name: `locate-error`, eventHandler: LocateLocateErrorEventHandler): IHandle = js.native
}

@JSGlobal("__esri.Locate")
@js.native
object Locate extends TopLevel[LocateConstructor]

