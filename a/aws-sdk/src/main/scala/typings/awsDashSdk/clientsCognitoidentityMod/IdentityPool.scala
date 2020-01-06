package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPool extends js.Object {
  /**
    * Enables or disables the Basic (Classic) authentication flow. For more information, see Identity Pools (Federated Identities) Authentication Flow in the Amazon Cognito Developer Guide.
    */
  var AllowClassicFlow: js.UndefOr[ClassicFlow] = js.native
  /**
    * TRUE if the identity pool supports unauthenticated logins.
    */
  var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated = js.native
  /**
    * A list representing an Amazon Cognito user pool and its client ID.
    */
  var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.native
  /**
    * The "domain" by which Cognito will refer to your users.
    */
  var DeveloperProviderName: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.DeveloperProviderName] = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId = js.native
  /**
    * A string that you provide.
    */
  var IdentityPoolName: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolName = js.native
  /**
    * The tags that are assigned to the identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.native
  /**
    * A list of OpendID Connect provider ARNs.
    */
  var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.native
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.
    */
  var SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.native
  /**
    * Optional key:value pairs mapping provider names to provider app IDs.
    */
  var SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.native
}

object IdentityPool {
  @scala.inline
  def apply(
    AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
    IdentityPoolId: IdentityPoolId,
    IdentityPoolName: IdentityPoolName,
    AllowClassicFlow: js.UndefOr[Boolean] = js.undefined,
    CognitoIdentityProviders: CognitoIdentityProviderList = null,
    DeveloperProviderName: DeveloperProviderName = null,
    IdentityPoolTags: IdentityPoolTagsType = null,
    OpenIdConnectProviderARNs: OIDCProviderList = null,
    SamlProviderARNs: SAMLProviderList = null,
    SupportedLoginProviders: IdentityProviders = null
  ): IdentityPool = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowClassicFlow)) __obj.updateDynamic("AllowClassicFlow")(AllowClassicFlow.asInstanceOf[js.Any])
    if (CognitoIdentityProviders != null) __obj.updateDynamic("CognitoIdentityProviders")(CognitoIdentityProviders.asInstanceOf[js.Any])
    if (DeveloperProviderName != null) __obj.updateDynamic("DeveloperProviderName")(DeveloperProviderName.asInstanceOf[js.Any])
    if (IdentityPoolTags != null) __obj.updateDynamic("IdentityPoolTags")(IdentityPoolTags.asInstanceOf[js.Any])
    if (OpenIdConnectProviderARNs != null) __obj.updateDynamic("OpenIdConnectProviderARNs")(OpenIdConnectProviderARNs.asInstanceOf[js.Any])
    if (SamlProviderARNs != null) __obj.updateDynamic("SamlProviderARNs")(SamlProviderARNs.asInstanceOf[js.Any])
    if (SupportedLoginProviders != null) __obj.updateDynamic("SupportedLoginProviders")(SupportedLoginProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPool]
  }
}

