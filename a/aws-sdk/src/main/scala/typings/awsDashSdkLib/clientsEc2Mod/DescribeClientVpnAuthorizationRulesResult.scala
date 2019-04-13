package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClientVpnAuthorizationRulesResult extends js.Object {
  /**
    * Information about the authorization rules.
    */
  var AuthorizationRules: js.UndefOr[AuthorizationRuleSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeClientVpnAuthorizationRulesResult {
  @scala.inline
  def apply(AuthorizationRules: AuthorizationRuleSet = null, NextToken: NextToken = null): DescribeClientVpnAuthorizationRulesResult = {
    val __obj = js.Dynamic.literal()
    if (AuthorizationRules != null) __obj.updateDynamic("AuthorizationRules")(AuthorizationRules)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeClientVpnAuthorizationRulesResult]
  }
}

