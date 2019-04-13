package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRuleGroupResponse extends js.Object {
  /**
    * Information about the RuleGroup that you specified in the GetRuleGroup request. 
    */
  var RuleGroup: js.UndefOr[RuleGroup] = js.undefined
}

object GetRuleGroupResponse {
  @scala.inline
  def apply(RuleGroup: RuleGroup = null): GetRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (RuleGroup != null) __obj.updateDynamic("RuleGroup")(RuleGroup)
    __obj.asInstanceOf[GetRuleGroupResponse]
  }
}

