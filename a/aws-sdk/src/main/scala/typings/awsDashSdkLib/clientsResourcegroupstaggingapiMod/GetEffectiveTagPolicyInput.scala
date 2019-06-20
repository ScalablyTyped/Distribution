package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectiveTagPolicyInput extends js.Object {
  /**
    * The unique identifier of the organization root or account whose tag policy you want returned. 
    */
  var TargetId: js.UndefOr[TargetId] = js.undefined
}

object GetEffectiveTagPolicyInput {
  @scala.inline
  def apply(TargetId: TargetId = null): GetEffectiveTagPolicyInput = {
    val __obj = js.Dynamic.literal()
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId)
    __obj.asInstanceOf[GetEffectiveTagPolicyInput]
  }
}

