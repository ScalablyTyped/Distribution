package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTerminationProtectionInput extends js.Object {
  /**
    * Whether to enable termination protection on the specified stack.
    */
  var EnableTerminationProtection: typings.awsDashSdk.clientsCloudformationMod.EnableTerminationProtection
  /**
    * The name or unique ID of the stack for which you want to set termination protection.
    */
  var StackName: StackNameOrId
}

object UpdateTerminationProtectionInput {
  @scala.inline
  def apply(EnableTerminationProtection: EnableTerminationProtection, StackName: StackNameOrId): UpdateTerminationProtectionInput = {
    val __obj = js.Dynamic.literal(EnableTerminationProtection = EnableTerminationProtection, StackName = StackName)
  
    __obj.asInstanceOf[UpdateTerminationProtectionInput]
  }
}

