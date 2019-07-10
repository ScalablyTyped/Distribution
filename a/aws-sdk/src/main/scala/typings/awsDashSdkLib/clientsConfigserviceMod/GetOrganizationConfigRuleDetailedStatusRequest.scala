package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrganizationConfigRuleDetailedStatusRequest extends js.Object {
  var Filters: js.UndefOr[StatusDetailFilters] = js.undefined
  var Limit: js.UndefOr[CosmosPageLimit] = js.undefined
  var NextToken: js.UndefOr[String] = js.undefined
  var OrganizationConfigRuleName: StringWithCharLimit64
}

object GetOrganizationConfigRuleDetailedStatusRequest {
  @scala.inline
  def apply(
    OrganizationConfigRuleName: StringWithCharLimit64,
    Filters: StatusDetailFilters = null,
    Limit: js.UndefOr[CosmosPageLimit] = js.undefined,
    NextToken: String = null
  ): GetOrganizationConfigRuleDetailedStatusRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusRequest]
  }
}

