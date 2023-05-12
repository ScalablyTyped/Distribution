package typings.awsSdk.clientsMediaconnectMod

import typings.awsSdk.anon.DescribeFlowRequestwaiter
import typings.awsSdk.awsSdkStrings.flowActive
import typings.awsSdk.awsSdkStrings.flowDeleted
import typings.awsSdk.awsSdkStrings.flowStandby
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConnect extends Service {
  
  /**
    * Adds outputs to an existing bridge.
    */
  def addBridgeOutputs(): Request[AddBridgeOutputsResponse, AWSError] = js.native
  def addBridgeOutputs(callback: js.Function2[/* err */ AWSError, /* data */ AddBridgeOutputsResponse, Unit]): Request[AddBridgeOutputsResponse, AWSError] = js.native
  /**
    * Adds outputs to an existing bridge.
    */
  def addBridgeOutputs(params: AddBridgeOutputsRequest): Request[AddBridgeOutputsResponse, AWSError] = js.native
  def addBridgeOutputs(
    params: AddBridgeOutputsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddBridgeOutputsResponse, Unit]
  ): Request[AddBridgeOutputsResponse, AWSError] = js.native
  
  /**
    * Adds sources to an existing bridge.
    */
  def addBridgeSources(): Request[AddBridgeSourcesResponse, AWSError] = js.native
  def addBridgeSources(callback: js.Function2[/* err */ AWSError, /* data */ AddBridgeSourcesResponse, Unit]): Request[AddBridgeSourcesResponse, AWSError] = js.native
  /**
    * Adds sources to an existing bridge.
    */
  def addBridgeSources(params: AddBridgeSourcesRequest): Request[AddBridgeSourcesResponse, AWSError] = js.native
  def addBridgeSources(
    params: AddBridgeSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddBridgeSourcesResponse, Unit]
  ): Request[AddBridgeSourcesResponse, AWSError] = js.native
  
  /**
    * Adds media streams to an existing flow. After you add a media stream to a flow, you can associate it with a source and/or an output that uses the ST 2110 JPEG XS or CDI protocol.
    */
  def addFlowMediaStreams(): Request[AddFlowMediaStreamsResponse, AWSError] = js.native
  def addFlowMediaStreams(callback: js.Function2[/* err */ AWSError, /* data */ AddFlowMediaStreamsResponse, Unit]): Request[AddFlowMediaStreamsResponse, AWSError] = js.native
  /**
    * Adds media streams to an existing flow. After you add a media stream to a flow, you can associate it with a source and/or an output that uses the ST 2110 JPEG XS or CDI protocol.
    */
  def addFlowMediaStreams(params: AddFlowMediaStreamsRequest): Request[AddFlowMediaStreamsResponse, AWSError] = js.native
  def addFlowMediaStreams(
    params: AddFlowMediaStreamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddFlowMediaStreamsResponse, Unit]
  ): Request[AddFlowMediaStreamsResponse, AWSError] = js.native
  
  /**
    * Adds outputs to an existing flow. You can create up to 50 outputs per flow.
    */
  def addFlowOutputs(): Request[AddFlowOutputsResponse, AWSError] = js.native
  def addFlowOutputs(callback: js.Function2[/* err */ AWSError, /* data */ AddFlowOutputsResponse, Unit]): Request[AddFlowOutputsResponse, AWSError] = js.native
  /**
    * Adds outputs to an existing flow. You can create up to 50 outputs per flow.
    */
  def addFlowOutputs(params: AddFlowOutputsRequest): Request[AddFlowOutputsResponse, AWSError] = js.native
  def addFlowOutputs(
    params: AddFlowOutputsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddFlowOutputsResponse, Unit]
  ): Request[AddFlowOutputsResponse, AWSError] = js.native
  
  /**
    * Adds Sources to flow
    */
  def addFlowSources(): Request[AddFlowSourcesResponse, AWSError] = js.native
  def addFlowSources(callback: js.Function2[/* err */ AWSError, /* data */ AddFlowSourcesResponse, Unit]): Request[AddFlowSourcesResponse, AWSError] = js.native
  /**
    * Adds Sources to flow
    */
  def addFlowSources(params: AddFlowSourcesRequest): Request[AddFlowSourcesResponse, AWSError] = js.native
  def addFlowSources(
    params: AddFlowSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddFlowSourcesResponse, Unit]
  ): Request[AddFlowSourcesResponse, AWSError] = js.native
  
  /**
    * Adds VPC interfaces to flow
    */
  def addFlowVpcInterfaces(): Request[AddFlowVpcInterfacesResponse, AWSError] = js.native
  def addFlowVpcInterfaces(callback: js.Function2[/* err */ AWSError, /* data */ AddFlowVpcInterfacesResponse, Unit]): Request[AddFlowVpcInterfacesResponse, AWSError] = js.native
  /**
    * Adds VPC interfaces to flow
    */
  def addFlowVpcInterfaces(params: AddFlowVpcInterfacesRequest): Request[AddFlowVpcInterfacesResponse, AWSError] = js.native
  def addFlowVpcInterfaces(
    params: AddFlowVpcInterfacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddFlowVpcInterfacesResponse, Unit]
  ): Request[AddFlowVpcInterfacesResponse, AWSError] = js.native
  
  @JSName("config")
  var config_MediaConnect: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new bridge. The request must include one source.
    */
  def createBridge(): Request[CreateBridgeResponse, AWSError] = js.native
  def createBridge(callback: js.Function2[/* err */ AWSError, /* data */ CreateBridgeResponse, Unit]): Request[CreateBridgeResponse, AWSError] = js.native
  /**
    * Creates a new bridge. The request must include one source.
    */
  def createBridge(params: CreateBridgeRequest): Request[CreateBridgeResponse, AWSError] = js.native
  def createBridge(
    params: CreateBridgeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBridgeResponse, Unit]
  ): Request[CreateBridgeResponse, AWSError] = js.native
  
  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50) and entitlements (up to 50).
    */
  def createFlow(): Request[CreateFlowResponse, AWSError] = js.native
  def createFlow(callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowResponse, Unit]): Request[CreateFlowResponse, AWSError] = js.native
  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50) and entitlements (up to 50).
    */
  def createFlow(params: CreateFlowRequest): Request[CreateFlowResponse, AWSError] = js.native
  def createFlow(
    params: CreateFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFlowResponse, Unit]
  ): Request[CreateFlowResponse, AWSError] = js.native
  
  /**
    * Creates a new gateway. The request must include at least one network (up to 4).
    */
  def createGateway(): Request[CreateGatewayResponse, AWSError] = js.native
  def createGateway(callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayResponse, Unit]): Request[CreateGatewayResponse, AWSError] = js.native
  /**
    * Creates a new gateway. The request must include at least one network (up to 4).
    */
  def createGateway(params: CreateGatewayRequest): Request[CreateGatewayResponse, AWSError] = js.native
  def createGateway(
    params: CreateGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayResponse, Unit]
  ): Request[CreateGatewayResponse, AWSError] = js.native
  
  /**
    * Deletes a bridge. Before you can delete a bridge, you must stop the bridge.
    */
  def deleteBridge(): Request[DeleteBridgeResponse, AWSError] = js.native
  def deleteBridge(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBridgeResponse, Unit]): Request[DeleteBridgeResponse, AWSError] = js.native
  /**
    * Deletes a bridge. Before you can delete a bridge, you must stop the bridge.
    */
  def deleteBridge(params: DeleteBridgeRequest): Request[DeleteBridgeResponse, AWSError] = js.native
  def deleteBridge(
    params: DeleteBridgeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBridgeResponse, Unit]
  ): Request[DeleteBridgeResponse, AWSError] = js.native
  
  /**
    * Deletes a flow. Before you can delete a flow, you must stop the flow.
    */
  def deleteFlow(): Request[DeleteFlowResponse, AWSError] = js.native
  def deleteFlow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowResponse, Unit]): Request[DeleteFlowResponse, AWSError] = js.native
  /**
    * Deletes a flow. Before you can delete a flow, you must stop the flow.
    */
  def deleteFlow(params: DeleteFlowRequest): Request[DeleteFlowResponse, AWSError] = js.native
  def deleteFlow(
    params: DeleteFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFlowResponse, Unit]
  ): Request[DeleteFlowResponse, AWSError] = js.native
  
  /**
    * Deletes a gateway. Before you can delete a gateway, you must deregister its instances and delete its bridges.
    */
  def deleteGateway(): Request[DeleteGatewayResponse, AWSError] = js.native
  def deleteGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayResponse, Unit]): Request[DeleteGatewayResponse, AWSError] = js.native
  /**
    * Deletes a gateway. Before you can delete a gateway, you must deregister its instances and delete its bridges.
    */
  def deleteGateway(params: DeleteGatewayRequest): Request[DeleteGatewayResponse, AWSError] = js.native
  def deleteGateway(
    params: DeleteGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayResponse, Unit]
  ): Request[DeleteGatewayResponse, AWSError] = js.native
  
  /**
    * Deregisters an instance. Before you deregister an instance, all bridges running on the instance must be stopped. If you want to deregister an instance without stopping the bridges, you must use the --force option.
    */
  def deregisterGatewayInstance(): Request[DeregisterGatewayInstanceResponse, AWSError] = js.native
  def deregisterGatewayInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterGatewayInstanceResponse, Unit]): Request[DeregisterGatewayInstanceResponse, AWSError] = js.native
  /**
    * Deregisters an instance. Before you deregister an instance, all bridges running on the instance must be stopped. If you want to deregister an instance without stopping the bridges, you must use the --force option.
    */
  def deregisterGatewayInstance(params: DeregisterGatewayInstanceRequest): Request[DeregisterGatewayInstanceResponse, AWSError] = js.native
  def deregisterGatewayInstance(
    params: DeregisterGatewayInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterGatewayInstanceResponse, Unit]
  ): Request[DeregisterGatewayInstanceResponse, AWSError] = js.native
  
  /**
    * Displays the details of a bridge.
    */
  def describeBridge(): Request[DescribeBridgeResponse, AWSError] = js.native
  def describeBridge(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBridgeResponse, Unit]): Request[DescribeBridgeResponse, AWSError] = js.native
  /**
    * Displays the details of a bridge.
    */
  def describeBridge(params: DescribeBridgeRequest): Request[DescribeBridgeResponse, AWSError] = js.native
  def describeBridge(
    params: DescribeBridgeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBridgeResponse, Unit]
  ): Request[DescribeBridgeResponse, AWSError] = js.native
  
  /**
    * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as details about the source, outputs, and entitlements.
    */
  def describeFlow(): Request[DescribeFlowResponse, AWSError] = js.native
  def describeFlow(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as details about the source, outputs, and entitlements.
    */
  def describeFlow(params: DescribeFlowRequest): Request[DescribeFlowResponse, AWSError] = js.native
  def describeFlow(
    params: DescribeFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
  
  /**
    * Displays the details of a gateway. The response includes the gateway ARN, name, and CIDR blocks, as well as details about the networks.
    */
  def describeGateway(): Request[DescribeGatewayResponse, AWSError] = js.native
  def describeGateway(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayResponse, Unit]): Request[DescribeGatewayResponse, AWSError] = js.native
  /**
    * Displays the details of a gateway. The response includes the gateway ARN, name, and CIDR blocks, as well as details about the networks.
    */
  def describeGateway(params: DescribeGatewayRequest): Request[DescribeGatewayResponse, AWSError] = js.native
  def describeGateway(
    params: DescribeGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayResponse, Unit]
  ): Request[DescribeGatewayResponse, AWSError] = js.native
  
  /**
    * Displays the details of an instance.
    */
  def describeGatewayInstance(): Request[DescribeGatewayInstanceResponse, AWSError] = js.native
  def describeGatewayInstance(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayInstanceResponse, Unit]): Request[DescribeGatewayInstanceResponse, AWSError] = js.native
  /**
    * Displays the details of an instance.
    */
  def describeGatewayInstance(params: DescribeGatewayInstanceRequest): Request[DescribeGatewayInstanceResponse, AWSError] = js.native
  def describeGatewayInstance(
    params: DescribeGatewayInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGatewayInstanceResponse, Unit]
  ): Request[DescribeGatewayInstanceResponse, AWSError] = js.native
  
  /**
    * Displays the details of an offering. The response includes the offering description, duration, outbound bandwidth, price, and Amazon Resource Name (ARN).
    */
  def describeOffering(): Request[DescribeOfferingResponse, AWSError] = js.native
  def describeOffering(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOfferingResponse, Unit]): Request[DescribeOfferingResponse, AWSError] = js.native
  /**
    * Displays the details of an offering. The response includes the offering description, duration, outbound bandwidth, price, and Amazon Resource Name (ARN).
    */
  def describeOffering(params: DescribeOfferingRequest): Request[DescribeOfferingResponse, AWSError] = js.native
  def describeOffering(
    params: DescribeOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOfferingResponse, Unit]
  ): Request[DescribeOfferingResponse, AWSError] = js.native
  
  /**
    * Displays the details of a reservation. The response includes the reservation name, state, start date and time, and the details of the offering that make up the rest of the reservation (such as price, duration, and outbound bandwidth).
    */
  def describeReservation(): Request[DescribeReservationResponse, AWSError] = js.native
  def describeReservation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservationResponse, Unit]): Request[DescribeReservationResponse, AWSError] = js.native
  /**
    * Displays the details of a reservation. The response includes the reservation name, state, start date and time, and the details of the offering that make up the rest of the reservation (such as price, duration, and outbound bandwidth).
    */
  def describeReservation(params: DescribeReservationRequest): Request[DescribeReservationResponse, AWSError] = js.native
  def describeReservation(
    params: DescribeReservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservationResponse, Unit]
  ): Request[DescribeReservationResponse, AWSError] = js.native
  
  /**
    * Grants entitlements to an existing flow.
    */
  def grantFlowEntitlements(): Request[GrantFlowEntitlementsResponse, AWSError] = js.native
  def grantFlowEntitlements(callback: js.Function2[/* err */ AWSError, /* data */ GrantFlowEntitlementsResponse, Unit]): Request[GrantFlowEntitlementsResponse, AWSError] = js.native
  /**
    * Grants entitlements to an existing flow.
    */
  def grantFlowEntitlements(params: GrantFlowEntitlementsRequest): Request[GrantFlowEntitlementsResponse, AWSError] = js.native
  def grantFlowEntitlements(
    params: GrantFlowEntitlementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GrantFlowEntitlementsResponse, Unit]
  ): Request[GrantFlowEntitlementsResponse, AWSError] = js.native
  
  /**
    * Displays a list of bridges that are associated with this account and an optionally specified Arn. This request returns a paginated result.
    */
  def listBridges(): Request[ListBridgesResponse, AWSError] = js.native
  def listBridges(callback: js.Function2[/* err */ AWSError, /* data */ ListBridgesResponse, Unit]): Request[ListBridgesResponse, AWSError] = js.native
  /**
    * Displays a list of bridges that are associated with this account and an optionally specified Arn. This request returns a paginated result.
    */
  def listBridges(params: ListBridgesRequest): Request[ListBridgesResponse, AWSError] = js.native
  def listBridges(
    params: ListBridgesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBridgesResponse, Unit]
  ): Request[ListBridgesResponse, AWSError] = js.native
  
  /**
    * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per page.
    */
  def listEntitlements(): Request[ListEntitlementsResponse, AWSError] = js.native
  def listEntitlements(callback: js.Function2[/* err */ AWSError, /* data */ ListEntitlementsResponse, Unit]): Request[ListEntitlementsResponse, AWSError] = js.native
  /**
    * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per page.
    */
  def listEntitlements(params: ListEntitlementsRequest): Request[ListEntitlementsResponse, AWSError] = js.native
  def listEntitlements(
    params: ListEntitlementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntitlementsResponse, Unit]
  ): Request[ListEntitlementsResponse, AWSError] = js.native
  
  /**
    * Displays a list of flows that are associated with this account. This request returns a paginated result.
    */
  def listFlows(): Request[ListFlowsResponse, AWSError] = js.native
  def listFlows(callback: js.Function2[/* err */ AWSError, /* data */ ListFlowsResponse, Unit]): Request[ListFlowsResponse, AWSError] = js.native
  /**
    * Displays a list of flows that are associated with this account. This request returns a paginated result.
    */
  def listFlows(params: ListFlowsRequest): Request[ListFlowsResponse, AWSError] = js.native
  def listFlows(
    params: ListFlowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFlowsResponse, Unit]
  ): Request[ListFlowsResponse, AWSError] = js.native
  
  /**
    * Displays a list of instances associated with the AWS account. This request returns a paginated result. You can use the filterArn property to display only the instances associated with the selected Gateway Amazon Resource Name (ARN).
    */
  def listGatewayInstances(): Request[ListGatewayInstancesResponse, AWSError] = js.native
  def listGatewayInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListGatewayInstancesResponse, Unit]): Request[ListGatewayInstancesResponse, AWSError] = js.native
  /**
    * Displays a list of instances associated with the AWS account. This request returns a paginated result. You can use the filterArn property to display only the instances associated with the selected Gateway Amazon Resource Name (ARN).
    */
  def listGatewayInstances(params: ListGatewayInstancesRequest): Request[ListGatewayInstancesResponse, AWSError] = js.native
  def listGatewayInstances(
    params: ListGatewayInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGatewayInstancesResponse, Unit]
  ): Request[ListGatewayInstancesResponse, AWSError] = js.native
  
  /**
    * Displays a list of gateways that are associated with this account. This request returns a paginated result.
    */
  def listGateways(): Request[ListGatewaysResponse, AWSError] = js.native
  def listGateways(callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysResponse, Unit]): Request[ListGatewaysResponse, AWSError] = js.native
  /**
    * Displays a list of gateways that are associated with this account. This request returns a paginated result.
    */
  def listGateways(params: ListGatewaysRequest): Request[ListGatewaysResponse, AWSError] = js.native
  def listGateways(
    params: ListGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysResponse, Unit]
  ): Request[ListGatewaysResponse, AWSError] = js.native
  
  /**
    * Displays a list of all offerings that are available to this account in the current AWS Region. If you have an active reservation (which means you've purchased an offering that has already started and hasn't expired yet), your account isn't eligible for other offerings.
    */
  def listOfferings(): Request[ListOfferingsResponse, AWSError] = js.native
  def listOfferings(callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingsResponse, Unit]): Request[ListOfferingsResponse, AWSError] = js.native
  /**
    * Displays a list of all offerings that are available to this account in the current AWS Region. If you have an active reservation (which means you've purchased an offering that has already started and hasn't expired yet), your account isn't eligible for other offerings.
    */
  def listOfferings(params: ListOfferingsRequest): Request[ListOfferingsResponse, AWSError] = js.native
  def listOfferings(
    params: ListOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingsResponse, Unit]
  ): Request[ListOfferingsResponse, AWSError] = js.native
  
  /**
    * Displays a list of all reservations that have been purchased by this account in the current AWS Region. This list includes all reservations in all states (such as active and expired).
    */
  def listReservations(): Request[ListReservationsResponse, AWSError] = js.native
  def listReservations(callback: js.Function2[/* err */ AWSError, /* data */ ListReservationsResponse, Unit]): Request[ListReservationsResponse, AWSError] = js.native
  /**
    * Displays a list of all reservations that have been purchased by this account in the current AWS Region. This list includes all reservations in all states (such as active and expired).
    */
  def listReservations(params: ListReservationsRequest): Request[ListReservationsResponse, AWSError] = js.native
  def listReservations(
    params: ListReservationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReservationsResponse, Unit]
  ): Request[ListReservationsResponse, AWSError] = js.native
  
  /**
    * List all tags on an AWS Elemental MediaConnect resource
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List all tags on an AWS Elemental MediaConnect resource
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Submits a request to purchase an offering. If you already have an active reservation, you can't purchase another offering.
    */
  def purchaseOffering(): Request[PurchaseOfferingResponse, AWSError] = js.native
  def purchaseOffering(callback: js.Function2[/* err */ AWSError, /* data */ PurchaseOfferingResponse, Unit]): Request[PurchaseOfferingResponse, AWSError] = js.native
  /**
    * Submits a request to purchase an offering. If you already have an active reservation, you can't purchase another offering.
    */
  def purchaseOffering(params: PurchaseOfferingRequest): Request[PurchaseOfferingResponse, AWSError] = js.native
  def purchaseOffering(
    params: PurchaseOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseOfferingResponse, Unit]
  ): Request[PurchaseOfferingResponse, AWSError] = js.native
  
  /**
    * Removes an output from a bridge.
    */
  def removeBridgeOutput(): Request[RemoveBridgeOutputResponse, AWSError] = js.native
  def removeBridgeOutput(callback: js.Function2[/* err */ AWSError, /* data */ RemoveBridgeOutputResponse, Unit]): Request[RemoveBridgeOutputResponse, AWSError] = js.native
  /**
    * Removes an output from a bridge.
    */
  def removeBridgeOutput(params: RemoveBridgeOutputRequest): Request[RemoveBridgeOutputResponse, AWSError] = js.native
  def removeBridgeOutput(
    params: RemoveBridgeOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveBridgeOutputResponse, Unit]
  ): Request[RemoveBridgeOutputResponse, AWSError] = js.native
  
  /**
    * Removes a source from a bridge.
    */
  def removeBridgeSource(): Request[RemoveBridgeSourceResponse, AWSError] = js.native
  def removeBridgeSource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveBridgeSourceResponse, Unit]): Request[RemoveBridgeSourceResponse, AWSError] = js.native
  /**
    * Removes a source from a bridge.
    */
  def removeBridgeSource(params: RemoveBridgeSourceRequest): Request[RemoveBridgeSourceResponse, AWSError] = js.native
  def removeBridgeSource(
    params: RemoveBridgeSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveBridgeSourceResponse, Unit]
  ): Request[RemoveBridgeSourceResponse, AWSError] = js.native
  
  /**
    * Removes a media stream from a flow. This action is only available if the media stream is not associated with a source or output.
    */
  def removeFlowMediaStream(): Request[RemoveFlowMediaStreamResponse, AWSError] = js.native
  def removeFlowMediaStream(callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowMediaStreamResponse, Unit]): Request[RemoveFlowMediaStreamResponse, AWSError] = js.native
  /**
    * Removes a media stream from a flow. This action is only available if the media stream is not associated with a source or output.
    */
  def removeFlowMediaStream(params: RemoveFlowMediaStreamRequest): Request[RemoveFlowMediaStreamResponse, AWSError] = js.native
  def removeFlowMediaStream(
    params: RemoveFlowMediaStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowMediaStreamResponse, Unit]
  ): Request[RemoveFlowMediaStreamResponse, AWSError] = js.native
  
  /**
    * Removes an output from an existing flow. This request can be made only on an output that does not have an entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When an entitlement is revoked from a flow, the service automatically removes the associated output.
    */
  def removeFlowOutput(): Request[RemoveFlowOutputResponse, AWSError] = js.native
  def removeFlowOutput(callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowOutputResponse, Unit]): Request[RemoveFlowOutputResponse, AWSError] = js.native
  /**
    * Removes an output from an existing flow. This request can be made only on an output that does not have an entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When an entitlement is revoked from a flow, the service automatically removes the associated output.
    */
  def removeFlowOutput(params: RemoveFlowOutputRequest): Request[RemoveFlowOutputResponse, AWSError] = js.native
  def removeFlowOutput(
    params: RemoveFlowOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowOutputResponse, Unit]
  ): Request[RemoveFlowOutputResponse, AWSError] = js.native
  
  /**
    * Removes a source from an existing flow. This request can be made only if there is more than one source on the flow.
    */
  def removeFlowSource(): Request[RemoveFlowSourceResponse, AWSError] = js.native
  def removeFlowSource(callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowSourceResponse, Unit]): Request[RemoveFlowSourceResponse, AWSError] = js.native
  /**
    * Removes a source from an existing flow. This request can be made only if there is more than one source on the flow.
    */
  def removeFlowSource(params: RemoveFlowSourceRequest): Request[RemoveFlowSourceResponse, AWSError] = js.native
  def removeFlowSource(
    params: RemoveFlowSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowSourceResponse, Unit]
  ): Request[RemoveFlowSourceResponse, AWSError] = js.native
  
  /**
    * Removes a VPC Interface from an existing flow. This request can be made only on a VPC interface that does not have a Source or Output associated with it. If the VPC interface is referenced by a Source or Output, you must first delete or update the Source or Output to no longer reference the VPC interface.
    */
  def removeFlowVpcInterface(): Request[RemoveFlowVpcInterfaceResponse, AWSError] = js.native
  def removeFlowVpcInterface(callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowVpcInterfaceResponse, Unit]): Request[RemoveFlowVpcInterfaceResponse, AWSError] = js.native
  /**
    * Removes a VPC Interface from an existing flow. This request can be made only on a VPC interface that does not have a Source or Output associated with it. If the VPC interface is referenced by a Source or Output, you must first delete or update the Source or Output to no longer reference the VPC interface.
    */
  def removeFlowVpcInterface(params: RemoveFlowVpcInterfaceRequest): Request[RemoveFlowVpcInterfaceResponse, AWSError] = js.native
  def removeFlowVpcInterface(
    params: RemoveFlowVpcInterfaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveFlowVpcInterfaceResponse, Unit]
  ): Request[RemoveFlowVpcInterfaceResponse, AWSError] = js.native
  
  /**
    * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the subscriber and the associated output is removed.
    */
  def revokeFlowEntitlement(): Request[RevokeFlowEntitlementResponse, AWSError] = js.native
  def revokeFlowEntitlement(callback: js.Function2[/* err */ AWSError, /* data */ RevokeFlowEntitlementResponse, Unit]): Request[RevokeFlowEntitlementResponse, AWSError] = js.native
  /**
    * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the subscriber and the associated output is removed.
    */
  def revokeFlowEntitlement(params: RevokeFlowEntitlementRequest): Request[RevokeFlowEntitlementResponse, AWSError] = js.native
  def revokeFlowEntitlement(
    params: RevokeFlowEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeFlowEntitlementResponse, Unit]
  ): Request[RevokeFlowEntitlementResponse, AWSError] = js.native
  
  /**
    * Starts a flow.
    */
  def startFlow(): Request[StartFlowResponse, AWSError] = js.native
  def startFlow(callback: js.Function2[/* err */ AWSError, /* data */ StartFlowResponse, Unit]): Request[StartFlowResponse, AWSError] = js.native
  /**
    * Starts a flow.
    */
  def startFlow(params: StartFlowRequest): Request[StartFlowResponse, AWSError] = js.native
  def startFlow(
    params: StartFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFlowResponse, Unit]
  ): Request[StartFlowResponse, AWSError] = js.native
  
  /**
    * Stops a flow.
    */
  def stopFlow(): Request[StopFlowResponse, AWSError] = js.native
  def stopFlow(callback: js.Function2[/* err */ AWSError, /* data */ StopFlowResponse, Unit]): Request[StopFlowResponse, AWSError] = js.native
  /**
    * Stops a flow.
    */
  def stopFlow(params: StopFlowRequest): Request[StopFlowResponse, AWSError] = js.native
  def stopFlow(
    params: StopFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopFlowResponse, Unit]
  ): Request[StopFlowResponse, AWSError] = js.native
  
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the bridge
    */
  def updateBridge(): Request[UpdateBridgeResponse, AWSError] = js.native
  def updateBridge(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBridgeResponse, Unit]): Request[UpdateBridgeResponse, AWSError] = js.native
  /**
    * Updates the bridge
    */
  def updateBridge(params: UpdateBridgeRequest): Request[UpdateBridgeResponse, AWSError] = js.native
  def updateBridge(
    params: UpdateBridgeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBridgeResponse, Unit]
  ): Request[UpdateBridgeResponse, AWSError] = js.native
  
  /**
    * Updates an existing bridge output.
    */
  def updateBridgeOutput(): Request[UpdateBridgeOutputResponse, AWSError] = js.native
  def updateBridgeOutput(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBridgeOutputResponse, Unit]): Request[UpdateBridgeOutputResponse, AWSError] = js.native
  /**
    * Updates an existing bridge output.
    */
  def updateBridgeOutput(params: UpdateBridgeOutputRequest): Request[UpdateBridgeOutputResponse, AWSError] = js.native
  def updateBridgeOutput(
    params: UpdateBridgeOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBridgeOutputResponse, Unit]
  ): Request[UpdateBridgeOutputResponse, AWSError] = js.native
  
  /**
    * Updates an existing bridge source.
    */
  def updateBridgeSource(): Request[UpdateBridgeSourceResponse, AWSError] = js.native
  def updateBridgeSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBridgeSourceResponse, Unit]): Request[UpdateBridgeSourceResponse, AWSError] = js.native
  /**
    * Updates an existing bridge source.
    */
  def updateBridgeSource(params: UpdateBridgeSourceRequest): Request[UpdateBridgeSourceResponse, AWSError] = js.native
  def updateBridgeSource(
    params: UpdateBridgeSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBridgeSourceResponse, Unit]
  ): Request[UpdateBridgeSourceResponse, AWSError] = js.native
  
  /**
    * Updates the bridge state
    */
  def updateBridgeState(): Request[UpdateBridgeStateResponse, AWSError] = js.native
  def updateBridgeState(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBridgeStateResponse, Unit]): Request[UpdateBridgeStateResponse, AWSError] = js.native
  /**
    * Updates the bridge state
    */
  def updateBridgeState(params: UpdateBridgeStateRequest): Request[UpdateBridgeStateResponse, AWSError] = js.native
  def updateBridgeState(
    params: UpdateBridgeStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBridgeStateResponse, Unit]
  ): Request[UpdateBridgeStateResponse, AWSError] = js.native
  
  /**
    * Updates flow
    */
  def updateFlow(): Request[UpdateFlowResponse, AWSError] = js.native
  def updateFlow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowResponse, Unit]): Request[UpdateFlowResponse, AWSError] = js.native
  /**
    * Updates flow
    */
  def updateFlow(params: UpdateFlowRequest): Request[UpdateFlowResponse, AWSError] = js.native
  def updateFlow(
    params: UpdateFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowResponse, Unit]
  ): Request[UpdateFlowResponse, AWSError] = js.native
  
  /**
    * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the service will remove the outputs that are are used by the subscribers that are removed.
    */
  def updateFlowEntitlement(): Request[UpdateFlowEntitlementResponse, AWSError] = js.native
  def updateFlowEntitlement(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowEntitlementResponse, Unit]): Request[UpdateFlowEntitlementResponse, AWSError] = js.native
  /**
    * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the service will remove the outputs that are are used by the subscribers that are removed.
    */
  def updateFlowEntitlement(params: UpdateFlowEntitlementRequest): Request[UpdateFlowEntitlementResponse, AWSError] = js.native
  def updateFlowEntitlement(
    params: UpdateFlowEntitlementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowEntitlementResponse, Unit]
  ): Request[UpdateFlowEntitlementResponse, AWSError] = js.native
  
  /**
    * Updates an existing media stream.
    */
  def updateFlowMediaStream(): Request[UpdateFlowMediaStreamResponse, AWSError] = js.native
  def updateFlowMediaStream(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowMediaStreamResponse, Unit]): Request[UpdateFlowMediaStreamResponse, AWSError] = js.native
  /**
    * Updates an existing media stream.
    */
  def updateFlowMediaStream(params: UpdateFlowMediaStreamRequest): Request[UpdateFlowMediaStreamResponse, AWSError] = js.native
  def updateFlowMediaStream(
    params: UpdateFlowMediaStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowMediaStreamResponse, Unit]
  ): Request[UpdateFlowMediaStreamResponse, AWSError] = js.native
  
  /**
    * Updates an existing flow output.
    */
  def updateFlowOutput(): Request[UpdateFlowOutputResponse, AWSError] = js.native
  def updateFlowOutput(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowOutputResponse, Unit]): Request[UpdateFlowOutputResponse, AWSError] = js.native
  /**
    * Updates an existing flow output.
    */
  def updateFlowOutput(params: UpdateFlowOutputRequest): Request[UpdateFlowOutputResponse, AWSError] = js.native
  def updateFlowOutput(
    params: UpdateFlowOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowOutputResponse, Unit]
  ): Request[UpdateFlowOutputResponse, AWSError] = js.native
  
  /**
    * Updates the source of a flow.
    */
  def updateFlowSource(): Request[UpdateFlowSourceResponse, AWSError] = js.native
  def updateFlowSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowSourceResponse, Unit]): Request[UpdateFlowSourceResponse, AWSError] = js.native
  /**
    * Updates the source of a flow.
    */
  def updateFlowSource(params: UpdateFlowSourceRequest): Request[UpdateFlowSourceResponse, AWSError] = js.native
  def updateFlowSource(
    params: UpdateFlowSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFlowSourceResponse, Unit]
  ): Request[UpdateFlowSourceResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing Gateway Instance.
    */
  def updateGatewayInstance(): Request[UpdateGatewayInstanceResponse, AWSError] = js.native
  def updateGatewayInstance(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayInstanceResponse, Unit]): Request[UpdateGatewayInstanceResponse, AWSError] = js.native
  /**
    * Updates the configuration of an existing Gateway Instance.
    */
  def updateGatewayInstance(params: UpdateGatewayInstanceRequest): Request[UpdateGatewayInstanceResponse, AWSError] = js.native
  def updateGatewayInstance(
    params: UpdateGatewayInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayInstanceResponse, Unit]
  ): Request[UpdateGatewayInstanceResponse, AWSError] = js.native
  
  /**
    * Waits for the flowActive state by periodically calling the underlying MediaConnect.describeFlowoperation every 3 seconds (at most 40 times). Wait until a flow is active
    */
  @JSName("waitFor")
  def waitFor_flowActive(state: flowActive): Request[DescribeFlowResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_flowActive(
    state: flowActive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    * Waits for the flowActive state by periodically calling the underlying MediaConnect.describeFlowoperation every 3 seconds (at most 40 times). Wait until a flow is active
    */
  @JSName("waitFor")
  def waitFor_flowActive(state: flowActive, params: DescribeFlowRequestwaiter): Request[DescribeFlowResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_flowActive(
    state: flowActive,
    params: DescribeFlowRequestwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    * Waits for the flowDeleted state by periodically calling the underlying MediaConnect.describeFlowoperation every 3 seconds (at most 40 times). Wait until a flow is deleted
    */
  @JSName("waitFor")
  def waitFor_flowDeleted(state: flowDeleted): Request[DescribeFlowResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_flowDeleted(
    state: flowDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    * Waits for the flowDeleted state by periodically calling the underlying MediaConnect.describeFlowoperation every 3 seconds (at most 40 times). Wait until a flow is deleted
    */
  @JSName("waitFor")
  def waitFor_flowDeleted(state: flowDeleted, params: DescribeFlowRequestwaiter): Request[DescribeFlowResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_flowDeleted(
    state: flowDeleted,
    params: DescribeFlowRequestwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    * Waits for the flowStandby state by periodically calling the underlying MediaConnect.describeFlowoperation every 3 seconds (at most 40 times). Wait until a flow is in standby mode
    */
  @JSName("waitFor")
  def waitFor_flowStandby(state: flowStandby): Request[DescribeFlowResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_flowStandby(
    state: flowStandby,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
  /**
    * Waits for the flowStandby state by periodically calling the underlying MediaConnect.describeFlowoperation every 3 seconds (at most 40 times). Wait until a flow is in standby mode
    */
  @JSName("waitFor")
  def waitFor_flowStandby(state: flowStandby, params: DescribeFlowRequestwaiter): Request[DescribeFlowResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_flowStandby(
    state: flowStandby,
    params: DescribeFlowRequestwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFlowResponse, Unit]
  ): Request[DescribeFlowResponse, AWSError] = js.native
}
