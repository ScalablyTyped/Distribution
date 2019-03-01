package typings
package apolloDashServerLib.apolloDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfo extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var port: scala.Double | java.lang.String
  var server: nodeLib.httpMod.Server
  var subscriptionsPath: java.lang.String
  var subscriptionsUrl: java.lang.String
  var url: java.lang.String
}

object ServerInfo {
  @scala.inline
  def apply(
    address: java.lang.String,
    family: java.lang.String,
    port: scala.Double | java.lang.String,
    server: nodeLib.httpMod.Server,
    subscriptionsPath: java.lang.String,
    subscriptionsUrl: java.lang.String,
    url: java.lang.String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.updateDynamic("server")(server)
    __obj.updateDynamic("subscriptionsPath")(subscriptionsPath)
    __obj.updateDynamic("subscriptionsUrl")(subscriptionsUrl)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ServerInfo]
  }
}

