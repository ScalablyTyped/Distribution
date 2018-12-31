package typings
package atAngularHttpLib.srcBackendsXhrUnderscoreBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/xhr_backend", "XHRConnection")
@js.native
class XHRConnection protected ()
  extends atAngularHttpLib.srcInterfacesMod.Connection {
  def this(req: atAngularHttpLib.srcStaticUnderscoreRequestMod.Request, browserXHR: atAngularHttpLib.srcBackendsBrowserUnderscoreXhrMod.BrowserXhr) = this()
  def this(req: atAngularHttpLib.srcStaticUnderscoreRequestMod.Request, browserXHR: atAngularHttpLib.srcBackendsBrowserUnderscoreXhrMod.BrowserXhr, baseResponseOptions: atAngularHttpLib.srcBaseUnderscoreResponseUnderscoreOptionsMod.ResponseOptions) = this()
  /**
    * Response {@link EventEmitter} which emits a single {@link Response} value on load event of
    * `XMLHttpRequest`.
    */
  @JSName("response")
  var response_XHRConnection: rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  def setDetectedContentType(req: js.Any, _xhr: js.Any): scala.Unit = js.native
}

