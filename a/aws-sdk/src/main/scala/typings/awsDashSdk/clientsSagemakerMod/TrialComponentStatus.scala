package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentStatus extends js.Object {
  /**
    * If the component failed, a message describing why.
    */
  var Message: js.UndefOr[TrialComponentStatusMessage] = js.native
  /**
    * The status of the trial component.
    */
  var PrimaryStatus: js.UndefOr[TrialComponentPrimaryStatus] = js.native
}

object TrialComponentStatus {
  @scala.inline
  def apply(Message: TrialComponentStatusMessage = null, PrimaryStatus: TrialComponentPrimaryStatus = null): TrialComponentStatus = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (PrimaryStatus != null) __obj.updateDynamic("PrimaryStatus")(PrimaryStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentStatus]
  }
}

