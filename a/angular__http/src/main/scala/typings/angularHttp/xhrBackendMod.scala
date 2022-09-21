package typings.angularHttp

import typings.angularHttp.baseResponseOptionsMod.ResponseOptions
import typings.angularHttp.browserXhrMod.BrowserXhr
import typings.angularHttp.interfacesMod.Connection
import typings.angularHttp.interfacesMod.ConnectionBackend
import typings.angularHttp.interfacesMod.XSRFStrategy
import typings.angularHttp.staticRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrBackendMod {
  
  @JSImport("@angular/http/src/backends/xhr_backend", "CookieXSRFStrategy")
  @js.native
  open class CookieXSRFStrategy () extends XSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
    
    /* private */ var _cookieName: Any = js.native
    
    /* private */ var _headerName: Any = js.native
  }
  
  @JSImport("@angular/http/src/backends/xhr_backend", "XHRBackend")
  @js.native
  open class XHRBackend protected () extends ConnectionBackend {
    def this(_browserXHR: BrowserXhr, _baseResponseOptions: ResponseOptions, _xsrfStrategy: XSRFStrategy) = this()
    
    /* private */ var _baseResponseOptions: Any = js.native
    
    /* private */ var _browserXHR: Any = js.native
    
    /* private */ var _xsrfStrategy: Any = js.native
    
    def createConnection(request: Request): XHRConnection = js.native
  }
  
  @JSImport("@angular/http/src/backends/xhr_backend", "XHRConnection")
  @js.native
  open class XHRConnection protected () extends Connection {
    def this(req: Request, browserXHR: BrowserXhr) = this()
    def this(req: Request, browserXHR: BrowserXhr, baseResponseOptions: ResponseOptions) = this()
    
    def setDetectedContentType(req: Any, _xhr: Any): Unit = js.native
  }
}
