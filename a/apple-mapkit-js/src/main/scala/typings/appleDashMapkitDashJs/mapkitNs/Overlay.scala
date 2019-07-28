package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay
  extends OverlayOptions
     with _ItemType {
  var map: Map = js.native
  var style: Style = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
}

