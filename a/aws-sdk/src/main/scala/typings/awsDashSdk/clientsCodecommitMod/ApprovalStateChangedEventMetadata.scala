package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalStateChangedEventMetadata extends js.Object {
  /**
    * The approval status for the pull request.
    */
  var approvalStatus: js.UndefOr[ApprovalState] = js.native
  /**
    * The revision ID of the pull request when the approval state changed.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}

object ApprovalStateChangedEventMetadata {
  @scala.inline
  def apply(approvalStatus: ApprovalState = null, revisionId: RevisionId = null): ApprovalStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (approvalStatus != null) __obj.updateDynamic("approvalStatus")(approvalStatus.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalStateChangedEventMetadata]
  }
}

