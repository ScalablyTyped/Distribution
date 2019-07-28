package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateResolverRuleResponse extends js.Object {
  /**
    * Information about the AssociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRuleAssociation] = js.undefined
}

object AssociateResolverRuleResponse {
  @scala.inline
  def apply(ResolverRuleAssociation: ResolverRuleAssociation = null): AssociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRuleAssociation != null) __obj.updateDynamic("ResolverRuleAssociation")(ResolverRuleAssociation)
    __obj.asInstanceOf[AssociateResolverRuleResponse]
  }
}

