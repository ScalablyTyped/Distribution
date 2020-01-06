package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideoMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.BEGINS_WITH
  import typings.awsDashSdk.awsDashSdkStrings.SINGLE_MASTER
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PUT_MEDIA
    - typings.awsDashSdk.awsDashSdkStrings.GET_MEDIA
    - typings.awsDashSdk.awsDashSdkStrings.LIST_FRAGMENTS
    - typings.awsDashSdk.awsDashSdkStrings.GET_MEDIA_FOR_FRAGMENT_LIST
    - typings.awsDashSdk.awsDashSdkStrings.GET_HLS_STREAMING_SESSION_URL
    - typings.awsDashSdk.awsDashSdkStrings.GET_DASH_STREAMING_SESSION_URL
    - java.lang.String
  */
  type APIName = _APIName | String
  type ChannelInfoList = js.Array[ChannelInfo]
  type ChannelName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WSS
    - typings.awsDashSdk.awsDashSdkStrings.HTTPS
    - java.lang.String
  */
  type ChannelProtocol = _ChannelProtocol | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MASTER
    - typings.awsDashSdk.awsDashSdkStrings.VIEWER
    - java.lang.String
  */
  type ChannelRole = _ChannelRole | String
  type ChannelType = SINGLE_MASTER | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperator = BEGINS_WITH | String
  type DataEndpoint = String
  type DataRetentionChangeInHours = Double
  type DataRetentionInHours = Double
  type DeviceName = String
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
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
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INCREASE_DATA_RETENTION
    - typings.awsDashSdk.awsDashSdkStrings.DECREASE_DATA_RETENTION
    - java.lang.String
  */
  type UpdateDataRetentionOperation = _UpdateDataRetentionOperation | String
  type Version = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
