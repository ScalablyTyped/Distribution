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
    val __obj = js.Dynamic.literal(address = address, family = family, port = port.asInstanceOf[js.Any], server = server, subscriptionsPath = subscriptionsPath, subscriptionsUrl = subscriptionsUrl, url = url)
  
    __obj.asInstanceOf[ServerInfo]
  }
}

