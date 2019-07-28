package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackInstance extends js.Object {
  /**
    * The name of the AWS account that the stack instance is associated with.
    */
  var Account: js.UndefOr[AccountId] = js.undefined
  /**
    * The name of the AWS region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Region] = js.undefined
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.     INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.     OUTDATED: The stack isn't currently up to date with the stack set because either the associated stack failed during a CreateStackSet or UpdateStackSet operation, or the stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.    CURRENT: The stack is currently up to date with the stack set.  
    */
  var StackInstanceStatus: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackInstanceStatus] = js.undefined
}

object StackInstance {
  @scala.inline
  def apply(Account: AccountId = null, Region: Region = null, StackInstanceStatus: StackInstanceStatus = null): StackInstance = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (StackInstanceStatus != null) __obj.updateDynamic("StackInstanceStatus")(StackInstanceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackInstance]
  }
}

