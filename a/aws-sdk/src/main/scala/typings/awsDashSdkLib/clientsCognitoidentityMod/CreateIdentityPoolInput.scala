package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var IdentityPoolName: awsDashSdkLib.clientsCognitoidentityMod.IdentityPoolName
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

object CreateIdentityPoolInput {
  @scala.inline
  def apply(
    AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
    IdentityPoolName: IdentityPoolName,
    CognitoIdentityProviders: CognitoIdentityProviderList = null,
    DeveloperProviderName: DeveloperProviderName = null,
    IdentityPoolTags: IdentityPoolTagsType = null,
    OpenIdConnectProviderARNs: OIDCProviderList = null,
    SamlProviderARNs: SAMLProviderList = null,
    SupportedLoginProviders: IdentityProviders = null
  ): CreateIdentityPoolInput = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities, IdentityPoolName = IdentityPoolName)
    if (CognitoIdentityProviders != null) __obj.updateDynamic("CognitoIdentityProviders")(CognitoIdentityProviders)
    if (DeveloperProviderName != null) __obj.updateDynamic("DeveloperProviderName")(DeveloperProviderName)
    if (IdentityPoolTags != null) __obj.updateDynamic("IdentityPoolTags")(IdentityPoolTags)
    if (OpenIdConnectProviderARNs != null) __obj.updateDynamic("OpenIdConnectProviderARNs")(OpenIdConnectProviderARNs)
    if (SamlProviderARNs != null) __obj.updateDynamic("SamlProviderARNs")(SamlProviderARNs)
    if (SupportedLoginProviders != null) __obj.updateDynamic("SupportedLoginProviders")(SupportedLoginProviders)
    __obj.asInstanceOf[CreateIdentityPoolInput]
  }
}

