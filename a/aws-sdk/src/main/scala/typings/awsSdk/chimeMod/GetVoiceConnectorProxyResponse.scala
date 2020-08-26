package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceConnectorProxyResponse extends js.Object {
  /**
    * The proxy configuration details.
    */
  var Proxy: js.UndefOr[typings.awsSdk.chimeMod.Proxy] = js.native
}

object GetVoiceConnectorProxyResponse {
  @scala.inline
  def apply(): GetVoiceConnectorProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorProxyResponse]
  }
  @scala.inline
  implicit class GetVoiceConnectorProxyResponseOps[Self <: GetVoiceConnectorProxyResponse] (val x: Self) extends AnyVal {
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
    def setProxy(value: Proxy): Self = this.set("Proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("Proxy", js.undefined)
  }
  
}

