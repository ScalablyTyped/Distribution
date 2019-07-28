package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResolverEndpointRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsDashSdk.clientsRoute53resolverMod.CreatorRequestId
  /**
    * Specify the applicable value:    INBOUND: Resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC    OUTBOUND: Resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC  
    */
  var Direction: ResolverEndpointDirection
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound resolver endpoints). 
    */
  var IpAddresses: IpAddressesRequest
  /**
    * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Name] = js.undefined
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC. The security group that you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound rules (for outbound resolver endpoints).
    */
  var SecurityGroupIds: typings.awsDashSdk.clientsRoute53resolverMod.SecurityGroupIds
  /**
    * A list of the tag keys and values that you want to associate with the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateResolverEndpointRequest {
  @scala.inline
  def apply(
    CreatorRequestId: CreatorRequestId,
    Direction: ResolverEndpointDirection,
    IpAddresses: IpAddressesRequest,
    SecurityGroupIds: SecurityGroupIds,
    Name: Name = null,
    Tags: TagList = null
  ): CreateResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId, Direction = Direction.asInstanceOf[js.Any], IpAddresses = IpAddresses, SecurityGroupIds = SecurityGroupIds)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateResolverEndpointRequest]
  }
}

