package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsGlacierMod {
  type AccessControlPolicyList = js.Array[Grant]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ArchiveRetrieval
    - awsDashSdkLib.awsDashSdkLibStrings.InventoryRetrieval
    - awsDashSdkLib.awsDashSdkLibStrings.Select
    - java.lang.String
  */
  type ActionCode = _ActionCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`private`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`public-read-write`
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-exec-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-read`
    - awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-full-control`
    - java.lang.String
  */
  type CannedACL = _CannedACL | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DataRetrievalRulesList = js.Array[DataRetrievalRule]
  type DateTime = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`aws:kms`
    - awsDashSdkLib.awsDashSdkLibStrings.AES256
    - java.lang.String
  */
  type EncryptionType = _EncryptionType | java.lang.String
  type ExpressionType = awsDashSdkLib.awsDashSdkLibStrings.SQL | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USE
    - awsDashSdkLib.awsDashSdkLibStrings.IGNORE
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - java.lang.String
  */
  type FileHeaderInfo = _FileHeaderInfo | java.lang.String
  type JobList = js.Array[GlacierJobDescription]
  type NotificationEventList = js.Array[java.lang.String]
  type NullableLong = scala.Double
  type PartList = js.Array[PartListElement]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FULL_CONTROL
    - awsDashSdkLib.awsDashSdkLibStrings.WRITE
    - awsDashSdkLib.awsDashSdkLibStrings.WRITE_ACP
    - awsDashSdkLib.awsDashSdkLibStrings.READ
    - awsDashSdkLib.awsDashSdkLibStrings.READ_ACP
    - java.lang.String
  */
  type Permission = _Permission | java.lang.String
  type ProvisionedCapacityList = js.Array[ProvisionedCapacityDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALWAYS
    - awsDashSdkLib.awsDashSdkLibStrings.ASNEEDED
    - java.lang.String
  */
  type QuoteFields = _QuoteFields | java.lang.String
  type Size = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type StatusCode = _StatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.REDUCED_REDUNDANCY
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD_IA
    - java.lang.String
  */
  type StorageClass = _StorageClass | java.lang.String
  type Stream = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AmazonCustomerByEmail
    - awsDashSdkLib.awsDashSdkLibStrings.CanonicalUser
    - awsDashSdkLib.awsDashSdkLibStrings.Group
    - java.lang.String
  */
  type Type = _Type | java.lang.String
  type UploadsList = js.Array[UploadListElement]
  type VaultList = js.Array[DescribeVaultOutput]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-06-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type hashmap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type httpstatus = scala.Double
  type long = scala.Double
}
