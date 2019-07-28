package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackInstance extends js.Object {
  /**
    * The name of the AWS account that the stack instance is associated with.
    */
  var Account: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Account] = js.undefined
  /**
    * A list of parameters from the stack set template whose values have been overridden in this stack instance.
    */
  var ParameterOverrides: js.UndefOr[Parameters] = js.undefined
  /**
    * The name of the AWS region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Region] = js.undefined
  /**
    * The ID of the stack instance.
    */
  var StackId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackId] = js.undefined
  /**
    * The name or unique ID of the stack set that the stack instance is associated with.
    */
  var StackSetId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSetId] = js.undefined
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.    INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.    OUTDATED: The stack isn't currently up to date with the stack set because:   The associated stack failed during a CreateStackSet or UpdateStackSet operation.    The stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.       CURRENT: The stack is currently up to date with the stack set.  
    */
  var Status: js.UndefOr[StackInstanceStatus] = js.undefined
  /**
    * The explanation for the specific status code that is assigned to this stack instance.
    */
  var StatusReason: js.UndefOr[Reason] = js.undefined
}

object StackInstance {
  @scala.inline
  def apply(
    Account: Account = null,
    ParameterOverrides: Parameters = null,
    Region: Region = null,
    StackId: StackId = null,
    StackSetId: StackSetId = null,
    Status: StackInstanceStatus = null,
    StatusReason: Reason = null
  ): StackInstance = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account)
    if (ParameterOverrides != null) __obj.updateDynamic("ParameterOverrides")(ParameterOverrides)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason)
    __obj.asInstanceOf[StackInstance]
  }
}

