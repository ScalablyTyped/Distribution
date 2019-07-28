package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookAuthConfiguration extends js.Object {
  /**
    * The property used to configure acceptance of webhooks within a specific IP range. For IP, only the AllowedIPRange property must be set, and this property must be set to a valid CIDR range.
    */
  var AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange] = js.undefined
  /**
    * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
    */
  var SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken] = js.undefined
}

object WebhookAuthConfiguration {
  @scala.inline
  def apply(
    AllowedIPRange: WebhookAuthConfigurationAllowedIPRange = null,
    SecretToken: WebhookAuthConfigurationSecretToken = null
  ): WebhookAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AllowedIPRange != null) __obj.updateDynamic("AllowedIPRange")(AllowedIPRange)
    if (SecretToken != null) __obj.updateDynamic("SecretToken")(SecretToken)
    __obj.asInstanceOf[WebhookAuthConfiguration]
  }
}

