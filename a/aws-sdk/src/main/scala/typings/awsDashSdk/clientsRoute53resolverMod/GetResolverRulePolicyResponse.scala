package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRulePolicyResponse extends js.Object {
  /**
    * Information about the resolver rule policy that you specified in a GetResolverRulePolicy request.
    */
  var ResolverRulePolicy: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRulePolicy] = js.undefined
}

object GetResolverRulePolicyResponse {
  @scala.inline
  def apply(ResolverRulePolicy: ResolverRulePolicy = null): GetResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRulePolicy != null) __obj.updateDynamic("ResolverRulePolicy")(ResolverRulePolicy)
    __obj.asInstanceOf[GetResolverRulePolicyResponse]
  }
}

