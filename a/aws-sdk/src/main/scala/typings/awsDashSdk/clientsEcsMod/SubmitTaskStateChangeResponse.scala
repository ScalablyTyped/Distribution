package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitTaskStateChangeResponse extends js.Object {
  /**
    * Acknowledgement of the state change.
    */
  var acknowledgment: js.UndefOr[String] = js.native
}

object SubmitTaskStateChangeResponse {
  @scala.inline
  def apply(acknowledgment: String = null): SubmitTaskStateChangeResponse = {
    val __obj = js.Dynamic.literal()
    if (acknowledgment != null) __obj.updateDynamic("acknowledgment")(acknowledgment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitTaskStateChangeResponse]
  }
}

