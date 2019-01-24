package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/worklink", "WorkLink")
@js.native
object WorkLinkNs extends js.Object {
  trait AssociateWebsiteCertificateAuthorityRequest extends js.Object {
    /**
      * The root certificate of the CA.
      */
    var Certificate: Certificate
    /**
      * The certificate name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait AssociateWebsiteCertificateAuthorityResponse extends js.Object {
    /**
      * A unique identifier for the CA.
      */
    var WebsiteCaId: js.UndefOr[Id] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateFleetRequest extends js.Object {
    /**
      * The fleet name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * A unique name for the fleet.
      */
    var FleetName: FleetName
    /**
      * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
      */
    var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
  }
  
  trait CreateFleetResponse extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: js.UndefOr[FleetArn] = js.undefined
  }
  
  trait DeleteFleetRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait DeleteFleetResponse extends js.Object
  
  trait DescribeAuditStreamConfigurationRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait DescribeAuditStreamConfigurationResponse extends js.Object {
    /**
      * The ARN of the Amazon Kinesis data stream that will receive the audit events.
      */
    var AuditStreamArn: js.UndefOr[AuditStreamArn] = js.undefined
  }
  
  trait DescribeCompanyNetworkConfigurationRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait DescribeCompanyNetworkConfigurationResponse extends js.Object {
    /**
      * The security groups associated with access to the provided subnets.
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
      * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
      */
    var SubnetIds: js.UndefOr[SubnetIds] = js.undefined
    /**
      * The VPC with connectivity to associated websites.
      */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  trait DescribeDevicePolicyConfigurationRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait DescribeDevicePolicyConfigurationResponse extends js.Object {
    /**
      * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
      */
    var DeviceCaCertificate: js.UndefOr[Certificate] = js.undefined
  }
  
  trait DescribeDeviceRequest extends js.Object {
    /**
      * A unique identifier for a registered user's device.
      */
    var DeviceId: Id
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait DescribeDeviceResponse extends js.Object {
    /**
      * The date that the device first signed in to Amazon WorkLink.
      */
    var FirstAccessedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The date that the device last accessed Amazon WorkLink.
      */
    var LastAccessedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The manufacturer of the device.
      */
    var Manufacturer: js.UndefOr[DeviceManufacturer] = js.undefined
    /**
      * The model of the device.
      */
    var Model: js.UndefOr[DeviceModel] = js.undefined
    /**
      * The operating system of the device.
      */
    var OperatingSystem: js.UndefOr[DeviceOperatingSystemName] = js.undefined
    /**
      * The operating system version of the device.
      */
    var OperatingSystemVersion: js.UndefOr[DeviceOperatingSystemVersion] = js.undefined
    /**
      * The operating system patch level of the device.
      */
    var PatchLevel: js.UndefOr[DevicePatchLevel] = js.undefined
    /**
      * The current state of the device.
      */
    var Status: js.UndefOr[DeviceStatus] = js.undefined
    /**
      * The user name associated with the device.
      */
    var Username: js.UndefOr[Username] = js.undefined
  }
  
  trait DescribeFleetMetadataRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait DescribeFleetMetadataResponse extends js.Object {
    /**
      * The identifier used by users to sign in to the Amazon WorkLink app.
      */
    var CompanyCode: js.UndefOr[CompanyCode] = js.undefined
    /**
      * The time that the fleet was created.
      */
    var CreatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The name of the fleet.
      */
    var FleetName: js.UndefOr[FleetName] = js.undefined
    /**
      * The current state of the fleet.
      */
    var FleetStatus: js.UndefOr[FleetStatus] = js.undefined
    /**
      * The time that the fleet was last updated.
      */
    var LastUpdatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
      */
    var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
  }
  
  trait DescribeIdentityProviderConfigurationRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait DescribeIdentityProviderConfigurationResponse extends js.Object {
    /**
      * The SAML metadata document provided by the user’s identity provider.
      */
    var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
    /**
      * The type of identity provider.
      */
    var IdentityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
    /**
      * The SAML metadata document uploaded to the user’s identity provider.
      */
    var ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
  }
  
  trait DescribeWebsiteCertificateAuthorityRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
    /**
      * A unique identifier for the certificate authority.
      */
    var WebsiteCaId: Id
  }
  
  trait DescribeWebsiteCertificateAuthorityResponse extends js.Object {
    /**
      * The root certificate of the certificate authority.
      */
    var Certificate: js.UndefOr[Certificate] = js.undefined
    /**
      * The time that the certificate authority was added.
      */
    var CreatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The certificate name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
  }
  
  trait DeviceSummary extends js.Object {
    /**
      * The ID of the device.
      */
    var DeviceId: js.UndefOr[Id] = js.undefined
    /**
      * The status of the device.
      */
    var DeviceStatus: js.UndefOr[DeviceStatus] = js.undefined
  }
  
  trait DisassociateWebsiteCertificateAuthorityRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
    /**
      * A unique identifier for the CA.
      */
    var WebsiteCaId: Id
  }
  
  trait DisassociateWebsiteCertificateAuthorityResponse extends js.Object
  
