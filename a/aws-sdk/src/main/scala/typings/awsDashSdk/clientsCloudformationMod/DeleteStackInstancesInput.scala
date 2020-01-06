package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStackInstancesInput extends js.Object {
  /**
    * The names of the AWS accounts that you want to delete stack instances for.
    */
  var Accounts: AccountList = js.native
  /**
    * The unique identifier for this stack set operation.  If you don't specify an operation ID, the SDK generates one automatically.  The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You can retry stack set operation requests to ensure that AWS CloudFormation successfully received them. Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  /**
    * Preferences for how AWS CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  /**
    * The regions where you want to delete stack set instances. 
    */
  var Regions: RegionList = js.native
  /**
    * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack or add an existing, saved stack to a new stack set. For more information, see Stack set operation options.
    */
  var RetainStacks: typings.awsDashSdk.clientsCloudformationMod.RetainStacks = js.native
  /**
    * The name or unique ID of the stack set that you want to delete stack instances for.
    */
  var StackSetName: typings.awsDashSdk.clientsCloudformationMod.StackSetName = js.native
}

object DeleteStackInstancesInput {
  @scala.inline
  def apply(
    Accounts: AccountList,
    Regions: RegionList,
    RetainStacks: RetainStacks,
    StackSetName: StackSetName,
    OperationId: ClientRequestToken = null,
    OperationPreferences: StackSetOperationPreferences = null
  ): DeleteStackInstancesInput = {
    val __obj = js.Dynamic.literal(Accounts = Accounts.asInstanceOf[js.Any], Regions = Regions.asInstanceOf[js.Any], RetainStacks = RetainStacks.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    if (OperationPreferences != null) __obj.updateDynamic("OperationPreferences")(OperationPreferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackInstancesInput]
  }
}

