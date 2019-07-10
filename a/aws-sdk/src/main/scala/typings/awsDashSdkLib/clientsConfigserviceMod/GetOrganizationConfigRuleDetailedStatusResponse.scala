package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOrganizationConfigRuleDetailedStatusResponse extends js.Object {
  var NextToken: js.UndefOr[String] = js.undefined
  var OrganizationConfigRuleDetailedStatus: js.UndefOr[OrganizationConfigRuleDetailedStatus] = js.undefined
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

