package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var DeveloperProviderName: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.DeveloperProviderName] = js.undefined
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId
  /**
    * A string that you provide.
    */
  var IdentityPoolName: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolName
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

object IdentityPool {
  @scala.inline
  def apply(
    AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
    IdentityPoolId: IdentityPoolId,
    IdentityPoolName: IdentityPoolName,
    CognitoIdentityProviders: CognitoIdentityProviderList = null,
    DeveloperProviderName: DeveloperProviderName = null,
    IdentityPoolTags: IdentityPoolTagsType = null,
    OpenIdConnectProviderARNs: OIDCProviderList = null,
    SamlProviderARNs: SAMLProviderList = null,
    SupportedLoginProviders: IdentityProviders = null
  ): IdentityPool = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities, IdentityPoolId = IdentityPoolId, IdentityPoolName = IdentityPoolName)
    if (CognitoIdentityProviders != null) __obj.updateDynamic("CognitoIdentityProviders")(CognitoIdentityProviders)
    if (DeveloperProviderName != null) __obj.updateDynamic("DeveloperProviderName")(DeveloperProviderName)
    if (IdentityPoolTags != null) __obj.updateDynamic("IdentityPoolTags")(IdentityPoolTags)
    if (OpenIdConnectProviderARNs != null) __obj.updateDynamic("OpenIdConnectProviderARNs")(OpenIdConnectProviderARNs)
    if (SamlProviderARNs != null) __obj.updateDynamic("SamlProviderARNs")(SamlProviderARNs)
    if (SupportedLoginProviders != null) __obj.updateDynamic("SupportedLoginProviders")(SupportedLoginProviders)
    __obj.asInstanceOf[IdentityPool]
  }
}

