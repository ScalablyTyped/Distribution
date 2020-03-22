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
  def apply(ServerNameToVerify: StringWithLengthBetween1And512 = null): TlsConfig = {
    val __obj = js.Dynamic.literal()
    if (ServerNameToVerify != null) __obj.updateDynamic("ServerNameToVerify")(ServerNameToVerify.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsConfig]
  }
}

