package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCognitoidentityMod {
  type ARNString = java.lang.String
  type AccessKeyString = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AuthenticatedRole
    - awsDashSdkLib.awsDashSdkLibStrings.Deny
    - java.lang.String
  */
  type AmbiguousRoleResolutionType = _AmbiguousRoleResolutionType | java.lang.String
  type ClaimName = java.lang.String
  type ClaimValue = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CognitoIdentityProviderClientId = java.lang.String
  type CognitoIdentityProviderList = js.Array[CognitoIdentityProvider]
  type CognitoIdentityProviderName = java.lang.String
  type CognitoIdentityProviderTokenCheck = scala.Boolean
  type DateType = stdLib.Date
  type DeveloperProviderName = java.lang.String
  type DeveloperUserIdentifier = java.lang.String
  type DeveloperUserIdentifierList = js.Array[DeveloperUserIdentifier]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AccessDenied
    - awsDashSdkLib.awsDashSdkLibStrings.InternalServerError
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type HideDisabled = scala.Boolean
  type IdentitiesList = js.Array[IdentityDescription]
  type IdentityId = java.lang.String
  type IdentityIdList = js.Array[IdentityId]
  type IdentityPoolId = java.lang.String
  type IdentityPoolName = java.lang.String
  type IdentityPoolTagsListType = js.Array[TagKeysType]
  type IdentityPoolTagsType = org.scalablytyped.runtime.StringDictionary[TagValueType]
  type IdentityPoolUnauthenticated = scala.Boolean
  type IdentityPoolsList = js.Array[IdentityPoolShortDescription]
  type IdentityProviderId = java.lang.String
  type IdentityProviderName = java.lang.String
  type IdentityProviderToken = java.lang.String
  type IdentityProviders = org.scalablytyped.runtime.StringDictionary[IdentityProviderId]
  type LoginsList = js.Array[IdentityProviderName]
  type LoginsMap = org.scalablytyped.runtime.StringDictionary[IdentityProviderToken]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Equals
    - awsDashSdkLib.awsDashSdkLibStrings.Contains
    - awsDashSdkLib.awsDashSdkLibStrings.StartsWith
    - awsDashSdkLib.awsDashSdkLibStrings.NotEqual
    - java.lang.String
  */
  type MappingRuleMatchType = _MappingRuleMatchType | java.lang.String
  type MappingRulesList = js.Array[MappingRule]
  type OIDCProviderList = js.Array[ARNString]
  type OIDCToken = java.lang.String
  type PaginationKey = java.lang.String
  type QueryLimit = scala.Double
  type RoleMappingMap = org.scalablytyped.runtime.StringDictionary[RoleMapping]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Token
    - awsDashSdkLib.awsDashSdkLibStrings.Rules
    - java.lang.String
  */
  type RoleMappingType = _RoleMappingType | java.lang.String
  type RoleType = java.lang.String
  type RolesMap = org.scalablytyped.runtime.StringDictionary[ARNString]
  type SAMLProviderList = js.Array[ARNString]
  type SecretKeyString = java.lang.String
  type SessionTokenString = java.lang.String
  type TagKeysType = java.lang.String
  type TagValueType = java.lang.String
  type TokenDuration = scala.Double
  type UnprocessedIdentityIdList = js.Array[UnprocessedIdentityId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-06-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
