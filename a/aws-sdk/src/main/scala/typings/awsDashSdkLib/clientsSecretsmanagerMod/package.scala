package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSecretsmanagerMod {
  type AutomaticallyRotateAfterDaysType = scala.Double
  type BooleanType = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestTokenType = java.lang.String
  type CreatedDateType = stdLib.Date
  type DeletedDateType = stdLib.Date
  type DeletionDateType = stdLib.Date
  type DescriptionType = java.lang.String
  type ExcludeCharactersType = java.lang.String
  type ExcludeLowercaseType = scala.Boolean
  type ExcludeNumbersType = scala.Boolean
  type ExcludePunctuationType = scala.Boolean
  type ExcludeUppercaseType = scala.Boolean
  type IncludeSpaceType = scala.Boolean
  type KmsKeyIdType = java.lang.String
  type LastAccessedDateType = stdLib.Date
  type LastChangedDateType = stdLib.Date
  type LastRotatedDateType = stdLib.Date
  type MaxResultsType = scala.Double
  type NameType = java.lang.String
  type NextTokenType = java.lang.String
  type NonEmptyResourcePolicyType = java.lang.String
  type OwningServiceType = java.lang.String
  type PasswordLengthType = scala.Double
  type RandomPasswordType = java.lang.String
  type RecoveryWindowInDaysType = scala.Double
  type RequireEachIncludedTypeType = scala.Boolean
  type RotationEnabledType = scala.Boolean
  type RotationLambdaARNType = java.lang.String
  type SecretARNType = java.lang.String
  type SecretBinaryType = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type SecretIdType = java.lang.String
  type SecretListType = js.Array[SecretListEntry]
  type SecretNameType = java.lang.String
  type SecretStringType = java.lang.String
  type SecretVersionIdType = java.lang.String
  type SecretVersionStageType = java.lang.String
  type SecretVersionStagesType = js.Array[SecretVersionStageType]
  type SecretVersionsListType = js.Array[SecretVersionsListEntry]
  type SecretVersionsToStagesMapType = org.scalablytyped.runtime.StringDictionary[SecretVersionStagesType]
  type TagKeyListType = js.Array[TagKeyType]
  type TagKeyType = java.lang.String
  type TagListType = js.Array[Tag]
  type TagValueType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-10-17`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
