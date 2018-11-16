package typings
package atAngularHttpLib.srcBackendsJsonpUnderscoreBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/jsonp_backend", "JSONPBackend")
@js.native
class JSONPBackend ()
  extends atAngularHttpLib.srcInterfacesMod.ConnectionBackend {
  var _baseResponseOptions: js.Any = js.native
  var _browserJSONP: js.Any = js.native
  def createConnection(request: atAngularHttpLib.srcStaticUnderscoreRequestMod.Request): JSONPConnection = js.native
}

