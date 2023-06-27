package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`locate-error`
import typings.arcgisJsApi.arcgisJsApiStrings.locate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locate
  extends StObject
     with Widget_
     with GoTo {
  
  /**
  		 * This function provides the ability to interrupt and cancel the process of programmatically obtaining the location of the user's device.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#cancelLocate)
  		 */
  def cancelLocate(): scala.Unit = js.native
  
  /**
  		 * The browser's Geolocation API Position options for locating.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#geolocationOptions)
  		 */
  var geolocationOptions: Any = js.native
  
  /**
  		 * Indicates whether the widget should navigate the view to the position and scale of the geolocated result.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#goToLocationEnabled)
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
  		 * Animates the view to the user's location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#locate)
  		 */
  def locate(): js.Promise[Any] = js.native
  
  @JSName("on")
  def on_locate(name: locate, eventHandler: LocateLocateEventHandler): IHandle = js.native
  @JSName("on")
  def on_locateerror(name: `locate-error`, eventHandler: LocateLocateErrorEventHandler): IHandle = js.native
  
  /**
  		 * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) of the result graphic from the [locate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate) method.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#popupEnabled)
  		 */
  var popupEnabled: Boolean = js.native
  
  /**
  		 * Indicates whether the widget will automatically rotate to the device heading based on the Geolocation APIs [`GeolocationCoordinates.heading`](https://developer.mozilla.org/en-US/docs/Web/API/GeolocationCoordinates/heading) property.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#rotationEnabled)
  		 */
  var rotationEnabled: Boolean = js.native
  
  /**
  		 * Indicates the scale to set on the view when navigating to the position of the geolocated result once a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#event-track) event.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#scale)
  		 */
  var scale: Double = js.native
  
  /**
  		 * Indicates whether the widget will automatically [rotate to user's direction](https://www.w3.org/TR/geolocation-API/#coordinates_interface).
  		 *
  		 * @default true
  		 * @deprecated since 4.27. Use `rotationEnabled` instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#useHeadingEnabled)
  		 */
  var useHeadingEnabled: Boolean = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#viewModel)
  		 */
  var viewModel: LocateViewModel = js.native
}
