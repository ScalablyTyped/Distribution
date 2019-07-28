package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRuleAssociationResponse extends js.Object {
  /**
    * Information about the resolver rule association that you specified in a GetResolverRuleAssociation request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRuleAssociation] = js.undefined
}

object GetResolverRuleAssociationResponse {
  @scala.inline
  def apply(ResolverRuleAssociation: ResolverRuleAssociation = null): GetResolverRuleAssociationResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRuleAssociation != null) __obj.updateDynamic("ResolverRuleAssociation")(ResolverRuleAssociation)
    __obj.asInstanceOf[GetResolverRuleAssociationResponse]
  }
}

