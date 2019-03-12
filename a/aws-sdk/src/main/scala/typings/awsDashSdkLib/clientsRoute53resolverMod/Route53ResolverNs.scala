package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/route53resolver", "Route53Resolver")
@js.native
object Route53ResolverNs extends js.Object {
  trait AssociateResolverEndpointIpAddressRequest extends js.Object {
    /**
      * Either the IPv4 address that you want to add to a resolver endpoint or a subnet ID. If you specify a subnet ID, Resolver chooses an IP address for you from the available IPs in the specified subnet.
      */
    var IpAddress: IpAddressUpdate
    /**
      * The ID of the resolver endpoint that you want to associate IP addresses with.
      */
    var ResolverEndpointId: ResourceId
  }
  
  trait AssociateResolverEndpointIpAddressResponse extends js.Object {
    /**
      * The response to an AssociateResolverEndpointIpAddress request.
      */
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
  }
  
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
  
  trait AssociateResolverRuleResponse extends js.Object {
    /**
      * Information about the AssociateResolverRule request, including the status of the request.
      */
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateResolverEndpointRequest extends js.Object {
    /**
      * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
      */
    var CreatorRequestId: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreatorRequestId
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
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The ID of one or more security groups that you want to use to control access to this VPC. The security group that you specify must include one or more inbound rules (for inbound resolver endpoints) or outbound rules (for outbound resolver endpoints).
      */
    var SecurityGroupIds: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.SecurityGroupIds
    /**
      * A list of the tag keys and values that you want to associate with the endpoint.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateResolverEndpointResponse extends js.Object {
    /**
      * Information about the CreateResolverEndpoint request, including the status of the request.
      */
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
  }
  
  trait CreateResolverRuleRequest extends js.Object {
    /**
      * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
      */
    var CreatorRequestId: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreatorRequestId
    /**
      * DNS queries for this domain name are forwarded to the IP addresses that you specify in TargetIps. If a query matches multiple resolver rules (example.com and www.example.com), outbound DNS queries are routed using the resolver rule that contains the most specific domain name (www.example.com).
      */
    var DomainName: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DomainName
    /**
      * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
      */
    var ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined
    /**
      * Specify FORWARD. Other resolver rule types aren't supported.
      */
    var RuleType: RuleTypeOption
    /**
      * A list of the tag keys and values that you want to associate with the endpoint.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP addresses with a comma.
      */
    var TargetIps: js.UndefOr[TargetList] = js.undefined
  }
  
  trait CreateResolverRuleResponse extends js.Object {
    /**
      * Information about the CreateResolverRule request, including the status of the request.
      */
    var ResolverRule: js.UndefOr[ResolverRule] = js.undefined
  }
  
  trait DeleteResolverEndpointRequest extends js.Object {
    /**
      * The ID of the resolver endpoint that you want to delete.
      */
    var ResolverEndpointId: ResourceId
  }
  
  trait DeleteResolverEndpointResponse extends js.Object {
    /**
      * Information about the DeleteResolverEndpoint request, including the status of the request.
      */
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
  }
  
  trait DeleteResolverRuleRequest extends js.Object {
    /**
      * The ID of the resolver rule that you want to delete.
      */
    var ResolverRuleId: ResourceId
  }
  
  trait DeleteResolverRuleResponse extends js.Object {
    /**
      * Information about the DeleteResolverRule request, including the status of the request.
      */
    var ResolverRule: js.UndefOr[ResolverRule] = js.undefined
  }
  
  trait DisassociateResolverEndpointIpAddressRequest extends js.Object {
    /**
      * The IPv4 address that you want to remove from a resolver endpoint.
      */
    var IpAddress: IpAddressUpdate
    /**
      * The ID of the resolver endpoint that you want to disassociate an IP address from.
      */
    var ResolverEndpointId: ResourceId
  }
  
  trait DisassociateResolverEndpointIpAddressResponse extends js.Object {
    /**
      * The response to an DisassociateResolverEndpointIpAddress request.
      */
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
  }
  
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
  
  trait DisassociateResolverRuleResponse extends js.Object {
    /**
      * Information about the DisassociateResolverRule request, including the status of the request.
      */
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined
  }
  
