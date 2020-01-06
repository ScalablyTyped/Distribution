package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClientVpnAuthorizationRulesResult extends js.Object {
  /**
    * Information about the authorization rules.
    */
  var AuthorizationRules: js.UndefOr[AuthorizationRuleSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NextToken] = js.native
}

object DescribeClientVpnAuthorizationRulesResult {
  @scala.inline
  def apply(AuthorizationRules: AuthorizationRuleSet = null, NextToken: NextToken = null): DescribeClientVpnAuthorizationRulesResult = {
    val __obj = js.Dynamic.literal()
    if (AuthorizationRules != null) __obj.updateDynamic("AuthorizationRules")(AuthorizationRules.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientVpnAuthorizationRulesResult]
  }
}

