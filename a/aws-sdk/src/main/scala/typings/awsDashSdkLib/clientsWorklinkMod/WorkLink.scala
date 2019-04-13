package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkLink
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_WorkLink: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated websites within the company network.
    */
  def associateWebsiteCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[AssociateWebsiteCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateWebsiteCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateWebsiteCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated websites within the company network.
    */
  def associateWebsiteCertificateAuthority(params: AssociateWebsiteCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[AssociateWebsiteCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateWebsiteCertificateAuthority(
    params: AssociateWebsiteCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateWebsiteCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to authorized users who download and set up the Amazon WorkLink app.
    */
  def createFleet(): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to authorized users who download and set up the Amazon WorkLink app.
    */
  def createFleet(params: CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFleet(
    params: CreateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a fleet. Prevents users from accessing previously associated websites. 
    */
  def deleteFleet(): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a fleet. Prevents users from accessing previously associated websites. 
    */
  def deleteFleet(params: DeleteFleetRequest): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFleet(
    params: DeleteFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the configuration for delivering audit streams to the customer account.
    */
  def describeAuditStreamConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeAuditStreamConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAuditStreamConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAuditStreamConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAuditStreamConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the configuration for delivering audit streams to the customer account.
    */
  def describeAuditStreamConfiguration(params: DescribeAuditStreamConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeAuditStreamConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAuditStreamConfiguration(
    params: DescribeAuditStreamConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAuditStreamConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAuditStreamConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the networking configuration to access the internal websites associated with the specified fleet.
    */
  def describeCompanyNetworkConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeCompanyNetworkConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCompanyNetworkConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCompanyNetworkConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCompanyNetworkConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the networking configuration to access the internal websites associated with the specified fleet.
    */
  def describeCompanyNetworkConfiguration(params: DescribeCompanyNetworkConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeCompanyNetworkConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCompanyNetworkConfiguration(
    params: DescribeCompanyNetworkConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeCompanyNetworkConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeCompanyNetworkConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides information about a user's device.
    */
  def describeDevice(): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides information about a user's device.
    */
  def describeDevice(params: DescribeDeviceRequest): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDevice(
    params: DescribeDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the device policy configuration for the specified fleet.
    */
  def describeDevicePolicyConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeDevicePolicyConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDevicePolicyConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDevicePolicyConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDevicePolicyConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the device policy configuration for the specified fleet.
    */
  def describeDevicePolicyConfiguration(params: DescribeDevicePolicyConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeDevicePolicyConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDevicePolicyConfiguration(
    params: DescribeDevicePolicyConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDevicePolicyConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDevicePolicyConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides basic information for the specified fleet, excluding identity provider, networking, and device configuration details.
    */
  def describeFleetMetadata(): awsDashSdkLib.libRequestMod.Request[DescribeFleetMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFleetMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides basic information for the specified fleet, excluding identity provider, networking, and device configuration details.
    */
  def describeFleetMetadata(params: DescribeFleetMetadataRequest): awsDashSdkLib.libRequestMod.Request[DescribeFleetMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeFleetMetadata(
    params: DescribeFleetMetadataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeFleetMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeFleetMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the identity provider configuration of the specified fleet.
    */
  def describeIdentityProviderConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeIdentityProviderConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIdentityProviderConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIdentityProviderConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIdentityProviderConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the identity provider configuration of the specified fleet.
    */
  def describeIdentityProviderConfiguration(params: DescribeIdentityProviderConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeIdentityProviderConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIdentityProviderConfiguration(
    params: DescribeIdentityProviderConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIdentityProviderConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIdentityProviderConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides information about the certificate authority.
    */
  def describeWebsiteCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[DescribeWebsiteCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeWebsiteCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeWebsiteCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides information about the certificate authority.
    */
  def describeWebsiteCertificateAuthority(params: DescribeWebsiteCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[DescribeWebsiteCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeWebsiteCertificateAuthority(
    params: DescribeWebsiteCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeWebsiteCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a certificate authority (CA).
    */
  def disassociateWebsiteCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[
    DisassociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateWebsiteCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DisassociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a certificate authority (CA).
    */
  def disassociateWebsiteCertificateAuthority(params: DisassociateWebsiteCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[
    DisassociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateWebsiteCertificateAuthority(
    params: DisassociateWebsiteCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DisassociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of devices registered with the specified fleet.
    */
  def listDevices(): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of devices registered with the specified fleet.
    */
  def listDevices(params: ListDevicesRequest): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of fleets for the current account and Region.
    */
  def listFleets(): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFleetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of fleets for the current account and Region.
    */
  def listFleets(params: ListFleetsRequest): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFleets(
    params: ListFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFleetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of certificate authorities added for the current account and Region.
    */
  def listWebsiteCertificateAuthorities(): awsDashSdkLib.libRequestMod.Request[ListWebsiteCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWebsiteCertificateAuthorities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWebsiteCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWebsiteCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of certificate authorities added for the current account and Region.
    */
  def listWebsiteCertificateAuthorities(params: ListWebsiteCertificateAuthoritiesRequest): awsDashSdkLib.libRequestMod.Request[ListWebsiteCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWebsiteCertificateAuthorities(
    params: ListWebsiteCertificateAuthoritiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWebsiteCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWebsiteCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
    */
  def signOutUser(): awsDashSdkLib.libRequestMod.Request[SignOutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def signOutUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SignOutUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SignOutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
    */
  def signOutUser(params: SignOutUserRequest): awsDashSdkLib.libRequestMod.Request[SignOutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def signOutUser(
    params: SignOutUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SignOutUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SignOutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the audit stream configuration for the fleet.
    */
  def updateAuditStreamConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateAuditStreamConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuditStreamConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAuditStreamConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAuditStreamConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the audit stream configuration for the fleet.
    */
  def updateAuditStreamConfiguration(params: UpdateAuditStreamConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateAuditStreamConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuditStreamConfiguration(
    params: UpdateAuditStreamConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAuditStreamConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAuditStreamConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the company network configuration for the fleet.
    */
  def updateCompanyNetworkConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateCompanyNetworkConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCompanyNetworkConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCompanyNetworkConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCompanyNetworkConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the company network configuration for the fleet.
    */
  def updateCompanyNetworkConfiguration(params: UpdateCompanyNetworkConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateCompanyNetworkConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCompanyNetworkConfiguration(
    params: UpdateCompanyNetworkConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCompanyNetworkConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCompanyNetworkConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the device policy configuration for the fleet.
    */
  def updateDevicePolicyConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateDevicePolicyConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDevicePolicyConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDevicePolicyConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDevicePolicyConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the device policy configuration for the fleet.
    */
  def updateDevicePolicyConfiguration(params: UpdateDevicePolicyConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateDevicePolicyConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDevicePolicyConfiguration(
    params: UpdateDevicePolicyConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDevicePolicyConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDevicePolicyConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates fleet metadata, such as DisplayName.
    */
  def updateFleetMetadata(): awsDashSdkLib.libRequestMod.Request[UpdateFleetMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFleetMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFleetMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFleetMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates fleet metadata, such as DisplayName.
    */
  def updateFleetMetadata(params: UpdateFleetMetadataRequest): awsDashSdkLib.libRequestMod.Request[UpdateFleetMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFleetMetadata(
    params: UpdateFleetMetadataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFleetMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFleetMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the identity provider configuration for the fleet.
    */
  def updateIdentityProviderConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateIdentityProviderConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIdentityProviderConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIdentityProviderConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIdentityProviderConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the identity provider configuration for the fleet.
    */
  def updateIdentityProviderConfiguration(params: UpdateIdentityProviderConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateIdentityProviderConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIdentityProviderConfiguration(
    params: UpdateIdentityProviderConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIdentityProviderConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIdentityProviderConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

