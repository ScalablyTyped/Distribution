package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserPoolClientRequest extends StObject {
  
  /**
    * The access token time limit. After this limit expires, your user can't use their access token. To specify the time unit for AccessTokenValidity as seconds, minutes, hours, or days, set a TokenValidityUnits value in your API request. For example, when you set AccessTokenValidity to 10 and TokenValidityUnits to hours, your user can authorize access with their access token for 10 hours. The default time unit for AccessTokenValidity in an API request is hours. Valid range is displayed below in seconds.
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
    * The allowed OAuth scopes. Possible values provided by OAuth are phone, email, openid, and profile. Possible values provided by Amazon Web Services are aws.cognito.signin.user.admin. Custom scopes created in Resource Servers are also supported.
    */
  var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined
  
  /**
    * The user pool analytics configuration for collecting metrics and sending them to your Amazon Pinpoint campaign.  In Amazon Web Services Regions where Amazon Pinpoint isn't available, user pools only support sending events to Amazon Pinpoint projects in Amazon Web Services Region us-east-1. In Regions where Amazon Pinpoint is available, user pools support sending events to Amazon Pinpoint projects within that same Region. 
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
    * The client name for the user pool client you would like to create.
    */
  var ClientName: ClientNameType
  
  /**
    * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined
  
  /**
    * Activates the propagation of additional user context data. For more information about propagation of user context data, see  Adding advanced security to a user pool. If you don’t include this parameter, you can't send device fingerprint information, including source IP address, to Amazon Cognito advanced security. You can only activate EnablePropagateAdditionalUserContextData in an app client that has a client secret.
    */
  var EnablePropagateAdditionalUserContextData: js.UndefOr[WrappedBooleanType] = js.undefined
  
  /**
    * Activates or deactivates token revocation. For more information about revoking tokens, see RevokeToken. If you don't include this parameter, token revocation is automatically activated for the new user pool client.
    */
  var EnableTokenRevocation: js.UndefOr[WrappedBooleanType] = js.undefined
  
  /**
    * The authentication flows that are supported by the user pool clients. Flow names without the ALLOW_ prefix are no longer supported, in favor of new names with the ALLOW_ prefix.  Values with ALLOW_ prefix must be used only along with the ALLOW_ prefix.  Valid values include:  ALLOW_ADMIN_USER_PASSWORD_AUTH  Enable admin based user password authentication flow ADMIN_USER_PASSWORD_AUTH. This setting replaces the ADMIN_NO_SRP_AUTH setting. With this authentication flow, Amazon Cognito receives the password in the request instead of using the Secure Remote Password (SRP) protocol to verify passwords.  ALLOW_CUSTOM_AUTH  Enable Lambda trigger based authentication.  ALLOW_USER_PASSWORD_AUTH  Enable user password-based authentication. In this flow, Amazon Cognito receives the password in the request instead of using the SRP protocol to verify passwords.  ALLOW_USER_SRP_AUTH  Enable SRP-based authentication.  ALLOW_REFRESH_TOKEN_AUTH  Enable the authflow that refreshes tokens.   If you don't specify a value for ExplicitAuthFlows, your user client supports ALLOW_USER_SRP_AUTH and ALLOW_CUSTOM_AUTH.
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
  
  /**
    * Boolean to specify whether you want to generate a secret for the user pool client being created.
    */
  var GenerateSecret: js.UndefOr[typings.awsSdk.clientsCognitoidentityserviceproviderMod.GenerateSecret] = js.undefined
  
  /**
    * The ID token time limit. After this limit expires, your user can't use their ID token. To specify the time unit for IdTokenValidity as seconds, minutes, hours, or days, set a TokenValidityUnits value in your API request. For example, when you set IdTokenValidity as 10 and TokenValidityUnits as hours, your user can authenticate their session with their ID token for 10 hours. The default time unit for AccessTokenValidity in an API request is hours. Valid range is displayed below in seconds.
    */
  var IdTokenValidity: js.UndefOr[IdTokenValidityType] = js.undefined
  
  /**
    * A list of allowed logout URLs for the IdPs.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
  
  /**
    * Errors and responses that you want Amazon Cognito APIs to return during authentication, account confirmation, and password recovery when the user doesn't exist in the user pool. When set to ENABLED and the user doesn't exist, authentication returns an error indicating either the username or password was incorrect. Account confirmation and password recovery return a response indicating a code was sent to a simulated destination. When set to LEGACY, those APIs return a UserNotFoundException exception if the user doesn't exist in the user pool. Valid values include:    ENABLED - This prevents user existence-related errors.    LEGACY - This represents the early behavior of Amazon Cognito where user existence related errors aren't prevented.  
    */
  var PreventUserExistenceErrors: js.UndefOr[PreventUserExistenceErrorTypes] = js.undefined
  
  /**
    * The read attributes.
    */
  var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
  
  /**
    * The refresh token time limit. After this limit expires, your user can't use their refresh token. To specify the time unit for RefreshTokenValidity as seconds, minutes, hours, or days, set a TokenValidityUnits value in your API request. For example, when you set RefreshTokenValidity as 10 and TokenValidityUnits as days, your user can refresh their session and retrieve new access and ID tokens for 10 days. The default time unit for RefreshTokenValidity in an API request is days. You can't set RefreshTokenValidity to 0. If you do, Amazon Cognito overrides the value with the default value of 30 days. Valid range is displayed below in seconds.
    */
  var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined
  
  /**
    * A list of provider names for the identity providers (IdPs) that are supported on this client. The following are supported: COGNITO, Facebook, Google, SignInWithApple, and LoginWithAmazon. You can also specify the names that you configured for the SAML and OIDC IdPs in your user pool, for example MySAMLIdP or MyOIDCIdP.
    */
  var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined
  
  /**
    * The units in which the validity times are represented. The default unit for RefreshToken is days, and default for ID and access tokens are hours.
    */
  var TokenValidityUnits: js.UndefOr[TokenValidityUnitsType] = js.undefined
  
  /**
    * The user pool ID for the user pool where you want to create a user pool client.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user pool attributes that the app client can write to. If your app client allows users to sign in through an IdP, this array must include all attributes that you have mapped to IdP attributes. Amazon Cognito updates mapped attributes when users sign in to your application through an IdP. If your app client does not have write access to a mapped attribute, Amazon Cognito throws an error when it tries to update the attribute. For more information, see Specifying IdP Attribute Mappings for Your user pool.
    */
  var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
}
object CreateUserPoolClientRequest {
  
