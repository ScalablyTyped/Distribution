package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAMPolicyAssignmentSummary extends js.Object {
  /**
    * Assignment name.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * Assignment status.
    */
  var AssignmentStatus: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.AssignmentStatus] = js.native
}

object IAMPolicyAssignmentSummary {
  @scala.inline
  def apply(AssignmentName: IAMPolicyAssignmentName = null, AssignmentStatus: AssignmentStatus = null): IAMPolicyAssignmentSummary = {
    val __obj = js.Dynamic.literal()
    if (AssignmentName != null) __obj.updateDynamic("AssignmentName")(AssignmentName.asInstanceOf[js.Any])
    if (AssignmentStatus != null) __obj.updateDynamic("AssignmentStatus")(AssignmentStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAMPolicyAssignmentSummary]
  }
}

