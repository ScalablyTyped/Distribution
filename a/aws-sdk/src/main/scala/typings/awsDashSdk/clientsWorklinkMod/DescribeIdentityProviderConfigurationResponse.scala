package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityProviderConfigurationResponse extends js.Object {
  /**
    * The SAML metadata document provided by the user’s identity provider.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.IdentityProviderType] = js.native
  /**
    * The SAML metadata document uploaded to the user’s identity provider.
    */
  var ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
}

object DescribeIdentityProviderConfigurationResponse {
  @scala.inline
  def apply(
    IdentityProviderSamlMetadata: SamlMetadata = null,
    IdentityProviderType: IdentityProviderType = null,
    ServiceProviderSamlMetadata: SamlMetadata = null
  ): DescribeIdentityProviderConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityProviderSamlMetadata != null) __obj.updateDynamic("IdentityProviderSamlMetadata")(IdentityProviderSamlMetadata.asInstanceOf[js.Any])
    if (IdentityProviderType != null) __obj.updateDynamic("IdentityProviderType")(IdentityProviderType.asInstanceOf[js.Any])
    if (ServiceProviderSamlMetadata != null) __obj.updateDynamic("ServiceProviderSamlMetadata")(ServiceProviderSamlMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityProviderConfigurationResponse]
  }
}

