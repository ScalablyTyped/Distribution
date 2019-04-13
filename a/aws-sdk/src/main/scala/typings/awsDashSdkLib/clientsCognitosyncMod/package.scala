package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCognitosyncMod {
  type ApplicationArn = java.lang.String
  type ApplicationArnList = js.Array[ApplicationArn]
  type AssumeRoleArn = java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - java.lang.String
  */
  type BulkPublishStatus = _BulkPublishStatus | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientContext = java.lang.String
  type CognitoEventType = java.lang.String
  type DatasetList = js.Array[Dataset]
  type DatasetName = java.lang.String
  type DeviceId = java.lang.String
  type Events = org.scalablytyped.runtime.StringDictionary[LambdaFunctionArn]
  type IdentityId = java.lang.String
  type IdentityPoolId = java.lang.String
  type IdentityPoolUsageList = js.Array[IdentityPoolUsage]
  type Integer = scala.Double
  type IntegerString = scala.Double
  type LambdaFunctionArn = java.lang.String
  type Long = scala.Double
  type MergedDatasetNameList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.replace
    - awsDashSdkLib.awsDashSdkLibStrings.remove
    - java.lang.String
  */
  type Operation = _Operation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.APNS
    - awsDashSdkLib.awsDashSdkLibStrings.APNS_SANDBOX
    - awsDashSdkLib.awsDashSdkLibStrings.GCM
    - awsDashSdkLib.awsDashSdkLibStrings.ADM
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
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type StreamingStatus = _StreamingStatus | java.lang.String
  type String = java.lang.String
  type SyncSessionToken = java.lang.String
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-06-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
