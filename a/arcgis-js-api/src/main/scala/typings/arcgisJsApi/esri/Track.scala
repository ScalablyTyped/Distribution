package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`track-error`
import typings.arcgisJsApi.arcgisJsApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Track
  extends Widget_
     with GoTo {
  /**
    * The HTML5 Geolocation Position options for locating. Refer to [Geolocation API Specification](http://www.w3.org/TR/geolocation-API/#position-options) for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#geolocationOptions)
    *
    * @default { maximumAge: 0, timeout: 15000, enableHighAccuracy: true }
    */
  var geolocationOptions: js.Any = js.native
  /**
    * Indicates whether the widget will automatically navigate the view to the user's position when a geolocation result is found. Set to `false` to disable this behavior, leaving full control to the developer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#goToLocationEnabled)
    *
    * @default true
    */
  var goToLocationEnabled: Boolean = js.native
  /**
    * The graphic used to show the user's location in the view.
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
  /**
    * Indicates the scale to set on the view when navigating to the position of the geolocated result once a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#event-track) event. If a scale value is not explicitly set, then the view will navigate to a default scale of `2500`. For 2D views the value should be within the [effectiveMinScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints) and [effectiveMaxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#scale)
    *
    * @default null
    */
  var scale: Double = js.native
  /**
    * Indicates whether the widget is watching for new positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#tracking)
    *
    * @default false
    */
  val tracking: Boolean = js.native
  /**
    * Indicates whether the widget will automatically [rotate to user's direction](https://www.w3.org/TR/geolocation-API/#coordinates_interface). Set to `false` to disable this behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#useHeadingEnabled)
    *
    * @default true
    */
  var useHeadingEnabled: Boolean = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [TrackViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#viewModel)
    */
  var viewModel: TrackViewModel = js.native
  @JSName("on")
  def on_track(name: track, eventHandler: TrackTrackEventHandler): IHandle = js.native
  @JSName("on")
  def on_trackerror(name: `track-error`, eventHandler: TrackTrackErrorEventHandler): IHandle = js.native
  /**
    * When executed, the widget will start [tracking](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#tracking) the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#start)
    *
    *
    */
  def start(): Unit = js.native
  /**
    * Stops tracking the user's location when executed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#stop)
    *
    *
    */
  def stop(): Unit = js.native
}

@JSGlobal("__esri.Track")
@js.native
object Track extends TopLevel[TrackConstructor]

