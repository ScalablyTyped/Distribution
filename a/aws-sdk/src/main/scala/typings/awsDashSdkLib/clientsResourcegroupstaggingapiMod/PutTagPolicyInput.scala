package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTagPolicyInput extends js.Object {
  /**
    * The tag policy to attach to the target.
    */
  var Policy: awsDashSdkLib.clientsResourcegroupstaggingapiMod.Policy
  /**
    * The account ID or the root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations ListRoots API to find it. 
    */
  var TargetId: awsDashSdkLib.clientsResourcegroupstaggingapiMod.TargetId
}

object PutTagPolicyInput {
  @scala.inline
  def apply(Policy: Policy, TargetId: TargetId): PutTagPolicyInput = {
    val __obj = js.Dynamic.literal(Policy = Policy, TargetId = TargetId)
  
    __obj.asInstanceOf[PutTagPolicyInput]
  }
}

