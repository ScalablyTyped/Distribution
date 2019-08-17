package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsXrayMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AliasList = js.Array[Alias]
  type AliasNames = js.Array[String]
  type AnnotationKey = java.lang.String
  type Annotations = StringDictionary[ValuesWithServiceIds]
  type AttributeKey = java.lang.String
  type AttributeMap = StringDictionary[AttributeValue]
  type AttributeValue = java.lang.String
  type Boolean = scala.Boolean
  type BorrowCount = scala.Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientID = java.lang.String
  type Double = scala.Double
  type EC2InstanceId = java.lang.String
  type EdgeList = js.Array[Edge]
  type EncryptionKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - java.lang.String
  */
  type EncryptionStatus = _EncryptionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.KMS
    - java.lang.String
  */
  type EncryptionType = _EncryptionType | java.lang.String
  type EntitySelectorExpression = java.lang.String
  type ErrorRootCauseEntityPath = js.Array[ErrorRootCauseEntity]
  type ErrorRootCauseServices = js.Array[ErrorRootCauseService]
  type ErrorRootCauses = js.Array[ErrorRootCause]
  type FaultRootCauseEntityPath = js.Array[FaultRootCauseEntity]
  type FaultRootCauseServices = js.Array[FaultRootCauseService]
  type FaultRootCauses = js.Array[FaultRootCause]
  type FilterExpression = java.lang.String
  type FixedRate = scala.Double
  type GetGroupsNextToken = java.lang.String
  type GroupARN = java.lang.String
  type GroupName = java.lang.String
  type GroupSummaryList = js.Array[GroupSummary]
  type HTTPMethod = java.lang.String
  type Histogram = js.Array[HistogramEntry]
  type Host = java.lang.String
  type Hostname = java.lang.String
  type Integer = scala.Double
  type NullableBoolean = scala.Boolean
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type NullableLong = scala.Double
  type Priority = scala.Double
  type RequestCount = scala.Double
  type ReservoirSize = scala.Double
  type ResourceARN = java.lang.String
  type ResponseTimeRootCauseEntityPath = js.Array[ResponseTimeRootCauseEntity]
  type ResponseTimeRootCauseServices = js.Array[ResponseTimeRootCauseService]
  type ResponseTimeRootCauses = js.Array[ResponseTimeRootCause]
  type RootCauseExceptions = js.Array[RootCauseException]
  type RuleName = java.lang.String
  type SampledCount = scala.Double
  type SamplingRuleRecordList = js.Array[SamplingRuleRecord]
  type SamplingStatisticSummaryList = js.Array[SamplingStatisticSummary]
  type SamplingStatisticsDocumentList = js.Array[SamplingStatisticsDocument]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PartialScan
    - typings.awsDashSdk.awsDashSdkStrings.FixedRate
    - java.lang.String
  */
  type SamplingStrategyName = _SamplingStrategyName | java.lang.String
  type SamplingTargetDocumentList = js.Array[SamplingTargetDocument]
  type SegmentDocument = java.lang.String
  type SegmentId = java.lang.String
  type SegmentList = js.Array[Segment]
  type ServiceIds = js.Array[ServiceId]
  type ServiceList = js.Array[Service]
  type ServiceName = java.lang.String
  type ServiceNames = js.Array[String]
  type ServiceType = java.lang.String
  type String = java.lang.String
  type TelemetryRecordList = js.Array[TelemetryRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TraceId
    - typings.awsDashSdk.awsDashSdkStrings.Event
    - java.lang.String
  */
  type TimeRangeType = _TimeRangeType | java.lang.String
  type TimeSeriesServiceStatisticsList = js.Array[TimeSeriesServiceStatistics]
  type Timestamp = Date
  type TraceAvailabilityZones = js.Array[AvailabilityZoneDetail]
  type TraceId = java.lang.String
  type TraceIdList = js.Array[TraceId]
  type TraceInstanceIds = js.Array[InstanceIdDetail]
  type TraceList = js.Array[Trace]
  type TraceResourceARNs = js.Array[ResourceARNDetail]
  type TraceSegmentDocument = java.lang.String
  type TraceSegmentDocumentList = js.Array[TraceSegmentDocument]
  type TraceSummaryList = js.Array[TraceSummary]
  type TraceUsers = js.Array[TraceUser]
  type URLPath = java.lang.String
  type UnprocessedStatisticsList = js.Array[UnprocessedStatistics]
  type UnprocessedTraceIdList = js.Array[TraceId]
  type UnprocessedTraceSegmentList = js.Array[UnprocessedTraceSegment]
  type ValuesWithServiceIds = js.Array[ValueWithServiceIds]
  type Version = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-04-12`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