  inline def apply(ClientName: ClientNameType, UserPoolId: UserPoolIdType): CreateUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientName = ClientName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolClientRequest]
  }
  
  extension [Self <: CreateUserPoolClientRequest](x: Self) {
    
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
    
    inline def setClientName(value: ClientNameType): Self = StObject.set(x, "ClientName", value.asInstanceOf[js.Any])
    
    inline def setDefaultRedirectURI(value: RedirectUrlType): Self = StObject.set(x, "DefaultRedirectURI", value.asInstanceOf[js.Any])
    
    inline def setDefaultRedirectURIUndefined: Self = StObject.set(x, "DefaultRedirectURI", js.undefined)
    
    inline def setEnablePropagateAdditionalUserContextData(value: WrappedBooleanType): Self = StObject.set(x, "EnablePropagateAdditionalUserContextData", value.asInstanceOf[js.Any])
    
    inline def setEnablePropagateAdditionalUserContextDataUndefined: Self = StObject.set(x, "EnablePropagateAdditionalUserContextData", js.undefined)
    
    inline def setEnableTokenRevocation(value: WrappedBooleanType): Self = StObject.set(x, "EnableTokenRevocation", value.asInstanceOf[js.Any])
    
    inline def setEnableTokenRevocationUndefined: Self = StObject.set(x, "EnableTokenRevocation", js.undefined)
    
    inline def setExplicitAuthFlows(value: ExplicitAuthFlowsListType): Self = StObject.set(x, "ExplicitAuthFlows", value.asInstanceOf[js.Any])
    
    inline def setExplicitAuthFlowsUndefined: Self = StObject.set(x, "ExplicitAuthFlows", js.undefined)
    
    inline def setExplicitAuthFlowsVarargs(value: ExplicitAuthFlowsType*): Self = StObject.set(x, "ExplicitAuthFlows", js.Array(value*))
    
    inline def setGenerateSecret(value: GenerateSecret): Self = StObject.set(x, "GenerateSecret", value.asInstanceOf[js.Any])
    
    inline def setGenerateSecretUndefined: Self = StObject.set(x, "GenerateSecret", js.undefined)
    
    inline def setIdTokenValidity(value: IdTokenValidityType): Self = StObject.set(x, "IdTokenValidity", value.asInstanceOf[js.Any])
    
    inline def setIdTokenValidityUndefined: Self = StObject.set(x, "IdTokenValidity", js.undefined)
    
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
    
    inline def setWriteAttributes(value: ClientPermissionListType): Self = StObject.set(x, "WriteAttributes", value.asInstanceOf[js.Any])
    
    inline def setWriteAttributesUndefined: Self = StObject.set(x, "WriteAttributes", js.undefined)
    
    inline def setWriteAttributesVarargs(value: ClientPermissionType*): Self = StObject.set(x, "WriteAttributes", js.Array(value*))
  }
}
