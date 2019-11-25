package typings.apolloDashServer.apolloDashServerMod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfo extends js.Object {
  var address: String
  var family: String
  var port: Double | String
  var server: Server
  var subscriptionsPath: String
  var subscriptionsUrl: String
  var url: String
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
}

