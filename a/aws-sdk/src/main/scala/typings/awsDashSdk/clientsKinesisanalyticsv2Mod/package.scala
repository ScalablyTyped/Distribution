package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisanalyticsv2Mod {
  type ApplicationDescription = String
  type ApplicationName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SKIP_RESTORE_FROM_SNAPSHOT
    - typings.awsDashSdk.awsDashSdkStrings.RESTORE_FROM_LATEST_SNAPSHOT
    - typings.awsDashSdk.awsDashSdkStrings.RESTORE_FROM_CUSTOM_SNAPSHOT
    - java.lang.String
  */
  type ApplicationRestoreType = _ApplicationRestoreType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - java.lang.String
  */
  type ApplicationStatus = _ApplicationStatus | String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type ApplicationVersionId = Double
  type BooleanObject = Boolean
  type BucketARN = String
  type CheckpointInterval = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PLAINTEXT
    - typings.awsDashSdk.awsDashSdkStrings.ZIPFILE
    - java.lang.String
  */
  type CodeContentType = _CodeContentType | String
  type CodeMD5 = String
  type CodeSize = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM
    - java.lang.String
  */
  type ConfigurationType = _ConfigurationType | String
  type FileKey = String
  type Id = String
  type InAppStreamName = String
  type InAppStreamNames = js.Array[InAppStreamName]
  type InAppTableName = String
  type InputDescriptions = js.Array[InputDescription]
  type InputParallelismCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOW
    - typings.awsDashSdk.awsDashSdkStrings.TRIM_HORIZON
    - typings.awsDashSdk.awsDashSdkStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = _InputStartingPosition | String
  type InputUpdates = js.Array[InputUpdate]
  type Inputs = js.Array[Input]
  type JobPlanDescription = String
  type KinesisAnalyticsARN = String
  type ListApplicationsInputLimit = Double
  type ListSnapshotsInputLimit = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - typings.awsDashSdk.awsDashSdkStrings.WARN
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.DEBUG
    - java.lang.String
  */
  type LogLevel = _LogLevel | String
  type LogStreamARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION
    - typings.awsDashSdk.awsDashSdkStrings.TASK
    - typings.awsDashSdk.awsDashSdkStrings.OPERATOR
    - typings.awsDashSdk.awsDashSdkStrings.PARALLELISM
    - java.lang.String
  */
  type MetricsLevel = _MetricsLevel | String
  type MinPauseBetweenCheckpoints = Double
  type NextToken = String
  type ObjectVersion = String
  type OutputDescriptions = js.Array[OutputDescription]
  type OutputUpdates = js.Array[OutputUpdate]
  type Outputs = js.Array[Output]
  type Parallelism = Double
  type ParallelismPerKPU = Double
  type ParsedInputRecord = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField = String
  type ParsedInputRecords = js.Array[ParsedInputRecord]
  type ProcessedInputRecord = String
  type ProcessedInputRecords = js.Array[ProcessedInputRecord]
  type PropertyGroups = js.Array[PropertyGroup]
  type PropertyKey = String
  type PropertyMap = StringDictionary[PropertyValue]
  type PropertyValue = String
  type RawInputRecord = String
  type RawInputRecords = js.Array[RawInputRecord]
  type RecordColumnDelimiter = String
  type RecordColumnMapping = String
  type RecordColumnName = String
  type RecordColumnSqlType = String
  type RecordColumns = js.Array[RecordColumn]
  type RecordEncoding = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - typings.awsDashSdk.awsDashSdkStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = _RecordFormatType | String
  type RecordRowDelimiter = String
  type RecordRowPath = String
  type ReferenceDataSourceDescriptions = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[ReferenceDataSourceUpdate]
  type ReferenceDataSources = js.Array[ReferenceDataSource]
  type ResourceARN = String
  type RoleARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`SQL-1_0`
    - typings.awsDashSdk.awsDashSdkStrings.`FLINK-1_6`
    - java.lang.String
  */
  type RuntimeEnvironment = _RuntimeEnvironment | String
  type SnapshotName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type SnapshotStatus = _SnapshotStatus | String
  type SnapshotSummaries = js.Array[SnapshotDetails]
  type SqlRunConfigurations = js.Array[SqlRunConfiguration]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TextContent = String
  type Timestamp = Date
  type ZipFileContent = Buffer | Uint8Array | Blob | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-05-23`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
