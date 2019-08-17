package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGlacierMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.SQL
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.Uint8Array

  type AccessControlPolicyList = js.Array[Grant]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ArchiveRetrieval
    - typings.awsDashSdk.awsDashSdkStrings.InventoryRetrieval
    - typings.awsDashSdk.awsDashSdkStrings.Select
    - java.lang.String
  */
  type ActionCode = _ActionCode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`private`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read`
    - typings.awsDashSdk.awsDashSdkStrings.`public-read-write`
    - typings.awsDashSdk.awsDashSdkStrings.`aws-exec-read`
    - typings.awsDashSdk.awsDashSdkStrings.`authenticated-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-read`
    - typings.awsDashSdk.awsDashSdkStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type CannedACL = _CannedACL | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DataRetrievalRulesList = js.Array[DataRetrievalRule]
  type DateTime = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`aws:kms`
    - typings.awsDashSdk.awsDashSdkStrings.AES256
    - java.lang.String
  */
  type EncryptionType = _EncryptionType | String
  type ExpressionType = SQL | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USE
    - typings.awsDashSdk.awsDashSdkStrings.IGNORE
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - java.lang.String
  */
  type FileHeaderInfo = _FileHeaderInfo | String
  type JobList = js.Array[GlacierJobDescription]
  type NotificationEventList = js.Array[String]
  type NullableLong = Double
  type PartList = js.Array[PartListElement]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL_CONTROL
    - typings.awsDashSdk.awsDashSdkStrings.WRITE
    - typings.awsDashSdk.awsDashSdkStrings.WRITE_ACP
    - typings.awsDashSdk.awsDashSdkStrings.READ
    - typings.awsDashSdk.awsDashSdkStrings.READ_ACP
    - java.lang.String
  */
  type Permission = _Permission | String
  type ProvisionedCapacityList = js.Array[ProvisionedCapacityDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.ASNEEDED
    - java.lang.String
  */
  type QuoteFields = _QuoteFields | String
  type Size = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type StatusCode = _StatusCode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.REDUCED_REDUNDANCY
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD_IA
    - java.lang.String
  */
  type StorageClass = _StorageClass | String
  type Stream = Buffer | Uint8Array | Blob | String | Readable
  type TagKey = String
  type TagKeyList = js.Array[String]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AmazonCustomerByEmail
    - typings.awsDashSdk.awsDashSdkStrings.CanonicalUser
    - typings.awsDashSdk.awsDashSdkStrings.Group
    - java.lang.String
  */
  type Type = _Type | String
  type UploadsList = js.Array[UploadListElement]
  type VaultList = js.Array[DescribeVaultOutput]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2012-06-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type hashmap = StringDictionary[String]
  type httpstatus = Double
  type long = Double
}
