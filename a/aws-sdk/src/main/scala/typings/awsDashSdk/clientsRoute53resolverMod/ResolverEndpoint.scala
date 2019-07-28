package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverEndpoint extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver endpoint.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Arn] = js.undefined
  /**
    * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  /**
    * A unique string that identifies the request that created the resolver endpoint. The CreatorRequestId allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.CreatorRequestId] = js.undefined
  /**
    * Indicates whether the resolver endpoint allows inbound or outbound DNS queries:    INBOUND: allows DNS queries to your VPC from your network or another VPC    OUTBOUND: allows DNS queries from your VPC to your network or another VPC  
    */
  var Direction: js.UndefOr[ResolverEndpointDirection] = js.undefined
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  var HostVPCId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The ID of the resolver endpoint.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  /**
    * The number of IP addresses that the resolver endpoint can use for DNS queries.
    */
  var IpAddressCount: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.IpAddressCount] = js.undefined
  /**
    * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  /**
    * The name that you assigned to the resolver endpoint when you submitted a CreateResolverEndpoint request.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Name] = js.undefined
  /**
    * The ID of one or more security groups that control access to this VPC. The security group must include one or more inbound resolver rules.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.SecurityGroupIds] = js.undefined
  /**
    * A code that specifies the current status of the resolver endpoint.
    */
  var Status: js.UndefOr[ResolverEndpointStatus] = js.undefined
  /**
    * A detailed description of the status of the resolver endpoint.
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.StatusMessage] = js.undefined
}

object ResolverEndpoint {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreationTime: Rfc3339TimeString = null,
    CreatorRequestId: CreatorRequestId = null,
    Direction: ResolverEndpointDirection = null,
    HostVPCId: ResourceId = null,
    Id: ResourceId = null,
    IpAddressCount: js.UndefOr[IpAddressCount] = js.undefined,
    ModificationTime: Rfc3339TimeString = null,
    Name: Name = null,
    SecurityGroupIds: SecurityGroupIds = null,
    Status: ResolverEndpointStatus = null,
    StatusMessage: StatusMessage = null
  ): ResolverEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (Direction != null) __obj.updateDynamic("Direction")(Direction.asInstanceOf[js.Any])
    if (HostVPCId != null) __obj.updateDynamic("HostVPCId")(HostVPCId)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IpAddressCount)) __obj.updateDynamic("IpAddressCount")(IpAddressCount)
    if (ModificationTime != null) __obj.updateDynamic("ModificationTime")(ModificationTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[ResolverEndpoint]
  }
}

