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
    val __obj = js.Dynamic.literal(address = address, family = family, port = port.asInstanceOf[js.Any], server = server, subscriptionsPath = subscriptionsPath, subscriptionsUrl = subscriptionsUrl, url = url)
  
    __obj.asInstanceOf[ServerInfo]
  }
}

