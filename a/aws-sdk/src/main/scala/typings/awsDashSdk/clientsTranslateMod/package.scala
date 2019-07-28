package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.KMS
import typings.awsDashSdk.awsDashSdkStrings.OVERWRITE
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTranslateMod {
  type AppliedTerminologyList = js.Array[AppliedTerminology]
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Description = java.lang.String
  type EncryptionKeyID = java.lang.String
  type EncryptionKeyType = KMS | java.lang.String
  type Integer = Double
  type LanguageCodeString = java.lang.String
  type LanguageCodeStringList = js.Array[LanguageCodeString]
  type MaxResultsInteger = Double
  type MergeStrategy = OVERWRITE | java.lang.String
  type NextToken = java.lang.String
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[ResourceName]
  type String = java.lang.String
  type TermList = js.Array[Term]
  type TerminologyArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CSV
    - typings.awsDashSdk.awsDashSdkStrings.TMX
    - java.lang.String
  */
  type TerminologyDataFormat = _TerminologyDataFormat | java.lang.String
  type TerminologyFile = Buffer | Uint8Array | Blob | java.lang.String
  type TerminologyPropertiesList = js.Array[TerminologyProperties]
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-07-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
