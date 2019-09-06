package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrganizationConfigRulesRequest extends js.Object {
  /**
    * The maximum number of organization config rules returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The names of organization config rules for which you want details. If you do not specify any names, AWS Config returns details for all your organization config rules.
    */
  var OrganizationConfigRuleNames: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleNames] = js.undefined
}

object DescribeOrganizationConfigRulesRequest {
  @scala.inline
  def apply(
    Limit: js.UndefOr[CosmosPageLimit] = js.undefined,
    NextToken: String = null,
    OrganizationConfigRuleNames: OrganizationConfigRuleNames = null
  ): DescribeOrganizationConfigRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OrganizationConfigRuleNames != null) __obj.updateDynamic("OrganizationConfigRuleNames")(OrganizationConfigRuleNames)
    __obj.asInstanceOf[DescribeOrganizationConfigRulesRequest]
  }
}

