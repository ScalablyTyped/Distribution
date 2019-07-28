package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrganizationConfigRuleStatusesResponse extends js.Object {
  var NextToken: js.UndefOr[String] = js.undefined
  var OrganizationConfigRuleStatuses: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleStatuses] = js.undefined
}

object DescribeOrganizationConfigRuleStatusesResponse {
  @scala.inline
  def apply(NextToken: String = null, OrganizationConfigRuleStatuses: OrganizationConfigRuleStatuses = null): DescribeOrganizationConfigRuleStatusesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OrganizationConfigRuleStatuses != null) __obj.updateDynamic("OrganizationConfigRuleStatuses")(OrganizationConfigRuleStatuses)
    __obj.asInstanceOf[DescribeOrganizationConfigRuleStatusesResponse]
  }
}

