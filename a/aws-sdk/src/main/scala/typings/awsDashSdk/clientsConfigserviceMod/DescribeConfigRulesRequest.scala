package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigRulesRequest extends js.Object {
  /**
    * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns details for all your rules.
    */
  var ConfigRuleNames: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleNames] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigRulesRequest {
  @scala.inline
  def apply(ConfigRuleNames: ConfigRuleNames = null, NextToken: String = null): DescribeConfigRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigRuleNames != null) __obj.updateDynamic("ConfigRuleNames")(ConfigRuleNames.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigRulesRequest]
  }
}

