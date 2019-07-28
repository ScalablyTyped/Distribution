package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisanalyticsMod {
  type ApplicationCode = String
  type ApplicationDescription = String
  type ApplicationName = String
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
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CloudWatchLoggingOptionDescriptions = js.Array[CloudWatchLoggingOptionDescription]
  type CloudWatchLoggingOptionUpdates = js.Array[CloudWatchLoggingOptionUpdate]
  type CloudWatchLoggingOptions = js.Array[CloudWatchLoggingOption]
  type FileKey = String
  type Id = String
  type InAppStreamName = String
  type InAppStreamNames = js.Array[InAppStreamName]
  type InAppTableName = String
  type InputConfigurations = js.Array[InputConfiguration]
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
  type KinesisAnalyticsARN = String
  type ListApplicationsInputLimit = Double
  type LogStreamARN = String
  type OutputDescriptions = js.Array[OutputDescription]
  type OutputUpdates = js.Array[OutputUpdate]
  type Outputs = js.Array[Output]
  type ParsedInputRecord = js.Array[ParsedInputRecordField]
  type ParsedInputRecordField = String
  type ParsedInputRecords = js.Array[ParsedInputRecord]
  type ProcessedInputRecord = String
  type ProcessedInputRecords = js.Array[ProcessedInputRecord]
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
  type ResourceARN = String
  type RoleARN = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-08-14`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
