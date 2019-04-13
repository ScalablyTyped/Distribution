package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApprovalResult extends js.Object {
  /**
    * The response submitted by a reviewer assigned to an approval action request.
    */
  var status: ApprovalStatus
  /**
    * The summary of the current status of the approval request.
    */
  var summary: ApprovalSummary
}

object ApprovalResult {
  @scala.inline
  def apply(status: ApprovalStatus, summary: ApprovalSummary): ApprovalResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], summary = summary)
  
    __obj.asInstanceOf[ApprovalResult]
  }
}

