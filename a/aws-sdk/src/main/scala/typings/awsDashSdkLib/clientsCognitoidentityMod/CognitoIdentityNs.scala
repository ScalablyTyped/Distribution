package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cognitoidentity", "CognitoIdentity")
@js.native
object CognitoIdentityNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CognitoIdentityProvider extends js.Object {
    /**
      * The client ID for the Amazon Cognito user pool.
      */
    var ClientId: js.UndefOr[CognitoIdentityProviderClientId] = js.undefined
    /**
      * The provider name for an Amazon Cognito user pool. For example, cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789.
      */
    var ProviderName: js.UndefOr[CognitoIdentityProviderName] = js.undefined
    /**
      * TRUE if server-side token validation is enabled for the identity provider’s token. Once you set ServerSideTokenCheck to TRUE for an identity pool, that identity pool will check with the integrated user pools to make sure that the user has not been globally signed out or deleted before the identity pool provides an OIDC token or AWS credentials for the user. If the user is signed out or deleted, the identity pool will return a 400 Not Authorized error.
      */
    var ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck] = js.undefined
  }
  
  trait CreateIdentityPoolInput extends js.Object {
    /**
      * TRUE if the identity pool supports unauthenticated logins.
      */
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    /**
      * An array of Amazon Cognito user pools and their client IDs.
      */
    var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined
    /**
      * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters as well as period (.), underscore (_), and dash (-). Once you have set a developer provider name, you cannot change it. Please take care in setting this parameter.
      */
    var DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined
    /**
      * A string that you provide.
      */
    var IdentityPoolName: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolName
    /**
      * Tags to assign to the identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
      */
    var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.undefined
    /**
      * A list of OpendID Connect provider ARNs.
      */
    var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined
    /**
      * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.
      */
    var SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined
    /**
      * Optional key:value pairs mapping provider names to provider app IDs.
      */
    var SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined
  }
  
  trait Credentials extends js.Object {
    /**
      * The Access Key portion of the credentials.
      */
    var AccessKeyId: js.UndefOr[AccessKeyString] = js.undefined
    /**
      * The date at which these credentials will expire.
      */
    var Expiration: js.UndefOr[DateType] = js.undefined
    /**
      * The Secret Access Key portion of the credentials
      */
    var SecretKey: js.UndefOr[SecretKeyString] = js.undefined
    /**
      * The Session Token portion of the credentials
      */
    var SessionToken: js.UndefOr[SessionTokenString] = js.undefined
  }
  
  trait DeleteIdentitiesInput extends js.Object {
    /**
      * A list of 1-60 identities that you want to delete.
      */
    var IdentityIdsToDelete: IdentityIdList
  }
  
  trait DeleteIdentitiesResponse extends js.Object {
    /**
      * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
      */
    var UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.undefined
  }
  
  trait DeleteIdentityPoolInput extends js.Object {
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
  }
  
  trait DescribeIdentityInput extends js.Object {
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityId
  }
  
  trait DescribeIdentityPoolInput extends js.Object {
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
  }
  
  trait GetCredentialsForIdentityInput
    extends awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityCredentialsInputs {
    /**
      * The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers that do not support role customization.
      */
    var CustomRoleArn: js.UndefOr[ARNString] = js.undefined
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityId
    /**
      * A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will follow the syntax "provider_name": "provider_user_identifier". Logins should not be specified when trying to get credentials for an unauthenticated identity. The Logins parameter is required when using identities associated with external identity providers such as FaceBook. For examples of Logins maps, see the code examples in the External Identity Providers section of the Amazon Cognito Developer Guide.
      */
    var Logins: js.UndefOr[LoginsMap] = js.undefined
  }
  
  trait GetCredentialsForIdentityResponse extends js.Object {
    /**
      * Credentials for the provided identity ID.
      */
    var Credentials: js.UndefOr[Credentials] = js.undefined
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
  }
  
  trait GetIdInput
    extends awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityCredentialsInputs {
    /**
      * A standard AWS account ID (9+ digits).
      */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
    /**
      * A set of optional name-value pairs that map provider names to provider tokens. The available provider names for Logins are as follows:   Facebook: graph.facebook.com    Amazon Cognito user pool: cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;, for example, cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789.    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com   
      */
    var Logins: js.UndefOr[LoginsMap] = js.undefined
  }
  
  trait GetIdResponse extends js.Object {
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
  }
  
  trait GetIdentityPoolRolesInput extends js.Object {
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
  }
  
  trait GetIdentityPoolRolesResponse extends js.Object {
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    /**
      * How users for a specific identity provider are to mapped to roles. This is a String-to-RoleMapping object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
      */
    var RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined
    /**
      * The map of roles associated with this pool. Currently only authenticated and unauthenticated roles are supported.
      */
    var Roles: js.UndefOr[RolesMap] = js.undefined
  }
  
  trait GetOpenIdTokenForDeveloperIdentityInput extends js.Object {
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
    /**
      * A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair represents a user from a public provider or developer provider. If the user is from a developer provider, the name-value pair will follow the syntax "developer_provider_name": "developer_user_identifier". The developer provider is the "domain" by which Cognito will refer to your users; you provided this domain while creating/updating the identity pool. The developer user identifier is an identifier from your backend that uniquely identifies a user. When you create an identity pool, you can specify the supported logins.
      */
    var Logins: LoginsMap
    /**
      * The expiration time of the token, in seconds. You can specify a custom expiration time for the token so that you can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can exchange the token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one hour. The maximum token duration you can set is 24 hours. You should take care in setting the expiration time for a token, as there are significant security implications: an attacker could use a leaked token to access your AWS resources for the token's duration.
      */
    var TokenDuration: js.UndefOr[TokenDuration] = js.undefined
  }
  
  trait GetOpenIdTokenForDeveloperIdentityResponse extends js.Object {
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
    /**
      * An OpenID token.
      */
    var Token: js.UndefOr[OIDCToken] = js.undefined
  }
  
  trait GetOpenIdTokenInput
    extends awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityCredentialsInputs {
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityId
    /**
      * A set of optional name-value pairs that map provider names to provider tokens. When using graph.facebook.com and www.amazon.com, supply the access_token returned from the provider's authflow. For accounts.google.com, an Amazon Cognito user pool provider, or any other OpenId Connect provider, always include the id_token.
      */
    var Logins: js.UndefOr[LoginsMap] = js.undefined
  }
  
  trait GetOpenIdTokenResponse extends js.Object {
    /**
      * A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
    /**
      * An OpenID token, valid for 10 minutes.
      */
    var Token: js.UndefOr[OIDCToken] = js.undefined
  }
  
  trait IdentityDescription extends js.Object {
    /**
      * Date on which the identity was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
    /**
      * Date on which the identity was last modified.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The provider names.
      */
    var Logins: js.UndefOr[LoginsList] = js.undefined
  }
  
  trait IdentityPool extends js.Object {
    /**
      * TRUE if the identity pool supports unauthenticated logins.
      */
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    /**
      * A list representing an Amazon Cognito user pool and its client ID.
      */
    var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined
    /**
      * The "domain" by which Cognito will refer to your users.
      */
    var DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
    /**
      * A string that you provide.
      */
    var IdentityPoolName: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolName
    /**
      * The tags that are assigned to the identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
      */
    var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.undefined
    /**
      * A list of OpendID Connect provider ARNs.
      */
    var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined
    /**
      * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.
      */
    var SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined
    /**
      * Optional key:value pairs mapping provider names to provider app IDs.
      */
    var SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined
  }
  
  trait IdentityPoolShortDescription extends js.Object {
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    /**
      * A string that you provide.
      */
    var IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined
  }
  
  trait IdentityPoolTagsType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValueType]
  
  trait IdentityProviders
    extends /* key */ org.scalablytyped.runtime.StringDictionary[IdentityProviderId]
  
  trait ListIdentitiesInput extends js.Object {
    /**
      * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API will include disabled identities in the response.
      */
    var HideDisabled: js.UndefOr[HideDisabled] = js.undefined
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
    /**
      * The maximum number of identities to return.
      */
    var MaxResults: QueryLimit
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait ListIdentitiesResponse extends js.Object {
    /**
      * An object containing a set of identities and associated mappings.
      */
    var Identities: js.UndefOr[IdentitiesList] = js.undefined
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait ListIdentityPoolsInput extends js.Object {
    /**
      * The maximum number of identities to return.
      */
    var MaxResults: QueryLimit
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait ListIdentityPoolsResponse extends js.Object {
    /**
      * The identity pools returned by the ListIdentityPools action.
      */
    var IdentityPools: js.UndefOr[IdentityPoolsList] = js.undefined
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait ListTagsForResourceInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the identity pool that the tags are assigned to.
      */
    var ResourceArn: ARNString
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * The tags that are assigned to the identity pool.
      */
    var Tags: js.UndefOr[IdentityPoolTagsType] = js.undefined
  }
  
  trait LoginsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[IdentityProviderToken]
  
  trait LookupDeveloperIdentityInput extends js.Object {
    /**
      * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity provider would issue many developer user identifiers, in keeping with the number of users.
      */
    var DeveloperUserIdentifier: js.UndefOr[DeveloperUserIdentifier] = js.undefined
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
    /**
      * The maximum number of identities to return.
      */
    var MaxResults: js.UndefOr[QueryLimit] = js.undefined
    /**
      * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait LookupDeveloperIdentityResponse extends js.Object {
    /**
      * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association of multiple developer user identifiers with an identity ID.
      */
    var DeveloperUserIdentifierList: js.UndefOr[DeveloperUserIdentifierList] = js.undefined
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
    /**
      * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait MappingRule extends js.Object {
    /**
      * The claim name that must be present in the token, for example, "isAdmin" or "paid".
      */
    var Claim: ClaimName
    /**
      * The match condition that specifies how closely the claim value in the IdP token must match Value.
      */
    var MatchType: MappingRuleMatchType
    /**
      * The role ARN.
      */
    var RoleARN: ARNString
    /**
      * A brief string that the claim must match, for example, "paid" or "yes".
      */
    var Value: ClaimValue
  }
  
  trait MergeDeveloperIdentitiesInput extends js.Object {
    /**
      * User identifier for the destination user. The value should be a DeveloperUserIdentifier.
      */
    var DestinationUserIdentifier: DeveloperUserIdentifier
    /**
      * The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide while creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters as well as period (.), underscore (_), and dash (-).
      */
    var DeveloperProviderName: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeveloperProviderName
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
    /**
      * User identifier for the source user. The value should be a DeveloperUserIdentifier.
      */
    var SourceUserIdentifier: DeveloperUserIdentifier
  }
  
  trait MergeDeveloperIdentitiesResponse extends js.Object {
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
  }
  
  trait RoleMapping extends js.Object {
    /**
      * If you specify Token or Rules as the Type, AmbiguousRoleResolution is required. Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type.
      */
    var AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType] = js.undefined
    /**
      * The rules to be used for mapping users to roles. If you specify Rules as the role mapping type, RulesConfiguration is required.
      */
    var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined
    /**
      * The role mapping type. Token will use cognito:roles and cognito:preferred_role claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the token to map to a role.
      */
    var Type: RoleMappingType
  }
  
  trait RoleMappingMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[RoleMapping]
  
  trait RolesMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ARNString]
  
  trait RulesConfigurationType extends js.Object {
    /**
      * An array of rules. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
      */
    var Rules: MappingRulesList
  }
  
  trait SetIdentityPoolRolesInput extends js.Object {
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
    /**
      * How users for a specific identity provider are to mapped to roles. This is a string to RoleMapping object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id". Up to 25 rules can be specified per identity provider.
      */
    var RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined
    /**
      * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
      */
    var Roles: RolesMap
  }
  
  trait TagResourceInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the identity pool to assign the tags to.
      */
    var ResourceArn: ARNString
    /**
      * The tags to assign to the identity pool.
      */
    var Tags: js.UndefOr[IdentityPoolTagsType] = js.undefined
  }
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are as follows:   Facebook: graph.facebook.com    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com    You must use AWS Developer credentials to call this API.
      */
    def createIdentityPool(): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createIdentityPool(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ IdentityPool, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new identity pool. The identity pool is a store of user identity information that is specific to your AWS account. The limit on identity pools is 60 per account. The keys for SupportedLoginProviders are as follows:   Facebook: graph.facebook.com    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com    You must use AWS Developer credentials to call this API.
      */
    def createIdentityPool(params: CreateIdentityPoolInput): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createIdentityPool(
      params: CreateIdentityPoolInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ IdentityPool, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete. You must use AWS Developer credentials to call this API.
      */
    def deleteIdentities(): awsDashSdkLib.libRequestMod.Request[DeleteIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIdentities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes identities from an identity pool. You can specify a list of 1-60 identities that you want to delete. You must use AWS Developer credentials to call this API.
      */
    def deleteIdentities(params: DeleteIdentitiesInput): awsDashSdkLib.libRequestMod.Request[DeleteIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIdentities(
      params: DeleteIdentitiesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool. You must use AWS Developer credentials to call this API.
      */
    def deleteIdentityPool(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIdentityPool(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an identity pool. Once a pool is deleted, users will not be able to authenticate with the pool. You must use AWS Developer credentials to call this API.
      */
    def deleteIdentityPool(params: DeleteIdentityPoolInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIdentityPool(
      params: DeleteIdentityPoolInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata related to the given identity, including when the identity was created and any associated linked logins. You must use AWS Developer credentials to call this API.
      */
    def describeIdentity(): awsDashSdkLib.libRequestMod.Request[IdentityDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IdentityDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IdentityDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata related to the given identity, including when the identity was created and any associated linked logins. You must use AWS Developer credentials to call this API.
      */
    def describeIdentity(params: DescribeIdentityInput): awsDashSdkLib.libRequestMod.Request[IdentityDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeIdentity(
      params: DescribeIdentityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ IdentityDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[IdentityDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users. You must use AWS Developer credentials to call this API.
      */
    def describeIdentityPool(): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeIdentityPool(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ IdentityPool, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about a particular identity pool, including the pool name, ID description, creation date, and current number of users. You must use AWS Developer credentials to call this API.
      */
    def describeIdentityPool(params: DescribeIdentityPoolInput): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeIdentityPool(
      params: DescribeIdentityPoolInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ IdentityPool, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token. This is a public API. You do not need any credentials to call this API.
      */
    def getCredentialsForIdentity(): awsDashSdkLib.libRequestMod.Request[GetCredentialsForIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCredentialsForIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCredentialsForIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCredentialsForIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns credentials for the provided identity ID. Any provided logins will be validated against supported login providers. If the token is for cognito-identity.amazonaws.com, it will be passed through to AWS Security Token Service with the appropriate role for the token. This is a public API. You do not need any credentials to call this API.
      */
    def getCredentialsForIdentity(params: GetCredentialsForIdentityInput): awsDashSdkLib.libRequestMod.Request[GetCredentialsForIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCredentialsForIdentity(
      params: GetCredentialsForIdentityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCredentialsForIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCredentialsForIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account. This is a public API. You do not need any credentials to call this API.
      */
    def getId(): awsDashSdkLib.libRequestMod.Request[GetIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getId(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetIdResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates (or retrieves) a Cognito ID. Supplying multiple logins will create an implicit linked account. This is a public API. You do not need any credentials to call this API.
      */
    def getId(params: GetIdInput): awsDashSdkLib.libRequestMod.Request[GetIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getId(
      params: GetIdInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetIdResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the roles for an identity pool. You must use AWS Developer credentials to call this API.
      */
    def getIdentityPoolRoles(): awsDashSdkLib.libRequestMod.Request[GetIdentityPoolRolesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityPoolRoles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityPoolRolesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityPoolRolesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the roles for an identity pool. You must use AWS Developer credentials to call this API.
      */
    def getIdentityPoolRoles(params: GetIdentityPoolRolesInput): awsDashSdkLib.libRequestMod.Request[GetIdentityPoolRolesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIdentityPoolRoles(
      params: GetIdentityPoolRolesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIdentityPoolRolesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIdentityPoolRolesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link. The OpenId token is valid for 10 minutes. This is a public API. You do not need any credentials to call this API.
      */
    def getOpenIdToken(): awsDashSdkLib.libRequestMod.Request[GetOpenIdTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOpenIdToken(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOpenIdTokenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOpenIdTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an OpenID token, using a known Cognito ID. This known Cognito ID is returned by GetId. You can optionally add additional logins for the identity. Supplying multiple logins creates an implicit link. The OpenId token is valid for 10 minutes. This is a public API. You do not need any credentials to call this API.
      */
    def getOpenIdToken(params: GetOpenIdTokenInput): awsDashSdkLib.libRequestMod.Request[GetOpenIdTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOpenIdToken(
      params: GetOpenIdTokenInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOpenIdTokenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOpenIdTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the Logins map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users. You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the IdentityId should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId. This API will create the identity in the specified IdentityPoolId. You must use AWS Developer credentials to call this API.
      */
    def getOpenIdTokenForDeveloperIdentity(): awsDashSdkLib.libRequestMod.Request[GetOpenIdTokenForDeveloperIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOpenIdTokenForDeveloperIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOpenIdTokenForDeveloperIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOpenIdTokenForDeveloperIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers (or retrieves) a Cognito IdentityId and an OpenID Connect token for a user authenticated by your backend authentication process. Supplying multiple logins will create an implicit linked account. You can only specify one developer provider as part of the Logins map, which is linked to the identity pool. The developer provider is the "domain" by which Cognito will refer to your users. You can use GetOpenIdTokenForDeveloperIdentity to create a new identity and to link new logins (that is, user credentials issued by a public provider or developer provider) to an existing identity. When you want to create a new identity, the IdentityId should be null. When you want to associate a new login with an existing authenticated/unauthenticated identity, you can do so by providing the existing IdentityId. This API will create the identity in the specified IdentityPoolId. You must use AWS Developer credentials to call this API.
      */
    def getOpenIdTokenForDeveloperIdentity(params: GetOpenIdTokenForDeveloperIdentityInput): awsDashSdkLib.libRequestMod.Request[GetOpenIdTokenForDeveloperIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getOpenIdTokenForDeveloperIdentity(
      params: GetOpenIdTokenForDeveloperIdentityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetOpenIdTokenForDeveloperIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetOpenIdTokenForDeveloperIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the identities in an identity pool. You must use AWS Developer credentials to call this API.
      */
    def listIdentities(): awsDashSdkLib.libRequestMod.Request[ListIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIdentities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the identities in an identity pool. You must use AWS Developer credentials to call this API.
      */
    def listIdentities(params: ListIdentitiesInput): awsDashSdkLib.libRequestMod.Request[ListIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIdentities(
      params: ListIdentitiesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the Cognito identity pools registered for your account. You must use AWS Developer credentials to call this API.
      */
    def listIdentityPools(): awsDashSdkLib.libRequestMod.Request[ListIdentityPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIdentityPools(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIdentityPoolsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIdentityPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the Cognito identity pools registered for your account. You must use AWS Developer credentials to call this API.
      */
    def listIdentityPools(params: ListIdentityPoolsInput): awsDashSdkLib.libRequestMod.Request[ListIdentityPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIdentityPools(
      params: ListIdentityPoolsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIdentityPoolsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIdentityPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that are assigned to an Amazon Cognito identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria. You can use this action up to 10 times per second, per account.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags that are assigned to an Amazon Cognito identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria. You can use this action up to 10 times per second, per account.
      */
    def listTagsForResource(params: ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifier values associated with an IdentityId for an existing identity. Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a ResourceConflictException is thrown.  LookupDeveloperIdentity is intended for low-throughput control plane operations: for example, to enable customer service to locate an identity ID by username. If you are using it for higher-volume operations such as user authentication, your requests are likely to be throttled. GetOpenIdTokenForDeveloperIdentity is a better option for higher-volume operations for user authentication. You must use AWS Developer credentials to call this API.
      */
    def lookupDeveloperIdentity(): awsDashSdkLib.libRequestMod.Request[LookupDeveloperIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def lookupDeveloperIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LookupDeveloperIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LookupDeveloperIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the IdentityID associated with a DeveloperUserIdentifier or the list of DeveloperUserIdentifier values associated with an IdentityId for an existing identity. Either IdentityID or DeveloperUserIdentifier must not be null. If you supply only one of these values, the other value will be searched in the database and returned as a part of the response. If you supply both, DeveloperUserIdentifier will be matched against IdentityID. If the values are verified against the database, the response returns both values and is the same as the request. Otherwise a ResourceConflictException is thrown.  LookupDeveloperIdentity is intended for low-throughput control plane operations: for example, to enable customer service to locate an identity ID by username. If you are using it for higher-volume operations such as user authentication, your requests are likely to be throttled. GetOpenIdTokenForDeveloperIdentity is a better option for higher-volume operations for user authentication. You must use AWS Developer credentials to call this API.
      */
    def lookupDeveloperIdentity(params: LookupDeveloperIdentityInput): awsDashSdkLib.libRequestMod.Request[LookupDeveloperIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def lookupDeveloperIdentity(
      params: LookupDeveloperIdentityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LookupDeveloperIdentityResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LookupDeveloperIdentityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown. The number of linked logins is limited to 20. So, the number of linked logins for the source user, SourceUserIdentifier, and the destination user, DestinationUserIdentifier, together should not be larger than 20. Otherwise, an exception will be thrown. You must use AWS Developer credentials to call this API.
      */
    def mergeDeveloperIdentities(): awsDashSdkLib.libRequestMod.Request[MergeDeveloperIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def mergeDeveloperIdentities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ MergeDeveloperIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[MergeDeveloperIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Merges two users having different IdentityIds, existing in the same identity pool, and identified by the same developer provider. You can use this action to request that discrete users be merged and identified as a single user in the Cognito environment. Cognito associates the given source user (SourceUserIdentifier) with the IdentityId of the DestinationUserIdentifier. Only developer-authenticated users can be merged. If the users to be merged are associated with the same public provider, but as two different users, an exception will be thrown. The number of linked logins is limited to 20. So, the number of linked logins for the source user, SourceUserIdentifier, and the destination user, DestinationUserIdentifier, together should not be larger than 20. Otherwise, an exception will be thrown. You must use AWS Developer credentials to call this API.
      */
    def mergeDeveloperIdentities(params: MergeDeveloperIdentitiesInput): awsDashSdkLib.libRequestMod.Request[MergeDeveloperIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def mergeDeveloperIdentities(
      params: MergeDeveloperIdentitiesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ MergeDeveloperIdentitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[MergeDeveloperIdentitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity action. You must use AWS Developer credentials to call this API.
      */
    def setIdentityPoolRoles(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityPoolRoles(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the roles for an identity pool. These roles are used when making calls to GetCredentialsForIdentity action. You must use AWS Developer credentials to call this API.
      */
    def setIdentityPoolRoles(params: SetIdentityPoolRolesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setIdentityPoolRoles(
      params: SetIdentityPoolRolesInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns a set of tags to an Amazon Cognito identity pool. A tag is a label that you can use to categorize and manage identity pools in different ways, such as by purpose, owner, environment, or other criteria. Each tag consists of a key and value, both of which you define. A key is a general category for more specific values. For example, if you have two versions of an identity pool, one for testing and another for production, you might assign an Environment tag key to both identity pools. The value of this key might be Test for one identity pool and Production for the other. Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the Billing and Cost Management console, where you can track the costs associated with your identity pools. In an IAM policy, you can constrain permissions for identity pools based on specific tags or tag values. You can use this action up to 5 times per second, per account. An identity pool can have as many as 50 tags.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns a set of tags to an Amazon Cognito identity pool. A tag is a label that you can use to categorize and manage identity pools in different ways, such as by purpose, owner, environment, or other criteria. Each tag consists of a key and value, both of which you define. A key is a general category for more specific values. For example, if you have two versions of an identity pool, one for testing and another for production, you might assign an Environment tag key to both identity pools. The value of this key might be Test for one identity pool and Production for the other. Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the Billing and Cost Management console, where you can track the costs associated with your identity pools. In an IAM policy, you can constrain permissions for identity pools based on specific tags or tag values. You can use this action up to 5 times per second, per account. An identity pool can have as many as 50 tags.
      */
    def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible. You must use AWS Developer credentials to call this API.
      */
    def unlinkDeveloperIdentity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unlinkDeveloperIdentity(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unlinks a DeveloperUserIdentifier from an existing identity. Unlinked developer users will be considered new identities next time they are seen. If, for a given Cognito identity, you remove all federated identities as well as the developer user identifier, the Cognito identity becomes inaccessible. You must use AWS Developer credentials to call this API.
      */
    def unlinkDeveloperIdentity(params: UnlinkDeveloperIdentityInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unlinkDeveloperIdentity(
      params: UnlinkDeveloperIdentityInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible. This is a public API. You do not need any credentials to call this API.
      */
    def unlinkIdentity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unlinkIdentity(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unlinks a federated identity from an existing account. Unlinked logins will be considered new identities next time they are seen. Removing the last linked login will make this identity inaccessible. This is a public API. You do not need any credentials to call this API.
      */
    def unlinkIdentity(params: UnlinkIdentityInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unlinkIdentity(
      params: UnlinkIdentityInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per second, per account
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from an Amazon Cognito identity pool. You can use this action up to 5 times per second, per account
      */
    def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an identity pool. You must use AWS Developer credentials to call this API.
      */
    def updateIdentityPool(): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateIdentityPool(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ IdentityPool, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an identity pool. You must use AWS Developer credentials to call this API.
      */
    def updateIdentityPool(params: IdentityPool): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateIdentityPool(
      params: IdentityPool,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ IdentityPool, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[IdentityPool, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UnlinkDeveloperIdentityInput extends js.Object {
    /**
      * The "domain" by which Cognito will refer to your users.
      */
    var DeveloperProviderName: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeveloperProviderName
    /**
      * A unique ID used by your backend authentication process to identify a user.
      */
    var DeveloperUserIdentifier: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.DeveloperUserIdentifier
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityId
    /**
      * An identity pool ID in the format REGION:GUID.
      */
    var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityPoolId
  }
  
  trait UnlinkIdentityInput extends js.Object {
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.IdentityId
    /**
      * A set of optional name-value pairs that map provider names to provider tokens.
      */
    var Logins: LoginsMap
    /**
      * Provider names to unlink from this identity.
      */
    var LoginsToRemove: LoginsList
  }
  
  trait UnprocessedIdentityId extends js.Object {
    /**
      * The error code indicating the type of error that occurred.
      */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * A unique identifier in the format REGION:GUID.
      */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
  }
  
  trait UntagResourceInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the identity pool that the tags are assigned to.
      */
    var ResourceArn: ARNString
    /**
      * The keys of the tags to remove from the user pool.
      */
    var TagKeys: js.UndefOr[IdentityPoolTagsListType] = js.undefined
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait _AmbiguousRoleResolutionType extends js.Object
  
  trait _ErrorCode extends js.Object
  
  trait _MappingRuleMatchType extends js.Object
  
  trait _RoleMappingType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ARNString = java.lang.String
  type AccessKeyString = java.lang.String
  type AccountId = java.lang.String
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
  type ErrorCode = _ErrorCode | java.lang.String
  type HideDisabled = scala.Boolean
  type IdentitiesList = js.Array[IdentityDescription]
  type IdentityId = java.lang.String
  type IdentityIdList = js.Array[IdentityId]
  type IdentityPoolId = java.lang.String
  type IdentityPoolName = java.lang.String
  type IdentityPoolTagsListType = js.Array[TagKeysType]
  type IdentityPoolUnauthenticated = scala.Boolean
  type IdentityPoolsList = js.Array[IdentityPoolShortDescription]
  type IdentityProviderId = java.lang.String
  type IdentityProviderName = java.lang.String
  type IdentityProviderToken = java.lang.String
  type LoginsList = js.Array[IdentityProviderName]
  type MappingRuleMatchType = _MappingRuleMatchType | java.lang.String
  type MappingRulesList = js.Array[MappingRule]
  type OIDCProviderList = js.Array[ARNString]
  type OIDCToken = java.lang.String
  type PaginationKey = java.lang.String
  type QueryLimit = scala.Double
  type RoleMappingType = _RoleMappingType | java.lang.String
  type RoleType = java.lang.String
  type SAMLProviderList = js.Array[ARNString]
  type SecretKeyString = java.lang.String
  type SessionTokenString = java.lang.String
  type TagKeysType = java.lang.String
  type TagValueType = java.lang.String
  type TokenDuration = scala.Double
  type UnprocessedIdentityIdList = js.Array[UnprocessedIdentityId]
  type apiVersion = _apiVersion | java.lang.String
}

