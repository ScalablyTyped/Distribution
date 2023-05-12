package typings.awsSdk.clientsPrivatenetworksMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateNetworks extends Service {
  
  /**
    * Acknowledges that the specified network order was received.
    */
  def acknowledgeOrderReceipt(): Request[AcknowledgeOrderReceiptResponse, AWSError] = js.native
  def acknowledgeOrderReceipt(callback: js.Function2[/* err */ AWSError, /* data */ AcknowledgeOrderReceiptResponse, Unit]): Request[AcknowledgeOrderReceiptResponse, AWSError] = js.native
  /**
    * Acknowledges that the specified network order was received.
    */
  def acknowledgeOrderReceipt(params: AcknowledgeOrderReceiptRequest): Request[AcknowledgeOrderReceiptResponse, AWSError] = js.native
  def acknowledgeOrderReceipt(
    params: AcknowledgeOrderReceiptRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcknowledgeOrderReceiptResponse, Unit]
  ): Request[AcknowledgeOrderReceiptResponse, AWSError] = js.native
  
  /**
    * Activates the specified device identifier.
    */
  def activateDeviceIdentifier(): Request[ActivateDeviceIdentifierResponse, AWSError] = js.native
  def activateDeviceIdentifier(callback: js.Function2[/* err */ AWSError, /* data */ ActivateDeviceIdentifierResponse, Unit]): Request[ActivateDeviceIdentifierResponse, AWSError] = js.native
  /**
    * Activates the specified device identifier.
    */
  def activateDeviceIdentifier(params: ActivateDeviceIdentifierRequest): Request[ActivateDeviceIdentifierResponse, AWSError] = js.native
  def activateDeviceIdentifier(
    params: ActivateDeviceIdentifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateDeviceIdentifierResponse, Unit]
  ): Request[ActivateDeviceIdentifierResponse, AWSError] = js.native
  
  /**
    * Activates the specified network site.
    */
  def activateNetworkSite(): Request[ActivateNetworkSiteResponse, AWSError] = js.native
  def activateNetworkSite(callback: js.Function2[/* err */ AWSError, /* data */ ActivateNetworkSiteResponse, Unit]): Request[ActivateNetworkSiteResponse, AWSError] = js.native
  /**
    * Activates the specified network site.
    */
  def activateNetworkSite(params: ActivateNetworkSiteRequest): Request[ActivateNetworkSiteResponse, AWSError] = js.native
  def activateNetworkSite(
    params: ActivateNetworkSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateNetworkSiteResponse, Unit]
  ): Request[ActivateNetworkSiteResponse, AWSError] = js.native
  
  @JSName("config")
  var config_PrivateNetworks: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Configures the specified network resource.   Use this action to specify the geographic position of the hardware. You must provide Certified Professional Installer (CPI) credentials in the request so that we can obtain spectrum grants. For more information, see Radio units in the Amazon Web Services Private 5G User Guide. 
    */
  def configureAccessPoint(): Request[ConfigureAccessPointResponse, AWSError] = js.native
  def configureAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ ConfigureAccessPointResponse, Unit]): Request[ConfigureAccessPointResponse, AWSError] = js.native
  /**
    * Configures the specified network resource.   Use this action to specify the geographic position of the hardware. You must provide Certified Professional Installer (CPI) credentials in the request so that we can obtain spectrum grants. For more information, see Radio units in the Amazon Web Services Private 5G User Guide. 
    */
  def configureAccessPoint(params: ConfigureAccessPointRequest): Request[ConfigureAccessPointResponse, AWSError] = js.native
  def configureAccessPoint(
    params: ConfigureAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigureAccessPointResponse, Unit]
  ): Request[ConfigureAccessPointResponse, AWSError] = js.native
  
  /**
    * Creates a network.
    */
  def createNetwork(): Request[CreateNetworkResponse, AWSError] = js.native
  def createNetwork(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkResponse, Unit]): Request[CreateNetworkResponse, AWSError] = js.native
  /**
    * Creates a network.
    */
  def createNetwork(params: CreateNetworkRequest): Request[CreateNetworkResponse, AWSError] = js.native
  def createNetwork(
    params: CreateNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkResponse, Unit]
  ): Request[CreateNetworkResponse, AWSError] = js.native
  
  /**
    * Creates a network site.
    */
  def createNetworkSite(): Request[CreateNetworkSiteResponse, AWSError] = js.native
  def createNetworkSite(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkSiteResponse, Unit]): Request[CreateNetworkSiteResponse, AWSError] = js.native
  /**
    * Creates a network site.
    */
  def createNetworkSite(params: CreateNetworkSiteRequest): Request[CreateNetworkSiteResponse, AWSError] = js.native
  def createNetworkSite(
    params: CreateNetworkSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkSiteResponse, Unit]
  ): Request[CreateNetworkSiteResponse, AWSError] = js.native
  
  /**
    * Deactivates the specified device identifier.
    */
  def deactivateDeviceIdentifier(): Request[DeactivateDeviceIdentifierResponse, AWSError] = js.native
  def deactivateDeviceIdentifier(callback: js.Function2[/* err */ AWSError, /* data */ DeactivateDeviceIdentifierResponse, Unit]): Request[DeactivateDeviceIdentifierResponse, AWSError] = js.native
  /**
    * Deactivates the specified device identifier.
    */
  def deactivateDeviceIdentifier(params: DeactivateDeviceIdentifierRequest): Request[DeactivateDeviceIdentifierResponse, AWSError] = js.native
  def deactivateDeviceIdentifier(
    params: DeactivateDeviceIdentifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeactivateDeviceIdentifierResponse, Unit]
  ): Request[DeactivateDeviceIdentifierResponse, AWSError] = js.native
  
  /**
    * Deletes the specified network. You must delete network sites before you delete the network. For more information, see DeleteNetworkSite in the API Reference for Amazon Web Services Private 5G.
    */
  def deleteNetwork(): Request[DeleteNetworkResponse, AWSError] = js.native
  def deleteNetwork(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkResponse, Unit]): Request[DeleteNetworkResponse, AWSError] = js.native
  /**
    * Deletes the specified network. You must delete network sites before you delete the network. For more information, see DeleteNetworkSite in the API Reference for Amazon Web Services Private 5G.
    */
  def deleteNetwork(params: DeleteNetworkRequest): Request[DeleteNetworkResponse, AWSError] = js.native
  def deleteNetwork(
    params: DeleteNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkResponse, Unit]
  ): Request[DeleteNetworkResponse, AWSError] = js.native
  
  /**
    * Deletes the specified network site. Return the hardware after you delete the network site. You are responsible for minimum charges. For more information, see Hardware returns in the Amazon Web Services Private 5G User Guide. 
    */
  def deleteNetworkSite(): Request[DeleteNetworkSiteResponse, AWSError] = js.native
  def deleteNetworkSite(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkSiteResponse, Unit]): Request[DeleteNetworkSiteResponse, AWSError] = js.native
  /**
    * Deletes the specified network site. Return the hardware after you delete the network site. You are responsible for minimum charges. For more information, see Hardware returns in the Amazon Web Services Private 5G User Guide. 
    */
  def deleteNetworkSite(params: DeleteNetworkSiteRequest): Request[DeleteNetworkSiteResponse, AWSError] = js.native
  def deleteNetworkSite(
    params: DeleteNetworkSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkSiteResponse, Unit]
  ): Request[DeleteNetworkSiteResponse, AWSError] = js.native
  
  /**
    * Gets the specified device identifier.
    */
  def getDeviceIdentifier(): Request[GetDeviceIdentifierResponse, AWSError] = js.native
  def getDeviceIdentifier(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceIdentifierResponse, Unit]): Request[GetDeviceIdentifierResponse, AWSError] = js.native
  /**
    * Gets the specified device identifier.
    */
  def getDeviceIdentifier(params: GetDeviceIdentifierRequest): Request[GetDeviceIdentifierResponse, AWSError] = js.native
  def getDeviceIdentifier(
    params: GetDeviceIdentifierRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceIdentifierResponse, Unit]
  ): Request[GetDeviceIdentifierResponse, AWSError] = js.native
  
  /**
    * Gets the specified network.
    */
  def getNetwork(): Request[GetNetworkResponse, AWSError] = js.native
  def getNetwork(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResponse, Unit]): Request[GetNetworkResponse, AWSError] = js.native
  /**
    * Gets the specified network.
    */
  def getNetwork(params: GetNetworkRequest): Request[GetNetworkResponse, AWSError] = js.native
  def getNetwork(
    params: GetNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResponse, Unit]
  ): Request[GetNetworkResponse, AWSError] = js.native
  
  /**
    * Gets the specified network resource.
    */
  def getNetworkResource(): Request[GetNetworkResourceResponse, AWSError] = js.native
  def getNetworkResource(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResourceResponse, Unit]): Request[GetNetworkResourceResponse, AWSError] = js.native
  /**
    * Gets the specified network resource.
    */
  def getNetworkResource(params: GetNetworkResourceRequest): Request[GetNetworkResourceResponse, AWSError] = js.native
  def getNetworkResource(
    params: GetNetworkResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkResourceResponse, Unit]
  ): Request[GetNetworkResourceResponse, AWSError] = js.native
  
  /**
    * Gets the specified network site.
    */
  def getNetworkSite(): Request[GetNetworkSiteResponse, AWSError] = js.native
  def getNetworkSite(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkSiteResponse, Unit]): Request[GetNetworkSiteResponse, AWSError] = js.native
  /**
    * Gets the specified network site.
    */
  def getNetworkSite(params: GetNetworkSiteRequest): Request[GetNetworkSiteResponse, AWSError] = js.native
  def getNetworkSite(
    params: GetNetworkSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkSiteResponse, Unit]
  ): Request[GetNetworkSiteResponse, AWSError] = js.native
  
  /**
    * Gets the specified order.
    */
  def getOrder(): Request[GetOrderResponse, AWSError] = js.native
  def getOrder(callback: js.Function2[/* err */ AWSError, /* data */ GetOrderResponse, Unit]): Request[GetOrderResponse, AWSError] = js.native
  /**
    * Gets the specified order.
    */
  def getOrder(params: GetOrderRequest): Request[GetOrderResponse, AWSError] = js.native
  def getOrder(
    params: GetOrderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrderResponse, Unit]
  ): Request[GetOrderResponse, AWSError] = js.native
  
  /**
    * Lists device identifiers. Add filters to your request to return a more specific list of results. Use filters to match the Amazon Resource Name (ARN) of an order, the status of device identifiers, or the ARN of the traffic group. If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of the specified filters.
    */
  def listDeviceIdentifiers(): Request[ListDeviceIdentifiersResponse, AWSError] = js.native
  def listDeviceIdentifiers(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceIdentifiersResponse, Unit]): Request[ListDeviceIdentifiersResponse, AWSError] = js.native
  /**
    * Lists device identifiers. Add filters to your request to return a more specific list of results. Use filters to match the Amazon Resource Name (ARN) of an order, the status of device identifiers, or the ARN of the traffic group. If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of the specified filters.
    */
  def listDeviceIdentifiers(params: ListDeviceIdentifiersRequest): Request[ListDeviceIdentifiersResponse, AWSError] = js.native
  def listDeviceIdentifiers(
    params: ListDeviceIdentifiersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceIdentifiersResponse, Unit]
  ): Request[ListDeviceIdentifiersResponse, AWSError] = js.native
  
  /**
    * Lists network resources. Add filters to your request to return a more specific list of results. Use filters to match the Amazon Resource Name (ARN) of an order or the status of network resources. If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of the specified filters.
    */
  def listNetworkResources(): Request[ListNetworkResourcesResponse, AWSError] = js.native
  def listNetworkResources(callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkResourcesResponse, Unit]): Request[ListNetworkResourcesResponse, AWSError] = js.native
  /**
    * Lists network resources. Add filters to your request to return a more specific list of results. Use filters to match the Amazon Resource Name (ARN) of an order or the status of network resources. If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of the specified filters.
    */
  def listNetworkResources(params: ListNetworkResourcesRequest): Request[ListNetworkResourcesResponse, AWSError] = js.native
  def listNetworkResources(
    params: ListNetworkResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkResourcesResponse, Unit]
  ): Request[ListNetworkResourcesResponse, AWSError] = js.native
  
  /**
    * Lists network sites. Add filters to your request to return a more specific list of results. Use filters to match the status of the network site.
    */
  def listNetworkSites(): Request[ListNetworkSitesResponse, AWSError] = js.native
  def listNetworkSites(callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkSitesResponse, Unit]): Request[ListNetworkSitesResponse, AWSError] = js.native
  /**
    * Lists network sites. Add filters to your request to return a more specific list of results. Use filters to match the status of the network site.
    */
  def listNetworkSites(params: ListNetworkSitesRequest): Request[ListNetworkSitesResponse, AWSError] = js.native
  def listNetworkSites(
    params: ListNetworkSitesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworkSitesResponse, Unit]
  ): Request[ListNetworkSitesResponse, AWSError] = js.native
  
  /**
    * Lists networks. Add filters to your request to return a more specific list of results. Use filters to match the status of the network.
    */
  def listNetworks(): Request[ListNetworksResponse, AWSError] = js.native
  def listNetworks(callback: js.Function2[/* err */ AWSError, /* data */ ListNetworksResponse, Unit]): Request[ListNetworksResponse, AWSError] = js.native
  /**
    * Lists networks. Add filters to your request to return a more specific list of results. Use filters to match the status of the network.
    */
  def listNetworks(params: ListNetworksRequest): Request[ListNetworksResponse, AWSError] = js.native
  def listNetworks(
    params: ListNetworksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworksResponse, Unit]
  ): Request[ListNetworksResponse, AWSError] = js.native
  
  /**
    * Lists orders. Add filters to your request to return a more specific list of results. Use filters to match the Amazon Resource Name (ARN) of the network site or the status of the order. If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of the specified filters.
    */
  def listOrders(): Request[ListOrdersResponse, AWSError] = js.native
  def listOrders(callback: js.Function2[/* err */ AWSError, /* data */ ListOrdersResponse, Unit]): Request[ListOrdersResponse, AWSError] = js.native
  /**
    * Lists orders. Add filters to your request to return a more specific list of results. Use filters to match the Amazon Resource Name (ARN) of the network site or the status of the order. If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of the specified filters.
    */
  def listOrders(params: ListOrdersRequest): Request[ListOrdersResponse, AWSError] = js.native
  def listOrders(
    params: ListOrdersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrdersResponse, Unit]
  ): Request[ListOrdersResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Checks the health of the service.
    */
  def ping(): Request[PingResponse, AWSError] = js.native
  def ping(callback: js.Function2[/* err */ AWSError, /* data */ PingResponse, Unit]): Request[PingResponse, AWSError] = js.native
  
  /**
    * Starts an update of the specified network resource. After you submit a request to replace or return a network resource, the status of the network resource is CREATING_SHIPPING_LABEL. The shipping label is available when the status of the network resource is PENDING_RETURN. After the network resource is successfully returned, its status is DELETED. For more information, see Return a radio unit.
    */
  def startNetworkResourceUpdate(): Request[StartNetworkResourceUpdateResponse, AWSError] = js.native
  def startNetworkResourceUpdate(callback: js.Function2[/* err */ AWSError, /* data */ StartNetworkResourceUpdateResponse, Unit]): Request[StartNetworkResourceUpdateResponse, AWSError] = js.native
  /**
    * Starts an update of the specified network resource. After you submit a request to replace or return a network resource, the status of the network resource is CREATING_SHIPPING_LABEL. The shipping label is available when the status of the network resource is PENDING_RETURN. After the network resource is successfully returned, its status is DELETED. For more information, see Return a radio unit.
    */
  def startNetworkResourceUpdate(params: StartNetworkResourceUpdateRequest): Request[StartNetworkResourceUpdateResponse, AWSError] = js.native
  def startNetworkResourceUpdate(
    params: StartNetworkResourceUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartNetworkResourceUpdateResponse, Unit]
  ): Request[StartNetworkResourceUpdateResponse, AWSError] = js.native
  
  /**
    *  Adds tags to the specified resource. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Adds tags to the specified resource. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified network site.
    */
  def updateNetworkSite(): Request[UpdateNetworkSiteResponse, AWSError] = js.native
  def updateNetworkSite(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkSiteResponse, Unit]): Request[UpdateNetworkSiteResponse, AWSError] = js.native
  /**
    * Updates the specified network site.
    */
  def updateNetworkSite(params: UpdateNetworkSiteRequest): Request[UpdateNetworkSiteResponse, AWSError] = js.native
  def updateNetworkSite(
    params: UpdateNetworkSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkSiteResponse, Unit]
  ): Request[UpdateNetworkSiteResponse, AWSError] = js.native
  
  /**
    * Updates the specified network site plan.
    */
  def updateNetworkSitePlan(): Request[UpdateNetworkSiteResponse, AWSError] = js.native
  def updateNetworkSitePlan(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkSiteResponse, Unit]): Request[UpdateNetworkSiteResponse, AWSError] = js.native
  /**
    * Updates the specified network site plan.
    */
  def updateNetworkSitePlan(params: UpdateNetworkSitePlanRequest): Request[UpdateNetworkSiteResponse, AWSError] = js.native
  def updateNetworkSitePlan(
    params: UpdateNetworkSitePlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkSiteResponse, Unit]
  ): Request[UpdateNetworkSiteResponse, AWSError] = js.native
}
