package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Directions")
@js.native
class Directions () extends js.Object {
  def this(options: DirectionsConstructorOptions) = this()
  def cancel(id: scala.Double): scala.Boolean = js.native
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* error */ stdLib.Error, /* response */ DirectionsResponse, scala.Unit]
  ): scala.Double = js.native
}

