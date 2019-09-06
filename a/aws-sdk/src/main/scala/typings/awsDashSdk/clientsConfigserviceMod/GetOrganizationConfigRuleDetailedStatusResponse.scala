package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrganizationConfigRuleDetailedStatusResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of MemberAccountStatus objects.
    */
  var OrganizationConfigRuleDetailedStatus: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleDetailedStatus] = js.undefined
}

object GetOrganizationConfigRuleDetailedStatusResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    OrganizationConfigRuleDetailedStatus: OrganizationConfigRuleDetailedStatus = null
  ): GetOrganizationConfigRuleDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OrganizationConfigRuleDetailedStatus != null) __obj.updateDynamic("OrganizationConfigRuleDetailedStatus")(OrganizationConfigRuleDetailedStatus)
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusResponse]
  }
}

