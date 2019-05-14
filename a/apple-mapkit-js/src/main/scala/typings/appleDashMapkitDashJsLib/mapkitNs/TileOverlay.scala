package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.TileOverlay")
@js.native
class TileOverlay protected () extends js.Object {
  def this(urlTemplate: TileCallbackFunction) = this()
  def this(urlTemplate: java.lang.String) = this()
  def this(urlTemplate: TileCallbackFunction, options: TileOverlayConstructorOptions) = this()
  def this(urlTemplate: java.lang.String, options: TileOverlayConstructorOptions) = this()
  var data: js.Object = js.native
  var maximumZ: scala.Double = js.native
  var minimumZ: scala.Double = js.native
  var opacity: scala.Double = js.native
  var urlTemplate: java.lang.String | TileCallbackFunction = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
}

