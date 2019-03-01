package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
    * The current state of the widget.  **Possible Values:** disabled | ready | locating
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#state)
    *
    * @default disabled
    */
  val state: java.lang.String = js.native
  /**
    * This function provides the ability to interrupt and cancel the process of programmatically obtaining the location of the user's device.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#cancelLocate)
    *
    *
    */
  def cancelLocate(): scala.Unit = js.native
  /**
    * Animates the view to the user's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate)
    *
    *
    */
  def locate(): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

