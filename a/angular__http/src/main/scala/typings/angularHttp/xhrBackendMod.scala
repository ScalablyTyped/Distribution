package typings.angularHttp

import typings.angularHttp.baseResponseOptionsMod.ResponseOptions
import typings.angularHttp.browserXhrMod.BrowserXhr
import typings.angularHttp.interfacesMod.Connection
import typings.angularHttp.interfacesMod.ConnectionBackend
import typings.angularHttp.interfacesMod.XSRFStrategy
import typings.angularHttp.staticRequestMod.Request
import typings.angularHttp.staticResponseMod.Response
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrBackendMod {
  
  @JSImport("@angular/http/src/backends/xhr_backend", "CookieXSRFStrategy")
  @js.native
  class CookieXSRFStrategy () extends XSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
    
    var _cookieName: js.Any = js.native
    
    var _headerName: js.Any = js.native
  }
  
  @JSImport("@angular/http/src/backends/xhr_backend", "XHRBackend")
  @js.native
  class XHRBackend protected () extends ConnectionBackend {
    def this(_browserXHR: BrowserXhr, _baseResponseOptions: ResponseOptions, _xsrfStrategy: XSRFStrategy) = this()
    
    var _baseResponseOptions: js.Any = js.native
    
    var _browserXHR: js.Any = js.native
    
    var _xsrfStrategy: js.Any = js.native
    
    def createConnection(request: Request): XHRConnection = js.native
  }
  
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
    var response_XHRConnection: Observable_[Response] = js.native
    
    def setDetectedContentType(req: js.Any, _xhr: js.Any): Unit = js.native
  }
}
