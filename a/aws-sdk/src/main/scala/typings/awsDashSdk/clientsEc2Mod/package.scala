package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEc2Mod {
  import typings.awsDashSdk.awsDashSdkStrings.ATTACHED
  import typings.awsDashSdk.awsDashSdkStrings.Hourly_
  import typings.awsDashSdk.awsDashSdkStrings.Static_
  import typings.awsDashSdk.awsDashSdkStrings.Topic
  import typings.awsDashSdk.awsDashSdkStrings.USD
  import typings.awsDashSdk.awsDashSdkStrings.Windows_
  import typings.awsDashSdk.awsDashSdkStrings.`amazon-dns`
  import typings.awsDashSdk.awsDashSdkStrings.`use-capacity-reservations-first`
  import typings.awsDashSdk.awsDashSdkStrings.all__
  import typings.awsDashSdk.awsDashSdkStrings.default_
  import typings.awsDashSdk.awsDashSdkStrings.efa
  import typings.awsDashSdk.awsDashSdkStrings.ipsecDot1
  import typings.awsDashSdk.awsDashSdkStrings.launchPermission
  import typings.awsDashSdk.awsDashSdkStrings.loadPermission
  import typings.awsDashSdk.awsDashSdkStrings.openvpn
  import typings.awsDashSdk.awsDashSdkStrings.ova
  import typings.awsDashSdk.awsDashSdkStrings.reachability
  import typings.awsDashSdk.awsDashSdkStrings.spot_
  import typings.awsDashSdk.awsDashSdkStrings.volume_
  import typings.awsDashSdk.awsDashSdkStrings.vpc_
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AccountAttributeList = js.Array[AccountAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`supported-platforms`
    - typings.awsDashSdk.awsDashSdkStrings.`default-vpc`
    - java.lang.String
  */
  type AccountAttributeName = _AccountAttributeName | java.lang.String
  type AccountAttributeNameStringList = js.Array[AccountAttributeName]
  type AccountAttributeValueList = js.Array[AccountAttributeValue]
  type ActiveInstanceSet = js.Array[ActiveInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - typings.awsDashSdk.awsDashSdkStrings.pending_fulfillment
    - typings.awsDashSdk.awsDashSdkStrings.pending_termination
    - typings.awsDashSdk.awsDashSdkStrings.fulfilled__
    - java.lang.String
  */
  type ActivityStatus = _ActivityStatus | java.lang.String
  type AddressList = js.Array[Address]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.default_
    - typings.awsDashSdk.awsDashSdkStrings.host_
    - java.lang.String
  */
  type Affinity = _Affinity | java.lang.String
  type AllocationId = java.lang.String
  type AllocationIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.`under-assessment`
    - typings.awsDashSdk.awsDashSdkStrings.`permanent-failure`
    - typings.awsDashSdk.awsDashSdkStrings.released
    - typings.awsDashSdk.awsDashSdkStrings.`released-permanent-failure`
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - java.lang.String
  */
  type AllocationState = _AllocationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.lowestPrice
    - typings.awsDashSdk.awsDashSdkStrings.diversified
    - typings.awsDashSdk.awsDashSdkStrings.capacityOptimized
    - java.lang.String
  */
  type AllocationStrategy = _AllocationStrategy | java.lang.String
  type AllowedPrincipalSet = js.Array[AllowedPrincipal]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.on_
    - typings.awsDashSdk.awsDashSdkStrings.off__
    - java.lang.String
  */
  type AllowsMultipleInstanceTypes = _AllowsMultipleInstanceTypes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.i386
    - typings.awsDashSdk.awsDashSdkStrings.x86_64_
    - typings.awsDashSdk.awsDashSdkStrings.arm64_
    - java.lang.String
  */
  type ArchitectureType = _ArchitectureType | java.lang.String
  type ArchitectureTypeList = js.Array[ArchitectureType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.i386
    - typings.awsDashSdk.awsDashSdkStrings.x86_64_
    - typings.awsDashSdk.awsDashSdkStrings.arm64_
    - java.lang.String
  */
  type ArchitectureValues = _ArchitectureValues | java.lang.String
  type AssignedPrivateIpAddressList = js.Array[AssignedPrivateIpAddress]
  type AssociatedNetworkType = vpc_ | java.lang.String
  type AssociatedTargetNetworkSet = js.Array[AssociatedTargetNetwork]
  type AssociationIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.`association-failed`
    - typings.awsDashSdk.awsDashSdkStrings.disassociating__
    - typings.awsDashSdk.awsDashSdkStrings.disassociated_
    - java.lang.String
  */
  type AssociationStatusCode = _AssociationStatusCode | java.lang.String
  type AttachmentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.attaching_
    - typings.awsDashSdk.awsDashSdkStrings.attached_
    - typings.awsDashSdk.awsDashSdkStrings.detaching__
    - typings.awsDashSdk.awsDashSdkStrings.detached__
    - java.lang.String
  */
  type AttachmentStatus = _AttachmentStatus | java.lang.String
  type AuthorizationRuleSet = js.Array[AuthorizationRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable_
    - typings.awsDashSdk.awsDashSdkStrings.disable_
    - java.lang.String
  */
  type AutoAcceptSharedAttachmentsValue = _AutoAcceptSharedAttachmentsValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.on_
    - typings.awsDashSdk.awsDashSdkStrings.off__
    - java.lang.String
  */
  type AutoPlacement = _AutoPlacement | java.lang.String
  type AutoRecoveryFlag = scala.Boolean
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZoneMessageList = js.Array[AvailabilityZoneMessage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`opt-in-not-required`
    - typings.awsDashSdk.awsDashSdkStrings.`opted-in`
    - typings.awsDashSdk.awsDashSdkStrings.`not-opted-in`
    - java.lang.String
  */
  type AvailabilityZoneOptInStatus = _AvailabilityZoneOptInStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.information
    - typings.awsDashSdk.awsDashSdkStrings.impaired__
    - typings.awsDashSdk.awsDashSdkStrings.unavailable__
    - java.lang.String
  */
  type AvailabilityZoneState = _AvailabilityZoneState | java.lang.String
  type AvailabilityZoneStringList = js.Array[String]
  type AvailableInstanceCapacityList = js.Array[InstanceCapacity]
  type BareMetalFlag = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.submitted__
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.cancelled_running
    - typings.awsDashSdk.awsDashSdkStrings.cancelled_terminating
    - typings.awsDashSdk.awsDashSdkStrings.modifying_
    - java.lang.String
  */
  type BatchState = _BatchState | java.lang.String
  type BillingProductList = js.Array[String]
  type BlockDeviceMappingList = js.Array[BlockDeviceMapping]
  type BlockDeviceMappingRequestList = js.Array[BlockDeviceMapping]
  type Boolean = scala.Boolean
  type BundleIdStringList = js.Array[String]
  type BundleTaskList = js.Array[BundleTask]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.`waiting-for-shutdown`
    - typings.awsDashSdk.awsDashSdkStrings.bundling
    - typings.awsDashSdk.awsDashSdkStrings.storing
    - typings.awsDashSdk.awsDashSdkStrings.cancelling__
    - typings.awsDashSdk.awsDashSdkStrings.complete__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - java.lang.String
  */
  type BundleTaskState = _BundleTaskState | java.lang.String
  type BurstablePerformanceFlag = scala.Boolean
  type ByoipCidrSet = js.Array[ByoipCidr]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.advertised
    - typings.awsDashSdk.awsDashSdkStrings.deprovisioned
    - typings.awsDashSdk.awsDashSdkStrings.`failed-deprovision`
    - typings.awsDashSdk.awsDashSdkStrings.`failed-provision`
    - typings.awsDashSdk.awsDashSdkStrings.`pending-deprovision`
    - typings.awsDashSdk.awsDashSdkStrings.`pending-provision`
    - typings.awsDashSdk.awsDashSdkStrings.provisioned_
    - java.lang.String
  */
  type ByoipCidrState = _ByoipCidrState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.fleetRequestIdDoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.fleetRequestIdMalformed
    - typings.awsDashSdk.awsDashSdkStrings.fleetRequestNotInCancellableState
    - typings.awsDashSdk.awsDashSdkStrings.unexpectedError
    - java.lang.String
  */
  type CancelBatchErrorCode = _CancelBatchErrorCode | java.lang.String
  type CancelSpotFleetRequestsErrorSet = js.Array[CancelSpotFleetRequestsErrorItem]
  type CancelSpotFleetRequestsSuccessSet = js.Array[CancelSpotFleetRequestsSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.open__
    - typings.awsDashSdk.awsDashSdkStrings.closed_
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.completed__
    - java.lang.String
  */
  type CancelSpotInstanceRequestState = _CancelSpotInstanceRequestState | java.lang.String
  type CancelledSpotInstanceRequestList = js.Array[CancelledSpotInstanceRequest]
  type CapacityReservationId = java.lang.String
  type CapacityReservationIdSet = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LinuxSlashUNIX
    - typings.awsDashSdk.awsDashSdkStrings.`Red Hat Enterprise Linux`
    - typings.awsDashSdk.awsDashSdkStrings.`SUSE Linux`
    - typings.awsDashSdk.awsDashSdkStrings.Windows_
    - typings.awsDashSdk.awsDashSdkStrings.`Windows with SQL Server`
    - typings.awsDashSdk.awsDashSdkStrings.`Windows with SQL Server Enterprise`
    - typings.awsDashSdk.awsDashSdkStrings.`Windows with SQL Server Standard`
    - typings.awsDashSdk.awsDashSdkStrings.`Windows with SQL Server Web`
    - typings.awsDashSdk.awsDashSdkStrings.`Linux with SQL Server Standard`
    - typings.awsDashSdk.awsDashSdkStrings.`Linux with SQL Server Web`
    - typings.awsDashSdk.awsDashSdkStrings.`Linux with SQL Server Enterprise`
    - java.lang.String
  */
  type CapacityReservationInstancePlatform = _CapacityReservationInstancePlatform | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.open__
    - typings.awsDashSdk.awsDashSdkStrings.none__
    - java.lang.String
  */
  type CapacityReservationPreference = _CapacityReservationPreference | java.lang.String
  type CapacityReservationSet = js.Array[CapacityReservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.expired__
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - java.lang.String
  */
  type CapacityReservationState = _CapacityReservationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.default_
    - typings.awsDashSdk.awsDashSdkStrings.dedicated_
    - java.lang.String
  */
  type CapacityReservationTenancy = _CapacityReservationTenancy | java.lang.String
  type CidrBlockSet = js.Array[CidrBlock]
  type ClassicLinkDnsSupportList = js.Array[ClassicLinkDnsSupport]
  type ClassicLinkInstanceList = js.Array[ClassicLinkInstance]
  type ClassicLoadBalancers = js.Array[ClassicLoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - java.lang.String
  */
  type ClientCertificateRevocationListStatusCode = _ClientCertificateRevocationListStatusCode | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientVpnAuthenticationList = js.Array[ClientVpnAuthentication]
  type ClientVpnAuthenticationRequestList = js.Array[ClientVpnAuthenticationRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`certificate-authentication`
    - typings.awsDashSdk.awsDashSdkStrings.`directory-service-authentication`
    - java.lang.String
  */
  type ClientVpnAuthenticationType = _ClientVpnAuthenticationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.authorizing
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.revoking
    - java.lang.String
  */
  type ClientVpnAuthorizationRuleStatusCode = _ClientVpnAuthorizationRuleStatusCode | java.lang.String
  type ClientVpnConnectionSet = js.Array[ClientVpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.`failed-to-terminate`
    - typings.awsDashSdk.awsDashSdkStrings.terminating__
    - typings.awsDashSdk.awsDashSdkStrings.terminated__
    - java.lang.String
  */
  type ClientVpnConnectionStatusCode = _ClientVpnConnectionStatusCode | java.lang.String
  type ClientVpnEndpointId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`pending-associate`
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type ClientVpnEndpointStatusCode = _ClientVpnEndpointStatusCode | java.lang.String
  type ClientVpnRouteSet = js.Array[ClientVpnRoute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.creating__
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - java.lang.String
  */
  type ClientVpnRouteStatusCode = _ClientVpnRouteStatusCode | java.lang.String
  type ClientVpnSecurityGroupIdSet = js.Array[String]
  type CoipAddressUsageSet = js.Array[CoipAddressUsage]
  type CoipPoolIdSet = js.Array[String]
  type CoipPoolMaxResults = scala.Double
  type CoipPoolSet = js.Array[CoipPool]
  type ConnectionNotificationId = java.lang.String
  type ConnectionNotificationSet = js.Array[ConnectionNotification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type ConnectionNotificationState = _ConnectionNotificationState | java.lang.String
  type ConnectionNotificationType = Topic | java.lang.String
  type ContainerFormat = ova | java.lang.String
  type ConversionIdStringList = js.Array[String]
  type ConversionTaskId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.cancelling__
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.completed__
    - java.lang.String
  */
  type ConversionTaskState = _ConversionTaskState | java.lang.String
  type CopyTagsFromSource = volume_ | java.lang.String
  type CoreCount = scala.Double
  type CoreCountList = js.Array[CoreCount]
  type CreateFleetErrorsSet = js.Array[CreateFleetError]
  type CreateFleetInstancesSet = js.Array[CreateFleetInstance]
  type CreateVolumePermissionList = js.Array[CreateVolumePermission]
  type CurrencyCodeValues = USD | java.lang.String
  type CurrentGenerationFlag = scala.Boolean
  type CustomerGatewayId = java.lang.String
  type CustomerGatewayIdStringList = js.Array[String]
  type CustomerGatewayList = js.Array[CustomerGateway]
  type DITMaxResults = scala.Double
  type DITOMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.Inactive_
    - java.lang.String
  */
  type DatafeedSubscriptionState = _DatafeedSubscriptionState | java.lang.String
  type DateTime = Date
  type DedicatedHostFlag = scala.Boolean
  type DedicatedHostId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable_
    - typings.awsDashSdk.awsDashSdkStrings.disable_
    - java.lang.String
  */
  type DefaultRouteTableAssociationValue = _DefaultRouteTableAssociationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable_
    - typings.awsDashSdk.awsDashSdkStrings.disable_
    - java.lang.String
  */
  type DefaultRouteTablePropagationValue = _DefaultRouteTablePropagationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.spot_
    - typings.awsDashSdk.awsDashSdkStrings.`on-demand`
    - java.lang.String
  */
  type DefaultTargetCapacityType = _DefaultTargetCapacityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.fleetIdDoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.fleetIdMalformed
    - typings.awsDashSdk.awsDashSdkStrings.fleetNotInDeletableState
    - typings.awsDashSdk.awsDashSdkStrings.unexpectedError
    - java.lang.String
  */
  type DeleteFleetErrorCode = _DeleteFleetErrorCode | java.lang.String
  type DeleteFleetErrorSet = js.Array[DeleteFleetErrorItem]
  type DeleteFleetSuccessSet = js.Array[DeleteFleetSuccessItem]
  type DeleteLaunchTemplateVersionsResponseErrorSet = js.Array[DeleteLaunchTemplateVersionsResponseErrorItem]
  type DeleteLaunchTemplateVersionsResponseSuccessSet = js.Array[DeleteLaunchTemplateVersionsResponseSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`reserved-instances-id-invalid`
    - typings.awsDashSdk.awsDashSdkStrings.`reserved-instances-not-in-queued-state`
    - typings.awsDashSdk.awsDashSdkStrings.`unexpected-error`
    - java.lang.String
  */
  type DeleteQueuedReservedInstancesErrorCode = _DeleteQueuedReservedInstancesErrorCode | java.lang.String
  type DeleteQueuedReservedInstancesIdList = js.Array[String]
  type DescribeByoipCidrsMaxResults = scala.Double
  type DescribeCapacityReservationsMaxResults = scala.Double
  type DescribeClassicLinkInstancesMaxResults = scala.Double
  type DescribeClientVpnAuthorizationRulesMaxResults = scala.Double
  type DescribeClientVpnConnectionsMaxResults = scala.Double
  type DescribeClientVpnEndpointMaxResults = scala.Double
  type DescribeClientVpnRoutesMaxResults = scala.Double
  type DescribeClientVpnTargetNetworksMaxResults = scala.Double
  type DescribeConversionTaskList = js.Array[ConversionTask]
  type DescribeDhcpOptionsMaxResults = scala.Double
  type DescribeEgressOnlyInternetGatewaysMaxResults = scala.Double
  type DescribeElasticGpusMaxResults = scala.Double
  type DescribeExportImageTasksMaxResults = scala.Double
  type DescribeFastSnapshotRestoreSuccessSet = js.Array[DescribeFastSnapshotRestoreSuccessItem]
  type DescribeFastSnapshotRestoresMaxResults = scala.Double
  type DescribeFleetsErrorSet = js.Array[DescribeFleetError]
  type DescribeFleetsInstancesSet = js.Array[DescribeFleetsInstances]
  type DescribeFpgaImagesMaxResults = scala.Double
  type DescribeHostReservationsMaxResults = scala.Double
  type DescribeIamInstanceProfileAssociationsMaxResults = scala.Double
  type DescribeInstanceCreditSpecificationsMaxResults = scala.Double
  type DescribeInternetGatewaysMaxResults = scala.Double
  type DescribeLaunchTemplatesMaxResults = scala.Double
  type DescribeMovingAddressesMaxResults = scala.Double
  type DescribeNatGatewaysMaxResults = scala.Double
  type DescribeNetworkAclsMaxResults = scala.Double
  type DescribeNetworkInterfacePermissionsMaxResults = scala.Double
  type DescribeNetworkInterfacesMaxResults = scala.Double
  type DescribePrincipalIdFormatMaxResults = scala.Double
  type DescribeRouteTablesMaxResults = scala.Double
  type DescribeScheduledInstanceAvailabilityMaxResults = scala.Double
  type DescribeSecurityGroupsMaxResults = scala.Double
  type DescribeSpotFleetInstancesMaxResults = scala.Double
  type DescribeSpotFleetRequestHistoryMaxResults = scala.Double
  type DescribeStaleSecurityGroupsMaxResults = scala.Double
  type DescribeStaleSecurityGroupsNextToken = java.lang.String
  type DescribeSubnetsMaxResults = scala.Double
  type DescribeVpcClassicLinkDnsSupportMaxResults = scala.Double
  type DescribeVpcClassicLinkDnsSupportNextToken = java.lang.String
  type DescribeVpcPeeringConnectionsMaxResults = scala.Double
  type DescribeVpcsMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ebs_
    - typings.awsDashSdk.awsDashSdkStrings.`instance-store`
    - java.lang.String
  */
  type DeviceType = _DeviceType | java.lang.String
  type DhcpConfigurationList = js.Array[DhcpConfiguration]
  type DhcpConfigurationValueList = js.Array[AttributeValue]
  type DhcpOptionsId = java.lang.String
  type DhcpOptionsIdStringList = js.Array[String]
  type DhcpOptionsList = js.Array[DhcpOptions]
  type DisableFastSnapshotRestoreErrorSet = js.Array[DisableFastSnapshotRestoreErrorItem]
  type DisableFastSnapshotRestoreStateErrorSet = js.Array[DisableFastSnapshotRestoreStateErrorItem]
  type DisableFastSnapshotRestoreSuccessSet = js.Array[DisableFastSnapshotRestoreSuccessItem]
  type DiskCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VMDK
    - typings.awsDashSdk.awsDashSdkStrings.RAW
    - typings.awsDashSdk.awsDashSdkStrings.VHD
    - java.lang.String
  */
  type DiskImageFormat = _DiskImageFormat | java.lang.String
  type DiskImageList = js.Array[DiskImage]
  type DiskInfoList = js.Array[DiskInfo]
  type DiskSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.hdd
    - typings.awsDashSdk.awsDashSdkStrings.ssd
    - java.lang.String
  */
  type DiskType = _DiskType | java.lang.String
  type DnsEntrySet = js.Array[DnsEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable_
    - typings.awsDashSdk.awsDashSdkStrings.disable_
    - java.lang.String
  */
  type DnsSupportValue = _DnsSupportValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.vpc_
    - typings.awsDashSdk.awsDashSdkStrings.standard__
    - java.lang.String
  */
  type DomainType = _DomainType | java.lang.String
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.unsupported
    - typings.awsDashSdk.awsDashSdkStrings.supported
    - java.lang.String
  */
  type EbsEncryptionSupport = _EbsEncryptionSupport | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.unsupported
    - typings.awsDashSdk.awsDashSdkStrings.supported
    - typings.awsDashSdk.awsDashSdkStrings.default_
    - java.lang.String
  */
  type EbsOptimizedSupport = _EbsOptimizedSupport | java.lang.String
  type EgressOnlyInternetGatewayId = java.lang.String
  type EgressOnlyInternetGatewayIdList = js.Array[EgressOnlyInternetGatewayId]
  type EgressOnlyInternetGatewayList = js.Array[EgressOnlyInternetGateway]
  type ElasticGpuAssociationList = js.Array[ElasticGpuAssociation]
  type ElasticGpuIdSet = js.Array[String]
  type ElasticGpuSet = js.Array[ElasticGpus]
  type ElasticGpuSpecificationList = js.Array[ElasticGpuSpecification]
  type ElasticGpuSpecificationResponseList = js.Array[ElasticGpuSpecificationResponse]
  type ElasticGpuSpecifications = js.Array[ElasticGpuSpecification]
  type ElasticGpuState = ATTACHED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OK
    - typings.awsDashSdk.awsDashSdkStrings.IMPAIRED
    - java.lang.String
  */
  type ElasticGpuStatus = _ElasticGpuStatus | java.lang.String
  type ElasticInferenceAcceleratorAssociationList = js.Array[ElasticInferenceAcceleratorAssociation]
  type ElasticInferenceAcceleratorCount = scala.Double
  type ElasticInferenceAccelerators = js.Array[ElasticInferenceAccelerator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.unsupported
    - typings.awsDashSdk.awsDashSdkStrings.supported
    - typings.awsDashSdk.awsDashSdkStrings.required__
    - java.lang.String
  */
  type EnaSupport = _EnaSupport | java.lang.String
  type EnableFastSnapshotRestoreErrorSet = js.Array[EnableFastSnapshotRestoreErrorItem]
  type EnableFastSnapshotRestoreStateErrorSet = js.Array[EnableFastSnapshotRestoreStateErrorItem]
  type EnableFastSnapshotRestoreSuccessSet = js.Array[EnableFastSnapshotRestoreSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.unlimited_
    - typings.awsDashSdk.awsDashSdkStrings.limited
    - java.lang.String
  */
  type EndDateType = _EndDateType | java.lang.String
  type EndpointSet = js.Array[ClientVpnEndpoint]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`instance-reboot`
    - typings.awsDashSdk.awsDashSdkStrings.`system-reboot`
    - typings.awsDashSdk.awsDashSdkStrings.`system-maintenance`
    - typings.awsDashSdk.awsDashSdkStrings.`instance-retirement`
    - typings.awsDashSdk.awsDashSdkStrings.`instance-stop`
    - java.lang.String
  */
  type EventCode = _EventCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.instanceChange
    - typings.awsDashSdk.awsDashSdkStrings.fleetRequestChange
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - typings.awsDashSdk.awsDashSdkStrings.information
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.noTermination
    - typings.awsDashSdk.awsDashSdkStrings.default_
    - java.lang.String
  */
  type ExcessCapacityTerminationPolicy = _ExcessCapacityTerminationPolicy | java.lang.String
  type ExecutableByStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.citrix
    - typings.awsDashSdk.awsDashSdkStrings.vmware_
    - typings.awsDashSdk.awsDashSdkStrings.microsoft
    - java.lang.String
  */
  type ExportEnvironment = _ExportEnvironment | java.lang.String
  type ExportImageTaskIdList = js.Array[String]
  type ExportImageTaskList = js.Array[ExportImageTask]
  type ExportTaskId = java.lang.String
  type ExportTaskIdStringList = js.Array[String]
  type ExportTaskList = js.Array[ExportTask]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.cancelling__
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.completed__
    - java.lang.String
  */
  type ExportTaskState = _ExportTaskState | java.lang.String
  type FailedQueuedPurchaseDeletionSet = js.Array[FailedQueuedPurchaseDeletion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enabling__
    - typings.awsDashSdk.awsDashSdkStrings.optimizing
    - typings.awsDashSdk.awsDashSdkStrings.enabled__
    - typings.awsDashSdk.awsDashSdkStrings.disabling_
    - typings.awsDashSdk.awsDashSdkStrings.disabled__
    - java.lang.String
  */
  type FastSnapshotRestoreStateCode = _FastSnapshotRestoreStateCode | java.lang.String
  type FilterList = js.Array[Filter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - typings.awsDashSdk.awsDashSdkStrings.pending_fulfillment
    - typings.awsDashSdk.awsDashSdkStrings.pending_termination
    - typings.awsDashSdk.awsDashSdkStrings.fulfilled__
    - java.lang.String
  */
  type FleetActivityStatus = _FleetActivityStatus | java.lang.String
  type FleetCapacityReservationUsageStrategy = `use-capacity-reservations-first` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`instance-change`
    - typings.awsDashSdk.awsDashSdkStrings.`fleet-change`
    - typings.awsDashSdk.awsDashSdkStrings.`service-error`
    - java.lang.String
  */
  type FleetEventType = _FleetEventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`no-termination`
    - typings.awsDashSdk.awsDashSdkStrings.termination
    - java.lang.String
  */
  type FleetExcessCapacityTerminationPolicy = _FleetExcessCapacityTerminationPolicy | java.lang.String
  type FleetIdSet = js.Array[FleetIdentifier]
  type FleetIdentifier = java.lang.String
  type FleetLaunchTemplateConfigList = js.Array[FleetLaunchTemplateConfig]
  type FleetLaunchTemplateConfigListRequest = js.Array[FleetLaunchTemplateConfigRequest]
  type FleetLaunchTemplateOverridesList = js.Array[FleetLaunchTemplateOverrides]
  type FleetLaunchTemplateOverridesListRequest = js.Array[FleetLaunchTemplateOverridesRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`lowest-price`
    - typings.awsDashSdk.awsDashSdkStrings.prioritized
    - java.lang.String
  */
  type FleetOnDemandAllocationStrategy = _FleetOnDemandAllocationStrategy | java.lang.String
  type FleetSet = js.Array[FleetData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.submitted__
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.deleted_running
    - typings.awsDashSdk.awsDashSdkStrings.deleted_terminating
    - typings.awsDashSdk.awsDashSdkStrings.modifying_
    - java.lang.String
  */
  type FleetStateCode = _FleetStateCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.request_
    - typings.awsDashSdk.awsDashSdkStrings.maintain
    - typings.awsDashSdk.awsDashSdkStrings.instant
    - java.lang.String
  */
  type FleetType = _FleetType | java.lang.String
  type Float = scala.Double
  type FlowLogSet = js.Array[FlowLog]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VPC
    - typings.awsDashSdk.awsDashSdkStrings.Subnet
    - typings.awsDashSdk.awsDashSdkStrings.NetworkInterface
    - java.lang.String
  */
  type FlowLogsResourceType = _FlowLogsResourceType | java.lang.String
  type FpgaDeviceCount = scala.Double
  type FpgaDeviceInfoList = js.Array[FpgaDeviceInfo]
  type FpgaDeviceManufacturerName = java.lang.String
  type FpgaDeviceMemorySize = scala.Double
  type FpgaDeviceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.description
    - typings.awsDashSdk.awsDashSdkStrings.name__
    - typings.awsDashSdk.awsDashSdkStrings.loadPermission
    - typings.awsDashSdk.awsDashSdkStrings.productCodes
    - java.lang.String
  */
  type FpgaImageAttributeName = _FpgaImageAttributeName | java.lang.String
  type FpgaImageId = java.lang.String
  type FpgaImageIdList = js.Array[String]
  type FpgaImageList = js.Array[FpgaImage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.unavailable__
    - java.lang.String
  */
  type FpgaImageStateCode = _FpgaImageStateCode | java.lang.String
  type FreeTierEligibleFlag = scala.Boolean
  type GatewayType = ipsecDot1 | java.lang.String
  type GetCapacityReservationUsageRequestMaxResults = scala.Double
  type GpuDeviceCount = scala.Double
  type GpuDeviceInfoList = js.Array[GpuDeviceInfo]
  type GpuDeviceManufacturerName = java.lang.String
  type GpuDeviceMemorySize = scala.Double
  type GpuDeviceName = java.lang.String
  type GroupIdStringList = js.Array[String]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupIdentifierSet = js.Array[SecurityGroupIdentifier]
  type GroupIds = js.Array[String]
  type GroupNameStringList = js.Array[String]
  type HibernationFlag = scala.Boolean
  type HistoryRecordSet = js.Array[HistoryRecordEntry]
  type HistoryRecords = js.Array[HistoryRecord]
  type HostInstanceList = js.Array[HostInstance]
  type HostList = js.Array[Host]
  type HostOfferingSet = js.Array[HostOffering]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.on_
    - typings.awsDashSdk.awsDashSdkStrings.off__
    - java.lang.String
  */
  type HostRecovery = _HostRecovery | java.lang.String
  type HostReservationIdSet = js.Array[String]
  type HostReservationSet = js.Array[HostReservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.dedicated_
    - typings.awsDashSdk.awsDashSdkStrings.host_
    - java.lang.String
  */
  type HostTenancy = _HostTenancy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.optional__
    - typings.awsDashSdk.awsDashSdkStrings.required__
    - java.lang.String
  */
  type HttpTokensState = _HttpTokensState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ovm
    - typings.awsDashSdk.awsDashSdkStrings.xen
    - java.lang.String
  */
  type HypervisorType = _HypervisorType | java.lang.String
  type IKEVersionsList = js.Array[IKEVersionsListValue]
  type IKEVersionsRequestList = js.Array[IKEVersionsRequestListValue]
  type IamInstanceProfileAssociationSet = js.Array[IamInstanceProfileAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.disassociating__
    - typings.awsDashSdk.awsDashSdkStrings.disassociated_
    - java.lang.String
  */
  type IamInstanceProfileAssociationState = _IamInstanceProfileAssociationState | java.lang.String
  type IdFormatList = js.Array[IdFormat]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.description
    - typings.awsDashSdk.awsDashSdkStrings.kernel
    - typings.awsDashSdk.awsDashSdkStrings.ramdisk
    - typings.awsDashSdk.awsDashSdkStrings.launchPermission
    - typings.awsDashSdk.awsDashSdkStrings.productCodes
    - typings.awsDashSdk.awsDashSdkStrings.blockDeviceMapping
    - typings.awsDashSdk.awsDashSdkStrings.sriovNetSupport
    - java.lang.String
  */
  type ImageAttributeName = _ImageAttributeName | java.lang.String
  type ImageDiskContainerList = js.Array[ImageDiskContainer]
  type ImageId = java.lang.String
  type ImageIdStringList = js.Array[String]
  type ImageList = js.Array[Image]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.invalid__
    - typings.awsDashSdk.awsDashSdkStrings.deregistered__
    - typings.awsDashSdk.awsDashSdkStrings.transient
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - java.lang.String
  */
  type ImageState = _ImageState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.machine
    - typings.awsDashSdk.awsDashSdkStrings.kernel
    - typings.awsDashSdk.awsDashSdkStrings.ramdisk
    - java.lang.String
  */
  type ImageTypeValues = _ImageTypeValues | java.lang.String
  type ImportImageLicenseSpecificationListRequest = js.Array[ImportImageLicenseConfigurationRequest]
  type ImportImageLicenseSpecificationListResponse = js.Array[ImportImageLicenseConfigurationResponse]
  type ImportImageTaskList = js.Array[ImportImageTask]
  type ImportInstanceVolumeDetailSet = js.Array[ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskList = js.Array[ImportSnapshotTask]
  type ImportTaskId = java.lang.String
  type ImportTaskIdList = js.Array[String]
  type InferenceDeviceCount = scala.Double
  type InferenceDeviceInfoList = js.Array[InferenceDeviceInfo]
  type InferenceDeviceManufacturerName = java.lang.String
  type InferenceDeviceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.instanceType_
    - typings.awsDashSdk.awsDashSdkStrings.kernel
    - typings.awsDashSdk.awsDashSdkStrings.ramdisk
    - typings.awsDashSdk.awsDashSdkStrings.userData
    - typings.awsDashSdk.awsDashSdkStrings.disableApiTermination
    - typings.awsDashSdk.awsDashSdkStrings.instanceInitiatedShutdownBehavior
    - typings.awsDashSdk.awsDashSdkStrings.rootDeviceName
    - typings.awsDashSdk.awsDashSdkStrings.blockDeviceMapping
    - typings.awsDashSdk.awsDashSdkStrings.productCodes
    - typings.awsDashSdk.awsDashSdkStrings.sourceDestCheck
    - typings.awsDashSdk.awsDashSdkStrings.groupSet
    - typings.awsDashSdk.awsDashSdkStrings.ebsOptimized
    - typings.awsDashSdk.awsDashSdkStrings.sriovNetSupport
    - typings.awsDashSdk.awsDashSdkStrings.enaSupport
    - java.lang.String
  */
  type InstanceAttributeName = _InstanceAttributeName | java.lang.String
  type InstanceBlockDeviceMappingList = js.Array[InstanceBlockDeviceMapping]
  type InstanceBlockDeviceMappingSpecificationList = js.Array[InstanceBlockDeviceMappingSpecification]
  type InstanceCountList = js.Array[InstanceCount]
  type InstanceCreditSpecificationList = js.Array[InstanceCreditSpecification]
  type InstanceCreditSpecificationListRequest = js.Array[InstanceCreditSpecificationRequest]
  type InstanceEventId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.healthy__
    - typings.awsDashSdk.awsDashSdkStrings.unhealthy__
    - java.lang.String
  */
  type InstanceHealthStatus = _InstanceHealthStatus | java.lang.String
  type InstanceId = java.lang.String
  type InstanceIdSet = js.Array[String]
  type InstanceIdStringList = js.Array[String]
  type InstanceIdsSet = js.Array[InstanceId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.hibernate
    - typings.awsDashSdk.awsDashSdkStrings.stop
    - typings.awsDashSdk.awsDashSdkStrings.terminate_
    - java.lang.String
  */
  type InstanceInterruptionBehavior = _InstanceInterruptionBehavior | java.lang.String
  type InstanceIpv6AddressList = js.Array[InstanceIpv6Address]
  type InstanceIpv6AddressListRequest = js.Array[InstanceIpv6AddressRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.spot_
    - typings.awsDashSdk.awsDashSdkStrings.`on-demand`
    - java.lang.String
  */
  type InstanceLifecycle = _InstanceLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.spot_
    - typings.awsDashSdk.awsDashSdkStrings.scheduled__
    - java.lang.String
  */
  type InstanceLifecycleType = _InstanceLifecycleType | java.lang.String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.open__
    - typings.awsDashSdk.awsDashSdkStrings.targeted
    - java.lang.String
  */
  type InstanceMatchCriteria = _InstanceMatchCriteria | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.disabled__
    - typings.awsDashSdk.awsDashSdkStrings.enabled__
    - java.lang.String
  */
  type InstanceMetadataEndpointState = _InstanceMetadataEndpointState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.applied
    - java.lang.String
  */
  type InstanceMetadataOptionsState = _InstanceMetadataOptionsState | java.lang.String
  type InstanceMonitoringList = js.Array[InstanceMonitoring]
  type InstanceNetworkInterfaceList = js.Array[InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList = js.Array[InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList = js.Array[InstancePrivateIpAddress]
  type InstanceStateChangeList = js.Array[InstanceStateChange]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.running__
    - typings.awsDashSdk.awsDashSdkStrings.`shutting-down`
    - typings.awsDashSdk.awsDashSdkStrings.terminated__
    - typings.awsDashSdk.awsDashSdkStrings.stopping__
    - typings.awsDashSdk.awsDashSdkStrings.stopped__
    - java.lang.String
  */
  type InstanceStateName = _InstanceStateName | java.lang.String
  type InstanceStatusDetailsList = js.Array[InstanceStatusDetails]
  type InstanceStatusEventList = js.Array[InstanceStatusEvent]
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstanceStorageFlag = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.t1Dotmicro
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotnano
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotmicro
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotsmall
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.t2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.t2Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3Dotnano
    - typings.awsDashSdk.awsDashSdkStrings.t3Dotmicro
    - typings.awsDashSdk.awsDashSdkStrings.t3Dotsmall
    - typings.awsDashSdk.awsDashSdkStrings.t3Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.t3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3aDotnano
    - typings.awsDashSdk.awsDashSdkStrings.t3aDotmicro
    - typings.awsDashSdk.awsDashSdkStrings.t3aDotsmall
    - typings.awsDashSdk.awsDashSdkStrings.t3aDotmedium
    - typings.awsDashSdk.awsDashSdkStrings.t3aDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3aDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3aDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m1Dotsmall
    - typings.awsDashSdk.awsDashSdkStrings.m1Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.m1Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m1Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.m3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m2Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m2Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.cr1Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5Dotmetal
    - typings.awsDashSdk.awsDashSdkStrings.r5aDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDotmetal
    - typings.awsDashSdk.awsDashSdkStrings.r5adDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1Dot32xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDot32xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.i2Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i2Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3Dotmetal
    - typings.awsDashSdk.awsDashSdkStrings.i3enDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDot3xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDot6xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDotmetal
    - typings.awsDashSdk.awsDashSdkStrings.hi1Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.hs1Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c1Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.c1Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5Dotmetal
    - typings.awsDashSdk.awsDashSdkStrings.c5dDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDotmetal
    - typings.awsDashSdk.awsDashSdkStrings.c5nDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.cc1Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.cc2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g2Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g3Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g3Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g3sDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.cg1Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.p2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p2Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p3Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p3dnDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.d2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.d2Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.d2Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.d2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.f1Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.f1Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.f1Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5Dotmetal
    - typings.awsDashSdk.awsDashSdkStrings.m5aDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDotmetal
    - typings.awsDashSdk.awsDashSdkStrings.m5adDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.h1Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.h1Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.h1Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.h1Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDot3xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDot6xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDotmetal
    - typings.awsDashSdk.awsDashSdkStrings.`u-6tb1Dotmetal`
    - typings.awsDashSdk.awsDashSdkStrings.`u-9tb1Dotmetal`
    - typings.awsDashSdk.awsDashSdkStrings.`u-12tb1Dotmetal`
    - typings.awsDashSdk.awsDashSdkStrings.`u-18tb1Dotmetal`
    - typings.awsDashSdk.awsDashSdkStrings.`u-24tb1Dotmetal`
    - typings.awsDashSdk.awsDashSdkStrings.a1Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.a1Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.a1Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.a1Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.a1Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.a1Dotmetal
    - typings.awsDashSdk.awsDashSdkStrings.m5dnDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dnDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dnDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dnDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dnDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dnDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dnDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dnDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5nDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5nDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5nDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5nDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5nDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5nDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5nDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5nDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dnDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dnDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dnDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dnDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dnDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dnDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dnDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dnDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5nDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5nDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5nDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5nDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5nDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5nDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5nDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5nDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.inf1Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.inf1Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.inf1Dot6xlarge
    - typings.awsDashSdk.awsDashSdkStrings.inf1Dot24xlarge
    - java.lang.String
  */
  type InstanceType = _InstanceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.nitro
    - typings.awsDashSdk.awsDashSdkStrings.xen
    - java.lang.String
  */
  type InstanceTypeHypervisor = _InstanceTypeHypervisor | java.lang.String
  type InstanceTypeInfoList = js.Array[InstanceTypeInfo]
  type InstanceTypeList = js.Array[InstanceType]
  type InstanceTypeOfferingsList = js.Array[InstanceTypeOffering]
  type InstanceUsageSet = js.Array[InstanceUsage]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`INSTANCE-ATTACH`
    - typings.awsDashSdk.awsDashSdkStrings.`EIP-ASSOCIATE`
    - java.lang.String
  */
  type InterfacePermissionType = _InterfacePermissionType | java.lang.String
  type InternetGatewayAttachmentList = js.Array[InternetGatewayAttachment]
  type InternetGatewayId = java.lang.String
  type InternetGatewayList = js.Array[InternetGateway]
  type IpPermissionList = js.Array[IpPermission]
  type IpRangeList = js.Array[IpRange]
  type IpRanges = js.Array[String]
  type Ipv6Address = java.lang.String
  type Ipv6AddressList = js.Array[String]
  type Ipv6CidrBlockSet = js.Array[Ipv6CidrBlock]
  type Ipv6Flag = scala.Boolean
  type Ipv6RangeList = js.Array[Ipv6Range]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable_
    - typings.awsDashSdk.awsDashSdkStrings.disable_
    - java.lang.String
  */
  type Ipv6SupportValue = _Ipv6SupportValue | java.lang.String
  type KeyNameStringList = js.Array[String]
  type KeyPairIdStringList = js.Array[String]
  type KeyPairList = js.Array[KeyPairInfo]
  type KeyPairName = java.lang.String
  type KmsKeyId = java.lang.String
  type LaunchPermissionList = js.Array[LaunchPermission]
  type LaunchSpecsList = js.Array[SpotFleetLaunchSpecification]
  type LaunchTemplateBlockDeviceMappingList = js.Array[LaunchTemplateBlockDeviceMapping]
  type LaunchTemplateBlockDeviceMappingRequestList = js.Array[LaunchTemplateBlockDeviceMappingRequest]
  type LaunchTemplateConfigList = js.Array[LaunchTemplateConfig]
  type LaunchTemplateElasticInferenceAcceleratorCount = scala.Double
  type LaunchTemplateElasticInferenceAcceleratorList = js.Array[LaunchTemplateElasticInferenceAccelerator]
  type LaunchTemplateElasticInferenceAcceleratorResponseList = js.Array[LaunchTemplateElasticInferenceAcceleratorResponse]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.launchTemplateIdDoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.launchTemplateIdMalformed
    - typings.awsDashSdk.awsDashSdkStrings.launchTemplateNameDoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.launchTemplateNameMalformed
    - typings.awsDashSdk.awsDashSdkStrings.launchTemplateVersionDoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.unexpectedError
    - java.lang.String
  */
  type LaunchTemplateErrorCode = _LaunchTemplateErrorCode | java.lang.String
  type LaunchTemplateId = java.lang.String
  type LaunchTemplateInstanceNetworkInterfaceSpecificationList = js.Array[LaunchTemplateInstanceNetworkInterfaceSpecification]
  type LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList = js.Array[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]
  type LaunchTemplateLicenseList = js.Array[LaunchTemplateLicenseConfiguration]
  type LaunchTemplateLicenseSpecificationListRequest = js.Array[LaunchTemplateLicenseConfigurationRequest]
  type LaunchTemplateName = java.lang.String
  type LaunchTemplateNameStringList = js.Array[LaunchTemplateName]
  type LaunchTemplateOverridesList = js.Array[LaunchTemplateOverrides]
  type LaunchTemplateSet = js.Array[LaunchTemplate]
  type LaunchTemplateTagSpecificationList = js.Array[LaunchTemplateTagSpecification]
  type LaunchTemplateTagSpecificationRequestList = js.Array[LaunchTemplateTagSpecificationRequest]
  type LaunchTemplateVersionSet = js.Array[LaunchTemplateVersion]
  type LicenseList = js.Array[LicenseConfiguration]
  type LicenseSpecificationListRequest = js.Array[LicenseConfigurationRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.sold
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - java.lang.String
  */
  type ListingState = _ListingState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.closed_
    - java.lang.String
  */
  type ListingStatus = _ListingStatus | java.lang.String
  type LoadPermissionList = js.Array[LoadPermission]
  type LoadPermissionListRequest = js.Array[LoadPermissionRequest]
  type LocalGatewayIdSet = js.Array[String]
  type LocalGatewayMaxResults = scala.Double
  type LocalGatewayRouteList = js.Array[LocalGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.blackhole
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type LocalGatewayRouteState = _LocalGatewayRouteState | java.lang.String
  type LocalGatewayRouteTableIdSet = js.Array[String]
  type LocalGatewayRouteTableSet = js.Array[LocalGatewayRouteTable]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationIdSet = js.Array[String]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet = js.Array[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]
  type LocalGatewayRouteTableVpcAssociationIdSet = js.Array[String]
  type LocalGatewayRouteTableVpcAssociationSet = js.Array[LocalGatewayRouteTableVpcAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.static__
    - typings.awsDashSdk.awsDashSdkStrings.propagated
    - java.lang.String
  */
  type LocalGatewayRouteType = _LocalGatewayRouteType | java.lang.String
  type LocalGatewaySet = js.Array[LocalGateway]
  type LocalGatewayVirtualInterfaceGroupIdSet = js.Array[String]
  type LocalGatewayVirtualInterfaceGroupSet = js.Array[LocalGatewayVirtualInterfaceGroup]
  type LocalGatewayVirtualInterfaceIdSet = js.Array[String]
  type LocalGatewayVirtualInterfaceSet = js.Array[LocalGatewayVirtualInterface]
  type Location = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.region__
    - typings.awsDashSdk.awsDashSdkStrings.`availability-zone`
    - typings.awsDashSdk.awsDashSdkStrings.`availability-zone-id`
    - java.lang.String
  */
  type LocationType = _LocationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`cloud-watch-logs`
    - typings.awsDashSdk.awsDashSdkStrings.s3_
    - java.lang.String
  */
  type LogDestinationType = _LogDestinationType | java.lang.String
  type Long = scala.Double
  type MarketType = spot_ | java.lang.String
  type MaxIpv4AddrPerInterface = scala.Double
  type MaxIpv6AddrPerInterface = scala.Double
  type MaxNetworkInterfaces = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.static__
    - typings.awsDashSdk.awsDashSdkStrings.igmp
    - java.lang.String
  */
  type MembershipType = _MembershipType | java.lang.String
  type MemorySize = scala.Double
  type MillisecondDateTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.disabled__
    - typings.awsDashSdk.awsDashSdkStrings.disabling_
    - typings.awsDashSdk.awsDashSdkStrings.enabled__
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - java.lang.String
  */
  type MonitoringState = _MonitoringState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.movingToVpc
    - typings.awsDashSdk.awsDashSdkStrings.restoringToClassic
    - java.lang.String
  */
  type MoveStatus = _MoveStatus | java.lang.String
  type MovingAddressStatusSet = js.Array[MovingAddressStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable_
    - typings.awsDashSdk.awsDashSdkStrings.disable_
    - java.lang.String
  */
  type MulticastSupportValue = _MulticastSupportValue | java.lang.String
  type NatGatewayAddressList = js.Array[NatGatewayAddress]
  type NatGatewayId = java.lang.String
  type NatGatewayList = js.Array[NatGateway]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type NatGatewayState = _NatGatewayState | java.lang.String
  type NetworkAclAssociationId = java.lang.String
  type NetworkAclAssociationList = js.Array[NetworkAclAssociation]
  type NetworkAclEntryList = js.Array[NetworkAclEntry]
  type NetworkAclId = java.lang.String
  type NetworkAclList = js.Array[NetworkAcl]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.description
    - typings.awsDashSdk.awsDashSdkStrings.groupSet
    - typings.awsDashSdk.awsDashSdkStrings.sourceDestCheck
    - typings.awsDashSdk.awsDashSdkStrings.attachment
    - java.lang.String
  */
  type NetworkInterfaceAttribute = _NetworkInterfaceAttribute | java.lang.String
  type NetworkInterfaceCreationType = efa | java.lang.String
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaceIdList = js.Array[String]
  type NetworkInterfaceIpv6AddressesList = js.Array[NetworkInterfaceIpv6Address]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NetworkInterfacePermissionIdList = js.Array[String]
  type NetworkInterfacePermissionList = js.Array[NetworkInterfacePermission]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.granted_
    - typings.awsDashSdk.awsDashSdkStrings.revoking
    - typings.awsDashSdk.awsDashSdkStrings.revoked__
    - java.lang.String
  */
  type NetworkInterfacePermissionStateCode = _NetworkInterfacePermissionStateCode | java.lang.String
  type NetworkInterfacePrivateIpAddressList = js.Array[NetworkInterfacePrivateIpAddress]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.attaching_
    - typings.awsDashSdk.awsDashSdkStrings.`in-use`
    - typings.awsDashSdk.awsDashSdkStrings.detaching__
    - java.lang.String
  */
  type NetworkInterfaceStatus = _NetworkInterfaceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.interface_
    - typings.awsDashSdk.awsDashSdkStrings.natGateway
    - typings.awsDashSdk.awsDashSdkStrings.efa
    - java.lang.String
  */
  type NetworkInterfaceType = _NetworkInterfaceType | java.lang.String
  type NetworkPerformance = java.lang.String
  type NewDhcpConfigurationList = js.Array[NewDhcpConfiguration]
  type NextToken = java.lang.String
  type OccurrenceDayRequestSet = js.Array[Integer]
  type OccurrenceDaySet = js.Array[Integer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.standard__
    - typings.awsDashSdk.awsDashSdkStrings.convertible_
    - java.lang.String
  */
  type OfferingClassType = _OfferingClassType | java.lang.String
  type OfferingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`Heavy Utilization`
    - typings.awsDashSdk.awsDashSdkStrings.`Medium Utilization`
    - typings.awsDashSdk.awsDashSdkStrings.`Light Utilization`
    - typings.awsDashSdk.awsDashSdkStrings.`No Upfront`
    - typings.awsDashSdk.awsDashSdkStrings.`Partial Upfront`
    - typings.awsDashSdk.awsDashSdkStrings.`All Upfront`
    - java.lang.String
  */
  type OfferingTypeValues = _OfferingTypeValues | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.lowestPrice
    - typings.awsDashSdk.awsDashSdkStrings.prioritized
    - java.lang.String
  */
  type OnDemandAllocationStrategy = _OnDemandAllocationStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.add__
    - typings.awsDashSdk.awsDashSdkStrings.remove__
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type OwnerStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AllUpfront
    - typings.awsDashSdk.awsDashSdkStrings.PartialUpfront
    - typings.awsDashSdk.awsDashSdkStrings.NoUpfront
    - java.lang.String
  */
  type PaymentOption = _PaymentOption | java.lang.String
  type PermissionGroup = all__ | java.lang.String
  type Phase1DHGroupNumbersList = js.Array[Phase1DHGroupNumbersListValue]
  type Phase1DHGroupNumbersRequestList = js.Array[Phase1DHGroupNumbersRequestListValue]
  type Phase1EncryptionAlgorithmsList = js.Array[Phase1EncryptionAlgorithmsListValue]
  type Phase1EncryptionAlgorithmsRequestList = js.Array[Phase1EncryptionAlgorithmsRequestListValue]
  type Phase1IntegrityAlgorithmsList = js.Array[Phase1IntegrityAlgorithmsListValue]
  type Phase1IntegrityAlgorithmsRequestList = js.Array[Phase1IntegrityAlgorithmsRequestListValue]
  type Phase2DHGroupNumbersList = js.Array[Phase2DHGroupNumbersListValue]
  type Phase2DHGroupNumbersRequestList = js.Array[Phase2DHGroupNumbersRequestListValue]
  type Phase2EncryptionAlgorithmsList = js.Array[Phase2EncryptionAlgorithmsListValue]
  type Phase2EncryptionAlgorithmsRequestList = js.Array[Phase2EncryptionAlgorithmsRequestListValue]
  type Phase2IntegrityAlgorithmsList = js.Array[Phase2IntegrityAlgorithmsListValue]
  type Phase2IntegrityAlgorithmsRequestList = js.Array[Phase2IntegrityAlgorithmsRequestListValue]
  type PlacementGroupIdStringList = js.Array[String]
  type PlacementGroupList = js.Array[PlacementGroup]
  type PlacementGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type PlacementGroupState = _PlacementGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.cluster_
    - typings.awsDashSdk.awsDashSdkStrings.partition
    - typings.awsDashSdk.awsDashSdkStrings.spread
    - java.lang.String
  */
  type PlacementGroupStrategy = _PlacementGroupStrategy | java.lang.String
  type PlacementGroupStrategyList = js.Array[PlacementGroupStrategy]
  type PlacementGroupStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.cluster_
    - typings.awsDashSdk.awsDashSdkStrings.spread
    - typings.awsDashSdk.awsDashSdkStrings.partition
    - java.lang.String
  */
  type PlacementStrategy = _PlacementStrategy | java.lang.String
  type PlatformValues = Windows_ | java.lang.String
  type PoolMaxResults = scala.Double
  type PrefixListIdList = js.Array[PrefixListId]
  type PrefixListIdSet = js.Array[String]
  type PrefixListSet = js.Array[PrefixList]
  type PriceScheduleList = js.Array[PriceSchedule]
  type PriceScheduleSpecificationList = js.Array[PriceScheduleSpecification]
  type PricingDetailsList = js.Array[PricingDetail]
  type PrincipalIdFormatList = js.Array[PrincipalIdFormat]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.All_
    - typings.awsDashSdk.awsDashSdkStrings.Service_
    - typings.awsDashSdk.awsDashSdkStrings.OrganizationUnit
    - typings.awsDashSdk.awsDashSdkStrings.Account_
    - typings.awsDashSdk.awsDashSdkStrings.User_
    - typings.awsDashSdk.awsDashSdkStrings.Role_
    - java.lang.String
  */
  type PrincipalType = _PrincipalType | java.lang.String
  type PrivateIpAddressConfigSet = js.Array[ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList = js.Array[PrivateIpAddressSpecification]
  type PrivateIpAddressStringList = js.Array[String]
  type ProcessorSustainedClockSpeed = scala.Double
  type ProductCodeList = js.Array[ProductCode]
  type ProductCodeStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.devpay
    - typings.awsDashSdk.awsDashSdkStrings.marketplace_
    - java.lang.String
  */
  type ProductCodeValues = _ProductCodeValues | java.lang.String
  type ProductDescriptionList = js.Array[String]
  type PropagatingVgwList = js.Array[PropagatingVgw]
  type PublicIpStringList = js.Array[String]
  type PublicIpv4PoolRangeSet = js.Array[PublicIpv4PoolRange]
  type PublicIpv4PoolSet = js.Array[PublicIpv4Pool]
  type PurchaseRequestSet = js.Array[PurchaseRequest]
  type PurchaseSet = js.Array[Purchase]
  type PurchasedScheduledInstanceSet = js.Array[ScheduledInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LinuxSlashUNIX
    - typings.awsDashSdk.awsDashSdkStrings.`LinuxSlashUNIX LeftparenthesisAmazon VPCRightparenthesis`
    - typings.awsDashSdk.awsDashSdkStrings.Windows_
    - typings.awsDashSdk.awsDashSdkStrings.`Windows LeftparenthesisAmazon VPCRightparenthesis`
    - java.lang.String
  */
  type RIProductDescription = _RIProductDescription | java.lang.String
  type ReasonCodesList = js.Array[ReportInstanceReasonCodes]
  type RecurringChargeFrequency = Hourly_ | java.lang.String
  type RecurringChargesList = js.Array[RecurringCharge]
  type RegionList = js.Array[Region]
  type RegionNameStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`instance-stuck-in-state`
    - typings.awsDashSdk.awsDashSdkStrings.unresponsive
    - typings.awsDashSdk.awsDashSdkStrings.`not-accepting-credentials`
    - typings.awsDashSdk.awsDashSdkStrings.`password-not-available`
    - typings.awsDashSdk.awsDashSdkStrings.`performance-network`
    - typings.awsDashSdk.awsDashSdkStrings.`performance-instance-store`
    - typings.awsDashSdk.awsDashSdkStrings.`performance-ebs-volume`
    - typings.awsDashSdk.awsDashSdkStrings.`performance-other`
    - typings.awsDashSdk.awsDashSdkStrings.other_
    - java.lang.String
  */
  type ReportInstanceReasonCodes = _ReportInstanceReasonCodes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ok__
    - typings.awsDashSdk.awsDashSdkStrings.impaired__
    - java.lang.String
  */
  type ReportStatusType = _ReportStatusType | java.lang.String
  type RequestHostIdList = js.Array[String]
  type RequestHostIdSet = js.Array[DedicatedHostId]
  type RequestInstanceTypeList = js.Array[InstanceType]
  type ReservationList = js.Array[Reservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`payment-pending`
    - typings.awsDashSdk.awsDashSdkStrings.`payment-failed`
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.retired
    - java.lang.String
  */
  type ReservationState = _ReservationState | java.lang.String
  type ReservedInstanceIdSet = js.Array[String]
  type ReservedInstanceReservationValueSet = js.Array[ReservedInstanceReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`payment-pending`
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.`payment-failed`
    - typings.awsDashSdk.awsDashSdkStrings.retired
    - typings.awsDashSdk.awsDashSdkStrings.queued__
    - typings.awsDashSdk.awsDashSdkStrings.`queued-deleted`
    - java.lang.String
  */
  type ReservedInstanceState = _ReservedInstanceState | java.lang.String
  type ReservedInstancesConfigurationList = js.Array[ReservedInstancesConfiguration]
  type ReservedInstancesIdStringList = js.Array[String]
  type ReservedInstancesList = js.Array[ReservedInstances]
  type ReservedInstancesListingId = java.lang.String
  type ReservedInstancesListingList = js.Array[ReservedInstancesListing]
  type ReservedInstancesModificationIdStringList = js.Array[String]
  type ReservedInstancesModificationList = js.Array[ReservedInstancesModification]
  type ReservedInstancesModificationResultList = js.Array[ReservedInstancesModificationResult]
  type ReservedInstancesOfferingIdStringList = js.Array[String]
  type ReservedInstancesOfferingList = js.Array[ReservedInstancesOffering]
  type ReservedIntancesIds = js.Array[ReservedInstancesId]
  type ResetFpgaImageAttributeName = loadPermission | java.lang.String
  type ResetImageAttributeName = launchPermission | java.lang.String
  type ResourceIdList = js.Array[String]
  type ResourceList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`client-vpn-endpoint`
    - typings.awsDashSdk.awsDashSdkStrings.`customer-gateway`
    - typings.awsDashSdk.awsDashSdkStrings.`dedicated-host`
    - typings.awsDashSdk.awsDashSdkStrings.`dhcp-options`
    - typings.awsDashSdk.awsDashSdkStrings.`elastic-ip`
    - typings.awsDashSdk.awsDashSdkStrings.fleet
    - typings.awsDashSdk.awsDashSdkStrings.`fpga-image`
    - typings.awsDashSdk.awsDashSdkStrings.`host-reservation`
    - typings.awsDashSdk.awsDashSdkStrings.image
    - typings.awsDashSdk.awsDashSdkStrings.instance__
    - typings.awsDashSdk.awsDashSdkStrings.`internet-gateway`
    - typings.awsDashSdk.awsDashSdkStrings.`key-pair`
    - typings.awsDashSdk.awsDashSdkStrings.`launch-template`
    - typings.awsDashSdk.awsDashSdkStrings.natgateway_
    - typings.awsDashSdk.awsDashSdkStrings.`network-acl`
    - typings.awsDashSdk.awsDashSdkStrings.`network-interface`
    - typings.awsDashSdk.awsDashSdkStrings.`placement-group`
    - typings.awsDashSdk.awsDashSdkStrings.`reserved-instances`
    - typings.awsDashSdk.awsDashSdkStrings.`route-table`
    - typings.awsDashSdk.awsDashSdkStrings.`security-group`
    - typings.awsDashSdk.awsDashSdkStrings.snapshot_
    - typings.awsDashSdk.awsDashSdkStrings.`spot-fleet-request`
    - typings.awsDashSdk.awsDashSdkStrings.`spot-instances-request`
    - typings.awsDashSdk.awsDashSdkStrings.subnet_
    - typings.awsDashSdk.awsDashSdkStrings.`traffic-mirror-filter`
    - typings.awsDashSdk.awsDashSdkStrings.`traffic-mirror-session`
    - typings.awsDashSdk.awsDashSdkStrings.`traffic-mirror-target`
    - typings.awsDashSdk.awsDashSdkStrings.`transit-gateway`
    - typings.awsDashSdk.awsDashSdkStrings.`transit-gateway-attachment`
    - typings.awsDashSdk.awsDashSdkStrings.`transit-gateway-multicast-domain`
    - typings.awsDashSdk.awsDashSdkStrings.`transit-gateway-route-table`
    - typings.awsDashSdk.awsDashSdkStrings.volume_
    - typings.awsDashSdk.awsDashSdkStrings.vpc_
    - typings.awsDashSdk.awsDashSdkStrings.`vpc-peering-connection`
    - typings.awsDashSdk.awsDashSdkStrings.`vpn-connection`
    - typings.awsDashSdk.awsDashSdkStrings.`vpn-gateway`
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResponseHostIdList = js.Array[String]
  type ResponseHostIdSet = js.Array[String]
  type RestorableByStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ebs_
    - typings.awsDashSdk.awsDashSdkStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = _RootDeviceType | java.lang.String
  type RootDeviceTypeList = js.Array[RootDeviceType]
  type RouteList = js.Array[Route]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreateRouteTable
    - typings.awsDashSdk.awsDashSdkStrings.CreateRoute
    - typings.awsDashSdk.awsDashSdkStrings.EnableVgwRoutePropagation
    - java.lang.String
  */
  type RouteOrigin = _RouteOrigin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.blackhole
    - java.lang.String
  */
  type RouteState = _RouteState | java.lang.String
  type RouteTableAssociationId = java.lang.String
  type RouteTableAssociationList = js.Array[RouteTableAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.disassociating__
    - typings.awsDashSdk.awsDashSdkStrings.disassociated_
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - java.lang.String
  */
  type RouteTableAssociationStateCode = _RouteTableAssociationStateCode | java.lang.String
  type RouteTableGatewayId = java.lang.String
  type RouteTableId = java.lang.String
  type RouteTableList = js.Array[RouteTable]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.allow__
    - typings.awsDashSdk.awsDashSdkStrings.deny__
    - java.lang.String
  */
  type RuleAction = _RuleAction | java.lang.String
  type ScheduledInstanceAvailabilitySet = js.Array[ScheduledInstanceAvailability]
  type ScheduledInstanceId = java.lang.String
  type ScheduledInstanceIdRequestSet = js.Array[String]
  type ScheduledInstanceSet = js.Array[ScheduledInstance]
  type ScheduledInstancesBlockDeviceMappingSet = js.Array[ScheduledInstancesBlockDeviceMapping]
  type ScheduledInstancesIpv6AddressList = js.Array[ScheduledInstancesIpv6Address]
  type ScheduledInstancesNetworkInterfaceSet = js.Array[ScheduledInstancesNetworkInterface]
  type ScheduledInstancesSecurityGroupIdSet = js.Array[String]
  type SecurityGroupIdStringList = js.Array[String]
  type SecurityGroupList = js.Array[SecurityGroup]
  type SecurityGroupReferences = js.Array[SecurityGroupReference]
  type SecurityGroupStringList = js.Array[String]
  type SensitiveUserData = java.lang.String
  type ServiceConfigurationSet = js.Array[ServiceConfiguration]
  type ServiceDetailSet = js.Array[ServiceDetail]
  type ServiceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Available_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type ServiceState = _ServiceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Interface
    - typings.awsDashSdk.awsDashSdkStrings.Gateway
    - java.lang.String
  */
  type ServiceType = _ServiceType | java.lang.String
  type ServiceTypeDetailSet = js.Array[ServiceTypeDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.stop
    - typings.awsDashSdk.awsDashSdkStrings.terminate_
    - java.lang.String
  */
  type ShutdownBehavior = _ShutdownBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.productCodes
    - typings.awsDashSdk.awsDashSdkStrings.createVolumePermission
    - java.lang.String
  */
  type SnapshotAttributeName = _SnapshotAttributeName | java.lang.String
  type SnapshotDetailList = js.Array[SnapshotDetail]
  type SnapshotId = java.lang.String
  type SnapshotIdStringList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotSet = js.Array[SnapshotInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.completed__
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - java.lang.String
  */
  type SnapshotState = _SnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`lowest-price`
    - typings.awsDashSdk.awsDashSdkStrings.diversified
    - typings.awsDashSdk.awsDashSdkStrings.`capacity-optimized`
    - java.lang.String
  */
  type SpotAllocationStrategy = _SpotAllocationStrategy | java.lang.String
  type SpotFleetRequestConfigSet = js.Array[SpotFleetRequestConfig]
  type SpotFleetRequestId = java.lang.String
  type SpotFleetTagSpecificationList = js.Array[SpotFleetTagSpecification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.hibernate
    - typings.awsDashSdk.awsDashSdkStrings.stop
    - typings.awsDashSdk.awsDashSdkStrings.terminate_
    - java.lang.String
  */
  type SpotInstanceInterruptionBehavior = _SpotInstanceInterruptionBehavior | java.lang.String
  type SpotInstanceRequestIdList = js.Array[String]
  type SpotInstanceRequestList = js.Array[SpotInstanceRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.open__
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.closed_
    - typings.awsDashSdk.awsDashSdkStrings.cancelled__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - java.lang.String
  */
  type SpotInstanceState = _SpotInstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`one-time`
    - typings.awsDashSdk.awsDashSdkStrings.persistent
    - java.lang.String
  */
  type SpotInstanceType = _SpotInstanceType | java.lang.String
  type SpotPriceHistoryList = js.Array[SpotPrice]
  type StaleIpPermissionSet = js.Array[StaleIpPermission]
  type StaleSecurityGroupSet = js.Array[StaleSecurityGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PendingAcceptance
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Available_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - typings.awsDashSdk.awsDashSdkStrings.Rejected_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Expired_
    - java.lang.String
  */
  type State = _State | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MoveInProgress
    - typings.awsDashSdk.awsDashSdkStrings.InVpc
    - typings.awsDashSdk.awsDashSdkStrings.InClassic
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type StatusName = reachability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.passed_
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.`insufficient-data`
    - typings.awsDashSdk.awsDashSdkStrings.initializing__
    - java.lang.String
  */
  type StatusType = _StatusType | java.lang.String
  type String = java.lang.String
  type SubnetAssociationList = js.Array[SubnetAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.disassociating__
    - typings.awsDashSdk.awsDashSdkStrings.disassociated_
    - typings.awsDashSdk.awsDashSdkStrings.failing__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - java.lang.String
  */
  type SubnetCidrBlockStateCode = _SubnetCidrBlockStateCode | java.lang.String
  type SubnetId = java.lang.String
  type SubnetIdStringList = js.Array[String]
  type SubnetIpv6CidrBlockAssociationSet = js.Array[SubnetIpv6CidrBlockAssociation]
  type SubnetList = js.Array[Subnet]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - java.lang.String
  */
  type SubnetState = _SubnetState | java.lang.String
  type SuccessfulInstanceCreditSpecificationSet = js.Array[SuccessfulInstanceCreditSpecificationItem]
  type SuccessfulQueuedPurchaseDeletionSet = js.Array[SuccessfulQueuedPurchaseDeletion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ok__
    - typings.awsDashSdk.awsDashSdkStrings.impaired__
    - typings.awsDashSdk.awsDashSdkStrings.`insufficient-data`
    - typings.awsDashSdk.awsDashSdkStrings.`not-applicable`
    - typings.awsDashSdk.awsDashSdkStrings.initializing__
    - java.lang.String
  */
  type SummaryStatus = _SummaryStatus | java.lang.String
  type TagDescriptionList = js.Array[TagDescription]
  type TagList = js.Array[Tag]
  type TagSpecificationList = js.Array[TagSpecification]
  type TargetConfigurationRequestSet = js.Array[TargetConfigurationRequest]
  type TargetGroups = js.Array[TargetGroup]
  type TargetNetworkSet = js.Array[TargetNetwork]
  type TargetReservationValueSet = js.Array[TargetReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UP
    - typings.awsDashSdk.awsDashSdkStrings.DOWN
    - java.lang.String
  */
  type TelemetryStatus = _TelemetryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.default_
    - typings.awsDashSdk.awsDashSdkStrings.dedicated_
    - typings.awsDashSdk.awsDashSdkStrings.host_
    - java.lang.String
  */
  type Tenancy = _Tenancy | java.lang.String
  type TerminateConnectionStatusSet = js.Array[TerminateConnectionStatus]
  type ThreadsPerCore = scala.Double
  type ThreadsPerCoreList = js.Array[ThreadsPerCore]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ingress
    - typings.awsDashSdk.awsDashSdkStrings.egress
    - java.lang.String
  */
  type TrafficDirection = _TrafficDirection | java.lang.String
  type TrafficMirrorFilterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`destination-port-range`
    - typings.awsDashSdk.awsDashSdkStrings.`source-port-range`
    - typings.awsDashSdk.awsDashSdkStrings.protocol
    - typings.awsDashSdk.awsDashSdkStrings.description
    - java.lang.String
  */
  type TrafficMirrorFilterRuleField = _TrafficMirrorFilterRuleField | java.lang.String
  type TrafficMirrorFilterRuleFieldList = js.Array[TrafficMirrorFilterRuleField]
  type TrafficMirrorFilterRuleId = java.lang.String
  type TrafficMirrorFilterRuleList = js.Array[TrafficMirrorFilterRule]
  type TrafficMirrorFilterSet = js.Array[TrafficMirrorFilter]
  type TrafficMirrorNetworkService = `amazon-dns` | java.lang.String
  type TrafficMirrorNetworkServiceList = js.Array[TrafficMirrorNetworkService]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.accept__
    - typings.awsDashSdk.awsDashSdkStrings.reject__
    - java.lang.String
  */
  type TrafficMirrorRuleAction = _TrafficMirrorRuleAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`packet-length`
    - typings.awsDashSdk.awsDashSdkStrings.description
    - typings.awsDashSdk.awsDashSdkStrings.`virtual-network-id`
    - java.lang.String
  */
  type TrafficMirrorSessionField = _TrafficMirrorSessionField | java.lang.String
  type TrafficMirrorSessionFieldList = js.Array[TrafficMirrorSessionField]
  type TrafficMirrorSessionId = java.lang.String
  type TrafficMirrorSessionSet = js.Array[TrafficMirrorSession]
  type TrafficMirrorTargetId = java.lang.String
  type TrafficMirrorTargetSet = js.Array[TrafficMirrorTarget]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`network-interface`
    - typings.awsDashSdk.awsDashSdkStrings.`network-load-balancer`
    - java.lang.String
  */
  type TrafficMirrorTargetType = _TrafficMirrorTargetType | java.lang.String
  type TrafficMirroringMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPT
    - typings.awsDashSdk.awsDashSdkStrings.REJECT
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type TrafficType = _TrafficType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.disassociating__
    - typings.awsDashSdk.awsDashSdkStrings.disassociated_
    - java.lang.String
  */
  type TransitGatewayAssociationState = _TransitGatewayAssociationState | java.lang.String
  type TransitGatewayAttachmentIdStringList = js.Array[String]
  type TransitGatewayAttachmentList = js.Array[TransitGatewayAttachment]
  type TransitGatewayAttachmentPropagationList = js.Array[TransitGatewayAttachmentPropagation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.vpc_
    - typings.awsDashSdk.awsDashSdkStrings.vpn
    - typings.awsDashSdk.awsDashSdkStrings.`direct-connect-gateway`
    - typings.awsDashSdk.awsDashSdkStrings.`tgw-peering`
    - java.lang.String
  */
  type TransitGatewayAttachmentResourceType = _TransitGatewayAttachmentResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.initiating
    - typings.awsDashSdk.awsDashSdkStrings.pendingAcceptance_
    - typings.awsDashSdk.awsDashSdkStrings.rollingBack_
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.modifying_
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.rejected__
    - typings.awsDashSdk.awsDashSdkStrings.rejecting_
    - typings.awsDashSdk.awsDashSdkStrings.failing__
    - java.lang.String
  */
  type TransitGatewayAttachmentState = _TransitGatewayAttachmentState | java.lang.String
  type TransitGatewayId = java.lang.String
  type TransitGatewayIdStringList = js.Array[String]
  type TransitGatewayList = js.Array[TransitGateway]
  type TransitGatewayMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.disassociating__
    - typings.awsDashSdk.awsDashSdkStrings.disassociated_
    - java.lang.String
  */
  type TransitGatewayMulitcastDomainAssociationState = _TransitGatewayMulitcastDomainAssociationState | java.lang.String
  type TransitGatewayMulticastDomainAssociationList = js.Array[TransitGatewayMulticastDomainAssociation]
  type TransitGatewayMulticastDomainIdStringList = js.Array[String]
  type TransitGatewayMulticastDomainList = js.Array[TransitGatewayMulticastDomain]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayMulticastDomainState = _TransitGatewayMulticastDomainState | java.lang.String
  type TransitGatewayMulticastGroupList = js.Array[TransitGatewayMulticastGroup]
  type TransitGatewayPeeringAttachmentList = js.Array[TransitGatewayPeeringAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enabling__
    - typings.awsDashSdk.awsDashSdkStrings.enabled__
    - typings.awsDashSdk.awsDashSdkStrings.disabling_
    - typings.awsDashSdk.awsDashSdkStrings.disabled__
    - java.lang.String
  */
  type TransitGatewayPropagationState = _TransitGatewayPropagationState | java.lang.String
  type TransitGatewayRouteAttachmentList = js.Array[TransitGatewayRouteAttachment]
  type TransitGatewayRouteList = js.Array[TransitGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.blackhole
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayRouteState = _TransitGatewayRouteState | java.lang.String
  type TransitGatewayRouteTableAssociationList = js.Array[TransitGatewayRouteTableAssociation]
  type TransitGatewayRouteTableIdStringList = js.Array[String]
  type TransitGatewayRouteTableList = js.Array[TransitGatewayRouteTable]
  type TransitGatewayRouteTablePropagationList = js.Array[TransitGatewayRouteTablePropagation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayRouteTableState = _TransitGatewayRouteTableState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.static__
    - typings.awsDashSdk.awsDashSdkStrings.propagated
    - java.lang.String
  */
  type TransitGatewayRouteType = _TransitGatewayRouteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.modifying_
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayState = _TransitGatewayState | java.lang.String
  type TransitGatewayVpcAttachmentList = js.Array[TransitGatewayVpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.tcp_
    - typings.awsDashSdk.awsDashSdkStrings.udp_
    - java.lang.String
  */
  type TransportProtocol = _TransportProtocol | java.lang.String
  type TunnelOptionsList = js.Array[TunnelOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.t2
    - typings.awsDashSdk.awsDashSdkStrings.t3
    - typings.awsDashSdk.awsDashSdkStrings.t3a
    - java.lang.String
  */
  type UnlimitedSupportedInstanceFamily = _UnlimitedSupportedInstanceFamily | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InvalidInstanceIDDotMalformed
    - typings.awsDashSdk.awsDashSdkStrings.InvalidInstanceIDDotNotFound
    - typings.awsDashSdk.awsDashSdkStrings.IncorrectInstanceState
    - typings.awsDashSdk.awsDashSdkStrings.InstanceCreditSpecificationDotNotSupported
    - java.lang.String
  */
  type UnsuccessfulInstanceCreditSpecificationErrorCode = _UnsuccessfulInstanceCreditSpecificationErrorCode | java.lang.String
  type UnsuccessfulInstanceCreditSpecificationSet = js.Array[UnsuccessfulInstanceCreditSpecificationItem]
  type UnsuccessfulItemList = js.Array[UnsuccessfulItem]
  type UnsuccessfulItemSet = js.Array[UnsuccessfulItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.spot_
    - typings.awsDashSdk.awsDashSdkStrings.`on-demand`
    - java.lang.String
  */
  type UsageClassType = _UsageClassType | java.lang.String
  type UsageClassTypeList = js.Array[UsageClassType]
  type UserGroupStringList = js.Array[String]
  type UserIdGroupPairList = js.Array[UserIdGroupPair]
  type UserIdGroupPairSet = js.Array[UserIdGroupPair]
  type UserIdStringList = js.Array[String]
  type VCpuCount = scala.Double
  type ValueStringList = js.Array[String]
  type VersionDescription = java.lang.String
  type VersionStringList = js.Array[String]
  type VgwTelemetryList = js.Array[VgwTelemetry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.hvm
    - typings.awsDashSdk.awsDashSdkStrings.paravirtual
    - java.lang.String
  */
  type VirtualizationType = _VirtualizationType | java.lang.String
  type VolumeAttachmentList = js.Array[VolumeAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.attaching_
    - typings.awsDashSdk.awsDashSdkStrings.attached_
    - typings.awsDashSdk.awsDashSdkStrings.detaching__
    - typings.awsDashSdk.awsDashSdkStrings.detached__
    - typings.awsDashSdk.awsDashSdkStrings.busy_
    - java.lang.String
  */
  type VolumeAttachmentState = _VolumeAttachmentState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.autoEnableIO
    - typings.awsDashSdk.awsDashSdkStrings.productCodes
    - java.lang.String
  */
  type VolumeAttributeName = _VolumeAttributeName | java.lang.String
  type VolumeId = java.lang.String
  type VolumeIdStringList = js.Array[String]
  type VolumeList = js.Array[Volume]
  type VolumeModificationList = js.Array[VolumeModification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.modifying_
    - typings.awsDashSdk.awsDashSdkStrings.optimizing
    - typings.awsDashSdk.awsDashSdkStrings.completed__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - java.lang.String
  */
  type VolumeModificationState = _VolumeModificationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.creating__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.`in-use`
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - java.lang.String
  */
  type VolumeState = _VolumeState | java.lang.String
  type VolumeStatusActionsList = js.Array[VolumeStatusAction]
  type VolumeStatusDetailsList = js.Array[VolumeStatusDetails]
  type VolumeStatusEventsList = js.Array[VolumeStatusEvent]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ok__
    - typings.awsDashSdk.awsDashSdkStrings.impaired__
    - typings.awsDashSdk.awsDashSdkStrings.`insufficient-data`
    - java.lang.String
  */
  type VolumeStatusInfoStatus = _VolumeStatusInfoStatus | java.lang.String
  type VolumeStatusList = js.Array[VolumeStatusItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`io-enabled`
    - typings.awsDashSdk.awsDashSdkStrings.`io-performance`
    - java.lang.String
  */
  type VolumeStatusName = _VolumeStatusName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.standard__
    - typings.awsDashSdk.awsDashSdkStrings.io1
    - typings.awsDashSdk.awsDashSdkStrings.gp2
    - typings.awsDashSdk.awsDashSdkStrings.sc1
    - typings.awsDashSdk.awsDashSdkStrings.st1
    - java.lang.String
  */
  type VolumeType = _VolumeType | java.lang.String
  type VpcAttachmentList = js.Array[VpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enableDnsSupport
    - typings.awsDashSdk.awsDashSdkStrings.enableDnsHostnames
    - java.lang.String
  */
  type VpcAttributeName = _VpcAttributeName | java.lang.String
  type VpcCidrAssociationId = java.lang.String
  type VpcCidrBlockAssociationSet = js.Array[VpcCidrBlockAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating__
    - typings.awsDashSdk.awsDashSdkStrings.associated__
    - typings.awsDashSdk.awsDashSdkStrings.disassociating__
    - typings.awsDashSdk.awsDashSdkStrings.disassociated_
    - typings.awsDashSdk.awsDashSdkStrings.failing__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - java.lang.String
  */
  type VpcCidrBlockStateCode = _VpcCidrBlockStateCode | java.lang.String
  type VpcClassicLinkIdList = js.Array[String]
  type VpcClassicLinkList = js.Array[VpcClassicLink]
  type VpcEndpointConnectionSet = js.Array[VpcEndpointConnection]
  type VpcEndpointId = java.lang.String
  type VpcEndpointSet = js.Array[VpcEndpoint]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Interface
    - typings.awsDashSdk.awsDashSdkStrings.Gateway
    - java.lang.String
  */
  type VpcEndpointType = _VpcEndpointType | java.lang.String
  type VpcId = java.lang.String
  type VpcIdStringList = js.Array[String]
  type VpcIpv6CidrBlockAssociationSet = js.Array[VpcIpv6CidrBlockAssociation]
  type VpcList = js.Array[Vpc]
  type VpcPeeringConnectionId = java.lang.String
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`initiating-request`
    - typings.awsDashSdk.awsDashSdkStrings.`pending-acceptance`
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - typings.awsDashSdk.awsDashSdkStrings.rejected__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
    - typings.awsDashSdk.awsDashSdkStrings.expired__
    - typings.awsDashSdk.awsDashSdkStrings.provisioning_
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - java.lang.String
  */
  type VpcPeeringConnectionStateReasonCode = _VpcPeeringConnectionStateReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - java.lang.String
  */
  type VpcState = _VpcState | java.lang.String
  type VpcTenancy = default_ | java.lang.String
  type VpnConnectionId = java.lang.String
  type VpnConnectionIdStringList = js.Array[String]
  type VpnConnectionList = js.Array[VpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable_
    - typings.awsDashSdk.awsDashSdkStrings.disable_
    - java.lang.String
  */
  type VpnEcmpSupportValue = _VpnEcmpSupportValue | java.lang.String
  type VpnGatewayId = java.lang.String
  type VpnGatewayIdStringList = js.Array[String]
  type VpnGatewayList = js.Array[VpnGateway]
  type VpnProtocol = openvpn | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.available__
    - typings.awsDashSdk.awsDashSdkStrings.deleting__
    - typings.awsDashSdk.awsDashSdkStrings.deleted__
    - java.lang.String
  */
  type VpnState = _VpnState | java.lang.String
  type VpnStaticRouteList = js.Array[VpnStaticRoute]
  type VpnStaticRouteSource = Static_ | java.lang.String
  type VpnTunnelOptionsSpecificationsList = js.Array[VpnTunnelOptionsSpecification]
  type ZoneIdStringList = js.Array[String]
  type ZoneNameStringList = js.Array[String]
  type _Blob = Buffer | Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2013-06-15`
    - typings.awsDashSdk.awsDashSdkStrings.`2013-10-15`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-02-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-05-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-06-15`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-09-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2014-10-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2015-03-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2015-04-15`
    - typings.awsDashSdk.awsDashSdkStrings.`2015-10-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-04-01`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-09-15`
    - typings.awsDashSdk.awsDashSdkStrings.`2016-11-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`Availability Zone`
    - typings.awsDashSdk.awsDashSdkStrings.Region_
    - java.lang.String
  */
  type scope = _scope | java.lang.String
  type totalFpgaMemory = scala.Double
  type totalGpuMemory = scala.Double
}
