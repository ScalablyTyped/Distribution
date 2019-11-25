package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiClientOptions extends js.Object {
  var headers: String
  var hostname: String
  var method: String
  var path: String
  var port: String
  var protocol: String
}

object ApiClientOptions {
  @scala.inline
  def apply(headers: String, hostname: String, method: String, path: String, port: String, protocol: String): ApiClientOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApiClientOptions]
  }
}

