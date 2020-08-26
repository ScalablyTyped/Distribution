package typings.apolloEngineReporting.agentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientInfo extends js.Object {
  var clientName: js.UndefOr[String] = js.native
  var clientReferenceId: js.UndefOr[String] = js.native
  var clientVersion: js.UndefOr[String] = js.native
}

object ClientInfo {
  @scala.inline
  def apply(): ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientInfo]
  }
  @scala.inline
  implicit class ClientInfoOps[Self <: ClientInfo] (val x: Self) extends AnyVal {
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
    def setClientName(value: String): Self = this.set("clientName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientName: Self = this.set("clientName", js.undefined)
    @scala.inline
    def setClientReferenceId(value: String): Self = this.set("clientReferenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientReferenceId: Self = this.set("clientReferenceId", js.undefined)
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVersion: Self = this.set("clientVersion", js.undefined)
  }
  
}

