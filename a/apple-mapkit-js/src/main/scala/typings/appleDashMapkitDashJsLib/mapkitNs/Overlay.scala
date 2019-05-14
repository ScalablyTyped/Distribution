package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay
  extends OverlayOptions
     with _ItemType {
  var map: Map = js.native
  var style: Style = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
}

