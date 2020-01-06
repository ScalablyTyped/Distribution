package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsQldbMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ALLOW_ALL
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type Arn = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DeletionProtection = Boolean
  type Digest = Buffer | Uint8Array | Blob | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - java.lang.String
  */
  type ExportStatus = _ExportStatus | String
  type IonText = String
  type JournalS3ExportList = js.Array[JournalS3ExportDescription]
  type LedgerList = js.Array[LedgerSummary]
  type LedgerName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type LedgerState = _LedgerState | String
  type MaxResults = Double
  type NextToken = String
  type PermissionsMode = ALLOW_ALL | String
  type S3Bucket = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SSE_KMS
    - typings.awsDashSdk.awsDashSdkStrings.SSE_S3
    - typings.awsDashSdk.awsDashSdkStrings.NO_ENCRYPTION
    - java.lang.String
  */
  type S3ObjectEncryptionType = _S3ObjectEncryptionType | String
  type S3Prefix = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = StringDictionary[TagValue]
  type Timestamp = Date
  type UniqueId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-01-02`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
