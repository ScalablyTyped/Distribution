package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCognitosyncMod {
  type ApplicationArn = java.lang.String
  type ApplicationArnList = js.Array[ApplicationArn]
  type AssumeRoleArn = java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_STARTED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - java.lang.String
  */
  type BulkPublishStatus = _BulkPublishStatus | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientContext = java.lang.String
  type CognitoEventType = java.lang.String
  type DatasetList = js.Array[Dataset]
  type DatasetName = java.lang.String
  type DeviceId = java.lang.String
  type Events = StringDictionary[LambdaFunctionArn]
  type IdentityId = java.lang.String
  type IdentityPoolId = java.lang.String
  type IdentityPoolUsageList = js.Array[IdentityPoolUsage]
  type Integer = Double
  type IntegerString = Double
  type LambdaFunctionArn = java.lang.String
  type Long = Double
  type MergedDatasetNameList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.replace
    - typings.awsDashSdk.awsDashSdkStrings.remove
    - java.lang.String
  */
  type Operation = _Operation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.APNS
    - typings.awsDashSdk.awsDashSdkStrings.APNS_SANDBOX
    - typings.awsDashSdk.awsDashSdkStrings.GCM
    - typings.awsDashSdk.awsDashSdkStrings.ADM
    - java.lang.String
  */
  type Platform = _Platform | java.lang.String
  type PushToken = java.lang.String
  type RecordKey = java.lang.String
  type RecordList = js.Array[Record]
  type RecordPatchList = js.Array[RecordPatch]
  type RecordValue = java.lang.String
  type StreamName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type StreamingStatus = _StreamingStatus | java.lang.String
  type String = java.lang.String
  type SyncSessionToken = java.lang.String
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-06-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
