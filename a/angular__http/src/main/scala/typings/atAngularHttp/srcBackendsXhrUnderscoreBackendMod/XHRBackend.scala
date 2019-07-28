package typings.atAngularHttp.srcBackendsXhrUnderscoreBackendMod

import typings.atAngularHttp.srcBackendsBrowserUnderscoreXhrMod.BrowserXhr
import typings.atAngularHttp.srcBaseUnderscoreResponseUnderscoreOptionsMod.ResponseOptions
import typings.atAngularHttp.srcInterfacesMod.ConnectionBackend
import typings.atAngularHttp.srcInterfacesMod.XSRFStrategy
import typings.atAngularHttp.srcStaticUnderscoreRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/xhr_backend", "XHRBackend")
@js.native
class XHRBackend protected () extends ConnectionBackend {
  def this(_browserXHR: BrowserXhr, _baseResponseOptions: ResponseOptions, _xsrfStrategy: XSRFStrategy) = this()
  var _baseResponseOptions: js.Any = js.native
  var _browserXHR: js.Any = js.native
  var _xsrfStrategy: js.Any = js.native
  def createConnection(request: Request): XHRConnection = js.native
}

