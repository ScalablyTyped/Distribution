package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagPolicyInput extends js.Object {
  /**
    * The account ID or the root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations ListRoots API to find it. 
    */
  var TargetId: awsDashSdkLib.clientsResourcegroupstaggingapiMod.TargetId
}

object DeleteTagPolicyInput {
  @scala.inline
  def apply(TargetId: TargetId): DeleteTagPolicyInput = {
    val __obj = js.Dynamic.literal(TargetId = TargetId)
  
    __obj.asInstanceOf[DeleteTagPolicyInput]
  }
}

