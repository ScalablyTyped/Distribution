package typings.atAngularHttp.srcBackendsJsonpUnderscoreBackendMod

import typings.atAngularHttp.srcInterfacesMod.ConnectionBackend
import typings.atAngularHttp.srcStaticUnderscoreRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/jsonp_backend", "JSONPBackend")
@js.native
class JSONPBackend () extends ConnectionBackend {
  var _baseResponseOptions: js.Any = js.native
  var _browserJSONP: js.Any = js.native
  def createConnection(request: Request): JSONPConnection = js.native
}

