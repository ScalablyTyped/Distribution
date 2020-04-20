package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProxySessionResponse extends js.Object {
  /**
    * The proxy session details.
    */
  var ProxySession: js.UndefOr[typings.awsSdk.chimeMod.ProxySession] = js.native
}

object UpdateProxySessionResponse {
  @scala.inline
  def apply(ProxySession: ProxySession = null): UpdateProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    if (ProxySession != null) __obj.updateDynamic("ProxySession")(ProxySession.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProxySessionResponse]
  }
}

