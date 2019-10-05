package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolClientType extends js.Object {
  /**
    * Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint. Set to token to specify that the client should get the access token (and, optionally, ID token, based on scopes) directly.
    */
  var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined
  /**
    * Set to TRUE if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
    */
  var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined
  /**
    * A list of allowed OAuth scopes. Currently supported values are "phone", "email", "openid", and "Cognito". In addition to these values, custom scopes created in Resource Servers are also supported.
    */
  var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined
  /**
    * The Amazon Pinpoint analytics configuration for the user pool client.
    */
  var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined
  /**
    * A list of allowed redirect (callback) URLs for the identity providers. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
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
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined
  /**
    * The explicit authentication flows.
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
  /**
    * The date the user pool client was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * A list of allowed logout URLs for the identity providers.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
  /**
    * The Read-only attributes.
    */
  var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
  /**
    * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
    */
  var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined
  /**
    * A list of provider names for the identity providers that are supported on this client.
    */
  var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined
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
  @scala.inline
  def apply(
    AllowedOAuthFlows: OAuthFlowsType = null,
    AllowedOAuthFlowsUserPoolClient: js.UndefOr[Boolean] = js.undefined,
    AllowedOAuthScopes: ScopeListType = null,
    AnalyticsConfiguration: AnalyticsConfigurationType = null,
    CallbackURLs: CallbackURLsListType = null,
    ClientId: ClientIdType = null,
    ClientName: ClientNameType = null,
    ClientSecret: ClientSecretType = null,
    CreationDate: DateType = null,
    DefaultRedirectURI: RedirectUrlType = null,
    ExplicitAuthFlows: ExplicitAuthFlowsListType = null,
    LastModifiedDate: DateType = null,
    LogoutURLs: LogoutURLsListType = null,
    ReadAttributes: ClientPermissionListType = null,
    RefreshTokenValidity: Int | Double = null,
    SupportedIdentityProviders: SupportedIdentityProvidersListType = null,
    UserPoolId: UserPoolIdType = null,
    WriteAttributes: ClientPermissionListType = null
  ): UserPoolClientType = {
    val __obj = js.Dynamic.literal()
    if (AllowedOAuthFlows != null) __obj.updateDynamic("AllowedOAuthFlows")(AllowedOAuthFlows)
    if (!js.isUndefined(AllowedOAuthFlowsUserPoolClient)) __obj.updateDynamic("AllowedOAuthFlowsUserPoolClient")(AllowedOAuthFlowsUserPoolClient)
    if (AllowedOAuthScopes != null) __obj.updateDynamic("AllowedOAuthScopes")(AllowedOAuthScopes)
    if (AnalyticsConfiguration != null) __obj.updateDynamic("AnalyticsConfiguration")(AnalyticsConfiguration)
    if (CallbackURLs != null) __obj.updateDynamic("CallbackURLs")(CallbackURLs)
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (ClientName != null) __obj.updateDynamic("ClientName")(ClientName)
    if (ClientSecret != null) __obj.updateDynamic("ClientSecret")(ClientSecret)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (DefaultRedirectURI != null) __obj.updateDynamic("DefaultRedirectURI")(DefaultRedirectURI)
    if (ExplicitAuthFlows != null) __obj.updateDynamic("ExplicitAuthFlows")(ExplicitAuthFlows)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (LogoutURLs != null) __obj.updateDynamic("LogoutURLs")(LogoutURLs)
    if (ReadAttributes != null) __obj.updateDynamic("ReadAttributes")(ReadAttributes)
    if (RefreshTokenValidity != null) __obj.updateDynamic("RefreshTokenValidity")(RefreshTokenValidity.asInstanceOf[js.Any])
    if (SupportedIdentityProviders != null) __obj.updateDynamic("SupportedIdentityProviders")(SupportedIdentityProviders)
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    if (WriteAttributes != null) __obj.updateDynamic("WriteAttributes")(WriteAttributes)
    __obj.asInstanceOf[UserPoolClientType]
  }
}

