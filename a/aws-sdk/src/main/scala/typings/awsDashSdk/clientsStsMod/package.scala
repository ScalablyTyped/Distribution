package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsStsMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Audience = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Issuer = String
  type NameQualifier = String
  type SAMLAssertionType = String
  type Subject = String
  type SubjectType = String
  type accessKeyIdType = String
  type accessKeySecretType = String
  type accountType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2011-06-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type arnType = String
  type assumedRoleIdType = String
  type clientTokenType = String
  type dateType = Date
  type decodedMessageType = String
  type durationSecondsType = Double
  type encodedMessageType = String
  type externalIdType = String
  type federatedIdType = String
  type nonNegativeIntegerType = Double
  type policyDescriptorListType = js.Array[PolicyDescriptorType]
  type roleDurationSecondsType = Double
  type roleSessionNameType = String
  type serialNumberType = String
  type sessionPolicyDocumentType = String
  type tagKeyListType = js.Array[tagKeyType]
  type tagKeyType = String
  type tagListType = js.Array[Tag]
  type tagValueType = String
  type tokenCodeType = String
  type tokenType = String
  type urlType = String
  type userIdType = String
  type userNameType = String
  type webIdentitySubjectType = String
}
