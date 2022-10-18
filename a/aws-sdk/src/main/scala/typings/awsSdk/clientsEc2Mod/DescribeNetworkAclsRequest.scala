package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkAclsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    association.association-id - The ID of an association ID for the ACL.    association.network-acl-id - The ID of the network ACL involved in the association.    association.subnet-id - The ID of the subnet involved in the association.    default - Indicates whether the ACL is the default network ACL for the VPC.    entry.cidr - The IPv4 CIDR range specified in the entry.    entry.icmp.code - The ICMP code specified in the entry, if any.    entry.icmp.type - The ICMP type specified in the entry, if any.    entry.ipv6-cidr - The IPv6 CIDR range specified in the entry.    entry.port-range.from - The start of the port range specified in the entry.     entry.port-range.to - The end of the port range specified in the entry.     entry.protocol - The protocol specified in the entry (tcp | udp | icmp or a protocol number).    entry.rule-action - Allows or denies the matching traffic (allow | deny).    entry.egress - A Boolean that indicates the type of rule. Specify true for egress rules, or false for ingress rules.    entry.rule-number - The number of an entry (in other words, rule) in the set of ACL entries.    network-acl-id - The ID of the network ACL.    owner-id - The ID of the Amazon Web Services account that owns the network ACL.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC for the network ACL.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeNetworkAclsMaxResults] = js.undefined
  
  /**
    * One or more network ACL IDs. Default: Describes all your network ACLs.
    */
  var NetworkAclIds: js.UndefOr[NetworkAclIdStringList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkAclsRequest {
  
  inline def apply(): DescribeNetworkAclsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkAclsRequest]
  }
  
  extension [Self <: DescribeNetworkAclsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeNetworkAclsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNetworkAclIds(value: NetworkAclIdStringList): Self = StObject.set(x, "NetworkAclIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkAclIdsUndefined: Self = StObject.set(x, "NetworkAclIds", js.undefined)
    
    inline def setNetworkAclIdsVarargs(value: NetworkAclId*): Self = StObject.set(x, "NetworkAclIds", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
