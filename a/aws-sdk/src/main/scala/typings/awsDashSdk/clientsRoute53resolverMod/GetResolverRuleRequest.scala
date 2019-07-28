package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to get information about.
    */
  var ResolverRuleId: ResourceId
}

object GetResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId): GetResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId)
  
    __obj.asInstanceOf[GetResolverRuleRequest]
  }
}

