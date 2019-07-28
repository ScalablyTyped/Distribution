package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsStoragegatewayMod {
  type ActivationKey = String
  type Authentication = String
  type BandwidthDownloadRateLimit = Double
  type BandwidthType = String
  type BandwidthUploadRateLimit = Double
  type Boolean = scala.Boolean
  type CachediSCSIVolumes = js.Array[CachediSCSIVolume]
  type ChapCredentials = js.Array[ChapInfo]
  type ChapSecret = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = String
  type CreatedDate = Date
  type DayOfMonth = Double
  type DayOfWeek = Double
  type Description = String
  type DeviceType = String
  type DiskAllocationType = String
  type DiskAttribute = String
  type DiskAttributeList = js.Array[DiskAttribute]
  type DiskId = String
  type DiskIds = js.Array[DiskId]
  type Disks = js.Array[Disk]
  type DomainName = String
  type DomainUserName = String
  type DomainUserPassword = String
  type DoubleObject = Double
  type Ec2InstanceId = String
  type Ec2InstanceRegion = String
  type FileShareARN = String
  type FileShareARNList = js.Array[FileShareARN]
  type FileShareClientList = js.Array[IPV4AddressCIDR]
  type FileShareId = String
  type FileShareInfoList = js.Array[FileShareInfo]
  type FileShareStatus = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NFS
    - typings.awsDashSdk.awsDashSdkStrings.SMB
    - java.lang.String
  */
  type FileShareType = _FileShareType | String
  type FileShareUser = String
  type FileShareUserList = js.Array[FileShareUser]
  type Folder = String
  type FolderList = js.Array[Folder]
  type GatewayARN = String
  type GatewayId = String
  type GatewayName = String
  type GatewayNetworkInterfaces = js.Array[NetworkInterface]
  type GatewayOperationalState = String
  type GatewayState = String
  type GatewayTimezone = String
  type GatewayType = String
  type Gateways = js.Array[GatewayInfo]
  type Host = String
  type Hosts = js.Array[Host]
  type HourOfDay = Double
  type IPV4AddressCIDR = String
  type Initiator = String
  type Initiators = js.Array[Initiator]
  type IqnName = String
  type KMSKey = String
  type LastSoftwareUpdate = String
  type LocalConsolePassword = String
  type LocationARN = String
  type Marker = String
  type MediumChangerType = String
  type MinuteOfHour = Double
  type NFSFileShareInfoList = js.Array[NFSFileShareInfo]
  type NetworkInterfaceId = String
  type NextUpdateAvailabilityDate = String
  type NotificationId = String
  type NumTapesToCreate = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`private`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read-write`
    - typings.awsDashSdk.awsDashSdkStrings.`authenticated-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-full-control`
    - typings.awsDashSdk.awsDashSdkStrings.`aws-exec-read`
    - java.lang.String
  */
  type ObjectACL = _ObjectACL | String
  type OrganizationalUnit = String
  type Path = String
  type PermissionId = Double
  type PermissionMode = String
  type PoolId = String
  type PositiveIntObject = Double
  type RecurrenceInHours = Double
  type RegionId = String
  type ResourceARN = String
  type Role = String
  type SMBFileShareInfoList = js.Array[SMBFileShareInfo]
  type SMBGuestPassword = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ClientSpecified
    - typings.awsDashSdk.awsDashSdkStrings.MandatorySigning
    - typings.awsDashSdk.awsDashSdkStrings.MandatoryEncryption
    - java.lang.String
  */
  type SMBSecurityStrategy = _SMBSecurityStrategy | String
  type SnapshotDescription = String
  type SnapshotId = String
  type Squash = String
  type StorageClass = String
  type StorediSCSIVolumes = js.Array[StorediSCSIVolume]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TapeARN = String
  type TapeARNs = js.Array[TapeARN]
  type TapeArchiveStatus = String
  type TapeArchives = js.Array[TapeArchive]
  type TapeBarcode = String
  type TapeBarcodePrefix = String
  type TapeDriveType = String
  type TapeInfos = js.Array[TapeInfo]
  type TapeRecoveryPointInfos = js.Array[TapeRecoveryPointInfo]
  type TapeRecoveryPointStatus = String
  type TapeSize = Double
  type TapeStatus = String
  type TapeUsage = Double
  type Tapes = js.Array[Tape]
  type TargetARN = String
  type TargetName = String
  type Time = Date
  type VTLDeviceARN = String
  type VTLDeviceARNs = js.Array[VTLDeviceARN]
  type VTLDeviceProductIdentifier = String
  type VTLDeviceType = String
  type VTLDeviceVendor = String
  type VTLDevices = js.Array[VTLDevice]
  type VolumeARN = String
  type VolumeARNs = js.Array[VolumeARN]
  type VolumeAttachmentStatus = String
  type VolumeId = String
  type VolumeInfos = js.Array[VolumeInfo]
  type VolumeRecoveryPointInfos = js.Array[VolumeRecoveryPointInfo]
  type VolumeStatus = String
  type VolumeType = String
  type VolumeUsedInBytes = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2013-06-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type double = Double
  type integer = Double
  type long = Double
}
