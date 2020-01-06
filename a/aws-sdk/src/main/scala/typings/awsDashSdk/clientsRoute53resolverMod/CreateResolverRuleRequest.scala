package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResolverRuleRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsDashSdk.clientsRoute53resolverMod.CreatorRequestId = js.native
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that you specify in TargetIps. If a query matches multiple resolver rules (example.com and www.example.com), outbound DNS queries are routed using the resolver rule that contains the most specific domain name (www.example.com).
    */
  var DomainName: typings.awsDashSdk.clientsRoute53resolverMod.DomainName = js.native
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Name] = js.native
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  /**
    * Specify FORWARD. Other resolver rule types aren't supported.
    */
  var RuleType: RuleTypeOption = js.native
  /**
    * A list of the tag keys and values that you want to associate with the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP addresses with a comma.
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}

object CreateResolverRuleRequest {
  @scala.inline
  def apply(
    CreatorRequestId: CreatorRequestId,
    DomainName: DomainName,
    RuleType: RuleTypeOption,
    Name: Name = null,
    ResolverEndpointId: ResourceId = null,
    Tags: TagList = null,
    TargetIps: TargetList = null
  ): CreateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], RuleType = RuleType.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ResolverEndpointId != null) __obj.updateDynamic("ResolverEndpointId")(ResolverEndpointId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TargetIps != null) __obj.updateDynamic("TargetIps")(TargetIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverRuleRequest]
  }
}

