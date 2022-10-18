package typings.awsSdk.anon

import typings.awsSdk.clientsEc2Mod.Boolean
import typings.awsSdk.clientsEc2Mod.DescribeSubnetsMaxResults
import typings.awsSdk.clientsEc2Mod.Filter
import typings.awsSdk.clientsEc2Mod.FilterList
import typings.awsSdk.clientsEc2Mod.String
import typings.awsSdk.clientsEc2Mod.SubnetId
import typings.awsSdk.clientsEc2Mod.SubnetIdStringList
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeSubnetsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeSubnetsRequestwai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    availability-zone - The Availability Zone for the subnet. You can also use availabilityZone as the filter name.    availability-zone-id - The ID of the Availability Zone for the subnet. You can also use availabilityZoneId as the filter name.    available-ip-address-count - The number of IPv4 addresses in the subnet that are available.    cidr-block - The IPv4 CIDR block of the subnet. The CIDR block you specify must exactly match the subnet's CIDR block for information to be returned for the subnet. You can also use cidr or cidrBlock as the filter names.    customer-owned-ipv4-pool - The customer-owned IPv4 address pool associated with the subnet.    default-for-az - Indicates whether this is the default subnet for the Availability Zone (true | false). You can also use defaultForAz as the filter name.    enable-dns64 - Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic IPv6 addresses for IPv4-only destinations.    enable-lni-at-device-index - Indicates the device position for local network interfaces in this subnet. For example, 1 indicates local network interfaces in this subnet are the secondary network interface (eth1).     ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR block associated with the subnet.    ipv6-cidr-block-association.association-id - An association ID for an IPv6 CIDR block associated with the subnet.    ipv6-cidr-block-association.state - The state of an IPv6 CIDR block associated with the subnet.    ipv6-native - Indicates whether this is an IPv6 only subnet (true | false).    map-customer-owned-ip-on-launch - Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives a customer-owned IPv4 address.    map-public-ip-on-launch - Indicates whether instances launched in this subnet receive a public IPv4 address.    outpost-arn - The Amazon Resource Name (ARN) of the Outpost.    owner-id - The ID of the Amazon Web Services account that owns the subnet.    private-dns-name-options-on-launch.hostname-type - The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4 and IPv6) subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the instance ID (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID (resource-name).    private-dns-name-options-on-launch.enable-resource-name-dns-a-record - Indicates whether to respond to DNS queries for instance hostnames with DNS A records.    private-dns-name-options-on-launch.enable-resource-name-dns-aaaa-record - Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.    state - The state of the subnet (pending | available).    subnet-arn - The Amazon Resource Name (ARN) of the subnet.    subnet-id - The ID of the subnet.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC for the subnet.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeSubnetsMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * One or more subnet IDs. Default: Describes all your subnets.
    */
  var SubnetIds: js.UndefOr[SubnetIdStringList] = js.undefined
}
object DescribeSubnetsRequestwai {
  
  inline def apply(): DescribeSubnetsRequestwai = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetsRequestwai]
  }
  
  extension [Self <: DescribeSubnetsRequestwai](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeSubnetsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubnetIds(value: SubnetIdStringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
