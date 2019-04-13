package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResolverRuleResponse extends js.Object {
  /**
    * The response to an UpdateResolverRule request.
    */
  var ResolverRule: js.UndefOr[ResolverRule] = js.undefined
}

object UpdateResolverRuleResponse {
  @scala.inline
  def apply(ResolverRule: ResolverRule = null): UpdateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRule != null) __obj.updateDynamic("ResolverRule")(ResolverRule)
    __obj.asInstanceOf[UpdateResolverRuleResponse]
  }
}

