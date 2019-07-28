package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountGateResult extends js.Object {
  /**
    * The status of the account gate function.    SUCCEEDED: The account gate function has determined that the account and region passes any requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that account and region.     FAILED: The account gate function has determined that the account and region does not meet the requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that account and region, and sets the stack set operation result status for that account and region to FAILED.     SKIPPED: AWS CloudFormation has skipped calling the account gate function for this account and region, for one of the following reasons:   An account gate function has not been specified for the account and region. AWS CloudFormation proceeds with the stack set operation in this account and region.   The AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and region.   Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set operation in this account and region.    
    */
  var Status: js.UndefOr[AccountGateStatus] = js.undefined
  /**
    * The reason for the account gate status assigned to this account and region for the stack set operation.
    */
  var StatusReason: js.UndefOr[AccountGateStatusReason] = js.undefined
}

object AccountGateResult {
  @scala.inline
  def apply(Status: AccountGateStatus = null, StatusReason: AccountGateStatusReason = null): AccountGateResult = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason)
    __obj.asInstanceOf[AccountGateResult]
  }
}

