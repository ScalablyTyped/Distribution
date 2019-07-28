package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserPoolClientRequest extends js.Object {
  /**
    * Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint. Set to token to specify that the client should get the access token (and, optionally, ID token, based on scopes) directly.
    */
  var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined
  /**
    * Set to True if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined
  /**
    * A list of allowed OAuth scopes. Currently supported values are "phone", "email", "openid", and "Cognito".
    */
  var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined
  /**
    * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
    */
  var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined
  /**
    * A list of allowed redirect (callback) URLs for the identity providers. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
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
    * The explicit authentication flows.
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
  /**
    * Boolean to specify whether you want to generate a secret for the user pool client being created.
    */
  var GenerateSecret: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityserviceproviderMod.GenerateSecret] = js.undefined
  /**
    * A list of allowed logout URLs for the identity providers.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
  /**
    * The read attributes.
    */
  var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
  /**
    * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
    */
  var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined
  /**
    * A list of provider names for the identity providers that are supported on this client. The following are supported: COGNITO, Facebook, Google and LoginWithAmazon.
    */
  var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined
  /**
    * The user pool ID for the user pool where you want to create a user pool client.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user pool attributes that the app client can write to. If your app client allows users to sign in through an identity provider, this array must include all attributes that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when users sign in to your application through an identity provider. If your app client lacks write access to a mapped attribute, Amazon Cognito throws an error when it attempts to update the attribute. For more information, see Specifying Identity Provider Attribute Mappings for Your User Pool.
    */
  var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
}

object CreateUserPoolClientRequest {
  @scala.inline
  def apply(
    ClientName: ClientNameType,
    UserPoolId: UserPoolIdType,
    AllowedOAuthFlows: OAuthFlowsType = null,
    AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
    AllowedOAuthScopes: ScopeListType = null,
    AnalyticsConfiguration: AnalyticsConfigurationType = null,
    CallbackURLs: CallbackURLsListType = null,
    DefaultRedirectURI: RedirectUrlType = null,
    ExplicitAuthFlows: ExplicitAuthFlowsListType = null,
    GenerateSecret: js.UndefOr[GenerateSecret] = js.undefined,
    LogoutURLs: LogoutURLsListType = null,
    ReadAttributes: ClientPermissionListType = null,
    RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
    SupportedIdentityProviders: SupportedIdentityProvidersListType = null,
    WriteAttributes: ClientPermissionListType = null
  ): CreateUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientName = ClientName, UserPoolId = UserPoolId)
    if (AllowedOAuthFlows != null) __obj.updateDynamic("AllowedOAuthFlows")(AllowedOAuthFlows)
    if (!js.isUndefined(AllowedOAuthFlowsUserPoolClient)) __obj.updateDynamic("AllowedOAuthFlowsUserPoolClient")(AllowedOAuthFlowsUserPoolClient)
    if (AllowedOAuthScopes != null) __obj.updateDynamic("AllowedOAuthScopes")(AllowedOAuthScopes)
    if (AnalyticsConfiguration != null) __obj.updateDynamic("AnalyticsConfiguration")(AnalyticsConfiguration)
    if (CallbackURLs != null) __obj.updateDynamic("CallbackURLs")(CallbackURLs)
    if (DefaultRedirectURI != null) __obj.updateDynamic("DefaultRedirectURI")(DefaultRedirectURI)
    if (ExplicitAuthFlows != null) __obj.updateDynamic("ExplicitAuthFlows")(ExplicitAuthFlows)
    if (!js.isUndefined(GenerateSecret)) __obj.updateDynamic("GenerateSecret")(GenerateSecret)
    if (LogoutURLs != null) __obj.updateDynamic("LogoutURLs")(LogoutURLs)
    if (ReadAttributes != null) __obj.updateDynamic("ReadAttributes")(ReadAttributes)
    if (!js.isUndefined(RefreshTokenValidity)) __obj.updateDynamic("RefreshTokenValidity")(RefreshTokenValidity)
    if (SupportedIdentityProviders != null) __obj.updateDynamic("SupportedIdentityProviders")(SupportedIdentityProviders)
    if (WriteAttributes != null) __obj.updateDynamic("WriteAttributes")(WriteAttributes)
    __obj.asInstanceOf[CreateUserPoolClientRequest]
  }
}

