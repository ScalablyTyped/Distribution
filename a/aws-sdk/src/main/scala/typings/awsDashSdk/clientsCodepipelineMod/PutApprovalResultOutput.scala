package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutApprovalResultOutput extends js.Object {
  /**
    * The timestamp showing when the approval or rejection was submitted.
    */
  var approvedAt: js.UndefOr[Timestamp] = js.native
}

object PutApprovalResultOutput {
  @scala.inline
  def apply(approvedAt: Timestamp = null): PutApprovalResultOutput = {
    val __obj = js.Dynamic.literal()
    if (approvedAt != null) __obj.updateDynamic("approvedAt")(approvedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutApprovalResultOutput]
  }
}

