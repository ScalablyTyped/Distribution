package typings.awsSdk.anon

import typings.awsSdk.clientsEc2Mod.Boolean
import typings.awsSdk.clientsEc2Mod.DescribeNetworkInterfacesMaxResults
import typings.awsSdk.clientsEc2Mod.Filter
import typings.awsSdk.clientsEc2Mod.FilterList
import typings.awsSdk.clientsEc2Mod.NetworkInterfaceId
import typings.awsSdk.clientsEc2Mod.NetworkInterfaceIdList
import typings.awsSdk.clientsEc2Mod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeNetworkInterfacesRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeNetworkInterfaces extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    addresses.private-ip-address - The private IPv4 addresses associated with the network interface.    addresses.primary - Whether the private IPv4 address is the primary IP address associated with the network interface.     addresses.association.public-ip - The association ID returned when the network interface was associated with the Elastic IP address (IPv4).    addresses.association.owner-id - The owner ID of the addresses associated with the network interface.    association.association-id - The association ID returned when the network interface was associated with an IPv4 address.    association.allocation-id - The allocation ID returned when you allocated the Elastic IP address (IPv4) for your network interface.    association.ip-owner-id - The owner of the Elastic IP address (IPv4) associated with the network interface.    association.public-ip - The address of the Elastic IP address (IPv4) bound to the network interface.    association.public-dns-name - The public DNS name for the network interface (IPv4).    attachment.attachment-id - The ID of the interface attachment.    attachment.attach-time - The time that the network interface was attached to an instance.    attachment.delete-on-termination - Indicates whether the attachment is deleted when an instance is terminated.    attachment.device-index - The device index to which the network interface is attached.    attachment.instance-id - The ID of the instance to which the network interface is attached.    attachment.instance-owner-id - The owner ID of the instance to which the network interface is attached.    attachment.status - The status of the attachment (attaching | attached | detaching | detached).    availability-zone - The Availability Zone of the network interface.    description - The description of the network interface.    group-id - The ID of a security group associated with the network interface.    group-name - The name of a security group associated with the network interface.    ipv6-addresses.ipv6-address - An IPv6 address associated with the network interface.    interface-type - The type of network interface (api_gateway_managed | aws_codestar_connections_managed | branch | efa | gateway_load_balancer | gateway_load_balancer_endpoint | global_accelerator_managed | interface | iot_rules_managed | lambda | load_balancer | nat_gateway | network_load_balancer | quicksight | transit_gateway | trunk | vpc_endpoint).    mac-address - The MAC address of the network interface.    network-interface-id - The ID of the network interface.    owner-id - The Amazon Web Services account ID of the network interface owner.    private-ip-address - The private IPv4 address or addresses of the network interface.    private-dns-name - The private DNS name of the network interface (IPv4).    requester-id - The alias or Amazon Web Services account ID of the principal or service that created the network interface.    requester-managed - Indicates whether the network interface is being managed by an Amazon Web Service (for example, Amazon Web Services Management Console, Auto Scaling, and so on).    source-dest-check - Indicates whether the network interface performs source/destination checking. A value of true means checking is enabled, and false means checking is disabled. The value must be false for the network interface to perform network address translation (NAT) in your VPC.     status - The status of the network interface. If the network interface is not attached to an instance, the status is available; if a network interface is attached to an instance the status is in-use.    subnet-id - The ID of the subnet for the network interface.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC for the network interface.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this request. To get the next page of items, make another request with the token returned in the output. You cannot specify this parameter and the network interface IDs parameter in the same request. For more information, see Pagination.
    */
  var MaxResults: js.UndefOr[DescribeNetworkInterfacesMaxResults] = js.undefined
  
  /**
    * The network interface IDs. Default: Describes all your network interfaces.
    */
  var NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIdList] = js.undefined
  
  /**
    * The token returned from a previous paginated request. Pagination continues from the end of the items returned by the previous request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkInterfaces {
  
  inline def apply(): DescribeNetworkInterfaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfaces]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNetworkInterfaces] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeNetworkInterfacesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkInterfaceIds(value: NetworkInterfaceIdList): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NetworkInterfaceIds", js.undefined)
    
    inline def setNetworkInterfaceIdsVarargs(value: NetworkInterfaceId*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
