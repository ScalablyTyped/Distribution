package typings.angularHttp

import typings.angularHttp.interfacesMod.Connection
import typings.angularHttp.interfacesMod.ConnectionBackend
import typings.angularHttp.staticRequestMod.Request
import typings.angularHttp.staticResponseMod.Response
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonpBackendMod {
  
  @JSImport("@angular/http/src/backends/jsonp_backend", "JSONPBackend")
  @js.native
  class JSONPBackend () extends ConnectionBackend {
    
    /* private */ var _baseResponseOptions: js.Any = js.native
    
    /* private */ var _browserJSONP: js.Any = js.native
    
    def createConnection(request: Request): JSONPConnection = js.native
  }
  
  @JSImport("@angular/http/src/backends/jsonp_backend", "JSONPConnection")
  @js.native
  class JSONPConnection () extends Connection {
    
    /* private */ var _dom: js.Any = js.native
    
    /* private */ var _finished: js.Any = js.native
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _responseData: js.Any = js.native
    
    /* private */ var _script: js.Any = js.native
    
    /* private */ var baseResponseOptions: js.Any = js.native
    
    /**
      * Callback called when the JSONP request completes, to notify the application
      * of the new data.
      */
    def finished(): Unit = js.native
    def finished(data: js.Any): Unit = js.native
    
    /**
      * An observable that completes with the response, when the request is finished.
      */
    @JSName("response")
    var response_JSONPConnection: Observable_[Response] = js.native
  }
}
