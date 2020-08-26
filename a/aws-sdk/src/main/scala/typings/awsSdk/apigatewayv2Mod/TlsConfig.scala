package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsConfig extends js.Object {
  /**
    * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
    */
  var ServerNameToVerify: js.UndefOr[StringWithLengthBetween1And512] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setServerNameToVerify(value: StringWithLengthBetween1And512): Self = this.set("ServerNameToVerify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerNameToVerify: Self = this.set("ServerNameToVerify", js.undefined)
  }
  
}

