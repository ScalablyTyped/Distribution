package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAggregateComplianceByConfigRulesRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: awsDashSdkLib.clientsConfigserviceMod.ConfigurationAggregatorName
  /**
    * Filters the results by ConfigRuleComplianceFilters object. 
    */
  var Filters: js.UndefOr[ConfigRuleComplianceFilters] = js.undefined
  /**
    * The maximum number of evaluation results returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[GroupByAPILimit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeAggregateComplianceByConfigRulesRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    Filters: ConfigRuleComplianceFilters = null,
    Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
    NextToken: NextToken = null
  ): DescribeAggregateComplianceByConfigRulesRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesRequest]
  }
}