  trait Filter extends js.Object {
    /**
      * When you're using a List operation and you want the operation to return a subset of objects, such as resolver endpoints or resolver rules, the name of the parameter that you want to use to filter objects. For example, to list only inbound resolver endpoints, specify Direction for the value of Name.
      */
    var Name: js.UndefOr[FilterName] = js.undefined
    /**
      * When you're using a List operation and you want the operation to return a subset of objects, such as resolver endpoints or resolver rules, the value of the parameter that you want to use to filter objects. For example, to list only inbound resolver endpoints, specify INBOUND for the value of Values.
      */
    var Values: js.UndefOr[FilterValues] = js.undefined
  }
  
  trait GetResolverEndpointRequest extends js.Object {
    /**
      * The ID of the resolver endpoint that you want to get information about.
      */
    var ResolverEndpointId: ResourceId
  }
  
  trait GetResolverEndpointResponse extends js.Object {
    /**
      * Information about the resolver endpoint that you specified in a GetResolverEndpoint request.
      */
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
  }
  
  trait GetResolverRuleAssociationRequest extends js.Object {
    /**
      * The ID of the resolver rule association that you want to get information about.
      */
    var ResolverRuleAssociationId: ResourceId
  }
  
  trait GetResolverRuleAssociationResponse extends js.Object {
    /**
      * Information about the resolver rule association that you specified in a GetResolverRuleAssociation request.
      */
    var ResolverRuleAssociation: js.UndefOr[ResolverRuleAssociation] = js.undefined
  }
  
  trait GetResolverRulePolicyRequest extends js.Object {
    /**
      * The ID of the resolver rule policy that you want to get information about.
      */
    var Arn: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.Arn
  }
  
  trait GetResolverRulePolicyResponse extends js.Object {
    /**
      * Information about the resolver rule policy that you specified in a GetResolverRulePolicy request.
      */
    var ResolverRulePolicy: js.UndefOr[ResolverRulePolicy] = js.undefined
  }
  
  trait GetResolverRuleRequest extends js.Object {
    /**
      * The ID of the resolver rule that you want to get information about.
      */
    var ResolverRuleId: ResourceId
  }
  
  trait GetResolverRuleResponse extends js.Object {
    /**
      * Information about the resolver rule that you specified in a GetResolverRule request.
      */
    var ResolverRule: js.UndefOr[ResolverRule] = js.undefined
  }
  
  trait IpAddressRequest extends js.Object {
    /**
      * The IP address that you want to use for DNS queries.
      */
    var Ip: js.UndefOr[Ip] = js.undefined
    /**
      * The subnet that contains the IP address.
      */
    var SubnetId: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.SubnetId
  }
  
  trait IpAddressResponse extends js.Object {
    /**
      * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
      */
    var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
    /**
      * One IP address that the resolver endpoint uses for DNS queries.
      */
    var Ip: js.UndefOr[Ip] = js.undefined
    /**
      * The ID of one IP address.
      */
    var IpId: js.UndefOr[ResourceId] = js.undefined
    /**
      * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time (UTC).
      */
    var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
    /**
      * A status code that gives the current status of the request.
      */
    var Status: js.UndefOr[IpAddressStatus] = js.undefined
    /**
      * A message that provides additional information about the status of the request.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * The ID of one subnet.
      */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
  }
  
  trait IpAddressUpdate extends js.Object {
    /**
      * The new IP address.
      */
    var Ip: js.UndefOr[Ip] = js.undefined
    /**
      *  Only when removing an IP address from a resolver endpoint: The ID of the IP address that you want to remove. To get this ID, use GetResolverEndpoint.
      */
    var IpId: js.UndefOr[ResourceId] = js.undefined
    /**
      * The ID of the subnet that includes the IP address that you want to update. To get this ID, use GetResolverEndpoint.
      */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
  }
  
