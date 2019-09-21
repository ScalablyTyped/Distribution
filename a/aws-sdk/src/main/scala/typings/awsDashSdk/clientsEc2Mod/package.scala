package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEc2Mod {
  import typings.awsDashSdk.awsDashSdkStrings.ATTACHED
  import typings.awsDashSdk.awsDashSdkStrings.Hourly
  import typings.awsDashSdk.awsDashSdkStrings.Static
  import typings.awsDashSdk.awsDashSdkStrings.Topic
  import typings.awsDashSdk.awsDashSdkStrings.USD
  import typings.awsDashSdk.awsDashSdkStrings.Windows
  import typings.awsDashSdk.awsDashSdkStrings.`amazon-dns`
  import typings.awsDashSdk.awsDashSdkStrings.all
  import typings.awsDashSdk.awsDashSdkStrings.default
  import typings.awsDashSdk.awsDashSdkStrings.efa
  import typings.awsDashSdk.awsDashSdkStrings.ipsecDOT1
  import typings.awsDashSdk.awsDashSdkStrings.launchPermission
  import typings.awsDashSdk.awsDashSdkStrings.loadPermission
  import typings.awsDashSdk.awsDashSdkStrings.openvpn
  import typings.awsDashSdk.awsDashSdkStrings.ova
  import typings.awsDashSdk.awsDashSdkStrings.reachability
  import typings.awsDashSdk.awsDashSdkStrings.spot
  import typings.awsDashSdk.awsDashSdkStrings.volume
  import typings.awsDashSdk.awsDashSdkStrings.vpc
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
    - typings.awsDashSdk.awsDashSdkStrings.error
    - typings.awsDashSdk.awsDashSdkStrings.pending_fulfillment
    - typings.awsDashSdk.awsDashSdkStrings.pending_termination
    - typings.awsDashSdk.awsDashSdkStrings.fulfilled
    - java.lang.String
  */
  type ActivityStatus = _ActivityStatus | java.lang.String
  type AddressList = js.Array[Address]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.default
    - typings.awsDashSdk.awsDashSdkStrings.host
    - java.lang.String
  */
  type Affinity = _Affinity | java.lang.String
  type AllocationIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.`under-assessment`
    - typings.awsDashSdk.awsDashSdkStrings.`permanent-failure`
    - typings.awsDashSdk.awsDashSdkStrings.released
    - typings.awsDashSdk.awsDashSdkStrings.`released-permanent-failure`
    - typings.awsDashSdk.awsDashSdkStrings.pending
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
    - typings.awsDashSdk.awsDashSdkStrings.i386
    - typings.awsDashSdk.awsDashSdkStrings.x86_64
    - typings.awsDashSdk.awsDashSdkStrings.arm64
    - java.lang.String
  */
  type ArchitectureValues = _ArchitectureValues | java.lang.String
  type AssignedPrivateIpAddressList = js.Array[AssignedPrivateIpAddress]
  type AssociatedNetworkType = vpc | java.lang.String
  type AssociatedTargetNetworkSet = js.Array[AssociatedTargetNetwork]
  type AssociationIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating
    - typings.awsDashSdk.awsDashSdkStrings.associated
    - typings.awsDashSdk.awsDashSdkStrings.`association-failed`
    - typings.awsDashSdk.awsDashSdkStrings.disassociating
    - typings.awsDashSdk.awsDashSdkStrings.disassociated
    - java.lang.String
  */
  type AssociationStatusCode = _AssociationStatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.attaching
    - typings.awsDashSdk.awsDashSdkStrings.attached
    - typings.awsDashSdk.awsDashSdkStrings.detaching
    - typings.awsDashSdk.awsDashSdkStrings.detached
    - java.lang.String
  */
  type AttachmentStatus = _AttachmentStatus | java.lang.String
  type AuthorizationRuleSet = js.Array[AuthorizationRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable
    - typings.awsDashSdk.awsDashSdkStrings.disable
    - java.lang.String
  */
  type AutoAcceptSharedAttachmentsValue = _AutoAcceptSharedAttachmentsValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.on
    - typings.awsDashSdk.awsDashSdkStrings.off
    - java.lang.String
  */
  type AutoPlacement = _AutoPlacement | java.lang.String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZoneMessageList = js.Array[AvailabilityZoneMessage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.information
    - typings.awsDashSdk.awsDashSdkStrings.impaired
    - typings.awsDashSdk.awsDashSdkStrings.unavailable
    - java.lang.String
  */
  type AvailabilityZoneState = _AvailabilityZoneState | java.lang.String
  type AvailableInstanceCapacityList = js.Array[InstanceCapacity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.submitted
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.cancelled
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.cancelled_running
    - typings.awsDashSdk.awsDashSdkStrings.cancelled_terminating
    - typings.awsDashSdk.awsDashSdkStrings.modifying
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
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.`waiting-for-shutdown`
    - typings.awsDashSdk.awsDashSdkStrings.bundling
    - typings.awsDashSdk.awsDashSdkStrings.storing
    - typings.awsDashSdk.awsDashSdkStrings.cancelling
    - typings.awsDashSdk.awsDashSdkStrings.complete
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - java.lang.String
  */
  type BundleTaskState = _BundleTaskState | java.lang.String
  type ByoipCidrSet = js.Array[ByoipCidr]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.advertised
    - typings.awsDashSdk.awsDashSdkStrings.deprovisioned
    - typings.awsDashSdk.awsDashSdkStrings.`failed-deprovision`
    - typings.awsDashSdk.awsDashSdkStrings.`failed-provision`
    - typings.awsDashSdk.awsDashSdkStrings.`pending-deprovision`
    - typings.awsDashSdk.awsDashSdkStrings.`pending-provision`
    - typings.awsDashSdk.awsDashSdkStrings.provisioned
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
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.open
    - typings.awsDashSdk.awsDashSdkStrings.closed
    - typings.awsDashSdk.awsDashSdkStrings.cancelled
    - typings.awsDashSdk.awsDashSdkStrings.completed
    - java.lang.String
  */
  type CancelSpotInstanceRequestState = _CancelSpotInstanceRequestState | java.lang.String
  type CancelledSpotInstanceRequestList = js.Array[CancelledSpotInstanceRequest]
  type CapacityReservationIdSet = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`Linux/UNIX`
    - typings.awsDashSdk.awsDashSdkStrings.`Red Hat Enterprise Linux`
    - typings.awsDashSdk.awsDashSdkStrings.`SUSE Linux`
    - typings.awsDashSdk.awsDashSdkStrings.Windows
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
    - typings.awsDashSdk.awsDashSdkStrings.open
    - typings.awsDashSdk.awsDashSdkStrings.none
    - java.lang.String
  */
  type CapacityReservationPreference = _CapacityReservationPreference | java.lang.String
  type CapacityReservationSet = js.Array[CapacityReservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.expired
    - typings.awsDashSdk.awsDashSdkStrings.cancelled
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - java.lang.String
  */
  type CapacityReservationState = _CapacityReservationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.default
    - typings.awsDashSdk.awsDashSdkStrings.dedicated
    - java.lang.String
  */
  type CapacityReservationTenancy = _CapacityReservationTenancy | java.lang.String
  type CidrBlockSet = js.Array[CidrBlock]
  type ClassicLinkDnsSupportList = js.Array[ClassicLinkDnsSupport]
  type ClassicLinkInstanceList = js.Array[ClassicLinkInstance]
  type ClassicLoadBalancers = js.Array[ClassicLoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.active
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
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.revoking
    - java.lang.String
  */
  type ClientVpnAuthorizationRuleStatusCode = _ClientVpnAuthorizationRuleStatusCode | java.lang.String
  type ClientVpnConnectionSet = js.Array[ClientVpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.`failed-to-terminate`
    - typings.awsDashSdk.awsDashSdkStrings.terminating
    - typings.awsDashSdk.awsDashSdkStrings.terminated
    - java.lang.String
  */
  type ClientVpnConnectionStatusCode = _ClientVpnConnectionStatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`pending-associate`
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type ClientVpnEndpointStatusCode = _ClientVpnEndpointStatusCode | java.lang.String
  type ClientVpnRouteSet = js.Array[ClientVpnRoute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.creating
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - java.lang.String
  */
  type ClientVpnRouteStatusCode = _ClientVpnRouteStatusCode | java.lang.String
  type ClientVpnSecurityGroupIdSet = js.Array[String]
  type ConnectionNotificationSet = js.Array[ConnectionNotification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled
    - typings.awsDashSdk.awsDashSdkStrings.Disabled
    - java.lang.String
  */
  type ConnectionNotificationState = _ConnectionNotificationState | java.lang.String
  type ConnectionNotificationType = Topic | java.lang.String
  type ContainerFormat = ova | java.lang.String
  type ConversionIdStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.cancelling
    - typings.awsDashSdk.awsDashSdkStrings.cancelled
    - typings.awsDashSdk.awsDashSdkStrings.completed
    - java.lang.String
  */
  type ConversionTaskState = _ConversionTaskState | java.lang.String
  type CopyTagsFromSource = volume | java.lang.String
  type CreateFleetErrorsSet = js.Array[CreateFleetError]
  type CreateFleetInstancesSet = js.Array[CreateFleetInstance]
  type CreateVolumePermissionList = js.Array[CreateVolumePermission]
  type CurrencyCodeValues = USD | java.lang.String
  type CustomerGatewayIdStringList = js.Array[String]
  type CustomerGatewayList = js.Array[CustomerGateway]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.Inactive
    - java.lang.String
  */
  type DatafeedSubscriptionState = _DatafeedSubscriptionState | java.lang.String
  type DateTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable
    - typings.awsDashSdk.awsDashSdkStrings.disable
    - java.lang.String
  */
  type DefaultRouteTableAssociationValue = _DefaultRouteTableAssociationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable
    - typings.awsDashSdk.awsDashSdkStrings.disable
    - java.lang.String
  */
  type DefaultRouteTablePropagationValue = _DefaultRouteTablePropagationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.spot
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
    - typings.awsDashSdk.awsDashSdkStrings.ebs
    - typings.awsDashSdk.awsDashSdkStrings.`instance-store`
    - java.lang.String
  */
  type DeviceType = _DeviceType | java.lang.String
  type DhcpConfigurationList = js.Array[DhcpConfiguration]
  type DhcpConfigurationValueList = js.Array[AttributeValue]
  type DhcpOptionsIdStringList = js.Array[String]
  type DhcpOptionsList = js.Array[DhcpOptions]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.VMDK
    - typings.awsDashSdk.awsDashSdkStrings.RAW
    - typings.awsDashSdk.awsDashSdkStrings.VHD
    - java.lang.String
  */
  type DiskImageFormat = _DiskImageFormat | java.lang.String
  type DiskImageList = js.Array[DiskImage]
  type DnsEntrySet = js.Array[DnsEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable
    - typings.awsDashSdk.awsDashSdkStrings.disable
    - java.lang.String
  */
  type DnsSupportValue = _DnsSupportValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.vpc
    - typings.awsDashSdk.awsDashSdkStrings.standard
    - java.lang.String
  */
  type DomainType = _DomainType | java.lang.String
  type Double = scala.Double
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
  type ElasticInferenceAccelerators = js.Array[ElasticInferenceAccelerator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.unlimited
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
    - typings.awsDashSdk.awsDashSdkStrings.error
    - typings.awsDashSdk.awsDashSdkStrings.information
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.noTermination
    - typings.awsDashSdk.awsDashSdkStrings.default
    - java.lang.String
  */
  type ExcessCapacityTerminationPolicy = _ExcessCapacityTerminationPolicy | java.lang.String
  type ExecutableByStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.citrix
    - typings.awsDashSdk.awsDashSdkStrings.vmware
    - typings.awsDashSdk.awsDashSdkStrings.microsoft
    - java.lang.String
  */
  type ExportEnvironment = _ExportEnvironment | java.lang.String
  type ExportImageTaskIdList = js.Array[String]
  type ExportImageTaskList = js.Array[ExportImageTask]
  type ExportTaskIdStringList = js.Array[String]
  type ExportTaskList = js.Array[ExportTask]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.cancelling
    - typings.awsDashSdk.awsDashSdkStrings.cancelled
    - typings.awsDashSdk.awsDashSdkStrings.completed
    - java.lang.String
  */
  type ExportTaskState = _ExportTaskState | java.lang.String
  type FilterList = js.Array[Filter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.error
    - typings.awsDashSdk.awsDashSdkStrings.pending_fulfillment
    - typings.awsDashSdk.awsDashSdkStrings.pending_termination
    - typings.awsDashSdk.awsDashSdkStrings.fulfilled
    - java.lang.String
  */
  type FleetActivityStatus = _FleetActivityStatus | java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.submitted
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.deleted_running
    - typings.awsDashSdk.awsDashSdkStrings.deleted_terminating
    - typings.awsDashSdk.awsDashSdkStrings.modifying
    - java.lang.String
  */
  type FleetStateCode = _FleetStateCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.request
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.description
    - typings.awsDashSdk.awsDashSdkStrings.name
    - typings.awsDashSdk.awsDashSdkStrings.loadPermission
    - typings.awsDashSdk.awsDashSdkStrings.productCodes
    - java.lang.String
  */
  type FpgaImageAttributeName = _FpgaImageAttributeName | java.lang.String
  type FpgaImageIdList = js.Array[String]
  type FpgaImageList = js.Array[FpgaImage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.unavailable
    - java.lang.String
  */
  type FpgaImageStateCode = _FpgaImageStateCode | java.lang.String
  type GatewayType = ipsecDOT1 | java.lang.String
  type GetCapacityReservationUsageRequestMaxResults = scala.Double
  type GroupIdStringList = js.Array[String]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupIdentifierSet = js.Array[SecurityGroupIdentifier]
  type GroupIds = js.Array[String]
  type GroupNameStringList = js.Array[String]
  type HistoryRecordSet = js.Array[HistoryRecordEntry]
  type HistoryRecords = js.Array[HistoryRecord]
  type HostInstanceList = js.Array[HostInstance]
  type HostList = js.Array[Host]
  type HostOfferingSet = js.Array[HostOffering]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.on
    - typings.awsDashSdk.awsDashSdkStrings.off
    - java.lang.String
  */
  type HostRecovery = _HostRecovery | java.lang.String
  type HostReservationIdSet = js.Array[String]
  type HostReservationSet = js.Array[HostReservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.dedicated
    - typings.awsDashSdk.awsDashSdkStrings.host
    - java.lang.String
  */
  type HostTenancy = _HostTenancy | java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.associating
    - typings.awsDashSdk.awsDashSdkStrings.associated
    - typings.awsDashSdk.awsDashSdkStrings.disassociating
    - typings.awsDashSdk.awsDashSdkStrings.disassociated
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
  type ImageIdStringList = js.Array[String]
  type ImageList = js.Array[Image]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.invalid
    - typings.awsDashSdk.awsDashSdkStrings.deregistered
    - typings.awsDashSdk.awsDashSdkStrings.transient
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.error
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
  type ImportImageTaskList = js.Array[ImportImageTask]
  type ImportInstanceVolumeDetailSet = js.Array[ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskList = js.Array[ImportSnapshotTask]
  type ImportTaskIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.instanceType
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
    - typings.awsDashSdk.awsDashSdkStrings.healthy
    - typings.awsDashSdk.awsDashSdkStrings.unhealthy
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
    - typings.awsDashSdk.awsDashSdkStrings.terminate
    - java.lang.String
  */
  type InstanceInterruptionBehavior = _InstanceInterruptionBehavior | java.lang.String
  type InstanceIpv6AddressList = js.Array[InstanceIpv6Address]
  type InstanceIpv6AddressListRequest = js.Array[InstanceIpv6AddressRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.spot
    - typings.awsDashSdk.awsDashSdkStrings.`on-demand`
    - java.lang.String
  */
  type InstanceLifecycle = _InstanceLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.spot
    - typings.awsDashSdk.awsDashSdkStrings.scheduled
    - java.lang.String
  */
  type InstanceLifecycleType = _InstanceLifecycleType | java.lang.String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.open
    - typings.awsDashSdk.awsDashSdkStrings.targeted
    - java.lang.String
  */
  type InstanceMatchCriteria = _InstanceMatchCriteria | java.lang.String
  type InstanceMonitoringList = js.Array[InstanceMonitoring]
  type InstanceNetworkInterfaceList = js.Array[InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList = js.Array[InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList = js.Array[InstancePrivateIpAddress]
  type InstanceStateChangeList = js.Array[InstanceStateChange]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.running
    - typings.awsDashSdk.awsDashSdkStrings.`shutting-down`
    - typings.awsDashSdk.awsDashSdkStrings.terminated
    - typings.awsDashSdk.awsDashSdkStrings.stopping
    - typings.awsDashSdk.awsDashSdkStrings.stopped
    - java.lang.String
  */
  type InstanceStateName = _InstanceStateName | java.lang.String
  type InstanceStatusDetailsList = js.Array[InstanceStatusDetails]
  type InstanceStatusEventList = js.Array[InstanceStatusEvent]
  type InstanceStatusList = js.Array[InstanceStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.t1DOTmicro
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTnano
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTmicro
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTsmall
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.t2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.t2DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3DOTnano
    - typings.awsDashSdk.awsDashSdkStrings.t3DOTmicro
    - typings.awsDashSdk.awsDashSdkStrings.t3DOTsmall
    - typings.awsDashSdk.awsDashSdkStrings.t3DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.t3DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3aDOTnano
    - typings.awsDashSdk.awsDashSdkStrings.t3aDOTmicro
    - typings.awsDashSdk.awsDashSdkStrings.t3aDOTsmall
    - typings.awsDashSdk.awsDashSdkStrings.t3aDOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.t3aDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3aDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.t3aDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m1DOTsmall
    - typings.awsDashSdk.awsDashSdkStrings.m1DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.m1DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.m1DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.m3DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4DOT10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m4DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m2DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m2DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.cr1DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r4DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5DOTmetal
    - typings.awsDashSdk.awsDashSdkStrings.r5aDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5aDOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5dDOTmetal
    - typings.awsDashSdk.awsDashSdkStrings.r5adDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.r5adDOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1DOT32xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.x1eDOT32xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.i2DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i2DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3DOTmetal
    - typings.awsDashSdk.awsDashSdkStrings.i3enDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDOT3xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDOT6xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.i3enDOTmetal
    - typings.awsDashSdk.awsDashSdkStrings.hi1DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.hs1DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c1DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.c1DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c4DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5DOTmetal
    - typings.awsDashSdk.awsDashSdkStrings.c5dDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDOT9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5dDOT18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDOT9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.c5nDOT18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.cc1DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.cc2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g2DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g3DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g3DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g3sDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.g4dnDOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.cg1DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.p2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p2DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p3DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.p3dnDOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.d2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.d2DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.d2DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.d2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.f1DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.f1DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.f1DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5DOTmetal
    - typings.awsDashSdk.awsDashSdkStrings.m5aDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5aDOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5dDOTmetal
    - typings.awsDashSdk.awsDashSdkStrings.m5adDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.m5adDOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.h1DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.h1DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.h1DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.h1DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDOT3xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDOT6xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.z1dDOTmetal
    - typings.awsDashSdk.awsDashSdkStrings.`u-6tb1DOTmetal`
    - typings.awsDashSdk.awsDashSdkStrings.`u-9tb1DOTmetal`
    - typings.awsDashSdk.awsDashSdkStrings.`u-12tb1DOTmetal`
    - typings.awsDashSdk.awsDashSdkStrings.a1DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.a1DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.a1DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.a1DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.a1DOT4xlarge
    - java.lang.String
  */
  type InstanceType = _InstanceType | java.lang.String
  type InstanceTypeList = js.Array[InstanceType]
  type InstanceUsageSet = js.Array[InstanceUsage]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`INSTANCE-ATTACH`
    - typings.awsDashSdk.awsDashSdkStrings.`EIP-ASSOCIATE`
    - java.lang.String
  */
  type InterfacePermissionType = _InterfacePermissionType | java.lang.String
  type InternetGatewayAttachmentList = js.Array[InternetGatewayAttachment]
  type InternetGatewayList = js.Array[InternetGateway]
  type IpPermissionList = js.Array[IpPermission]
  type IpRangeList = js.Array[IpRange]
  type IpRanges = js.Array[String]
  type Ipv6Address = java.lang.String
  type Ipv6AddressList = js.Array[String]
  type Ipv6CidrBlockSet = js.Array[Ipv6CidrBlock]
  type Ipv6RangeList = js.Array[Ipv6Range]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable
    - typings.awsDashSdk.awsDashSdkStrings.disable
    - java.lang.String
  */
  type Ipv6SupportValue = _Ipv6SupportValue | java.lang.String
  type KeyNameStringList = js.Array[String]
  type KeyPairList = js.Array[KeyPairInfo]
  type LaunchPermissionList = js.Array[LaunchPermission]
  type LaunchSpecsList = js.Array[SpotFleetLaunchSpecification]
  type LaunchTemplateBlockDeviceMappingList = js.Array[LaunchTemplateBlockDeviceMapping]
  type LaunchTemplateBlockDeviceMappingRequestList = js.Array[LaunchTemplateBlockDeviceMappingRequest]
  type LaunchTemplateConfigList = js.Array[LaunchTemplateConfig]
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
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.sold
    - typings.awsDashSdk.awsDashSdkStrings.cancelled
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - java.lang.String
  */
  type ListingState = _ListingState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.cancelled
    - typings.awsDashSdk.awsDashSdkStrings.closed
    - java.lang.String
  */
  type ListingStatus = _ListingStatus | java.lang.String
  type LoadPermissionList = js.Array[LoadPermission]
  type LoadPermissionListRequest = js.Array[LoadPermissionRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`cloud-watch-logs`
    - typings.awsDashSdk.awsDashSdkStrings.s3
    - java.lang.String
  */
  type LogDestinationType = _LogDestinationType | java.lang.String
  type Long = scala.Double
  type MarketType = spot | java.lang.String
  type MillisecondDateTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.disabled
    - typings.awsDashSdk.awsDashSdkStrings.disabling
    - typings.awsDashSdk.awsDashSdkStrings.enabled
    - typings.awsDashSdk.awsDashSdkStrings.pending
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
  type NatGatewayAddressList = js.Array[NatGatewayAddress]
  type NatGatewayList = js.Array[NatGateway]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type NatGatewayState = _NatGatewayState | java.lang.String
  type NetworkAclAssociationList = js.Array[NetworkAclAssociation]
  type NetworkAclEntryList = js.Array[NetworkAclEntry]
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
  type NetworkInterfaceIdList = js.Array[String]
  type NetworkInterfaceIpv6AddressesList = js.Array[NetworkInterfaceIpv6Address]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NetworkInterfacePermissionIdList = js.Array[String]
  type NetworkInterfacePermissionList = js.Array[NetworkInterfacePermission]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.granted
    - typings.awsDashSdk.awsDashSdkStrings.revoking
    - typings.awsDashSdk.awsDashSdkStrings.revoked
    - java.lang.String
  */
  type NetworkInterfacePermissionStateCode = _NetworkInterfacePermissionStateCode | java.lang.String
  type NetworkInterfacePrivateIpAddressList = js.Array[NetworkInterfacePrivateIpAddress]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.associated
    - typings.awsDashSdk.awsDashSdkStrings.attaching
    - typings.awsDashSdk.awsDashSdkStrings.`in-use`
    - typings.awsDashSdk.awsDashSdkStrings.detaching
    - java.lang.String
  */
  type NetworkInterfaceStatus = _NetworkInterfaceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.interface
    - typings.awsDashSdk.awsDashSdkStrings.natGateway
    - typings.awsDashSdk.awsDashSdkStrings.efa
    - java.lang.String
  */
  type NetworkInterfaceType = _NetworkInterfaceType | java.lang.String
  type NewDhcpConfigurationList = js.Array[NewDhcpConfiguration]
  type NextToken = java.lang.String
  type OccurrenceDayRequestSet = js.Array[Integer]
  type OccurrenceDaySet = js.Array[Integer]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.standard
    - typings.awsDashSdk.awsDashSdkStrings.convertible
    - java.lang.String
  */
  type OfferingClassType = _OfferingClassType | java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.add
    - typings.awsDashSdk.awsDashSdkStrings.remove
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
  type PermissionGroup = all | java.lang.String
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
  type PlacementGroupList = js.Array[PlacementGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type PlacementGroupState = _PlacementGroupState | java.lang.String
  type PlacementGroupStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.cluster
    - typings.awsDashSdk.awsDashSdkStrings.spread
    - typings.awsDashSdk.awsDashSdkStrings.partition
    - java.lang.String
  */
  type PlacementStrategy = _PlacementStrategy | java.lang.String
  type PlatformValues = Windows | java.lang.String
  type PoolMaxResults = scala.Double
  type PrefixListIdList = js.Array[PrefixListId]
  type PrefixListIdSet = js.Array[String]
  type PrefixListSet = js.Array[PrefixList]
  type PriceScheduleList = js.Array[PriceSchedule]
  type PriceScheduleSpecificationList = js.Array[PriceScheduleSpecification]
  type PricingDetailsList = js.Array[PricingDetail]
  type PrincipalIdFormatList = js.Array[PrincipalIdFormat]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.All
    - typings.awsDashSdk.awsDashSdkStrings.Service
    - typings.awsDashSdk.awsDashSdkStrings.OrganizationUnit
    - typings.awsDashSdk.awsDashSdkStrings.Account
    - typings.awsDashSdk.awsDashSdkStrings.User
    - typings.awsDashSdk.awsDashSdkStrings.Role
    - java.lang.String
  */
  type PrincipalType = _PrincipalType | java.lang.String
  type PrivateIpAddressConfigSet = js.Array[ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList = js.Array[PrivateIpAddressSpecification]
  type PrivateIpAddressStringList = js.Array[String]
  type ProductCodeList = js.Array[ProductCode]
  type ProductCodeStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.devpay
    - typings.awsDashSdk.awsDashSdkStrings.marketplace
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
    - typings.awsDashSdk.awsDashSdkStrings.`Linux/UNIX`
    - typings.awsDashSdk.awsDashSdkStrings.`Linux/UNIX (Amazon VPC)`
    - typings.awsDashSdk.awsDashSdkStrings.Windows
    - typings.awsDashSdk.awsDashSdkStrings.`Windows (Amazon VPC)`
    - java.lang.String
  */
  type RIProductDescription = _RIProductDescription | java.lang.String
  type ReasonCodesList = js.Array[ReportInstanceReasonCodes]
  type RecurringChargeFrequency = Hourly | java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.other
    - java.lang.String
  */
  type ReportInstanceReasonCodes = _ReportInstanceReasonCodes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ok
    - typings.awsDashSdk.awsDashSdkStrings.impaired
    - java.lang.String
  */
  type ReportStatusType = _ReportStatusType | java.lang.String
  type RequestHostIdList = js.Array[String]
  type RequestHostIdSet = js.Array[String]
  type ReservationList = js.Array[Reservation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`payment-pending`
    - typings.awsDashSdk.awsDashSdkStrings.`payment-failed`
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.retired
    - java.lang.String
  */
  type ReservationState = _ReservationState | java.lang.String
  type ReservedInstanceIdSet = js.Array[String]
  type ReservedInstanceReservationValueSet = js.Array[ReservedInstanceReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`payment-pending`
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.`payment-failed`
    - typings.awsDashSdk.awsDashSdkStrings.retired
    - java.lang.String
  */
  type ReservedInstanceState = _ReservedInstanceState | java.lang.String
  type ReservedInstancesConfigurationList = js.Array[ReservedInstancesConfiguration]
  type ReservedInstancesIdStringList = js.Array[String]
  type ReservedInstancesList = js.Array[ReservedInstances]
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
    - typings.awsDashSdk.awsDashSdkStrings.instance
    - typings.awsDashSdk.awsDashSdkStrings.`internet-gateway`
    - typings.awsDashSdk.awsDashSdkStrings.`launch-template`
    - typings.awsDashSdk.awsDashSdkStrings.natgateway
    - typings.awsDashSdk.awsDashSdkStrings.`network-acl`
    - typings.awsDashSdk.awsDashSdkStrings.`network-interface`
    - typings.awsDashSdk.awsDashSdkStrings.`reserved-instances`
    - typings.awsDashSdk.awsDashSdkStrings.`route-table`
    - typings.awsDashSdk.awsDashSdkStrings.`security-group`
    - typings.awsDashSdk.awsDashSdkStrings.snapshot
    - typings.awsDashSdk.awsDashSdkStrings.`spot-instances-request`
    - typings.awsDashSdk.awsDashSdkStrings.subnet
    - typings.awsDashSdk.awsDashSdkStrings.`traffic-mirror-filter`
    - typings.awsDashSdk.awsDashSdkStrings.`traffic-mirror-session`
    - typings.awsDashSdk.awsDashSdkStrings.`traffic-mirror-target`
    - typings.awsDashSdk.awsDashSdkStrings.`transit-gateway`
    - typings.awsDashSdk.awsDashSdkStrings.`transit-gateway-attachment`
    - typings.awsDashSdk.awsDashSdkStrings.`transit-gateway-route-table`
    - typings.awsDashSdk.awsDashSdkStrings.volume
    - typings.awsDashSdk.awsDashSdkStrings.vpc
    - typings.awsDashSdk.awsDashSdkStrings.`vpc-peering-connection`
    - typings.awsDashSdk.awsDashSdkStrings.`vpn-connection`
    - typings.awsDashSdk.awsDashSdkStrings.`vpn-gateway`
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResponseHostIdList = js.Array[String]
  type ResponseHostIdSet = js.Array[String]
  type RestorableByStringList = js.Array[String]
  type RouteList = js.Array[Route]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreateRouteTable
    - typings.awsDashSdk.awsDashSdkStrings.CreateRoute
    - typings.awsDashSdk.awsDashSdkStrings.EnableVgwRoutePropagation
    - java.lang.String
  */
  type RouteOrigin = _RouteOrigin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.blackhole
    - java.lang.String
  */
  type RouteState = _RouteState | java.lang.String
  type RouteTableAssociationList = js.Array[RouteTableAssociation]
  type RouteTableList = js.Array[RouteTable]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.allow
    - typings.awsDashSdk.awsDashSdkStrings.deny
    - java.lang.String
  */
  type RuleAction = _RuleAction | java.lang.String
  type ScheduledInstanceAvailabilitySet = js.Array[ScheduledInstanceAvailability]
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
  type ServiceConfigurationSet = js.Array[ServiceConfiguration]
  type ServiceDetailSet = js.Array[ServiceDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Available
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - typings.awsDashSdk.awsDashSdkStrings.Deleted
    - typings.awsDashSdk.awsDashSdkStrings.Failed
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
    - typings.awsDashSdk.awsDashSdkStrings.terminate
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
  type SnapshotIdStringList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotSet = js.Array[SnapshotInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.completed
    - typings.awsDashSdk.awsDashSdkStrings.error
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
  type SpotFleetTagSpecificationList = js.Array[SpotFleetTagSpecification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.hibernate
    - typings.awsDashSdk.awsDashSdkStrings.stop
    - typings.awsDashSdk.awsDashSdkStrings.terminate
    - java.lang.String
  */
  type SpotInstanceInterruptionBehavior = _SpotInstanceInterruptionBehavior | java.lang.String
  type SpotInstanceRequestIdList = js.Array[String]
  type SpotInstanceRequestList = js.Array[SpotInstanceRequest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.open
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.closed
    - typings.awsDashSdk.awsDashSdkStrings.cancelled
    - typings.awsDashSdk.awsDashSdkStrings.failed
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
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Available
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - typings.awsDashSdk.awsDashSdkStrings.Deleted
    - typings.awsDashSdk.awsDashSdkStrings.Rejected
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Expired
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
    - typings.awsDashSdk.awsDashSdkStrings.passed
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.`insufficient-data`
    - typings.awsDashSdk.awsDashSdkStrings.initializing
    - java.lang.String
  */
  type StatusType = _StatusType | java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating
    - typings.awsDashSdk.awsDashSdkStrings.associated
    - typings.awsDashSdk.awsDashSdkStrings.disassociating
    - typings.awsDashSdk.awsDashSdkStrings.disassociated
    - typings.awsDashSdk.awsDashSdkStrings.failing
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - java.lang.String
  */
  type SubnetCidrBlockStateCode = _SubnetCidrBlockStateCode | java.lang.String
  type SubnetIdStringList = js.Array[String]
  type SubnetIpv6CidrBlockAssociationSet = js.Array[SubnetIpv6CidrBlockAssociation]
  type SubnetList = js.Array[Subnet]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - java.lang.String
  */
  type SubnetState = _SubnetState | java.lang.String
  type SuccessfulInstanceCreditSpecificationSet = js.Array[SuccessfulInstanceCreditSpecificationItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ok
    - typings.awsDashSdk.awsDashSdkStrings.impaired
    - typings.awsDashSdk.awsDashSdkStrings.`insufficient-data`
    - typings.awsDashSdk.awsDashSdkStrings.`not-applicable`
    - typings.awsDashSdk.awsDashSdkStrings.initializing
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
    - typings.awsDashSdk.awsDashSdkStrings.default
    - typings.awsDashSdk.awsDashSdkStrings.dedicated
    - typings.awsDashSdk.awsDashSdkStrings.host
    - java.lang.String
  */
  type Tenancy = _Tenancy | java.lang.String
  type TerminateConnectionStatusSet = js.Array[TerminateConnectionStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ingress
    - typings.awsDashSdk.awsDashSdkStrings.egress
    - java.lang.String
  */
  type TrafficDirection = _TrafficDirection | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`destination-port-range`
    - typings.awsDashSdk.awsDashSdkStrings.`source-port-range`
    - typings.awsDashSdk.awsDashSdkStrings.protocol
    - typings.awsDashSdk.awsDashSdkStrings.description
    - java.lang.String
  */
  type TrafficMirrorFilterRuleField = _TrafficMirrorFilterRuleField | java.lang.String
  type TrafficMirrorFilterRuleFieldList = js.Array[TrafficMirrorFilterRuleField]
  type TrafficMirrorFilterRuleList = js.Array[TrafficMirrorFilterRule]
  type TrafficMirrorFilterSet = js.Array[TrafficMirrorFilter]
  type TrafficMirrorNetworkService = `amazon-dns` | java.lang.String
  type TrafficMirrorNetworkServiceList = js.Array[TrafficMirrorNetworkService]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.accept
    - typings.awsDashSdk.awsDashSdkStrings.reject
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
  type TrafficMirrorSessionSet = js.Array[TrafficMirrorSession]
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
    - typings.awsDashSdk.awsDashSdkStrings.associating
    - typings.awsDashSdk.awsDashSdkStrings.associated
    - typings.awsDashSdk.awsDashSdkStrings.disassociating
    - typings.awsDashSdk.awsDashSdkStrings.disassociated
    - java.lang.String
  */
  type TransitGatewayAssociationState = _TransitGatewayAssociationState | java.lang.String
  type TransitGatewayAttachmentIdStringList = js.Array[String]
  type TransitGatewayAttachmentList = js.Array[TransitGatewayAttachment]
  type TransitGatewayAttachmentPropagationList = js.Array[TransitGatewayAttachmentPropagation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.vpc
    - typings.awsDashSdk.awsDashSdkStrings.vpn
    - typings.awsDashSdk.awsDashSdkStrings.`direct-connect-gateway`
    - java.lang.String
  */
  type TransitGatewayAttachmentResourceType = _TransitGatewayAttachmentResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pendingAcceptance
    - typings.awsDashSdk.awsDashSdkStrings.rollingBack
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.modifying
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.rejected
    - typings.awsDashSdk.awsDashSdkStrings.rejecting
    - typings.awsDashSdk.awsDashSdkStrings.failing
    - java.lang.String
  */
  type TransitGatewayAttachmentState = _TransitGatewayAttachmentState | java.lang.String
  type TransitGatewayIdStringList = js.Array[String]
  type TransitGatewayList = js.Array[TransitGateway]
  type TransitGatewayMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enabling
    - typings.awsDashSdk.awsDashSdkStrings.enabled
    - typings.awsDashSdk.awsDashSdkStrings.disabling
    - typings.awsDashSdk.awsDashSdkStrings.disabled
    - java.lang.String
  */
  type TransitGatewayPropagationState = _TransitGatewayPropagationState | java.lang.String
  type TransitGatewayRouteAttachmentList = js.Array[TransitGatewayRouteAttachment]
  type TransitGatewayRouteList = js.Array[TransitGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.blackhole
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type TransitGatewayRouteState = _TransitGatewayRouteState | java.lang.String
  type TransitGatewayRouteTableAssociationList = js.Array[TransitGatewayRouteTableAssociation]
  type TransitGatewayRouteTableIdStringList = js.Array[String]
  type TransitGatewayRouteTableList = js.Array[TransitGatewayRouteTable]
  type TransitGatewayRouteTablePropagationList = js.Array[TransitGatewayRouteTablePropagation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type TransitGatewayRouteTableState = _TransitGatewayRouteTableState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.static
    - typings.awsDashSdk.awsDashSdkStrings.propagated
    - java.lang.String
  */
  type TransitGatewayRouteType = _TransitGatewayRouteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.modifying
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type TransitGatewayState = _TransitGatewayState | java.lang.String
  type TransitGatewayVpcAttachmentList = js.Array[TransitGatewayVpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.tcp
    - typings.awsDashSdk.awsDashSdkStrings.udp
    - java.lang.String
  */
  type TransportProtocol = _TransportProtocol | java.lang.String
  type TunnelOptionsList = js.Array[TunnelOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InvalidInstanceIDDOTMalformed
    - typings.awsDashSdk.awsDashSdkStrings.InvalidInstanceIDDOTNotFound
    - typings.awsDashSdk.awsDashSdkStrings.IncorrectInstanceState
    - typings.awsDashSdk.awsDashSdkStrings.InstanceCreditSpecificationDOTNotSupported
    - java.lang.String
  */
  type UnsuccessfulInstanceCreditSpecificationErrorCode = _UnsuccessfulInstanceCreditSpecificationErrorCode | java.lang.String
  type UnsuccessfulInstanceCreditSpecificationSet = js.Array[UnsuccessfulInstanceCreditSpecificationItem]
  type UnsuccessfulItemList = js.Array[UnsuccessfulItem]
  type UnsuccessfulItemSet = js.Array[UnsuccessfulItem]
  type UserGroupStringList = js.Array[String]
  type UserIdGroupPairList = js.Array[UserIdGroupPair]
  type UserIdGroupPairSet = js.Array[UserIdGroupPair]
  type UserIdStringList = js.Array[String]
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
    - typings.awsDashSdk.awsDashSdkStrings.attaching
    - typings.awsDashSdk.awsDashSdkStrings.attached
    - typings.awsDashSdk.awsDashSdkStrings.detaching
    - typings.awsDashSdk.awsDashSdkStrings.detached
    - typings.awsDashSdk.awsDashSdkStrings.busy
    - java.lang.String
  */
  type VolumeAttachmentState = _VolumeAttachmentState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.autoEnableIO
    - typings.awsDashSdk.awsDashSdkStrings.productCodes
    - java.lang.String
  */
  type VolumeAttributeName = _VolumeAttributeName | java.lang.String
  type VolumeIdStringList = js.Array[String]
  type VolumeList = js.Array[Volume]
  type VolumeModificationList = js.Array[VolumeModification]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.modifying
    - typings.awsDashSdk.awsDashSdkStrings.optimizing
    - typings.awsDashSdk.awsDashSdkStrings.completed
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - java.lang.String
  */
  type VolumeModificationState = _VolumeModificationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.creating
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.`in-use`
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.error
    - java.lang.String
  */
  type VolumeState = _VolumeState | java.lang.String
  type VolumeStatusActionsList = js.Array[VolumeStatusAction]
  type VolumeStatusDetailsList = js.Array[VolumeStatusDetails]
  type VolumeStatusEventsList = js.Array[VolumeStatusEvent]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ok
    - typings.awsDashSdk.awsDashSdkStrings.impaired
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
    - typings.awsDashSdk.awsDashSdkStrings.standard
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
  type VpcCidrBlockAssociationSet = js.Array[VpcCidrBlockAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.associating
    - typings.awsDashSdk.awsDashSdkStrings.associated
    - typings.awsDashSdk.awsDashSdkStrings.disassociating
    - typings.awsDashSdk.awsDashSdkStrings.disassociated
    - typings.awsDashSdk.awsDashSdkStrings.failing
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - java.lang.String
  */
  type VpcCidrBlockStateCode = _VpcCidrBlockStateCode | java.lang.String
  type VpcClassicLinkIdList = js.Array[String]
  type VpcClassicLinkList = js.Array[VpcClassicLink]
  type VpcEndpointConnectionSet = js.Array[VpcEndpointConnection]
  type VpcEndpointSet = js.Array[VpcEndpoint]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Interface
    - typings.awsDashSdk.awsDashSdkStrings.Gateway
    - java.lang.String
  */
  type VpcEndpointType = _VpcEndpointType | java.lang.String
  type VpcIdStringList = js.Array[String]
  type VpcIpv6CidrBlockAssociationSet = js.Array[VpcIpv6CidrBlockAssociation]
  type VpcList = js.Array[Vpc]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`initiating-request`
    - typings.awsDashSdk.awsDashSdkStrings.`pending-acceptance`
    - typings.awsDashSdk.awsDashSdkStrings.active
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - typings.awsDashSdk.awsDashSdkStrings.rejected
    - typings.awsDashSdk.awsDashSdkStrings.failed
    - typings.awsDashSdk.awsDashSdkStrings.expired
    - typings.awsDashSdk.awsDashSdkStrings.provisioning
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - java.lang.String
  */
  type VpcPeeringConnectionStateReasonCode = _VpcPeeringConnectionStateReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - java.lang.String
  */
  type VpcState = _VpcState | java.lang.String
  type VpcTenancy = default | java.lang.String
  type VpnConnectionIdStringList = js.Array[String]
  type VpnConnectionList = js.Array[VpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.enable
    - typings.awsDashSdk.awsDashSdkStrings.disable
    - java.lang.String
  */
  type VpnEcmpSupportValue = _VpnEcmpSupportValue | java.lang.String
  type VpnGatewayIdStringList = js.Array[String]
  type VpnGatewayList = js.Array[VpnGateway]
  type VpnProtocol = openvpn | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.pending
    - typings.awsDashSdk.awsDashSdkStrings.available
    - typings.awsDashSdk.awsDashSdkStrings.deleting
    - typings.awsDashSdk.awsDashSdkStrings.deleted
    - java.lang.String
  */
  type VpnState = _VpnState | java.lang.String
  type VpnStaticRouteList = js.Array[VpnStaticRoute]
  type VpnStaticRouteSource = Static | java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`Availability Zone`
    - typings.awsDashSdk.awsDashSdkStrings.Region
    - java.lang.String
  */
  type scope = _scope | java.lang.String
}