  trait FleetSummary extends js.Object {
    /**
      * The identifier used by users to sign into the Amazon WorkLink app.
      */
    var CompanyCode: js.UndefOr[CompanyCode] = js.undefined
    /**
      * The time when the fleet was created.
      */
    var CreatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The ARN of the fleet.
      */
    var FleetArn: js.UndefOr[FleetArn] = js.undefined
    /**
      * The name of the fleet.
      */
    var FleetName: js.UndefOr[FleetName] = js.undefined
    /**
      * The status of the fleet.
      */
    var FleetStatus: js.UndefOr[FleetStatus] = js.undefined
    /**
      * The time when the fleet was last updated.
      */
    var LastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  }
  
  trait ListDevicesRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
    /**
      * The maximum number of results to be included in the next page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The pagination token used to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDevicesResponse extends js.Object {
    /**
      * Information about the devices.
      */
    var Devices: js.UndefOr[DeviceSummaryList] = js.undefined
    /**
      * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListFleetsRequest extends js.Object {
    /**
      * The maximum number of results to be included in the next page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The pagination token used to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListFleetsResponse extends js.Object {
    /**
      * The summary list of the fleets.
      */
    var FleetSummaryList: js.UndefOr[FleetSummaryList] = js.undefined
    /**
      * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListWebsiteCertificateAuthoritiesRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
    /**
      * The maximum number of results to be included in the next page.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The pagination token used to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListWebsiteCertificateAuthoritiesResponse extends js.Object {
    /**
      * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the certificates.
      */
    var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList] = js.undefined
  }
  
  trait SignOutUserRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
    /**
      * The name of the user.
      */
    var Username: Username
  }
  
  trait SignOutUserResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UpdateAuditStreamConfigurationRequest extends js.Object {
    /**
      * The ARN of the Amazon Kinesis data stream that receives the audit events.
      */
    var AuditStreamArn: js.UndefOr[AuditStreamArn] = js.undefined
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait UpdateAuditStreamConfigurationResponse extends js.Object
  
  trait UpdateCompanyNetworkConfigurationRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
    /**
      * The security groups associated with access to the provided subnets.
      */
    var SecurityGroupIds: SecurityGroupIds
    /**
      * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
      */
    var SubnetIds: SubnetIds
    /**
      * The VPC with connectivity to associated websites.
      */
    var VpcId: VpcId
  }
  
  trait UpdateCompanyNetworkConfigurationResponse extends js.Object
  
  trait UpdateDevicePolicyConfigurationRequest extends js.Object {
    /**
      * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
      */
    var DeviceCaCertificate: js.UndefOr[CertificateChain] = js.undefined
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
  }
  
  trait UpdateDevicePolicyConfigurationResponse extends js.Object
  
  trait UpdateFleetMetadataRequest extends js.Object {
    /**
      * The fleet name to display. The existing DisplayName is unset if null is passed.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
    /**
      * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
      */
    var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
  }
  
  trait UpdateFleetMetadataResponse extends js.Object
  
  trait UpdateIdentityProviderConfigurationRequest extends js.Object {
    /**
      * The ARN of the fleet.
      */
    var FleetArn: FleetArn
    /**
      * The SAML metadata document provided by the customer’s identity provider. The existing IdentityProviderSamlMetadata is unset if null is passed.
      */
    var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
    /**
      * The type of identity provider.
      */
    var IdentityProviderType: IdentityProviderType
  }
  
  trait UpdateIdentityProviderConfigurationResponse extends js.Object
  
  trait WebsiteCaSummary extends js.Object {
    /**
      * The time when the CA was added.
      */
    var CreatedTime: js.UndefOr[DateTime] = js.undefined
    /**
      * The name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * A unique identifier for the CA.
      */
    var WebsiteCaId: js.UndefOr[Id] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AuditStreamArn = java.lang.String
  type Boolean = scala.Boolean
  type Certificate = java.lang.String
  type CertificateChain = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CompanyCode = java.lang.String
  type DateTime = stdLib.Date
  type DeviceManufacturer = java.lang.String
  type DeviceModel = java.lang.String
  type DeviceOperatingSystemName = java.lang.String
  type DeviceOperatingSystemVersion = java.lang.String
  type DevicePatchLevel = java.lang.String
  type DeviceStatus = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.SIGNED_OUT | java.lang.String
  type DeviceSummaryList = js.Array[DeviceSummary]
  type DisplayName = java.lang.String
  type FleetArn = java.lang.String
  type FleetName = java.lang.String
  type FleetStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.DELETED | awsDashSdkLib.awsDashSdkLibStrings.FAILED_TO_CREATE | awsDashSdkLib.awsDashSdkLibStrings.FAILED_TO_DELETE | java.lang.String
  type FleetSummaryList = js.Array[FleetSummary]
  type Id = java.lang.String
  type IdentityProviderType = awsDashSdkLib.awsDashSdkLibStrings.SAML | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type SamlMetadata = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type Username = java.lang.String
  type VpcId = java.lang.String
  type WebsiteCaSummaryList = js.Array[WebsiteCaSummary]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-09-25` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

