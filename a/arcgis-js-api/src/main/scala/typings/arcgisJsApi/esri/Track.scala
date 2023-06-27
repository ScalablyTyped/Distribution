package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`track-error`
import typings.arcgisJsApi.arcgisJsApiStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Track
  extends StObject
     with Widget_
     with GoTo {
  
  /**
  		 * An object used for setting optional position parameters.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#geolocationOptions)
  		 */
  var geolocationOptions: Any = js.native
  
  /**
  		 * Indicates whether the widget will automatically navigate the view to the user's position when a geolocation result is found.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#goToLocationEnabled)
  		 */
  var goToLocationEnabled: Boolean = js.native
  
  /**
  		 * The graphic used to show the user's location on the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#graphic)
  		 */
  var graphic: Graphic = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  @JSName("on")
  def on_track(name: track, eventHandler: TrackTrackEventHandler): IHandle = js.native
  @JSName("on")
  def on_trackerror(name: `track-error`, eventHandler: TrackTrackErrorEventHandler): IHandle = js.native
  
  /**
  		 * Indicates whether the widget will automatically rotate to the device heading based on the Geolocation APIs [`GeolocationCoordinates.heading`](https://developer.mozilla.org/en-US/docs/Web/API/GeolocationCoordinates/heading) property.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#rotationEnabled)
  		 */
  var rotationEnabled: Boolean = js.native
  
  /**
  		 * Indicates the [scale](https://developers.arcgis.com/documentation/mapping-apis-and-services/reference/zoom-levels-and-scale/) to set on the view when navigating to the position of the geolocated result, after a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#event-track) event.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#scale)
  		 */
  var scale: Double = js.native
  
  /**
  		 * When executed, the widget will start [tracking](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#tracking) the user's location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#start)
  		 */
  def start(): scala.Unit = js.native
  
  /**
  		 * Stops tracking the user's location when executed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#stop)
  		 */
  def stop(): scala.Unit = js.native
  
  /**
  		 * Indicates whether the widget is watching for new positions.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#tracking)
  		 */
  val tracking: Boolean = js.native
  
  /**
  		 * Indicates whether the widget will automatically rotate to the device heading based on the Geolocation APIs [`GeolocationCoordinates.heading`](https://developer.mozilla.org/en-US/docs/Web/API/GeolocationCoordinates/heading) property.
  		 *
  		 * @default true
  		 * @deprecated since 4.27. Use `rotationEnabled` instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#useHeadingEnabled)
  		 */
  var useHeadingEnabled: Boolean = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The viewModel for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#viewModel)
  		 */
  var viewModel: TrackViewModel = js.native
}
