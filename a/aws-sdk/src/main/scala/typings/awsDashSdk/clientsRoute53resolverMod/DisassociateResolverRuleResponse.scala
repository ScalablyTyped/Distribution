package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateResolverRuleResponse extends js.Object {
  /**
    * Information about the DisassociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ResolverRuleAssociation] = js.native
}

object DisassociateResolverRuleResponse {
  @scala.inline
  def apply(ResolverRuleAssociation: ResolverRuleAssociation = null): DisassociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRuleAssociation != null) __obj.updateDynamic("ResolverRuleAssociation")(ResolverRuleAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResolverRuleResponse]
  }
}

