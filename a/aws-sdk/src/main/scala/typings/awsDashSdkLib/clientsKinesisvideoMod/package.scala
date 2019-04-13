package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideoMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUT_MEDIA
    - awsDashSdkLib.awsDashSdkLibStrings.GET_MEDIA
    - awsDashSdkLib.awsDashSdkLibStrings.LIST_FRAGMENTS
    - awsDashSdkLib.awsDashSdkLibStrings.GET_MEDIA_FOR_FRAGMENT_LIST
    - awsDashSdkLib.awsDashSdkLibStrings.GET_HLS_STREAMING_SESSION_URL
    - java.lang.String
  */
  type APIName = _APIName | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperator = awsDashSdkLib.awsDashSdkLibStrings.BEGINS_WITH | java.lang.String
  type DataEndpoint = java.lang.String
  type DataRetentionChangeInHours = scala.Double
  type DataRetentionInHours = scala.Double
  type DeviceName = java.lang.String
  type KmsKeyId = java.lang.String
  type ListStreamsInputLimit = scala.Double
  type MediaType = java.lang.String
  type NextToken = java.lang.String
  type ResourceARN = java.lang.String
  type ResourceTags = org.scalablytyped.runtime.StringDictionary[TagValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type StreamInfoList = js.Array[StreamInfo]
  type StreamName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INCREASE_DATA_RETENTION
    - awsDashSdkLib.awsDashSdkLibStrings.DECREASE_DATA_RETENTION
    - java.lang.String
  */
  type UpdateDataRetentionOperation = _UpdateDataRetentionOperation | java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
