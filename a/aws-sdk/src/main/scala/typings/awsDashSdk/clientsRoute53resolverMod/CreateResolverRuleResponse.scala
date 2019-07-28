package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResolverRuleResponse extends js.Object {
  /**
    * Information about the CreateResolverRule request, including the status of the request.
    */
  var ResolverRule: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRule] = js.undefined
}

object CreateResolverRuleResponse {
  @scala.inline
  def apply(ResolverRule: ResolverRule = null): CreateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRule != null) __obj.updateDynamic("ResolverRule")(ResolverRule)
    __obj.asInstanceOf[CreateResolverRuleResponse]
  }
}

