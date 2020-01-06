package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleResponse extends js.Object {
  /**
    * Information about the resolver rule that you specified in a GetResolverRule request.
    */
  var ResolverRule: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRule] = js.native
}

object GetResolverRuleResponse {
  @scala.inline
  def apply(ResolverRule: ResolverRule = null): GetResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRule != null) __obj.updateDynamic("ResolverRule")(ResolverRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleResponse]
  }
}

