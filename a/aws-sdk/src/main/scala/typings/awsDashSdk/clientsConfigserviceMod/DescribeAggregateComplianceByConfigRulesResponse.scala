package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAggregateComplianceByConfigRulesResponse extends js.Object {
  /**
    * Returns a list of AggregateComplianceByConfigRule object.
    */
  var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.NextToken] = js.undefined
}

object DescribeAggregateComplianceByConfigRulesResponse {
  @scala.inline
  def apply(
    AggregateComplianceByConfigRules: AggregateComplianceByConfigRuleList = null,
    NextToken: NextToken = null
  ): DescribeAggregateComplianceByConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregateComplianceByConfigRules != null) __obj.updateDynamic("AggregateComplianceByConfigRules")(AggregateComplianceByConfigRules)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesResponse]
  }
}

