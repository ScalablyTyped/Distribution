package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolClientType extends StObject {
  
  /**
    * The access token time limit. After this limit expires, your user can't use their access token. To specify the time unit for AccessTokenValidity as seconds, minutes, hours, or days, set a TokenValidityUnits value in your API request. For example, when you set AccessTokenValidity to 10 and TokenValidityUnits to hours, your user can authorize access with their access token for 10 hours. The default time unit for AccessTokenValidity in an API request is hours. Valid range is displayed below in seconds. If you don't specify otherwise in the configuration of your app client, your access tokens are valid for one hour.
    */
  var AccessTokenValidity: js.UndefOr[AccessTokenValidityType] = js.undefined
  
  /**
    * The allowed OAuth flows.  code  Use a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the /oauth2/token endpoint.  implicit  Issue the access token (and, optionally, ID token, based on scopes) directly to your user.  client_credentials  Issue the access token from the /oauth2/token endpoint directly to a non-person user using a combination of the client ID and client secret.  
    */
  var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined
  
  /**
    * Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito user pools.
    */
  var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The OAuth scopes that your app client supports. Possible values that OAuth provides are phone, email, openid, and profile. Possible values that Amazon Web Services provides are aws.cognito.signin.user.admin. Amazon Cognito also supports custom scopes that you create in Resource Servers.
    */
  var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined
  
  /**
    * The Amazon Pinpoint analytics configuration for the user pool client.  Amazon Cognito user pools only support sending events to Amazon Pinpoint projects in the US East (N. Virginia) us-east-1 Region, regardless of the Region where the user pool resides. 
    */
  var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined
  
  /**
    * Amazon Cognito creates a session token for each API request in an authentication flow. AuthSessionValidity is the duration, in minutes, of that session token. Your user pool native user must respond to each authentication challenge before the session expires.
    */
  var AuthSessionValidity: js.UndefOr[AuthSessionValidityType] = js.undefined
  
  /**
    * A list of allowed redirect (callback) URLs for the IdPs. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined
  
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  
  /**
    * The client name from the user pool request of the client type.
    */
  var ClientName: js.UndefOr[ClientNameType] = js.undefined
  
  /**
    * The client secret from the user pool request of the client type.
    */
  var ClientSecret: js.UndefOr[ClientSecretType] = js.undefined
  
  /**
    * The date the user pool client was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined
  
  /**
    * When EnablePropagateAdditionalUserContextData is true, Amazon Cognito accepts an IpAddress value that you send in the UserContextData parameter. The UserContextData parameter sends information to Amazon Cognito advanced security for risk analysis. You can send UserContextData when you sign in Amazon Cognito native users with the InitiateAuth and RespondToAuthChallenge API operations. When EnablePropagateAdditionalUserContextData is false, you can't send your user's source IP address to Amazon Cognito advanced security with unauthenticated API operations. EnablePropagateAdditionalUserContextData doesn't affect whether you can send a source IP address in a ContextData parameter with the authenticated API operations AdminInitiateAuth and AdminRespondToAuthChallenge. You can only activate EnablePropagateAdditionalUserContextData in an app client that has a client secret. For more information about propagation of user context data, see Adding user device and session data to API requests.
    */
  var EnablePropagateAdditionalUserContextData: js.UndefOr[WrappedBooleanType] = js.undefined
  
  /**
    * Indicates whether token revocation is activated for the user pool client. When you create a new user pool client, token revocation is activated by default. For more information about revoking tokens, see RevokeToken.
    */
  var EnableTokenRevocation: js.UndefOr[WrappedBooleanType] = js.undefined
  
  /**
    * The authentication flows that you want your user pool client to support. For each app client in your user pool, you can sign in your users with any combination of one or more flows, including with a user name and Secure Remote Password (SRP), a user name and password, or a custom authentication process that you define with Lambda functions.  If you don't specify a value for ExplicitAuthFlows, your user client supports ALLOW_REFRESH_TOKEN_AUTH, ALLOW_USER_SRP_AUTH, and ALLOW_CUSTOM_AUTH.  Valid values include:    ALLOW_ADMIN_USER_PASSWORD_AUTH: Enable admin based user password authentication flow ADMIN_USER_PASSWORD_AUTH. This setting replaces the ADMIN_NO_SRP_AUTH setting. With this authentication flow, your app passes a user name and password to Amazon Cognito in the request, instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.    ALLOW_CUSTOM_AUTH: Enable Lambda trigger based authentication.    ALLOW_USER_PASSWORD_AUTH: Enable user password-based authentication. In this flow, Amazon Cognito receives the password in the request instead of using the SRP protocol to verify passwords.    ALLOW_USER_SRP_AUTH: Enable SRP-based authentication.    ALLOW_REFRESH_TOKEN_AUTH: Enable authflow to refresh tokens.   In some environments, you will see the values ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, or USER_PASSWORD_AUTH. You can't assign these legacy ExplicitAuthFlows values to user pool clients at the same time as values that begin with ALLOW_, like ALLOW_USER_SRP_AUTH.
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
  
  /**
    * The ID token time limit. After this limit expires, your user can't use their ID token. To specify the time unit for IdTokenValidity as seconds, minutes, hours, or days, set a TokenValidityUnits value in your API request. For example, when you set IdTokenValidity as 10 and TokenValidityUnits as hours, your user can authenticate their session with their ID token for 10 hours. The default time unit for AccessTokenValidity in an API request is hours. Valid range is displayed below in seconds. If you don't specify otherwise in the configuration of your app client, your ID tokens are valid for one hour.
    */
  var IdTokenValidity: js.UndefOr[IdTokenValidityType] = js.undefined
  
  /**
    * The date the user pool client was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of allowed logout URLs for the IdPs.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
  
  /**
    * Errors and responses that you want Amazon Cognito APIs to return during authentication, account confirmation, and password recovery when the user doesn't exist in the user pool. When set to ENABLED and the user doesn't exist, authentication returns an error indicating either the username or password was incorrect. Account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to LEGACY, those APIs return a UserNotFoundException exception if the user doesn't exist in the user pool. Valid values include:    ENABLED - This prevents user existence-related errors.    LEGACY - This represents the old behavior of Amazon Cognito where user existence related errors aren't prevented.  
    */
  var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.undefined
  
  /**
    * The Read-only attributes.
    */
  var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
  
  /**
    * The refresh token time limit. After this limit expires, your user can't use their refresh token. To specify the time unit for RefreshTokenValidity as seconds, minutes, hours, or days, set a TokenValidityUnits value in your API request. For example, when you set RefreshTokenValidity as 10 and TokenValidityUnits as days, your user can refresh their session and retrieve new access and ID tokens for 10 days. The default time unit for RefreshTokenValidity in an API request is days. You can't set RefreshTokenValidity to 0. If you do, Amazon Cognito overrides the value with the default value of 30 days. Valid range is displayed below in seconds. If you don't specify otherwise in the configuration of your app client, your refresh tokens are valid for 30 days.
    */
  var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined
  
  /**
    * A list of provider names for the IdPs that this client supports. The following are supported: COGNITO, Facebook, Google, SignInWithApple, LoginWithAmazon, and the names of your own SAML and OIDC providers.
    */
  var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined
  
  /**
    * The time units used to specify the token validity times of each token type: ID, access, and refresh.
    */
  var TokenValidityUnits: js.UndefOr[TokenValidityUnitsType] = js.undefined
  
  /**
    * The user pool ID for the user pool client.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  
  /**
    * The writeable attributes.
    */
  var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
}
object UserPoolClientType {
  
