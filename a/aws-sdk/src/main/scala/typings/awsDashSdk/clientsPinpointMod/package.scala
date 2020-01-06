package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPinpointMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OPEN_APP
    - typings.awsDashSdk.awsDashSdkStrings.DEEP_LINK
    - typings.awsDashSdk.awsDashSdkStrings.URL
    - java.lang.String
  */
  type Action = _Action | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INCLUSIVE
    - typings.awsDashSdk.awsDashSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type AttributeType = _AttributeType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SCHEDULED
    - typings.awsDashSdk.awsDashSdkStrings.EXECUTING
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_NEXT_RUN
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.PAUSED
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type CampaignStatus = _CampaignStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GCM
    - typings.awsDashSdk.awsDashSdkStrings.APNS
    - typings.awsDashSdk.awsDashSdkStrings.APNS_SANDBOX
    - typings.awsDashSdk.awsDashSdkStrings.APNS_VOIP
    - typings.awsDashSdk.awsDashSdkStrings.APNS_VOIP_SANDBOX
    - typings.awsDashSdk.awsDashSdkStrings.ADM
    - typings.awsDashSdk.awsDashSdkStrings.SMS
    - typings.awsDashSdk.awsDashSdkStrings.VOICE
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL
    - typings.awsDashSdk.awsDashSdkStrings.BAIDU
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM
    - java.lang.String
  */
  type ChannelType = _ChannelType | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.THROTTLED
    - typings.awsDashSdk.awsDashSdkStrings.TEMPORARY_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.PERMANENT_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN_FAILURE
    - typings.awsDashSdk.awsDashSdkStrings.OPT_OUT
    - typings.awsDashSdk.awsDashSdkStrings.DUPLICATE
    - java.lang.String
  */
  type DeliveryStatus = _DeliveryStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INCLUSIVE
    - typings.awsDashSdk.awsDashSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type DimensionType = _DimensionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HR_24
    - typings.awsDashSdk.awsDashSdkStrings.DAY_7
    - typings.awsDashSdk.awsDashSdkStrings.DAY_14
    - typings.awsDashSdk.awsDashSdkStrings.DAY_30
    - java.lang.String
  */
  type Duration = _Duration | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM
    - typings.awsDashSdk.awsDashSdkStrings.ENDPOINT
    - java.lang.String
  */
  type FilterType = _FilterType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CSV
    - typings.awsDashSdk.awsDashSdkStrings.JSON
    - java.lang.String
  */
  type Format = _Format | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ONCE
    - typings.awsDashSdk.awsDashSdkStrings.HOURLY
    - typings.awsDashSdk.awsDashSdkStrings.DAILY
    - typings.awsDashSdk.awsDashSdkStrings.WEEKLY
    - typings.awsDashSdk.awsDashSdkStrings.MONTHLY
    - typings.awsDashSdk.awsDashSdkStrings.EVENT
    - java.lang.String
  */
  type Frequency = _Frequency | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.ANY
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type Include = _Include | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.PREPARING_FOR_INITIALIZATION
    - typings.awsDashSdk.awsDashSdkStrings.INITIALIZING
    - typings.awsDashSdk.awsDashSdkStrings.PROCESSING
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_JOB
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type JobStatus = _JobStatus | String
  type ListOfActivityResponse = js.Array[ActivityResponse]
  type ListOfApplicationResponse = js.Array[ApplicationResponse]
  type ListOfCampaignResponse = js.Array[CampaignResponse]
  type ListOfEndpointBatchItem = js.Array[EndpointBatchItem]
  type ListOfEndpointResponse = js.Array[EndpointResponse]
  type ListOfExportJobResponse = js.Array[ExportJobResponse]
  type ListOfImportJobResponse = js.Array[ImportJobResponse]
  type ListOfJourneyResponse = js.Array[JourneyResponse]
  type ListOfMultiConditionalBranch = js.Array[MultiConditionalBranch]
  type ListOfRandomSplitEntry = js.Array[RandomSplitEntry]
  type ListOfResultRow = js.Array[ResultRow]
  type ListOfResultRowValue = js.Array[ResultRowValue]
  type ListOfSegmentDimensions = js.Array[SegmentDimensions]
  type ListOfSegmentGroup = js.Array[SegmentGroup]
  type ListOfSegmentReference = js.Array[SegmentReference]
  type ListOfSegmentResponse = js.Array[SegmentResponse]
  type ListOfSimpleCondition = js.Array[SimpleCondition]
  type ListOfTemplateResponse = js.Array[TemplateResponse]
  type ListOfTemplateVersionResponse = js.Array[TemplateVersionResponse]
  type ListOfTreatmentResource = js.Array[TreatmentResource]
  type ListOfWriteTreatmentResource = js.Array[WriteTreatmentResource]
  type ListOf__string = js.Array[__string]
  type MapOfActivity = StringDictionary[Activity]
  type MapOfAddressConfiguration = StringDictionary[AddressConfiguration]
  type MapOfAttributeDimension = StringDictionary[AttributeDimension]
  type MapOfChannelResponse = StringDictionary[ChannelResponse]
  type MapOfEndpointMessageResult = StringDictionary[EndpointMessageResult]
  type MapOfEndpointSendConfiguration = StringDictionary[EndpointSendConfiguration]
  type MapOfEvent = StringDictionary[Event]
  type MapOfEventItemResponse = StringDictionary[EventItemResponse]
  type MapOfEventsBatch = StringDictionary[EventsBatch]
  type MapOfItemResponse = StringDictionary[ItemResponse]
  type MapOfListOf__string = StringDictionary[ListOf__string]
  type MapOfMapOfEndpointMessageResult = StringDictionary[MapOfEndpointMessageResult]
  type MapOfMessageResult = StringDictionary[MessageResult]
  type MapOfMetricDimension = StringDictionary[MetricDimension]
  type MapOf__double = StringDictionary[__double]
  type MapOf__integer = StringDictionary[__integer]
  type MapOf__string = StringDictionary[__string]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRANSACTIONAL
    - typings.awsDashSdk.awsDashSdkStrings.PROMOTIONAL
    - java.lang.String
  */
  type MessageType = _MessageType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DELIVERY
    - typings.awsDashSdk.awsDashSdkStrings.FILTER
    - java.lang.String
  */
  type Mode = _Mode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.ANY
    - java.lang.String
  */
  type Operator = _Operator | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type RecencyType = _RecencyType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DIMENSIONAL
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT
    - java.lang.String
  */
  type SegmentType = _SegmentType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.ANY
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type SourceType = _SourceType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DRAFT
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.CLOSED
    - java.lang.String
  */
  type State = _State | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL
    - typings.awsDashSdk.awsDashSdkStrings.SMS
    - typings.awsDashSdk.awsDashSdkStrings.VOICE
    - typings.awsDashSdk.awsDashSdkStrings.PUSH
    - java.lang.String
  */
  type TemplateType = _TemplateType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - typings.awsDashSdk.awsDashSdkStrings.ANY
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type Type = _Type | String
  type __blob = Buffer | Uint8Array | Blob | String
  type __boolean = Boolean
  type __double = Double
  type __integer = Double
  type __string = String
  type __timestampIso8601 = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-12-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
