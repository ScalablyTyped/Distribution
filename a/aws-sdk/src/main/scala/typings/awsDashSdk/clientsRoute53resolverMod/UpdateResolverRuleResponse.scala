package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResolverRuleResponse extends js.Object {
  /**
    * The response to an UpdateResolverRule request.
    */
  var ResolverRule: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRule] = js.native
}

object UpdateResolverRuleResponse {
  @scala.inline
  def apply(ResolverRule: ResolverRule = null): UpdateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRule != null) __obj.updateDynamic("ResolverRule")(ResolverRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverRuleResponse]
  }
}

