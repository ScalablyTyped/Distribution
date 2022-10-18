package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type CancellationStatus = _CancellationStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.GZIP
  - java.lang.String
*/
type CompressionType = _CompressionType | java.lang.String

type CreateJobRequestInputDataConfigList = js.Array[InputFileConfig]

type CreateJobRequestJobNameString = java.lang.String

type CreateQuantumTaskRequestDeviceParametersString = java.lang.String

type CreateQuantumTaskRequestOutputS3BucketString = java.lang.String

type CreateQuantumTaskRequestOutputS3KeyPrefixString = java.lang.String

type CreateQuantumTaskRequestShotsLong = Double

type DeviceArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ONLINE
  - typings.awsSdk.awsSdkStrings.OFFLINE
  - typings.awsSdk.awsSdkStrings.RETIRED
  - java.lang.String
*/
type DeviceStatus = _DeviceStatus | java.lang.String

type DeviceSummaryList = js.Array[DeviceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QPU
  - typings.awsSdk.awsSdkStrings.SIMULATOR
  - java.lang.String
*/
type DeviceType = _DeviceType | java.lang.String

type GetJobResponseJobNameString = java.lang.String

type HyperParameters = StringDictionary[HyperParametersValueString]

type HyperParametersValueString = java.lang.String

type InputConfigList = js.Array[InputFileConfig]

type InputFileConfigChannelNameString = java.lang.String

type InstanceConfigInstanceCountInteger = Double

type InstanceConfigVolumeSizeInGbInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
  - typings.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
  - typings.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
  - typings.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
  - typings.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
  - typings.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
  - typings.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
  - typings.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
  - typings.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
  - typings.awsSdk.awsSdkStrings.mlDotm5Dotlarge
  - typings.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
  - typings.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
  - typings.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
  - typings.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
  - typings.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
  - typings.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
  - typings.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
  - typings.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
  - typings.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
  - typings.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
  - typings.awsSdk.awsSdkStrings.mlDotp3dnDot24xlarge
  - typings.awsSdk.awsSdkStrings.mlDotp4dDot24xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5nDotxlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5nDot2xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5nDot4xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5nDot9xlarge
  - typings.awsSdk.awsSdkStrings.mlDotc5nDot18xlarge
  - java.lang.String
*/
type InstanceType = _InstanceType | java.lang.String

type Integer = Double

type JobArn = java.lang.String

type JobEventDetailsMessageString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WAITING_FOR_PRIORITY
  - typings.awsSdk.awsSdkStrings.QUEUED_FOR_EXECUTION
  - typings.awsSdk.awsSdkStrings.STARTING_INSTANCE
  - typings.awsSdk.awsSdkStrings.DOWNLOADING_DATA
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.DEPRIORITIZED_DUE_TO_INACTIVITY
  - typings.awsSdk.awsSdkStrings.UPLOADING_RESULTS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.MAX_RUNTIME_EXCEEDED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type JobEventType = _JobEventType | java.lang.String

type JobEvents = js.Array[JobEventDetails]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type JobPrimaryStatus = _JobPrimaryStatus | java.lang.String

type JobStoppingConditionMaxRuntimeInSecondsInteger = Double

type JobSummaryList = js.Array[JobSummary]

type JobToken = java.lang.String

type JsonValue = java.lang.String

type Long = Double

type QuantumTaskArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type QuantumTaskStatus = _QuantumTaskStatus | java.lang.String

type QuantumTaskSummaryList = js.Array[QuantumTaskSummary]

type RoleArn = java.lang.String

type S3Path = java.lang.String

type SearchDevicesFilterNameString = java.lang.String

type SearchDevicesFilterValuesList = js.Array[String256]

type SearchDevicesRequestFiltersList = js.Array[SearchDevicesFilter]

type SearchDevicesRequestMaxResultsInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LTE
  - typings.awsSdk.awsSdkStrings.EQUAL
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GTE
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - java.lang.String
*/
type SearchJobsFilterOperator = _SearchJobsFilterOperator | java.lang.String

type SearchJobsFilterValuesList = js.Array[String256]

type SearchJobsRequestFiltersList = js.Array[SearchJobsFilter]

type SearchJobsRequestMaxResultsInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LTE
  - typings.awsSdk.awsSdkStrings.EQUAL
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GTE
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
type SearchQuantumTasksFilterOperator = _SearchQuantumTasksFilterOperator | java.lang.String

type SearchQuantumTasksFilterValuesList = js.Array[String256]

type SearchQuantumTasksRequestFiltersList = js.Array[SearchQuantumTasksFilter]

type SearchQuantumTasksRequestMaxResultsInteger = Double

type String = java.lang.String

type String1024 = java.lang.String

type String2048 = java.lang.String

type String256 = java.lang.String

type String4096 = java.lang.String

type String64 = java.lang.String

type SyntheticTimestampDateTime = js.Date

type TagKeys = js.Array[String]

type TagsMap = StringDictionary[String]

type Uri = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-09-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
