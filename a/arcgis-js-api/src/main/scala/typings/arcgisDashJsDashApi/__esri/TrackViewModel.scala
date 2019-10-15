package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`track-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.track
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.waiting
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
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.tracking | waiting = js.native
  /**
    * Indicates whether new positions are being watched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#tracking)
    *
    * @default false
    */
  val tracking: Boolean = js.native
  @JSName("on")
  def on_track(name: track, eventHandler: TrackViewModelTrackEventHandler): IHandle = js.native
  @JSName("on")
  def on_trackerror(name: `track-error`, eventHandler: TrackViewModelTrackErrorEventHandler): IHandle = js.native
  /**
    * When executed, [tracking](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#tracking) starts at the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#start)
    *
    *
    */
  def start(): Unit = js.native
  /**
    * Stops tracking the user's location when executed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#stop)
    *
    *
    */
  def stop(): Unit = js.native
}

@JSGlobal("__esri.TrackViewModel")
@js.native
object TrackViewModel extends TopLevel[TrackViewModelConstructor]

