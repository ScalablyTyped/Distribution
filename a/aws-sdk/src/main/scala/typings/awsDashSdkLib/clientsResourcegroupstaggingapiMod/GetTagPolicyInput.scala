package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagPolicyInput extends js.Object {
  /**
    * The account ID or the root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations ListRoots API to find it. 
    */
  var TargetId: awsDashSdkLib.clientsResourcegroupstaggingapiMod.TargetId
}

object GetTagPolicyInput {
  @scala.inline
  def apply(TargetId: TargetId): GetTagPolicyInput = {
    val __obj = js.Dynamic.literal(TargetId = TargetId)
  
    __obj.asInstanceOf[GetTagPolicyInput]
  }
}

