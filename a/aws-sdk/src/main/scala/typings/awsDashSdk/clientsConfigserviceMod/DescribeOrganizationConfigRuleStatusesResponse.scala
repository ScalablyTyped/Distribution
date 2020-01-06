package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConfigRuleStatusesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of OrganizationConfigRuleStatus objects.
    */
  var OrganizationConfigRuleStatuses: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleStatuses] = js.native
}

object DescribeOrganizationConfigRuleStatusesResponse {
  @scala.inline
  def apply(NextToken: String = null, OrganizationConfigRuleStatuses: OrganizationConfigRuleStatuses = null): DescribeOrganizationConfigRuleStatusesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationConfigRuleStatuses != null) __obj.updateDynamic("OrganizationConfigRuleStatuses")(OrganizationConfigRuleStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigRuleStatusesResponse]
  }
}

