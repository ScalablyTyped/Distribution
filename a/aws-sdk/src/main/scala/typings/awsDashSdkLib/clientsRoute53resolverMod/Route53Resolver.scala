package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route53Resolver
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Route53Resolver: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

