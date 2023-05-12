package typings.awsSdk.clientsEc2Mod

import typings.awsSdk.awsSdkStrings.ATTACHED
import typings.awsSdk.awsSdkStrings.Hourly_
import typings.awsSdk.awsSdkStrings.ServiceOwner
import typings.awsSdk.awsSdkStrings.Static_
import typings.awsSdk.awsSdkStrings.Topic
import typings.awsSdk.awsSdkStrings.USD
import typings.awsSdk.awsSdkStrings.Windows_
import typings.awsSdk.awsSdkStrings.`aggregate-latency`
import typings.awsSdk.awsSdkStrings.`amazon-dns`
import typings.awsSdk.awsSdkStrings.`amd-sev-snp`
import typings.awsSdk.awsSdkStrings.`domain-name`
import typings.awsSdk.awsSdkStrings.`use-capacity-reservations-first`
import typings.awsSdk.awsSdkStrings.all__
import typings.awsSdk.awsSdkStrings.archive__
import typings.awsSdk.awsSdkStrings.default__
import typings.awsSdk.awsSdkStrings.ec2_
import typings.awsSdk.awsSdkStrings.gre_
import typings.awsSdk.awsSdkStrings.ipsecDot1
import typings.awsSdk.awsSdkStrings.launchPermission
import typings.awsSdk.awsSdkStrings.loadPermission
import typings.awsSdk.awsSdkStrings.open__
import typings.awsSdk.awsSdkStrings.openvpn
import typings.awsSdk.awsSdkStrings.ova
import typings.awsSdk.awsSdkStrings.p50
import typings.awsSdk.awsSdkStrings.reachability
import typings.awsSdk.awsSdkStrings.snapshot_
import typings.awsSdk.awsSdkStrings.spot_
import typings.awsSdk.awsSdkStrings.used
import typings.awsSdk.awsSdkStrings.v2Dot0
import typings.awsSdk.awsSdkStrings.volume_
import typings.awsSdk.awsSdkStrings.vpc__
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.nvidia_
  - typings.awsSdk.awsSdkStrings.amd
  - typings.awsSdk.awsSdkStrings.`amazon-web-services`
  - typings.awsSdk.awsSdkStrings.xilinx
  - java.lang.String
*/
type AcceleratorManufacturer = _AcceleratorManufacturer | java.lang.String

