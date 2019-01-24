package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkLink
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_WorkLink: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ClientConfiguration = js.native
  /**
    * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated websites within the company network.
    */
  def associateWebsiteCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.AssociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateWebsiteCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.AssociateWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.AssociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated websites within the company network.
    */
  def associateWebsiteCertificateAuthority(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.AssociateWebsiteCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.AssociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateWebsiteCertificateAuthority(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.AssociateWebsiteCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.AssociateWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.AssociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to authorized users who download and set up the Amazon WorkLink app.
    */
  def createFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.CreateFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.CreateFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.CreateFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to authorized users who download and set up the Amazon WorkLink app.
    */
  def createFleet(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.CreateFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.CreateFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.CreateFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.CreateFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a fleet. Prevents users from accessing previously associated websites. 
    */
  def deleteFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DeleteFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DeleteFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DeleteFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a fleet. Prevents users from accessing previously associated websites. 
    */
  def deleteFleet(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DeleteFleetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DeleteFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFleet(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DeleteFleetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DeleteFleetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DeleteFleetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the configuration for delivering audit streams to the customer account.
    */
  def describeAuditStreamConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeAuditStreamConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAuditStreamConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeAuditStreamConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeAuditStreamConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the configuration for delivering audit streams to the customer account.
    */
  def describeAuditStreamConfiguration(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeAuditStreamConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeAuditStreamConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAuditStreamConfiguration(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeAuditStreamConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeAuditStreamConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeAuditStreamConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the networking configuration to access the internal websites associated with the specified fleet.
    */
  def describeCompanyNetworkConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeCompanyNetworkConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCompanyNetworkConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeCompanyNetworkConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeCompanyNetworkConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the networking configuration to access the internal websites associated with the specified fleet.
    */
  def describeCompanyNetworkConfiguration(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeCompanyNetworkConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeCompanyNetworkConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCompanyNetworkConfiguration(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeCompanyNetworkConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeCompanyNetworkConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeCompanyNetworkConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about a user's device.
    */
  def describeDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about a user's device.
    */
  def describeDevice(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDeviceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDevice(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the device policy configuration for the specified fleet.
    */
  def describeDevicePolicyConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDevicePolicyConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDevicePolicyConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDevicePolicyConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDevicePolicyConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the device policy configuration for the specified fleet.
    */
  def describeDevicePolicyConfiguration(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDevicePolicyConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDevicePolicyConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDevicePolicyConfiguration(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDevicePolicyConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDevicePolicyConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeDevicePolicyConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides basic information for the specified fleet, excluding identity provider, networking, and device configuration details.
    */
  def describeFleetMetadata(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeFleetMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeFleetMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeFleetMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides basic information for the specified fleet, excluding identity provider, networking, and device configuration details.
    */
  def describeFleetMetadata(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeFleetMetadataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeFleetMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetMetadata(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeFleetMetadataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeFleetMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeFleetMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the identity provider configuration of the specified fleet.
    */
  def describeIdentityProviderConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeIdentityProviderConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIdentityProviderConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeIdentityProviderConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeIdentityProviderConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the identity provider configuration of the specified fleet.
    */
  def describeIdentityProviderConfiguration(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeIdentityProviderConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeIdentityProviderConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIdentityProviderConfiguration(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeIdentityProviderConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeIdentityProviderConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeIdentityProviderConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about the certificate authority.
    */
  def describeWebsiteCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWebsiteCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about the certificate authority.
    */
  def describeWebsiteCertificateAuthority(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeWebsiteCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeWebsiteCertificateAuthority(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeWebsiteCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DescribeWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a certificate authority (CA).
    */
  def disassociateWebsiteCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DisassociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateWebsiteCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DisassociateWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DisassociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a certificate authority (CA).
    */
  def disassociateWebsiteCertificateAuthority(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DisassociateWebsiteCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DisassociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateWebsiteCertificateAuthority(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DisassociateWebsiteCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DisassociateWebsiteCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.DisassociateWebsiteCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of devices registered with the specified fleet.
    */
  def listDevices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of devices registered with the specified fleet.
    */
  def listDevices(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListDevicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDevices(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of fleets for the current account and Region.
    */
  def listFleets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListFleetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListFleetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListFleetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of fleets for the current account and Region.
    */
  def listFleets(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListFleetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListFleetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFleets(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListFleetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListFleetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListFleetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of certificate authorities added for the current account and Region.
    */
  def listWebsiteCertificateAuthorities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListWebsiteCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWebsiteCertificateAuthorities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListWebsiteCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListWebsiteCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of certificate authorities added for the current account and Region.
    */
  def listWebsiteCertificateAuthorities(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListWebsiteCertificateAuthoritiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListWebsiteCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWebsiteCertificateAuthorities(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListWebsiteCertificateAuthoritiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListWebsiteCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.ListWebsiteCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
    */
  def signOutUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.SignOutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def signOutUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.SignOutUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.SignOutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
    */
  def signOutUser(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.SignOutUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.SignOutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def signOutUser(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.SignOutUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.SignOutUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.SignOutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the audit stream configuration for the fleet.
    */
  def updateAuditStreamConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateAuditStreamConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAuditStreamConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateAuditStreamConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateAuditStreamConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the audit stream configuration for the fleet.
    */
  def updateAuditStreamConfiguration(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateAuditStreamConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateAuditStreamConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAuditStreamConfiguration(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateAuditStreamConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateAuditStreamConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateAuditStreamConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the company network configuration for the fleet.
    */
  def updateCompanyNetworkConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateCompanyNetworkConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateCompanyNetworkConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateCompanyNetworkConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateCompanyNetworkConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the company network configuration for the fleet.
    */
  def updateCompanyNetworkConfiguration(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateCompanyNetworkConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateCompanyNetworkConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateCompanyNetworkConfiguration(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateCompanyNetworkConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateCompanyNetworkConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateCompanyNetworkConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the device policy configuration for the fleet.
    */
  def updateDevicePolicyConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateDevicePolicyConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDevicePolicyConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateDevicePolicyConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateDevicePolicyConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the device policy configuration for the fleet.
    */
  def updateDevicePolicyConfiguration(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateDevicePolicyConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateDevicePolicyConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDevicePolicyConfiguration(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateDevicePolicyConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateDevicePolicyConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateDevicePolicyConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates fleet metadata, such as DisplayName.
    */
  def updateFleetMetadata(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateFleetMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleetMetadata(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateFleetMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateFleetMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates fleet metadata, such as DisplayName.
    */
  def updateFleetMetadata(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateFleetMetadataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateFleetMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleetMetadata(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateFleetMetadataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateFleetMetadataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateFleetMetadataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the identity provider configuration for the fleet.
    */
  def updateIdentityProviderConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateIdentityProviderConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateIdentityProviderConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateIdentityProviderConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateIdentityProviderConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the identity provider configuration for the fleet.
    */
  def updateIdentityProviderConfiguration(params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateIdentityProviderConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateIdentityProviderConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateIdentityProviderConfiguration(
    params: awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateIdentityProviderConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateIdentityProviderConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorklinkMod.WorkLinkNs.UpdateIdentityProviderConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

