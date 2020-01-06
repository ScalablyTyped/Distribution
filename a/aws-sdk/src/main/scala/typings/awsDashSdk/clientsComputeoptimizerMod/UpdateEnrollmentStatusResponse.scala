package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnrollmentStatusResponse extends js.Object {
  /**
    * The enrollment status of the account.
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The reason for the enrollment status of the account. For example, an account might show a status of Pending because member accounts of an organization require more time to be enrolled in the service.
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
}

object UpdateEnrollmentStatusResponse {
  @scala.inline
  def apply(status: Status = null, statusReason: StatusReason = null): UpdateEnrollmentStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnrollmentStatusResponse]
  }
}

