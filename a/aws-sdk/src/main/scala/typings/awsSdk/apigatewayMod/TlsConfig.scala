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
  def apply(): TlsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsConfig]
  }
  @scala.inline
  implicit class TlsConfigOps[Self <: TlsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInsecureSkipVerification(value: Boolean): Self = this.set("insecureSkipVerification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsecureSkipVerification: Self = this.set("insecureSkipVerification", js.undefined)
  }
  
}

