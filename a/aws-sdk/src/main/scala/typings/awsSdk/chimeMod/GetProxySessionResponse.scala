package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProxySessionResponse extends js.Object {
  var ProxySession: js.UndefOr[typings.awsSdk.chimeMod.ProxySession] = js.native
}

object GetProxySessionResponse {
  @scala.inline
  def apply(ProxySession: ProxySession = null): GetProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    if (ProxySession != null) __obj.updateDynamic("ProxySession")(ProxySession.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProxySessionResponse]
  }
}

