package typings
package atAngularHttpLib.srcBackendsXhrUnderscoreBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/xhr_backend", "XHRBackend")
@js.native
class XHRBackend protected ()
  extends atAngularHttpLib.srcInterfacesMod.ConnectionBackend {
  def this(_browserXHR: atAngularHttpLib.srcBackendsBrowserUnderscoreXhrMod.BrowserXhr, _baseResponseOptions: atAngularHttpLib.srcBaseUnderscoreResponseUnderscoreOptionsMod.ResponseOptions, _xsrfStrategy: atAngularHttpLib.srcInterfacesMod.XSRFStrategy) = this()
  var _baseResponseOptions: js.Any = js.native
  var _browserXHR: js.Any = js.native
  var _xsrfStrategy: js.Any = js.native
  def createConnection(request: atAngularHttpLib.srcStaticUnderscoreRequestMod.Request): XHRConnection = js.native
}

