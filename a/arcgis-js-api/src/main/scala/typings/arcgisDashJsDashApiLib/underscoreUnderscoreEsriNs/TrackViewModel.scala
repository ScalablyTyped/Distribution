package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackViewModel
  extends Accessor
     with Evented
     with GeolocationPositioning
     with GoTo {
  /**
    * The current state of the widget.  **Possible Values:** disabled | ready | tracking | waiting
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#state)
    *
    * @default disabled
    */
  val state: java.lang.String = js.native
  /**
    * Indicates whether new positions are being watched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#tracking)
    *
    * @default false
    */
  val tracking: scala.Boolean = js.native
  /**
    * When executed, [tracking](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#tracking) starts at the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#start)
    *
    *
    */
  def start(): scala.Unit = js.native
  /**
    * Stops tracking the user's location when executed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#stop)
    *
    *
    */
  def stop(): scala.Unit = js.native
}

@JSGlobal("__esri.TrackViewModel")
@js.native
/**
  * Provides the logic for the [Track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html) widget, which animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's location when clicked and tracks it as the location is updated.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html)
  */
class TrackViewModelCls () extends TrackViewModel {
  def this(properties: TrackViewModelProperties) = this()
  /**
    * The HTML5 Geolocation Position options for locating. Refer to [Geolocation API Specification](http://www.w3.org/TR/geolocation-API/#position-options) for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
    *
    * @default { maximumAge: 0, timeout: 15000, enableHighAccuracy: true }
    */
  /* CompleteClass */
  override var geolocationOptions: js.Any = js.native
  /**
    * Indicates whether to navigate the view to the position and scale of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#goToLocationEnabled)
    *
    * @default true
    */
  /* CompleteClass */
  override var goToLocationEnabled: scala.Boolean = js.native
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
    */
  /* CompleteClass */
  override var graphic: Graphic = js.native
  /**
    * The scale to set on the view when navigating to the position of the geolocated result. If a scale value is not explicitly set, then the view will navigate to a default scale of `2500`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#scale)
    *
    * @default null
    */
  /* CompleteClass */
  override var scale: scala.Double = js.native
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#view)
    */
  /* CompleteClass */
  override var view: MapView | SceneView = js.native
}

