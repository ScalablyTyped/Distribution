package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsFsxMod {
  type AWSAccountId = java.lang.String
  type ArchivePath = java.lang.String
  type AutomaticBackupRetentionDays = scala.Double
  type BackupId = java.lang.String
  type BackupIds = js.Array[BackupId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type BackupLifecycle = _BackupLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AUTOMATIC
    - awsDashSdkLib.awsDashSdkLibStrings.USER_INITIATED
    - java.lang.String
  */
  type BackupType = _BackupType | java.lang.String
  type Backups = js.Array[Backup]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CreationTime = stdLib.Date
  type DNSName = java.lang.String
  type DailyTime = java.lang.String
  type DirectoryId = java.lang.String
  type ErrorMessage = java.lang.String
  type FileSystemId = java.lang.String
  type FileSystemIds = js.Array[FileSystemId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type FileSystemLifecycle = _FileSystemLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PATCHING
    - awsDashSdkLib.awsDashSdkLibStrings.BACKING_UP
    - java.lang.String
  */
  type FileSystemMaintenanceOperation = _FileSystemMaintenanceOperation | java.lang.String
  type FileSystemMaintenanceOperations = js.Array[FileSystemMaintenanceOperation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS
    - awsDashSdkLib.awsDashSdkLibStrings.LUSTRE
    - java.lang.String
  */
  type FileSystemType = _FileSystemType | java.lang.String
  type FileSystems = js.Array[FileSystem]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`file-system-id`
    - awsDashSdkLib.awsDashSdkLibStrings.`backup-type`
    - java.lang.String
  */
  type FilterName = _FilterName | java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type Flag = scala.Boolean
  type KmsKeyId = java.lang.String
  type MaxResults = scala.Double
  type Megabytes = scala.Double
  type MegabytesPerSecond = scala.Double
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaceIds = js.Array[NetworkInterfaceId]
  type NextToken = java.lang.String
  type ProgressPercent = scala.Double
  type ResourceARN = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type StorageCapacity = scala.Double
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type VpcId = java.lang.String
  type WeeklyTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-03-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
