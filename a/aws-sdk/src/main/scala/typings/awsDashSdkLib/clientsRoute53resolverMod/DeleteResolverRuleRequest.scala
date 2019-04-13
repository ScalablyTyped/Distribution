package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to delete.
    */
  var ResolverRuleId: ResourceId
}

object DeleteResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId): DeleteResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId)
  
    __obj.asInstanceOf[DeleteResolverRuleRequest]
  }
}

