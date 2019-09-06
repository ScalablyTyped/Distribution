package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrganizationConfigRulesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Retuns a list OrganizationConfigRule objects.
    */
  var OrganizationConfigRules: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRules] = js.undefined
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

