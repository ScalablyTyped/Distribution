package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.contact")
@js.native
object contact extends js.Object {
  /**
    * Register a callback to receive contact details
    *
    * @param callback A callback that will receive a Contact instance
    *                 when contact information is updated.
    */
  def apply(callback: ContactCallback): Unit = js.native
}

