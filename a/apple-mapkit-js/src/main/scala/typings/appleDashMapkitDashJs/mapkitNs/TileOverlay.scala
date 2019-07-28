package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.TileOverlay")
@js.native
class TileOverlay protected () extends js.Object {
  def this(urlTemplate: String) = this()
  def this(urlTemplate: TileCallbackFunction) = this()
  def this(urlTemplate: String, options: TileOverlayConstructorOptions) = this()
  def this(urlTemplate: TileCallbackFunction, options: TileOverlayConstructorOptions) = this()
  var data: js.Object = js.native
  var maximumZ: Double = js.native
  var minimumZ: Double = js.native
  var opacity: Double = js.native
  var urlTemplate: String | TileCallbackFunction = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
  def reload(): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
}

