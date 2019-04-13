package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResolverRuleResponse extends js.Object {
  /**
    * Information about the DeleteResolverRule request, including the status of the request.
    */
  var ResolverRule: js.UndefOr[ResolverRule] = js.undefined
}

object DeleteResolverRuleResponse {
  @scala.inline
  def apply(ResolverRule: ResolverRule = null): DeleteResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRule != null) __obj.updateDynamic("ResolverRule")(ResolverRule)
    __obj.asInstanceOf[DeleteResolverRuleResponse]
  }
}

