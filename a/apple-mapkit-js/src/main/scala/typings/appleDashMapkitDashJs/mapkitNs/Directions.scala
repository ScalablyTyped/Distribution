package typings.appleDashMapkitDashJs.mapkitNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Directions")
@js.native
class Directions () extends js.Object {
  def this(options: DirectionsConstructorOptions) = this()
  def cancel(id: Double): Boolean = js.native
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* error */ Error, /* response */ DirectionsResponse, Unit]
  ): Double = js.native
}

