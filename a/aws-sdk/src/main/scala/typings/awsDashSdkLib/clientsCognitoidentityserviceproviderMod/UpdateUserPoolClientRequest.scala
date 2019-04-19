package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserPoolClientRequest extends js.Object {
  /**
    * Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint.
    */
  var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined
  /**
    * Set to TRUE if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
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
    * The ID of the client associated with the user pool.
    */
  var ClientId: ClientIdType
  /**
    * The client name from the update user pool client request.
    */
  var ClientName: js.UndefOr[ClientNameType] = js.undefined
  /**
    * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
    */
  var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined
  /**
    * Explicit authentication flows.
    */
  var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
  /**
    * A list of allowed logout URLs for the identity providers.
    */
  var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
  /**
    * The read-only attributes of the user pool.
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
    * The user pool ID for the user pool where you want to update the user pool client.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The writeable attributes of the user pool.
    */
  var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
}

object UpdateUserPoolClientRequest {
  @scala.inline
  def apply(
    ClientId: ClientIdType,
    UserPoolId: UserPoolIdType,
    AllowedOAuthFlows: OAuthFlowsType = null,
    AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined,
    AllowedOAuthScopes: ScopeListType = null,
    AnalyticsConfiguration: AnalyticsConfigurationType = null,
    CallbackURLs: CallbackURLsListType = null,
    ClientName: ClientNameType = null,
    DefaultRedirectURI: RedirectUrlType = null,
    ExplicitAuthFlows: ExplicitAuthFlowsListType = null,
    LogoutURLs: LogoutURLsListType = null,
    ReadAttributes: ClientPermissionListType = null,
    RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined,
    SupportedIdentityProviders: SupportedIdentityProvidersListType = null,
    WriteAttributes: ClientPermissionListType = null
  ): UpdateUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, UserPoolId = UserPoolId)
    if (AllowedOAuthFlows != null) __obj.updateDynamic("AllowedOAuthFlows")(AllowedOAuthFlows)
    if (!js.isUndefined(AllowedOAuthFlowsUserPoolClient)) __obj.updateDynamic("AllowedOAuthFlowsUserPoolClient")(AllowedOAuthFlowsUserPoolClient)
    if (AllowedOAuthScopes != null) __obj.updateDynamic("AllowedOAuthScopes")(AllowedOAuthScopes)
    if (AnalyticsConfiguration != null) __obj.updateDynamic("AnalyticsConfiguration")(AnalyticsConfiguration)
    if (CallbackURLs != null) __obj.updateDynamic("CallbackURLs")(CallbackURLs)
    if (ClientName != null) __obj.updateDynamic("ClientName")(ClientName)
    if (DefaultRedirectURI != null) __obj.updateDynamic("DefaultRedirectURI")(DefaultRedirectURI)
    if (ExplicitAuthFlows != null) __obj.updateDynamic("ExplicitAuthFlows")(ExplicitAuthFlows)
    if (LogoutURLs != null) __obj.updateDynamic("LogoutURLs")(LogoutURLs)
    if (ReadAttributes != null) __obj.updateDynamic("ReadAttributes")(ReadAttributes)
    if (!js.isUndefined(RefreshTokenValidity)) __obj.updateDynamic("RefreshTokenValidity")(RefreshTokenValidity)
    if (SupportedIdentityProviders != null) __obj.updateDynamic("SupportedIdentityProviders")(SupportedIdentityProviders)
    if (WriteAttributes != null) __obj.updateDynamic("WriteAttributes")(WriteAttributes)
    __obj.asInstanceOf[UpdateUserPoolClientRequest]
  }
}

