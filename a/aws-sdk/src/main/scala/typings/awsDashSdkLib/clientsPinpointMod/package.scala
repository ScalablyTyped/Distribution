package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPinpointMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN_APP
    - awsDashSdkLib.awsDashSdkLibStrings.DEEP_LINK
    - awsDashSdkLib.awsDashSdkLibStrings.URL
    - java.lang.String
  */
  type Action = _Action | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INCLUSIVE
    - awsDashSdkLib.awsDashSdkLibStrings.EXCLUSIVE
    - java.lang.String
  */
  type AttributeType = _AttributeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SCHEDULED
    - awsDashSdkLib.awsDashSdkLibStrings.EXECUTING
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING_NEXT_RUN
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.PAUSED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type CampaignStatus = _CampaignStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GCM
    - awsDashSdkLib.awsDashSdkLibStrings.APNS
    - awsDashSdkLib.awsDashSdkLibStrings.APNS_SANDBOX
    - awsDashSdkLib.awsDashSdkLibStrings.APNS_VOIP
    - awsDashSdkLib.awsDashSdkLibStrings.APNS_VOIP_SANDBOX
    - awsDashSdkLib.awsDashSdkLibStrings.ADM
    - awsDashSdkLib.awsDashSdkLibStrings.SMS
    - awsDashSdkLib.awsDashSdkLibStrings.VOICE
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL
    - awsDashSdkLib.awsDashSdkLibStrings.BAIDU
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM
    - java.lang.String
  */
  type ChannelType = _ChannelType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESSFUL
    - awsDashSdkLib.awsDashSdkLibStrings.THROTTLED
    - awsDashSdkLib.awsDashSdkLibStrings.TEMPORARY_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.PERMANENT_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.OPT_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE
    - java.lang.String
  */
  type DeliveryStatus = _DeliveryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INCLUSIVE
    - awsDashSdkLib.awsDashSdkLibStrings.EXCLUSIVE
    - java.lang.String
  */
  type DimensionType = _DimensionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HR_24
    - awsDashSdkLib.awsDashSdkLibStrings.DAY_7
    - awsDashSdkLib.awsDashSdkLibStrings.DAY_14
    - awsDashSdkLib.awsDashSdkLibStrings.DAY_30
    - java.lang.String
  */
  type Duration = _Duration | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SYSTEM
    - awsDashSdkLib.awsDashSdkLibStrings.ENDPOINT
    - java.lang.String
  */
  type FilterType = _FilterType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CSV
    - awsDashSdkLib.awsDashSdkLibStrings.JSON
    - java.lang.String
  */
  type Format = _Format | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ONCE
    - awsDashSdkLib.awsDashSdkLibStrings.HOURLY
    - awsDashSdkLib.awsDashSdkLibStrings.DAILY
    - awsDashSdkLib.awsDashSdkLibStrings.WEEKLY
    - awsDashSdkLib.awsDashSdkLibStrings.MONTHLY
    - awsDashSdkLib.awsDashSdkLibStrings.EVENT
    - java.lang.String
  */
  type Frequency = _Frequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - awsDashSdkLib.awsDashSdkLibStrings.ANY
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type Include = _Include | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.INITIALIZING
    - awsDashSdkLib.awsDashSdkLibStrings.PROCESSING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type ListOfActivityResponse = js.Array[ActivityResponse]
  type ListOfApplicationResponse = js.Array[ApplicationResponse]
  type ListOfCampaignResponse = js.Array[CampaignResponse]
  type ListOfEndpointBatchItem = js.Array[EndpointBatchItem]
  type ListOfEndpointResponse = js.Array[EndpointResponse]
  type ListOfExportJobResponse = js.Array[ExportJobResponse]
  type ListOfImportJobResponse = js.Array[ImportJobResponse]
  type ListOfResultRow = js.Array[ResultRow]
  type ListOfResultRowValue = js.Array[ResultRowValue]
  type ListOfSegmentDimensions = js.Array[SegmentDimensions]
  type ListOfSegmentGroup = js.Array[SegmentGroup]
  type ListOfSegmentReference = js.Array[SegmentReference]
  type ListOfSegmentResponse = js.Array[SegmentResponse]
  type ListOfTreatmentResource = js.Array[TreatmentResource]
  type ListOfWriteTreatmentResource = js.Array[WriteTreatmentResource]
  type ListOf__string = js.Array[__string]
  type MapOfAddressConfiguration = org.scalablytyped.runtime.StringDictionary[AddressConfiguration]
  type MapOfAttributeDimension = org.scalablytyped.runtime.StringDictionary[AttributeDimension]
  type MapOfChannelResponse = org.scalablytyped.runtime.StringDictionary[ChannelResponse]
  type MapOfEndpointMessageResult = org.scalablytyped.runtime.StringDictionary[EndpointMessageResult]
  type MapOfEndpointSendConfiguration = org.scalablytyped.runtime.StringDictionary[EndpointSendConfiguration]
  type MapOfEvent = org.scalablytyped.runtime.StringDictionary[Event]
  type MapOfEventItemResponse = org.scalablytyped.runtime.StringDictionary[EventItemResponse]
  type MapOfEventsBatch = org.scalablytyped.runtime.StringDictionary[EventsBatch]
  type MapOfItemResponse = org.scalablytyped.runtime.StringDictionary[ItemResponse]
  type MapOfListOf__string = org.scalablytyped.runtime.StringDictionary[ListOf__string]
  type MapOfMapOfEndpointMessageResult = org.scalablytyped.runtime.StringDictionary[MapOfEndpointMessageResult]
  type MapOfMessageResult = org.scalablytyped.runtime.StringDictionary[MessageResult]
  type MapOfMetricDimension = org.scalablytyped.runtime.StringDictionary[MetricDimension]
  type MapOf__double = org.scalablytyped.runtime.StringDictionary[__double]
  type MapOf__integer = org.scalablytyped.runtime.StringDictionary[__integer]
  type MapOf__string = org.scalablytyped.runtime.StringDictionary[__string]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TRANSACTIONAL
    - awsDashSdkLib.awsDashSdkLibStrings.PROMOTIONAL
    - java.lang.String
  */
  type MessageType = _MessageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DELIVERY
    - awsDashSdkLib.awsDashSdkLibStrings.FILTER
    - java.lang.String
  */
  type Mode = _Mode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type RecencyType = _RecencyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DIMENSIONAL
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT
    - java.lang.String
  */
  type SegmentType = _SegmentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - awsDashSdkLib.awsDashSdkLibStrings.ANY
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - awsDashSdkLib.awsDashSdkLibStrings.ANY
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type Type = _Type | java.lang.String
  type __blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type __boolean = scala.Boolean
  type __double = scala.Double
  type __integer = scala.Double
  type __string = java.lang.String
  type __timestampIso8601 = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-12-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
