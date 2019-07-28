package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigRulesResponse extends js.Object {
  /**
    * The details about your AWS Config rules.
    */
  var ConfigRules: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConfigRules] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeConfigRulesResponse {
  @scala.inline
  def apply(ConfigRules: ConfigRules = null, NextToken: String = null): DescribeConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigRules != null) __obj.updateDynamic("ConfigRules")(ConfigRules)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeConfigRulesResponse]
  }
}

