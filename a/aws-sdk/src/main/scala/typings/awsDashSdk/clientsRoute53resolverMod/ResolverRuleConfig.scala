package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleConfig extends js.Object {
  /**
    * The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53 console. 
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Name] = js.native
  /**
    * The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  /**
    * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}

object ResolverRuleConfig {
  @scala.inline
  def apply(Name: Name = null, ResolverEndpointId: ResourceId = null, TargetIps: TargetList = null): ResolverRuleConfig = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ResolverEndpointId != null) __obj.updateDynamic("ResolverEndpointId")(ResolverEndpointId.asInstanceOf[js.Any])
    if (TargetIps != null) __obj.updateDynamic("TargetIps")(TargetIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleConfig]
  }
}

