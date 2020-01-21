package typings.amplitudeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amplitude-js", "logEvent")
@js.native
object logEvent extends js.Object {
  def apply(event: String): LogReturn = js.native
  def apply(event: String, data: js.Any): LogReturn = js.native
  def apply(event: String, data: js.Any, callback: Callback): LogReturn = js.native
}

