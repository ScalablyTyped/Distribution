package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRuleResponse extends js.Object {
  /**
    * Information about the resolver rule that you specified in a GetResolverRule request.
    */
  var ResolverRule: js.UndefOr[ResolverRule] = js.undefined
}

object GetResolverRuleResponse {
  @scala.inline
  def apply(ResolverRule: ResolverRule = null): GetResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRule != null) __obj.updateDynamic("ResolverRule")(ResolverRule)
    __obj.asInstanceOf[GetResolverRuleResponse]
  }
}

