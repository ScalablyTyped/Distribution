package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigRuleEvaluationStatusRequest extends js.Object {
  /**
    * The name of the AWS managed Config rules for which you want status information. If you do not specify any names, AWS Config returns status information for all AWS managed Config rules that you use.
    */
  var ConfigRuleNames: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleNames] = js.undefined
  /**
    * The number of rule evaluation results that you want returned. This parameter is required if the rule limit for your account is more than the default of 150 rules. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide.
    */
  var Limit: js.UndefOr[RuleLimit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeConfigRuleEvaluationStatusRequest {
  @scala.inline
  def apply(
    ConfigRuleNames: ConfigRuleNames = null,
    Limit: js.UndefOr[RuleLimit] = js.undefined,
    NextToken: String = null
  ): DescribeConfigRuleEvaluationStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigRuleNames != null) __obj.updateDynamic("ConfigRuleNames")(ConfigRuleNames)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusRequest]
  }
}

