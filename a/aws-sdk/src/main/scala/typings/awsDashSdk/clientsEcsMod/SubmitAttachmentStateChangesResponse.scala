package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitAttachmentStateChangesResponse extends js.Object {
  /**
    * Acknowledgement of the state change.
    */
  var acknowledgment: js.UndefOr[String] = js.undefined
}

object SubmitAttachmentStateChangesResponse {
  @scala.inline
  def apply(acknowledgment: String = null): SubmitAttachmentStateChangesResponse = {
    val __obj = js.Dynamic.literal()
    if (acknowledgment != null) __obj.updateDynamic("acknowledgment")(acknowledgment)
    __obj.asInstanceOf[SubmitAttachmentStateChangesResponse]
  }
}

