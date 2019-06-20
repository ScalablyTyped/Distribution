package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsEc2Mod {
  type AccountAttributeList = js.Array[AccountAttribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`supported-platforms`
    - awsDashSdkLib.awsDashSdkLibStrings.`default-vpc`
    - java.lang.String
  */
  type AccountAttributeName = _AccountAttributeName | java.lang.String
  type AccountAttributeNameStringList = js.Array[AccountAttributeName]
  type AccountAttributeValueList = js.Array[AccountAttributeValue]
  type ActiveInstanceSet = js.Array[ActiveInstance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.pending_fulfillment
    - awsDashSdkLib.awsDashSdkLibStrings.pending_termination
    - awsDashSdkLib.awsDashSdkLibStrings.fulfilled
    - java.lang.String
  */
  type ActivityStatus = _ActivityStatus | java.lang.String
  type AddressList = js.Array[Address]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.default
    - awsDashSdkLib.awsDashSdkLibStrings.host
    - java.lang.String
  */
  type Affinity = _Affinity | java.lang.String
  type AllocationIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.`under-assessment`
    - awsDashSdkLib.awsDashSdkLibStrings.`permanent-failure`
    - awsDashSdkLib.awsDashSdkLibStrings.released
    - awsDashSdkLib.awsDashSdkLibStrings.`released-permanent-failure`
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - java.lang.String
  */
  type AllocationState = _AllocationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.lowestPrice
    - awsDashSdkLib.awsDashSdkLibStrings.diversified
    - java.lang.String
  */
  type AllocationStrategy = _AllocationStrategy | java.lang.String
  type AllowedPrincipalSet = js.Array[AllowedPrincipal]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.i386
    - awsDashSdkLib.awsDashSdkLibStrings.x86_64
    - awsDashSdkLib.awsDashSdkLibStrings.arm64
    - java.lang.String
  */
  type ArchitectureValues = _ArchitectureValues | java.lang.String
  type AssociatedNetworkType = awsDashSdkLib.awsDashSdkLibStrings.vpc | java.lang.String
  type AssociatedTargetNetworkSet = js.Array[AssociatedTargetNetwork]
  type AssociationIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.associating
    - awsDashSdkLib.awsDashSdkLibStrings.associated
    - awsDashSdkLib.awsDashSdkLibStrings.`association-failed`
    - awsDashSdkLib.awsDashSdkLibStrings.disassociating
    - awsDashSdkLib.awsDashSdkLibStrings.disassociated
    - java.lang.String
  */
  type AssociationStatusCode = _AssociationStatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.attaching
    - awsDashSdkLib.awsDashSdkLibStrings.attached
    - awsDashSdkLib.awsDashSdkLibStrings.detaching
    - awsDashSdkLib.awsDashSdkLibStrings.detached
    - java.lang.String
  */
  type AttachmentStatus = _AttachmentStatus | java.lang.String
  type AuthorizationRuleSet = js.Array[AuthorizationRule]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enable
    - awsDashSdkLib.awsDashSdkLibStrings.disable
    - java.lang.String
  */
  type AutoAcceptSharedAttachmentsValue = _AutoAcceptSharedAttachmentsValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.on
    - awsDashSdkLib.awsDashSdkLibStrings.off
    - java.lang.String
  */
  type AutoPlacement = _AutoPlacement | java.lang.String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZoneMessageList = js.Array[AvailabilityZoneMessage]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.information
    - awsDashSdkLib.awsDashSdkLibStrings.impaired
    - awsDashSdkLib.awsDashSdkLibStrings.unavailable
    - java.lang.String
  */
  type AvailabilityZoneState = _AvailabilityZoneState | java.lang.String
  type AvailableInstanceCapacityList = js.Array[InstanceCapacity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.submitted
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled_running
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled_terminating
    - awsDashSdkLib.awsDashSdkLibStrings.modifying
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
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.`waiting-for-shutdown`
    - awsDashSdkLib.awsDashSdkLibStrings.bundling
    - awsDashSdkLib.awsDashSdkLibStrings.storing
    - awsDashSdkLib.awsDashSdkLibStrings.cancelling
    - awsDashSdkLib.awsDashSdkLibStrings.complete
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type BundleTaskState = _BundleTaskState | java.lang.String
  type ByoipCidrSet = js.Array[ByoipCidr]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.advertised
    - awsDashSdkLib.awsDashSdkLibStrings.deprovisioned
    - awsDashSdkLib.awsDashSdkLibStrings.`failed-deprovision`
    - awsDashSdkLib.awsDashSdkLibStrings.`failed-provision`
    - awsDashSdkLib.awsDashSdkLibStrings.`pending-deprovision`
    - awsDashSdkLib.awsDashSdkLibStrings.`pending-provision`
    - awsDashSdkLib.awsDashSdkLibStrings.provisioned
    - java.lang.String
  */
  type ByoipCidrState = _ByoipCidrState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.fleetRequestIdDoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.fleetRequestIdMalformed
    - awsDashSdkLib.awsDashSdkLibStrings.fleetRequestNotInCancellableState
    - awsDashSdkLib.awsDashSdkLibStrings.unexpectedError
    - java.lang.String
  */
  type CancelBatchErrorCode = _CancelBatchErrorCode | java.lang.String
  type CancelSpotFleetRequestsErrorSet = js.Array[CancelSpotFleetRequestsErrorItem]
  type CancelSpotFleetRequestsSuccessSet = js.Array[CancelSpotFleetRequestsSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.closed
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.completed
    - java.lang.String
  */
  type CancelSpotInstanceRequestState = _CancelSpotInstanceRequestState | java.lang.String
  type CancelledSpotInstanceRequestList = js.Array[CancelledSpotInstanceRequest]
  type CapacityReservationIdSet = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`Linux/UNIX`
    - awsDashSdkLib.awsDashSdkLibStrings.`Red Hat Enterprise Linux`
    - awsDashSdkLib.awsDashSdkLibStrings.`SUSE Linux`
    - awsDashSdkLib.awsDashSdkLibStrings.Windows
    - awsDashSdkLib.awsDashSdkLibStrings.`Windows with SQL Server`
    - awsDashSdkLib.awsDashSdkLibStrings.`Windows with SQL Server Enterprise`
    - awsDashSdkLib.awsDashSdkLibStrings.`Windows with SQL Server Standard`
    - awsDashSdkLib.awsDashSdkLibStrings.`Windows with SQL Server Web`
    - awsDashSdkLib.awsDashSdkLibStrings.`Linux with SQL Server Standard`
    - awsDashSdkLib.awsDashSdkLibStrings.`Linux with SQL Server Web`
    - awsDashSdkLib.awsDashSdkLibStrings.`Linux with SQL Server Enterprise`
    - java.lang.String
  */
  type CapacityReservationInstancePlatform = _CapacityReservationInstancePlatform | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.none
    - java.lang.String
  */
  type CapacityReservationPreference = _CapacityReservationPreference | java.lang.String
  type CapacityReservationSet = js.Array[CapacityReservation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.expired
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type CapacityReservationState = _CapacityReservationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.default
    - awsDashSdkLib.awsDashSdkLibStrings.dedicated
    - java.lang.String
  */
  type CapacityReservationTenancy = _CapacityReservationTenancy | java.lang.String
  type CidrBlockSet = js.Array[CidrBlock]
  type ClassicLinkDnsSupportList = js.Array[ClassicLinkDnsSupport]
  type ClassicLinkInstanceList = js.Array[ClassicLinkInstance]
  type ClassicLoadBalancers = js.Array[ClassicLoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - java.lang.String
  */
  type ClientCertificateRevocationListStatusCode = _ClientCertificateRevocationListStatusCode | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientVpnAuthenticationList = js.Array[ClientVpnAuthentication]
  type ClientVpnAuthenticationRequestList = js.Array[ClientVpnAuthenticationRequest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`certificate-authentication`
    - awsDashSdkLib.awsDashSdkLibStrings.`directory-service-authentication`
    - java.lang.String
  */
  type ClientVpnAuthenticationType = _ClientVpnAuthenticationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.authorizing
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.revoking
    - java.lang.String
  */
  type ClientVpnAuthorizationRuleStatusCode = _ClientVpnAuthorizationRuleStatusCode | java.lang.String
  type ClientVpnConnectionSet = js.Array[ClientVpnConnection]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.`failed-to-terminate`
    - awsDashSdkLib.awsDashSdkLibStrings.terminating
    - awsDashSdkLib.awsDashSdkLibStrings.terminated
    - java.lang.String
  */
  type ClientVpnConnectionStatusCode = _ClientVpnConnectionStatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`pending-associate`
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type ClientVpnEndpointStatusCode = _ClientVpnEndpointStatusCode | java.lang.String
  type ClientVpnRouteSet = js.Array[ClientVpnRoute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.creating
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - java.lang.String
  */
  type ClientVpnRouteStatusCode = _ClientVpnRouteStatusCode | java.lang.String
  type ClientVpnSecurityGroupIdSet = js.Array[String]
  type ConnectionNotificationSet = js.Array[ConnectionNotification]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type ConnectionNotificationState = _ConnectionNotificationState | java.lang.String
  type ConnectionNotificationType = awsDashSdkLib.awsDashSdkLibStrings.Topic | java.lang.String
  type ContainerFormat = awsDashSdkLib.awsDashSdkLibStrings.ova | java.lang.String
  type ConversionIdStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.cancelling
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.completed
    - java.lang.String
  */
  type ConversionTaskState = _ConversionTaskState | java.lang.String
  type CopyTagsFromSource = awsDashSdkLib.awsDashSdkLibStrings.volume | java.lang.String
  type CreateFleetErrorsSet = js.Array[CreateFleetError]
  type CreateFleetInstancesSet = js.Array[CreateFleetInstance]
  type CreateVolumePermissionList = js.Array[CreateVolumePermission]
  type CurrencyCodeValues = awsDashSdkLib.awsDashSdkLibStrings.USD | java.lang.String
  type CustomerGatewayIdStringList = js.Array[String]
  type CustomerGatewayList = js.Array[CustomerGateway]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Inactive
    - java.lang.String
  */
  type DatafeedSubscriptionState = _DatafeedSubscriptionState | java.lang.String
  type DateTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enable
    - awsDashSdkLib.awsDashSdkLibStrings.disable
    - java.lang.String
  */
  type DefaultRouteTableAssociationValue = _DefaultRouteTableAssociationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enable
    - awsDashSdkLib.awsDashSdkLibStrings.disable
    - java.lang.String
  */
  type DefaultRouteTablePropagationValue = _DefaultRouteTablePropagationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.spot
    - awsDashSdkLib.awsDashSdkLibStrings.`on-demand`
    - java.lang.String
  */
  type DefaultTargetCapacityType = _DefaultTargetCapacityType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.fleetIdDoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.fleetIdMalformed
    - awsDashSdkLib.awsDashSdkLibStrings.fleetNotInDeletableState
    - awsDashSdkLib.awsDashSdkLibStrings.unexpectedError
    - java.lang.String
  */
  type DeleteFleetErrorCode = _DeleteFleetErrorCode | java.lang.String
  type DeleteFleetErrorSet = js.Array[DeleteFleetErrorItem]
  type DeleteFleetSuccessSet = js.Array[DeleteFleetSuccessItem]
  type DeleteLaunchTemplateVersionsResponseErrorSet = js.Array[DeleteLaunchTemplateVersionsResponseErrorItem]
  type DeleteLaunchTemplateVersionsResponseSuccessSet = js.Array[DeleteLaunchTemplateVersionsResponseSuccessItem]
  type DescribeCapacityReservationsMaxResults = scala.Double
  type DescribeConversionTaskList = js.Array[ConversionTask]
  type DescribeDhcpOptionsMaxResults = scala.Double
  type DescribeElasticGpusMaxResults = scala.Double
  type DescribeFleetsErrorSet = js.Array[DescribeFleetError]
  type DescribeFleetsInstancesSet = js.Array[DescribeFleetsInstances]
  type DescribeHostReservationsMaxResults = scala.Double
  type DescribeInstanceCreditSpecificationsMaxResults = scala.Double
  type DescribeInternetGatewaysMaxResults = scala.Double
  type DescribeLaunchTemplatesMaxResults = scala.Double
  type DescribeNetworkAclsMaxResults = scala.Double
  type DescribeNetworkInterfacePermissionsMaxResults = scala.Double
  type DescribeNetworkInterfacesMaxResults = scala.Double
  type DescribeRouteTablesMaxResults = scala.Double
  type DescribeSecurityGroupsMaxResults = scala.Double
  type DescribeStaleSecurityGroupsMaxResults = scala.Double
  type DescribeStaleSecurityGroupsNextToken = java.lang.String
  type DescribeSubnetsMaxResults = scala.Double
  type DescribeVpcPeeringConnectionsMaxResults = scala.Double
  type DescribeVpcsMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ebs
    - awsDashSdkLib.awsDashSdkLibStrings.`instance-store`
    - java.lang.String
  */
  type DeviceType = _DeviceType | java.lang.String
  type DhcpConfigurationList = js.Array[DhcpConfiguration]
  type DhcpConfigurationValueList = js.Array[AttributeValue]
  type DhcpOptionsIdStringList = js.Array[String]
  type DhcpOptionsList = js.Array[DhcpOptions]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VMDK
    - awsDashSdkLib.awsDashSdkLibStrings.RAW
    - awsDashSdkLib.awsDashSdkLibStrings.VHD
    - java.lang.String
  */
  type DiskImageFormat = _DiskImageFormat | java.lang.String
  type DiskImageList = js.Array[DiskImage]
  type DnsEntrySet = js.Array[DnsEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enable
    - awsDashSdkLib.awsDashSdkLibStrings.disable
    - java.lang.String
  */
  type DnsSupportValue = _DnsSupportValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.vpc
    - awsDashSdkLib.awsDashSdkLibStrings.standard
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
  type ElasticGpuState = awsDashSdkLib.awsDashSdkLibStrings.ATTACHED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OK
    - awsDashSdkLib.awsDashSdkLibStrings.IMPAIRED
    - java.lang.String
  */
  type ElasticGpuStatus = _ElasticGpuStatus | java.lang.String
  type ElasticInferenceAcceleratorAssociationList = js.Array[ElasticInferenceAcceleratorAssociation]
  type ElasticInferenceAccelerators = js.Array[ElasticInferenceAccelerator]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.unlimited
    - awsDashSdkLib.awsDashSdkLibStrings.limited
    - java.lang.String
  */
  type EndDateType = _EndDateType | java.lang.String
  type EndpointSet = js.Array[ClientVpnEndpoint]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`instance-reboot`
    - awsDashSdkLib.awsDashSdkLibStrings.`system-reboot`
    - awsDashSdkLib.awsDashSdkLibStrings.`system-maintenance`
    - awsDashSdkLib.awsDashSdkLibStrings.`instance-retirement`
    - awsDashSdkLib.awsDashSdkLibStrings.`instance-stop`
    - java.lang.String
  */
  type EventCode = _EventCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.instanceChange
    - awsDashSdkLib.awsDashSdkLibStrings.fleetRequestChange
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.noTermination
    - awsDashSdkLib.awsDashSdkLibStrings.default
    - java.lang.String
  */
  type ExcessCapacityTerminationPolicy = _ExcessCapacityTerminationPolicy | java.lang.String
  type ExecutableByStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.citrix
    - awsDashSdkLib.awsDashSdkLibStrings.vmware
    - awsDashSdkLib.awsDashSdkLibStrings.microsoft
    - java.lang.String
  */
  type ExportEnvironment = _ExportEnvironment | java.lang.String
  type ExportTaskIdStringList = js.Array[String]
  type ExportTaskList = js.Array[ExportTask]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.cancelling
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.completed
    - java.lang.String
  */
  type ExportTaskState = _ExportTaskState | java.lang.String
  type FilterList = js.Array[Filter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.`pending-fulfillment`
    - awsDashSdkLib.awsDashSdkLibStrings.`pending-termination`
    - awsDashSdkLib.awsDashSdkLibStrings.fulfilled
    - java.lang.String
  */
  type FleetActivityStatus = _FleetActivityStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`instance-change`
    - awsDashSdkLib.awsDashSdkLibStrings.`fleet-change`
    - awsDashSdkLib.awsDashSdkLibStrings.`service-error`
    - java.lang.String
  */
  type FleetEventType = _FleetEventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`no-termination`
    - awsDashSdkLib.awsDashSdkLibStrings.termination
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
    - awsDashSdkLib.awsDashSdkLibStrings.`lowest-price`
    - awsDashSdkLib.awsDashSdkLibStrings.prioritized
    - java.lang.String
  */
  type FleetOnDemandAllocationStrategy = _FleetOnDemandAllocationStrategy | java.lang.String
  type FleetSet = js.Array[FleetData]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.submitted
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.`deleted-running`
    - awsDashSdkLib.awsDashSdkLibStrings.`deleted-terminating`
    - awsDashSdkLib.awsDashSdkLibStrings.modifying
    - java.lang.String
  */
  type FleetStateCode = _FleetStateCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.request
    - awsDashSdkLib.awsDashSdkLibStrings.maintain
    - awsDashSdkLib.awsDashSdkLibStrings.instant
    - java.lang.String
  */
  type FleetType = _FleetType | java.lang.String
  type Float = scala.Double
  type FlowLogSet = js.Array[FlowLog]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VPC
    - awsDashSdkLib.awsDashSdkLibStrings.Subnet
    - awsDashSdkLib.awsDashSdkLibStrings.NetworkInterface
    - java.lang.String
  */
  type FlowLogsResourceType = _FlowLogsResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.description
    - awsDashSdkLib.awsDashSdkLibStrings.name
    - awsDashSdkLib.awsDashSdkLibStrings.loadPermission
    - awsDashSdkLib.awsDashSdkLibStrings.productCodes
    - java.lang.String
  */
  type FpgaImageAttributeName = _FpgaImageAttributeName | java.lang.String
  type FpgaImageIdList = js.Array[String]
  type FpgaImageList = js.Array[FpgaImage]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.unavailable
    - java.lang.String
  */
  type FpgaImageStateCode = _FpgaImageStateCode | java.lang.String
  type GatewayType = awsDashSdkLib.awsDashSdkLibStrings.ipsecDOT1 | java.lang.String
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
    - awsDashSdkLib.awsDashSdkLibStrings.on
    - awsDashSdkLib.awsDashSdkLibStrings.off
    - java.lang.String
  */
  type HostRecovery = _HostRecovery | java.lang.String
  type HostReservationIdSet = js.Array[String]
  type HostReservationSet = js.Array[HostReservation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.dedicated
    - awsDashSdkLib.awsDashSdkLibStrings.host
    - java.lang.String
  */
  type HostTenancy = _HostTenancy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ovm
    - awsDashSdkLib.awsDashSdkLibStrings.xen
    - java.lang.String
  */
  type HypervisorType = _HypervisorType | java.lang.String
  type IamInstanceProfileAssociationSet = js.Array[IamInstanceProfileAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.associating
    - awsDashSdkLib.awsDashSdkLibStrings.associated
    - awsDashSdkLib.awsDashSdkLibStrings.disassociating
    - awsDashSdkLib.awsDashSdkLibStrings.disassociated
    - java.lang.String
  */
  type IamInstanceProfileAssociationState = _IamInstanceProfileAssociationState | java.lang.String
  type IdFormatList = js.Array[IdFormat]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.description
    - awsDashSdkLib.awsDashSdkLibStrings.kernel
    - awsDashSdkLib.awsDashSdkLibStrings.ramdisk
    - awsDashSdkLib.awsDashSdkLibStrings.launchPermission
    - awsDashSdkLib.awsDashSdkLibStrings.productCodes
    - awsDashSdkLib.awsDashSdkLibStrings.blockDeviceMapping
    - awsDashSdkLib.awsDashSdkLibStrings.sriovNetSupport
    - java.lang.String
  */
  type ImageAttributeName = _ImageAttributeName | java.lang.String
  type ImageDiskContainerList = js.Array[ImageDiskContainer]
  type ImageIdStringList = js.Array[String]
  type ImageList = js.Array[Image]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.invalid
    - awsDashSdkLib.awsDashSdkLibStrings.deregistered
    - awsDashSdkLib.awsDashSdkLibStrings.transient
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - java.lang.String
  */
  type ImageState = _ImageState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.machine
    - awsDashSdkLib.awsDashSdkLibStrings.kernel
    - awsDashSdkLib.awsDashSdkLibStrings.ramdisk
    - java.lang.String
  */
  type ImageTypeValues = _ImageTypeValues | java.lang.String
  type ImportImageTaskList = js.Array[ImportImageTask]
  type ImportInstanceVolumeDetailSet = js.Array[ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskList = js.Array[ImportSnapshotTask]
  type ImportTaskIdList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.instanceType
    - awsDashSdkLib.awsDashSdkLibStrings.kernel
    - awsDashSdkLib.awsDashSdkLibStrings.ramdisk
    - awsDashSdkLib.awsDashSdkLibStrings.userData
    - awsDashSdkLib.awsDashSdkLibStrings.disableApiTermination
    - awsDashSdkLib.awsDashSdkLibStrings.instanceInitiatedShutdownBehavior
    - awsDashSdkLib.awsDashSdkLibStrings.rootDeviceName
    - awsDashSdkLib.awsDashSdkLibStrings.blockDeviceMapping
    - awsDashSdkLib.awsDashSdkLibStrings.productCodes
    - awsDashSdkLib.awsDashSdkLibStrings.sourceDestCheck
    - awsDashSdkLib.awsDashSdkLibStrings.groupSet
    - awsDashSdkLib.awsDashSdkLibStrings.ebsOptimized
    - awsDashSdkLib.awsDashSdkLibStrings.sriovNetSupport
    - awsDashSdkLib.awsDashSdkLibStrings.enaSupport
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
    - awsDashSdkLib.awsDashSdkLibStrings.healthy
    - awsDashSdkLib.awsDashSdkLibStrings.unhealthy
    - java.lang.String
  */
  type InstanceHealthStatus = _InstanceHealthStatus | java.lang.String
  type InstanceId = java.lang.String
  type InstanceIdSet = js.Array[String]
  type InstanceIdStringList = js.Array[String]
  type InstanceIdsSet = js.Array[InstanceId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.hibernate
    - awsDashSdkLib.awsDashSdkLibStrings.stop
    - awsDashSdkLib.awsDashSdkLibStrings.terminate
    - java.lang.String
  */
  type InstanceInterruptionBehavior = _InstanceInterruptionBehavior | java.lang.String
  type InstanceIpv6AddressList = js.Array[InstanceIpv6Address]
  type InstanceIpv6AddressListRequest = js.Array[InstanceIpv6AddressRequest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.spot
    - awsDashSdkLib.awsDashSdkLibStrings.`on-demand`
    - java.lang.String
  */
  type InstanceLifecycle = _InstanceLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.spot
    - awsDashSdkLib.awsDashSdkLibStrings.scheduled
    - java.lang.String
  */
  type InstanceLifecycleType = _InstanceLifecycleType | java.lang.String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.targeted
    - java.lang.String
  */
  type InstanceMatchCriteria = _InstanceMatchCriteria | java.lang.String
  type InstanceMonitoringList = js.Array[InstanceMonitoring]
  type InstanceNetworkInterfaceList = js.Array[InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList = js.Array[InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList = js.Array[InstancePrivateIpAddress]
  type InstanceStateChangeList = js.Array[InstanceStateChange]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.running
    - awsDashSdkLib.awsDashSdkLibStrings.`shutting-down`
    - awsDashSdkLib.awsDashSdkLibStrings.terminated
    - awsDashSdkLib.awsDashSdkLibStrings.stopping
    - awsDashSdkLib.awsDashSdkLibStrings.stopped
    - java.lang.String
  */
  type InstanceStateName = _InstanceStateName | java.lang.String
  type InstanceStatusDetailsList = js.Array[InstanceStatusDetails]
  type InstanceStatusEventList = js.Array[InstanceStatusEvent]
  type InstanceStatusList = js.Array[InstanceStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.t1DOTmicro
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTnano
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTmicro
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTsmall
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.t2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.t3DOTnano
    - awsDashSdkLib.awsDashSdkLibStrings.t3DOTmicro
    - awsDashSdkLib.awsDashSdkLibStrings.t3DOTsmall
    - awsDashSdkLib.awsDashSdkLibStrings.t3DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.t3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.t3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.t3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.t3aDOTnano
    - awsDashSdkLib.awsDashSdkLibStrings.t3aDOTmicro
    - awsDashSdkLib.awsDashSdkLibStrings.t3aDOTsmall
    - awsDashSdkLib.awsDashSdkLibStrings.t3aDOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.t3aDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.t3aDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.t3aDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m1DOTsmall
    - awsDashSdkLib.awsDashSdkLibStrings.m1DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.m1DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m1DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT10xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m4DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m2DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.cr1DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r4DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5DOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5DOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5DOTmetal
    - awsDashSdkLib.awsDashSdkLibStrings.r5aDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5aDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5aDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5aDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5aDOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5aDOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5dDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5dDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5dDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5dDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5dDOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5dDOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5dDOTmetal
    - awsDashSdkLib.awsDashSdkLibStrings.r5adDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5adDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5adDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5adDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5adDOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5adDOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5adDOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.r5adDOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.x1DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.x1DOT32xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.x1eDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.x1eDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.x1eDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.x1eDOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.x1eDOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.x1eDOT32xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i2DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3DOTmetal
    - awsDashSdkLib.awsDashSdkLibStrings.i3enDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3enDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3enDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3enDOT3xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3enDOT6xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3enDOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.i3enDOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.hi1DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.hs1DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c1DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.c1DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c4DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5DOT9xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5DOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5DOT18xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5DOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5dDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5dDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5dDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5dDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5dDOT9xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5dDOT18xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5nDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5nDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5nDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5nDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5nDOT9xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.c5nDOT18xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.cc1DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.cc2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.g2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.g2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.g3DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.g3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.g3DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.g3sDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.cg1DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.p2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.p2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.p2DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.p3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.p3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.p3DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.p3dnDOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.d2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.d2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.d2DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.d2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.f1DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.f1DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.f1DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5DOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5DOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5DOTmetal
    - awsDashSdkLib.awsDashSdkLibStrings.m5aDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5aDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5aDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5aDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5aDOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5aDOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5dDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5dDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5dDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5dDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5dDOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5dDOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5dDOTmetal
    - awsDashSdkLib.awsDashSdkLibStrings.m5adDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5adDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5adDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5adDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5adDOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5adDOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5adDOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.m5adDOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.h1DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.h1DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.h1DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.h1DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.z1dDOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.z1dDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.z1dDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.z1dDOT3xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.z1dDOT6xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.z1dDOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.z1dDOTmetal
    - awsDashSdkLib.awsDashSdkLibStrings.`u-6tb1DOTmetal`
    - awsDashSdkLib.awsDashSdkLibStrings.`u-9tb1DOTmetal`
    - awsDashSdkLib.awsDashSdkLibStrings.`u-12tb1DOTmetal`
    - awsDashSdkLib.awsDashSdkLibStrings.a1DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.a1DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.a1DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.a1DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.a1DOT4xlarge
    - java.lang.String
  */
  type InstanceType = _InstanceType | java.lang.String
  type InstanceTypeList = js.Array[InstanceType]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`INSTANCE-ATTACH`
    - awsDashSdkLib.awsDashSdkLibStrings.`EIP-ASSOCIATE`
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
    - awsDashSdkLib.awsDashSdkLibStrings.enable
    - awsDashSdkLib.awsDashSdkLibStrings.disable
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
    - awsDashSdkLib.awsDashSdkLibStrings.launchTemplateIdDoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.launchTemplateIdMalformed
    - awsDashSdkLib.awsDashSdkLibStrings.launchTemplateNameDoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.launchTemplateNameMalformed
    - awsDashSdkLib.awsDashSdkLibStrings.launchTemplateVersionDoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.unexpectedError
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
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.sold
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - java.lang.String
  */
  type ListingState = _ListingState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.closed
    - java.lang.String
  */
  type ListingStatus = _ListingStatus | java.lang.String
  type LoadPermissionList = js.Array[LoadPermission]
  type LoadPermissionListRequest = js.Array[LoadPermissionRequest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`cloud-watch-logs`
    - awsDashSdkLib.awsDashSdkLibStrings.s3
    - java.lang.String
  */
  type LogDestinationType = _LogDestinationType | java.lang.String
  type Long = scala.Double
  type MarketType = awsDashSdkLib.awsDashSdkLibStrings.spot | java.lang.String
  type MaxResults = scala.Double
  type MillisecondDateTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.disabled
    - awsDashSdkLib.awsDashSdkLibStrings.disabling
    - awsDashSdkLib.awsDashSdkLibStrings.enabled
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - java.lang.String
  */
  type MonitoringState = _MonitoringState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.movingToVpc
    - awsDashSdkLib.awsDashSdkLibStrings.restoringToClassic
    - java.lang.String
  */
  type MoveStatus = _MoveStatus | java.lang.String
  type MovingAddressStatusSet = js.Array[MovingAddressStatus]
  type NatGatewayAddressList = js.Array[NatGatewayAddress]
  type NatGatewayList = js.Array[NatGateway]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type NatGatewayState = _NatGatewayState | java.lang.String
  type NetworkAclAssociationList = js.Array[NetworkAclAssociation]
  type NetworkAclEntryList = js.Array[NetworkAclEntry]
  type NetworkAclList = js.Array[NetworkAcl]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.description
    - awsDashSdkLib.awsDashSdkLibStrings.groupSet
    - awsDashSdkLib.awsDashSdkLibStrings.sourceDestCheck
    - awsDashSdkLib.awsDashSdkLibStrings.attachment
    - java.lang.String
  */
  type NetworkInterfaceAttribute = _NetworkInterfaceAttribute | java.lang.String
  type NetworkInterfaceCreationType = awsDashSdkLib.awsDashSdkLibStrings.efa | java.lang.String
  type NetworkInterfaceIdList = js.Array[String]
  type NetworkInterfaceIpv6AddressesList = js.Array[NetworkInterfaceIpv6Address]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NetworkInterfacePermissionIdList = js.Array[String]
  type NetworkInterfacePermissionList = js.Array[NetworkInterfacePermission]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.granted
    - awsDashSdkLib.awsDashSdkLibStrings.revoking
    - awsDashSdkLib.awsDashSdkLibStrings.revoked
    - java.lang.String
  */
  type NetworkInterfacePermissionStateCode = _NetworkInterfacePermissionStateCode | java.lang.String
  type NetworkInterfacePrivateIpAddressList = js.Array[NetworkInterfacePrivateIpAddress]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.associated
    - awsDashSdkLib.awsDashSdkLibStrings.attaching
    - awsDashSdkLib.awsDashSdkLibStrings.`in-use`
    - awsDashSdkLib.awsDashSdkLibStrings.detaching
    - java.lang.String
  */
  type NetworkInterfaceStatus = _NetworkInterfaceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.interface
    - awsDashSdkLib.awsDashSdkLibStrings.natGateway
    - awsDashSdkLib.awsDashSdkLibStrings.efa
    - java.lang.String
  */
  type NetworkInterfaceType = _NetworkInterfaceType | java.lang.String
  type NewDhcpConfigurationList = js.Array[NewDhcpConfiguration]
  type NextToken = java.lang.String
  type OccurrenceDayRequestSet = js.Array[Integer]
  type OccurrenceDaySet = js.Array[Integer]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.standard
    - awsDashSdkLib.awsDashSdkLibStrings.convertible
    - java.lang.String
  */
  type OfferingClassType = _OfferingClassType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`Heavy Utilization`
    - awsDashSdkLib.awsDashSdkLibStrings.`Medium Utilization`
    - awsDashSdkLib.awsDashSdkLibStrings.`Light Utilization`
    - awsDashSdkLib.awsDashSdkLibStrings.`No Upfront`
    - awsDashSdkLib.awsDashSdkLibStrings.`Partial Upfront`
    - awsDashSdkLib.awsDashSdkLibStrings.`All Upfront`
    - java.lang.String
  */
  type OfferingTypeValues = _OfferingTypeValues | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.lowestPrice
    - awsDashSdkLib.awsDashSdkLibStrings.prioritized
    - java.lang.String
  */
  type OnDemandAllocationStrategy = _OnDemandAllocationStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.add
    - awsDashSdkLib.awsDashSdkLibStrings.remove
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type OwnerStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AllUpfront
    - awsDashSdkLib.awsDashSdkLibStrings.PartialUpfront
    - awsDashSdkLib.awsDashSdkLibStrings.NoUpfront
    - java.lang.String
  */
  type PaymentOption = _PaymentOption | java.lang.String
  type PermissionGroup = awsDashSdkLib.awsDashSdkLibStrings.all | java.lang.String
  type PlacementGroupList = js.Array[PlacementGroup]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type PlacementGroupState = _PlacementGroupState | java.lang.String
  type PlacementGroupStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.cluster
    - awsDashSdkLib.awsDashSdkLibStrings.spread
    - awsDashSdkLib.awsDashSdkLibStrings.partition
    - java.lang.String
  */
  type PlacementStrategy = _PlacementStrategy | java.lang.String
  type PlatformValues = awsDashSdkLib.awsDashSdkLibStrings.Windows | java.lang.String
  type PoolMaxResults = scala.Double
  type PrefixListIdList = js.Array[PrefixListId]
  type PrefixListIdSet = js.Array[String]
  type PrefixListSet = js.Array[PrefixList]
  type PriceScheduleList = js.Array[PriceSchedule]
  type PriceScheduleSpecificationList = js.Array[PriceScheduleSpecification]
  type PricingDetailsList = js.Array[PricingDetail]
  type PrincipalIdFormatList = js.Array[PrincipalIdFormat]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.All
    - awsDashSdkLib.awsDashSdkLibStrings.Service
    - awsDashSdkLib.awsDashSdkLibStrings.OrganizationUnit
    - awsDashSdkLib.awsDashSdkLibStrings.Account
    - awsDashSdkLib.awsDashSdkLibStrings.User
    - awsDashSdkLib.awsDashSdkLibStrings.Role
    - java.lang.String
  */
  type PrincipalType = _PrincipalType | java.lang.String
  type PrivateIpAddressConfigSet = js.Array[ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList = js.Array[PrivateIpAddressSpecification]
  type PrivateIpAddressStringList = js.Array[String]
  type ProductCodeList = js.Array[ProductCode]
  type ProductCodeStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.devpay
    - awsDashSdkLib.awsDashSdkLibStrings.marketplace
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
    - awsDashSdkLib.awsDashSdkLibStrings.`Linux/UNIX`
    - awsDashSdkLib.awsDashSdkLibStrings.`Linux/UNIX (Amazon VPC)`
    - awsDashSdkLib.awsDashSdkLibStrings.Windows
    - awsDashSdkLib.awsDashSdkLibStrings.`Windows (Amazon VPC)`
    - java.lang.String
  */
  type RIProductDescription = _RIProductDescription | java.lang.String
  type ReasonCodesList = js.Array[ReportInstanceReasonCodes]
  type RecurringChargeFrequency = awsDashSdkLib.awsDashSdkLibStrings.Hourly | java.lang.String
  type RecurringChargesList = js.Array[RecurringCharge]
  type RegionList = js.Array[Region]
  type RegionNameStringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`instance-stuck-in-state`
    - awsDashSdkLib.awsDashSdkLibStrings.unresponsive
    - awsDashSdkLib.awsDashSdkLibStrings.`not-accepting-credentials`
    - awsDashSdkLib.awsDashSdkLibStrings.`password-not-available`
    - awsDashSdkLib.awsDashSdkLibStrings.`performance-network`
    - awsDashSdkLib.awsDashSdkLibStrings.`performance-instance-store`
    - awsDashSdkLib.awsDashSdkLibStrings.`performance-ebs-volume`
    - awsDashSdkLib.awsDashSdkLibStrings.`performance-other`
    - awsDashSdkLib.awsDashSdkLibStrings.other
    - java.lang.String
  */
  type ReportInstanceReasonCodes = _ReportInstanceReasonCodes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ok
    - awsDashSdkLib.awsDashSdkLibStrings.impaired
    - java.lang.String
  */
  type ReportStatusType = _ReportStatusType | java.lang.String
  type RequestHostIdList = js.Array[String]
  type RequestHostIdSet = js.Array[String]
  type ReservationList = js.Array[Reservation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`payment-pending`
    - awsDashSdkLib.awsDashSdkLibStrings.`payment-failed`
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.retired
    - java.lang.String
  */
  type ReservationState = _ReservationState | java.lang.String
  type ReservedInstanceIdSet = js.Array[String]
  type ReservedInstanceReservationValueSet = js.Array[ReservedInstanceReservationValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`payment-pending`
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.`payment-failed`
    - awsDashSdkLib.awsDashSdkLibStrings.retired
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
  type ResetFpgaImageAttributeName = awsDashSdkLib.awsDashSdkLibStrings.loadPermission | java.lang.String
  type ResetImageAttributeName = awsDashSdkLib.awsDashSdkLibStrings.launchPermission | java.lang.String
  type ResourceIdList = js.Array[String]
  type ResourceList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`client-vpn-endpoint`
    - awsDashSdkLib.awsDashSdkLibStrings.`customer-gateway`
    - awsDashSdkLib.awsDashSdkLibStrings.`dedicated-host`
    - awsDashSdkLib.awsDashSdkLibStrings.`dhcp-options`
    - awsDashSdkLib.awsDashSdkLibStrings.`elastic-ip`
    - awsDashSdkLib.awsDashSdkLibStrings.fleet
    - awsDashSdkLib.awsDashSdkLibStrings.`fpga-image`
    - awsDashSdkLib.awsDashSdkLibStrings.`host-reservation`
    - awsDashSdkLib.awsDashSdkLibStrings.image
    - awsDashSdkLib.awsDashSdkLibStrings.instance
    - awsDashSdkLib.awsDashSdkLibStrings.`internet-gateway`
    - awsDashSdkLib.awsDashSdkLibStrings.`launch-template`
    - awsDashSdkLib.awsDashSdkLibStrings.natgateway
    - awsDashSdkLib.awsDashSdkLibStrings.`network-acl`
    - awsDashSdkLib.awsDashSdkLibStrings.`network-interface`
    - awsDashSdkLib.awsDashSdkLibStrings.`reserved-instances`
    - awsDashSdkLib.awsDashSdkLibStrings.`route-table`
    - awsDashSdkLib.awsDashSdkLibStrings.`security-group`
    - awsDashSdkLib.awsDashSdkLibStrings.snapshot
    - awsDashSdkLib.awsDashSdkLibStrings.`spot-instances-request`
    - awsDashSdkLib.awsDashSdkLibStrings.subnet
    - awsDashSdkLib.awsDashSdkLibStrings.`transit-gateway`
    - awsDashSdkLib.awsDashSdkLibStrings.`transit-gateway-attachment`
    - awsDashSdkLib.awsDashSdkLibStrings.`transit-gateway-route-table`
    - awsDashSdkLib.awsDashSdkLibStrings.volume
    - awsDashSdkLib.awsDashSdkLibStrings.vpc
    - awsDashSdkLib.awsDashSdkLibStrings.`vpc-peering-connection`
    - awsDashSdkLib.awsDashSdkLibStrings.`vpn-connection`
    - awsDashSdkLib.awsDashSdkLibStrings.`vpn-gateway`
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResponseHostIdList = js.Array[String]
  type ResponseHostIdSet = js.Array[String]
  type RestorableByStringList = js.Array[String]
  type RouteList = js.Array[Route]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CreateRouteTable
    - awsDashSdkLib.awsDashSdkLibStrings.CreateRoute
    - awsDashSdkLib.awsDashSdkLibStrings.EnableVgwRoutePropagation
    - java.lang.String
  */
  type RouteOrigin = _RouteOrigin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.blackhole
    - java.lang.String
  */
  type RouteState = _RouteState | java.lang.String
  type RouteTableAssociationList = js.Array[RouteTableAssociation]
  type RouteTableList = js.Array[RouteTable]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.allow
    - awsDashSdkLib.awsDashSdkLibStrings.deny
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
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Available
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type ServiceState = _ServiceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Interface
    - awsDashSdkLib.awsDashSdkLibStrings.Gateway
    - java.lang.String
  */
  type ServiceType = _ServiceType | java.lang.String
  type ServiceTypeDetailSet = js.Array[ServiceTypeDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.stop
    - awsDashSdkLib.awsDashSdkLibStrings.terminate
    - java.lang.String
  */
  type ShutdownBehavior = _ShutdownBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.productCodes
    - awsDashSdkLib.awsDashSdkLibStrings.createVolumePermission
    - java.lang.String
  */
  type SnapshotAttributeName = _SnapshotAttributeName | java.lang.String
  type SnapshotDetailList = js.Array[SnapshotDetail]
  type SnapshotIdStringList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotSet = js.Array[SnapshotInfo]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.completed
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - java.lang.String
  */
  type SnapshotState = _SnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`lowest-price`
    - awsDashSdkLib.awsDashSdkLibStrings.diversified
    - java.lang.String
  */
  type SpotAllocationStrategy = _SpotAllocationStrategy | java.lang.String
  type SpotFleetRequestConfigSet = js.Array[SpotFleetRequestConfig]
  type SpotFleetTagSpecificationList = js.Array[SpotFleetTagSpecification]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.hibernate
    - awsDashSdkLib.awsDashSdkLibStrings.stop
    - awsDashSdkLib.awsDashSdkLibStrings.terminate
    - java.lang.String
  */
  type SpotInstanceInterruptionBehavior = _SpotInstanceInterruptionBehavior | java.lang.String
  type SpotInstanceRequestIdList = js.Array[String]
  type SpotInstanceRequestList = js.Array[SpotInstanceRequest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.open
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.closed
    - awsDashSdkLib.awsDashSdkLibStrings.cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type SpotInstanceState = _SpotInstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`one-time`
    - awsDashSdkLib.awsDashSdkLibStrings.persistent
    - java.lang.String
  */
  type SpotInstanceType = _SpotInstanceType | java.lang.String
  type SpotPriceHistoryList = js.Array[SpotPrice]
  type StaleIpPermissionSet = js.Array[StaleIpPermission]
  type StaleSecurityGroupSet = js.Array[StaleSecurityGroup]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PendingAcceptance
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Available
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Rejected
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Expired
    - java.lang.String
  */
  type State = _State | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MoveInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.InVpc
    - awsDashSdkLib.awsDashSdkLibStrings.InClassic
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type StatusName = awsDashSdkLib.awsDashSdkLibStrings.reachability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.passed
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.`insufficient-data`
    - awsDashSdkLib.awsDashSdkLibStrings.initializing
    - java.lang.String
  */
  type StatusType = _StatusType | java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.associating
    - awsDashSdkLib.awsDashSdkLibStrings.associated
    - awsDashSdkLib.awsDashSdkLibStrings.disassociating
    - awsDashSdkLib.awsDashSdkLibStrings.disassociated
    - awsDashSdkLib.awsDashSdkLibStrings.failing
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type SubnetCidrBlockStateCode = _SubnetCidrBlockStateCode | java.lang.String
  type SubnetIdStringList = js.Array[String]
  type SubnetIpv6CidrBlockAssociationSet = js.Array[SubnetIpv6CidrBlockAssociation]
  type SubnetList = js.Array[Subnet]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - java.lang.String
  */
  type SubnetState = _SubnetState | java.lang.String
  type SuccessfulInstanceCreditSpecificationSet = js.Array[SuccessfulInstanceCreditSpecificationItem]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ok
    - awsDashSdkLib.awsDashSdkLibStrings.impaired
    - awsDashSdkLib.awsDashSdkLibStrings.`insufficient-data`
    - awsDashSdkLib.awsDashSdkLibStrings.`not-applicable`
    - awsDashSdkLib.awsDashSdkLibStrings.initializing
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
    - awsDashSdkLib.awsDashSdkLibStrings.UP
    - awsDashSdkLib.awsDashSdkLibStrings.DOWN
    - java.lang.String
  */
  type TelemetryStatus = _TelemetryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.default
    - awsDashSdkLib.awsDashSdkLibStrings.dedicated
    - awsDashSdkLib.awsDashSdkLibStrings.host
    - java.lang.String
  */
  type Tenancy = _Tenancy | java.lang.String
  type TerminateConnectionStatusSet = js.Array[TerminateConnectionStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCEPT
    - awsDashSdkLib.awsDashSdkLibStrings.REJECT
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type TrafficType = _TrafficType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.associating
    - awsDashSdkLib.awsDashSdkLibStrings.associated
    - awsDashSdkLib.awsDashSdkLibStrings.disassociating
    - awsDashSdkLib.awsDashSdkLibStrings.disassociated
    - java.lang.String
  */
  type TransitGatewayAssociationState = _TransitGatewayAssociationState | java.lang.String
  type TransitGatewayAttachmentIdStringList = js.Array[String]
  type TransitGatewayAttachmentList = js.Array[TransitGatewayAttachment]
  type TransitGatewayAttachmentPropagationList = js.Array[TransitGatewayAttachmentPropagation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.vpc
    - awsDashSdkLib.awsDashSdkLibStrings.vpn
    - awsDashSdkLib.awsDashSdkLibStrings.`direct-connect-gateway`
    - java.lang.String
  */
  type TransitGatewayAttachmentResourceType = _TransitGatewayAttachmentResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pendingAcceptance
    - awsDashSdkLib.awsDashSdkLibStrings.rollingBack
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.modifying
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.rejected
    - awsDashSdkLib.awsDashSdkLibStrings.rejecting
    - awsDashSdkLib.awsDashSdkLibStrings.failing
    - java.lang.String
  */
  type TransitGatewayAttachmentState = _TransitGatewayAttachmentState | java.lang.String
  type TransitGatewayIdStringList = js.Array[String]
  type TransitGatewayList = js.Array[TransitGateway]
  type TransitGatewayMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enabling
    - awsDashSdkLib.awsDashSdkLibStrings.enabled
    - awsDashSdkLib.awsDashSdkLibStrings.disabling
    - awsDashSdkLib.awsDashSdkLibStrings.disabled
    - java.lang.String
  */
  type TransitGatewayPropagationState = _TransitGatewayPropagationState | java.lang.String
  type TransitGatewayRouteAttachmentList = js.Array[TransitGatewayRouteAttachment]
  type TransitGatewayRouteList = js.Array[TransitGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.blackhole
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type TransitGatewayRouteState = _TransitGatewayRouteState | java.lang.String
  type TransitGatewayRouteTableAssociationList = js.Array[TransitGatewayRouteTableAssociation]
  type TransitGatewayRouteTableIdStringList = js.Array[String]
  type TransitGatewayRouteTableList = js.Array[TransitGatewayRouteTable]
  type TransitGatewayRouteTablePropagationList = js.Array[TransitGatewayRouteTablePropagation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type TransitGatewayRouteTableState = _TransitGatewayRouteTableState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.static
    - awsDashSdkLib.awsDashSdkLibStrings.propagated
    - java.lang.String
  */
  type TransitGatewayRouteType = _TransitGatewayRouteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.modifying
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type TransitGatewayState = _TransitGatewayState | java.lang.String
  type TransitGatewayVpcAttachmentList = js.Array[TransitGatewayVpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.tcp
    - awsDashSdkLib.awsDashSdkLibStrings.udp
    - java.lang.String
  */
  type TransportProtocol = _TransportProtocol | java.lang.String
  type TunnelOptionsList = js.Array[VpnTunnelOptionsSpecification]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidInstanceIDDOTMalformed
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidInstanceIDDOTNotFound
    - awsDashSdkLib.awsDashSdkLibStrings.IncorrectInstanceState
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceCreditSpecificationDOTNotSupported
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
    - awsDashSdkLib.awsDashSdkLibStrings.hvm
    - awsDashSdkLib.awsDashSdkLibStrings.paravirtual
    - java.lang.String
  */
  type VirtualizationType = _VirtualizationType | java.lang.String
  type VolumeAttachmentList = js.Array[VolumeAttachment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.attaching
    - awsDashSdkLib.awsDashSdkLibStrings.attached
    - awsDashSdkLib.awsDashSdkLibStrings.detaching
    - awsDashSdkLib.awsDashSdkLibStrings.detached
    - awsDashSdkLib.awsDashSdkLibStrings.busy
    - java.lang.String
  */
  type VolumeAttachmentState = _VolumeAttachmentState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.autoEnableIO
    - awsDashSdkLib.awsDashSdkLibStrings.productCodes
    - java.lang.String
  */
  type VolumeAttributeName = _VolumeAttributeName | java.lang.String
  type VolumeIdStringList = js.Array[String]
  type VolumeList = js.Array[Volume]
  type VolumeModificationList = js.Array[VolumeModification]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.modifying
    - awsDashSdkLib.awsDashSdkLibStrings.optimizing
    - awsDashSdkLib.awsDashSdkLibStrings.completed
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type VolumeModificationState = _VolumeModificationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.creating
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.`in-use`
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - java.lang.String
  */
  type VolumeState = _VolumeState | java.lang.String
  type VolumeStatusActionsList = js.Array[VolumeStatusAction]
  type VolumeStatusDetailsList = js.Array[VolumeStatusDetails]
  type VolumeStatusEventsList = js.Array[VolumeStatusEvent]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ok
    - awsDashSdkLib.awsDashSdkLibStrings.impaired
    - awsDashSdkLib.awsDashSdkLibStrings.`insufficient-data`
    - java.lang.String
  */
  type VolumeStatusInfoStatus = _VolumeStatusInfoStatus | java.lang.String
  type VolumeStatusList = js.Array[VolumeStatusItem]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`io-enabled`
    - awsDashSdkLib.awsDashSdkLibStrings.`io-performance`
    - java.lang.String
  */
  type VolumeStatusName = _VolumeStatusName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.standard
    - awsDashSdkLib.awsDashSdkLibStrings.io1
    - awsDashSdkLib.awsDashSdkLibStrings.gp2
    - awsDashSdkLib.awsDashSdkLibStrings.sc1
    - awsDashSdkLib.awsDashSdkLibStrings.st1
    - java.lang.String
  */
  type VolumeType = _VolumeType | java.lang.String
  type VpcAttachmentList = js.Array[VpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enableDnsSupport
    - awsDashSdkLib.awsDashSdkLibStrings.enableDnsHostnames
    - java.lang.String
  */
  type VpcAttributeName = _VpcAttributeName | java.lang.String
  type VpcCidrBlockAssociationSet = js.Array[VpcCidrBlockAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.associating
    - awsDashSdkLib.awsDashSdkLibStrings.associated
    - awsDashSdkLib.awsDashSdkLibStrings.disassociating
    - awsDashSdkLib.awsDashSdkLibStrings.disassociated
    - awsDashSdkLib.awsDashSdkLibStrings.failing
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type VpcCidrBlockStateCode = _VpcCidrBlockStateCode | java.lang.String
  type VpcClassicLinkIdList = js.Array[String]
  type VpcClassicLinkList = js.Array[VpcClassicLink]
  type VpcEndpointConnectionSet = js.Array[VpcEndpointConnection]
  type VpcEndpointSet = js.Array[VpcEndpoint]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Interface
    - awsDashSdkLib.awsDashSdkLibStrings.Gateway
    - java.lang.String
  */
  type VpcEndpointType = _VpcEndpointType | java.lang.String
  type VpcIdStringList = js.Array[String]
  type VpcIpv6CidrBlockAssociationSet = js.Array[VpcIpv6CidrBlockAssociation]
  type VpcList = js.Array[Vpc]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`initiating-request`
    - awsDashSdkLib.awsDashSdkLibStrings.`pending-acceptance`
    - awsDashSdkLib.awsDashSdkLibStrings.active
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - awsDashSdkLib.awsDashSdkLibStrings.rejected
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - awsDashSdkLib.awsDashSdkLibStrings.expired
    - awsDashSdkLib.awsDashSdkLibStrings.provisioning
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - java.lang.String
  */
  type VpcPeeringConnectionStateReasonCode = _VpcPeeringConnectionStateReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - java.lang.String
  */
  type VpcState = _VpcState | java.lang.String
  type VpcTenancy = awsDashSdkLib.awsDashSdkLibStrings.default | java.lang.String
  type VpnConnectionIdStringList = js.Array[String]
  type VpnConnectionList = js.Array[VpnConnection]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.enable
    - awsDashSdkLib.awsDashSdkLibStrings.disable
    - java.lang.String
  */
  type VpnEcmpSupportValue = _VpnEcmpSupportValue | java.lang.String
  type VpnGatewayIdStringList = js.Array[String]
  type VpnGatewayList = js.Array[VpnGateway]
  type VpnProtocol = awsDashSdkLib.awsDashSdkLibStrings.openvpn | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.available
    - awsDashSdkLib.awsDashSdkLibStrings.deleting
    - awsDashSdkLib.awsDashSdkLibStrings.deleted
    - java.lang.String
  */
  type VpnState = _VpnState | java.lang.String
  type VpnStaticRouteList = js.Array[VpnStaticRoute]
  type VpnStaticRouteSource = awsDashSdkLib.awsDashSdkLibStrings.Static | java.lang.String
  type ZoneIdStringList = js.Array[String]
  type ZoneNameStringList = js.Array[String]
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-06-15`
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-10-15`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-02-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-05-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-06-15`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-09-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-10-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-03-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-04-15`
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-10-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-04-01`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-09-15`
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-11-15`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`Availability Zone`
    - awsDashSdkLib.awsDashSdkLibStrings.Region
    - java.lang.String
  */
  type scope = _scope | java.lang.String
}
