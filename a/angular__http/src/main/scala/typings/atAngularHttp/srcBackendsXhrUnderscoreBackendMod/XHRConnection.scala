package typings.atAngularHttp.srcBackendsXhrUnderscoreBackendMod

import typings.atAngularHttp.srcBackendsBrowserUnderscoreXhrMod.BrowserXhr
import typings.atAngularHttp.srcBaseUnderscoreResponseUnderscoreOptionsMod.ResponseOptions
import typings.atAngularHttp.srcInterfacesMod.Connection
import typings.atAngularHttp.srcStaticUnderscoreRequestMod.Request
import typings.atAngularHttp.srcStaticUnderscoreResponseMod.Response
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/xhr_backend", "XHRConnection")
@js.native
class XHRConnection protected () extends Connection {
  def this(req: Request, browserXHR: BrowserXhr) = this()
  def this(req: Request, browserXHR: BrowserXhr, baseResponseOptions: ResponseOptions) = this()
  /**
    * Response {@link EventEmitter} which emits a single {@link Response} value on load event of
    * `XMLHttpRequest`.
    */
  @JSName("response")
  var response_XHRConnection: Observable[Response] = js.native
  def setDetectedContentType(req: js.Any, _xhr: js.Any): Unit = js.native
}

