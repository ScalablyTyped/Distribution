package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectiveTagPolicyOutput extends js.Object {
  /**
    * The last time this tag policy was updated.
    */
  var LastUpdated: js.UndefOr[LastUpdated] = js.undefined
  /**
    * The contents of the tag policy that is effective for this account.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
}

object GetEffectiveTagPolicyOutput {
  @scala.inline
  def apply(LastUpdated: LastUpdated = null, Policy: Policy = null): GetEffectiveTagPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetEffectiveTagPolicyOutput]
  }
}

