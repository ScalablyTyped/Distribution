package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagPolicyOutput extends js.Object {
  /**
    * The last time this policy was updated.
    */
  var LastUpdated: js.UndefOr[LastUpdated] = js.undefined
  /**
    * The policy that is attached to the specified target.
    */
  var Policy: js.UndefOr[Policy] = js.undefined
}

object GetTagPolicyOutput {
  @scala.inline
  def apply(LastUpdated: LastUpdated = null, Policy: Policy = null): GetTagPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetTagPolicyOutput]
  }
}

