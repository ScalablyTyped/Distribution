package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiClientOptions extends js.Object {
  var headers: java.lang.String
  var hostname: java.lang.String
  var method: java.lang.String
  var path: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
}

object ApiClientOptions {
  @scala.inline
  def apply(
    headers: java.lang.String,
    hostname: java.lang.String,
    method: java.lang.String,
    path: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String
  ): ApiClientOptions = {
    val __obj = js.Dynamic.literal(headers = headers, hostname = hostname, method = method, path = path, port = port, protocol = protocol)
  
    __obj.asInstanceOf[ApiClientOptions]
  }
}

