package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateResolverRuleResponse extends js.Object {
  /**
    * Information about the DisassociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRuleAssociation] = js.undefined
}

object DisassociateResolverRuleResponse {
  @scala.inline
  def apply(ResolverRuleAssociation: ResolverRuleAssociation = null): DisassociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRuleAssociation != null) __obj.updateDynamic("ResolverRuleAssociation")(ResolverRuleAssociation)
    __obj.asInstanceOf[DisassociateResolverRuleResponse]
  }
}

