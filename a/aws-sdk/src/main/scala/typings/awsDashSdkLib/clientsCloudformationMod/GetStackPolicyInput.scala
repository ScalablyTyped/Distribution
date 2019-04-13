package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackPolicyInput extends js.Object {
  /**
    * The name or unique stack ID that is associated with the stack whose policy you want to get.
    */
  var StackName: awsDashSdkLib.clientsCloudformationMod.StackName
}

object GetStackPolicyInput {
  @scala.inline
  def apply(StackName: StackName): GetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName)
  
    __obj.asInstanceOf[GetStackPolicyInput]
  }
}