  inline def apply(): UserPoolClientType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolClientType]
  }
  
  extension [Self <: UserPoolClientType](x: Self) {
    
    inline def setAccessTokenValidity(value: AccessTokenValidityType): Self = StObject.set(x, "AccessTokenValidity", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenValidityUndefined: Self = StObject.set(x, "AccessTokenValidity", js.undefined)
    
    inline def setAllowedOAuthFlows(value: OAuthFlowsType): Self = StObject.set(x, "AllowedOAuthFlows", value.asInstanceOf[js.Any])
    
    inline def setAllowedOAuthFlowsUndefined: Self = StObject.set(x, "AllowedOAuthFlows", js.undefined)
    
    inline def setAllowedOAuthFlowsUserPoolClient(value: BooleanType): Self = StObject.set(x, "AllowedOAuthFlowsUserPoolClient", value.asInstanceOf[js.Any])
    
    inline def setAllowedOAuthFlowsUserPoolClientUndefined: Self = StObject.set(x, "AllowedOAuthFlowsUserPoolClient", js.undefined)
    
    inline def setAllowedOAuthFlowsVarargs(value: OAuthFlowType*): Self = StObject.set(x, "AllowedOAuthFlows", js.Array(value*))
    
    inline def setAllowedOAuthScopes(value: ScopeListType): Self = StObject.set(x, "AllowedOAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setAllowedOAuthScopesUndefined: Self = StObject.set(x, "AllowedOAuthScopes", js.undefined)
    
    inline def setAllowedOAuthScopesVarargs(value: ScopeType*): Self = StObject.set(x, "AllowedOAuthScopes", js.Array(value*))
    
    inline def setAnalyticsConfiguration(value: AnalyticsConfigurationType): Self = StObject.set(x, "AnalyticsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsConfigurationUndefined: Self = StObject.set(x, "AnalyticsConfiguration", js.undefined)
    
    inline def setAuthSessionValidity(value: AuthSessionValidityType): Self = StObject.set(x, "AuthSessionValidity", value.asInstanceOf[js.Any])
    
    inline def setAuthSessionValidityUndefined: Self = StObject.set(x, "AuthSessionValidity", js.undefined)
    
    inline def setCallbackURLs(value: CallbackURLsListType): Self = StObject.set(x, "CallbackURLs", value.asInstanceOf[js.Any])
    
    inline def setCallbackURLsUndefined: Self = StObject.set(x, "CallbackURLs", js.undefined)
    
    inline def setCallbackURLsVarargs(value: RedirectUrlType*): Self = StObject.set(x, "CallbackURLs", js.Array(value*))
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setClientName(value: ClientNameType): Self = StObject.set(x, "ClientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameUndefined: Self = StObject.set(x, "ClientName", js.undefined)
    
    inline def setClientSecret(value: ClientSecretType): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "ClientSecret", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDefaultRedirectURI(value: RedirectUrlType): Self = StObject.set(x, "DefaultRedirectURI", value.asInstanceOf[js.Any])
    
    inline def setDefaultRedirectURIUndefined: Self = StObject.set(x, "DefaultRedirectURI", js.undefined)
    
    inline def setEnablePropagateAdditionalUserContextData(value: WrappedBooleanType): Self = StObject.set(x, "EnablePropagateAdditionalUserContextData", value.asInstanceOf[js.Any])
    
    inline def setEnablePropagateAdditionalUserContextDataUndefined: Self = StObject.set(x, "EnablePropagateAdditionalUserContextData", js.undefined)
    
    inline def setEnableTokenRevocation(value: WrappedBooleanType): Self = StObject.set(x, "EnableTokenRevocation", value.asInstanceOf[js.Any])
    
    inline def setEnableTokenRevocationUndefined: Self = StObject.set(x, "EnableTokenRevocation", js.undefined)
    
    inline def setExplicitAuthFlows(value: ExplicitAuthFlowsListType): Self = StObject.set(x, "ExplicitAuthFlows", value.asInstanceOf[js.Any])
    
    inline def setExplicitAuthFlowsUndefined: Self = StObject.set(x, "ExplicitAuthFlows", js.undefined)
    
    inline def setExplicitAuthFlowsVarargs(value: ExplicitAuthFlowsType*): Self = StObject.set(x, "ExplicitAuthFlows", js.Array(value*))
    
    inline def setIdTokenValidity(value: IdTokenValidityType): Self = StObject.set(x, "IdTokenValidity", value.asInstanceOf[js.Any])
    
    inline def setIdTokenValidityUndefined: Self = StObject.set(x, "IdTokenValidity", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setLogoutURLs(value: LogoutURLsListType): Self = StObject.set(x, "LogoutURLs", value.asInstanceOf[js.Any])
    
    inline def setLogoutURLsUndefined: Self = StObject.set(x, "LogoutURLs", js.undefined)
    
    inline def setLogoutURLsVarargs(value: RedirectUrlType*): Self = StObject.set(x, "LogoutURLs", js.Array(value*))
    
    inline def setPreventUserExistenceErrors(value: PreventUserExistenceErrorTypes): Self = StObject.set(x, "PreventUserExistenceErrors", value.asInstanceOf[js.Any])
    
    inline def setPreventUserExistenceErrorsUndefined: Self = StObject.set(x, "PreventUserExistenceErrors", js.undefined)
    
    inline def setReadAttributes(value: ClientPermissionListType): Self = StObject.set(x, "ReadAttributes", value.asInstanceOf[js.Any])
    
    inline def setReadAttributesUndefined: Self = StObject.set(x, "ReadAttributes", js.undefined)
    
    inline def setReadAttributesVarargs(value: ClientPermissionType*): Self = StObject.set(x, "ReadAttributes", js.Array(value*))
    
    inline def setRefreshTokenValidity(value: RefreshTokenValidityType): Self = StObject.set(x, "RefreshTokenValidity", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenValidityUndefined: Self = StObject.set(x, "RefreshTokenValidity", js.undefined)
    
    inline def setSupportedIdentityProviders(value: SupportedIdentityProvidersListType): Self = StObject.set(x, "SupportedIdentityProviders", value.asInstanceOf[js.Any])
    
    inline def setSupportedIdentityProvidersUndefined: Self = StObject.set(x, "SupportedIdentityProviders", js.undefined)
    
    inline def setSupportedIdentityProvidersVarargs(value: ProviderNameType*): Self = StObject.set(x, "SupportedIdentityProviders", js.Array(value*))
    
    inline def setTokenValidityUnits(value: TokenValidityUnitsType): Self = StObject.set(x, "TokenValidityUnits", value.asInstanceOf[js.Any])
    
    inline def setTokenValidityUnitsUndefined: Self = StObject.set(x, "TokenValidityUnits", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
    
    inline def setWriteAttributes(value: ClientPermissionListType): Self = StObject.set(x, "WriteAttributes", value.asInstanceOf[js.Any])
    
    inline def setWriteAttributesUndefined: Self = StObject.set(x, "WriteAttributes", js.undefined)
    
    inline def setWriteAttributesVarargs(value: ClientPermissionType*): Self = StObject.set(x, "WriteAttributes", js.Array(value*))
  }
}
