package typings.akamaiDashEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasStatus extends js.Object {
  /**
    * The HTTP status of a response sent to the client.
    */
  var status: Double
}

object HasStatus {
  @scala.inline
  def apply(status: Double): HasStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HasStatus]
  }
}

