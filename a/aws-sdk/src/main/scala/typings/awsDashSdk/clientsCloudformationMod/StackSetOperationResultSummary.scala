package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetOperationResultSummary extends js.Object {
  /**
    * The name of the AWS account for this operation result.
    */
  var Account: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Account] = js.native
  /**
    * The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with stack set operations in an account
    */
  var AccountGateResult: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.AccountGateResult] = js.native
  /**
    * The name of the AWS region for this operation result.
    */
  var Region: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Region] = js.native
  /**
    * The result status of the stack set operation for the given account in the given region.    CANCELLED: The operation in the specified account and region has been cancelled. This is either because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation has been exceeded.    FAILED: The operation in the specified account and region failed.  If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set operation as a whole might be exceeded.     RUNNING: The operation in the specified account and region is currently in progress.    PENDING: The operation in the specified account and region has yet to start.     SUCCEEDED: The operation in the specified account and region completed successfully.  
    */
  var Status: js.UndefOr[StackSetOperationResultStatus] = js.native
  /**
    * The reason for the assigned result status.
    */
  var StatusReason: js.UndefOr[Reason] = js.native
}

object StackSetOperationResultSummary {
  @scala.inline
  def apply(
    Account: Account = null,
    AccountGateResult: AccountGateResult = null,
    Region: Region = null,
    Status: StackSetOperationResultStatus = null,
    StatusReason: Reason = null
  ): StackSetOperationResultSummary = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account.asInstanceOf[js.Any])
    if (AccountGateResult != null) __obj.updateDynamic("AccountGateResult")(AccountGateResult.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetOperationResultSummary]
  }
}

