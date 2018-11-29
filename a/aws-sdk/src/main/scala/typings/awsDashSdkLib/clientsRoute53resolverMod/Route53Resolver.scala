package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route53Resolver
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Route53Resolver: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ClientConfiguration = js.native
  /**
     * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.
     */
  def associateResolverEndpointIpAddress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverEndpointIpAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.
     */
  def associateResolverEndpointIpAddress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverEndpointIpAddressResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverEndpointIpAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.
     */
  def associateResolverEndpointIpAddress(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverEndpointIpAddressRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverEndpointIpAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to adding more than one IP address, submit one AssociateResolverEndpointIpAddress request for each IP address. To remove an IP address from an endpoint, see DisassociateResolverEndpointIpAddress.
     */
  def associateResolverEndpointIpAddress(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverEndpointIpAddressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverEndpointIpAddressResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverEndpointIpAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
     */
  def associateResolverRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
     */
  def associateResolverRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
     */
  def associateResolverRule(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see CreateResolverRule. 
     */
  def associateResolverRule(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.AssociateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or another VPC.   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or another VPC.  
     */
  def createResolverEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or another VPC.   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or another VPC.  
     */
  def createResolverEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or another VPC.   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or another VPC.  
     */
  def createResolverEndpoint(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resolver endpoint. There are two types of resolver endpoints, inbound and outbound:   An inbound resolver endpoint forwards DNS queries to the DNS service for a VPC from your network or another VPC.   An outbound resolver endpoint forwards DNS queries from the DNS service for a VPC to your network or another VPC.  
     */
  def createResolverEndpoint(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
     */
  def createResolverRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
     */
  def createResolverRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
     */
  def createResolverRule(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * For DNS queries that originate in your VPCs, specifies which resolver endpoint the queries pass through, one domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
     */
  def createResolverRule(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.CreateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an outbound resolver endpoint:    Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.  
     */
  def deleteResolverEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an outbound resolver endpoint:    Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.  
     */
  def deleteResolverEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an outbound resolver endpoint:    Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.  
     */
  def deleteResolverEndpoint(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends on whether it's an inbound or an outbound resolver endpoint:    Inbound: DNS queries from your network or another VPC are no longer routed to the DNS service for the specified VPC.    Outbound: DNS queries from a VPC are no longer routed to your network or to another VPC.  
     */
  def deleteResolverEndpoint(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that you associated the resolver rule with. For more infomation, see DisassociateResolverRule.
     */
  def deleteResolverRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that you associated the resolver rule with. For more infomation, see DisassociateResolverRule.
     */
  def deleteResolverRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that you associated the resolver rule with. For more infomation, see DisassociateResolverRule.
     */
  def deleteResolverRule(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resolver rule. Before you can delete a resolver rule, you must disassociate it from all the VPCs that you associated the resolver rule with. For more infomation, see DisassociateResolverRule.
     */
  def deleteResolverRule(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DeleteResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.
     */
  def disassociateResolverEndpointIpAddress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverEndpointIpAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.
     */
  def disassociateResolverEndpointIpAddress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverEndpointIpAddressResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverEndpointIpAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.
     */
  def disassociateResolverEndpointIpAddress(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverEndpointIpAddressRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverEndpointIpAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes IP addresses from an inbound or an outbound resolver endpoint. If you want to remove more than one IP address, submit one DisassociateResolverEndpointIpAddress request for each IP address. To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress.
     */
  def disassociateResolverEndpointIpAddress(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverEndpointIpAddressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverEndpointIpAddressResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverEndpointIpAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the association between a specified resolver rule and a specified VPC.  If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the resolver rule.  
     */
  def disassociateResolverRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the association between a specified resolver rule and a specified VPC.  If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the resolver rule.  
     */
  def disassociateResolverRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the association between a specified resolver rule and a specified VPC.  If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the resolver rule.  
     */
  def disassociateResolverRule(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the association between a specified resolver rule and a specified VPC.  If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that you specified in the resolver rule.  
     */
  def disassociateResolverRule(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.DisassociateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver endpoint, and the current status of the endpoint.
     */
  def getResolverEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver endpoint, and the current status of the endpoint.
     */
  def getResolverEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver endpoint, and the current status of the endpoint.
     */
  def getResolverEndpoint(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified resolver endpoint, such as whether it's an inbound or an outbound resolver endpoint, and the current status of the endpoint.
     */
  def getResolverEndpoint(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound resolver endpoint that the rule is associated with.
     */
  def getResolverRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound resolver endpoint that the rule is associated with.
     */
  def getResolverRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound resolver endpoint that the rule is associated with.
     */
  def getResolverRule(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a specified resolver rule, such as the domain name that the rule forwards DNS queries for and the ID of the outbound resolver endpoint that the rule is associated with.
     */
  def getResolverRule(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule and a VPC using AssociateResolverRule. 
     */
  def getResolverRuleAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleAssociationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule and a VPC using AssociateResolverRule. 
     */
  def getResolverRuleAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleAssociationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleAssociationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule and a VPC using AssociateResolverRule. 
     */
  def getResolverRuleAssociation(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleAssociationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleAssociationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an association between a specified resolver rule and a VPC. You associate a resolver rule and a VPC using AssociateResolverRule. 
     */
  def getResolverRuleAssociation(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleAssociationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRuleAssociationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
     */
  def getResolverRulePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRulePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
     */
  def getResolverRulePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRulePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRulePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
     */
  def getResolverRulePolicy(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRulePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRulePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a resolver rule policy. A resolver rule policy specifies the Resolver operations and resources that you want to allow another AWS account to be able to use. 
     */
  def getResolverRulePolicy(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRulePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRulePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.GetResolverRulePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the IP addresses for a specified resolver endpoint.
     */
  def listResolverEndpointIpAddresses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointIpAddressesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the IP addresses for a specified resolver endpoint.
     */
  def listResolverEndpointIpAddresses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointIpAddressesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointIpAddressesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the IP addresses for a specified resolver endpoint.
     */
  def listResolverEndpointIpAddresses(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointIpAddressesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointIpAddressesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the IP addresses for a specified resolver endpoint.
     */
  def listResolverEndpointIpAddresses(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointIpAddressesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointIpAddressesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointIpAddressesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the resolver endpoints that were created using the current AWS account.
     */
  def listResolverEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the resolver endpoints that were created using the current AWS account.
     */
  def listResolverEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the resolver endpoints that were created using the current AWS account.
     */
  def listResolverEndpoints(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the resolver endpoints that were created using the current AWS account.
     */
  def listResolverEndpoints(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
     */
  def listResolverRuleAssociations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRuleAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
     */
  def listResolverRuleAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRuleAssociationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRuleAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
     */
  def listResolverRuleAssociations(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRuleAssociationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRuleAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the associations that were created between resolver rules and VPCs using the current AWS account.
     */
  def listResolverRuleAssociations(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRuleAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRuleAssociationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRuleAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resolver rules that were created using the current AWS account.
     */
  def listResolverRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resolver rules that were created using the current AWS account.
     */
  def listResolverRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resolver rules that were created using the current AWS account.
     */
  def listResolverRules(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRulesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resolver rules that were created using the current AWS account.
     */
  def listResolverRules(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListResolverRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that you associated with the specified resource.
     */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that you associated with the specified resource.
     */
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that you associated with the specified resource.
     */
  def listTagsForResource(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the tags that you associated with the specified resource.
     */
  def listTagsForResource(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
     */
  def putResolverRulePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.PutResolverRulePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
     */
  def putResolverRulePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.PutResolverRulePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.PutResolverRulePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
     */
  def putResolverRulePolicy(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.PutResolverRulePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.PutResolverRulePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specifies the Resolver operations and resources that you want to allow another AWS account to be able to use.
     */
  def putResolverRulePolicy(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.PutResolverRulePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.PutResolverRulePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.PutResolverRulePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more tags to a specified resource.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more tags to a specified resource.
     */
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more tags to a specified resource.
     */
  def tagResource(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more tags to a specified resource.
     */
  def tagResource(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more tags from a specified resource.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more tags from a specified resource.
     */
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more tags from a specified resource.
     */
  def untagResource(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more tags from a specified resource.
     */
  def untagResource(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the name of an inbound or an outbound resolver endpoint. 
     */
  def updateResolverEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the name of an inbound or an outbound resolver endpoint. 
     */
  def updateResolverEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the name of an inbound or an outbound resolver endpoint. 
     */
  def updateResolverEndpoint(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the name of an inbound or an outbound resolver endpoint. 
     */
  def updateResolverEndpoint(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
     */
  def updateResolverRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
     */
  def updateResolverRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
     */
  def updateResolverRule(params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates settings for a specified resolver rule. ResolverRuleId is required, and all other parameters are optional. If you don't specify a parameter, it retains its current value.
     */
  def updateResolverRule(
    params: awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRoute53resolverMod.Route53ResolverNs.UpdateResolverRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

