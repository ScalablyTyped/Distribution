package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateResolverRuleRequest extends js.Object {
  /**
    * A name for the association that you're creating between a resolver rule and a VPC.
    */
  var Name: js.UndefOr[Name] = js.undefined
  /**
    * The ID of the resolver rule that you want to associate with the VPC. To list the existing resolver rules, use ListResolverRules.
    */
  var ResolverRuleId: ResourceId
  /**
    * The ID of the VPC that you want to associate the resolver rule with.
    */
  var VPCId: ResourceId
}

object AssociateResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId, VPCId: ResourceId, Name: Name = null): AssociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId, VPCId = VPCId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[AssociateResolverRuleRequest]
  }
}

