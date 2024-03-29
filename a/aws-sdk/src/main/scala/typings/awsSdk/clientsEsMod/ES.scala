package typings.awsSdk.clientsEsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ES extends Service {
  
  /**
    * Allows the destination domain owner to accept an inbound cross-cluster search connection request.
    */
  def acceptInboundCrossClusterSearchConnection(): Request[AcceptInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def acceptInboundCrossClusterSearchConnection(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AcceptInboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[AcceptInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  /**
    * Allows the destination domain owner to accept an inbound cross-cluster search connection request.
    */
  def acceptInboundCrossClusterSearchConnection(params: AcceptInboundCrossClusterSearchConnectionRequest): Request[AcceptInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def acceptInboundCrossClusterSearchConnection(
    params: AcceptInboundCrossClusterSearchConnectionRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AcceptInboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[AcceptInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  
  /**
    * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
    */
  def addTags(): Request[js.Object, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.
    */
  def addTags(params: AddTagsRequest): Request[js.Object, AWSError] = js.native
  def addTags(params: AddTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a package with an Amazon ES domain.
    */
  def associatePackage(): Request[AssociatePackageResponse, AWSError] = js.native
  def associatePackage(callback: js.Function2[/* err */ AWSError, /* data */ AssociatePackageResponse, Unit]): Request[AssociatePackageResponse, AWSError] = js.native
  /**
    * Associates a package with an Amazon ES domain.
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
    * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
    */
  def cancelElasticsearchServiceSoftwareUpdate(): Request[CancelElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  def cancelElasticsearchServiceSoftwareUpdate(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CancelElasticsearchServiceSoftwareUpdateResponse, 
      Unit
    ]
  ): Request[CancelElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE state.
    */
  def cancelElasticsearchServiceSoftwareUpdate(params: CancelElasticsearchServiceSoftwareUpdateRequest): Request[CancelElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  def cancelElasticsearchServiceSoftwareUpdate(
    params: CancelElasticsearchServiceSoftwareUpdateRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CancelElasticsearchServiceSoftwareUpdateResponse, 
      Unit
    ]
  ): Request[CancelElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ES: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  def createElasticsearchDomain(): Request[CreateElasticsearchDomainResponse, AWSError] = js.native
  def createElasticsearchDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateElasticsearchDomainResponse, Unit]): Request[CreateElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  def createElasticsearchDomain(params: CreateElasticsearchDomainRequest): Request[CreateElasticsearchDomainResponse, AWSError] = js.native
  def createElasticsearchDomain(
    params: CreateElasticsearchDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateElasticsearchDomainResponse, Unit]
  ): Request[CreateElasticsearchDomainResponse, AWSError] = js.native
  
  /**
    * Creates a new cross-cluster search connection from a source domain to a destination domain.
    */
  def createOutboundCrossClusterSearchConnection(): Request[CreateOutboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def createOutboundCrossClusterSearchConnection(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateOutboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[CreateOutboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  /**
    * Creates a new cross-cluster search connection from a source domain to a destination domain.
    */
  def createOutboundCrossClusterSearchConnection(params: CreateOutboundCrossClusterSearchConnectionRequest): Request[CreateOutboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def createOutboundCrossClusterSearchConnection(
    params: CreateOutboundCrossClusterSearchConnectionRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateOutboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[CreateOutboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  
  /**
    * Create a package for use with Amazon ES domains.
    */
  def createPackage(): Request[CreatePackageResponse, AWSError] = js.native
  def createPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreatePackageResponse, Unit]): Request[CreatePackageResponse, AWSError] = js.native
  /**
    * Create a package for use with Amazon ES domains.
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
    * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
    */
  def deleteElasticsearchDomain(): Request[DeleteElasticsearchDomainResponse, AWSError] = js.native
  def deleteElasticsearchDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteElasticsearchDomainResponse, Unit]): Request[DeleteElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot be recovered.
    */
  def deleteElasticsearchDomain(params: DeleteElasticsearchDomainRequest): Request[DeleteElasticsearchDomainResponse, AWSError] = js.native
  def deleteElasticsearchDomain(
    params: DeleteElasticsearchDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteElasticsearchDomainResponse, Unit]
  ): Request[DeleteElasticsearchDomainResponse, AWSError] = js.native
  
  /**
    * Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  def deleteElasticsearchServiceRole(): Request[js.Object, AWSError] = js.native
  def deleteElasticsearchServiceRole(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Allows the destination domain owner to delete an existing inbound cross-cluster search connection.
    */
  def deleteInboundCrossClusterSearchConnection(): Request[DeleteInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def deleteInboundCrossClusterSearchConnection(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteInboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[DeleteInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  /**
    * Allows the destination domain owner to delete an existing inbound cross-cluster search connection.
    */
  def deleteInboundCrossClusterSearchConnection(params: DeleteInboundCrossClusterSearchConnectionRequest): Request[DeleteInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def deleteInboundCrossClusterSearchConnection(
    params: DeleteInboundCrossClusterSearchConnectionRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteInboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[DeleteInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  
  /**
    * Allows the source domain owner to delete an existing outbound cross-cluster search connection.
    */
  def deleteOutboundCrossClusterSearchConnection(): Request[DeleteOutboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def deleteOutboundCrossClusterSearchConnection(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteOutboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[DeleteOutboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  /**
    * Allows the source domain owner to delete an existing outbound cross-cluster search connection.
    */
  def deleteOutboundCrossClusterSearchConnection(params: DeleteOutboundCrossClusterSearchConnectionRequest): Request[DeleteOutboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def deleteOutboundCrossClusterSearchConnection(
    params: DeleteOutboundCrossClusterSearchConnectionRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteOutboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[DeleteOutboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  
  /**
    * Delete the package.
    */
  def deletePackage(): Request[DeletePackageResponse, AWSError] = js.native
  def deletePackage(callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageResponse, Unit]): Request[DeletePackageResponse, AWSError] = js.native
  /**
    * Delete the package.
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
    * Provides scheduled Auto-Tune action details for the Elasticsearch domain, such as Auto-Tune action type, description, severity, and scheduled date.
    */
  def describeDomainAutoTunes(): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  def describeDomainAutoTunes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainAutoTunesResponse, Unit]): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  /**
    * Provides scheduled Auto-Tune action details for the Elasticsearch domain, such as Auto-Tune action type, description, severity, and scheduled date.
    */
  def describeDomainAutoTunes(params: DescribeDomainAutoTunesRequest): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  def describeDomainAutoTunes(
    params: DescribeDomainAutoTunesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainAutoTunesResponse, Unit]
  ): Request[DescribeDomainAutoTunesResponse, AWSError] = js.native
  
  /**
    * Returns information about the current blue/green deployment happening on a domain, including a change ID, status, and progress stages.
    */
  def describeDomainChangeProgress(): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  def describeDomainChangeProgress(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainChangeProgressResponse, Unit]): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  /**
    * Returns information about the current blue/green deployment happening on a domain, including a change ID, status, and progress stages.
    */
  def describeDomainChangeProgress(params: DescribeDomainChangeProgressRequest): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  def describeDomainChangeProgress(
    params: DescribeDomainChangeProgressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainChangeProgressResponse, Unit]
  ): Request[DescribeDomainChangeProgressResponse, AWSError] = js.native
  
  /**
    * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomain(): Request[DescribeElasticsearchDomainResponse, AWSError] = js.native
  def describeElasticsearchDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainResponse, Unit]): Request[DescribeElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domain, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomain(params: DescribeElasticsearchDomainRequest): Request[DescribeElasticsearchDomainResponse, AWSError] = js.native
  def describeElasticsearchDomain(
    params: DescribeElasticsearchDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainResponse, Unit]
  ): Request[DescribeElasticsearchDomainResponse, AWSError] = js.native
  
  /**
    * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
    */
  def describeElasticsearchDomainConfig(): Request[DescribeElasticsearchDomainConfigResponse, AWSError] = js.native
  def describeElasticsearchDomainConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainConfigResponse, Unit]
  ): Request[DescribeElasticsearchDomainConfigResponse, AWSError] = js.native
  /**
    * Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation date, update version, and update date for cluster options.
    */
  def describeElasticsearchDomainConfig(params: DescribeElasticsearchDomainConfigRequest): Request[DescribeElasticsearchDomainConfigResponse, AWSError] = js.native
  def describeElasticsearchDomainConfig(
    params: DescribeElasticsearchDomainConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainConfigResponse, Unit]
  ): Request[DescribeElasticsearchDomainConfigResponse, AWSError] = js.native
  
  /**
    * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomains(): Request[DescribeElasticsearchDomainsResponse, AWSError] = js.native
  def describeElasticsearchDomains(callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainsResponse, Unit]): Request[DescribeElasticsearchDomainsResponse, AWSError] = js.native
  /**
    * Returns domain configuration information about the specified Elasticsearch domains, including the domain ID, domain endpoint, and domain ARN.
    */
  def describeElasticsearchDomains(params: DescribeElasticsearchDomainsRequest): Request[DescribeElasticsearchDomainsResponse, AWSError] = js.native
  def describeElasticsearchDomains(
    params: DescribeElasticsearchDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchDomainsResponse, Unit]
  ): Request[DescribeElasticsearchDomainsResponse, AWSError] = js.native
  
  /**
    *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
    */
  def describeElasticsearchInstanceTypeLimits(): Request[DescribeElasticsearchInstanceTypeLimitsResponse, AWSError] = js.native
  def describeElasticsearchInstanceTypeLimits(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchInstanceTypeLimitsResponse, Unit]
  ): Request[DescribeElasticsearchInstanceTypeLimitsResponse, AWSError] = js.native
  /**
    *  Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain, specify the  DomainName  to know what Limits are supported for modifying. 
    */
  def describeElasticsearchInstanceTypeLimits(params: DescribeElasticsearchInstanceTypeLimitsRequest): Request[DescribeElasticsearchInstanceTypeLimitsResponse, AWSError] = js.native
  def describeElasticsearchInstanceTypeLimits(
    params: DescribeElasticsearchInstanceTypeLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticsearchInstanceTypeLimitsResponse, Unit]
  ): Request[DescribeElasticsearchInstanceTypeLimitsResponse, AWSError] = js.native
  
  /**
    * Lists all the inbound cross-cluster search connections for a destination domain.
    */
  def describeInboundCrossClusterSearchConnections(): Request[DescribeInboundCrossClusterSearchConnectionsResponse, AWSError] = js.native
  def describeInboundCrossClusterSearchConnections(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeInboundCrossClusterSearchConnectionsResponse, 
      Unit
    ]
  ): Request[DescribeInboundCrossClusterSearchConnectionsResponse, AWSError] = js.native
  /**
    * Lists all the inbound cross-cluster search connections for a destination domain.
    */
  def describeInboundCrossClusterSearchConnections(params: DescribeInboundCrossClusterSearchConnectionsRequest): Request[DescribeInboundCrossClusterSearchConnectionsResponse, AWSError] = js.native
  def describeInboundCrossClusterSearchConnections(
    params: DescribeInboundCrossClusterSearchConnectionsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeInboundCrossClusterSearchConnectionsResponse, 
      Unit
    ]
  ): Request[DescribeInboundCrossClusterSearchConnectionsResponse, AWSError] = js.native
  
  /**
    * Lists all the outbound cross-cluster search connections for a source domain.
    */
  def describeOutboundCrossClusterSearchConnections(): Request[DescribeOutboundCrossClusterSearchConnectionsResponse, AWSError] = js.native
  def describeOutboundCrossClusterSearchConnections(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeOutboundCrossClusterSearchConnectionsResponse, 
      Unit
    ]
  ): Request[DescribeOutboundCrossClusterSearchConnectionsResponse, AWSError] = js.native
  /**
    * Lists all the outbound cross-cluster search connections for a source domain.
    */
  def describeOutboundCrossClusterSearchConnections(params: DescribeOutboundCrossClusterSearchConnectionsRequest): Request[DescribeOutboundCrossClusterSearchConnectionsResponse, AWSError] = js.native
  def describeOutboundCrossClusterSearchConnections(
    params: DescribeOutboundCrossClusterSearchConnectionsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeOutboundCrossClusterSearchConnectionsResponse, 
      Unit
    ]
  ): Request[DescribeOutboundCrossClusterSearchConnectionsResponse, AWSError] = js.native
  
  /**
    * Describes all packages available to Amazon ES. Includes options for filtering, limiting the number of results, and pagination.
    */
  def describePackages(): Request[DescribePackagesResponse, AWSError] = js.native
  def describePackages(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagesResponse, Unit]): Request[DescribePackagesResponse, AWSError] = js.native
  /**
    * Describes all packages available to Amazon ES. Includes options for filtering, limiting the number of results, and pagination.
    */
  def describePackages(params: DescribePackagesRequest): Request[DescribePackagesResponse, AWSError] = js.native
  def describePackages(
    params: DescribePackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackagesResponse, Unit]
  ): Request[DescribePackagesResponse, AWSError] = js.native
  
  /**
    * Lists available reserved Elasticsearch instance offerings.
    */
  def describeReservedElasticsearchInstanceOfferings(): Request[DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError] = js.native
  def describeReservedElasticsearchInstanceOfferings(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReservedElasticsearchInstanceOfferingsResponse, 
      Unit
    ]
  ): Request[DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError] = js.native
  /**
    * Lists available reserved Elasticsearch instance offerings.
    */
  def describeReservedElasticsearchInstanceOfferings(params: DescribeReservedElasticsearchInstanceOfferingsRequest): Request[DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError] = js.native
  def describeReservedElasticsearchInstanceOfferings(
    params: DescribeReservedElasticsearchInstanceOfferingsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReservedElasticsearchInstanceOfferingsResponse, 
      Unit
    ]
  ): Request[DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError] = js.native
  
  /**
    * Returns information about reserved Elasticsearch instances for this account.
    */
  def describeReservedElasticsearchInstances(): Request[DescribeReservedElasticsearchInstancesResponse, AWSError] = js.native
  def describeReservedElasticsearchInstances(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedElasticsearchInstancesResponse, Unit]
  ): Request[DescribeReservedElasticsearchInstancesResponse, AWSError] = js.native
  /**
    * Returns information about reserved Elasticsearch instances for this account.
    */
  def describeReservedElasticsearchInstances(params: DescribeReservedElasticsearchInstancesRequest): Request[DescribeReservedElasticsearchInstancesResponse, AWSError] = js.native
  def describeReservedElasticsearchInstances(
    params: DescribeReservedElasticsearchInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservedElasticsearchInstancesResponse, Unit]
  ): Request[DescribeReservedElasticsearchInstancesResponse, AWSError] = js.native
  
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
    * Dissociates a package from the Amazon ES domain.
    */
  def dissociatePackage(): Request[DissociatePackageResponse, AWSError] = js.native
  def dissociatePackage(callback: js.Function2[/* err */ AWSError, /* data */ DissociatePackageResponse, Unit]): Request[DissociatePackageResponse, AWSError] = js.native
  /**
    * Dissociates a package from the Amazon ES domain.
    */
  def dissociatePackage(params: DissociatePackageRequest): Request[DissociatePackageResponse, AWSError] = js.native
  def dissociatePackage(
    params: DissociatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DissociatePackageResponse, Unit]
  ): Request[DissociatePackageResponse, AWSError] = js.native
  
  /**
    *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
    */
  def getCompatibleElasticsearchVersions(): Request[GetCompatibleElasticsearchVersionsResponse, AWSError] = js.native
  def getCompatibleElasticsearchVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCompatibleElasticsearchVersionsResponse, Unit]
  ): Request[GetCompatibleElasticsearchVersionsResponse, AWSError] = js.native
  /**
    *  Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a  DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain. 
    */
  def getCompatibleElasticsearchVersions(params: GetCompatibleElasticsearchVersionsRequest): Request[GetCompatibleElasticsearchVersionsResponse, AWSError] = js.native
  def getCompatibleElasticsearchVersions(
    params: GetCompatibleElasticsearchVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCompatibleElasticsearchVersionsResponse, Unit]
  ): Request[GetCompatibleElasticsearchVersionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of versions of the package, along with their creation time and commit message.
    */
  def getPackageVersionHistory(): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  def getPackageVersionHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionHistoryResponse, Unit]): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  /**
    * Returns a list of versions of the package, along with their creation time and commit message.
    */
  def getPackageVersionHistory(params: GetPackageVersionHistoryRequest): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  def getPackageVersionHistory(
    params: GetPackageVersionHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionHistoryResponse, Unit]
  ): Request[GetPackageVersionHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
    */
  def getUpgradeHistory(): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  def getUpgradeHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeHistoryResponse, Unit]): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  /**
    * Retrieves the complete history of the last 10 upgrades that were performed on the domain.
    */
  def getUpgradeHistory(params: GetUpgradeHistoryRequest): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  def getUpgradeHistory(
    params: GetUpgradeHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeHistoryResponse, Unit]
  ): Request[GetUpgradeHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
    */
  def getUpgradeStatus(): Request[GetUpgradeStatusResponse, AWSError] = js.native
  def getUpgradeStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeStatusResponse, Unit]): Request[GetUpgradeStatusResponse, AWSError] = js.native
  /**
    * Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.
    */
  def getUpgradeStatus(params: GetUpgradeStatusRequest): Request[GetUpgradeStatusResponse, AWSError] = js.native
  def getUpgradeStatus(
    params: GetUpgradeStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUpgradeStatusResponse, Unit]
  ): Request[GetUpgradeStatusResponse, AWSError] = js.native
  
  /**
    * Returns the name of all Elasticsearch domains owned by the current user's account. 
    */
  def listDomainNames(): Request[ListDomainNamesResponse, AWSError] = js.native
  def listDomainNames(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainNamesResponse, Unit]): Request[ListDomainNamesResponse, AWSError] = js.native
  /**
    * Returns the name of all Elasticsearch domains owned by the current user's account. 
    */
  def listDomainNames(params: ListDomainNamesRequest): Request[ListDomainNamesResponse, AWSError] = js.native
  def listDomainNames(
    params: ListDomainNamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainNamesResponse, Unit]
  ): Request[ListDomainNamesResponse, AWSError] = js.native
  
  /**
    * Lists all Amazon ES domains associated with the package.
    */
  def listDomainsForPackage(): Request[ListDomainsForPackageResponse, AWSError] = js.native
  def listDomainsForPackage(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsForPackageResponse, Unit]): Request[ListDomainsForPackageResponse, AWSError] = js.native
  /**
    * Lists all Amazon ES domains associated with the package.
    */
  def listDomainsForPackage(params: ListDomainsForPackageRequest): Request[ListDomainsForPackageResponse, AWSError] = js.native
  def listDomainsForPackage(
    params: ListDomainsForPackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsForPackageResponse, Unit]
  ): Request[ListDomainsForPackageResponse, AWSError] = js.native
  
  /**
    * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
    */
  def listElasticsearchInstanceTypes(): Request[ListElasticsearchInstanceTypesResponse, AWSError] = js.native
  def listElasticsearchInstanceTypes(
    callback: js.Function2[/* err */ AWSError, /* data */ ListElasticsearchInstanceTypesResponse, Unit]
  ): Request[ListElasticsearchInstanceTypesResponse, AWSError] = js.native
  /**
    * List all Elasticsearch instance types that are supported for given ElasticsearchVersion
    */
  def listElasticsearchInstanceTypes(params: ListElasticsearchInstanceTypesRequest): Request[ListElasticsearchInstanceTypesResponse, AWSError] = js.native
  def listElasticsearchInstanceTypes(
    params: ListElasticsearchInstanceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListElasticsearchInstanceTypesResponse, Unit]
  ): Request[ListElasticsearchInstanceTypesResponse, AWSError] = js.native
  
  /**
    * List all supported Elasticsearch versions
    */
  def listElasticsearchVersions(): Request[ListElasticsearchVersionsResponse, AWSError] = js.native
  def listElasticsearchVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListElasticsearchVersionsResponse, Unit]): Request[ListElasticsearchVersionsResponse, AWSError] = js.native
  /**
    * List all supported Elasticsearch versions
    */
  def listElasticsearchVersions(params: ListElasticsearchVersionsRequest): Request[ListElasticsearchVersionsResponse, AWSError] = js.native
  def listElasticsearchVersions(
    params: ListElasticsearchVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListElasticsearchVersionsResponse, Unit]
  ): Request[ListElasticsearchVersionsResponse, AWSError] = js.native
  
  /**
    * Lists all packages associated with the Amazon ES domain.
    */
  def listPackagesForDomain(): Request[ListPackagesForDomainResponse, AWSError] = js.native
  def listPackagesForDomain(callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesForDomainResponse, Unit]): Request[ListPackagesForDomainResponse, AWSError] = js.native
  /**
    * Lists all packages associated with the Amazon ES domain.
    */
  def listPackagesForDomain(params: ListPackagesForDomainRequest): Request[ListPackagesForDomainResponse, AWSError] = js.native
  def listPackagesForDomain(
    params: ListPackagesForDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesForDomainResponse, Unit]
  ): Request[ListPackagesForDomainResponse, AWSError] = js.native
  
  /**
    * Returns all tags for the given Elasticsearch domain.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Returns all tags for the given Elasticsearch domain.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * Retrieves information about each principal that is allowed to access a given Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
    */
  def listVpcEndpointAccess(): Request[ListVpcEndpointAccessResponse, AWSError] = js.native
  def listVpcEndpointAccess(callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointAccessResponse, Unit]): Request[ListVpcEndpointAccessResponse, AWSError] = js.native
  /**
    * Retrieves information about each principal that is allowed to access a given Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
    */
  def listVpcEndpointAccess(params: ListVpcEndpointAccessRequest): Request[ListVpcEndpointAccessResponse, AWSError] = js.native
  def listVpcEndpointAccess(
    params: ListVpcEndpointAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointAccessResponse, Unit]
  ): Request[ListVpcEndpointAccessResponse, AWSError] = js.native
  
  /**
    * Retrieves all Amazon OpenSearch Service-managed VPC endpoints in the current account and Region.
    */
  def listVpcEndpoints(): Request[ListVpcEndpointsResponse, AWSError] = js.native
  def listVpcEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListVpcEndpointsResponse, Unit]): Request[ListVpcEndpointsResponse, AWSError] = js.native
  /**
    * Retrieves all Amazon OpenSearch Service-managed VPC endpoints in the current account and Region.
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
    * Allows you to purchase reserved Elasticsearch instances.
    */
  def purchaseReservedElasticsearchInstanceOffering(): Request[PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError] = js.native
  def purchaseReservedElasticsearchInstanceOffering(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PurchaseReservedElasticsearchInstanceOfferingResponse, 
      Unit
    ]
  ): Request[PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError] = js.native
  /**
    * Allows you to purchase reserved Elasticsearch instances.
    */
  def purchaseReservedElasticsearchInstanceOffering(params: PurchaseReservedElasticsearchInstanceOfferingRequest): Request[PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError] = js.native
  def purchaseReservedElasticsearchInstanceOffering(
    params: PurchaseReservedElasticsearchInstanceOfferingRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PurchaseReservedElasticsearchInstanceOfferingResponse, 
      Unit
    ]
  ): Request[PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError] = js.native
  
  /**
    * Allows the destination domain owner to reject an inbound cross-cluster search connection request.
    */
  def rejectInboundCrossClusterSearchConnection(): Request[RejectInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def rejectInboundCrossClusterSearchConnection(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ RejectInboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[RejectInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  /**
    * Allows the destination domain owner to reject an inbound cross-cluster search connection request.
    */
  def rejectInboundCrossClusterSearchConnection(params: RejectInboundCrossClusterSearchConnectionRequest): Request[RejectInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  def rejectInboundCrossClusterSearchConnection(
    params: RejectInboundCrossClusterSearchConnectionRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ RejectInboundCrossClusterSearchConnectionResponse, 
      Unit
    ]
  ): Request[RejectInboundCrossClusterSearchConnectionResponse, AWSError] = js.native
  
  /**
    * Removes the specified set of tags from the specified Elasticsearch domain.
    */
  def removeTags(): Request[js.Object, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified set of tags from the specified Elasticsearch domain.
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
    * Schedules a service software update for an Amazon ES domain.
    */
  def startElasticsearchServiceSoftwareUpdate(): Request[StartElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  def startElasticsearchServiceSoftwareUpdate(
    callback: js.Function2[/* err */ AWSError, /* data */ StartElasticsearchServiceSoftwareUpdateResponse, Unit]
  ): Request[StartElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  /**
    * Schedules a service software update for an Amazon ES domain.
    */
  def startElasticsearchServiceSoftwareUpdate(params: StartElasticsearchServiceSoftwareUpdateRequest): Request[StartElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  def startElasticsearchServiceSoftwareUpdate(
    params: StartElasticsearchServiceSoftwareUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartElasticsearchServiceSoftwareUpdateResponse, Unit]
  ): Request[StartElasticsearchServiceSoftwareUpdateResponse, AWSError] = js.native
  
  /**
    * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
    */
  def updateElasticsearchDomainConfig(): Request[UpdateElasticsearchDomainConfigResponse, AWSError] = js.native
  def updateElasticsearchDomainConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateElasticsearchDomainConfigResponse, Unit]
  ): Request[UpdateElasticsearchDomainConfigResponse, AWSError] = js.native
  /**
    * Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type and the number of instances. 
    */
  def updateElasticsearchDomainConfig(params: UpdateElasticsearchDomainConfigRequest): Request[UpdateElasticsearchDomainConfigResponse, AWSError] = js.native
  def updateElasticsearchDomainConfig(
    params: UpdateElasticsearchDomainConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateElasticsearchDomainConfigResponse, Unit]
  ): Request[UpdateElasticsearchDomainConfigResponse, AWSError] = js.native
  
  /**
    * Updates a package for use with Amazon ES domains.
    */
  def updatePackage(): Request[UpdatePackageResponse, AWSError] = js.native
  def updatePackage(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackageResponse, Unit]): Request[UpdatePackageResponse, AWSError] = js.native
  /**
    * Updates a package for use with Amazon ES domains.
    */
  def updatePackage(params: UpdatePackageRequest): Request[UpdatePackageResponse, AWSError] = js.native
  def updatePackage(
    params: UpdatePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackageResponse, Unit]
  ): Request[UpdatePackageResponse, AWSError] = js.native
  
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
    * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
    */
  def upgradeElasticsearchDomain(): Request[UpgradeElasticsearchDomainResponse, AWSError] = js.native
  def upgradeElasticsearchDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpgradeElasticsearchDomainResponse, Unit]): Request[UpgradeElasticsearchDomainResponse, AWSError] = js.native
  /**
    * Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch version.
    */
  def upgradeElasticsearchDomain(params: UpgradeElasticsearchDomainRequest): Request[UpgradeElasticsearchDomainResponse, AWSError] = js.native
  def upgradeElasticsearchDomain(
    params: UpgradeElasticsearchDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpgradeElasticsearchDomainResponse, Unit]
  ): Request[UpgradeElasticsearchDomainResponse, AWSError] = js.native
}
