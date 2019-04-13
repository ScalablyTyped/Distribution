package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutApprovalResultOutput extends js.Object {
  /**
    * The timestamp showing when the approval or rejection was submitted.
    */
  var approvedAt: js.UndefOr[Timestamp] = js.undefined
}

object PutApprovalResultOutput {
  @scala.inline
  def apply(approvedAt: Timestamp = null): PutApprovalResultOutput = {
    val __obj = js.Dynamic.literal()
    if (approvedAt != null) __obj.updateDynamic("approvedAt")(approvedAt)
    __obj.asInstanceOf[PutApprovalResultOutput]
  }
}

