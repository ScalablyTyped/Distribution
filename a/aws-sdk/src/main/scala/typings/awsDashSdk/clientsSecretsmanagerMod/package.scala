package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSecretsmanagerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AutomaticallyRotateAfterDaysType = Double
  type BooleanType = Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestTokenType = String
  type CreatedDateType = Date
  type DeletedDateType = Date
  type DeletionDateType = Date
  type DescriptionType = String
  type ExcludeCharactersType = String
  type ExcludeLowercaseType = Boolean
  type ExcludeNumbersType = Boolean
  type ExcludePunctuationType = Boolean
  type ExcludeUppercaseType = Boolean
  type IncludeSpaceType = Boolean
  type KmsKeyIdType = String
  type LastAccessedDateType = Date
  type LastChangedDateType = Date
  type LastRotatedDateType = Date
  type MaxResultsType = Double
  type NameType = String
  type NextTokenType = String
  type NonEmptyResourcePolicyType = String
  type OwningServiceType = String
  type PasswordLengthType = Double
  type RandomPasswordType = String
  type RecoveryWindowInDaysType = Double
  type RequireEachIncludedTypeType = Boolean
  type RotationEnabledType = Boolean
  type RotationLambdaARNType = String
  type SecretARNType = String
  type SecretBinaryType = Buffer | Uint8Array | Blob | String
  type SecretIdType = String
  type SecretListType = js.Array[SecretListEntry]
  type SecretNameType = String
  type SecretStringType = String
  type SecretVersionIdType = String
  type SecretVersionStageType = String
  type SecretVersionStagesType = js.Array[SecretVersionStageType]
  type SecretVersionsListType = js.Array[SecretVersionsListEntry]
  type SecretVersionsToStagesMapType = StringDictionary[SecretVersionStagesType]
  type TagKeyListType = js.Array[TagKeyType]
  type TagKeyType = String
  type TagListType = js.Array[Tag]
  type TagValueType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-17`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
