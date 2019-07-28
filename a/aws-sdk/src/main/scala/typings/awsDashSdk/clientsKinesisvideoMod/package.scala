package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.BEGINS_WITH
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideoMod {
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
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperator = BEGINS_WITH | String
  type DataEndpoint = String
  type DataRetentionChangeInHours = Double
  type DataRetentionInHours = Double
  type DeviceName = String
  type KmsKeyId = String
  type ListStreamsInputLimit = Double
  type MediaType = String
  type NextToken = String
  type ResourceARN = String
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
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
