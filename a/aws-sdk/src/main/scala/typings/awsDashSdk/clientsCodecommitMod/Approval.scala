package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Approval extends js.Object {
  /**
    * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
    */
  var approvalState: js.UndefOr[ApprovalState] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: js.UndefOr[Arn] = js.native
}

object Approval {
  @scala.inline
  def apply(approvalState: ApprovalState = null, userArn: Arn = null): Approval = {
    val __obj = js.Dynamic.literal()
    if (approvalState != null) __obj.updateDynamic("approvalState")(approvalState.asInstanceOf[js.Any])
    if (userArn != null) __obj.updateDynamic("userArn")(userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approval]
  }
}

