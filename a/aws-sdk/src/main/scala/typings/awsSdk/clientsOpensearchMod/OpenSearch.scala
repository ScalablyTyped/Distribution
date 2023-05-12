package typings.awsSdk.clientsOpensearchMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSearch extends Service {
  
  /**
    * Allows the destination Amazon OpenSearch Service domain owner to accept an inbound cross-cluster search connection request. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def acceptInboundConnection(): Request[AcceptInboundConnectionResponse, AWSError] = js.native
  def acceptInboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ AcceptInboundConnectionResponse, Unit]): Request[AcceptInboundConnectionResponse, AWSError] = js.native
  /**
    * Allows the destination Amazon OpenSearch Service domain owner to accept an inbound cross-cluster search connection request. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def acceptInboundConnection(params: AcceptInboundConnectionRequest): Request[AcceptInboundConnectionResponse, AWSError] = js.native
  def acceptInboundConnection(
    params: AcceptInboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptInboundConnectionResponse, Unit]
  ): Request[AcceptInboundConnectionResponse, AWSError] = js.native
  
  /**
    * Attaches tags to an existing Amazon OpenSearch Service domain. Tags are a set of case-sensitive key-value pairs. A domain can have up to 10 tags. For more information, see Tagging Amazon OpenSearch Service domains.
    */
  def addTags(): Request[js.Object, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches tags to an existing Amazon OpenSearch Service domain. Tags are a set of case-sensitive key-value pairs. A domain can have up to 10 tags. For more information, see Tagging Amazon OpenSearch Service domains.
    */
  def addTags(params: AddTagsRequest): Request[js.Object, AWSError] = js.native
  def addTags(params: AddTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a package with an Amazon OpenSearch Service domain. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def associatePackage(): Request[AssociatePackageResponse, AWSError] = js.native
  def associatePackage(callback: js.Function2[/* err */ AWSError, /* data */ AssociatePackageResponse, Unit]): Request[AssociatePackageResponse, AWSError] = js.native
  /**
    * Associates a package with an Amazon OpenSearch Service domain. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def associatePackage(params: AssociatePackageRequest): Request[AssociatePackageResponse, AWSError] = js.native
  def associatePackage(
    params: AssociatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePackageResponse, Unit]
  ): Request[AssociatePackageResponse, AWSError] = js.native
  
  /**
    * Provides access to an Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
    */
  def authorizeVpcEndpointAccess(): Request[AuthorizeVpcEndpointAccessResponse, AWSError] = js.native
  def authorizeVpcEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeVpcEndpointAccessResponse, Unit]): Request[AuthorizeVpcEndpointAccessResponse, AWSError] = js.native
  /**
    * Provides access to an Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
    */
  def authorizeVpcEndpointAccess(params: AuthorizeVpcEndpointAccessRequest): Request[AuthorizeVpcEndpointAccessResponse, AWSError] = js.native
  def authorizeVpcEndpointAccess(
    params: AuthorizeVpcEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeVpcEndpointAccessResponse, Unit]
  ): Request[AuthorizeVpcEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Cancels a scheduled service software update for an Amazon OpenSearch Service domain. You can only perform this operation before the AutomatedUpdateDate and when the domain's UpdateStatus is PENDING_UPDATE. For more information, see Service software updates in Amazon OpenSearch Service.
    */
  def cancelServiceSoftwareUpdate(): Request[CancelServiceSoftwareUpdateResponse, AWSError] = js.native
  def cancelServiceSoftwareUpdate(callback: js.Function2[/* err */ AWSError, /* data */ CancelServiceSoftwareUpdateResponse, Unit]): Request[CancelServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Cancels a scheduled service software update for an Amazon OpenSearch Service domain. You can only perform this operation before the AutomatedUpdateDate and when the domain's UpdateStatus is PENDING_UPDATE. For more information, see Service software updates in Amazon OpenSearch Service.
    */
  def cancelServiceSoftwareUpdate(params: CancelServiceSoftwareUpdateRequest): Request[CancelServiceSoftwareUpdateResponse, AWSError] = js.native
  def cancelServiceSoftwareUpdate(
    params: CancelServiceSoftwareUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelServiceSoftwareUpdateResponse, Unit]
  ): Request[CancelServiceSoftwareUpdateResponse, AWSError] = js.native
  
  @JSName("config")
  var config_OpenSearch: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Amazon OpenSearch Service domain. For more information, see Creating and managing Amazon OpenSearch Service domains.
    */
  def createDomain(): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates an Amazon OpenSearch Service domain. For more information, see Creating and managing Amazon OpenSearch Service domains.
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]
  ): Request[CreateDomainResponse, AWSError] = js.native
  
  /**
    * Creates a new cross-cluster search connection from a source Amazon OpenSearch Service domain to a destination domain. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def createOutboundConnection(): Request[CreateOutboundConnectionResponse, AWSError] = js.native
  def createOutboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateOutboundConnectionResponse, Unit]): Request[CreateOutboundConnectionResponse, AWSError] = js.native
  /**
    * Creates a new cross-cluster search connection from a source Amazon OpenSearch Service domain to a destination domain. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def createOutboundConnection(params: CreateOutboundConnectionRequest): Request[CreateOutboundConnectionResponse, AWSError] = js.native
  def createOutboundConnection(
    params: CreateOutboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOutboundConnectionResponse, Unit]
  ): Request[CreateOutboundConnectionResponse, AWSError] = js.native
  
  /**
    * Creates a package for use with Amazon OpenSearch Service domains. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def createPackage(): Request[CreatePackageResponse, AWSError] = js.native
  def createPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageResponse, Unit]): Request[CreatePackageResponse, AWSError] = js.native
  /**
    * Creates a package for use with Amazon OpenSearch Service domains. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def createPackage(params: CreatePackageRequest): Request[CreatePackageResponse, AWSError] = js.native
  def createPackage(
    params: CreatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageResponse, Unit]
  ): Request[CreatePackageResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon OpenSearch Service-managed VPC endpoint.
    */
  def createVpcEndpoint(): Request[CreateVpcEndpointResponse, AWSError] = js.native
  def createVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointResponse, Unit]): Request[CreateVpcEndpointResponse, AWSError] = js.native
  /**
    * Creates an Amazon OpenSearch Service-managed VPC endpoint.
    */
  def createVpcEndpoint(params: CreateVpcEndpointRequest): Request[CreateVpcEndpointResponse, AWSError] = js.native
  def createVpcEndpoint(
    params: CreateVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVpcEndpointResponse, Unit]
  ): Request[CreateVpcEndpointResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon OpenSearch Service domain and all of its data. You can't recover a domain after you delete it.
    */
  def deleteDomain(): Request[DeleteDomainResponse, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResponse, Unit]): Request[DeleteDomainResponse, AWSError] = js.native
  /**
    * Deletes an Amazon OpenSearch Service domain and all of its data. You can't recover a domain after you delete it.
    */
  def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResponse, Unit]
  ): Request[DeleteDomainResponse, AWSError] = js.native
  
  /**
    * Allows the destination Amazon OpenSearch Service domain owner to delete an existing inbound cross-cluster search connection. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def deleteInboundConnection(): Request[DeleteInboundConnectionResponse, AWSError] = js.native
  def deleteInboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInboundConnectionResponse, Unit]): Request[DeleteInboundConnectionResponse, AWSError] = js.native
  /**
    * Allows the destination Amazon OpenSearch Service domain owner to delete an existing inbound cross-cluster search connection. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def deleteInboundConnection(params: DeleteInboundConnectionRequest): Request[DeleteInboundConnectionResponse, AWSError] = js.native
  def deleteInboundConnection(
    params: DeleteInboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInboundConnectionResponse, Unit]
  ): Request[DeleteInboundConnectionResponse, AWSError] = js.native
  
  /**
    * Allows the source Amazon OpenSearch Service domain owner to delete an existing outbound cross-cluster search connection. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def deleteOutboundConnection(): Request[DeleteOutboundConnectionResponse, AWSError] = js.native
  def deleteOutboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOutboundConnectionResponse, Unit]): Request[DeleteOutboundConnectionResponse, AWSError] = js.native
  /**
    * Allows the source Amazon OpenSearch Service domain owner to delete an existing outbound cross-cluster search connection. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def deleteOutboundConnection(params: DeleteOutboundConnectionRequest): Request[DeleteOutboundConnectionResponse, AWSError] = js.native
  def deleteOutboundConnection(
    params: DeleteOutboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOutboundConnectionResponse, Unit]
  ): Request[DeleteOutboundConnectionResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon OpenSearch Service package. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def deletePackage(): Request[DeletePackageResponse, AWSError] = js.native
  def deletePackage(callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageResponse, Unit]): Request[DeletePackageResponse, AWSError] = js.native
  /**
    * Deletes an Amazon OpenSearch Service package. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def deletePackage(params: DeletePackageRequest): Request[DeletePackageResponse, AWSError] = js.native
  def deletePackage(
    params: DeletePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageResponse, Unit]
  ): Request[DeletePackageResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon OpenSearch Service-managed interface VPC endpoint.
    */
  def deleteVpcEndpoint(): Request[DeleteVpcEndpointResponse, AWSError] = js.native
  def deleteVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointResponse, Unit]): Request[DeleteVpcEndpointResponse, AWSError] = js.native
  /**
    * Deletes an Amazon OpenSearch Service-managed interface VPC endpoint.
    */
  def deleteVpcEndpoint(params: DeleteVpcEndpointRequest): Request[DeleteVpcEndpointResponse, AWSError] = js.native
  def deleteVpcEndpoint(
    params: DeleteVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVpcEndpointResponse, Unit]
  ): Request[DeleteVpcEndpointResponse, AWSError] = js.native
  
  /**
    * Describes the domain configuration for the specified Amazon OpenSearch Service domain, including the domain ID, domain service endpoint, and domain ARN.
    */
  def describeDomain(): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]): Request[DescribeDomainResponse, AWSError] = js.native
  /**
    * Describes the domain configuration for the specified Amazon OpenSearch Service domain, including the domain ID, domain service endpoint, and domain ARN.
    */
  def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(
    params: DescribeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]
  ): Request[DescribeDomainResponse, AWSError] = js.native
  
  /**
    * Returns the list of optimizations that Auto-Tune has made to an Amazon OpenSearch Service domain. For more information, see Auto-Tune for Amazon OpenSearch Service.
    */
  def describeDomainAutoTunes(): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  def describeDomainAutoTunes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainAutoTunesResponse, Unit]): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  /**
    * Returns the list of optimizations that Auto-Tune has made to an Amazon OpenSearch Service domain. For more information, see Auto-Tune for Amazon OpenSearch Service.
    */
  def describeDomainAutoTunes(params: DescribeDomainAutoTunesRequest): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  def describeDomainAutoTunes(
    params: DescribeDomainAutoTunesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainAutoTunesResponse, Unit]
  ): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  
  /**
    * Returns information about the current blue/green deployment happening on an Amazon OpenSearch Service domain. For more information, see Making configuration changes in Amazon OpenSearch Service.
    */
  def describeDomainChangeProgress(): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  def describeDomainChangeProgress(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainChangeProgressResponse, Unit]): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  /**
    * Returns information about the current blue/green deployment happening on an Amazon OpenSearch Service domain. For more information, see Making configuration changes in Amazon OpenSearch Service.
    */
  def describeDomainChangeProgress(params: DescribeDomainChangeProgressRequest): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  def describeDomainChangeProgress(
    params: DescribeDomainChangeProgressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainChangeProgressResponse, Unit]
  ): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  
  /**
    * Returns the configuration of an Amazon OpenSearch Service domain.
    */
  def describeDomainConfig(): Request[DescribeDomainConfigResponse, AWSError] = js.native
  def describeDomainConfig(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainConfigResponse, Unit]): Request[DescribeDomainConfigResponse, AWSError] = js.native
  /**
    * Returns the configuration of an Amazon OpenSearch Service domain.
    */
  def describeDomainConfig(params: DescribeDomainConfigRequest): Request[DescribeDomainConfigResponse, AWSError] = js.native
  def describeDomainConfig(
    params: DescribeDomainConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainConfigResponse, Unit]
  ): Request[DescribeDomainConfigResponse, AWSError] = js.native
  
  /**
    * Returns information about domain and node health, the standby Availability Zone, number of nodes per Availability Zone, and shard count per node.
    */
  def describeDomainHealth(): Request[DescribeDomainHealthResponse, AWSError] = js.native
  def describeDomainHealth(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainHealthResponse, Unit]): Request[DescribeDomainHealthResponse, AWSError] = js.native
  /**
    * Returns information about domain and node health, the standby Availability Zone, number of nodes per Availability Zone, and shard count per node.
    */
  def describeDomainHealth(params: DescribeDomainHealthRequest): Request[DescribeDomainHealthResponse, AWSError] = js.native
  def describeDomainHealth(
    params: DescribeDomainHealthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainHealthResponse, Unit]
  ): Request[DescribeDomainHealthResponse, AWSError] = js.native
  
  /**
    * Returns information about domain and nodes, including data nodes, master nodes, ultrawarm nodes, Availability Zone(s), standby nodes, node configurations, and node states.
    */
  def describeDomainNodes(): Request[DescribeDomainNodesResponse, AWSError] = js.native
  def describeDomainNodes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainNodesResponse, Unit]): Request[DescribeDomainNodesResponse, AWSError] = js.native
  /**
    * Returns information about domain and nodes, including data nodes, master nodes, ultrawarm nodes, Availability Zone(s), standby nodes, node configurations, and node states.
    */
  def describeDomainNodes(params: DescribeDomainNodesRequest): Request[DescribeDomainNodesResponse, AWSError] = js.native
  def describeDomainNodes(
    params: DescribeDomainNodesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainNodesResponse, Unit]
  ): Request[DescribeDomainNodesResponse, AWSError] = js.native
  
  /**
    * Returns domain configuration information about the specified Amazon OpenSearch Service domains.
    */
  def describeDomains(): Request[DescribeDomainsResponse, AWSError] = js.native
  def describeDomains(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainsResponse, Unit]): Request[DescribeDomainsResponse, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Amazon OpenSearch Service domains.
    */
  def describeDomains(params: DescribeDomainsRequest): Request[DescribeDomainsResponse, AWSError] = js.native
  def describeDomains(
    params: DescribeDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainsResponse, Unit]
  ): Request[DescribeDomainsResponse, AWSError] = js.native
  
  /**
    * Describes the progress of a pre-update dry run analysis on an Amazon OpenSearch Service domain. For more information, see Determining whether a change will cause a blue/green deployment.
    */
  def describeDryRunProgress(): Request[DescribeDryRunProgressResponse, AWSError] = js.native
  def describeDryRunProgress(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDryRunProgressResponse, Unit]): Request[DescribeDryRunProgressResponse, AWSError] = js.native
  /**
    * Describes the progress of a pre-update dry run analysis on an Amazon OpenSearch Service domain. For more information, see Determining whether a change will cause a blue/green deployment.
    */
  def describeDryRunProgress(params: DescribeDryRunProgressRequest): Request[DescribeDryRunProgressResponse, AWSError] = js.native
  def describeDryRunProgress(
    params: DescribeDryRunProgressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDryRunProgressResponse, Unit]
  ): Request[DescribeDryRunProgressResponse, AWSError] = js.native
  
  /**
    * Lists all the inbound cross-cluster search connections for a destination (remote) Amazon OpenSearch Service domain. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def describeInboundConnections(): Request[DescribeInboundConnectionsResponse, AWSError] = js.native
  def describeInboundConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInboundConnectionsResponse, Unit]): Request[DescribeInboundConnectionsResponse, AWSError] = js.native
  /**
    * Lists all the inbound cross-cluster search connections for a destination (remote) Amazon OpenSearch Service domain. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def describeInboundConnections(params: DescribeInboundConnectionsRequest): Request[DescribeInboundConnectionsResponse, AWSError] = js.native
  def describeInboundConnections(
    params: DescribeInboundConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInboundConnectionsResponse, Unit]
  ): Request[DescribeInboundConnectionsResponse, AWSError] = js.native
  
  /**
    * Describes the instance count, storage, and master node limits for a given OpenSearch or Elasticsearch version and instance type.
    */
  def describeInstanceTypeLimits(): Request[DescribeInstanceTypeLimitsResponse, AWSError] = js.native
  def describeInstanceTypeLimits(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceTypeLimitsResponse, Unit]): Request[DescribeInstanceTypeLimitsResponse, AWSError] = js.native
  /**
    * Describes the instance count, storage, and master node limits for a given OpenSearch or Elasticsearch version and instance type.
    */
  def describeInstanceTypeLimits(params: DescribeInstanceTypeLimitsRequest): Request[DescribeInstanceTypeLimitsResponse, AWSError] = js.native
  def describeInstanceTypeLimits(
    params: DescribeInstanceTypeLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceTypeLimitsResponse, Unit]
  ): Request[DescribeInstanceTypeLimitsResponse, AWSError] = js.native
  
  /**
    * Lists all the outbound cross-cluster connections for a local (source) Amazon OpenSearch Service domain. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def describeOutboundConnections(): Request[DescribeOutboundConnectionsResponse, AWSError] = js.native
  def describeOutboundConnections(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOutboundConnectionsResponse, Unit]): Request[DescribeOutboundConnectionsResponse, AWSError] = js.native
  /**
    * Lists all the outbound cross-cluster connections for a local (source) Amazon OpenSearch Service domain. For more information, see Cross-cluster search for Amazon OpenSearch Service.
    */
  def describeOutboundConnections(params: DescribeOutboundConnectionsRequest): Request[DescribeOutboundConnectionsResponse, AWSError] = js.native
  def describeOutboundConnections(
    params: DescribeOutboundConnectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOutboundConnectionsResponse, Unit]
  ): Request[DescribeOutboundConnectionsResponse, AWSError] = js.native
  
  /**
    * Describes all packages available to OpenSearch Service. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def describePackages(): Request[DescribePackagesResponse, AWSError] = js.native
  def describePackages(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagesResponse, Unit]): Request[DescribePackagesResponse, AWSError] = js.native
  /**
    * Describes all packages available to OpenSearch Service. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def describePackages(params: DescribePackagesRequest): Request[DescribePackagesResponse, AWSError] = js.native
  def describePackages(
    params: DescribePackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagesResponse, Unit]
  ): Request[DescribePackagesResponse, AWSError] = js.native
  
  /**
    * Describes the available Amazon OpenSearch Service Reserved Instance offerings for a given Region. For more information, see Reserved Instances in Amazon OpenSearch Service.
    */
  def describeReservedInstanceOfferings(): Request[DescribeReservedInstanceOfferingsResponse, AWSError] = js.native
  def describeReservedInstanceOfferings(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstanceOfferingsResponse, Unit]
  ): Request[DescribeReservedInstanceOfferingsResponse, AWSError] = js.native
  /**
    * Describes the available Amazon OpenSearch Service Reserved Instance offerings for a given Region. For more information, see Reserved Instances in Amazon OpenSearch Service.
    */
  def describeReservedInstanceOfferings(params: DescribeReservedInstanceOfferingsRequest): Request[DescribeReservedInstanceOfferingsResponse, AWSError] = js.native
  def describeReservedInstanceOfferings(
    params: DescribeReservedInstanceOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstanceOfferingsResponse, Unit]
  ): Request[DescribeReservedInstanceOfferingsResponse, AWSError] = js.native
  
  /**
    * Describes the Amazon OpenSearch Service instances that you have reserved in a given Region. For more information, see Reserved Instances in Amazon OpenSearch Service.
    */
  def describeReservedInstances(): Request[DescribeReservedInstancesResponse, AWSError] = js.native
  def describeReservedInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesResponse, Unit]): Request[DescribeReservedInstancesResponse, AWSError] = js.native
  /**
    * Describes the Amazon OpenSearch Service instances that you have reserved in a given Region. For more information, see Reserved Instances in Amazon OpenSearch Service.
    */
  def describeReservedInstances(params: DescribeReservedInstancesRequest): Request[DescribeReservedInstancesResponse, AWSError] = js.native
  def describeReservedInstances(
    params: DescribeReservedInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedInstancesResponse, Unit]
  ): Request[DescribeReservedInstancesResponse, AWSError] = js.native
  
  /**
    * Describes one or more Amazon OpenSearch Service-managed VPC endpoints.
    */
  def describeVpcEndpoints(): Request[DescribeVpcEndpointsResponse, AWSError] = js.native
  def describeVpcEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointsResponse, Unit]): Request[DescribeVpcEndpointsResponse, AWSError] = js.native
  /**
    * Describes one or more Amazon OpenSearch Service-managed VPC endpoints.
    */
  def describeVpcEndpoints(params: DescribeVpcEndpointsRequest): Request[DescribeVpcEndpointsResponse, AWSError] = js.native
  def describeVpcEndpoints(
    params: DescribeVpcEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVpcEndpointsResponse, Unit]
  ): Request[DescribeVpcEndpointsResponse, AWSError] = js.native
  
  /**
    * Removes a package from the specified Amazon OpenSearch Service domain. The package can't be in use with any OpenSearch index for the dissociation to succeed. The package is still available in OpenSearch Service for association later. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def dissociatePackage(): Request[DissociatePackageResponse, AWSError] = js.native
  def dissociatePackage(callback: js.Function2[/* err */ AWSError, /* data */ DissociatePackageResponse, Unit]): Request[DissociatePackageResponse, AWSError] = js.native
  /**
    * Removes a package from the specified Amazon OpenSearch Service domain. The package can't be in use with any OpenSearch index for the dissociation to succeed. The package is still available in OpenSearch Service for association later. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def dissociatePackage(params: DissociatePackageRequest): Request[DissociatePackageResponse, AWSError] = js.native
  def dissociatePackage(
    params: DissociatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DissociatePackageResponse, Unit]
  ): Request[DissociatePackageResponse, AWSError] = js.native
  
  /**
    * Returns a map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
    */
  def getCompatibleVersions(): Request[GetCompatibleVersionsResponse, AWSError] = js.native
  def getCompatibleVersions(callback: js.Function2[/* err */ AWSError, /* data */ GetCompatibleVersionsResponse, Unit]): Request[GetCompatibleVersionsResponse, AWSError] = js.native
  /**
    * Returns a map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
    */
  def getCompatibleVersions(params: GetCompatibleVersionsRequest): Request[GetCompatibleVersionsResponse, AWSError] = js.native
  def getCompatibleVersions(
    params: GetCompatibleVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCompatibleVersionsResponse, Unit]
  ): Request[GetCompatibleVersionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of Amazon OpenSearch Service package versions, along with their creation time, commit message, and plugin properties (if the package is a zip plugin package). For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def getPackageVersionHistory(): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  def getPackageVersionHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionHistoryResponse, Unit]): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  /**
    * Returns a list of Amazon OpenSearch Service package versions, along with their creation time, commit message, and plugin properties (if the package is a zip plugin package). For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def getPackageVersionHistory(params: GetPackageVersionHistoryRequest): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  def getPackageVersionHistory(
    params: GetPackageVersionHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionHistoryResponse, Unit]
  ): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves the complete history of the last 10 upgrades performed on an Amazon OpenSearch Service domain.
    */
  def getUpgradeHistory(): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  def getUpgradeHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeHistoryResponse, Unit]): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  /**
    * Retrieves the complete history of the last 10 upgrades performed on an Amazon OpenSearch Service domain.
    */
  def getUpgradeHistory(params: GetUpgradeHistoryRequest): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  def getUpgradeHistory(
    params: GetUpgradeHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeHistoryResponse, Unit]
  ): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  
  /**
    * Returns the most recent status of the last upgrade or upgrade eligibility check performed on an Amazon OpenSearch Service domain.
    */
  def getUpgradeStatus(): Request[GetUpgradeStatusResponse, AWSError] = js.native
  def getUpgradeStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeStatusResponse, Unit]): Request[GetUpgradeStatusResponse, AWSError] = js.native
  /**
    * Returns the most recent status of the last upgrade or upgrade eligibility check performed on an Amazon OpenSearch Service domain.
    */
  def getUpgradeStatus(params: GetUpgradeStatusRequest): Request[GetUpgradeStatusResponse, AWSError] = js.native
  def getUpgradeStatus(
    params: GetUpgradeStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeStatusResponse, Unit]
  ): Request[GetUpgradeStatusResponse, AWSError] = js.native
  
  /**
    * Returns the names of all Amazon OpenSearch Service domains owned by the current user in the active Region.
    */
  def listDomainNames(): Request[ListDomainNamesResponse, AWSError] = js.native
  def listDomainNames(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainNamesResponse, Unit]): Request[ListDomainNamesResponse, AWSError] = js.native
  /**
    * Returns the names of all Amazon OpenSearch Service domains owned by the current user in the active Region.
    */
  def listDomainNames(params: ListDomainNamesRequest): Request[ListDomainNamesResponse, AWSError] = js.native
  def listDomainNames(
    params: ListDomainNamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainNamesResponse, Unit]
  ): Request[ListDomainNamesResponse, AWSError] = js.native
  
  /**
    * Lists all Amazon OpenSearch Service domains associated with a given package. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def listDomainsForPackage(): Request[ListDomainsForPackageResponse, AWSError] = js.native
  def listDomainsForPackage(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsForPackageResponse, Unit]): Request[ListDomainsForPackageResponse, AWSError] = js.native
  /**
    * Lists all Amazon OpenSearch Service domains associated with a given package. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def listDomainsForPackage(params: ListDomainsForPackageRequest): Request[ListDomainsForPackageResponse, AWSError] = js.native
  def listDomainsForPackage(
    params: ListDomainsForPackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsForPackageResponse, Unit]
  ): Request[ListDomainsForPackageResponse, AWSError] = js.native
  
  /**
    * Lists all instance types and available features for a given OpenSearch or Elasticsearch version.
    */
  def listInstanceTypeDetails(): Request[ListInstanceTypeDetailsResponse, AWSError] = js.native
  def listInstanceTypeDetails(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceTypeDetailsResponse, Unit]): Request[ListInstanceTypeDetailsResponse, AWSError] = js.native
  /**
    * Lists all instance types and available features for a given OpenSearch or Elasticsearch version.
    */
  def listInstanceTypeDetails(params: ListInstanceTypeDetailsRequest): Request[ListInstanceTypeDetailsResponse, AWSError] = js.native
  def listInstanceTypeDetails(
    params: ListInstanceTypeDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceTypeDetailsResponse, Unit]
  ): Request[ListInstanceTypeDetailsResponse, AWSError] = js.native
  
  /**
    * Lists all packages associated with an Amazon OpenSearch Service domain. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def listPackagesForDomain(): Request[ListPackagesForDomainResponse, AWSError] = js.native
  def listPackagesForDomain(callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesForDomainResponse, Unit]): Request[ListPackagesForDomainResponse, AWSError] = js.native
  /**
    * Lists all packages associated with an Amazon OpenSearch Service domain. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def listPackagesForDomain(params: ListPackagesForDomainRequest): Request[ListPackagesForDomainResponse, AWSError] = js.native
  def listPackagesForDomain(
    params: ListPackagesForDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesForDomainResponse, Unit]
  ): Request[ListPackagesForDomainResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of configuration changes that are scheduled for a domain. These changes can be service software updates or blue/green Auto-Tune enhancements.
    */
  def listScheduledActions(): Request[ListScheduledActionsResponse, AWSError] = js.native
  def listScheduledActions(callback: js.Function2[/* err */ AWSError, /* data */ ListScheduledActionsResponse, Unit]): Request[ListScheduledActionsResponse, AWSError] = js.native
  /**
    * Retrieves a list of configuration changes that are scheduled for a domain. These changes can be service software updates or blue/green Auto-Tune enhancements.
    */
  def listScheduledActions(params: ListScheduledActionsRequest): Request[ListScheduledActionsResponse, AWSError] = js.native
  def listScheduledActions(
    params: ListScheduledActionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListScheduledActionsResponse, Unit]
  ): Request[ListScheduledActionsResponse, AWSError] = js.native
  
  /**
    * Returns all resource tags for an Amazon OpenSearch Service domain. For more information, see Tagging Amazon OpenSearch Service domains.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Returns all resource tags for an Amazon OpenSearch Service domain. For more information, see Tagging Amazon OpenSearch Service domains.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * Lists all versions of OpenSearch and Elasticsearch that Amazon OpenSearch Service supports.
    */
  def listVersions(): Request[ListVersionsResponse, AWSError] = js.native
  def listVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListVersionsResponse, Unit]): Request[ListVersionsResponse, AWSError] = js.native
  /**
    * Lists all versions of OpenSearch and Elasticsearch that Amazon OpenSearch Service supports.
    */
  def listVersions(params: ListVersionsRequest): Request[ListVersionsResponse, AWSError] = js.native
  def listVersions(
    params: ListVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVersionsResponse, Unit]
  ): Request[ListVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves information about each Amazon Web Services principal that is allowed to access a given Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
    */
  def listVpcEndpointAccess(): Request[ListVpcEndpointAccessResponse, AWSError] = js.native
  def listVpcEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointAccessResponse, Unit]): Request[ListVpcEndpointAccessResponse, AWSError] = js.native
  /**
    * Retrieves information about each Amazon Web Services principal that is allowed to access a given Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
    */
  def listVpcEndpointAccess(params: ListVpcEndpointAccessRequest): Request[ListVpcEndpointAccessResponse, AWSError] = js.native
  def listVpcEndpointAccess(
    params: ListVpcEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointAccessResponse, Unit]
  ): Request[ListVpcEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Retrieves all Amazon OpenSearch Service-managed VPC endpoints in the current Amazon Web Services account and Region.
    */
  def listVpcEndpoints(): Request[ListVpcEndpointsResponse, AWSError] = js.native
  def listVpcEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointsResponse, Unit]): Request[ListVpcEndpointsResponse, AWSError] = js.native
  /**
    * Retrieves all Amazon OpenSearch Service-managed VPC endpoints in the current Amazon Web Services account and Region.
    */
  def listVpcEndpoints(params: ListVpcEndpointsRequest): Request[ListVpcEndpointsResponse, AWSError] = js.native
  def listVpcEndpoints(
    params: ListVpcEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointsResponse, Unit]
  ): Request[ListVpcEndpointsResponse, AWSError] = js.native
  
  /**
    * Retrieves all Amazon OpenSearch Service-managed VPC endpoints associated with a particular domain.
    */
  def listVpcEndpointsForDomain(): Request[ListVpcEndpointsForDomainResponse, AWSError] = js.native
  def listVpcEndpointsForDomain(callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointsForDomainResponse, Unit]): Request[ListVpcEndpointsForDomainResponse, AWSError] = js.native
  /**
    * Retrieves all Amazon OpenSearch Service-managed VPC endpoints associated with a particular domain.
    */
  def listVpcEndpointsForDomain(params: ListVpcEndpointsForDomainRequest): Request[ListVpcEndpointsForDomainResponse, AWSError] = js.native
  def listVpcEndpointsForDomain(
    params: ListVpcEndpointsForDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointsForDomainResponse, Unit]
  ): Request[ListVpcEndpointsForDomainResponse, AWSError] = js.native
  
  /**
    * Allows you to purchase Amazon OpenSearch Service Reserved Instances.
    */
  def purchaseReservedInstanceOffering(): Request[PurchaseReservedInstanceOfferingResponse, AWSError] = js.native
  def purchaseReservedInstanceOffering(
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedInstanceOfferingResponse, Unit]
  ): Request[PurchaseReservedInstanceOfferingResponse, AWSError] = js.native
  /**
    * Allows you to purchase Amazon OpenSearch Service Reserved Instances.
    */
  def purchaseReservedInstanceOffering(params: PurchaseReservedInstanceOfferingRequest): Request[PurchaseReservedInstanceOfferingResponse, AWSError] = js.native
  def purchaseReservedInstanceOffering(
    params: PurchaseReservedInstanceOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedInstanceOfferingResponse, Unit]
  ): Request[PurchaseReservedInstanceOfferingResponse, AWSError] = js.native
  
  /**
    * Allows the remote Amazon OpenSearch Service domain owner to reject an inbound cross-cluster connection request.
    */
  def rejectInboundConnection(): Request[RejectInboundConnectionResponse, AWSError] = js.native
  def rejectInboundConnection(callback: js.Function2[/* err */ AWSError, /* data */ RejectInboundConnectionResponse, Unit]): Request[RejectInboundConnectionResponse, AWSError] = js.native
  /**
    * Allows the remote Amazon OpenSearch Service domain owner to reject an inbound cross-cluster connection request.
    */
  def rejectInboundConnection(params: RejectInboundConnectionRequest): Request[RejectInboundConnectionResponse, AWSError] = js.native
  def rejectInboundConnection(
    params: RejectInboundConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectInboundConnectionResponse, Unit]
  ): Request[RejectInboundConnectionResponse, AWSError] = js.native
  
  /**
    * Removes the specified set of tags from an Amazon OpenSearch Service domain. For more information, see  Tagging Amazon OpenSearch Service domains.
    */
  def removeTags(): Request[js.Object, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified set of tags from an Amazon OpenSearch Service domain. For more information, see  Tagging Amazon OpenSearch Service domains.
    */
  def removeTags(params: RemoveTagsRequest): Request[js.Object, AWSError] = js.native
  def removeTags(params: RemoveTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Revokes access to an Amazon OpenSearch Service domain that was provided through an interface VPC endpoint.
    */
  def revokeVpcEndpointAccess(): Request[RevokeVpcEndpointAccessResponse, AWSError] = js.native
  def revokeVpcEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ RevokeVpcEndpointAccessResponse, Unit]): Request[RevokeVpcEndpointAccessResponse, AWSError] = js.native
  /**
    * Revokes access to an Amazon OpenSearch Service domain that was provided through an interface VPC endpoint.
    */
  def revokeVpcEndpointAccess(params: RevokeVpcEndpointAccessRequest): Request[RevokeVpcEndpointAccessResponse, AWSError] = js.native
  def revokeVpcEndpointAccess(
    params: RevokeVpcEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeVpcEndpointAccessResponse, Unit]
  ): Request[RevokeVpcEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Schedules a service software update for an Amazon OpenSearch Service domain. For more information, see Service software updates in Amazon OpenSearch Service.
    */
  def startServiceSoftwareUpdate(): Request[StartServiceSoftwareUpdateResponse, AWSError] = js.native
  def startServiceSoftwareUpdate(callback: js.Function2[/* err */ AWSError, /* data */ StartServiceSoftwareUpdateResponse, Unit]): Request[StartServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Schedules a service software update for an Amazon OpenSearch Service domain. For more information, see Service software updates in Amazon OpenSearch Service.
    */
  def startServiceSoftwareUpdate(params: StartServiceSoftwareUpdateRequest): Request[StartServiceSoftwareUpdateResponse, AWSError] = js.native
  def startServiceSoftwareUpdate(
    params: StartServiceSoftwareUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartServiceSoftwareUpdateResponse, Unit]
  ): Request[StartServiceSoftwareUpdateResponse, AWSError] = js.native
  
  /**
    * Modifies the cluster configuration of the specified Amazon OpenSearch Service domain.sl
    */
  def updateDomainConfig(): Request[UpdateDomainConfigResponse, AWSError] = js.native
  def updateDomainConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainConfigResponse, Unit]): Request[UpdateDomainConfigResponse, AWSError] = js.native
  /**
    * Modifies the cluster configuration of the specified Amazon OpenSearch Service domain.sl
    */
  def updateDomainConfig(params: UpdateDomainConfigRequest): Request[UpdateDomainConfigResponse, AWSError] = js.native
  def updateDomainConfig(
    params: UpdateDomainConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainConfigResponse, Unit]
  ): Request[UpdateDomainConfigResponse, AWSError] = js.native
  
  /**
    * Updates a package for use with Amazon OpenSearch Service domains. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def updatePackage(): Request[UpdatePackageResponse, AWSError] = js.native
  def updatePackage(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackageResponse, Unit]): Request[UpdatePackageResponse, AWSError] = js.native
  /**
    * Updates a package for use with Amazon OpenSearch Service domains. For more information, see Custom packages for Amazon OpenSearch Service.
    */
  def updatePackage(params: UpdatePackageRequest): Request[UpdatePackageResponse, AWSError] = js.native
  def updatePackage(
    params: UpdatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackageResponse, Unit]
  ): Request[UpdatePackageResponse, AWSError] = js.native
  
  /**
    * Reschedules a planned domain configuration change for a later time. This change can be a scheduled service software update or a blue/green Auto-Tune enhancement.
    */
  def updateScheduledAction(): Request[UpdateScheduledActionResponse, AWSError] = js.native
  def updateScheduledAction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduledActionResponse, Unit]): Request[UpdateScheduledActionResponse, AWSError] = js.native
  /**
    * Reschedules a planned domain configuration change for a later time. This change can be a scheduled service software update or a blue/green Auto-Tune enhancement.
    */
  def updateScheduledAction(params: UpdateScheduledActionRequest): Request[UpdateScheduledActionResponse, AWSError] = js.native
  def updateScheduledAction(
    params: UpdateScheduledActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduledActionResponse, Unit]
  ): Request[UpdateScheduledActionResponse, AWSError] = js.native
  
  /**
    * Modifies an Amazon OpenSearch Service-managed interface VPC endpoint.
    */
  def updateVpcEndpoint(): Request[UpdateVpcEndpointResponse, AWSError] = js.native
  def updateVpcEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVpcEndpointResponse, Unit]): Request[UpdateVpcEndpointResponse, AWSError] = js.native
  /**
    * Modifies an Amazon OpenSearch Service-managed interface VPC endpoint.
    */
  def updateVpcEndpoint(params: UpdateVpcEndpointRequest): Request[UpdateVpcEndpointResponse, AWSError] = js.native
  def updateVpcEndpoint(
    params: UpdateVpcEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVpcEndpointResponse, Unit]
  ): Request[UpdateVpcEndpointResponse, AWSError] = js.native
  
  /**
    * Allows you to either upgrade your Amazon OpenSearch Service domain or perform an upgrade eligibility check to a compatible version of OpenSearch or Elasticsearch.
    */
  def upgradeDomain(): Request[UpgradeDomainResponse, AWSError] = js.native
  def upgradeDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpgradeDomainResponse, Unit]): Request[UpgradeDomainResponse, AWSError] = js.native
  /**
    * Allows you to either upgrade your Amazon OpenSearch Service domain or perform an upgrade eligibility check to a compatible version of OpenSearch or Elasticsearch.
    */
  def upgradeDomain(params: UpgradeDomainRequest): Request[UpgradeDomainResponse, AWSError] = js.native
  def upgradeDomain(
    params: UpgradeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpgradeDomainResponse, Unit]
  ): Request[UpgradeDomainResponse, AWSError] = js.native
}
