package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsFsxMod {
  type AWSAccountId = String
  type ActiveDirectoryFullyQualifiedName = String
  type ArchivePath = String
  type AutomaticBackupRetentionDays = Double
  type BackupId = String
  type BackupIds = js.Array[BackupId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type BackupLifecycle = _BackupLifecycle | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AUTOMATIC
    - typings.awsDashSdk.awsDashSdkStrings.USER_INITIATED
    - java.lang.String
  */
  type BackupType = _BackupType | String
  type Backups = js.Array[Backup]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = String
  type CreationTime = Date
  type DNSName = String
  type DailyTime = String
  type DirectoryId = String
  type DirectoryPassword = String
  type DirectoryUserName = String
  type DnsIps = js.Array[IpAddress]
  type ErrorMessage = String
  type FileSystemAdministratorsGroupName = String
  type FileSystemId = String
  type FileSystemIds = js.Array[FileSystemId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.MISCONFIGURED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type FileSystemLifecycle = _FileSystemLifecycle | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PATCHING
    - typings.awsDashSdk.awsDashSdkStrings.BACKING_UP
    - java.lang.String
  */
  type FileSystemMaintenanceOperation = _FileSystemMaintenanceOperation | String
  type FileSystemMaintenanceOperations = js.Array[FileSystemMaintenanceOperation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WINDOWS
    - typings.awsDashSdk.awsDashSdkStrings.LUSTRE
    - java.lang.String
  */
  type FileSystemType = _FileSystemType | String
  type FileSystems = js.Array[FileSystem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`file-system-id`
    - typings.awsDashSdk.awsDashSdkStrings.`backup-type`
    - java.lang.String
  */
  type FilterName = _FilterName | String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Flag = Boolean
  type IpAddress = String
  type KmsKeyId = String
  type MaxResults = Double
  type Megabytes = Double
  type MegabytesPerSecond = Double
  type NetworkInterfaceId = String
  type NetworkInterfaceIds = js.Array[NetworkInterfaceId]
  type NextToken = String
  type OrganizationalUnitDistinguishedName = String
  type ProgressPercent = Double
  type ResourceARN = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type StorageCapacity = Double
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type VpcId = String
  type WeeklyTime = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-03-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
