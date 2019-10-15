package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`locate-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.locating
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocateViewModel
  extends Accessor
     with Evented
     with GeolocationPositioning
     with GoTo {
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | locating = js.native
  /**
    * This function provides the ability to interrupt and cancel the process of programmatically obtaining the location of the user's device.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#cancelLocate)
    *
    *
    */
  def cancelLocate(): Unit = js.native
  /**
    * Animates the view to the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate)
    *
    *
    */
  def locate(): IPromise[_] = js.native
  @JSName("on")
  def on_locateerror(name: `locate-error`, eventHandler: LocateViewModelLocateErrorEventHandler): IHandle = js.native
}

@JSGlobal("__esri.LocateViewModel")
@js.native
object LocateViewModel extends TopLevel[LocateViewModelConstructor]

