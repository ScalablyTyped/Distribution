package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateIdentityProviderConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
  /**
    * The SAML metadata document provided by the customer’s identity provider. The existing IdentityProviderSamlMetadata is unset if null is passed.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.undefined
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: awsDashSdkLib.clientsWorklinkMod.IdentityProviderType
}

object UpdateIdentityProviderConfigurationRequest {
  @scala.inline
  def apply(
    FleetArn: FleetArn,
    IdentityProviderType: IdentityProviderType,
    IdentityProviderSamlMetadata: SamlMetadata = null
  ): UpdateIdentityProviderConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn, IdentityProviderType = IdentityProviderType.asInstanceOf[js.Any])
    if (IdentityProviderSamlMetadata != null) __obj.updateDynamic("IdentityProviderSamlMetadata")(IdentityProviderSamlMetadata)
    __obj.asInstanceOf[UpdateIdentityProviderConfigurationRequest]
  }
}

