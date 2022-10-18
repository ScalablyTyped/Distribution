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

type DestinationRegion = String

type DestinationUri = String

type DeviceName = String

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

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - java.lang.String
*/
type ImageSelectorType = _ImageSelectorType | String

type KmsKeyId = String

type ListOfProtocols = js.Array[ChannelProtocol]

type ListStreamsInputLimit = Double

type MediaType = String

type MessageTtlSeconds = Double

type NextToken = String

type ResourceARN = String

type ResourceEndpoint = String

type ResourceEndpointList = js.Array[ResourceEndpointListItem]

type ResourceTags = StringDictionary[TagValue]

type SamplingInterval = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type Status = _Status | String

type StreamInfoList = js.Array[StreamInfo]

type StreamName = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagOnCreateList = js.Array[Tag]

type TagValue = String

type Timestamp = js.Date

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
