package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  var hash: String
  var host: String
  var hostname: String
  var href: String
  var pathname: String
  var port: String
  var protocol: String
  var search: String
}

object Hash {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    href: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String
  ): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}

