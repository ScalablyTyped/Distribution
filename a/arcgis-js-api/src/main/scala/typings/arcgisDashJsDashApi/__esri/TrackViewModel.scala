package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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
  val state: String = js.native
  /**
    * Indicates whether new positions are being watched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#tracking)
    *
    * @default false
    */
  val tracking: Boolean = js.native
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

