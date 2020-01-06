package typings.awsDashSdk.clientsNetworkmanagerMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkManager extends Service {
  @JSName("config")
  var config_NetworkManager: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be associated with the specified device.  You can only associate customer gateways that are connected to a VPN attachment on a transit gateway. The transit gateway must be registered in your global network. When you register a transit gateway, customer gateways that are connected to the transit gateway are automatically included in the global network. To list customer gateways that are connected to a transit gateway, use the DescribeVpnConnections EC2 API and filter by transit-gateway-id. You cannot associate a customer gateway with more than one device and link. 
    */
  def associateCustomerGateway(): Request[AssociateCustomerGatewayResponse, AWSError] = js.native
  def associateCustomerGateway(callback: js.Function2[/* err */ AWSError, /* data */ AssociateCustomerGatewayResponse, Unit]): Request[AssociateCustomerGatewayResponse, AWSError] = js.native
  /**
    * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be associated with the specified device.  You can only associate customer gateways that are connected to a VPN attachment on a transit gateway. The transit gateway must be registered in your global network. When you register a transit gateway, customer gateways that are connected to the transit gateway are automatically included in the global network. To list customer gateways that are connected to a transit gateway, use the DescribeVpnConnections EC2 API and filter by transit-gateway-id. You cannot associate a customer gateway with more than one device and link. 
    */
  def associateCustomerGateway(params: AssociateCustomerGatewayRequest): Request[AssociateCustomerGatewayResponse, AWSError] = js.native
  def associateCustomerGateway(
    params: AssociateCustomerGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateCustomerGatewayResponse, Unit]
  ): Request[AssociateCustomerGatewayResponse, AWSError] = js.native
  /**
    * Associates a link to a device. A device can be associated to multiple links and a link can be associated to multiple devices. The device and link must be in the same global network and the same site.
    */
  def associateLink(): Request[AssociateLinkResponse, AWSError] = js.native
  def associateLink(callback: js.Function2[/* err */ AWSError, /* data */ AssociateLinkResponse, Unit]): Request[AssociateLinkResponse, AWSError] = js.native
  /**
    * Associates a link to a device. A device can be associated to multiple links and a link can be associated to multiple devices. The device and link must be in the same global network and the same site.
    */
  def associateLink(params: AssociateLinkRequest): Request[AssociateLinkResponse, AWSError] = js.native
  def associateLink(
    params: AssociateLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateLinkResponse, Unit]
  ): Request[AssociateLinkResponse, AWSError] = js.native
  /**
    * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site is used for visualization in the Network Manager console.
    */
  def createDevice(): Request[CreateDeviceResponse, AWSError] = js.native
  def createDevice(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceResponse, Unit]): Request[CreateDeviceResponse, AWSError] = js.native
  /**
    * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site is used for visualization in the Network Manager console.
    */
  def createDevice(params: CreateDeviceRequest): Request[CreateDeviceResponse, AWSError] = js.native
  def createDevice(
    params: CreateDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeviceResponse, Unit]
  ): Request[CreateDeviceResponse, AWSError] = js.native
  /**
    * Creates a new, empty global network.
    */
  def createGlobalNetwork(): Request[CreateGlobalNetworkResponse, AWSError] = js.native
  def createGlobalNetwork(callback: js.Function2[/* err */ AWSError, /* data */ CreateGlobalNetworkResponse, Unit]): Request[CreateGlobalNetworkResponse, AWSError] = js.native
  /**
    * Creates a new, empty global network.
    */
  def createGlobalNetwork(params: CreateGlobalNetworkRequest): Request[CreateGlobalNetworkResponse, AWSError] = js.native
  def createGlobalNetwork(
    params: CreateGlobalNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGlobalNetworkResponse, Unit]
  ): Request[CreateGlobalNetworkResponse, AWSError] = js.native
  /**
    * Creates a new link for a specified site.
    */
  def createLink(): Request[CreateLinkResponse, AWSError] = js.native
  def createLink(callback: js.Function2[/* err */ AWSError, /* data */ CreateLinkResponse, Unit]): Request[CreateLinkResponse, AWSError] = js.native
  /**
    * Creates a new link for a specified site.
    */
  def createLink(params: CreateLinkRequest): Request[CreateLinkResponse, AWSError] = js.native
  def createLink(
    params: CreateLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLinkResponse, Unit]
  ): Request[CreateLinkResponse, AWSError] = js.native
  /**
    * Creates a new site in a global network.
    */
  def createSite(): Request[CreateSiteResponse, AWSError] = js.native
  def createSite(callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteResponse, Unit]): Request[CreateSiteResponse, AWSError] = js.native
  /**
    * Creates a new site in a global network.
    */
  def createSite(params: CreateSiteRequest): Request[CreateSiteResponse, AWSError] = js.native
  def createSite(
    params: CreateSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSiteResponse, Unit]
  ): Request[CreateSiteResponse, AWSError] = js.native
  /**
    * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
    */
  def deleteDevice(): Request[DeleteDeviceResponse, AWSError] = js.native
  def deleteDevice(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceResponse, Unit]): Request[DeleteDeviceResponse, AWSError] = js.native
  /**
    * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
    */
  def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse, AWSError] = js.native
  def deleteDevice(
    params: DeleteDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceResponse, Unit]
  ): Request[DeleteDeviceResponse, AWSError] = js.native
  /**
    * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites) and deregister all transit gateways.
    */
  def deleteGlobalNetwork(): Request[DeleteGlobalNetworkResponse, AWSError] = js.native
  def deleteGlobalNetwork(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGlobalNetworkResponse, Unit]): Request[DeleteGlobalNetworkResponse, AWSError] = js.native
  /**
    * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites) and deregister all transit gateways.
    */
  def deleteGlobalNetwork(params: DeleteGlobalNetworkRequest): Request[DeleteGlobalNetworkResponse, AWSError] = js.native
  def deleteGlobalNetwork(
    params: DeleteGlobalNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGlobalNetworkResponse, Unit]
  ): Request[DeleteGlobalNetworkResponse, AWSError] = js.native
  /**
    * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
    */
  def deleteLink(): Request[DeleteLinkResponse, AWSError] = js.native
  def deleteLink(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLinkResponse, Unit]): Request[DeleteLinkResponse, AWSError] = js.native
  /**
    * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
    */
  def deleteLink(params: DeleteLinkRequest): Request[DeleteLinkResponse, AWSError] = js.native
  def deleteLink(
    params: DeleteLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLinkResponse, Unit]
  ): Request[DeleteLinkResponse, AWSError] = js.native
  /**
    * Deletes an existing site. The site cannot be associated with any device or link.
    */
  def deleteSite(): Request[DeleteSiteResponse, AWSError] = js.native
  def deleteSite(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSiteResponse, Unit]): Request[DeleteSiteResponse, AWSError] = js.native
  /**
    * Deletes an existing site. The site cannot be associated with any device or link.
    */
  def deleteSite(params: DeleteSiteRequest): Request[DeleteSiteResponse, AWSError] = js.native
  def deleteSite(
    params: DeleteSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSiteResponse, Unit]
  ): Request[DeleteSiteResponse, AWSError] = js.native
  /**
    * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or modify any of its attachments. This action removes any customer gateway associations.
    */
  def deregisterTransitGateway(): Request[DeregisterTransitGatewayResponse, AWSError] = js.native
  def deregisterTransitGateway(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTransitGatewayResponse, Unit]): Request[DeregisterTransitGatewayResponse, AWSError] = js.native
  /**
    * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or modify any of its attachments. This action removes any customer gateway associations.
    */
  def deregisterTransitGateway(params: DeregisterTransitGatewayRequest): Request[DeregisterTransitGatewayResponse, AWSError] = js.native
  def deregisterTransitGateway(
    params: DeregisterTransitGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTransitGatewayResponse, Unit]
  ): Request[DeregisterTransitGatewayResponse, AWSError] = js.native
  /**
    * Describes one or more global networks. By default, all global networks are described. To describe the objects in your global network, you must use the appropriate Get* action. For example, to list the transit gateways in your global network, use GetTransitGatewayRegistrations.
    */
  def describeGlobalNetworks(): Request[DescribeGlobalNetworksResponse, AWSError] = js.native
  def describeGlobalNetworks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGlobalNetworksResponse, Unit]): Request[DescribeGlobalNetworksResponse, AWSError] = js.native
  /**
    * Describes one or more global networks. By default, all global networks are described. To describe the objects in your global network, you must use the appropriate Get* action. For example, to list the transit gateways in your global network, use GetTransitGatewayRegistrations.
    */
  def describeGlobalNetworks(params: DescribeGlobalNetworksRequest): Request[DescribeGlobalNetworksResponse, AWSError] = js.native
  def describeGlobalNetworks(
    params: DescribeGlobalNetworksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGlobalNetworksResponse, Unit]
  ): Request[DescribeGlobalNetworksResponse, AWSError] = js.native
  /**
    * Disassociates a customer gateway from a device and a link.
    */
  def disassociateCustomerGateway(): Request[DisassociateCustomerGatewayResponse, AWSError] = js.native
  def disassociateCustomerGateway(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateCustomerGatewayResponse, Unit]): Request[DisassociateCustomerGatewayResponse, AWSError] = js.native
  /**
    * Disassociates a customer gateway from a device and a link.
    */
  def disassociateCustomerGateway(params: DisassociateCustomerGatewayRequest): Request[DisassociateCustomerGatewayResponse, AWSError] = js.native
  def disassociateCustomerGateway(
    params: DisassociateCustomerGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateCustomerGatewayResponse, Unit]
  ): Request[DisassociateCustomerGatewayResponse, AWSError] = js.native
  /**
    * Disassociates an existing device from a link. You must first disassociate any customer gateways that are associated with the link.
    */
  def disassociateLink(): Request[DisassociateLinkResponse, AWSError] = js.native
  def disassociateLink(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateLinkResponse, Unit]): Request[DisassociateLinkResponse, AWSError] = js.native
  /**
    * Disassociates an existing device from a link. You must first disassociate any customer gateways that are associated with the link.
    */
  def disassociateLink(params: DisassociateLinkRequest): Request[DisassociateLinkResponse, AWSError] = js.native
  def disassociateLink(
    params: DisassociateLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateLinkResponse, Unit]
  ): Request[DisassociateLinkResponse, AWSError] = js.native
  /**
    * Gets the association information for customer gateways that are associated with devices and links in your global network.
    */
  def getCustomerGatewayAssociations(): Request[GetCustomerGatewayAssociationsResponse, AWSError] = js.native
  def getCustomerGatewayAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomerGatewayAssociationsResponse, Unit]
  ): Request[GetCustomerGatewayAssociationsResponse, AWSError] = js.native
  /**
    * Gets the association information for customer gateways that are associated with devices and links in your global network.
    */
  def getCustomerGatewayAssociations(params: GetCustomerGatewayAssociationsRequest): Request[GetCustomerGatewayAssociationsResponse, AWSError] = js.native
  def getCustomerGatewayAssociations(
    params: GetCustomerGatewayAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomerGatewayAssociationsResponse, Unit]
  ): Request[GetCustomerGatewayAssociationsResponse, AWSError] = js.native
  /**
    * Gets information about one or more of your devices in a global network.
    */
  def getDevices(): Request[GetDevicesResponse, AWSError] = js.native
  def getDevices(callback: js.Function2[/* err */ AWSError, /* data */ GetDevicesResponse, Unit]): Request[GetDevicesResponse, AWSError] = js.native
  /**
    * Gets information about one or more of your devices in a global network.
    */
  def getDevices(params: GetDevicesRequest): Request[GetDevicesResponse, AWSError] = js.native
  def getDevices(
    params: GetDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDevicesResponse, Unit]
  ): Request[GetDevicesResponse, AWSError] = js.native
  /**
    * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
    */
  def getLinkAssociations(): Request[GetLinkAssociationsResponse, AWSError] = js.native
  def getLinkAssociations(callback: js.Function2[/* err */ AWSError, /* data */ GetLinkAssociationsResponse, Unit]): Request[GetLinkAssociationsResponse, AWSError] = js.native
  /**
    * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
    */
  def getLinkAssociations(params: GetLinkAssociationsRequest): Request[GetLinkAssociationsResponse, AWSError] = js.native
  def getLinkAssociations(
    params: GetLinkAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLinkAssociationsResponse, Unit]
  ): Request[GetLinkAssociationsResponse, AWSError] = js.native
  /**
    * Gets information about one or more links in a specified global network. If you specify the site ID, you cannot specify the type or provider in the same request. You can specify the type and provider in the same request.
    */
  def getLinks(): Request[GetLinksResponse, AWSError] = js.native
  def getLinks(callback: js.Function2[/* err */ AWSError, /* data */ GetLinksResponse, Unit]): Request[GetLinksResponse, AWSError] = js.native
  /**
    * Gets information about one or more links in a specified global network. If you specify the site ID, you cannot specify the type or provider in the same request. You can specify the type and provider in the same request.
    */
  def getLinks(params: GetLinksRequest): Request[GetLinksResponse, AWSError] = js.native
  def getLinks(
    params: GetLinksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLinksResponse, Unit]
  ): Request[GetLinksResponse, AWSError] = js.native
  /**
    * Gets information about one or more of your sites in a global network.
    */
  def getSites(): Request[GetSitesResponse, AWSError] = js.native
  def getSites(callback: js.Function2[/* err */ AWSError, /* data */ GetSitesResponse, Unit]): Request[GetSitesResponse, AWSError] = js.native
  /**
    * Gets information about one or more of your sites in a global network.
    */
  def getSites(params: GetSitesRequest): Request[GetSitesResponse, AWSError] = js.native
  def getSites(
    params: GetSitesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSitesResponse, Unit]
  ): Request[GetSitesResponse, AWSError] = js.native
  /**
    * Gets information about the transit gateway registrations in a specified global network.
    */
  def getTransitGatewayRegistrations(): Request[GetTransitGatewayRegistrationsResponse, AWSError] = js.native
  def getTransitGatewayRegistrations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRegistrationsResponse, Unit]
  ): Request[GetTransitGatewayRegistrationsResponse, AWSError] = js.native
  /**
    * Gets information about the transit gateway registrations in a specified global network.
    */
  def getTransitGatewayRegistrations(params: GetTransitGatewayRegistrationsRequest): Request[GetTransitGatewayRegistrationsResponse, AWSError] = js.native
  def getTransitGatewayRegistrations(
    params: GetTransitGatewayRegistrationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTransitGatewayRegistrationsResponse, Unit]
  ): Request[GetTransitGatewayRegistrationsResponse, AWSError] = js.native
  /**
    * Lists the tags for a specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for a specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Registers a transit gateway in your global network. The transit gateway can be in any AWS Region, but it must be owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than one global network.
    */
  def registerTransitGateway(): Request[RegisterTransitGatewayResponse, AWSError] = js.native
  def registerTransitGateway(callback: js.Function2[/* err */ AWSError, /* data */ RegisterTransitGatewayResponse, Unit]): Request[RegisterTransitGatewayResponse, AWSError] = js.native
  /**
    * Registers a transit gateway in your global network. The transit gateway can be in any AWS Region, but it must be owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than one global network.
    */
  def registerTransitGateway(params: RegisterTransitGatewayRequest): Request[RegisterTransitGatewayResponse, AWSError] = js.native
  def registerTransitGateway(
    params: RegisterTransitGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTransitGatewayResponse, Unit]
  ): Request[RegisterTransitGatewayResponse, AWSError] = js.native
  /**
    * Tags a specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tags a specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the details for an existing device. To remove information for any of the parameters, specify an empty string.
    */
  def updateDevice(): Request[UpdateDeviceResponse, AWSError] = js.native
  def updateDevice(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceResponse, Unit]): Request[UpdateDeviceResponse, AWSError] = js.native
  /**
    * Updates the details for an existing device. To remove information for any of the parameters, specify an empty string.
    */
  def updateDevice(params: UpdateDeviceRequest): Request[UpdateDeviceResponse, AWSError] = js.native
  def updateDevice(
    params: UpdateDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceResponse, Unit]
  ): Request[UpdateDeviceResponse, AWSError] = js.native
  /**
    * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
    */
  def updateGlobalNetwork(): Request[UpdateGlobalNetworkResponse, AWSError] = js.native
  def updateGlobalNetwork(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGlobalNetworkResponse, Unit]): Request[UpdateGlobalNetworkResponse, AWSError] = js.native
  /**
    * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
    */
  def updateGlobalNetwork(params: UpdateGlobalNetworkRequest): Request[UpdateGlobalNetworkResponse, AWSError] = js.native
  def updateGlobalNetwork(
    params: UpdateGlobalNetworkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGlobalNetworkResponse, Unit]
  ): Request[UpdateGlobalNetworkResponse, AWSError] = js.native
  /**
    * Updates the details for an existing link. To remove information for any of the parameters, specify an empty string.
    */
  def updateLink(): Request[UpdateLinkResponse, AWSError] = js.native
  def updateLink(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLinkResponse, Unit]): Request[UpdateLinkResponse, AWSError] = js.native
  /**
    * Updates the details for an existing link. To remove information for any of the parameters, specify an empty string.
    */
  def updateLink(params: UpdateLinkRequest): Request[UpdateLinkResponse, AWSError] = js.native
  def updateLink(
    params: UpdateLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLinkResponse, Unit]
  ): Request[UpdateLinkResponse, AWSError] = js.native
  /**
    * Updates the information for an existing site. To remove information for any of the parameters, specify an empty string.
    */
  def updateSite(): Request[UpdateSiteResponse, AWSError] = js.native
  def updateSite(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteResponse, Unit]): Request[UpdateSiteResponse, AWSError] = js.native
  /**
    * Updates the information for an existing site. To remove information for any of the parameters, specify an empty string.
    */
  def updateSite(params: UpdateSiteRequest): Request[UpdateSiteResponse, AWSError] = js.native
  def updateSite(
    params: UpdateSiteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSiteResponse, Unit]
  ): Request[UpdateSiteResponse, AWSError] = js.native
}

