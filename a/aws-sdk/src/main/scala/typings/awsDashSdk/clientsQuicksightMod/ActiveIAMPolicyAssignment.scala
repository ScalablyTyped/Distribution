package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveIAMPolicyAssignment extends js.Object {
  /**
    * A name for the IAM policy assignment.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}

object ActiveIAMPolicyAssignment {
  @scala.inline
  def apply(AssignmentName: IAMPolicyAssignmentName = null, PolicyArn: Arn = null): ActiveIAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    if (AssignmentName != null) __obj.updateDynamic("AssignmentName")(AssignmentName.asInstanceOf[js.Any])
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIAMPolicyAssignment]
  }
}