  trait ListResolverEndpointIpAddressesRequest extends js.Object {
    /**
      * The maximum number of IP addresses that you want to return in the response to a ListResolverEndpointIpAddresses request. If you don't specify a value for MaxResults, Resolver returns up to 100 IP addresses. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListResolverEndpointIpAddresses request, omit this value. If the specified resolver endpoint has more than MaxResults IP addresses, you can submit another ListResolverEndpointIpAddresses request to get the next group of IP addresses. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the resolver endpoint that you want to get IP addresses for.
      */
    var ResolverEndpointId: ResourceId
  }
  
  trait ListResolverEndpointIpAddressesResponse extends js.Object {
    /**
      * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to Resolver (inbound endpoint).
      */
    var IpAddresses: js.UndefOr[IpAddressesResponse] = js.undefined
    /**
      * The value that you specified for MaxResults in the request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the specified endpoint has more than MaxResults IP addresses, you can submit another ListResolverEndpointIpAddresses request to get the next group of IP addresses. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListResolverEndpointsRequest extends js.Object {
    /**
      * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.  If you submit a second or subsequent ListResolverEndpoints request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
      */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of resolver endpoints that you want to return in the response to a ListResolverEndpoints request. If you don't specify a value for MaxResults, Resolver returns up to 100 resolver endpoints. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListResolverEndpoints request, omit this value. If you have more than MaxResults resolver endpoints, you can submit another ListResolverEndpoints request to get the next group of resolver endpoints. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListResolverEndpointsResponse extends js.Object {
    /**
      * The value that you specified for MaxResults in the request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If more than MaxResults IP addresses match the specified criteria, you can submit another ListResolverEndpoint request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The resolver endpoints that were created by using the current AWS account, and that match the specified filters, if any.
      */
    var ResolverEndpoints: js.UndefOr[ResolverEndpoints] = js.undefined
  }
  
  trait ListResolverRuleAssociationsRequest extends js.Object {
    /**
      * An optional specification to return a subset of resolver rules, such as resolver rules that are associated with the same VPC ID.  If you submit a second or subsequent ListResolverRuleAssociations request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
      */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of rule associations that you want to return in the response to a ListResolverRuleAssociations request. If you don't specify a value for MaxResults, Resolver returns up to 100 rule associations. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListResolverRuleAssociation request, omit this value. If you have more than MaxResults rule associations, you can submit another ListResolverRuleAssociation request to get the next group of rule associations. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListResolverRuleAssociationsResponse extends js.Object {
    /**
      * The value that you specified for MaxResults in the request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If more than MaxResults rule associations match the specified criteria, you can submit another ListResolverRuleAssociation request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The associations that were created between resolver rules and VPCs using the current AWS account, and that match the specified filters, if any.
      */
    var ResolverRuleAssociations: js.UndefOr[ResolverRuleAssociations] = js.undefined
  }
  
  trait ListResolverRulesRequest extends js.Object {
    /**
      * An optional specification to return a subset of resolver rules, such as all resolver rules that are associated with the same resolver endpoint.  If you submit a second or subsequent ListResolverRules request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
      */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of resolver rules that you want to return in the response to a ListResolverRules request. If you don't specify a value for MaxResults, Resolver returns up to 100 resolver rules.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListResolverRules request, omit this value. If you have more than MaxResults resolver rules, you can submit another ListResolverRules request to get the next group of resolver rules. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListResolverRulesResponse extends js.Object {
    /**
      * The value that you specified for MaxResults in the request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If more than MaxResults resolver rules match the specified criteria, you can submit another ListResolverRules request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The resolver rules that were created using the current AWS account and that match the specified filters, if any.
      */
    var ResolverRules: js.UndefOr[ResolverRules] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The maximum number of tags that you want to return in the response to a ListTagsForResource request. If you don't specify a value for MaxResults, Resolver returns up to 100 tags.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * For the first ListTagsForResource request, omit this value. If you have more than MaxResults tags, you can submit another ListTagsForResource request to get the next group of tags for the resource. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the resource that you want to list tags for.
      */
    var ResourceArn: Arn
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * If more than MaxResults tags match the specified criteria, you can submit another ListTagsForResource request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The tags that are associated with the resource that you specified in the ListTagsForResource request.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait PutResolverRulePolicyRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the account that you want to grant permissions to.
      */
    var Arn: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.Arn
    /**
      * An AWS Identity and Access Management policy statement that lists the permissions that you want to grant to another AWS account.
      */
    var ResolverRulePolicy: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ResolverRulePolicy
  }
  
