package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsTranslateMod {
  type AppliedTerminologyList = js.Array[AppliedTerminology]
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Description = java.lang.String
  type EncryptionKeyID = java.lang.String
  type EncryptionKeyType = awsDashSdkLib.awsDashSdkLibStrings.KMS | java.lang.String
  type Integer = scala.Double
  type LanguageCodeString = java.lang.String
  type LanguageCodeStringList = js.Array[LanguageCodeString]
  type MaxResultsInteger = scala.Double
  type MergeStrategy = awsDashSdkLib.awsDashSdkLibStrings.OVERWRITE | java.lang.String
  type NextToken = java.lang.String
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[ResourceName]
  type String = java.lang.String
  type TermList = js.Array[Term]
  type TerminologyArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CSV
    - awsDashSdkLib.awsDashSdkLibStrings.TMX
    - java.lang.String
  */
  type TerminologyDataFormat = _TerminologyDataFormat | java.lang.String
  type TerminologyFile = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type TerminologyPropertiesList = js.Array[TerminologyProperties]
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-07-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
