package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCognitoidentityMod {
  type ARNString = String
  type AccessKeyString = String
  type AccountId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AuthenticatedRole
    - typings.awsDashSdk.awsDashSdkStrings.Deny
    - java.lang.String
  */
  type AmbiguousRoleResolutionType = _AmbiguousRoleResolutionType | String
  type ClaimName = String
  type ClaimValue = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CognitoIdentityProviderClientId = String
  type CognitoIdentityProviderList = js.Array[CognitoIdentityProvider]
  type CognitoIdentityProviderName = String
  type CognitoIdentityProviderTokenCheck = Boolean
  type DateType = Date
  type DeveloperProviderName = String
  type DeveloperUserIdentifier = String
  type DeveloperUserIdentifierList = js.Array[DeveloperUserIdentifier]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AccessDenied
    - typings.awsDashSdk.awsDashSdkStrings.InternalServerError
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | String
  type HideDisabled = Boolean
  type IdentitiesList = js.Array[IdentityDescription]
  type IdentityId = String
  type IdentityIdList = js.Array[IdentityId]
  type IdentityPoolId = String
  type IdentityPoolName = String
  type IdentityPoolTagsListType = js.Array[TagKeysType]
  type IdentityPoolTagsType = StringDictionary[TagValueType]
  type IdentityPoolUnauthenticated = Boolean
  type IdentityPoolsList = js.Array[IdentityPoolShortDescription]
  type IdentityProviderId = String
  type IdentityProviderName = String
  type IdentityProviderToken = String
  type IdentityProviders = StringDictionary[IdentityProviderId]
  type LoginsList = js.Array[IdentityProviderName]
  type LoginsMap = StringDictionary[IdentityProviderToken]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Equals
    - typings.awsDashSdk.awsDashSdkStrings.Contains
    - typings.awsDashSdk.awsDashSdkStrings.StartsWith
    - typings.awsDashSdk.awsDashSdkStrings.NotEqual
    - java.lang.String
  */
  type MappingRuleMatchType = _MappingRuleMatchType | String
  type MappingRulesList = js.Array[MappingRule]
  type OIDCProviderList = js.Array[ARNString]
  type OIDCToken = String
  type PaginationKey = String
  type QueryLimit = Double
  type RoleMappingMap = StringDictionary[RoleMapping]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Token
    - typings.awsDashSdk.awsDashSdkStrings.Rules
    - java.lang.String
  */
  type RoleMappingType = _RoleMappingType | String
  type RoleType = String
  type RolesMap = StringDictionary[ARNString]
  type SAMLProviderList = js.Array[ARNString]
  type SecretKeyString = String
  type SessionTokenString = String
  type TagKeysType = String
  type TagValueType = String
  type TokenDuration = Double
  type UnprocessedIdentityIdList = js.Array[UnprocessedIdentityId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-06-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
