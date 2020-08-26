package typings.apolloServer.mod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfo extends js.Object {
  var address: String = js.native
  var family: String = js.native
  var port: Double | String = js.native
  var server: Server = js.native
  var subscriptionsPath: String = js.native
  var subscriptionsUrl: String = js.native
  var url: String = js.native
}

object ServerInfo {
  @scala.inline
  def apply(
    address: String,
    family: String,
    port: Double | String,
    server: Server,
    subscriptionsPath: String,
    subscriptionsUrl: String,
    url: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], subscriptionsPath = subscriptionsPath.asInstanceOf[js.Any], subscriptionsUrl = subscriptionsUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  @scala.inline
  implicit class ServerInfoOps[Self <: ServerInfo] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double | String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionsPath(value: String): Self = this.set("subscriptionsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionsUrl(value: String): Self = this.set("subscriptionsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