type AcceleratorManufacturerSet = js.Array[AcceleratorManufacturer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.a100
  - typings.awsSdk.awsSdkStrings.v100
  - typings.awsSdk.awsSdkStrings.k80
  - typings.awsSdk.awsSdkStrings.t4
  - typings.awsSdk.awsSdkStrings.m60
  - typings.awsSdk.awsSdkStrings.`radeon-pro-v520`
  - typings.awsSdk.awsSdkStrings.vu9p
  - typings.awsSdk.awsSdkStrings.inferentia
  - typings.awsSdk.awsSdkStrings.k520
  - java.lang.String
*/
type AcceleratorName = _AcceleratorName | java.lang.String

type AcceleratorNameSet = js.Array[AcceleratorName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.gpu_
  - typings.awsSdk.awsSdkStrings.fpga
  - typings.awsSdk.awsSdkStrings.inference_
  - java.lang.String
*/
type AcceleratorType = _AcceleratorType | java.lang.String

type AcceleratorTypeSet = js.Array[AcceleratorType]

type AccessScopeAnalysisFindingList = js.Array[AccessScopeAnalysisFinding]

type AccessScopePathList = js.Array[AccessScopePath]

type AccessScopePathListRequest = js.Array[AccessScopePathRequest]

type AccountAttributeList = js.Array[AccountAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`supported-platforms`
  - typings.awsSdk.awsSdkStrings.`default-vpc`
  - java.lang.String
*/
type AccountAttributeName = _AccountAttributeName | java.lang.String

type AccountAttributeNameStringList = js.Array[AccountAttributeName]

type AccountAttributeValueList = js.Array[AccountAttributeValue]

type ActiveInstanceSet = js.Array[ActiveInstance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.pending_fulfillment
  - typings.awsSdk.awsSdkStrings.pending_termination
  - typings.awsSdk.awsSdkStrings.fulfilled__
  - java.lang.String
*/
type ActivityStatus = _ActivityStatus | java.lang.String

type AddIpamOperatingRegionSet = js.Array[AddIpamOperatingRegion]

type AddPrefixListEntries = js.Array[AddPrefixListEntry]

type AddedPrincipalSet = js.Array[AddedPrincipal]

type AdditionalDetailList = js.Array[AdditionalDetail]

type AddressAttributeName = `domain-name` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ipv4__
  - typings.awsSdk.awsSdkStrings.ipv6__
  - java.lang.String
*/
type AddressFamily = _AddressFamily | java.lang.String

type AddressList = js.Array[Address]

type AddressMaxResults = scala.Double

type AddressSet = js.Array[AddressAttribute]

type AddressTransferList = js.Array[AddressTransfer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.accepted__
  - java.lang.String
*/
type AddressTransferStatus = _AddressTransferStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.default__
  - typings.awsSdk.awsSdkStrings.host__
  - java.lang.String
*/
type Affinity = _Affinity | java.lang.String

type AllocationId = java.lang.String

type AllocationIdList = js.Array[AllocationId]

type AllocationIds = js.Array[AllocationId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.`under-assessment`
  - typings.awsSdk.awsSdkStrings.`permanent-failure`
  - typings.awsSdk.awsSdkStrings.released
  - typings.awsSdk.awsSdkStrings.`released-permanent-failure`
  - typings.awsSdk.awsSdkStrings.pending__
  - java.lang.String
*/
type AllocationState = _AllocationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.lowestPrice
  - typings.awsSdk.awsSdkStrings.diversified
  - typings.awsSdk.awsSdkStrings.capacityOptimized
  - typings.awsSdk.awsSdkStrings.capacityOptimizedPrioritized
  - typings.awsSdk.awsSdkStrings.priceCapacityOptimized
  - java.lang.String
*/
type AllocationStrategy = _AllocationStrategy | java.lang.String

type AllocationType = used | java.lang.String

type AllowedInstanceType = java.lang.String

type AllowedInstanceTypeSet = js.Array[AllowedInstanceType]

type AllowedPrincipalSet = js.Array[AllowedPrincipal]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.on__
  - typings.awsSdk.awsSdkStrings.off__
  - java.lang.String
*/
type AllowsMultipleInstanceTypes = _AllowsMultipleInstanceTypes | java.lang.String

type AlternatePathHintList = js.Array[AlternatePathHint]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.disabled__
  - java.lang.String
*/
type AmdSevSnpSpecification = _AmdSevSnpSpecification | java.lang.String

type AnalysisComponentList = js.Array[AnalysisComponent]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.running__
  - typings.awsSdk.awsSdkStrings.succeeded__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type AnalysisStatus = _AnalysisStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type ApplianceModeSupportValue = _ApplianceModeSupportValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.i386
  - typings.awsSdk.awsSdkStrings.x86_64_
  - typings.awsSdk.awsSdkStrings.arm64_
  - typings.awsSdk.awsSdkStrings.x86_64_mac
  - typings.awsSdk.awsSdkStrings.arm64_mac
  - java.lang.String
*/
type ArchitectureType = _ArchitectureType | java.lang.String

type ArchitectureTypeList = js.Array[ArchitectureType]

type ArchitectureTypeSet = js.Array[ArchitectureType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.i386
  - typings.awsSdk.awsSdkStrings.x86_64_
  - typings.awsSdk.awsSdkStrings.arm64_
  - typings.awsSdk.awsSdkStrings.x86_64_mac
  - typings.awsSdk.awsSdkStrings.arm64_mac
  - java.lang.String
*/
type ArchitectureValues = _ArchitectureValues | java.lang.String

type ArnList = js.Array[ResourceArn]

type AssignedPrivateIpAddressList = js.Array[AssignedPrivateIpAddress]

type AssociatedNetworkType = vpc__ | java.lang.String

type AssociatedRolesList = js.Array[AssociatedRole]

type AssociatedTargetNetworkSet = js.Array[AssociatedTargetNetwork]

type AssociationIdList = js.Array[IamInstanceProfileAssociationId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.`association-failed`
  - typings.awsSdk.awsSdkStrings.disassociating__
  - typings.awsSdk.awsSdkStrings.disassociated__
  - java.lang.String
*/
type AssociationStatusCode = _AssociationStatusCode | java.lang.String

type AthenaIntegrationsSet = js.Array[AthenaIntegration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.attaching_
  - typings.awsSdk.awsSdkStrings.attached_
  - typings.awsSdk.awsSdkStrings.detaching__
  - typings.awsSdk.awsSdkStrings.detached__
  - java.lang.String
*/
type AttachmentStatus = _AttachmentStatus | java.lang.String

type AuthorizationRuleSet = js.Array[AuthorizationRule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type AutoAcceptSharedAssociationsValue = _AutoAcceptSharedAssociationsValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type AutoAcceptSharedAttachmentsValue = _AutoAcceptSharedAttachmentsValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.on__
  - typings.awsSdk.awsSdkStrings.off__
  - java.lang.String
*/
type AutoPlacement = _AutoPlacement | java.lang.String

type AutoRecoveryFlag = scala.Boolean

type AvailabilityZoneList = js.Array[AvailabilityZone]

type AvailabilityZoneMessageList = js.Array[AvailabilityZoneMessage]

type AvailabilityZoneName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`opt-in-not-required`
  - typings.awsSdk.awsSdkStrings.`opted-in`
  - typings.awsSdk.awsSdkStrings.`not-opted-in`
  - java.lang.String
*/
type AvailabilityZoneOptInStatus = _AvailabilityZoneOptInStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.information
  - typings.awsSdk.awsSdkStrings.impaired__
  - typings.awsSdk.awsSdkStrings.unavailable___
  - java.lang.String
*/
type AvailabilityZoneState = _AvailabilityZoneState | java.lang.String

type AvailabilityZoneStringList = js.Array[String]

type AvailableInstanceCapacityList = js.Array[InstanceCapacity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.included
  - typings.awsSdk.awsSdkStrings.required__
  - typings.awsSdk.awsSdkStrings.excluded
  - java.lang.String
*/
type BareMetal = _BareMetal | java.lang.String

type BareMetalFlag = scala.Boolean

type BaselineBandwidthInMbps = scala.Double

type BaselineIops = scala.Double

type BaselineThroughputInMBps = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.submitted__
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.cancelled_running
  - typings.awsSdk.awsSdkStrings.cancelled_terminating
  - typings.awsSdk.awsSdkStrings.modifying_
  - java.lang.String
*/
type BatchState = _BatchState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.up_
  - typings.awsSdk.awsSdkStrings.down_
  - java.lang.String
*/
type BgpStatus = _BgpStatus | java.lang.String

type BillingProductList = js.Array[String]

type BlockDeviceMappingList = js.Array[BlockDeviceMapping]

type BlockDeviceMappingRequestList = js.Array[BlockDeviceMapping]

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`legacy-bios`
  - typings.awsSdk.awsSdkStrings.uefi_
  - java.lang.String
*/
type BootModeType = _BootModeType | java.lang.String

type BootModeTypeList = js.Array[BootModeType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`legacy-bios`
  - typings.awsSdk.awsSdkStrings.uefi_
  - typings.awsSdk.awsSdkStrings.`uefi-preferred`
  - java.lang.String
*/
type BootModeValues = _BootModeValues | java.lang.String

type BoxedDouble = scala.Double

type BundleId = java.lang.String

type BundleIdStringList = js.Array[BundleId]

type BundleTaskList = js.Array[BundleTask]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.`waiting-for-shutdown`
  - typings.awsSdk.awsSdkStrings.bundling
  - typings.awsSdk.awsSdkStrings.storing
  - typings.awsSdk.awsSdkStrings.cancelling__
  - typings.awsSdk.awsSdkStrings.complete__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type BundleTaskState = _BundleTaskState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.included
  - typings.awsSdk.awsSdkStrings.required__
  - typings.awsSdk.awsSdkStrings.excluded
  - java.lang.String
*/
type BurstablePerformance = _BurstablePerformance | java.lang.String

type BurstablePerformanceFlag = scala.Boolean

type ByoipCidrSet = js.Array[ByoipCidr]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.advertised
  - typings.awsSdk.awsSdkStrings.deprovisioned_
  - typings.awsSdk.awsSdkStrings.`failed-deprovision`
  - typings.awsSdk.awsSdkStrings.`failed-provision`
  - typings.awsSdk.awsSdkStrings.`pending-deprovision`
  - typings.awsSdk.awsSdkStrings.`pending-provision`
  - typings.awsSdk.awsSdkStrings.provisioned__
  - typings.awsSdk.awsSdkStrings.`provisioned-not-publicly-advertisable`
  - java.lang.String
*/
type ByoipCidrState = _ByoipCidrState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.fleetRequestIdDoesNotExist
  - typings.awsSdk.awsSdkStrings.fleetRequestIdMalformed
  - typings.awsSdk.awsSdkStrings.fleetRequestNotInCancellableState
  - typings.awsSdk.awsSdkStrings.unexpectedError
  - java.lang.String
*/
type CancelBatchErrorCode = _CancelBatchErrorCode | java.lang.String

type CancelCapacityReservationFleetErrorCode = java.lang.String

type CancelCapacityReservationFleetErrorMessage = java.lang.String

type CancelSpotFleetRequestsErrorSet = js.Array[CancelSpotFleetRequestsErrorItem]

type CancelSpotFleetRequestsSuccessSet = js.Array[CancelSpotFleetRequestsSuccessItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.open__
  - typings.awsSdk.awsSdkStrings.closed__
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.completed__
  - java.lang.String
*/
type CancelSpotInstanceRequestState = _CancelSpotInstanceRequestState | java.lang.String

type CancelledSpotInstanceRequestList = js.Array[CancelledSpotInstanceRequest]

type CapacityAllocations = js.Array[CapacityAllocation]

type CapacityReservationFleetCancellationStateSet = js.Array[CapacityReservationFleetCancellationState]

type CapacityReservationFleetId = java.lang.String

type CapacityReservationFleetIdSet = js.Array[CapacityReservationFleetId]

type CapacityReservationFleetSet = js.Array[CapacityReservationFleet]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.submitted__
  - typings.awsSdk.awsSdkStrings.modifying_
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.partially_fulfilled
  - typings.awsSdk.awsSdkStrings.expiring_
  - typings.awsSdk.awsSdkStrings.expired__
  - typings.awsSdk.awsSdkStrings.cancelling__
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type CapacityReservationFleetState = _CapacityReservationFleetState | java.lang.String

type CapacityReservationGroupSet = js.Array[CapacityReservationGroup]

type CapacityReservationId = java.lang.String

type CapacityReservationIdSet = js.Array[CapacityReservationId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LinuxSlashUNIX
  - typings.awsSdk.awsSdkStrings.`Red Hat Enterprise Linux`
  - typings.awsSdk.awsSdkStrings.`SUSE Linux`
  - typings.awsSdk.awsSdkStrings.Windows_
  - typings.awsSdk.awsSdkStrings.`Windows with SQL Server`
  - typings.awsSdk.awsSdkStrings.`Windows with SQL Server Enterprise`
  - typings.awsSdk.awsSdkStrings.`Windows with SQL Server Standard`
  - typings.awsSdk.awsSdkStrings.`Windows with SQL Server Web`
  - typings.awsSdk.awsSdkStrings.`Linux with SQL Server Standard`
  - typings.awsSdk.awsSdkStrings.`Linux with SQL Server Web`
  - typings.awsSdk.awsSdkStrings.`Linux with SQL Server Enterprise`
  - typings.awsSdk.awsSdkStrings.`RHEL with SQL Server Standard`
  - typings.awsSdk.awsSdkStrings.`RHEL with SQL Server Enterprise`
  - typings.awsSdk.awsSdkStrings.`RHEL with SQL Server Web`
  - typings.awsSdk.awsSdkStrings.`RHEL with HA`
  - typings.awsSdk.awsSdkStrings.`RHEL with HA and SQL Server Standard`
  - typings.awsSdk.awsSdkStrings.`RHEL with HA and SQL Server Enterprise`
  - java.lang.String
*/
type CapacityReservationInstancePlatform = _CapacityReservationInstancePlatform | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.open__
  - typings.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type CapacityReservationPreference = _CapacityReservationPreference | java.lang.String

type CapacityReservationSet = js.Array[CapacityReservation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.expired__
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type CapacityReservationState = _CapacityReservationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.default__
  - typings.awsSdk.awsSdkStrings.dedicated_
  - java.lang.String
*/
type CapacityReservationTenancy = _CapacityReservationTenancy | java.lang.String

type CarrierGatewayId = java.lang.String

type CarrierGatewayIdSet = js.Array[CarrierGatewayId]

type CarrierGatewayMaxResults = scala.Double

type CarrierGatewaySet = js.Array[CarrierGateway]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type CarrierGatewayState = _CarrierGatewayState | java.lang.String

type CertificateArn = java.lang.String

type CertificateId = java.lang.String

type CidrBlockSet = js.Array[CidrBlock]

type ClassicLinkDnsSupportList = js.Array[ClassicLinkDnsSupport]

type ClassicLinkInstanceList = js.Array[ClassicLinkInstance]

type ClassicLoadBalancers = js.Array[ClassicLoadBalancer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.active__
  - java.lang.String
*/
type ClientCertificateRevocationListStatusCode = _ClientCertificateRevocationListStatusCode | java.lang.String

type ClientSecretType = java.lang.String

type ClientVpnAssociationId = java.lang.String

type ClientVpnAuthenticationList = js.Array[ClientVpnAuthentication]

type ClientVpnAuthenticationRequestList = js.Array[ClientVpnAuthenticationRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`certificate-authentication`
  - typings.awsSdk.awsSdkStrings.`directory-service-authentication`
  - typings.awsSdk.awsSdkStrings.`federated-authentication`
  - java.lang.String
*/
type ClientVpnAuthenticationType = _ClientVpnAuthenticationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.authorizing_
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.revoking_
  - java.lang.String
*/
type ClientVpnAuthorizationRuleStatusCode = _ClientVpnAuthorizationRuleStatusCode | java.lang.String

type ClientVpnConnectionSet = js.Array[ClientVpnConnection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.`failed-to-terminate`
  - typings.awsSdk.awsSdkStrings.terminating__
  - typings.awsSdk.awsSdkStrings.terminated__
  - java.lang.String
*/
type ClientVpnConnectionStatusCode = _ClientVpnConnectionStatusCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.applying_
  - typings.awsSdk.awsSdkStrings.applied_
  - java.lang.String
*/
type ClientVpnEndpointAttributeStatusCode = _ClientVpnEndpointAttributeStatusCode | java.lang.String

type ClientVpnEndpointId = java.lang.String

type ClientVpnEndpointIdList = js.Array[ClientVpnEndpointId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`pending-associate`
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type ClientVpnEndpointStatusCode = _ClientVpnEndpointStatusCode | java.lang.String

type ClientVpnRouteSet = js.Array[ClientVpnRoute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.creating__
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.deleting__
  - java.lang.String
*/
type ClientVpnRouteStatusCode = _ClientVpnRouteStatusCode | java.lang.String

type ClientVpnSecurityGroupIdSet = js.Array[SecurityGroupId]

type CloudWatchLogGroupArn = java.lang.String

type CoipAddressUsageSet = js.Array[CoipAddressUsage]

type CoipPoolId = java.lang.String

type CoipPoolIdSet = js.Array[Ipv4PoolCoipId]

type CoipPoolMaxResults = scala.Double

type CoipPoolSet = js.Array[CoipPool]

type ComponentAccount = java.lang.String

type ComponentRegion = java.lang.String

type ConnectionNotificationId = java.lang.String

type ConnectionNotificationIdsList = js.Array[ConnectionNotificationId]

type ConnectionNotificationSet = js.Array[ConnectionNotification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Enabled_
  - typings.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type ConnectionNotificationState = _ConnectionNotificationState | java.lang.String

type ConnectionNotificationType = Topic | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.private__
  - typings.awsSdk.awsSdkStrings.public__
  - java.lang.String
*/
type ConnectivityType = _ConnectivityType | java.lang.String

type ContainerFormat = ova | java.lang.String

type ConversionIdStringList = js.Array[ConversionTaskId]

type ConversionTaskId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.cancelling__
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.completed__
  - java.lang.String
*/
type ConversionTaskState = _ConversionTaskState | java.lang.String

type CopySnapshotRequestPSU = java.lang.String

type CopyTagsFromSource = volume_ | java.lang.String

type CoreCount = scala.Double

type CoreCountList = js.Array[CoreCount]

type CoreNetworkArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.intel
  - typings.awsSdk.awsSdkStrings.amd
  - typings.awsSdk.awsSdkStrings.`amazon-web-services`
  - java.lang.String
*/
type CpuManufacturer = _CpuManufacturer | java.lang.String

type CpuManufacturerSet = js.Array[CpuManufacturer]

type CreateFleetErrorsSet = js.Array[CreateFleetError]

type CreateFleetInstancesSet = js.Array[CreateFleetInstance]

type CreateVerifiedAccessEndpointSubnetIdList = js.Array[SubnetId]

type CreateVolumePermissionList = js.Array[CreateVolumePermission]

type CurrencyCodeValues = USD | java.lang.String

type CurrentGenerationFlag = scala.Boolean

type CustomerGatewayId = java.lang.String

type CustomerGatewayIdStringList = js.Array[CustomerGatewayId]

type CustomerGatewayList = js.Array[CustomerGateway]

type DITMaxResults = scala.Double

type DITOMaxResults = scala.Double

type DataQueries = js.Array[DataQuery]

type DataResponses = js.Array[DataResponse]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type DatafeedSubscriptionState = _DatafeedSubscriptionState | java.lang.String

type DateTime = js.Date

type DedicatedHostFlag = scala.Boolean

type DedicatedHostId = java.lang.String

type DedicatedHostIdList = js.Array[DedicatedHostId]

type DefaultNetworkCardIndex = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type DefaultRouteTableAssociationValue = _DefaultRouteTableAssociationValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type DefaultRouteTablePropagationValue = _DefaultRouteTablePropagationValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.spot_
  - typings.awsSdk.awsSdkStrings.`on-demand`
  - java.lang.String
*/
type DefaultTargetCapacityType = _DefaultTargetCapacityType | java.lang.String

type DefaultingDhcpOptionsId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.fleetIdDoesNotExist
  - typings.awsSdk.awsSdkStrings.fleetIdMalformed
  - typings.awsSdk.awsSdkStrings.fleetNotInDeletableState
  - typings.awsSdk.awsSdkStrings.unexpectedError
  - java.lang.String
*/
type DeleteFleetErrorCode = _DeleteFleetErrorCode | java.lang.String

type DeleteFleetErrorSet = js.Array[DeleteFleetErrorItem]

type DeleteFleetSuccessSet = js.Array[DeleteFleetSuccessItem]

type DeleteLaunchTemplateVersionsResponseErrorSet = js.Array[DeleteLaunchTemplateVersionsResponseErrorItem]

type DeleteLaunchTemplateVersionsResponseSuccessSet = js.Array[DeleteLaunchTemplateVersionsResponseSuccessItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`reserved-instances-id-invalid`
  - typings.awsSdk.awsSdkStrings.`reserved-instances-not-in-queued-state`
  - typings.awsSdk.awsSdkStrings.`unexpected-error`
  - java.lang.String
*/
type DeleteQueuedReservedInstancesErrorCode = _DeleteQueuedReservedInstancesErrorCode | java.lang.String

type DeleteQueuedReservedInstancesIdList = js.Array[ReservationId]

type DeprovisionedAddressSet = js.Array[String]

type DescribeAddressTransfersMaxResults = scala.Double

type DescribeByoipCidrsMaxResults = scala.Double

type DescribeCapacityReservationFleetsMaxResults = scala.Double

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

type DescribeFastLaunchImagesRequestMaxResults = scala.Double

type DescribeFastLaunchImagesSuccessSet = js.Array[DescribeFastLaunchImagesSuccessItem]

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

type DescribeReplaceRootVolumeTasksMaxResults = scala.Double

type DescribeRouteTablesMaxResults = scala.Double

type DescribeScheduledInstanceAvailabilityMaxResults = scala.Double

type DescribeSecurityGroupRulesMaxResults = scala.Double

type DescribeSecurityGroupsMaxResults = scala.Double

type DescribeSnapshotTierStatusMaxResults = scala.Double

type DescribeSpotFleetInstancesMaxResults = scala.Double

type DescribeSpotFleetRequestHistoryMaxResults = scala.Double

type DescribeStaleSecurityGroupsMaxResults = scala.Double

type DescribeStaleSecurityGroupsNextToken = java.lang.String

type DescribeStoreImageTasksRequestMaxResults = scala.Double

type DescribeSubnetsMaxResults = scala.Double

type DescribeTrunkInterfaceAssociationsMaxResults = scala.Double

type DescribeVerifiedAccessEndpointsMaxResults = scala.Double

type DescribeVerifiedAccessGroupMaxResults = scala.Double

type DescribeVerifiedAccessInstanceLoggingConfigurationsMaxResults = scala.Double

type DescribeVerifiedAccessInstancesMaxResults = scala.Double

type DescribeVerifiedAccessTrustProvidersMaxResults = scala.Double

type DescribeVpcClassicLinkDnsSupportMaxResults = scala.Double

type DescribeVpcClassicLinkDnsSupportNextToken = java.lang.String

type DescribeVpcPeeringConnectionsMaxResults = scala.Double

type DescribeVpcsMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`plain-text`
  - typings.awsSdk.awsSdkStrings.parquet__
  - java.lang.String
*/
type DestinationFileFormat = _DestinationFileFormat | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.jamf
  - typings.awsSdk.awsSdkStrings.crowdstrike
  - java.lang.String
*/
type DeviceTrustProviderType = _DeviceTrustProviderType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ebs_
  - typings.awsSdk.awsSdkStrings.`instance-store`
  - java.lang.String
*/
type DeviceType = _DeviceType | java.lang.String

type DhcpConfigurationList = js.Array[DhcpConfiguration]

type DhcpConfigurationValueList = js.Array[AttributeValue]

type DhcpOptionsId = java.lang.String

type DhcpOptionsIdStringList = js.Array[DhcpOptionsId]

type DhcpOptionsList = js.Array[DhcpOptions]

type DisableFastSnapshotRestoreErrorSet = js.Array[DisableFastSnapshotRestoreErrorItem]

type DisableFastSnapshotRestoreStateErrorSet = js.Array[DisableFastSnapshotRestoreStateErrorItem]

type DisableFastSnapshotRestoreSuccessSet = js.Array[DisableFastSnapshotRestoreSuccessItem]

type DiskCount = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VMDK
  - typings.awsSdk.awsSdkStrings.RAW
  - typings.awsSdk.awsSdkStrings.VHD
  - java.lang.String
*/
type DiskImageFormat = _DiskImageFormat | java.lang.String

type DiskImageList = js.Array[DiskImage]

type DiskInfoList = js.Array[DiskInfo]

type DiskSize = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.hdd_
  - typings.awsSdk.awsSdkStrings.ssd_
  - java.lang.String
*/
type DiskType = _DiskType | java.lang.String

type DnsEntrySet = js.Array[DnsEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pendingVerification_
  - typings.awsSdk.awsSdkStrings.verified__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type DnsNameState = _DnsNameState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ipv4__
  - typings.awsSdk.awsSdkStrings.dualstack_
  - typings.awsSdk.awsSdkStrings.ipv6__
  - typings.awsSdk.awsSdkStrings.`service-defined`
  - java.lang.String
*/
type DnsRecordIpType = _DnsRecordIpType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type DnsSupportValue = _DnsSupportValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.vpc__
  - typings.awsSdk.awsSdkStrings.standard__
  - java.lang.String
*/
type DomainType = _DomainType | java.lang.String

type Double = scala.Double

type DoubleWithConstraints = scala.Double

type DrainSeconds = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type DynamicRoutingValue = _DynamicRoutingValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.unsupported_
  - typings.awsSdk.awsSdkStrings.supported
  - java.lang.String
*/
type EbsEncryptionSupport = _EbsEncryptionSupport | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.unsupported_
  - typings.awsSdk.awsSdkStrings.supported
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type EbsNvmeSupport = _EbsNvmeSupport | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.unsupported_
  - typings.awsSdk.awsSdkStrings.supported
  - typings.awsSdk.awsSdkStrings.default__
  - java.lang.String
*/
type EbsOptimizedSupport = _EbsOptimizedSupport | java.lang.String

type EfaSupportedFlag = scala.Boolean

type EgressOnlyInternetGatewayId = java.lang.String

type EgressOnlyInternetGatewayIdList = js.Array[EgressOnlyInternetGatewayId]

type EgressOnlyInternetGatewayList = js.Array[EgressOnlyInternetGateway]

type EipAllocationPublicIp = java.lang.String

type EipAssociationIdList = js.Array[ElasticIpAssociationId]

type ElasticGpuAssociationList = js.Array[ElasticGpuAssociation]

type ElasticGpuId = java.lang.String

type ElasticGpuIdSet = js.Array[ElasticGpuId]

type ElasticGpuSet = js.Array[ElasticGpus]

type ElasticGpuSpecificationList = js.Array[ElasticGpuSpecification]

type ElasticGpuSpecificationResponseList = js.Array[ElasticGpuSpecificationResponse]

type ElasticGpuSpecifications = js.Array[ElasticGpuSpecification]

type ElasticGpuState = ATTACHED | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OK
  - typings.awsSdk.awsSdkStrings.IMPAIRED
  - java.lang.String
*/
type ElasticGpuStatus = _ElasticGpuStatus | java.lang.String

type ElasticInferenceAcceleratorAssociationList = js.Array[ElasticInferenceAcceleratorAssociation]

type ElasticInferenceAcceleratorCount = scala.Double

type ElasticInferenceAccelerators = js.Array[ElasticInferenceAccelerator]

type ElasticIpAssociationId = java.lang.String

type EnaSrdSupported = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.unsupported_
  - typings.awsSdk.awsSdkStrings.supported
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type EnaSupport = _EnaSupport | java.lang.String

type EnableFastSnapshotRestoreErrorSet = js.Array[EnableFastSnapshotRestoreErrorItem]

type EnableFastSnapshotRestoreStateErrorSet = js.Array[EnableFastSnapshotRestoreStateErrorItem]

type EnableFastSnapshotRestoreSuccessSet = js.Array[EnableFastSnapshotRestoreSuccessItem]

type EncryptionInTransitSupported = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.unlimited_
  - typings.awsSdk.awsSdkStrings.limited_
  - java.lang.String
*/
type EndDateType = _EndDateType | java.lang.String

type EndpointSet = js.Array[ClientVpnEndpoint]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.unsupported_
  - typings.awsSdk.awsSdkStrings.supported
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type EphemeralNvmeSupport = _EphemeralNvmeSupport | java.lang.String

type ErrorSet = js.Array[ValidationError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`instance-reboot`
  - typings.awsSdk.awsSdkStrings.`system-reboot`
  - typings.awsSdk.awsSdkStrings.`system-maintenance`
  - typings.awsSdk.awsSdkStrings.`instance-retirement`
  - typings.awsSdk.awsSdkStrings.`instance-stop`
  - java.lang.String
*/
type EventCode = _EventCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.instanceChange
  - typings.awsSdk.awsSdkStrings.fleetRequestChange
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.information
  - java.lang.String
*/
type EventType = _EventType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.noTermination
  - typings.awsSdk.awsSdkStrings.default__
  - java.lang.String
*/
type ExcessCapacityTerminationPolicy = _ExcessCapacityTerminationPolicy | java.lang.String

type ExcludedInstanceType = java.lang.String

type ExcludedInstanceTypeSet = js.Array[ExcludedInstanceType]

type ExecutableByStringList = js.Array[String]

type ExplanationList = js.Array[Explanation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.citrix
  - typings.awsSdk.awsSdkStrings.vmware_
  - typings.awsSdk.awsSdkStrings.microsoft
  - java.lang.String
*/
type ExportEnvironment = _ExportEnvironment | java.lang.String

type ExportImageTaskId = java.lang.String

type ExportImageTaskIdList = js.Array[ExportImageTaskId]

type ExportImageTaskList = js.Array[ExportImageTask]

type ExportTaskId = java.lang.String

type ExportTaskIdStringList = js.Array[ExportTaskId]

type ExportTaskList = js.Array[ExportTask]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.cancelling__
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.completed__
  - java.lang.String
*/
type ExportTaskState = _ExportTaskState | java.lang.String

type ExportVmTaskId = java.lang.String

type FailedCapacityReservationFleetCancellationResultSet = js.Array[FailedCapacityReservationFleetCancellationResult]

type FailedQueuedPurchaseDeletionSet = js.Array[FailedQueuedPurchaseDeletion]

type FastLaunchImageIdList = js.Array[ImageId]

type FastLaunchResourceType = snapshot_ | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enabling__
  - typings.awsSdk.awsSdkStrings.`enabling-failed`
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.`enabled-failed`
  - typings.awsSdk.awsSdkStrings.disabling_
  - typings.awsSdk.awsSdkStrings.`disabling-failed`
  - java.lang.String
*/
type FastLaunchStateCode = _FastLaunchStateCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enabling__
  - typings.awsSdk.awsSdkStrings.optimizing
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.disabling_
  - typings.awsSdk.awsSdkStrings.disabled__
  - java.lang.String
*/
type FastSnapshotRestoreStateCode = _FastSnapshotRestoreStateCode | java.lang.String

type FilterList = js.Array[Filter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.true__
  - typings.awsSdk.awsSdkStrings.false__
  - typings.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type FindingsFound = _FindingsFound | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.pending_fulfillment
  - typings.awsSdk.awsSdkStrings.pending_termination
  - typings.awsSdk.awsSdkStrings.fulfilled__
  - java.lang.String
*/
type FleetActivityStatus = _FleetActivityStatus | java.lang.String

type FleetCapacityReservationSet = js.Array[FleetCapacityReservation]

type FleetCapacityReservationTenancy = default__ | java.lang.String

type FleetCapacityReservationUsageStrategy = `use-capacity-reservations-first` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`instance-change`
  - typings.awsSdk.awsSdkStrings.`fleet-change`
  - typings.awsSdk.awsSdkStrings.`service-error`
  - java.lang.String
*/
type FleetEventType = _FleetEventType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`no-termination`
  - typings.awsSdk.awsSdkStrings.termination
  - java.lang.String
*/
type FleetExcessCapacityTerminationPolicy = _FleetExcessCapacityTerminationPolicy | java.lang.String

type FleetId = java.lang.String

type FleetIdSet = js.Array[FleetId]

type FleetInstanceMatchCriteria = open__ | java.lang.String

type FleetLaunchTemplateConfigList = js.Array[FleetLaunchTemplateConfig]

type FleetLaunchTemplateConfigListRequest = js.Array[FleetLaunchTemplateConfigRequest]

type FleetLaunchTemplateOverridesList = js.Array[FleetLaunchTemplateOverrides]

type FleetLaunchTemplateOverridesListRequest = js.Array[FleetLaunchTemplateOverridesRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`lowest-price`
  - typings.awsSdk.awsSdkStrings.prioritized_
  - java.lang.String
*/
type FleetOnDemandAllocationStrategy = _FleetOnDemandAllocationStrategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.launch_
  - typings.awsSdk.awsSdkStrings.`launch-before-terminate`
  - java.lang.String
*/
type FleetReplacementStrategy = _FleetReplacementStrategy | java.lang.String

type FleetSet = js.Array[FleetData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.submitted__
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.deleted__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.deleted_running
  - typings.awsSdk.awsSdkStrings.deleted_terminating
  - typings.awsSdk.awsSdkStrings.modifying_
  - java.lang.String
*/
type FleetStateCode = _FleetStateCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.request__
  - typings.awsSdk.awsSdkStrings.maintain
  - typings.awsSdk.awsSdkStrings.instant
  - java.lang.String
*/
type FleetType = _FleetType | java.lang.String

type Float = scala.Double

type FlowLogIdList = js.Array[VpcFlowLogId]

type FlowLogResourceId = java.lang.String

type FlowLogResourceIds = js.Array[FlowLogResourceId]

type FlowLogSet = js.Array[FlowLog]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VPC
  - typings.awsSdk.awsSdkStrings.Subnet_
  - typings.awsSdk.awsSdkStrings.NetworkInterface
  - typings.awsSdk.awsSdkStrings.TransitGateway
  - typings.awsSdk.awsSdkStrings.TransitGatewayAttachment
  - java.lang.String
*/
type FlowLogsResourceType = _FlowLogsResourceType | java.lang.String

type FpgaDeviceCount = scala.Double

type FpgaDeviceInfoList = js.Array[FpgaDeviceInfo]

type FpgaDeviceManufacturerName = java.lang.String

type FpgaDeviceMemorySize = scala.Double

type FpgaDeviceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.description_
  - typings.awsSdk.awsSdkStrings.name__
  - typings.awsSdk.awsSdkStrings.loadPermission
  - typings.awsSdk.awsSdkStrings.productCodes
  - java.lang.String
*/
type FpgaImageAttributeName = _FpgaImageAttributeName | java.lang.String

type FpgaImageId = java.lang.String

type FpgaImageIdList = js.Array[FpgaImageId]

type FpgaImageList = js.Array[FpgaImage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.unavailable___
  - java.lang.String
*/
type FpgaImageStateCode = _FpgaImageStateCode | java.lang.String

type FreeTierEligibleFlag = scala.Boolean

type GVCDMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.`not-associated`
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.disassociating__
  - java.lang.String
*/
type GatewayAssociationState = _GatewayAssociationState | java.lang.String

type GatewayType = ipsecDot1 | java.lang.String

type GetCapacityReservationUsageRequestMaxResults = scala.Double

type GetGroupsForCapacityReservationRequestMaxResults = scala.Double

type GetIpamPoolAllocationsMaxResults = scala.Double

type GetManagedPrefixListAssociationsMaxResults = scala.Double

type GetSubnetCidrReservationsMaxResults = scala.Double

type GpuDeviceCount = scala.Double

type GpuDeviceInfoList = js.Array[GpuDeviceInfo]

type GpuDeviceManufacturerName = java.lang.String

type GpuDeviceMemorySize = scala.Double

type GpuDeviceName = java.lang.String

type GroupIdStringList = js.Array[SecurityGroupId]

type GroupIdentifierList = js.Array[GroupIdentifier]

type GroupIdentifierSet = js.Array[SecurityGroupIdentifier]

type GroupIds = js.Array[SecurityGroupId]

type GroupNameStringList = js.Array[SecurityGroupName]

type HibernationFlag = scala.Boolean

type HistoryRecordSet = js.Array[HistoryRecordEntry]

type HistoryRecords = js.Array[HistoryRecord]

type HostInstanceList = js.Array[HostInstance]

type HostList = js.Array[Host]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.on__
  - typings.awsSdk.awsSdkStrings.off__
  - java.lang.String
*/
type HostMaintenance = _HostMaintenance | java.lang.String

type HostOfferingSet = js.Array[HostOffering]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.on__
  - typings.awsSdk.awsSdkStrings.off__
  - java.lang.String
*/
type HostRecovery = _HostRecovery | java.lang.String

type HostReservationId = java.lang.String

type HostReservationIdSet = js.Array[HostReservationId]

type HostReservationSet = js.Array[HostReservation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.dedicated_
  - typings.awsSdk.awsSdkStrings.host__
  - java.lang.String
*/
type HostTenancy = _HostTenancy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`ip-name`
  - typings.awsSdk.awsSdkStrings.`resource-name`
  - java.lang.String
*/
type HostnameType = _HostnameType | java.lang.String

type Hour = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.optional__
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type HttpTokensState = _HttpTokensState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ovm
  - typings.awsSdk.awsSdkStrings.xen
  - java.lang.String
*/
type HypervisorType = _HypervisorType | java.lang.String

type IKEVersionsList = js.Array[IKEVersionsListValue]

type IKEVersionsRequestList = js.Array[IKEVersionsRequestListValue]

type IamInstanceProfileAssociationId = java.lang.String

type IamInstanceProfileAssociationSet = js.Array[IamInstanceProfileAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.disassociating__
  - typings.awsSdk.awsSdkStrings.disassociated__
  - java.lang.String
*/
type IamInstanceProfileAssociationState = _IamInstanceProfileAssociationState | java.lang.String

type IdFormatList = js.Array[IdFormat]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type Igmpv2SupportValue = _Igmpv2SupportValue | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.description_
  - typings.awsSdk.awsSdkStrings.kernel
  - typings.awsSdk.awsSdkStrings.ramdisk
  - typings.awsSdk.awsSdkStrings.launchPermission
  - typings.awsSdk.awsSdkStrings.productCodes
  - typings.awsSdk.awsSdkStrings.blockDeviceMapping
  - typings.awsSdk.awsSdkStrings.sriovNetSupport
  - typings.awsSdk.awsSdkStrings.bootMode
  - typings.awsSdk.awsSdkStrings.tpmSupport
  - typings.awsSdk.awsSdkStrings.uefiData
  - typings.awsSdk.awsSdkStrings.lastLaunchedTime
  - typings.awsSdk.awsSdkStrings.imdsSupport
  - java.lang.String
*/
type ImageAttributeName = _ImageAttributeName | java.lang.String

type ImageDiskContainerList = js.Array[ImageDiskContainer]

type ImageId = java.lang.String

type ImageIdList = js.Array[ImageId]

type ImageIdStringList = js.Array[ImageId]

type ImageList = js.Array[Image]

type ImageRecycleBinInfoList = js.Array[ImageRecycleBinInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.invalid__
  - typings.awsSdk.awsSdkStrings.deregistered__
  - typings.awsSdk.awsSdkStrings.transient
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.error__
  - java.lang.String
*/
type ImageState = _ImageState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.machine
  - typings.awsSdk.awsSdkStrings.kernel
  - typings.awsSdk.awsSdkStrings.ramdisk
  - java.lang.String
*/
type ImageTypeValues = _ImageTypeValues | java.lang.String

type ImdsSupportValues = v2Dot0 | java.lang.String

type ImportImageLicenseSpecificationListRequest = js.Array[ImportImageLicenseConfigurationRequest]

type ImportImageLicenseSpecificationListResponse = js.Array[ImportImageLicenseConfigurationResponse]

type ImportImageTaskId = java.lang.String

type ImportImageTaskList = js.Array[ImportImageTask]

type ImportInstanceVolumeDetailSet = js.Array[ImportInstanceVolumeDetailItem]

type ImportManifestUrl = java.lang.String

type ImportSnapshotTaskId = java.lang.String

type ImportSnapshotTaskIdList = js.Array[ImportSnapshotTaskId]

type ImportSnapshotTaskList = js.Array[ImportSnapshotTask]

type ImportTaskId = java.lang.String

type ImportTaskIdList = js.Array[ImportImageTaskId]

type InferenceDeviceCount = scala.Double

type InferenceDeviceInfoList = js.Array[InferenceDeviceInfo]

type InferenceDeviceManufacturerName = java.lang.String

type InferenceDeviceName = java.lang.String

type InsideCidrBlocksStringList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.instanceType_
  - typings.awsSdk.awsSdkStrings.kernel
  - typings.awsSdk.awsSdkStrings.ramdisk
  - typings.awsSdk.awsSdkStrings.userData_
  - typings.awsSdk.awsSdkStrings.disableApiTermination
  - typings.awsSdk.awsSdkStrings.instanceInitiatedShutdownBehavior
  - typings.awsSdk.awsSdkStrings.rootDeviceName
  - typings.awsSdk.awsSdkStrings.blockDeviceMapping
  - typings.awsSdk.awsSdkStrings.productCodes
  - typings.awsSdk.awsSdkStrings.sourceDestCheck
  - typings.awsSdk.awsSdkStrings.groupSet
  - typings.awsSdk.awsSdkStrings.ebsOptimized
  - typings.awsSdk.awsSdkStrings.sriovNetSupport
  - typings.awsSdk.awsSdkStrings.enaSupport
  - typings.awsSdk.awsSdkStrings.enclaveOptions
  - typings.awsSdk.awsSdkStrings.disableApiStop
  - java.lang.String
*/
type InstanceAttributeName = _InstanceAttributeName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.default__
  - java.lang.String
*/
type InstanceAutoRecoveryState = _InstanceAutoRecoveryState | java.lang.String

type InstanceBlockDeviceMappingList = js.Array[InstanceBlockDeviceMapping]

type InstanceBlockDeviceMappingSpecificationList = js.Array[InstanceBlockDeviceMappingSpecification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`legacy-bios`
  - typings.awsSdk.awsSdkStrings.uefi_
  - java.lang.String
*/
type InstanceBootModeValues = _InstanceBootModeValues | java.lang.String

type InstanceCountList = js.Array[InstanceCount]

type InstanceCreditSpecificationList = js.Array[InstanceCreditSpecification]

type InstanceCreditSpecificationListRequest = js.Array[InstanceCreditSpecificationRequest]

type InstanceEventId = java.lang.String

type InstanceEventWindowCronExpression = java.lang.String

type InstanceEventWindowId = java.lang.String

type InstanceEventWindowIdSet = js.Array[InstanceEventWindowId]

type InstanceEventWindowSet = js.Array[InstanceEventWindow]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.creating__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type InstanceEventWindowState = _InstanceEventWindowState | java.lang.String

type InstanceEventWindowTimeRangeList = js.Array[InstanceEventWindowTimeRange]

type InstanceEventWindowTimeRangeRequestSet = js.Array[InstanceEventWindowTimeRangeRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.current__
  - typings.awsSdk.awsSdkStrings.previous_
  - java.lang.String
*/
type InstanceGeneration = _InstanceGeneration | java.lang.String

type InstanceGenerationSet = js.Array[InstanceGeneration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.healthy__
  - typings.awsSdk.awsSdkStrings.unhealthy__
  - java.lang.String
*/
type InstanceHealthStatus = _InstanceHealthStatus | java.lang.String

type InstanceId = java.lang.String

type InstanceIdForResolver = java.lang.String

type InstanceIdList = js.Array[InstanceId]

type InstanceIdSet = js.Array[InstanceId]

type InstanceIdStringList = js.Array[InstanceId]

type InstanceIdWithVolumeResolver = java.lang.String

type InstanceIdsSet = js.Array[InstanceId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.hibernate
  - typings.awsSdk.awsSdkStrings.stop_
  - typings.awsSdk.awsSdkStrings.terminate__
  - java.lang.String
*/
type InstanceInterruptionBehavior = _InstanceInterruptionBehavior | java.lang.String

type InstanceIpv4PrefixList = js.Array[InstanceIpv4Prefix]

type InstanceIpv6AddressList = js.Array[InstanceIpv6Address]

type InstanceIpv6AddressListRequest = js.Array[InstanceIpv6AddressRequest]

type InstanceIpv6PrefixList = js.Array[InstanceIpv6Prefix]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.spot_
  - typings.awsSdk.awsSdkStrings.`on-demand`
  - java.lang.String
*/
type InstanceLifecycle = _InstanceLifecycle | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.spot_
  - typings.awsSdk.awsSdkStrings.scheduled__
  - java.lang.String
*/
type InstanceLifecycleType = _InstanceLifecycleType | java.lang.String

type InstanceList = js.Array[Instance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.open__
  - typings.awsSdk.awsSdkStrings.targeted_
  - java.lang.String
*/
type InstanceMatchCriteria = _InstanceMatchCriteria | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type InstanceMetadataEndpointState = _InstanceMetadataEndpointState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.applied_
  - java.lang.String
*/
type InstanceMetadataOptionsState = _InstanceMetadataOptionsState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type InstanceMetadataProtocolState = _InstanceMetadataProtocolState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type InstanceMetadataTagsState = _InstanceMetadataTagsState | java.lang.String

type InstanceMonitoringList = js.Array[InstanceMonitoring]

type InstanceNetworkInterfaceList = js.Array[InstanceNetworkInterface]

type InstanceNetworkInterfaceSpecificationList = js.Array[InstanceNetworkInterfaceSpecification]

type InstancePrivateIpAddressList = js.Array[InstancePrivateIpAddress]

type InstanceStateChangeList = js.Array[InstanceStateChange]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.running__
  - typings.awsSdk.awsSdkStrings.`shutting-down_`
  - typings.awsSdk.awsSdkStrings.terminated__
  - typings.awsSdk.awsSdkStrings.stopping__
  - typings.awsSdk.awsSdkStrings.stopped__
  - java.lang.String
*/
type InstanceStateName = _InstanceStateName | java.lang.String

type InstanceStatusDetailsList = js.Array[InstanceStatusDetails]

type InstanceStatusEventList = js.Array[InstanceStatusEvent]

type InstanceStatusList = js.Array[InstanceStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.unsupported_
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type InstanceStorageEncryptionSupport = _InstanceStorageEncryptionSupport | java.lang.String

type InstanceStorageFlag = scala.Boolean

type InstanceTagKeySet = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.a1Dotmedium
  - typings.awsSdk.awsSdkStrings.a1Dotlarge
  - typings.awsSdk.awsSdkStrings.a1Dotxlarge
  - typings.awsSdk.awsSdkStrings.a1Dot2xlarge
  - typings.awsSdk.awsSdkStrings.a1Dot4xlarge
  - typings.awsSdk.awsSdkStrings.a1Dotmetal
  - typings.awsSdk.awsSdkStrings.c1Dotmedium
  - typings.awsSdk.awsSdkStrings.c1Dotxlarge
  - typings.awsSdk.awsSdkStrings.c3Dotlarge
  - typings.awsSdk.awsSdkStrings.c3Dotxlarge
  - typings.awsSdk.awsSdkStrings.c3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.c3Dot4xlarge
  - typings.awsSdk.awsSdkStrings.c3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.c4Dotlarge
  - typings.awsSdk.awsSdkStrings.c4Dotxlarge
  - typings.awsSdk.awsSdkStrings.c4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.c4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.c4Dot8xlarge
  - typings.awsSdk.awsSdkStrings.c5Dotlarge
  - typings.awsSdk.awsSdkStrings.c5Dotxlarge
  - typings.awsSdk.awsSdkStrings.c5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot9xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot18xlarge
  - typings.awsSdk.awsSdkStrings.c5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.c5Dotmetal
  - typings.awsSdk.awsSdkStrings.c5aDotlarge
  - typings.awsSdk.awsSdkStrings.c5aDotxlarge
  - typings.awsSdk.awsSdkStrings.c5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.c5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.c5adDotlarge
  - typings.awsSdk.awsSdkStrings.c5adDotxlarge
  - typings.awsSdk.awsSdkStrings.c5adDot2xlarge
  - typings.awsSdk.awsSdkStrings.c5adDot4xlarge
  - typings.awsSdk.awsSdkStrings.c5adDot8xlarge
  - typings.awsSdk.awsSdkStrings.c5adDot12xlarge
  - typings.awsSdk.awsSdkStrings.c5adDot16xlarge
  - typings.awsSdk.awsSdkStrings.c5adDot24xlarge
  - typings.awsSdk.awsSdkStrings.c5dDotlarge
  - typings.awsSdk.awsSdkStrings.c5dDotxlarge
  - typings.awsSdk.awsSdkStrings.c5dDot2xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot4xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot9xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot12xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot18xlarge
  - typings.awsSdk.awsSdkStrings.c5dDot24xlarge
  - typings.awsSdk.awsSdkStrings.c5dDotmetal
  - typings.awsSdk.awsSdkStrings.c5nDotlarge
  - typings.awsSdk.awsSdkStrings.c5nDotxlarge
  - typings.awsSdk.awsSdkStrings.c5nDot2xlarge
  - typings.awsSdk.awsSdkStrings.c5nDot4xlarge
  - typings.awsSdk.awsSdkStrings.c5nDot9xlarge
  - typings.awsSdk.awsSdkStrings.c5nDot18xlarge
  - typings.awsSdk.awsSdkStrings.c5nDotmetal
  - typings.awsSdk.awsSdkStrings.c6gDotmedium
  - typings.awsSdk.awsSdkStrings.c6gDotlarge
  - typings.awsSdk.awsSdkStrings.c6gDotxlarge
  - typings.awsSdk.awsSdkStrings.c6gDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6gDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6gDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6gDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6gDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6gDotmetal
  - typings.awsSdk.awsSdkStrings.c6gdDotmedium
  - typings.awsSdk.awsSdkStrings.c6gdDotlarge
  - typings.awsSdk.awsSdkStrings.c6gdDotxlarge
  - typings.awsSdk.awsSdkStrings.c6gdDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6gdDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6gdDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6gdDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6gdDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6gdDotmetal
  - typings.awsSdk.awsSdkStrings.c6gnDotmedium
  - typings.awsSdk.awsSdkStrings.c6gnDotlarge
  - typings.awsSdk.awsSdkStrings.c6gnDotxlarge
  - typings.awsSdk.awsSdkStrings.c6gnDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6gnDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6gnDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6gnDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6gnDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6iDotlarge
  - typings.awsSdk.awsSdkStrings.c6iDotxlarge
  - typings.awsSdk.awsSdkStrings.c6iDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot24xlarge
  - typings.awsSdk.awsSdkStrings.c6iDot32xlarge
  - typings.awsSdk.awsSdkStrings.c6iDotmetal
  - typings.awsSdk.awsSdkStrings.cc1Dot4xlarge
  - typings.awsSdk.awsSdkStrings.cc2Dot8xlarge
  - typings.awsSdk.awsSdkStrings.cg1Dot4xlarge
  - typings.awsSdk.awsSdkStrings.cr1Dot8xlarge
  - typings.awsSdk.awsSdkStrings.d2Dotxlarge
  - typings.awsSdk.awsSdkStrings.d2Dot2xlarge
  - typings.awsSdk.awsSdkStrings.d2Dot4xlarge
  - typings.awsSdk.awsSdkStrings.d2Dot8xlarge
  - typings.awsSdk.awsSdkStrings.d3Dotxlarge
  - typings.awsSdk.awsSdkStrings.d3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.d3Dot4xlarge
  - typings.awsSdk.awsSdkStrings.d3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.d3enDotxlarge
  - typings.awsSdk.awsSdkStrings.d3enDot2xlarge
  - typings.awsSdk.awsSdkStrings.d3enDot4xlarge
  - typings.awsSdk.awsSdkStrings.d3enDot6xlarge
  - typings.awsSdk.awsSdkStrings.d3enDot8xlarge
  - typings.awsSdk.awsSdkStrings.d3enDot12xlarge
  - typings.awsSdk.awsSdkStrings.dl1Dot24xlarge
  - typings.awsSdk.awsSdkStrings.f1Dot2xlarge
  - typings.awsSdk.awsSdkStrings.f1Dot4xlarge
  - typings.awsSdk.awsSdkStrings.f1Dot16xlarge
  - typings.awsSdk.awsSdkStrings.g2Dot2xlarge
  - typings.awsSdk.awsSdkStrings.g2Dot8xlarge
  - typings.awsSdk.awsSdkStrings.g3Dot4xlarge
  - typings.awsSdk.awsSdkStrings.g3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.g3Dot16xlarge
  - typings.awsSdk.awsSdkStrings.g3sDotxlarge
  - typings.awsSdk.awsSdkStrings.g4adDotxlarge
  - typings.awsSdk.awsSdkStrings.g4adDot2xlarge
  - typings.awsSdk.awsSdkStrings.g4adDot4xlarge
  - typings.awsSdk.awsSdkStrings.g4adDot8xlarge
  - typings.awsSdk.awsSdkStrings.g4adDot16xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDotxlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot2xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot4xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot8xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot12xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDot16xlarge
  - typings.awsSdk.awsSdkStrings.g4dnDotmetal
  - typings.awsSdk.awsSdkStrings.g5Dotxlarge
  - typings.awsSdk.awsSdkStrings.g5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot8xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot16xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.g5Dot48xlarge
  - typings.awsSdk.awsSdkStrings.g5gDotxlarge
  - typings.awsSdk.awsSdkStrings.g5gDot2xlarge
  - typings.awsSdk.awsSdkStrings.g5gDot4xlarge
  - typings.awsSdk.awsSdkStrings.g5gDot8xlarge
  - typings.awsSdk.awsSdkStrings.g5gDot16xlarge
  - typings.awsSdk.awsSdkStrings.g5gDotmetal
  - typings.awsSdk.awsSdkStrings.hi1Dot4xlarge
  - typings.awsSdk.awsSdkStrings.hpc6aDot48xlarge
  - typings.awsSdk.awsSdkStrings.hs1Dot8xlarge
  - typings.awsSdk.awsSdkStrings.h1Dot2xlarge
  - typings.awsSdk.awsSdkStrings.h1Dot4xlarge
  - typings.awsSdk.awsSdkStrings.h1Dot8xlarge
  - typings.awsSdk.awsSdkStrings.h1Dot16xlarge
  - typings.awsSdk.awsSdkStrings.i2Dotxlarge
  - typings.awsSdk.awsSdkStrings.i2Dot2xlarge
  - typings.awsSdk.awsSdkStrings.i2Dot4xlarge
  - typings.awsSdk.awsSdkStrings.i2Dot8xlarge
  - typings.awsSdk.awsSdkStrings.i3Dotlarge
  - typings.awsSdk.awsSdkStrings.i3Dotxlarge
  - typings.awsSdk.awsSdkStrings.i3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.i3Dot4xlarge
  - typings.awsSdk.awsSdkStrings.i3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.i3Dot16xlarge
  - typings.awsSdk.awsSdkStrings.i3Dotmetal
  - typings.awsSdk.awsSdkStrings.i3enDotlarge
  - typings.awsSdk.awsSdkStrings.i3enDotxlarge
  - typings.awsSdk.awsSdkStrings.i3enDot2xlarge
  - typings.awsSdk.awsSdkStrings.i3enDot3xlarge
  - typings.awsSdk.awsSdkStrings.i3enDot6xlarge
  - typings.awsSdk.awsSdkStrings.i3enDot12xlarge
  - typings.awsSdk.awsSdkStrings.i3enDot24xlarge
  - typings.awsSdk.awsSdkStrings.i3enDotmetal
  - typings.awsSdk.awsSdkStrings.im4gnDotlarge
  - typings.awsSdk.awsSdkStrings.im4gnDotxlarge
  - typings.awsSdk.awsSdkStrings.im4gnDot2xlarge
  - typings.awsSdk.awsSdkStrings.im4gnDot4xlarge
  - typings.awsSdk.awsSdkStrings.im4gnDot8xlarge
  - typings.awsSdk.awsSdkStrings.im4gnDot16xlarge
  - typings.awsSdk.awsSdkStrings.inf1Dotxlarge
  - typings.awsSdk.awsSdkStrings.inf1Dot2xlarge
  - typings.awsSdk.awsSdkStrings.inf1Dot6xlarge
  - typings.awsSdk.awsSdkStrings.inf1Dot24xlarge
  - typings.awsSdk.awsSdkStrings.is4genDotmedium
  - typings.awsSdk.awsSdkStrings.is4genDotlarge
  - typings.awsSdk.awsSdkStrings.is4genDotxlarge
  - typings.awsSdk.awsSdkStrings.is4genDot2xlarge
  - typings.awsSdk.awsSdkStrings.is4genDot4xlarge
  - typings.awsSdk.awsSdkStrings.is4genDot8xlarge
  - typings.awsSdk.awsSdkStrings.m1Dotsmall
  - typings.awsSdk.awsSdkStrings.m1Dotmedium
  - typings.awsSdk.awsSdkStrings.m1Dotlarge
  - typings.awsSdk.awsSdkStrings.m1Dotxlarge
  - typings.awsSdk.awsSdkStrings.m2Dotxlarge
  - typings.awsSdk.awsSdkStrings.m2Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m2Dot4xlarge
  - typings.awsSdk.awsSdkStrings.m3Dotmedium
  - typings.awsSdk.awsSdkStrings.m3Dotlarge
  - typings.awsSdk.awsSdkStrings.m3Dotxlarge
  - typings.awsSdk.awsSdkStrings.m3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m4Dotlarge
  - typings.awsSdk.awsSdkStrings.m4Dotxlarge
  - typings.awsSdk.awsSdkStrings.m4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.m4Dot10xlarge
  - typings.awsSdk.awsSdkStrings.m4Dot16xlarge
  - typings.awsSdk.awsSdkStrings.m5Dotlarge
  - typings.awsSdk.awsSdkStrings.m5Dotxlarge
  - typings.awsSdk.awsSdkStrings.m5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot8xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot16xlarge
  - typings.awsSdk.awsSdkStrings.m5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.m5Dotmetal
  - typings.awsSdk.awsSdkStrings.m5aDotlarge
  - typings.awsSdk.awsSdkStrings.m5aDotxlarge
  - typings.awsSdk.awsSdkStrings.m5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.m5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.m5adDotlarge
  - typings.awsSdk.awsSdkStrings.m5adDotxlarge
  - typings.awsSdk.awsSdkStrings.m5adDot2xlarge
  - typings.awsSdk.awsSdkStrings.m5adDot4xlarge
  - typings.awsSdk.awsSdkStrings.m5adDot8xlarge
  - typings.awsSdk.awsSdkStrings.m5adDot12xlarge
  - typings.awsSdk.awsSdkStrings.m5adDot16xlarge
  - typings.awsSdk.awsSdkStrings.m5adDot24xlarge
  - typings.awsSdk.awsSdkStrings.m5dDotlarge
  - typings.awsSdk.awsSdkStrings.m5dDotxlarge
  - typings.awsSdk.awsSdkStrings.m5dDot2xlarge
  - typings.awsSdk.awsSdkStrings.m5dDot4xlarge
  - typings.awsSdk.awsSdkStrings.m5dDot8xlarge
  - typings.awsSdk.awsSdkStrings.m5dDot12xlarge
  - typings.awsSdk.awsSdkStrings.m5dDot16xlarge
  - typings.awsSdk.awsSdkStrings.m5dDot24xlarge
  - typings.awsSdk.awsSdkStrings.m5dDotmetal
  - typings.awsSdk.awsSdkStrings.m5dnDotlarge
  - typings.awsSdk.awsSdkStrings.m5dnDotxlarge
  - typings.awsSdk.awsSdkStrings.m5dnDot2xlarge
  - typings.awsSdk.awsSdkStrings.m5dnDot4xlarge
  - typings.awsSdk.awsSdkStrings.m5dnDot8xlarge
  - typings.awsSdk.awsSdkStrings.m5dnDot12xlarge
  - typings.awsSdk.awsSdkStrings.m5dnDot16xlarge
  - typings.awsSdk.awsSdkStrings.m5dnDot24xlarge
  - typings.awsSdk.awsSdkStrings.m5dnDotmetal
  - typings.awsSdk.awsSdkStrings.m5nDotlarge
  - typings.awsSdk.awsSdkStrings.m5nDotxlarge
  - typings.awsSdk.awsSdkStrings.m5nDot2xlarge
  - typings.awsSdk.awsSdkStrings.m5nDot4xlarge
  - typings.awsSdk.awsSdkStrings.m5nDot8xlarge
  - typings.awsSdk.awsSdkStrings.m5nDot12xlarge
  - typings.awsSdk.awsSdkStrings.m5nDot16xlarge
  - typings.awsSdk.awsSdkStrings.m5nDot24xlarge
  - typings.awsSdk.awsSdkStrings.m5nDotmetal
  - typings.awsSdk.awsSdkStrings.m5znDotlarge
  - typings.awsSdk.awsSdkStrings.m5znDotxlarge
  - typings.awsSdk.awsSdkStrings.m5znDot2xlarge
  - typings.awsSdk.awsSdkStrings.m5znDot3xlarge
  - typings.awsSdk.awsSdkStrings.m5znDot6xlarge
  - typings.awsSdk.awsSdkStrings.m5znDot12xlarge
  - typings.awsSdk.awsSdkStrings.m5znDotmetal
  - typings.awsSdk.awsSdkStrings.m6aDotlarge
  - typings.awsSdk.awsSdkStrings.m6aDotxlarge
  - typings.awsSdk.awsSdkStrings.m6aDot2xlarge
  - typings.awsSdk.awsSdkStrings.m6aDot4xlarge
  - typings.awsSdk.awsSdkStrings.m6aDot8xlarge
  - typings.awsSdk.awsSdkStrings.m6aDot12xlarge
  - typings.awsSdk.awsSdkStrings.m6aDot16xlarge
  - typings.awsSdk.awsSdkStrings.m6aDot24xlarge
  - typings.awsSdk.awsSdkStrings.m6aDot32xlarge
  - typings.awsSdk.awsSdkStrings.m6aDot48xlarge
  - typings.awsSdk.awsSdkStrings.m6gDotmetal
  - typings.awsSdk.awsSdkStrings.m6gDotmedium
  - typings.awsSdk.awsSdkStrings.m6gDotlarge
  - typings.awsSdk.awsSdkStrings.m6gDotxlarge
  - typings.awsSdk.awsSdkStrings.m6gDot2xlarge
  - typings.awsSdk.awsSdkStrings.m6gDot4xlarge
  - typings.awsSdk.awsSdkStrings.m6gDot8xlarge
  - typings.awsSdk.awsSdkStrings.m6gDot12xlarge
  - typings.awsSdk.awsSdkStrings.m6gDot16xlarge
  - typings.awsSdk.awsSdkStrings.m6gdDotmetal
  - typings.awsSdk.awsSdkStrings.m6gdDotmedium
  - typings.awsSdk.awsSdkStrings.m6gdDotlarge
  - typings.awsSdk.awsSdkStrings.m6gdDotxlarge
  - typings.awsSdk.awsSdkStrings.m6gdDot2xlarge
  - typings.awsSdk.awsSdkStrings.m6gdDot4xlarge
  - typings.awsSdk.awsSdkStrings.m6gdDot8xlarge
  - typings.awsSdk.awsSdkStrings.m6gdDot12xlarge
  - typings.awsSdk.awsSdkStrings.m6gdDot16xlarge
  - typings.awsSdk.awsSdkStrings.m6iDotlarge
  - typings.awsSdk.awsSdkStrings.m6iDotxlarge
  - typings.awsSdk.awsSdkStrings.m6iDot2xlarge
  - typings.awsSdk.awsSdkStrings.m6iDot4xlarge
  - typings.awsSdk.awsSdkStrings.m6iDot8xlarge
  - typings.awsSdk.awsSdkStrings.m6iDot12xlarge
  - typings.awsSdk.awsSdkStrings.m6iDot16xlarge
  - typings.awsSdk.awsSdkStrings.m6iDot24xlarge
  - typings.awsSdk.awsSdkStrings.m6iDot32xlarge
  - typings.awsSdk.awsSdkStrings.m6iDotmetal
  - typings.awsSdk.awsSdkStrings.mac1Dotmetal
  - typings.awsSdk.awsSdkStrings.p2Dotxlarge
  - typings.awsSdk.awsSdkStrings.p2Dot8xlarge
  - typings.awsSdk.awsSdkStrings.p2Dot16xlarge
  - typings.awsSdk.awsSdkStrings.p3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.p3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.p3Dot16xlarge
  - typings.awsSdk.awsSdkStrings.p3dnDot24xlarge
  - typings.awsSdk.awsSdkStrings.p4dDot24xlarge
  - typings.awsSdk.awsSdkStrings.r3Dotlarge
  - typings.awsSdk.awsSdkStrings.r3Dotxlarge
  - typings.awsSdk.awsSdkStrings.r3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.r3Dot4xlarge
  - typings.awsSdk.awsSdkStrings.r3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.r4Dotlarge
  - typings.awsSdk.awsSdkStrings.r4Dotxlarge
  - typings.awsSdk.awsSdkStrings.r4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot8xlarge
  - typings.awsSdk.awsSdkStrings.r4Dot16xlarge
  - typings.awsSdk.awsSdkStrings.r5Dotlarge
  - typings.awsSdk.awsSdkStrings.r5Dotxlarge
  - typings.awsSdk.awsSdkStrings.r5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot8xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot16xlarge
  - typings.awsSdk.awsSdkStrings.r5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.r5Dotmetal
  - typings.awsSdk.awsSdkStrings.r5aDotlarge
  - typings.awsSdk.awsSdkStrings.r5aDotxlarge
  - typings.awsSdk.awsSdkStrings.r5aDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5aDot24xlarge
  - typings.awsSdk.awsSdkStrings.r5adDotlarge
  - typings.awsSdk.awsSdkStrings.r5adDotxlarge
  - typings.awsSdk.awsSdkStrings.r5adDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5adDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5adDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5adDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5adDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5adDot24xlarge
  - typings.awsSdk.awsSdkStrings.r5bDotlarge
  - typings.awsSdk.awsSdkStrings.r5bDotxlarge
  - typings.awsSdk.awsSdkStrings.r5bDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5bDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5bDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5bDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5bDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5bDot24xlarge
  - typings.awsSdk.awsSdkStrings.r5bDotmetal
  - typings.awsSdk.awsSdkStrings.r5dDotlarge
  - typings.awsSdk.awsSdkStrings.r5dDotxlarge
  - typings.awsSdk.awsSdkStrings.r5dDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5dDot24xlarge
  - typings.awsSdk.awsSdkStrings.r5dDotmetal
  - typings.awsSdk.awsSdkStrings.r5dnDotlarge
  - typings.awsSdk.awsSdkStrings.r5dnDotxlarge
  - typings.awsSdk.awsSdkStrings.r5dnDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5dnDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5dnDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5dnDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5dnDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5dnDot24xlarge
  - typings.awsSdk.awsSdkStrings.r5dnDotmetal
  - typings.awsSdk.awsSdkStrings.r5nDotlarge
  - typings.awsSdk.awsSdkStrings.r5nDotxlarge
  - typings.awsSdk.awsSdkStrings.r5nDot2xlarge
  - typings.awsSdk.awsSdkStrings.r5nDot4xlarge
  - typings.awsSdk.awsSdkStrings.r5nDot8xlarge
  - typings.awsSdk.awsSdkStrings.r5nDot12xlarge
  - typings.awsSdk.awsSdkStrings.r5nDot16xlarge
  - typings.awsSdk.awsSdkStrings.r5nDot24xlarge
  - typings.awsSdk.awsSdkStrings.r5nDotmetal
  - typings.awsSdk.awsSdkStrings.r6gDotmedium
  - typings.awsSdk.awsSdkStrings.r6gDotlarge
  - typings.awsSdk.awsSdkStrings.r6gDotxlarge
  - typings.awsSdk.awsSdkStrings.r6gDot2xlarge
  - typings.awsSdk.awsSdkStrings.r6gDot4xlarge
  - typings.awsSdk.awsSdkStrings.r6gDot8xlarge
  - typings.awsSdk.awsSdkStrings.r6gDot12xlarge
  - typings.awsSdk.awsSdkStrings.r6gDot16xlarge
  - typings.awsSdk.awsSdkStrings.r6gDotmetal
  - typings.awsSdk.awsSdkStrings.r6gdDotmedium
  - typings.awsSdk.awsSdkStrings.r6gdDotlarge
  - typings.awsSdk.awsSdkStrings.r6gdDotxlarge
  - typings.awsSdk.awsSdkStrings.r6gdDot2xlarge
  - typings.awsSdk.awsSdkStrings.r6gdDot4xlarge
  - typings.awsSdk.awsSdkStrings.r6gdDot8xlarge
  - typings.awsSdk.awsSdkStrings.r6gdDot12xlarge
  - typings.awsSdk.awsSdkStrings.r6gdDot16xlarge
  - typings.awsSdk.awsSdkStrings.r6gdDotmetal
  - typings.awsSdk.awsSdkStrings.r6iDotlarge
  - typings.awsSdk.awsSdkStrings.r6iDotxlarge
  - typings.awsSdk.awsSdkStrings.r6iDot2xlarge
  - typings.awsSdk.awsSdkStrings.r6iDot4xlarge
  - typings.awsSdk.awsSdkStrings.r6iDot8xlarge
  - typings.awsSdk.awsSdkStrings.r6iDot12xlarge
  - typings.awsSdk.awsSdkStrings.r6iDot16xlarge
  - typings.awsSdk.awsSdkStrings.r6iDot24xlarge
  - typings.awsSdk.awsSdkStrings.r6iDot32xlarge
  - typings.awsSdk.awsSdkStrings.r6iDotmetal
  - typings.awsSdk.awsSdkStrings.t1Dotmicro
  - typings.awsSdk.awsSdkStrings.t2Dotnano
  - typings.awsSdk.awsSdkStrings.t2Dotmicro
  - typings.awsSdk.awsSdkStrings.t2Dotsmall
  - typings.awsSdk.awsSdkStrings.t2Dotmedium
  - typings.awsSdk.awsSdkStrings.t2Dotlarge
  - typings.awsSdk.awsSdkStrings.t2Dotxlarge
  - typings.awsSdk.awsSdkStrings.t2Dot2xlarge
  - typings.awsSdk.awsSdkStrings.t3Dotnano
  - typings.awsSdk.awsSdkStrings.t3Dotmicro
  - typings.awsSdk.awsSdkStrings.t3Dotsmall
  - typings.awsSdk.awsSdkStrings.t3Dotmedium
  - typings.awsSdk.awsSdkStrings.t3Dotlarge
  - typings.awsSdk.awsSdkStrings.t3Dotxlarge
  - typings.awsSdk.awsSdkStrings.t3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.t3aDotnano
  - typings.awsSdk.awsSdkStrings.t3aDotmicro
  - typings.awsSdk.awsSdkStrings.t3aDotsmall
  - typings.awsSdk.awsSdkStrings.t3aDotmedium
  - typings.awsSdk.awsSdkStrings.t3aDotlarge
  - typings.awsSdk.awsSdkStrings.t3aDotxlarge
  - typings.awsSdk.awsSdkStrings.t3aDot2xlarge
  - typings.awsSdk.awsSdkStrings.t4gDotnano
  - typings.awsSdk.awsSdkStrings.t4gDotmicro
  - typings.awsSdk.awsSdkStrings.t4gDotsmall
  - typings.awsSdk.awsSdkStrings.t4gDotmedium
  - typings.awsSdk.awsSdkStrings.t4gDotlarge
  - typings.awsSdk.awsSdkStrings.t4gDotxlarge
  - typings.awsSdk.awsSdkStrings.t4gDot2xlarge
  - typings.awsSdk.awsSdkStrings.`u-6tb1Dot56xlarge`
  - typings.awsSdk.awsSdkStrings.`u-6tb1Dot112xlarge`
  - typings.awsSdk.awsSdkStrings.`u-9tb1Dot112xlarge`
  - typings.awsSdk.awsSdkStrings.`u-12tb1Dot112xlarge`
  - typings.awsSdk.awsSdkStrings.`u-6tb1Dotmetal`
  - typings.awsSdk.awsSdkStrings.`u-9tb1Dotmetal`
  - typings.awsSdk.awsSdkStrings.`u-12tb1Dotmetal`
  - typings.awsSdk.awsSdkStrings.`u-18tb1Dotmetal`
  - typings.awsSdk.awsSdkStrings.`u-24tb1Dotmetal`
  - typings.awsSdk.awsSdkStrings.vt1Dot3xlarge
  - typings.awsSdk.awsSdkStrings.vt1Dot6xlarge
  - typings.awsSdk.awsSdkStrings.vt1Dot24xlarge
  - typings.awsSdk.awsSdkStrings.x1Dot16xlarge
  - typings.awsSdk.awsSdkStrings.x1Dot32xlarge
  - typings.awsSdk.awsSdkStrings.x1eDotxlarge
  - typings.awsSdk.awsSdkStrings.x1eDot2xlarge
  - typings.awsSdk.awsSdkStrings.x1eDot4xlarge
  - typings.awsSdk.awsSdkStrings.x1eDot8xlarge
  - typings.awsSdk.awsSdkStrings.x1eDot16xlarge
  - typings.awsSdk.awsSdkStrings.x1eDot32xlarge
  - typings.awsSdk.awsSdkStrings.x2ieznDot2xlarge
  - typings.awsSdk.awsSdkStrings.x2ieznDot4xlarge
  - typings.awsSdk.awsSdkStrings.x2ieznDot6xlarge
  - typings.awsSdk.awsSdkStrings.x2ieznDot8xlarge
  - typings.awsSdk.awsSdkStrings.x2ieznDot12xlarge
  - typings.awsSdk.awsSdkStrings.x2ieznDotmetal
  - typings.awsSdk.awsSdkStrings.x2gdDotmedium
  - typings.awsSdk.awsSdkStrings.x2gdDotlarge
  - typings.awsSdk.awsSdkStrings.x2gdDotxlarge
  - typings.awsSdk.awsSdkStrings.x2gdDot2xlarge
  - typings.awsSdk.awsSdkStrings.x2gdDot4xlarge
  - typings.awsSdk.awsSdkStrings.x2gdDot8xlarge
  - typings.awsSdk.awsSdkStrings.x2gdDot12xlarge
  - typings.awsSdk.awsSdkStrings.x2gdDot16xlarge
  - typings.awsSdk.awsSdkStrings.x2gdDotmetal
  - typings.awsSdk.awsSdkStrings.z1dDotlarge
  - typings.awsSdk.awsSdkStrings.z1dDotxlarge
  - typings.awsSdk.awsSdkStrings.z1dDot2xlarge
  - typings.awsSdk.awsSdkStrings.z1dDot3xlarge
  - typings.awsSdk.awsSdkStrings.z1dDot6xlarge
  - typings.awsSdk.awsSdkStrings.z1dDot12xlarge
  - typings.awsSdk.awsSdkStrings.z1dDotmetal
  - typings.awsSdk.awsSdkStrings.x2idnDot16xlarge
  - typings.awsSdk.awsSdkStrings.x2idnDot24xlarge
  - typings.awsSdk.awsSdkStrings.x2idnDot32xlarge
  - typings.awsSdk.awsSdkStrings.x2iednDotxlarge
  - typings.awsSdk.awsSdkStrings.x2iednDot2xlarge
  - typings.awsSdk.awsSdkStrings.x2iednDot4xlarge
  - typings.awsSdk.awsSdkStrings.x2iednDot8xlarge
  - typings.awsSdk.awsSdkStrings.x2iednDot16xlarge
  - typings.awsSdk.awsSdkStrings.x2iednDot24xlarge
  - typings.awsSdk.awsSdkStrings.x2iednDot32xlarge
  - typings.awsSdk.awsSdkStrings.c6aDotlarge
  - typings.awsSdk.awsSdkStrings.c6aDotxlarge
  - typings.awsSdk.awsSdkStrings.c6aDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot24xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot32xlarge
  - typings.awsSdk.awsSdkStrings.c6aDot48xlarge
  - typings.awsSdk.awsSdkStrings.c6aDotmetal
  - typings.awsSdk.awsSdkStrings.m6aDotmetal
  - typings.awsSdk.awsSdkStrings.i4iDotlarge
  - typings.awsSdk.awsSdkStrings.i4iDotxlarge
  - typings.awsSdk.awsSdkStrings.i4iDot2xlarge
  - typings.awsSdk.awsSdkStrings.i4iDot4xlarge
  - typings.awsSdk.awsSdkStrings.i4iDot8xlarge
  - typings.awsSdk.awsSdkStrings.i4iDot16xlarge
  - typings.awsSdk.awsSdkStrings.i4iDot32xlarge
  - typings.awsSdk.awsSdkStrings.i4iDotmetal
  - typings.awsSdk.awsSdkStrings.x2idnDotmetal
  - typings.awsSdk.awsSdkStrings.x2iednDotmetal
  - typings.awsSdk.awsSdkStrings.c7gDotmedium
  - typings.awsSdk.awsSdkStrings.c7gDotlarge
  - typings.awsSdk.awsSdkStrings.c7gDotxlarge
  - typings.awsSdk.awsSdkStrings.c7gDot2xlarge
  - typings.awsSdk.awsSdkStrings.c7gDot4xlarge
  - typings.awsSdk.awsSdkStrings.c7gDot8xlarge
  - typings.awsSdk.awsSdkStrings.c7gDot12xlarge
  - typings.awsSdk.awsSdkStrings.c7gDot16xlarge
  - typings.awsSdk.awsSdkStrings.mac2Dotmetal
  - typings.awsSdk.awsSdkStrings.c6idDotlarge
  - typings.awsSdk.awsSdkStrings.c6idDotxlarge
  - typings.awsSdk.awsSdkStrings.c6idDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6idDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6idDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6idDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6idDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6idDot24xlarge
  - typings.awsSdk.awsSdkStrings.c6idDot32xlarge
  - typings.awsSdk.awsSdkStrings.c6idDotmetal
  - typings.awsSdk.awsSdkStrings.m6idDotlarge
  - typings.awsSdk.awsSdkStrings.m6idDotxlarge
  - typings.awsSdk.awsSdkStrings.m6idDot2xlarge
  - typings.awsSdk.awsSdkStrings.m6idDot4xlarge
  - typings.awsSdk.awsSdkStrings.m6idDot8xlarge
  - typings.awsSdk.awsSdkStrings.m6idDot12xlarge
  - typings.awsSdk.awsSdkStrings.m6idDot16xlarge
  - typings.awsSdk.awsSdkStrings.m6idDot24xlarge
  - typings.awsSdk.awsSdkStrings.m6idDot32xlarge
  - typings.awsSdk.awsSdkStrings.m6idDotmetal
  - typings.awsSdk.awsSdkStrings.r6idDotlarge
  - typings.awsSdk.awsSdkStrings.r6idDotxlarge
  - typings.awsSdk.awsSdkStrings.r6idDot2xlarge
  - typings.awsSdk.awsSdkStrings.r6idDot4xlarge
  - typings.awsSdk.awsSdkStrings.r6idDot8xlarge
  - typings.awsSdk.awsSdkStrings.r6idDot12xlarge
  - typings.awsSdk.awsSdkStrings.r6idDot16xlarge
  - typings.awsSdk.awsSdkStrings.r6idDot24xlarge
  - typings.awsSdk.awsSdkStrings.r6idDot32xlarge
  - typings.awsSdk.awsSdkStrings.r6idDotmetal
  - typings.awsSdk.awsSdkStrings.r6aDotlarge
  - typings.awsSdk.awsSdkStrings.r6aDotxlarge
  - typings.awsSdk.awsSdkStrings.r6aDot2xlarge
  - typings.awsSdk.awsSdkStrings.r6aDot4xlarge
  - typings.awsSdk.awsSdkStrings.r6aDot8xlarge
  - typings.awsSdk.awsSdkStrings.r6aDot12xlarge
  - typings.awsSdk.awsSdkStrings.r6aDot16xlarge
  - typings.awsSdk.awsSdkStrings.r6aDot24xlarge
  - typings.awsSdk.awsSdkStrings.r6aDot32xlarge
  - typings.awsSdk.awsSdkStrings.r6aDot48xlarge
  - typings.awsSdk.awsSdkStrings.r6aDotmetal
  - typings.awsSdk.awsSdkStrings.p4deDot24xlarge
  - typings.awsSdk.awsSdkStrings.`u-3tb1Dot56xlarge`
  - typings.awsSdk.awsSdkStrings.`u-18tb1Dot112xlarge`
  - typings.awsSdk.awsSdkStrings.`u-24tb1Dot112xlarge`
  - typings.awsSdk.awsSdkStrings.trn1Dot2xlarge
  - typings.awsSdk.awsSdkStrings.trn1Dot32xlarge
  - typings.awsSdk.awsSdkStrings.hpc6idDot32xlarge
  - typings.awsSdk.awsSdkStrings.c6inDotlarge
  - typings.awsSdk.awsSdkStrings.c6inDotxlarge
  - typings.awsSdk.awsSdkStrings.c6inDot2xlarge
  - typings.awsSdk.awsSdkStrings.c6inDot4xlarge
  - typings.awsSdk.awsSdkStrings.c6inDot8xlarge
  - typings.awsSdk.awsSdkStrings.c6inDot12xlarge
  - typings.awsSdk.awsSdkStrings.c6inDot16xlarge
  - typings.awsSdk.awsSdkStrings.c6inDot24xlarge
  - typings.awsSdk.awsSdkStrings.c6inDot32xlarge
  - typings.awsSdk.awsSdkStrings.m6inDotlarge
  - typings.awsSdk.awsSdkStrings.m6inDotxlarge
  - typings.awsSdk.awsSdkStrings.m6inDot2xlarge
  - typings.awsSdk.awsSdkStrings.m6inDot4xlarge
  - typings.awsSdk.awsSdkStrings.m6inDot8xlarge
  - typings.awsSdk.awsSdkStrings.m6inDot12xlarge
  - typings.awsSdk.awsSdkStrings.m6inDot16xlarge
  - typings.awsSdk.awsSdkStrings.m6inDot24xlarge
  - typings.awsSdk.awsSdkStrings.m6inDot32xlarge
  - typings.awsSdk.awsSdkStrings.m6idnDotlarge
  - typings.awsSdk.awsSdkStrings.m6idnDotxlarge
  - typings.awsSdk.awsSdkStrings.m6idnDot2xlarge
  - typings.awsSdk.awsSdkStrings.m6idnDot4xlarge
  - typings.awsSdk.awsSdkStrings.m6idnDot8xlarge
  - typings.awsSdk.awsSdkStrings.m6idnDot12xlarge
  - typings.awsSdk.awsSdkStrings.m6idnDot16xlarge
  - typings.awsSdk.awsSdkStrings.m6idnDot24xlarge
  - typings.awsSdk.awsSdkStrings.m6idnDot32xlarge
  - typings.awsSdk.awsSdkStrings.r6inDotlarge
  - typings.awsSdk.awsSdkStrings.r6inDotxlarge
  - typings.awsSdk.awsSdkStrings.r6inDot2xlarge
  - typings.awsSdk.awsSdkStrings.r6inDot4xlarge
  - typings.awsSdk.awsSdkStrings.r6inDot8xlarge
  - typings.awsSdk.awsSdkStrings.r6inDot12xlarge
  - typings.awsSdk.awsSdkStrings.r6inDot16xlarge
  - typings.awsSdk.awsSdkStrings.r6inDot24xlarge
  - typings.awsSdk.awsSdkStrings.r6inDot32xlarge
  - typings.awsSdk.awsSdkStrings.r6idnDotlarge
  - typings.awsSdk.awsSdkStrings.r6idnDotxlarge
  - typings.awsSdk.awsSdkStrings.r6idnDot2xlarge
  - typings.awsSdk.awsSdkStrings.r6idnDot4xlarge
  - typings.awsSdk.awsSdkStrings.r6idnDot8xlarge
  - typings.awsSdk.awsSdkStrings.r6idnDot12xlarge
  - typings.awsSdk.awsSdkStrings.r6idnDot16xlarge
  - typings.awsSdk.awsSdkStrings.r6idnDot24xlarge
  - typings.awsSdk.awsSdkStrings.r6idnDot32xlarge
  - typings.awsSdk.awsSdkStrings.c7gDotmetal
  - typings.awsSdk.awsSdkStrings.m7gDotmedium
  - typings.awsSdk.awsSdkStrings.m7gDotlarge
  - typings.awsSdk.awsSdkStrings.m7gDotxlarge
  - typings.awsSdk.awsSdkStrings.m7gDot2xlarge
  - typings.awsSdk.awsSdkStrings.m7gDot4xlarge
  - typings.awsSdk.awsSdkStrings.m7gDot8xlarge
  - typings.awsSdk.awsSdkStrings.m7gDot12xlarge
  - typings.awsSdk.awsSdkStrings.m7gDot16xlarge
  - typings.awsSdk.awsSdkStrings.m7gDotmetal
  - typings.awsSdk.awsSdkStrings.r7gDotmedium
  - typings.awsSdk.awsSdkStrings.r7gDotlarge
  - typings.awsSdk.awsSdkStrings.r7gDotxlarge
  - typings.awsSdk.awsSdkStrings.r7gDot2xlarge
  - typings.awsSdk.awsSdkStrings.r7gDot4xlarge
  - typings.awsSdk.awsSdkStrings.r7gDot8xlarge
  - typings.awsSdk.awsSdkStrings.r7gDot12xlarge
  - typings.awsSdk.awsSdkStrings.r7gDot16xlarge
  - typings.awsSdk.awsSdkStrings.r7gDotmetal
  - typings.awsSdk.awsSdkStrings.c6inDotmetal
  - typings.awsSdk.awsSdkStrings.m6inDotmetal
  - typings.awsSdk.awsSdkStrings.m6idnDotmetal
  - typings.awsSdk.awsSdkStrings.r6inDotmetal
  - typings.awsSdk.awsSdkStrings.r6idnDotmetal
  - typings.awsSdk.awsSdkStrings.inf2Dotxlarge
  - typings.awsSdk.awsSdkStrings.inf2Dot8xlarge
  - typings.awsSdk.awsSdkStrings.inf2Dot24xlarge
  - typings.awsSdk.awsSdkStrings.inf2Dot48xlarge
  - typings.awsSdk.awsSdkStrings.trn1nDot32xlarge
  - java.lang.String
*/
type InstanceType = _InstanceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.nitro
  - typings.awsSdk.awsSdkStrings.xen
  - java.lang.String
*/
type InstanceTypeHypervisor = _InstanceTypeHypervisor | java.lang.String

type InstanceTypeInfoFromInstanceRequirementsSet = js.Array[InstanceTypeInfoFromInstanceRequirements]

type InstanceTypeInfoList = js.Array[InstanceTypeInfo]

type InstanceTypeList = js.Array[InstanceType]

type InstanceTypeOfferingsList = js.Array[InstanceTypeOffering]

type InstanceTypes = js.Array[String]

type InstanceTypesList = js.Array[String]

type InstanceUsageSet = js.Array[InstanceUsage]

type Integer = scala.Double

type IntegerWithConstraints = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`INSTANCE-ATTACH`
  - typings.awsSdk.awsSdkStrings.`EIP-ASSOCIATE`
  - java.lang.String
*/
type InterfacePermissionType = _InterfacePermissionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VLAN
  - typings.awsSdk.awsSdkStrings.GRE
  - java.lang.String
*/
type InterfaceProtocolType = _InterfaceProtocolType | java.lang.String

type InternetGatewayAttachmentList = js.Array[InternetGatewayAttachment]

type InternetGatewayId = java.lang.String

type InternetGatewayIdList = js.Array[InternetGatewayId]

type InternetGatewayList = js.Array[InternetGateway]

type IpAddress = java.lang.String

type IpAddressList = js.Array[IpAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ipv4__
  - typings.awsSdk.awsSdkStrings.dualstack_
  - typings.awsSdk.awsSdkStrings.ipv6__
  - java.lang.String
*/
type IpAddressType = _IpAddressType | java.lang.String

type IpList = js.Array[String]

type IpPermissionList = js.Array[IpPermission]

type IpPrefixList = js.Array[String]

type IpRangeList = js.Array[IpRange]

type IpRanges = js.Array[String]

type IpamAddressHistoryMaxResults = scala.Double

type IpamAddressHistoryRecordSet = js.Array[IpamAddressHistoryRecord]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.eip
  - typings.awsSdk.awsSdkStrings.vpc__
  - typings.awsSdk.awsSdkStrings.subnet__
  - typings.awsSdk.awsSdkStrings.`network-interface`
  - typings.awsSdk.awsSdkStrings.instance__
  - java.lang.String
*/
type IpamAddressHistoryResourceType = _IpamAddressHistoryResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.`not-found`
  - java.lang.String
*/
type IpamAssociatedResourceDiscoveryStatus = _IpamAssociatedResourceDiscoveryStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.compliant_
  - typings.awsSdk.awsSdkStrings.noncompliant_
  - typings.awsSdk.awsSdkStrings.unmanaged_
  - typings.awsSdk.awsSdkStrings.ignored
  - java.lang.String
*/
type IpamComplianceStatus = _IpamComplianceStatus | java.lang.String

type IpamDiscoveredAccountSet = js.Array[IpamDiscoveredAccount]

type IpamDiscoveredResourceCidrSet = js.Array[IpamDiscoveredResourceCidr]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`assume-role-failure`
  - typings.awsSdk.awsSdkStrings.`throttling-failure`
  - typings.awsSdk.awsSdkStrings.`unauthorized-failure`
  - java.lang.String
*/
type IpamDiscoveryFailureCode = _IpamDiscoveryFailureCode | java.lang.String

type IpamId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.managed_
  - typings.awsSdk.awsSdkStrings.unmanaged_
  - typings.awsSdk.awsSdkStrings.ignored
  - java.lang.String
*/
type IpamManagementState = _IpamManagementState | java.lang.String

type IpamMaxResults = scala.Double

type IpamNetmaskLength = scala.Double

type IpamOperatingRegionSet = js.Array[IpamOperatingRegion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.overlapping
  - typings.awsSdk.awsSdkStrings.nonoverlapping
  - typings.awsSdk.awsSdkStrings.ignored
  - java.lang.String
*/
type IpamOverlapStatus = _IpamOverlapStatus | java.lang.String

type IpamPoolAllocationDisallowedCidrs = js.Array[String]

type IpamPoolAllocationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`ipam-pool`
  - typings.awsSdk.awsSdkStrings.vpc__
  - typings.awsSdk.awsSdkStrings.`ec2-public-ipv4-pool`
  - typings.awsSdk.awsSdkStrings.custom__
  - java.lang.String
*/
type IpamPoolAllocationResourceType = _IpamPoolAllocationResourceType | java.lang.String

type IpamPoolAllocationSet = js.Array[IpamPoolAllocation]

type IpamPoolAwsService = ec2_ | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`cidr-not-available`
  - typings.awsSdk.awsSdkStrings.`limit-exceeded`
  - java.lang.String
*/
type IpamPoolCidrFailureCode = _IpamPoolCidrFailureCode | java.lang.String

type IpamPoolCidrId = java.lang.String

type IpamPoolCidrSet = js.Array[IpamPoolCidr]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`pending-provision`
  - typings.awsSdk.awsSdkStrings.provisioned__
  - typings.awsSdk.awsSdkStrings.`failed-provision`
  - typings.awsSdk.awsSdkStrings.`pending-deprovision`
  - typings.awsSdk.awsSdkStrings.deprovisioned_
  - typings.awsSdk.awsSdkStrings.`failed-deprovision`
  - typings.awsSdk.awsSdkStrings.`pending-import`
  - typings.awsSdk.awsSdkStrings.`failed-import`
  - java.lang.String
*/
type IpamPoolCidrState = _IpamPoolCidrState | java.lang.String

type IpamPoolId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.amazon__
  - typings.awsSdk.awsSdkStrings.byoip
  - java.lang.String
*/
type IpamPoolPublicIpSource = _IpamPoolPublicIpSource | java.lang.String

type IpamPoolSet = js.Array[IpamPool]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`create-in-progress`
  - typings.awsSdk.awsSdkStrings.`create-complete`
  - typings.awsSdk.awsSdkStrings.`create-failed`
  - typings.awsSdk.awsSdkStrings.`modify-in-progress`
  - typings.awsSdk.awsSdkStrings.`modify-complete`
  - typings.awsSdk.awsSdkStrings.`modify-failed`
  - typings.awsSdk.awsSdkStrings.`delete-in-progress`
  - typings.awsSdk.awsSdkStrings.`delete-complete`
  - typings.awsSdk.awsSdkStrings.`delete-failed`
  - typings.awsSdk.awsSdkStrings.`isolate-in-progress`
  - typings.awsSdk.awsSdkStrings.`isolate-complete`
  - typings.awsSdk.awsSdkStrings.`restore-in-progress`
  - java.lang.String
*/
type IpamPoolState = _IpamPoolState | java.lang.String

type IpamResourceCidrSet = js.Array[IpamResourceCidr]

type IpamResourceDiscoveryAssociationId = java.lang.String

type IpamResourceDiscoveryAssociationSet = js.Array[IpamResourceDiscoveryAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`associate-in-progress`
  - typings.awsSdk.awsSdkStrings.`associate-complete`
  - typings.awsSdk.awsSdkStrings.`associate-failed`
  - typings.awsSdk.awsSdkStrings.`disassociate-in-progress`
  - typings.awsSdk.awsSdkStrings.`disassociate-complete`
  - typings.awsSdk.awsSdkStrings.`disassociate-failed`
  - typings.awsSdk.awsSdkStrings.`isolate-in-progress`
  - typings.awsSdk.awsSdkStrings.`isolate-complete`
  - typings.awsSdk.awsSdkStrings.`restore-in-progress`
  - java.lang.String
*/
type IpamResourceDiscoveryAssociationState = _IpamResourceDiscoveryAssociationState | java.lang.String

type IpamResourceDiscoveryId = java.lang.String

type IpamResourceDiscoverySet = js.Array[IpamResourceDiscovery]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`create-in-progress`
  - typings.awsSdk.awsSdkStrings.`create-complete`
  - typings.awsSdk.awsSdkStrings.`create-failed`
  - typings.awsSdk.awsSdkStrings.`modify-in-progress`
  - typings.awsSdk.awsSdkStrings.`modify-complete`
  - typings.awsSdk.awsSdkStrings.`modify-failed`
  - typings.awsSdk.awsSdkStrings.`delete-in-progress`
  - typings.awsSdk.awsSdkStrings.`delete-complete`
  - typings.awsSdk.awsSdkStrings.`delete-failed`
  - typings.awsSdk.awsSdkStrings.`isolate-in-progress`
  - typings.awsSdk.awsSdkStrings.`isolate-complete`
  - typings.awsSdk.awsSdkStrings.`restore-in-progress`
  - java.lang.String
*/
type IpamResourceDiscoveryState = _IpamResourceDiscoveryState | java.lang.String

type IpamResourceTagList = js.Array[IpamResourceTag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.vpc__
  - typings.awsSdk.awsSdkStrings.subnet__
  - typings.awsSdk.awsSdkStrings.eip
  - typings.awsSdk.awsSdkStrings.`public-ipv4-pool`
  - typings.awsSdk.awsSdkStrings.`ipv6-pool`
  - java.lang.String
*/
type IpamResourceType = _IpamResourceType | java.lang.String

type IpamScopeId = java.lang.String

type IpamScopeSet = js.Array[IpamScope]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`create-in-progress`
  - typings.awsSdk.awsSdkStrings.`create-complete`
  - typings.awsSdk.awsSdkStrings.`create-failed`
  - typings.awsSdk.awsSdkStrings.`modify-in-progress`
  - typings.awsSdk.awsSdkStrings.`modify-complete`
  - typings.awsSdk.awsSdkStrings.`modify-failed`
  - typings.awsSdk.awsSdkStrings.`delete-in-progress`
  - typings.awsSdk.awsSdkStrings.`delete-complete`
  - typings.awsSdk.awsSdkStrings.`delete-failed`
  - typings.awsSdk.awsSdkStrings.`isolate-in-progress`
  - typings.awsSdk.awsSdkStrings.`isolate-complete`
  - typings.awsSdk.awsSdkStrings.`restore-in-progress`
  - java.lang.String
*/
type IpamScopeState = _IpamScopeState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.public__
  - typings.awsSdk.awsSdkStrings.private__
  - java.lang.String
*/
type IpamScopeType = _IpamScopeType | java.lang.String

type IpamSet = js.Array[Ipam]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`create-in-progress`
  - typings.awsSdk.awsSdkStrings.`create-complete`
  - typings.awsSdk.awsSdkStrings.`create-failed`
  - typings.awsSdk.awsSdkStrings.`modify-in-progress`
  - typings.awsSdk.awsSdkStrings.`modify-complete`
  - typings.awsSdk.awsSdkStrings.`modify-failed`
  - typings.awsSdk.awsSdkStrings.`delete-in-progress`
  - typings.awsSdk.awsSdkStrings.`delete-complete`
  - typings.awsSdk.awsSdkStrings.`delete-failed`
  - typings.awsSdk.awsSdkStrings.`isolate-in-progress`
  - typings.awsSdk.awsSdkStrings.`isolate-complete`
  - typings.awsSdk.awsSdkStrings.`restore-in-progress`
  - java.lang.String
*/
type IpamState = _IpamState | java.lang.String

type Ipv4PoolCoipId = java.lang.String

type Ipv4PoolEc2Id = java.lang.String

type Ipv4PrefixList = js.Array[Ipv4PrefixSpecificationRequest]

type Ipv4PrefixListResponse = js.Array[Ipv4PrefixSpecificationResponse]

type Ipv4PrefixesList = js.Array[Ipv4PrefixSpecification]

type Ipv6Address = java.lang.String

type Ipv6AddressList = js.Array[String]

type Ipv6CidrAssociationSet = js.Array[Ipv6CidrAssociation]

type Ipv6CidrBlockSet = js.Array[Ipv6CidrBlock]

type Ipv6Flag = scala.Boolean

type Ipv6PoolEc2Id = java.lang.String

type Ipv6PoolIdList = js.Array[Ipv6PoolEc2Id]

type Ipv6PoolMaxResults = scala.Double

type Ipv6PoolSet = js.Array[Ipv6Pool]

type Ipv6PrefixList = js.Array[Ipv6PrefixSpecificationRequest]

type Ipv6PrefixListResponse = js.Array[Ipv6PrefixSpecificationResponse]

type Ipv6PrefixesList = js.Array[Ipv6PrefixSpecification]

type Ipv6RangeList = js.Array[Ipv6Range]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type Ipv6SupportValue = _Ipv6SupportValue | java.lang.String

type KernelId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pem_
  - typings.awsSdk.awsSdkStrings.ppk
  - java.lang.String
*/
type KeyFormat = _KeyFormat | java.lang.String

type KeyNameStringList = js.Array[KeyPairName]

type KeyPairId = java.lang.String

type KeyPairIdStringList = js.Array[KeyPairId]

type KeyPairList = js.Array[KeyPairInfo]

type KeyPairName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.rsa_
  - typings.awsSdk.awsSdkStrings.ed25519_
  - java.lang.String
*/
type KeyType = _KeyType | java.lang.String

type KmsKeyId = java.lang.String

type LaunchPermissionList = js.Array[LaunchPermission]

type LaunchSpecsList = js.Array[SpotFleetLaunchSpecification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.default__
  - typings.awsSdk.awsSdkStrings.disabled__
  - java.lang.String
*/
type LaunchTemplateAutoRecoveryState = _LaunchTemplateAutoRecoveryState | java.lang.String

type LaunchTemplateBlockDeviceMappingList = js.Array[LaunchTemplateBlockDeviceMapping]

type LaunchTemplateBlockDeviceMappingRequestList = js.Array[LaunchTemplateBlockDeviceMappingRequest]

type LaunchTemplateConfigList = js.Array[LaunchTemplateConfig]

type LaunchTemplateElasticInferenceAcceleratorCount = scala.Double

type LaunchTemplateElasticInferenceAcceleratorList = js.Array[LaunchTemplateElasticInferenceAccelerator]

type LaunchTemplateElasticInferenceAcceleratorResponseList = js.Array[LaunchTemplateElasticInferenceAcceleratorResponse]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.launchTemplateIdDoesNotExist
  - typings.awsSdk.awsSdkStrings.launchTemplateIdMalformed
  - typings.awsSdk.awsSdkStrings.launchTemplateNameDoesNotExist
  - typings.awsSdk.awsSdkStrings.launchTemplateNameMalformed
  - typings.awsSdk.awsSdkStrings.launchTemplateVersionDoesNotExist
  - typings.awsSdk.awsSdkStrings.unexpectedError
  - java.lang.String
*/
type LaunchTemplateErrorCode = _LaunchTemplateErrorCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.optional__
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type LaunchTemplateHttpTokensState = _LaunchTemplateHttpTokensState | java.lang.String

type LaunchTemplateId = java.lang.String

type LaunchTemplateIdStringList = js.Array[LaunchTemplateId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type LaunchTemplateInstanceMetadataEndpointState = _LaunchTemplateInstanceMetadataEndpointState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.applied_
  - java.lang.String
*/
type LaunchTemplateInstanceMetadataOptionsState = _LaunchTemplateInstanceMetadataOptionsState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type LaunchTemplateInstanceMetadataProtocolIpv6 = _LaunchTemplateInstanceMetadataProtocolIpv6 | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type LaunchTemplateInstanceMetadataTagsState = _LaunchTemplateInstanceMetadataTagsState | java.lang.String

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

type ListImagesInRecycleBinMaxResults = scala.Double

type ListSnapshotsInRecycleBinMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.sold
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.pending__
  - java.lang.String
*/
type ListingState = _ListingState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.closed__
  - java.lang.String
*/
type ListingStatus = _ListingStatus | java.lang.String

type LoadBalancerArn = java.lang.String

type LoadPermissionList = js.Array[LoadPermission]

type LoadPermissionListRequest = js.Array[LoadPermissionRequest]

type LocalGatewayId = java.lang.String

type LocalGatewayIdSet = js.Array[LocalGatewayId]

type LocalGatewayMaxResults = scala.Double

type LocalGatewayRouteList = js.Array[LocalGatewayRoute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.blackhole_
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type LocalGatewayRouteState = _LocalGatewayRouteState | java.lang.String

type LocalGatewayRouteTableIdSet = js.Array[LocalGatewayRoutetableId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`direct-vpc-routing`
  - typings.awsSdk.awsSdkStrings.coip
  - java.lang.String
*/
type LocalGatewayRouteTableMode = _LocalGatewayRouteTableMode | java.lang.String

type LocalGatewayRouteTableSet = js.Array[LocalGatewayRouteTable]

type LocalGatewayRouteTableVirtualInterfaceGroupAssociationId = java.lang.String

type LocalGatewayRouteTableVirtualInterfaceGroupAssociationIdSet = js.Array[LocalGatewayRouteTableVirtualInterfaceGroupAssociationId]

type LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet = js.Array[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]

type LocalGatewayRouteTableVpcAssociationId = java.lang.String

type LocalGatewayRouteTableVpcAssociationIdSet = js.Array[LocalGatewayRouteTableVpcAssociationId]

type LocalGatewayRouteTableVpcAssociationSet = js.Array[LocalGatewayRouteTableVpcAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.static__
  - typings.awsSdk.awsSdkStrings.propagated_
  - java.lang.String
*/
type LocalGatewayRouteType = _LocalGatewayRouteType | java.lang.String

type LocalGatewayRoutetableId = java.lang.String

type LocalGatewaySet = js.Array[LocalGateway]

type LocalGatewayVirtualInterfaceGroupId = java.lang.String

type LocalGatewayVirtualInterfaceGroupIdSet = js.Array[LocalGatewayVirtualInterfaceGroupId]

type LocalGatewayVirtualInterfaceGroupSet = js.Array[LocalGatewayVirtualInterfaceGroup]

type LocalGatewayVirtualInterfaceId = java.lang.String

type LocalGatewayVirtualInterfaceIdSet = js.Array[LocalGatewayVirtualInterfaceId]

type LocalGatewayVirtualInterfaceSet = js.Array[LocalGatewayVirtualInterface]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.included
  - typings.awsSdk.awsSdkStrings.required__
  - typings.awsSdk.awsSdkStrings.excluded
  - java.lang.String
*/
type LocalStorage = _LocalStorage | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.hdd_
  - typings.awsSdk.awsSdkStrings.ssd_
  - java.lang.String
*/
type LocalStorageType = _LocalStorageType | java.lang.String

type LocalStorageTypeSet = js.Array[LocalStorageType]

type Location = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.region__
  - typings.awsSdk.awsSdkStrings.`availability-zone`
  - typings.awsSdk.awsSdkStrings.`availability-zone-id`
  - java.lang.String
*/
type LocationType = _LocationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`cloud-watch-logs`
  - typings.awsSdk.awsSdkStrings.s3_
  - typings.awsSdk.awsSdkStrings.`kinesis-data-firehose`
  - java.lang.String
*/
type LogDestinationType = _LogDestinationType | java.lang.String

type Long = scala.Double

type ManagedPrefixListSet = js.Array[ManagedPrefixList]

type MarketType = spot_ | java.lang.String

type MaxIpv4AddrPerInterface = scala.Double

type MaxIpv6AddrPerInterface = scala.Double

type MaxNetworkInterfaces = scala.Double

type MaxResults = scala.Double

type MaxResultsParam = scala.Double

type MaximumBandwidthInMbps = scala.Double

type MaximumEfaInterfaces = scala.Double

type MaximumIops = scala.Double

type MaximumNetworkCards = scala.Double

type MaximumThroughputInMBps = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.static__
  - typings.awsSdk.awsSdkStrings.igmp
  - java.lang.String
*/
type MembershipType = _MembershipType | java.lang.String

type MemorySize = scala.Double

type MetricPoints = js.Array[MetricPoint]

type MetricType = `aggregate-latency` | java.lang.String

type MillisecondDateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`opted-in`
  - typings.awsSdk.awsSdkStrings.`not-opted-in`
  - java.lang.String
*/
type ModifyAvailabilityZoneOptInStatus = _ModifyAvailabilityZoneOptInStatus | java.lang.String

type ModifyVerifiedAccessEndpointSubnetIdList = js.Array[SubnetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.disabling_
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.pending__
  - java.lang.String
*/
type MonitoringState = _MonitoringState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.movingToVpc
  - typings.awsSdk.awsSdkStrings.restoringToClassic
  - java.lang.String
*/
type MoveStatus = _MoveStatus | java.lang.String

type MovingAddressStatusSet = js.Array[MovingAddressStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type MulticastSupportValue = _MulticastSupportValue | java.lang.String

type NatGatewayAddressList = js.Array[NatGatewayAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.assigning
  - typings.awsSdk.awsSdkStrings.unassigning
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.disassociating__
  - typings.awsSdk.awsSdkStrings.succeeded__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type NatGatewayAddressStatus = _NatGatewayAddressStatus | java.lang.String

type NatGatewayId = java.lang.String

type NatGatewayIdStringList = js.Array[NatGatewayId]

type NatGatewayList = js.Array[NatGateway]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type NatGatewayState = _NatGatewayState | java.lang.String

type NetmaskLength = scala.Double

type NetworkAclAssociationId = java.lang.String

type NetworkAclAssociationList = js.Array[NetworkAclAssociation]

type NetworkAclEntryList = js.Array[NetworkAclEntry]

type NetworkAclId = java.lang.String

type NetworkAclIdStringList = js.Array[NetworkAclId]

type NetworkAclList = js.Array[NetworkAcl]

type NetworkCardIndex = scala.Double

type NetworkCardInfoList = js.Array[NetworkCardInfo]

type NetworkInsightsAccessScopeAnalysisId = java.lang.String

type NetworkInsightsAccessScopeAnalysisIdList = js.Array[NetworkInsightsAccessScopeAnalysisId]

type NetworkInsightsAccessScopeAnalysisList = js.Array[NetworkInsightsAccessScopeAnalysis]

type NetworkInsightsAccessScopeId = java.lang.String

type NetworkInsightsAccessScopeIdList = js.Array[NetworkInsightsAccessScopeId]

type NetworkInsightsAccessScopeList = js.Array[NetworkInsightsAccessScope]

type NetworkInsightsAnalysisId = java.lang.String

type NetworkInsightsAnalysisIdList = js.Array[NetworkInsightsAnalysisId]

type NetworkInsightsAnalysisList = js.Array[NetworkInsightsAnalysis]

type NetworkInsightsMaxResults = scala.Double

type NetworkInsightsPathId = java.lang.String

type NetworkInsightsPathIdList = js.Array[NetworkInsightsPathId]

type NetworkInsightsPathList = js.Array[NetworkInsightsPath]

type NetworkInsightsResourceId = java.lang.String

type NetworkInterfaceAttachmentId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.description_
  - typings.awsSdk.awsSdkStrings.groupSet
  - typings.awsSdk.awsSdkStrings.sourceDestCheck
  - typings.awsSdk.awsSdkStrings.attachment_
  - java.lang.String
*/
type NetworkInterfaceAttribute = _NetworkInterfaceAttribute | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.efa
  - typings.awsSdk.awsSdkStrings.branch_
  - typings.awsSdk.awsSdkStrings.trunk
  - java.lang.String
*/
type NetworkInterfaceCreationType = _NetworkInterfaceCreationType | java.lang.String

type NetworkInterfaceId = java.lang.String

type NetworkInterfaceIdList = js.Array[NetworkInterfaceId]

type NetworkInterfaceIpv6AddressesList = js.Array[NetworkInterfaceIpv6Address]

type NetworkInterfaceList = js.Array[NetworkInterface]

type NetworkInterfacePermissionId = java.lang.String

type NetworkInterfacePermissionIdList = js.Array[NetworkInterfacePermissionId]

type NetworkInterfacePermissionList = js.Array[NetworkInterfacePermission]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.granted__
  - typings.awsSdk.awsSdkStrings.revoking_
  - typings.awsSdk.awsSdkStrings.revoked__
  - java.lang.String
*/
type NetworkInterfacePermissionStateCode = _NetworkInterfacePermissionStateCode | java.lang.String

type NetworkInterfacePrivateIpAddressList = js.Array[NetworkInterfacePrivateIpAddress]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.attaching_
  - typings.awsSdk.awsSdkStrings.`in-use`
  - typings.awsSdk.awsSdkStrings.detaching__
  - java.lang.String
*/
type NetworkInterfaceStatus = _NetworkInterfaceStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.interface_
  - typings.awsSdk.awsSdkStrings.natGateway
  - typings.awsSdk.awsSdkStrings.efa
  - typings.awsSdk.awsSdkStrings.trunk
  - typings.awsSdk.awsSdkStrings.load_balancer
  - typings.awsSdk.awsSdkStrings.network_load_balancer
  - typings.awsSdk.awsSdkStrings.vpc_endpoint_
  - typings.awsSdk.awsSdkStrings.branch_
  - typings.awsSdk.awsSdkStrings.transit_gateway_
  - typings.awsSdk.awsSdkStrings.lambda__
  - typings.awsSdk.awsSdkStrings.quicksight_
  - typings.awsSdk.awsSdkStrings.global_accelerator_managed
  - typings.awsSdk.awsSdkStrings.api_gateway_managed
  - typings.awsSdk.awsSdkStrings.gateway_load_balancer
  - typings.awsSdk.awsSdkStrings.gateway_load_balancer_endpoint
  - typings.awsSdk.awsSdkStrings.iot_rules_managed
  - typings.awsSdk.awsSdkStrings.aws_codestar_connections_managed
  - java.lang.String
*/
type NetworkInterfaceType = _NetworkInterfaceType | java.lang.String

type NetworkPerformance = java.lang.String

type NewDhcpConfigurationList = js.Array[NewDhcpConfiguration]

type NextToken = java.lang.String

type OccurrenceDayRequestSet = js.Array[Integer]

type OccurrenceDaySet = js.Array[Integer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.convertible_
  - java.lang.String
*/
type OfferingClassType = _OfferingClassType | java.lang.String

type OfferingId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`Heavy Utilization`
  - typings.awsSdk.awsSdkStrings.`Medium Utilization`
  - typings.awsSdk.awsSdkStrings.`Light Utilization`
  - typings.awsSdk.awsSdkStrings.`No Upfront`
  - typings.awsSdk.awsSdkStrings.`Partial Upfront`
  - typings.awsSdk.awsSdkStrings.`All Upfront`
  - java.lang.String
*/
type OfferingTypeValues = _OfferingTypeValues | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.lowestPrice
  - typings.awsSdk.awsSdkStrings.prioritized_
  - java.lang.String
*/
type OnDemandAllocationStrategy = _OnDemandAllocationStrategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.add__
  - typings.awsSdk.awsSdkStrings.remove__
  - java.lang.String
*/
type OperationType = _OperationType | java.lang.String

type OrganizationArnStringList = js.Array[String]

type OrganizationalUnitArnStringList = js.Array[String]

type OutpostArn = java.lang.String

type OwnerStringList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.none__
  - typings.awsSdk.awsSdkStrings.daily__
  - typings.awsSdk.awsSdkStrings.weekly__
  - typings.awsSdk.awsSdkStrings.monthly__
  - java.lang.String
*/
type PartitionLoadFrequency = _PartitionLoadFrequency | java.lang.String

type PathComponentList = js.Array[PathComponent]

type PayerResponsibility = ServiceOwner | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AllUpfront
  - typings.awsSdk.awsSdkStrings.PartialUpfront
  - typings.awsSdk.awsSdkStrings.NoUpfront
  - java.lang.String
*/
type PaymentOption = _PaymentOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`five-minutes`
  - typings.awsSdk.awsSdkStrings.`fifteen-minutes`
  - typings.awsSdk.awsSdkStrings.`one-hour`
  - typings.awsSdk.awsSdkStrings.`three-hours`
  - typings.awsSdk.awsSdkStrings.`one-day`
  - typings.awsSdk.awsSdkStrings.`one-week`
  - java.lang.String
*/
type PeriodType = _PeriodType | java.lang.String

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

type PlacementGroupArn = java.lang.String

type PlacementGroupId = java.lang.String

type PlacementGroupIdStringList = js.Array[PlacementGroupId]

type PlacementGroupList = js.Array[PlacementGroup]

type PlacementGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type PlacementGroupState = _PlacementGroupState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.cluster_
  - typings.awsSdk.awsSdkStrings.partition__
  - typings.awsSdk.awsSdkStrings.spread_
  - java.lang.String
*/
type PlacementGroupStrategy = _PlacementGroupStrategy | java.lang.String

type PlacementGroupStrategyList = js.Array[PlacementGroupStrategy]

type PlacementGroupStringList = js.Array[PlacementGroupName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.cluster_
  - typings.awsSdk.awsSdkStrings.spread_
  - typings.awsSdk.awsSdkStrings.partition__
  - java.lang.String
*/
type PlacementStrategy = _PlacementStrategy | java.lang.String

type PlatformValues = Windows_ | java.lang.String

type PoolCidrBlocksSet = js.Array[PoolCidrBlock]

type PoolMaxResults = scala.Double

type Port = scala.Double

type PortRangeList = js.Array[PortRange]

type PrefixListAssociationSet = js.Array[PrefixListAssociation]

type PrefixListEntrySet = js.Array[PrefixListEntry]

type PrefixListIdList = js.Array[PrefixListId]

type PrefixListIdSet = js.Array[String]

type PrefixListMaxResults = scala.Double

type PrefixListResourceId = java.lang.String

type PrefixListResourceIdStringList = js.Array[PrefixListResourceId]

type PrefixListSet = js.Array[PrefixList]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`create-in-progress`
  - typings.awsSdk.awsSdkStrings.`create-complete`
  - typings.awsSdk.awsSdkStrings.`create-failed`
  - typings.awsSdk.awsSdkStrings.`modify-in-progress`
  - typings.awsSdk.awsSdkStrings.`modify-complete`
  - typings.awsSdk.awsSdkStrings.`modify-failed`
  - typings.awsSdk.awsSdkStrings.`restore-in-progress`
  - typings.awsSdk.awsSdkStrings.`restore-complete`
  - typings.awsSdk.awsSdkStrings.`restore-failed`
  - typings.awsSdk.awsSdkStrings.`delete-in-progress`
  - typings.awsSdk.awsSdkStrings.`delete-complete`
  - typings.awsSdk.awsSdkStrings.`delete-failed`
  - java.lang.String
*/
type PrefixListState = _PrefixListState | java.lang.String

type PriceScheduleList = js.Array[PriceSchedule]

type PriceScheduleSpecificationList = js.Array[PriceScheduleSpecification]

type PricingDetailsList = js.Array[PricingDetail]

type PrincipalIdFormatList = js.Array[PrincipalIdFormat]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.All_
  - typings.awsSdk.awsSdkStrings.Service_
  - typings.awsSdk.awsSdkStrings.OrganizationUnit
  - typings.awsSdk.awsSdkStrings.Account_
  - typings.awsSdk.awsSdkStrings.User_
  - typings.awsSdk.awsSdkStrings.Role_
  - java.lang.String
*/
type PrincipalType = _PrincipalType | java.lang.String

type Priority = scala.Double

type PrivateDnsDetailsSet = js.Array[PrivateDnsDetails]

type PrivateIpAddressConfigSet = js.Array[ScheduledInstancesPrivateIpAddressConfig]

type PrivateIpAddressCount = scala.Double

type PrivateIpAddressSpecificationList = js.Array[PrivateIpAddressSpecification]

type PrivateIpAddressStringList = js.Array[String]

type ProcessorSustainedClockSpeed = scala.Double

type ProductCodeList = js.Array[ProductCode]

type ProductCodeStringList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.devpay
  - typings.awsSdk.awsSdkStrings.marketplace_
  - java.lang.String
*/
type ProductCodeValues = _ProductCodeValues | java.lang.String

type ProductDescriptionList = js.Array[String]

type PropagatingVgwList = js.Array[PropagatingVgw]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.tcp_
  - typings.awsSdk.awsSdkStrings.udp_
  - java.lang.String
*/
type Protocol = _Protocol | java.lang.String

type ProtocolInt = scala.Double

type ProtocolIntList = js.Array[ProtocolInt]

type ProtocolList = js.Array[Protocol]

type ProtocolValue = gre_ | java.lang.String

type PublicIpAddress = java.lang.String

type PublicIpStringList = js.Array[String]

type PublicIpv4PoolIdStringList = js.Array[Ipv4PoolEc2Id]

type PublicIpv4PoolRangeSet = js.Array[PublicIpv4PoolRange]

type PublicIpv4PoolSet = js.Array[PublicIpv4Pool]

type PurchaseRequestSet = js.Array[PurchaseRequest]

type PurchaseSet = js.Array[Purchase]

type PurchasedScheduledInstanceSet = js.Array[ScheduledInstance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LinuxSlashUNIX
  - / * Linux/UNIX (Amazon VPC) * / java.lang.String
  - typings.awsSdk.awsSdkStrings.Windows_
*/
type RIProductDescription = _RIProductDescription | (/* Linux/UNIX (Amazon VPC) */ java.lang.String)

type RamdiskId = java.lang.String

type ReasonCodesList = js.Array[ReportInstanceReasonCodes]

type RecurringChargeFrequency = Hourly_ | java.lang.String

type RecurringChargesList = js.Array[RecurringCharge]

type RegionList = js.Array[Region]

type RegionNameStringList = js.Array[String]

type RegionNames = js.Array[String]

type RemoveIpamOperatingRegionSet = js.Array[RemoveIpamOperatingRegion]

type RemovePrefixListEntries = js.Array[RemovePrefixListEntry]

type ReplaceRootVolumeTaskId = java.lang.String

type ReplaceRootVolumeTaskIds = js.Array[ReplaceRootVolumeTaskId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.`in-progress`
  - typings.awsSdk.awsSdkStrings.failing__
  - typings.awsSdk.awsSdkStrings.succeeded__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.`failed-detached`
  - java.lang.String
*/
type ReplaceRootVolumeTaskState = _ReplaceRootVolumeTaskState | java.lang.String

type ReplaceRootVolumeTasks = js.Array[ReplaceRootVolumeTask]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.launch_
  - typings.awsSdk.awsSdkStrings.`launch-before-terminate`
  - java.lang.String
*/
type ReplacementStrategy = _ReplacementStrategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`instance-stuck-in-state`
  - typings.awsSdk.awsSdkStrings.unresponsive
  - typings.awsSdk.awsSdkStrings.`not-accepting-credentials`
  - typings.awsSdk.awsSdkStrings.`password-not-available`
  - typings.awsSdk.awsSdkStrings.`performance-network`
  - typings.awsSdk.awsSdkStrings.`performance-instance-store`
  - typings.awsSdk.awsSdkStrings.`performance-ebs-volume`
  - typings.awsSdk.awsSdkStrings.`performance-other`
  - typings.awsSdk.awsSdkStrings.other__
  - java.lang.String
*/
type ReportInstanceReasonCodes = _ReportInstanceReasonCodes | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ok__
  - typings.awsSdk.awsSdkStrings.impaired__
  - java.lang.String
*/
type ReportStatusType = _ReportStatusType | java.lang.String

type RequestHostIdList = js.Array[DedicatedHostId]

type RequestHostIdSet = js.Array[DedicatedHostId]

type RequestInstanceTypeList = js.Array[InstanceType]

type RequestIpamResourceTagList = js.Array[RequestIpamResourceTag]

type RequestSpotLaunchSpecificationSecurityGroupIdList = js.Array[SecurityGroupId]

type RequestSpotLaunchSpecificationSecurityGroupList = js.Array[String]

type ReservationFleetInstanceSpecificationList = js.Array[ReservationFleetInstanceSpecification]

type ReservationId = java.lang.String

type ReservationList = js.Array[Reservation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`payment-pending`
  - typings.awsSdk.awsSdkStrings.`payment-failed`
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.retired_
  - java.lang.String
*/
type ReservationState = _ReservationState | java.lang.String

type ReservedInstanceIdSet = js.Array[ReservationId]

type ReservedInstanceReservationValueSet = js.Array[ReservedInstanceReservationValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`payment-pending`
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.`payment-failed`
  - typings.awsSdk.awsSdkStrings.retired_
  - typings.awsSdk.awsSdkStrings.queued__
  - typings.awsSdk.awsSdkStrings.`queued-deleted`
  - java.lang.String
*/
type ReservedInstanceState = _ReservedInstanceState | java.lang.String

type ReservedInstancesConfigurationList = js.Array[ReservedInstancesConfiguration]

type ReservedInstancesIdStringList = js.Array[ReservationId]

type ReservedInstancesList = js.Array[ReservedInstances]

type ReservedInstancesListingId = java.lang.String

type ReservedInstancesListingList = js.Array[ReservedInstancesListing]

type ReservedInstancesModificationId = java.lang.String

type ReservedInstancesModificationIdStringList = js.Array[ReservedInstancesModificationId]

type ReservedInstancesModificationList = js.Array[ReservedInstancesModification]

type ReservedInstancesModificationResultList = js.Array[ReservedInstancesModificationResult]

type ReservedInstancesOfferingId = java.lang.String

type ReservedInstancesOfferingIdStringList = js.Array[ReservedInstancesOfferingId]

type ReservedInstancesOfferingList = js.Array[ReservedInstancesOffering]

type ReservedIntancesIds = js.Array[ReservedInstancesId]

type ResetFpgaImageAttributeName = loadPermission | java.lang.String

type ResetImageAttributeName = launchPermission | java.lang.String

type ResourceArn = java.lang.String

type ResourceIdList = js.Array[TaggableResourceId]

type ResourceList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`capacity-reservation`
  - typings.awsSdk.awsSdkStrings.`client-vpn-endpoint`
  - typings.awsSdk.awsSdkStrings.`customer-gateway`
  - typings.awsSdk.awsSdkStrings.`carrier-gateway`
  - typings.awsSdk.awsSdkStrings.`coip-pool`
  - typings.awsSdk.awsSdkStrings.`dedicated-host`
  - typings.awsSdk.awsSdkStrings.`dhcp-options`
  - typings.awsSdk.awsSdkStrings.`egress-only-internet-gateway`
  - typings.awsSdk.awsSdkStrings.`elastic-ip`
  - typings.awsSdk.awsSdkStrings.`elastic-gpu`
  - typings.awsSdk.awsSdkStrings.`export-image-task`
  - typings.awsSdk.awsSdkStrings.`export-instance-task`
  - typings.awsSdk.awsSdkStrings.fleet
  - typings.awsSdk.awsSdkStrings.`fpga-image`
  - typings.awsSdk.awsSdkStrings.`host-reservation`
  - typings.awsSdk.awsSdkStrings.image__
  - typings.awsSdk.awsSdkStrings.`import-image-task`
  - typings.awsSdk.awsSdkStrings.`import-snapshot-task`
  - typings.awsSdk.awsSdkStrings.instance__
  - typings.awsSdk.awsSdkStrings.`instance-event-window`
  - typings.awsSdk.awsSdkStrings.`internet-gateway`
  - typings.awsSdk.awsSdkStrings.ipam
  - typings.awsSdk.awsSdkStrings.`ipam-pool`
  - typings.awsSdk.awsSdkStrings.`ipam-scope`
  - typings.awsSdk.awsSdkStrings.`ipv4pool-ec2`
  - typings.awsSdk.awsSdkStrings.`ipv6pool-ec2`
  - typings.awsSdk.awsSdkStrings.`key-pair`
  - typings.awsSdk.awsSdkStrings.`launch-template`
  - typings.awsSdk.awsSdkStrings.`local-gateway`
  - typings.awsSdk.awsSdkStrings.`local-gateway-route-table`
  - typings.awsSdk.awsSdkStrings.`local-gateway-virtual-interface`
  - typings.awsSdk.awsSdkStrings.`local-gateway-virtual-interface-group`
  - typings.awsSdk.awsSdkStrings.`local-gateway-route-table-vpc-association`
  - / * local-gateway-route-table-virtual-interface-group-association * / java.lang.String
  - typings.awsSdk.awsSdkStrings.natgateway_
  - typings.awsSdk.awsSdkStrings.`network-acl`
  - typings.awsSdk.awsSdkStrings.`network-interface`
  - typings.awsSdk.awsSdkStrings.`network-insights-analysis`
  - typings.awsSdk.awsSdkStrings.`network-insights-path`
  - typings.awsSdk.awsSdkStrings.`network-insights-access-scope`
  - typings.awsSdk.awsSdkStrings.`network-insights-access-scope-analysis`
  - typings.awsSdk.awsSdkStrings.`placement-group`
  - typings.awsSdk.awsSdkStrings.`prefix-list`
  - typings.awsSdk.awsSdkStrings.`replace-root-volume-task`
  - typings.awsSdk.awsSdkStrings.`reserved-instances`
  - typings.awsSdk.awsSdkStrings.`route-table`
  - typings.awsSdk.awsSdkStrings.`security-group`
  - typings.awsSdk.awsSdkStrings.`security-group-rule`
  - typings.awsSdk.awsSdkStrings.snapshot_
  - typings.awsSdk.awsSdkStrings.`spot-fleet-request`
  - typings.awsSdk.awsSdkStrings.`spot-instances-request`
  - typings.awsSdk.awsSdkStrings.subnet__
  - typings.awsSdk.awsSdkStrings.`subnet-cidr-reservation`
  - typings.awsSdk.awsSdkStrings.`traffic-mirror-filter`
  - typings.awsSdk.awsSdkStrings.`traffic-mirror-session`
  - typings.awsSdk.awsSdkStrings.`traffic-mirror-target`
  - typings.awsSdk.awsSdkStrings.`transit-gateway`
  - typings.awsSdk.awsSdkStrings.`transit-gateway-attachment`
  - typings.awsSdk.awsSdkStrings.`transit-gateway-connect-peer`
  - typings.awsSdk.awsSdkStrings.`transit-gateway-multicast-domain`
  - typings.awsSdk.awsSdkStrings.`transit-gateway-policy-table`
  - typings.awsSdk.awsSdkStrings.`transit-gateway-route-table`
  - typings.awsSdk.awsSdkStrings.`transit-gateway-route-table-announcement`
  - typings.awsSdk.awsSdkStrings.volume_
  - typings.awsSdk.awsSdkStrings.vpc__
  - typings.awsSdk.awsSdkStrings.`vpc-endpoint`
  - typings.awsSdk.awsSdkStrings.`vpc-endpoint-connection`
  - typings.awsSdk.awsSdkStrings.`vpc-endpoint-service`
  - typings.awsSdk.awsSdkStrings.`vpc-endpoint-service-permission`
  - typings.awsSdk.awsSdkStrings.`vpc-peering-connection`
  - typings.awsSdk.awsSdkStrings.`vpn-connection`
  - typings.awsSdk.awsSdkStrings.`vpn-gateway`
  - typings.awsSdk.awsSdkStrings.`vpc-flow-log`
  - typings.awsSdk.awsSdkStrings.`capacity-reservation-fleet`
  - typings.awsSdk.awsSdkStrings.`traffic-mirror-filter-rule`
  - typings.awsSdk.awsSdkStrings.`vpc-endpoint-connection-device-type`
  - typings.awsSdk.awsSdkStrings.`verified-access-instance`
  - typings.awsSdk.awsSdkStrings.`verified-access-group`
  - typings.awsSdk.awsSdkStrings.`verified-access-endpoint`
  - typings.awsSdk.awsSdkStrings.`verified-access-policy`
  - typings.awsSdk.awsSdkStrings.`verified-access-trust-provider`
  - typings.awsSdk.awsSdkStrings.`vpn-connection-device-type`
  - typings.awsSdk.awsSdkStrings.`vpc-block-public-access-exclusion`
  - typings.awsSdk.awsSdkStrings.`ipam-resource-discovery`
  - typings.awsSdk.awsSdkStrings.`ipam-resource-discovery-association`
*/
type ResourceType = _ResourceType | (/* local-gateway-route-table-virtual-interface-group-association */ java.lang.String)

type ResponseHostIdList = js.Array[String]

type ResponseHostIdSet = js.Array[String]

type RestorableByStringList = js.Array[String]

type RestoreSnapshotTierRequestTemporaryRestoreDays = scala.Double

type ResultRange = scala.Double

type RoleId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ebs_
  - typings.awsSdk.awsSdkStrings.`instance-store`
  - java.lang.String
*/
type RootDeviceType = _RootDeviceType | java.lang.String

type RootDeviceTypeList = js.Array[RootDeviceType]

type RouteGatewayId = java.lang.String

type RouteList = js.Array[Route]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreateRouteTable
  - typings.awsSdk.awsSdkStrings.CreateRoute
  - typings.awsSdk.awsSdkStrings.EnableVgwRoutePropagation
  - java.lang.String
*/
type RouteOrigin = _RouteOrigin | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.blackhole_
  - java.lang.String
*/
type RouteState = _RouteState | java.lang.String

type RouteTableAssociationId = java.lang.String

type RouteTableAssociationList = js.Array[RouteTableAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.disassociating__
  - typings.awsSdk.awsSdkStrings.disassociated__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type RouteTableAssociationStateCode = _RouteTableAssociationStateCode | java.lang.String

type RouteTableId = java.lang.String

type RouteTableIdStringList = js.Array[RouteTableId]

type RouteTableList = js.Array[RouteTable]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.allow__
  - typings.awsSdk.awsSdkStrings.deny__
  - java.lang.String
*/
type RuleAction = _RuleAction | java.lang.String

type RuleGroupRuleOptionsPairList = js.Array[RuleGroupRuleOptionsPair]

type RuleGroupTypePairList = js.Array[RuleGroupTypePair]

type RuleOptionList = js.Array[RuleOption]

type RunInstancesUserData = java.lang.String

type S3ObjectTagList = js.Array[S3ObjectTag]

type ScheduledInstanceAvailabilitySet = js.Array[ScheduledInstanceAvailability]

type ScheduledInstanceId = java.lang.String

type ScheduledInstanceIdRequestSet = js.Array[ScheduledInstanceId]

type ScheduledInstanceSet = js.Array[ScheduledInstance]

type ScheduledInstancesBlockDeviceMappingSet = js.Array[ScheduledInstancesBlockDeviceMapping]

type ScheduledInstancesIpv6AddressList = js.Array[ScheduledInstancesIpv6Address]

type ScheduledInstancesNetworkInterfaceSet = js.Array[ScheduledInstancesNetworkInterface]

type ScheduledInstancesSecurityGroupIdSet = js.Array[SecurityGroupId]

type SecurityGroupId = java.lang.String

type SecurityGroupIdList = js.Array[SecurityGroupId]

type SecurityGroupIdStringList = js.Array[SecurityGroupId]

type SecurityGroupList = js.Array[SecurityGroup]

type SecurityGroupName = java.lang.String

type SecurityGroupReferences = js.Array[SecurityGroupReference]

type SecurityGroupRuleDescriptionList = js.Array[SecurityGroupRuleDescription]

type SecurityGroupRuleId = java.lang.String

type SecurityGroupRuleIdList = js.Array[String]

type SecurityGroupRuleList = js.Array[SecurityGroupRule]

type SecurityGroupRuleUpdateList = js.Array[SecurityGroupRuleUpdate]

type SecurityGroupStringList = js.Array[SecurityGroupName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.disabled__
  - java.lang.String
*/
type SelfServicePortal = _SelfServicePortal | java.lang.String

type SensitiveUserData = java.lang.String

type ServiceConfigurationSet = js.Array[ServiceConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ipv4__
  - typings.awsSdk.awsSdkStrings.ipv6__
  - java.lang.String
*/
type ServiceConnectivityType = _ServiceConnectivityType | java.lang.String

type ServiceDetailSet = js.Array[ServiceDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Available_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type ServiceState = _ServiceState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Interface
  - typings.awsSdk.awsSdkStrings.Gateway_
  - typings.awsSdk.awsSdkStrings.GatewayLoadBalancer
  - java.lang.String
*/
type ServiceType = _ServiceType | java.lang.String

type ServiceTypeDetailSet = js.Array[ServiceTypeDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.stop_
  - typings.awsSdk.awsSdkStrings.terminate__
  - java.lang.String
*/
type ShutdownBehavior = _ShutdownBehavior | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.productCodes
  - typings.awsSdk.awsSdkStrings.createVolumePermission
  - java.lang.String
*/
type SnapshotAttributeName = _SnapshotAttributeName | java.lang.String

type SnapshotDetailList = js.Array[SnapshotDetail]

type SnapshotId = java.lang.String

type SnapshotIdStringList = js.Array[SnapshotId]

type SnapshotList = js.Array[Snapshot]

type SnapshotRecycleBinInfoList = js.Array[SnapshotRecycleBinInfo]

type SnapshotSet = js.Array[SnapshotInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.completed__
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.recoverable
  - typings.awsSdk.awsSdkStrings.recovering_
  - java.lang.String
*/
type SnapshotState = _SnapshotState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`lowest-price`
  - typings.awsSdk.awsSdkStrings.diversified
  - typings.awsSdk.awsSdkStrings.`capacity-optimized`
  - typings.awsSdk.awsSdkStrings.`capacity-optimized-prioritized`
  - typings.awsSdk.awsSdkStrings.`price-capacity-optimized`
  - java.lang.String
*/
type SpotAllocationStrategy = _SpotAllocationStrategy | java.lang.String

type SpotFleetRequestConfigSet = js.Array[SpotFleetRequestConfig]

type SpotFleetRequestId = java.lang.String

type SpotFleetRequestIdList = js.Array[SpotFleetRequestId]

type SpotFleetTagSpecificationList = js.Array[SpotFleetTagSpecification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.hibernate
  - typings.awsSdk.awsSdkStrings.stop_
  - typings.awsSdk.awsSdkStrings.terminate__
  - java.lang.String
*/
type SpotInstanceInterruptionBehavior = _SpotInstanceInterruptionBehavior | java.lang.String

type SpotInstanceRequestId = java.lang.String

type SpotInstanceRequestIdList = js.Array[SpotInstanceRequestId]

type SpotInstanceRequestList = js.Array[SpotInstanceRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.open__
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.closed__
  - typings.awsSdk.awsSdkStrings.cancelled__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type SpotInstanceState = _SpotInstanceState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`one-time`
  - typings.awsSdk.awsSdkStrings.persistent_
  - java.lang.String
*/
type SpotInstanceType = _SpotInstanceType | java.lang.String

type SpotPlacementScores = js.Array[SpotPlacementScore]

type SpotPlacementScoresMaxResults = scala.Double

type SpotPlacementScoresTargetCapacity = scala.Double

type SpotPriceHistoryList = js.Array[SpotPrice]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.host__
  - typings.awsSdk.awsSdkStrings.rack_
  - java.lang.String
*/
type SpreadLevel = _SpreadLevel | java.lang.String

type StaleIpPermissionSet = js.Array[StaleIpPermission]

type StaleSecurityGroupSet = js.Array[StaleSecurityGroup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PendingAcceptance
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Available_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - typings.awsSdk.awsSdkStrings.Rejected_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Expired_
  - java.lang.String
*/
type State = _State | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type StaticSourcesSupportValue = _StaticSourcesSupportValue | java.lang.String

type StatisticType = p50 | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MoveInProgress
  - typings.awsSdk.awsSdkStrings.InVpc
  - typings.awsSdk.awsSdkStrings.InClassic
  - java.lang.String
*/
type Status = _Status | java.lang.String

type StatusName = reachability | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.passed_
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.`insufficient-data`
  - typings.awsSdk.awsSdkStrings.initializing__
  - java.lang.String
*/
type StatusType = _StatusType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.archive__
  - typings.awsSdk.awsSdkStrings.standard__
  - java.lang.String
*/
type StorageTier = _StorageTier | java.lang.String

type StoreImageTaskResultSet = js.Array[StoreImageTaskResult]

type String = java.lang.String

type StringList = js.Array[String]

type StringType = java.lang.String

type SubnetAssociationList = js.Array[SubnetAssociation]

type SubnetCidrAssociationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.disassociating__
  - typings.awsSdk.awsSdkStrings.disassociated__
  - typings.awsSdk.awsSdkStrings.failing__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type SubnetCidrBlockStateCode = _SubnetCidrBlockStateCode | java.lang.String

type SubnetCidrReservationId = java.lang.String

type SubnetCidrReservationList = js.Array[SubnetCidrReservation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.prefix__
  - typings.awsSdk.awsSdkStrings.explicit_
  - java.lang.String
*/
type SubnetCidrReservationType = _SubnetCidrReservationType | java.lang.String

type SubnetId = java.lang.String

type SubnetIdStringList = js.Array[SubnetId]

type SubnetIpv6CidrBlockAssociationSet = js.Array[SubnetIpv6CidrBlockAssociation]

type SubnetList = js.Array[Subnet]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - java.lang.String
*/
type SubnetState = _SubnetState | java.lang.String

type SubscriptionList = js.Array[Subscription]

type SuccessfulInstanceCreditSpecificationSet = js.Array[SuccessfulInstanceCreditSpecificationItem]

type SuccessfulQueuedPurchaseDeletionSet = js.Array[SuccessfulQueuedPurchaseDeletion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ok__
  - typings.awsSdk.awsSdkStrings.impaired__
  - typings.awsSdk.awsSdkStrings.`insufficient-data`
  - typings.awsSdk.awsSdkStrings.`not-applicable`
  - typings.awsSdk.awsSdkStrings.initializing__
  - java.lang.String
*/
type SummaryStatus = _SummaryStatus | java.lang.String

type SupportedAdditionalProcessorFeature = `amd-sev-snp` | java.lang.String

type SupportedAdditionalProcessorFeatureList = js.Array[SupportedAdditionalProcessorFeature]

type SupportedIpAddressTypes = js.Array[ServiceConnectivityType]

type TagDescriptionList = js.Array[TagDescription]

type TagList = js.Array[Tag]

type TagSpecificationList = js.Array[TagSpecification]

type TaggableResourceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.vcpu__
  - typings.awsSdk.awsSdkStrings.`memory-mib`
  - typings.awsSdk.awsSdkStrings.units
  - java.lang.String
*/
type TargetCapacityUnitType = _TargetCapacityUnitType | java.lang.String

type TargetConfigurationRequestSet = js.Array[TargetConfigurationRequest]

type TargetGroups = js.Array[TargetGroup]

type TargetNetworkSet = js.Array[TargetNetwork]

type TargetReservationValueSet = js.Array[TargetReservationValue]

type TargetStorageTier = archive__ | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UP
  - typings.awsSdk.awsSdkStrings.DOWN
  - java.lang.String
*/
type TelemetryStatus = _TelemetryStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.default__
  - typings.awsSdk.awsSdkStrings.dedicated_
  - typings.awsSdk.awsSdkStrings.host__
  - java.lang.String
*/
type Tenancy = _Tenancy | java.lang.String

type TerminateConnectionStatusSet = js.Array[TerminateConnectionStatus]

type ThreadsPerCore = scala.Double

type ThreadsPerCoreList = js.Array[ThreadsPerCore]

type ThroughResourcesStatementList = js.Array[ThroughResourcesStatement]

type ThroughResourcesStatementRequestList = js.Array[ThroughResourcesStatementRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`archival-in-progress`
  - typings.awsSdk.awsSdkStrings.`archival-completed`
  - typings.awsSdk.awsSdkStrings.`archival-failed`
  - typings.awsSdk.awsSdkStrings.`temporary-restore-in-progress`
  - typings.awsSdk.awsSdkStrings.`temporary-restore-completed`
  - typings.awsSdk.awsSdkStrings.`temporary-restore-failed`
  - typings.awsSdk.awsSdkStrings.`permanent-restore-in-progress`
  - typings.awsSdk.awsSdkStrings.`permanent-restore-completed`
  - typings.awsSdk.awsSdkStrings.`permanent-restore-failed`
  - java.lang.String
*/
type TieringOperationStatus = _TieringOperationStatus | java.lang.String

type TpmSupportValues = v2Dot0 | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ingress
  - typings.awsSdk.awsSdkStrings.egress
  - java.lang.String
*/
type TrafficDirection = _TrafficDirection | java.lang.String

type TrafficMirrorFilterId = java.lang.String

type TrafficMirrorFilterIdList = js.Array[TrafficMirrorFilterId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`destination-port-range`
  - typings.awsSdk.awsSdkStrings.`source-port-range`
  - typings.awsSdk.awsSdkStrings.protocol
  - typings.awsSdk.awsSdkStrings.description_
  - java.lang.String
*/
type TrafficMirrorFilterRuleField = _TrafficMirrorFilterRuleField | java.lang.String

type TrafficMirrorFilterRuleFieldList = js.Array[TrafficMirrorFilterRuleField]

type TrafficMirrorFilterRuleIdWithResolver = java.lang.String

type TrafficMirrorFilterRuleList = js.Array[TrafficMirrorFilterRule]

type TrafficMirrorFilterSet = js.Array[TrafficMirrorFilter]

type TrafficMirrorNetworkService = `amazon-dns` | java.lang.String

type TrafficMirrorNetworkServiceList = js.Array[TrafficMirrorNetworkService]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.accept__
  - typings.awsSdk.awsSdkStrings.reject__
  - java.lang.String
*/
type TrafficMirrorRuleAction = _TrafficMirrorRuleAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`packet-length`
  - typings.awsSdk.awsSdkStrings.description_
  - typings.awsSdk.awsSdkStrings.`virtual-network-id`
  - java.lang.String
*/
type TrafficMirrorSessionField = _TrafficMirrorSessionField | java.lang.String

type TrafficMirrorSessionFieldList = js.Array[TrafficMirrorSessionField]

type TrafficMirrorSessionId = java.lang.String

type TrafficMirrorSessionIdList = js.Array[TrafficMirrorSessionId]

type TrafficMirrorSessionSet = js.Array[TrafficMirrorSession]

type TrafficMirrorTargetId = java.lang.String

type TrafficMirrorTargetIdList = js.Array[TrafficMirrorTargetId]

type TrafficMirrorTargetSet = js.Array[TrafficMirrorTarget]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`network-interface`
  - typings.awsSdk.awsSdkStrings.`network-load-balancer`
  - typings.awsSdk.awsSdkStrings.`gateway-load-balancer-endpoint`
  - java.lang.String
*/
type TrafficMirrorTargetType = _TrafficMirrorTargetType | java.lang.String

type TrafficMirroringMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCEPT
  - typings.awsSdk.awsSdkStrings.REJECT
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type TrafficType = _TrafficType | java.lang.String

type TransitAssociationGatewayId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.disassociating__
  - typings.awsSdk.awsSdkStrings.disassociated__
  - java.lang.String
*/
type TransitGatewayAssociationState = _TransitGatewayAssociationState | java.lang.String

type TransitGatewayAttachmentBgpConfigurationList = js.Array[TransitGatewayAttachmentBgpConfiguration]

type TransitGatewayAttachmentId = java.lang.String

type TransitGatewayAttachmentIdStringList = js.Array[TransitGatewayAttachmentId]

type TransitGatewayAttachmentList = js.Array[TransitGatewayAttachment]

type TransitGatewayAttachmentPropagationList = js.Array[TransitGatewayAttachmentPropagation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.vpc__
  - typings.awsSdk.awsSdkStrings.vpn
  - typings.awsSdk.awsSdkStrings.`direct-connect-gateway`
  - typings.awsSdk.awsSdkStrings.connect_
  - typings.awsSdk.awsSdkStrings.peering
  - typings.awsSdk.awsSdkStrings.`tgw-peering`
  - java.lang.String
*/
type TransitGatewayAttachmentResourceType = _TransitGatewayAttachmentResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.initiating_
  - typings.awsSdk.awsSdkStrings.initiatingRequest
  - typings.awsSdk.awsSdkStrings.pendingAcceptance_
  - typings.awsSdk.awsSdkStrings.rollingBack_
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.modifying_
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.rejected__
  - typings.awsSdk.awsSdkStrings.rejecting__
  - typings.awsSdk.awsSdkStrings.failing__
  - java.lang.String
*/
type TransitGatewayAttachmentState = _TransitGatewayAttachmentState | java.lang.String

type TransitGatewayCidrBlockStringList = js.Array[String]

type TransitGatewayConnectList = js.Array[TransitGatewayConnect]

type TransitGatewayConnectPeerId = java.lang.String

type TransitGatewayConnectPeerIdStringList = js.Array[TransitGatewayConnectPeerId]

type TransitGatewayConnectPeerList = js.Array[TransitGatewayConnectPeer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type TransitGatewayConnectPeerState = _TransitGatewayConnectPeerState | java.lang.String

type TransitGatewayId = java.lang.String

type TransitGatewayIdStringList = js.Array[TransitGatewayId]

type TransitGatewayList = js.Array[TransitGateway]

type TransitGatewayMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pendingAcceptance_
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.disassociating__
  - typings.awsSdk.awsSdkStrings.disassociated__
  - typings.awsSdk.awsSdkStrings.rejected__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type TransitGatewayMulitcastDomainAssociationState = _TransitGatewayMulitcastDomainAssociationState | java.lang.String

type TransitGatewayMulticastDomainAssociationList = js.Array[TransitGatewayMulticastDomainAssociation]

type TransitGatewayMulticastDomainId = java.lang.String

type TransitGatewayMulticastDomainIdStringList = js.Array[TransitGatewayMulticastDomainId]

type TransitGatewayMulticastDomainList = js.Array[TransitGatewayMulticastDomain]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type TransitGatewayMulticastDomainState = _TransitGatewayMulticastDomainState | java.lang.String

type TransitGatewayMulticastGroupList = js.Array[TransitGatewayMulticastGroup]

type TransitGatewayNetworkInterfaceIdList = js.Array[NetworkInterfaceId]

type TransitGatewayPeeringAttachmentList = js.Array[TransitGatewayPeeringAttachment]

type TransitGatewayPolicyTableAssociationList = js.Array[TransitGatewayPolicyTableAssociation]

type TransitGatewayPolicyTableEntryList = js.Array[TransitGatewayPolicyTableEntry]

type TransitGatewayPolicyTableId = java.lang.String

type TransitGatewayPolicyTableIdStringList = js.Array[TransitGatewayPolicyTableId]

type TransitGatewayPolicyTableList = js.Array[TransitGatewayPolicyTable]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type TransitGatewayPolicyTableState = _TransitGatewayPolicyTableState | java.lang.String

type TransitGatewayPrefixListReferenceSet = js.Array[TransitGatewayPrefixListReference]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.modifying_
  - typings.awsSdk.awsSdkStrings.deleting__
  - java.lang.String
*/
type TransitGatewayPrefixListReferenceState = _TransitGatewayPrefixListReferenceState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enabling__
  - typings.awsSdk.awsSdkStrings.enabled__
  - typings.awsSdk.awsSdkStrings.disabling_
  - typings.awsSdk.awsSdkStrings.disabled__
  - java.lang.String
*/
type TransitGatewayPropagationState = _TransitGatewayPropagationState | java.lang.String

type TransitGatewayRouteAttachmentList = js.Array[TransitGatewayRouteAttachment]

type TransitGatewayRouteList = js.Array[TransitGatewayRoute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.blackhole_
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type TransitGatewayRouteState = _TransitGatewayRouteState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.outgoing_
  - typings.awsSdk.awsSdkStrings.incoming_
  - java.lang.String
*/
type TransitGatewayRouteTableAnnouncementDirection = _TransitGatewayRouteTableAnnouncementDirection | java.lang.String

type TransitGatewayRouteTableAnnouncementId = java.lang.String

type TransitGatewayRouteTableAnnouncementIdStringList = js.Array[TransitGatewayRouteTableAnnouncementId]

type TransitGatewayRouteTableAnnouncementList = js.Array[TransitGatewayRouteTableAnnouncement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.failing__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type TransitGatewayRouteTableAnnouncementState = _TransitGatewayRouteTableAnnouncementState | java.lang.String

type TransitGatewayRouteTableAssociationList = js.Array[TransitGatewayRouteTableAssociation]

type TransitGatewayRouteTableId = java.lang.String

type TransitGatewayRouteTableIdStringList = js.Array[TransitGatewayRouteTableId]

type TransitGatewayRouteTableList = js.Array[TransitGatewayRouteTable]

type TransitGatewayRouteTablePropagationList = js.Array[TransitGatewayRouteTablePropagation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type TransitGatewayRouteTableState = _TransitGatewayRouteTableState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.static__
  - typings.awsSdk.awsSdkStrings.propagated_
  - java.lang.String
*/
type TransitGatewayRouteType = _TransitGatewayRouteType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.modifying_
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type TransitGatewayState = _TransitGatewayState | java.lang.String

type TransitGatewaySubnetIdList = js.Array[SubnetId]

type TransitGatewayVpcAttachmentList = js.Array[TransitGatewayVpcAttachment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.tcp_
  - typings.awsSdk.awsSdkStrings.udp_
  - java.lang.String
*/
type TransportProtocol = _TransportProtocol | java.lang.String

type TrunkInterfaceAssociationId = java.lang.String

type TrunkInterfaceAssociationIdList = js.Array[TrunkInterfaceAssociationId]

type TrunkInterfaceAssociationList = js.Array[TrunkInterfaceAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.user__
  - typings.awsSdk.awsSdkStrings.device_
  - java.lang.String
*/
type TrustProviderType = _TrustProviderType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ipv4__
  - typings.awsSdk.awsSdkStrings.ipv6__
  - java.lang.String
*/
type TunnelInsideIpVersion = _TunnelInsideIpVersion | java.lang.String

type TunnelOptionsList = js.Array[TunnelOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.t2
  - typings.awsSdk.awsSdkStrings.t3
  - typings.awsSdk.awsSdkStrings.t3a
  - typings.awsSdk.awsSdkStrings.t4g
  - java.lang.String
*/
type UnlimitedSupportedInstanceFamily = _UnlimitedSupportedInstanceFamily | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InvalidInstanceIDDotMalformed
  - typings.awsSdk.awsSdkStrings.InvalidInstanceIDDotNotFound
  - typings.awsSdk.awsSdkStrings.IncorrectInstanceState
  - typings.awsSdk.awsSdkStrings.InstanceCreditSpecificationDotNotSupported
  - java.lang.String
*/
type UnsuccessfulInstanceCreditSpecificationErrorCode = _UnsuccessfulInstanceCreditSpecificationErrorCode | java.lang.String

type UnsuccessfulInstanceCreditSpecificationSet = js.Array[UnsuccessfulInstanceCreditSpecificationItem]

type UnsuccessfulItemList = js.Array[UnsuccessfulItem]

type UnsuccessfulItemSet = js.Array[UnsuccessfulItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.spot_
  - typings.awsSdk.awsSdkStrings.`on-demand`
  - java.lang.String
*/
type UsageClassType = _UsageClassType | java.lang.String

type UsageClassTypeList = js.Array[UsageClassType]

type UserGroupStringList = js.Array[String]

type UserIdGroupPairList = js.Array[UserIdGroupPair]

type UserIdGroupPairSet = js.Array[UserIdGroupPair]

type UserIdStringList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`iam-identity-center`
  - typings.awsSdk.awsSdkStrings.oidc_
  - java.lang.String
*/
type UserTrustProviderType = _UserTrustProviderType | java.lang.String

type VCpuCount = scala.Double

type ValueStringList = js.Array[String]

type VerifiedAccessEndpointAttachmentType = vpc__ | java.lang.String

type VerifiedAccessEndpointId = java.lang.String

type VerifiedAccessEndpointIdList = js.Array[VerifiedAccessEndpointId]

type VerifiedAccessEndpointList = js.Array[VerifiedAccessEndpoint]

type VerifiedAccessEndpointPortNumber = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.http_
  - typings.awsSdk.awsSdkStrings.https_
  - java.lang.String
*/
type VerifiedAccessEndpointProtocol = _VerifiedAccessEndpointProtocol | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.updating__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type VerifiedAccessEndpointStatusCode = _VerifiedAccessEndpointStatusCode | java.lang.String

type VerifiedAccessEndpointSubnetIdList = js.Array[SubnetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`load-balancer`
  - typings.awsSdk.awsSdkStrings.`network-interface`
  - java.lang.String
*/
type VerifiedAccessEndpointType = _VerifiedAccessEndpointType | java.lang.String

type VerifiedAccessGroupId = java.lang.String

type VerifiedAccessGroupIdList = js.Array[VerifiedAccessGroupId]

type VerifiedAccessGroupList = js.Array[VerifiedAccessGroup]

type VerifiedAccessInstanceId = java.lang.String

type VerifiedAccessInstanceIdList = js.Array[VerifiedAccessInstanceId]

type VerifiedAccessInstanceList = js.Array[VerifiedAccessInstance]

type VerifiedAccessInstanceLoggingConfigurationList = js.Array[VerifiedAccessInstanceLoggingConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.success__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type VerifiedAccessLogDeliveryStatusCode = _VerifiedAccessLogDeliveryStatusCode | java.lang.String

type VerifiedAccessTrustProviderCondensedList = js.Array[VerifiedAccessTrustProviderCondensed]

type VerifiedAccessTrustProviderId = java.lang.String

type VerifiedAccessTrustProviderIdList = js.Array[VerifiedAccessTrustProviderId]

type VerifiedAccessTrustProviderList = js.Array[VerifiedAccessTrustProvider]

type VersionDescription = java.lang.String

type VersionStringList = js.Array[String]

type VgwTelemetryList = js.Array[VgwTelemetry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.hvm
  - typings.awsSdk.awsSdkStrings.paravirtual
  - java.lang.String
*/
type VirtualizationType = _VirtualizationType | java.lang.String

type VirtualizationTypeList = js.Array[VirtualizationType]

type VirtualizationTypeSet = js.Array[VirtualizationType]

type VolumeAttachmentList = js.Array[VolumeAttachment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.attaching_
  - typings.awsSdk.awsSdkStrings.attached_
  - typings.awsSdk.awsSdkStrings.detaching__
  - typings.awsSdk.awsSdkStrings.detached__
  - typings.awsSdk.awsSdkStrings.busy_
  - java.lang.String
*/
type VolumeAttachmentState = _VolumeAttachmentState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.autoEnableIO
  - typings.awsSdk.awsSdkStrings.productCodes
  - java.lang.String
*/
type VolumeAttributeName = _VolumeAttributeName | java.lang.String

type VolumeId = java.lang.String

type VolumeIdStringList = js.Array[VolumeId]

type VolumeIdWithResolver = java.lang.String

type VolumeList = js.Array[Volume]

type VolumeModificationList = js.Array[VolumeModification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.modifying_
  - typings.awsSdk.awsSdkStrings.optimizing
  - typings.awsSdk.awsSdkStrings.completed__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type VolumeModificationState = _VolumeModificationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.creating__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.`in-use`
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - typings.awsSdk.awsSdkStrings.error__
  - java.lang.String
*/
type VolumeState = _VolumeState | java.lang.String

type VolumeStatusActionsList = js.Array[VolumeStatusAction]

type VolumeStatusAttachmentStatusList = js.Array[VolumeStatusAttachmentStatus]

type VolumeStatusDetailsList = js.Array[VolumeStatusDetails]

type VolumeStatusEventsList = js.Array[VolumeStatusEvent]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ok__
  - typings.awsSdk.awsSdkStrings.impaired__
  - typings.awsSdk.awsSdkStrings.`insufficient-data`
  - java.lang.String
*/
type VolumeStatusInfoStatus = _VolumeStatusInfoStatus | java.lang.String

type VolumeStatusList = js.Array[VolumeStatusItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`io-enabled`
  - typings.awsSdk.awsSdkStrings.`io-performance`
  - java.lang.String
*/
type VolumeStatusName = _VolumeStatusName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.io1_
  - typings.awsSdk.awsSdkStrings.io2_
  - typings.awsSdk.awsSdkStrings.gp2_
  - typings.awsSdk.awsSdkStrings.sc1_
  - typings.awsSdk.awsSdkStrings.st1_
  - typings.awsSdk.awsSdkStrings.gp3_
  - java.lang.String
*/
type VolumeType = _VolumeType | java.lang.String

type VpcAttachmentList = js.Array[VpcAttachment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enableDnsSupport
  - typings.awsSdk.awsSdkStrings.enableDnsHostnames
  - typings.awsSdk.awsSdkStrings.enableNetworkAddressUsageMetrics
  - java.lang.String
*/
type VpcAttributeName = _VpcAttributeName | java.lang.String

type VpcCidrAssociationId = java.lang.String

type VpcCidrBlockAssociationSet = js.Array[VpcCidrBlockAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.associating__
  - typings.awsSdk.awsSdkStrings.associated__
  - typings.awsSdk.awsSdkStrings.disassociating__
  - typings.awsSdk.awsSdkStrings.disassociated__
  - typings.awsSdk.awsSdkStrings.failing__
  - typings.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type VpcCidrBlockStateCode = _VpcCidrBlockStateCode | java.lang.String

type VpcClassicLinkIdList = js.Array[VpcId]

type VpcClassicLinkList = js.Array[VpcClassicLink]

type VpcEndpointConnectionSet = js.Array[VpcEndpointConnection]

type VpcEndpointId = java.lang.String

type VpcEndpointIdList = js.Array[VpcEndpointId]

type VpcEndpointRouteTableIdList = js.Array[RouteTableId]

type VpcEndpointSecurityGroupIdList = js.Array[SecurityGroupId]

type VpcEndpointServiceId = java.lang.String

type VpcEndpointServiceIdList = js.Array[VpcEndpointServiceId]

type VpcEndpointSet = js.Array[VpcEndpoint]

type VpcEndpointSubnetIdList = js.Array[SubnetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Interface
  - typings.awsSdk.awsSdkStrings.Gateway_
  - typings.awsSdk.awsSdkStrings.GatewayLoadBalancer
  - java.lang.String
*/
type VpcEndpointType = _VpcEndpointType | java.lang.String

type VpcFlowLogId = java.lang.String

type VpcId = java.lang.String

type VpcIdStringList = js.Array[VpcId]

type VpcIpv6CidrBlockAssociationSet = js.Array[VpcIpv6CidrBlockAssociation]

type VpcList = js.Array[Vpc]

type VpcPeeringConnectionId = java.lang.String

type VpcPeeringConnectionIdList = js.Array[VpcPeeringConnectionId]

type VpcPeeringConnectionIdWithResolver = java.lang.String

type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`initiating-request`
  - typings.awsSdk.awsSdkStrings.`pending-acceptance`
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.deleted__
  - typings.awsSdk.awsSdkStrings.rejected__
  - typings.awsSdk.awsSdkStrings.failed__
  - typings.awsSdk.awsSdkStrings.expired__
  - typings.awsSdk.awsSdkStrings.provisioning_
  - typings.awsSdk.awsSdkStrings.deleting__
  - java.lang.String
*/
type VpcPeeringConnectionStateReasonCode = _VpcPeeringConnectionStateReasonCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - java.lang.String
*/
type VpcState = _VpcState | java.lang.String

type VpcTenancy = default__ | java.lang.String

type VpnConnectionDeviceSampleConfiguration = java.lang.String

type VpnConnectionDeviceTypeId = java.lang.String

type VpnConnectionDeviceTypeList = js.Array[VpnConnectionDeviceType]

type VpnConnectionId = java.lang.String

type VpnConnectionIdStringList = js.Array[VpnConnectionId]

type VpnConnectionList = js.Array[VpnConnection]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.enable_
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type VpnEcmpSupportValue = _VpnEcmpSupportValue | java.lang.String

type VpnGatewayId = java.lang.String

type VpnGatewayIdStringList = js.Array[VpnGatewayId]

type VpnGatewayList = js.Array[VpnGateway]

type VpnProtocol = openvpn | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.available__
  - typings.awsSdk.awsSdkStrings.deleting__
  - typings.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type VpnState = _VpnState | java.lang.String

type VpnStaticRouteList = js.Array[VpnStaticRoute]

type VpnStaticRouteSource = Static_ | java.lang.String

type VpnTunnelOptionsSpecificationsList = js.Array[VpnTunnelOptionsSpecification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.sunday__
  - typings.awsSdk.awsSdkStrings.monday__
  - typings.awsSdk.awsSdkStrings.tuesday__
  - typings.awsSdk.awsSdkStrings.wednesday__
  - typings.awsSdk.awsSdkStrings.thursday__
  - typings.awsSdk.awsSdkStrings.friday__
  - typings.awsSdk.awsSdkStrings.saturday__
  - java.lang.String
*/
type WeekDay = _WeekDay | java.lang.String

type ZoneIdStringList = js.Array[String]

type ZoneNameStringList = js.Array[String]

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2013-06-15`
  - typings.awsSdk.awsSdkStrings.`2013-10-15`
  - typings.awsSdk.awsSdkStrings.`2014-02-01`
  - typings.awsSdk.awsSdkStrings.`2014-05-01`
  - typings.awsSdk.awsSdkStrings.`2014-06-15`
  - typings.awsSdk.awsSdkStrings.`2014-09-01`
  - typings.awsSdk.awsSdkStrings.`2014-10-01`
  - typings.awsSdk.awsSdkStrings.`2015-03-01`
  - typings.awsSdk.awsSdkStrings.`2015-04-15`
  - typings.awsSdk.awsSdkStrings.`2015-10-01`
  - typings.awsSdk.awsSdkStrings.`2016-04-01`
  - typings.awsSdk.awsSdkStrings.`2016-09-15`
  - typings.awsSdk.awsSdkStrings.`2016-11-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`Availability Zone`
  - typings.awsSdk.awsSdkStrings.Region_
  - java.lang.String
*/
type scope = _scope | java.lang.String

type snapshotTierStatusSet = js.Array[SnapshotTierStatus]

type totalFpgaMemory = scala.Double

type totalGpuMemory = scala.Double
