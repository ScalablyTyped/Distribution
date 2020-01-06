package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to delete.
    */
  var ResolverRuleId: ResourceId = js.native
}

object DeleteResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId): DeleteResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteResolverRuleRequest]
  }
}

