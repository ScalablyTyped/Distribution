package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsStoragegatewayMod {
  type ActivationKey = java.lang.String
  type Authentication = java.lang.String
  type BandwidthDownloadRateLimit = scala.Double
  type BandwidthType = java.lang.String
  type BandwidthUploadRateLimit = scala.Double
  type Boolean = scala.Boolean
  type CachediSCSIVolumes = js.Array[CachediSCSIVolume]
  type ChapCredentials = js.Array[ChapInfo]
  type ChapSecret = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  type CreatedDate = stdLib.Date
  type DayOfMonth = scala.Double
  type DayOfWeek = scala.Double
  type Description = java.lang.String
  type DeviceType = java.lang.String
  type DiskAllocationType = java.lang.String
  type DiskAttribute = java.lang.String
  type DiskAttributeList = js.Array[DiskAttribute]
  type DiskId = java.lang.String
  type DiskIds = js.Array[DiskId]
  type Disks = js.Array[Disk]
  type DomainName = java.lang.String
  type DomainUserName = java.lang.String
  type DomainUserPassword = java.lang.String
  type DoubleObject = scala.Double
  type Ec2InstanceId = java.lang.String
  type Ec2InstanceRegion = java.lang.String
  type FileShareARN = java.lang.String
  type FileShareARNList = js.Array[FileShareARN]
  type FileShareClientList = js.Array[IPV4AddressCIDR]
  type FileShareId = java.lang.String
  type FileShareInfoList = js.Array[FileShareInfo]
  type FileShareStatus = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NFS
    - awsDashSdkLib.awsDashSdkLibStrings.SMB
    - java.lang.String
  */
  type FileShareType = _FileShareType | java.lang.String
  type FileShareUser = java.lang.String
  type FileShareUserList = js.Array[FileShareUser]
  type Folder = java.lang.String
  type FolderList = js.Array[Folder]
  type GatewayARN = java.lang.String
  type GatewayId = java.lang.String
  type GatewayName = java.lang.String
  type GatewayNetworkInterfaces = js.Array[NetworkInterface]
  type GatewayOperationalState = java.lang.String
  type GatewayState = java.lang.String
  type GatewayTimezone = java.lang.String
  type GatewayType = java.lang.String
  type Gateways = js.Array[GatewayInfo]
  type Host = java.lang.String
  type Hosts = js.Array[Host]
  type HourOfDay = scala.Double
  type IPV4AddressCIDR = java.lang.String
  type Initiator = java.lang.String
  type Initiators = js.Array[Initiator]
  type IqnName = java.lang.String
  type KMSKey = java.lang.String
  type LastSoftwareUpdate = java.lang.String
  type LocalConsolePassword = java.lang.String
  type LocationARN = java.lang.String
  type Marker = java.lang.String
  type MediumChangerType = java.lang.String
  type MinuteOfHour = scala.Double
  type NFSFileShareInfoList = js.Array[NFSFileShareInfo]
  type NetworkInterfaceId = java.lang.String
  type NextUpdateAvailabilityDate = java.lang.String
  type NotificationId = java.lang.String
  type NumTapesToCreate = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`private`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-full-control`
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-exec-read`
    - java.lang.String
  */
  type ObjectACL = _ObjectACL | java.lang.String
  type OrganizationalUnit = java.lang.String
  type Path = java.lang.String
  type PermissionId = scala.Double
  type PermissionMode = java.lang.String
  type PoolId = java.lang.String
  type PositiveIntObject = scala.Double
  type RecurrenceInHours = scala.Double
  type RegionId = java.lang.String
  type ResourceARN = java.lang.String
  type Role = java.lang.String
  type SMBFileShareInfoList = js.Array[SMBFileShareInfo]
  type SMBGuestPassword = java.lang.String
  type SnapshotDescription = java.lang.String
  type SnapshotId = java.lang.String
  type Squash = java.lang.String
  type StorageClass = java.lang.String
  type StorediSCSIVolumes = js.Array[StorediSCSIVolume]
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TapeARN = java.lang.String
  type TapeARNs = js.Array[TapeARN]
  type TapeArchiveStatus = java.lang.String
  type TapeArchives = js.Array[TapeArchive]
  type TapeBarcode = java.lang.String
  type TapeBarcodePrefix = java.lang.String
  type TapeDriveType = java.lang.String
  type TapeInfos = js.Array[TapeInfo]
  type TapeRecoveryPointInfos = js.Array[TapeRecoveryPointInfo]
  type TapeRecoveryPointStatus = java.lang.String
  type TapeSize = scala.Double
  type TapeStatus = java.lang.String
  type TapeUsage = scala.Double
  type Tapes = js.Array[Tape]
  type TargetARN = java.lang.String
  type TargetName = java.lang.String
  type Time = stdLib.Date
  type VTLDeviceARN = java.lang.String
  type VTLDeviceARNs = js.Array[VTLDeviceARN]
  type VTLDeviceProductIdentifier = java.lang.String
  type VTLDeviceType = java.lang.String
  type VTLDeviceVendor = java.lang.String
  type VTLDevices = js.Array[VTLDevice]
  type VolumeARN = java.lang.String
  type VolumeARNs = js.Array[VolumeARN]
  type VolumeAttachmentStatus = java.lang.String
  type VolumeId = java.lang.String
  type VolumeInfos = js.Array[VolumeInfo]
  type VolumeRecoveryPointInfos = js.Array[VolumeRecoveryPointInfo]
  type VolumeStatus = java.lang.String
  type VolumeType = java.lang.String
  type VolumeUsedInBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-06-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type double = scala.Double
  type integer = scala.Double
  type long = scala.Double
}
