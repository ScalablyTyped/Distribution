package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsConfig extends js.Object {
  /**
    * Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a supported certificate authority. This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate's expiration date, hostname, and presence of a root certificate authority. Supported only for HTTP and HTTP_PROXY integrations.
    */
  var insecureSkipVerification: js.UndefOr[Boolean] = js.native
}

object TlsConfig {
  @scala.inline
  def apply(insecureSkipVerification: js.UndefOr[Boolean] = js.undefined): TlsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insecureSkipVerification)) __obj.updateDynamic("insecureSkipVerification")(insecureSkipVerification.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsConfig]
  }
}

