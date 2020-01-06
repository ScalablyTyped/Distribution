package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRuleResponse extends js.Object {
  /**
    * Information about the Rule that you specified in the GetRule request. For more information, see the following topics:    Rule: Contains MetricName, Name, an array of Predicate objects, and RuleId     Predicate: Each Predicate object contains DataId, Negated, and Type   
    */
  var Rule: js.UndefOr[typings.awsDashSdk.clientsWafMod.Rule] = js.native
}

object GetRuleResponse {
  @scala.inline
  def apply(Rule: Rule = null): GetRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (Rule != null) __obj.updateDynamic("Rule")(Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleResponse]
  }
}

