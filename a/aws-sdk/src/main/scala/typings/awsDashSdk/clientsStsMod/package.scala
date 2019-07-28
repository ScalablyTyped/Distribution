package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsStsMod {
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
    - typings.awsDashSdk.awsDashSdkStrings.latest
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
  type tokenCodeType = String
  type tokenType = String
  type urlType = String
  type userIdType = String
  type userNameType = String
  type webIdentitySubjectType = String
}
