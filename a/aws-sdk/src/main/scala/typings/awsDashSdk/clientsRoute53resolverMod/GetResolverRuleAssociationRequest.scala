package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRuleAssociationRequest extends js.Object {
  /**
    * The ID of the resolver rule association that you want to get information about.
    */
  var ResolverRuleAssociationId: ResourceId
}

object GetResolverRuleAssociationRequest {
  @scala.inline
  def apply(ResolverRuleAssociationId: ResourceId): GetResolverRuleAssociationRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleAssociationId = ResolverRuleAssociationId)
  
    __obj.asInstanceOf[GetResolverRuleAssociationRequest]
  }
}

