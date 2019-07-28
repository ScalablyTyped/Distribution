package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSamplingRuleRequest extends js.Object {
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.undefined
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[String] = js.undefined
}

object DeleteSamplingRuleRequest {
  @scala.inline
  def apply(RuleARN: String = null, RuleName: String = null): DeleteSamplingRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN)
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    __obj.asInstanceOf[DeleteSamplingRuleRequest]
  }
}

