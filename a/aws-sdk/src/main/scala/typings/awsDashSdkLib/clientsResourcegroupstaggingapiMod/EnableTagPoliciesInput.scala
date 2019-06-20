package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableTagPoliciesInput extends js.Object {
  /**
    * The root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations ListRoots API to find it. 
    */
  var RootId: awsDashSdkLib.clientsResourcegroupstaggingapiMod.RootId
}

object EnableTagPoliciesInput {
  @scala.inline
  def apply(RootId: RootId): EnableTagPoliciesInput = {
    val __obj = js.Dynamic.literal(RootId = RootId)
  
    __obj.asInstanceOf[EnableTagPoliciesInput]
  }
}

