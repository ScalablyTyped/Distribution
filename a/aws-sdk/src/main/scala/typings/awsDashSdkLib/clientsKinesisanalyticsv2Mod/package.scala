package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisanalyticsv2Mod {
  type ApplicationDescription = java.lang.String
  type ApplicationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SKIP_RESTORE_FROM_SNAPSHOT
    - awsDashSdkLib.awsDashSdkLibStrings.RESTORE_FROM_LATEST_SNAPSHOT
    - awsDashSdkLib.awsDashSdkLibStrings.RESTORE_FROM_CUSTOM_SNAPSHOT
    - java.lang.String
  */
  type ApplicationRestoreType = _ApplicationRestoreType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - java.lang.String
  */
  type ApplicationStatus = _ApplicationStatus | java.lang.String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type ApplicationVersionId = scala.Double
  type BooleanObject = scala.Boolean
  type BucketARN = java.lang.String
  type CheckpointInterval = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PLAINTEXT
    - awsDashSdkLib.awsDashSdkLibStrings.ZIPFILE
    - java.lang.String
  */
  type CodeContentType = _CodeContentType | java.lang.String
  type CodeMD5 = java.lang.String
  type CodeSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM
    - java.lang.String
  */
  type ConfigurationType = _ConfigurationType | java.lang.String
  type FileKey = java.lang.String
  type Id = java.lang.String
  type InAppStreamName = java.lang.String
  type InAppStreamNames = js.Array[InAppStreamName]
  type InAppTableName = java.lang.String
  type InputDescriptions = js.Array[InputDescription]
  type InputParallelismCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOW
    - awsDashSdkLib.awsDashSdkLibStrings.TRIM_HORIZON
    - awsDashSdkLib.awsDashSdkLibStrings.LAST_STOPPED_POINT
    - java.lang.String
  */
  type InputStartingPosition = _InputStartingPosition | java.lang.String
  type InputUpdates = js.Array[InputUpdate]
  type Inputs = js.Array[Input]
  type JobPlanDescription = java.lang.String
  type KinesisAnalyticsARN = java.lang.String
  type ListApplicationsInputLimit = scala.Double
  type ListSnapshotsInputLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.WARN
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.DEBUG
    - java.lang.String
  */
  type LogLevel = _LogLevel | java.lang.String
  type LogStreamARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.APPLICATION
    - awsDashSdkLib.awsDashSdkLibStrings.TASK
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATOR
    - awsDashSdkLib.awsDashSdkLibStrings.PARALLELISM
    - java.lang.String
  */
  type MetricsLevel = _MetricsLevel | java.lang.String
  type MinPauseBetweenCheckpoints = scala.Double
  type NextToken = java.lang.String
  type ObjectVersion = java.lang.String
  type OutputDescriptions = js.Array[OutputDescription]
  type OutputUpdates = js.Array[OutputUpdate]
  type Outputs = js.Array[Output]
  type Parallelism = scala.Double
  type ParallelismPerKPU = scala.Double
  type ParsedInputRecord = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField = java.lang.String
  type ParsedInputRecords = js.Array[ParsedInputRecord]
  type ProcessedInputRecord = java.lang.String
  type ProcessedInputRecords = js.Array[ProcessedInputRecord]
  type PropertyGroups = js.Array[PropertyGroup]
  type PropertyKey = java.lang.String
  type PropertyMap = org.scalablytyped.runtime.StringDictionary[PropertyValue]
  type PropertyValue = java.lang.String
  type RawInputRecord = java.lang.String
  type RawInputRecords = js.Array[RawInputRecord]
  type RecordColumnDelimiter = java.lang.String
  type RecordColumnMapping = java.lang.String
  type RecordColumnName = java.lang.String
  type RecordColumnSqlType = java.lang.String
  type RecordColumns = js.Array[RecordColumn]
  type RecordEncoding = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - awsDashSdkLib.awsDashSdkLibStrings.CSV
    - java.lang.String
  */
  type RecordFormatType = _RecordFormatType | java.lang.String
  type RecordRowDelimiter = java.lang.String
  type RecordRowPath = java.lang.String
  type ReferenceDataSourceDescriptions = js.Array[ReferenceDataSourceDescription]
  type ReferenceDataSourceUpdates = js.Array[ReferenceDataSourceUpdate]
  type ReferenceDataSources = js.Array[ReferenceDataSource]
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`SQL-1_0`
    - awsDashSdkLib.awsDashSdkLibStrings.`FLINK-1_6`
    - java.lang.String
  */
  type RuntimeEnvironment = _RuntimeEnvironment | java.lang.String
  type SnapshotName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type SnapshotStatus = _SnapshotStatus | java.lang.String
  type SnapshotSummaries = js.Array[SnapshotDetails]
  type SqlRunConfigurations = js.Array[SqlRunConfiguration]
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TextContent = java.lang.String
  type Timestamp = stdLib.Date
  type ZipFileContent = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-05-23`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
