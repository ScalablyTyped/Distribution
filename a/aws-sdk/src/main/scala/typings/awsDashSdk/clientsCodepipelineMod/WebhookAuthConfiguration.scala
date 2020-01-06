package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookAuthConfiguration extends js.Object {
  /**
    * The property used to configure acceptance of webhooks in an IP address range. For IP, only the AllowedIPRange property must be set. This property must be set to a valid CIDR range.
    */
  var AllowedIPRange: js.UndefOr[WebhookAuthConfigurationAllowedIPRange] = js.native
  /**
    * The property used to configure GitHub authentication. For GITHUB_HMAC, only the SecretToken property must be set.
    */
  var SecretToken: js.UndefOr[WebhookAuthConfigurationSecretToken] = js.native
}

object WebhookAuthConfiguration {
  @scala.inline
  def apply(
    AllowedIPRange: WebhookAuthConfigurationAllowedIPRange = null,
    SecretToken: WebhookAuthConfigurationSecretToken = null
  ): WebhookAuthConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AllowedIPRange != null) __obj.updateDynamic("AllowedIPRange")(AllowedIPRange.asInstanceOf[js.Any])
    if (SecretToken != null) __obj.updateDynamic("SecretToken")(SecretToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookAuthConfiguration]
  }
}

