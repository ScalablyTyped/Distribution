package typings.angularHttp

import typings.angularHttp.interfacesMod.Connection
import typings.angularHttp.interfacesMod.ConnectionBackend
import typings.angularHttp.staticRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonpBackendMod {
  
  @JSImport("@angular/http/src/backends/jsonp_backend", "JSONPBackend")
  @js.native
  open class JSONPBackend () extends ConnectionBackend {
    
    /* private */ var _baseResponseOptions: Any = js.native
    
    /* private */ var _browserJSONP: Any = js.native
    
    def createConnection(request: Request): JSONPConnection = js.native
  }
  
  @JSImport("@angular/http/src/backends/jsonp_backend", "JSONPConnection")
  @js.native
  open class JSONPConnection () extends Connection {
    
    /* private */ var _dom: Any = js.native
    
    /* private */ var _finished: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _responseData: Any = js.native
    
    /* private */ var _script: Any = js.native
    
    /* private */ var baseResponseOptions: Any = js.native
    
    /**
      * Callback called when the JSONP request completes, to notify the application
      * of the new data.
      */
    def finished(): Unit = js.native
    def finished(data: Any): Unit = js.native
  }
}
