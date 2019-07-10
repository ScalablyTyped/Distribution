package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrganizationConfigRulesResponse extends js.Object {
  var NextToken: js.UndefOr[String] = js.undefined
  var OrganizationConfigRules: js.UndefOr[OrganizationConfigRules] = js.undefined
}

object DescribeOrganizationConfigRulesResponse {
  @scala.inline
  def apply(NextToken: String = null, OrganizationConfigRules: OrganizationConfigRules = null): DescribeOrganizationConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OrganizationConfigRules != null) __obj.updateDynamic("OrganizationConfigRules")(OrganizationConfigRules)
    __obj.asInstanceOf[DescribeOrganizationConfigRulesResponse]
  }
}

