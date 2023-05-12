package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.BEGINS_WITH
import typings.awsSdk.awsSdkStrings.JPEGQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUT_MEDIA
  - typings.awsSdk.awsSdkStrings.GET_MEDIA
  - typings.awsSdk.awsSdkStrings.LIST_FRAGMENTS
  - typings.awsSdk.awsSdkStrings.GET_MEDIA_FOR_FRAGMENT_LIST
  - typings.awsSdk.awsSdkStrings.GET_HLS_STREAMING_SESSION_URL
  - typings.awsSdk.awsSdkStrings.GET_DASH_STREAMING_SESSION_URL
  - typings.awsSdk.awsSdkStrings.GET_CLIP
  - typings.awsSdk.awsSdkStrings.GET_IMAGES
  - java.lang.String
*/
type APIName = _APIName | String

type ChannelInfoList = js.Array[ChannelInfo]

type ChannelName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WSS
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.WEBRTC
  - java.lang.String
*/
type ChannelProtocol = _ChannelProtocol | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MASTER
  - typings.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
type ChannelRole = _ChannelRole | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SINGLE_MASTER
  - typings.awsSdk.awsSdkStrings.FULL_MESH
  - java.lang.String
*/
type ChannelType = _ChannelType | String

type ComparisonOperator = BEGINS_WITH | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ConfigurationStatus = _ConfigurationStatus | String

type DataEndpoint = String

type DataRetentionChangeInHours = Double

type DataRetentionInHours = Double

type DeleteAfterUpload = Boolean

type DestinationRegion = String

type DestinationUri = String

type DeviceName = String

type DurationInSeconds = Double

type EdgeRetentionInHours = Double

type FailedStatusDetails = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JPEG
  - typings.awsSdk.awsSdkStrings.PNG
  - java.lang.String
*/
type Format = _Format | String

type FormatConfig = StringDictionary[FormatConfigValue]

type FormatConfigKey = JPEGQuality | String

type FormatConfigValue = String

type HeightPixels = Double

type HubDeviceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - java.lang.String
*/
type ImageSelectorType = _ImageSelectorType | String

type KmsKeyId = String

type ListOfProtocols = js.Array[ChannelProtocol]

type ListStreamsInputLimit = Double

type MappedResourceConfigurationList = js.Array[MappedResourceConfigurationListItem]

type MappedResourceConfigurationListLimit = Double

type MaxLocalMediaSizeInMB = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type MediaStorageConfigurationStatus = _MediaStorageConfigurationStatus | String

type MediaType = String

type MediaUriSecretArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RTSP_URI
  - typings.awsSdk.awsSdkStrings.FILE_URI
  - java.lang.String
*/
type MediaUriType = _MediaUriType | String

type MessageTtlSeconds = Double

type NextToken = String

type ResourceARN = String

type ResourceEndpoint = String

type ResourceEndpointList = js.Array[ResourceEndpointListItem]

type ResourceTags = StringDictionary[TagValue]

type SamplingInterval = Double

type ScheduleExpression = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type Status = _Status | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELETE_OLDEST_MEDIA
  - typings.awsSdk.awsSdkStrings.DENY_NEW_MEDIA
  - java.lang.String
*/
type StrategyOnFullSize = _StrategyOnFullSize | String

type StreamInfoList = js.Array[StreamInfo]

type StreamName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SYNCING
  - typings.awsSdk.awsSdkStrings.ACKNOWLEDGED
  - typings.awsSdk.awsSdkStrings.IN_SYNC
  - typings.awsSdk.awsSdkStrings.SYNC_FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type SyncStatus = _SyncStatus | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagOnCreateList = js.Array[Tag]

type TagValue = String

type Timestamp = js.Date

type Type = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCREASE_DATA_RETENTION
  - typings.awsSdk.awsSdkStrings.DECREASE_DATA_RETENTION
  - java.lang.String
*/
type UpdateDataRetentionOperation = _UpdateDataRetentionOperation | String

type Version = String

type WidthPixels = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-09-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
