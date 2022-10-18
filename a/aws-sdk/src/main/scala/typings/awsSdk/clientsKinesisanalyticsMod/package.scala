package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationCode = String

type ApplicationDescription = String

type ApplicationName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type ApplicationStatus = _ApplicationStatus | String

type ApplicationSummaries = js.Array[ApplicationSummary]

type ApplicationVersionId = Double

type BooleanObject = Boolean

type BucketARN = String

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
  - typings.awsSdk.awsSdkStrings.NOW
  - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typings.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
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
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.CSV
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

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-08-14`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
