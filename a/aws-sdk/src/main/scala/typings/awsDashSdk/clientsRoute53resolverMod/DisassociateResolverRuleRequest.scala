package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to disassociate from the specified VPC.
    */
  var ResolverRuleId: ResourceId = js.native
  /**
    * The ID of the VPC that you want to disassociate the resolver rule from.
    */
  var VPCId: ResourceId = js.native
}

object DisassociateResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId, VPCId: ResourceId): DisassociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any], VPCId = VPCId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateResolverRuleRequest]
  }
}

