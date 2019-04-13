package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to disassociate from the specified VPC.
    */
  var ResolverRuleId: ResourceId
  /**
    * The ID of the VPC that you want to disassociate the resolver rule from.
    */
  var VPCId: ResourceId
}

object DisassociateResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId, VPCId: ResourceId): DisassociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId, VPCId = VPCId)
  
    __obj.asInstanceOf[DisassociateResolverRuleRequest]
  }
}

