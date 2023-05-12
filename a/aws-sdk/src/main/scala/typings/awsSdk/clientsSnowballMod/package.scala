package typings.awsSdk.clientsSnowballMod

import typings.awsSdk.awsSdkStrings.TB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddressId = java.lang.String

type AddressList = js.Array[Address]

type AmiId = java.lang.String

type Boolean = scala.Boolean

type ClusterId = java.lang.String

type ClusterListEntryList = js.Array[ClusterListEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AwaitingQuorum
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InUse
  - typings.awsSdk.awsSdkStrings.Complete_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
type ClusterState = _ClusterState | java.lang.String

type CompatibleImageList = js.Array[CompatibleImage]

type DependentServiceList = js.Array[DependentService]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NFS_ON_DEVICE_SERVICE
  - typings.awsSdk.awsSdkStrings.S3_ON_DEVICE_SERVICE
  - java.lang.String
*/
type DeviceServiceName = _DeviceServiceName | java.lang.String

type Ec2AmiResourceList = js.Array[Ec2AmiResource]

type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]

type GSTIN = java.lang.String

type InitialClusterSize = Double

type Integer = Double

type JavaBoolean = scala.Boolean

type JobId = java.lang.String

type JobListEntryList = js.Array[JobListEntry]

type JobMetadataList = js.Array[JobMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.New_
  - typings.awsSdk.awsSdkStrings.PreparingAppliance
  - typings.awsSdk.awsSdkStrings.PreparingShipment
  - typings.awsSdk.awsSdkStrings.InTransitToCustomer
  - typings.awsSdk.awsSdkStrings.WithCustomer
  - typings.awsSdk.awsSdkStrings.InTransitToAWS
  - typings.awsSdk.awsSdkStrings.WithAWSSortingFacility
  - typings.awsSdk.awsSdkStrings.WithAWS
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Complete_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - typings.awsSdk.awsSdkStrings.Listing
  - typings.awsSdk.awsSdkStrings.Pending_
  - java.lang.String
*/
type JobState = _JobState | java.lang.String

type JobStateList = js.Array[JobState]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT
  - typings.awsSdk.awsSdkStrings.EXPORT
  - typings.awsSdk.awsSdkStrings.LOCAL_USE
  - java.lang.String
*/
type JobType = _JobType | java.lang.String

type KmsKeyARN = java.lang.String

type LambdaResourceList = js.Array[LambdaResource]

type ListLimit = Double

type Long = Double

type LongTermPricingAssociatedJobIdList = js.Array[JobId]

type LongTermPricingEntryList = js.Array[LongTermPricingListEntry]

type LongTermPricingId = java.lang.String

type LongTermPricingIdList = js.Array[LongTermPricingId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OneYear
  - typings.awsSdk.awsSdkStrings.ThreeYear
  - typings.awsSdk.awsSdkStrings.OneMonth
  - java.lang.String
*/
type LongTermPricingType = _LongTermPricingType | java.lang.String

type NodeFaultTolerance = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INSTALLED_ONLY
  - typings.awsSdk.awsSdkStrings.INSTALLED_AUTOSTART
  - java.lang.String
*/
type RemoteManagement = _RemoteManagement | java.lang.String

type ResourceARN = java.lang.String

type RoleARN = java.lang.String

type S3ResourceList = js.Array[S3Resource]

type S3StorageLimit = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KUBERNETES
  - typings.awsSdk.awsSdkStrings.EKS_ANYWHERE
  - java.lang.String
*/
type ServiceName = _ServiceName | java.lang.String

type ServiceSize = Double

type ServiceVersionList = js.Array[ServiceVersion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RECEIVED
  - typings.awsSdk.awsSdkStrings.RETURNED
  - java.lang.String
*/
type ShipmentState = _ShipmentState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.TimedOut_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type ShippingLabelStatus = _ShippingLabelStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SECOND_DAY
  - typings.awsSdk.awsSdkStrings.NEXT_DAY
  - typings.awsSdk.awsSdkStrings.EXPRESS
  - typings.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type ShippingOption = _ShippingOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.T50
  - typings.awsSdk.awsSdkStrings.T80
  - typings.awsSdk.awsSdkStrings.T100
  - typings.awsSdk.awsSdkStrings.T42
  - typings.awsSdk.awsSdkStrings.T98
  - typings.awsSdk.awsSdkStrings.T8
  - typings.awsSdk.awsSdkStrings.T14
  - typings.awsSdk.awsSdkStrings.T32
  - typings.awsSdk.awsSdkStrings.NoPreference
  - typings.awsSdk.awsSdkStrings.T240
  - java.lang.String
*/
type SnowballCapacity = _SnowballCapacity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.EDGE
  - typings.awsSdk.awsSdkStrings.EDGE_C
  - typings.awsSdk.awsSdkStrings.EDGE_CG
  - typings.awsSdk.awsSdkStrings.EDGE_S
  - typings.awsSdk.awsSdkStrings.SNC1_HDD
  - typings.awsSdk.awsSdkStrings.SNC1_SSD
  - typings.awsSdk.awsSdkStrings.V3_5C
  - typings.awsSdk.awsSdkStrings.V3_5S
  - java.lang.String
*/
type SnowballType = _SnowballType | java.lang.String

type SnsTopicARN = java.lang.String

type StorageLimit = Double

type StorageUnit = TB | java.lang.String

type String = java.lang.String

type TargetOnDeviceServiceList = js.Array[TargetOnDeviceService]

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT
  - typings.awsSdk.awsSdkStrings.EXPORT
  - typings.awsSdk.awsSdkStrings.LOCAL_USE
  - java.lang.String
*/
type TransferOption = _TransferOption | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-06-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
