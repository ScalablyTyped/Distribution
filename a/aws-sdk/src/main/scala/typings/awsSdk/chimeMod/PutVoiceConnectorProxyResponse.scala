package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutVoiceConnectorProxyResponse extends js.Object {
  /**
    * The proxy configuration details.
    */
  var Proxy: js.UndefOr[typings.awsSdk.chimeMod.Proxy] = js.native
}

object PutVoiceConnectorProxyResponse {
  @scala.inline
  def apply(Proxy: Proxy = null): PutVoiceConnectorProxyResponse = {
    val __obj = js.Dynamic.literal()
    if (Proxy != null) __obj.updateDynamic("Proxy")(Proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVoiceConnectorProxyResponse]
  }
}

