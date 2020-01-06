package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsFsxMod {
  import typings.awsDashSdk.awsDashSdkStrings.EXPORT_TO_REPOSITORY
  import typings.awsDashSdk.awsDashSdkStrings.FAILED_FILES_ONLY
  import typings.awsDashSdk.awsDashSdkStrings.REPORT_CSV_20191124
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`file-system-id`
    - typings.awsDashSdk.awsDashSdkStrings.`task-lifecycle`
    - java.lang.String
  */
  type DataRepositoryTaskFilterName = _DataRepositoryTaskFilterName | String
  type DataRepositoryTaskFilterValue = String
  type DataRepositoryTaskFilterValues = js.Array[DataRepositoryTaskFilterValue]
  type DataRepositoryTaskFilters = js.Array[DataRepositoryTaskFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELING
    - java.lang.String
  */
  type DataRepositoryTaskLifecycle = _DataRepositoryTaskLifecycle | String
  type DataRepositoryTaskPath = String
  type DataRepositoryTaskPaths = js.Array[DataRepositoryTaskPath]
  type DataRepositoryTaskType = EXPORT_TO_REPOSITORY | String
  type DataRepositoryTasks = js.Array[DataRepositoryTask]
  type DirectoryId = String
  type DirectoryPassword = String
  type DirectoryUserName = String
  type DnsIps = js.Array[IpAddress]
  type EndTime = Date
  type ErrorMessage = String
  type FailedCount = Double
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
  type LastUpdatedTime = Date
  type MaxResults = Double
  type Megabytes = Double
  type MegabytesPerSecond = Double
  type NetworkInterfaceId = String
  type NetworkInterfaceIds = js.Array[NetworkInterfaceId]
  type NextToken = String
  type OrganizationalUnitDistinguishedName = String
  type ProgressPercent = Double
  type ReportFormat = REPORT_CSV_20191124 | String
  type ReportScope = FAILED_FILES_ONLY | String
  type ResourceARN = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type StartTime = Date
  type StorageCapacity = Double
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type SucceededCount = Double
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TaskId = String
  type TaskIds = js.Array[TaskId]
  type TotalCount = Double
  type VpcId = String
  type WeeklyTime = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MULTI_AZ_1
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_AZ_1
    - java.lang.String
  */
  type WindowsDeploymentType = _WindowsDeploymentType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-03-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