  trait PutResolverRulePolicyResponse extends js.Object {
    /**
      * Whether the PutResolverRulePolicy request was successful.
      */
    var ReturnValue: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ResolverEndpoint extends js.Object {
    /**
      * The ARN (Amazon Resource Name) for the resolver endpoint.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
      */
    var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
    /**
      * A unique string that identifies the request that created the resolver endpoint. The CreatorRequestId allows failed requests to be retried without the risk of executing the operation twice.
      */
    var CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined
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
    var IpAddressCount: js.UndefOr[IpAddressCount] = js.undefined
    /**
      * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
      */
    var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
    /**
      * The name that you assigned to the resolver endpoint when you submitted a CreateResolverEndpoint request.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The ID of one or more security groups that control access to this VPC. The security group must include one or more inbound resolver rules.
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
      * A code that specifies the current status of the resolver endpoint.
      */
    var Status: js.UndefOr[ResolverEndpointStatus] = js.undefined
    /**
      * A detailed description of the status of the resolver endpoint.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
  }
  
  trait ResolverRule extends js.Object {
    /**
      * The ARN (Amazon Resource Name) for the resolver rule specified by Id.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * A unique string that you specified when you created the resolver rule. CreatorRequestIdidentifies the request and allows failed requests to be retried without the risk of executing the operation twice. 
      */
    var CreatorRequestId: js.UndefOr[CreatorRequestId] = js.undefined
    /**
      * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps. If a query matches multiple resolver rules (example.com and www.example.com), the query is routed using the resolver rule that contains the most specific domain name (www.example.com).
      */
    var DomainName: js.UndefOr[DomainName] = js.undefined
    /**
      * The ID that Resolver assigned to the resolver rule when you created it.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
    /**
      * The name for the resolver rule, which you specified when you created the resolver rule.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
      */
    var OwnerId: js.UndefOr[AccountId] = js.undefined
    /**
      * The ID of the endpoint that the rule is associated with.
      */
    var ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined
    /**
      * This value is always FORWARD. Other resolver rule types aren't supported.
      */
    var RuleType: js.UndefOr[RuleTypeOption] = js.undefined
    /**
      * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
      */
    var ShareStatus: js.UndefOr[ShareStatus] = js.undefined
    /**
      * A code that specifies the current status of the resolver rule.
      */
    var Status: js.UndefOr[ResolverRuleStatus] = js.undefined
    /**
      * A detailed description of the status of a resolver rule.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * An array that contains the IP addresses and ports that you want to forward 
      */
    var TargetIps: js.UndefOr[TargetList] = js.undefined
  }
  
  trait ResolverRuleAssociation extends js.Object {
    /**
      * The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit an AssociateResolverRule request.
      */
    var Id: js.UndefOr[ResourceId] = js.undefined
    /**
      * The name of an association between a resolver rule and a VPC.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The ID of the resolver rule that you associated with the VPC that is specified by VPCId.
      */
    var ResolverRuleId: js.UndefOr[ResourceId] = js.undefined
    /**
      * A code that specifies the current status of the association between a resolver rule and a VPC.
      */
    var Status: js.UndefOr[ResolverRuleAssociationStatus] = js.undefined
    /**
      * A detailed description of the status of the association between a resolver rule and a VPC.
      */
    var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
    /**
      * The ID of the VPC that you associated the resolver rule with.
      */
    var VPCId: js.UndefOr[ResourceId] = js.undefined
  }
  
  trait ResolverRuleConfig extends js.Object {
    /**
      * The new name for the resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53 console. 
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The ID of the new outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
      */
    var ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined
    /**
      * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
      */
    var TargetIps: js.UndefOr[TargetList] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The name for the tag. For example, if you want to associate Resolver resources with the account IDs of your customers for billing purposes, the value of Key might be account-id.
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * The value for the tag. For example, if Key is account-id, then Value might be the ID of the customer account that you're creating the resource for.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the resource that you want to add tags to. To get the ARN for a resource, use the applicable Get or List command:     GetResolverEndpoint     GetResolverRule     GetResolverRuleAssociation     ListResolverEndpoints     ListResolverRuleAssociations     ListResolverRules   
      */
    var ResourceArn: Arn
    /**
      * The tags that you want to add to the specified resource.
      */
    var Tags: TagList
  }
  
