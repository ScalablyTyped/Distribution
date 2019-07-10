package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrganizationConfigRulesRequest extends js.Object {
  var Limit: js.UndefOr[CosmosPageLimit] = js.undefined
  var NextToken: js.UndefOr[String] = js.undefined
  var OrganizationConfigRuleNames: js.UndefOr[OrganizationConfigRuleNames] = js.undefined
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