  trait TagResourceResponse extends js.Object
  
  trait TargetAddress extends js.Object {
    /**
      * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
      */
    var Ip: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.Ip
    /**
      * The port at Ip that you want to forward DNS queries to.
      */
    var Port: js.UndefOr[Port] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.
      */
    def associateResolverEndpointIpAddress(): awsDashSdkLib.libRequestMod.Request[AssociateResolverEndpointIpAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateResolverEndpointIpAddress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateResolverEndpointIpAddressResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateResolverEndpointIpAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.
      */
    def associateResolverEndpointIpAddress(params: AssociateResolverEndpointIpAddressRequest): awsDashSdkLib.libRequestMod.Request[AssociateResolverEndpointIpAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateResolverEndpointIpAddress(
      params: AssociateResolverEndpointIpAddressRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateResolverEndpointIpAddressResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateResolverEndpointIpAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
      */
    def associateResolverRule(): awsDashSdkLib.libRequestMod.Request[AssociateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateResolverRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
      */
    def associateResolverRule(params: AssociateResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[AssociateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateResolverRule(
      params: AssociateResolverRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or another VPC.   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or another VPC.  
      */
    def createResolverEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createResolverEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResolverEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or another VPC.   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or another VPC.  
      */
    def createResolverEndpoint(params: CreateResolverEndpointRequest): awsDashSdkLib.libRequestMod.Request[CreateResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createResolverEndpoint(
      params: CreateResolverEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResolverEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
      */
    def createResolverRule(): awsDashSdkLib.libRequestMod.Request[CreateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createResolverRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
      */
    def createResolverRule(params: CreateResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[CreateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createResolverRule(
      params: CreateResolverRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an outbound resolver endpoint:    Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.  
      */
    def deleteResolverEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteResolverEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResolverEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an outbound resolver endpoint:    Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.  
      */
    def deleteResolverEndpoint(params: DeleteResolverEndpointRequest): awsDashSdkLib.libRequestMod.Request[DeleteResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteResolverEndpoint(
      params: DeleteResolverEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResolverEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that you associated the resolver rule with. For more infomation, see DisassociateResolverRule.
      */
    def deleteResolverRule(): awsDashSdkLib.libRequestMod.Request[DeleteResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteResolverRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that you associated the resolver rule with. For more infomation, see DisassociateResolverRule.
      */
    def deleteResolverRule(params: DeleteResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[DeleteResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteResolverRule(
      params: DeleteResolverRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.
      */
    def disassociateResolverEndpointIpAddress(): awsDashSdkLib.libRequestMod.Request[DisassociateResolverEndpointIpAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateResolverEndpointIpAddress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateResolverEndpointIpAddressResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateResolverEndpointIpAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.
      */
    def disassociateResolverEndpointIpAddress(params: DisassociateResolverEndpointIpAddressRequest): awsDashSdkLib.libRequestMod.Request[DisassociateResolverEndpointIpAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateResolverEndpointIpAddress(
      params: DisassociateResolverEndpointIpAddressRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateResolverEndpointIpAddressResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateResolverEndpointIpAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the association between a specified resolver rule and a specified VPC.  If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the resolver rule.  
      */
    def disassociateResolverRule(): awsDashSdkLib.libRequestMod.Request[DisassociateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateResolverRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the association between a specified resolver rule and a specified VPC.  If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the resolver rule.  
      */
    def disassociateResolverRule(params: DisassociateResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[DisassociateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateResolverRule(
      params: DisassociateResolverRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver endpoint, and the current status of the endpoint.
      */
    def getResolverEndpoint(): awsDashSdkLib.libRequestMod.Request[GetResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResolverEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResolverEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver endpoint, and the current status of the endpoint.
      */
    def getResolverEndpoint(params: GetResolverEndpointRequest): awsDashSdkLib.libRequestMod.Request[GetResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResolverEndpoint(
      params: GetResolverEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResolverEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound resolver endpoint that the rule is associated with.
      */
    def getResolverRule(): awsDashSdkLib.libRequestMod.Request[GetResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResolverRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound resolver endpoint that the rule is associated with.
      */
    def getResolverRule(params: GetResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[GetResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResolverRule(
      params: GetResolverRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule and a VPC using AssociateResolverRule. 
      */
    def getResolverRuleAssociation(): awsDashSdkLib.libRequestMod.Request[GetResolverRuleAssociationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResolverRuleAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResolverRuleAssociationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResolverRuleAssociationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule and a VPC using AssociateResolverRule. 
      */
    def getResolverRuleAssociation(params: GetResolverRuleAssociationRequest): awsDashSdkLib.libRequestMod.Request[GetResolverRuleAssociationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResolverRuleAssociation(
      params: GetResolverRuleAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResolverRuleAssociationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResolverRuleAssociationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
      */
    def getResolverRulePolicy(): awsDashSdkLib.libRequestMod.Request[GetResolverRulePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResolverRulePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResolverRulePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResolverRulePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
      */
    def getResolverRulePolicy(params: GetResolverRulePolicyRequest): awsDashSdkLib.libRequestMod.Request[GetResolverRulePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getResolverRulePolicy(
      params: GetResolverRulePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResolverRulePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResolverRulePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the IP addresses for a specified resolver endpoint.
      */
    def listResolverEndpointIpAddresses(): awsDashSdkLib.libRequestMod.Request[ListResolverEndpointIpAddressesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResolverEndpointIpAddresses(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolverEndpointIpAddressesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolverEndpointIpAddressesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the IP addresses for a specified resolver endpoint.
      */
    def listResolverEndpointIpAddresses(params: ListResolverEndpointIpAddressesRequest): awsDashSdkLib.libRequestMod.Request[ListResolverEndpointIpAddressesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResolverEndpointIpAddresses(
      params: ListResolverEndpointIpAddressesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolverEndpointIpAddressesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolverEndpointIpAddressesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all the resolver endpoints that were created using the current AWS account.
      */
    def listResolverEndpoints(): awsDashSdkLib.libRequestMod.Request[ListResolverEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResolverEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolverEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolverEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all the resolver endpoints that were created using the current AWS account.
      */
    def listResolverEndpoints(params: ListResolverEndpointsRequest): awsDashSdkLib.libRequestMod.Request[ListResolverEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResolverEndpoints(
      params: ListResolverEndpointsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolverEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolverEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
      */
    def listResolverRuleAssociations(): awsDashSdkLib.libRequestMod.Request[ListResolverRuleAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResolverRuleAssociations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolverRuleAssociationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolverRuleAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
      */
    def listResolverRuleAssociations(params: ListResolverRuleAssociationsRequest): awsDashSdkLib.libRequestMod.Request[ListResolverRuleAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResolverRuleAssociations(
      params: ListResolverRuleAssociationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolverRuleAssociationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolverRuleAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the resolver rules that were created using the current AWS account.
      */
    def listResolverRules(): awsDashSdkLib.libRequestMod.Request[ListResolverRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResolverRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolverRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolverRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the resolver rules that were created using the current AWS account.
      */
    def listResolverRules(params: ListResolverRulesRequest): awsDashSdkLib.libRequestMod.Request[ListResolverRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResolverRules(
      params: ListResolverRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolverRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolverRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that you associated with the specified resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that you associated with the specified resource.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
      */
    def putResolverRulePolicy(): awsDashSdkLib.libRequestMod.Request[PutResolverRulePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putResolverRulePolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutResolverRulePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutResolverRulePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
      */
    def putResolverRulePolicy(params: PutResolverRulePolicyRequest): awsDashSdkLib.libRequestMod.Request[PutResolverRulePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putResolverRulePolicy(
      params: PutResolverRulePolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutResolverRulePolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutResolverRulePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to a specified resource.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to a specified resource.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from a specified resource.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more tags from a specified resource.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the name of an inbound or an outbound resolver endpoint. 
      */
    def updateResolverEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateResolverEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateResolverEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the name of an inbound or an outbound resolver endpoint. 
      */
    def updateResolverEndpoint(params: UpdateResolverEndpointRequest): awsDashSdkLib.libRequestMod.Request[UpdateResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateResolverEndpoint(
      params: UpdateResolverEndpointRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateResolverEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateResolverEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
      */
    def updateResolverRule(): awsDashSdkLib.libRequestMod.Request[UpdateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateResolverRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
      */
    def updateResolverRule(params: UpdateResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[UpdateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateResolverRule(
      params: UpdateResolverRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateResolverRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateResolverRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the resource that you want to remove tags from. To get the ARN for a resource, use the applicable Get or List command:     GetResolverEndpoint     GetResolverRule     GetResolverRuleAssociation     ListResolverEndpoints     ListResolverRuleAssociations     ListResolverRules   
      */
    var ResourceArn: Arn
    /**
      * The tags that you want to remove to the specified resource.
      */
    var TagKeys: TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateResolverEndpointRequest extends js.Object {
    /**
      * The name of the resolver endpoint that you want to update.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The ID of the resolver endpoint that you want to update.
      */
    var ResolverEndpointId: ResourceId
  }
  
  trait UpdateResolverEndpointResponse extends js.Object {
    /**
      * The response to an UpdateResolverEndpoint request.
      */
    var ResolverEndpoint: js.UndefOr[ResolverEndpoint] = js.undefined
  }
  
  trait UpdateResolverRuleRequest extends js.Object {
    /**
      * The new settings for the resolver rule.
      */
    var Config: ResolverRuleConfig
    /**
      * The ID of the resolver rule that you want to update.
      */
    var ResolverRuleId: ResourceId
  }
  
  trait UpdateResolverRuleResponse extends js.Object {
    /**
      * The response to an UpdateResolverRule request.
      */
    var ResolverRule: js.UndefOr[ResolverRule] = js.undefined
  }
  
  trait _IpAddressStatus extends js.Object
  
  trait _ResolverEndpointDirection extends js.Object
  
  trait _ResolverEndpointStatus extends js.Object
  
  trait _ResolverRuleAssociationStatus extends js.Object
  
  trait _ResolverRuleStatus extends js.Object
  
  trait _RuleTypeOption extends js.Object
  
  trait _ShareStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AccountId = java.lang.String
  type Arn = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CreatorRequestId = java.lang.String
  type DomainName = java.lang.String
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Ip = java.lang.String
  type IpAddressCount = scala.Double
  type IpAddressStatus = _IpAddressStatus | java.lang.String
  type IpAddressesRequest = js.Array[IpAddressRequest]
  type IpAddressesResponse = js.Array[IpAddressResponse]
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NextToken = java.lang.String
  type Port = scala.Double
  type ResolverEndpointDirection = _ResolverEndpointDirection | java.lang.String
  type ResolverEndpointStatus = _ResolverEndpointStatus | java.lang.String
  type ResolverEndpoints = js.Array[ResolverEndpoint]
  type ResolverRuleAssociationStatus = _ResolverRuleAssociationStatus | java.lang.String
  type ResolverRuleAssociations = js.Array[ResolverRuleAssociation]
  type ResolverRulePolicy = java.lang.String
  type ResolverRuleStatus = _ResolverRuleStatus | java.lang.String
  type ResolverRules = js.Array[ResolverRule]
  type ResourceId = java.lang.String
  type Rfc3339TimeString = java.lang.String
  type RuleTypeOption = _RuleTypeOption | java.lang.String
  type SecurityGroupIds = js.Array[ResourceId]
  type ShareStatus = _ShareStatus | java.lang.String
  type StatusMessage = java.lang.String
  type SubnetId = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TargetList = js.Array[TargetAddress]
  type apiVersion = _apiVersion | java.lang.String
}

