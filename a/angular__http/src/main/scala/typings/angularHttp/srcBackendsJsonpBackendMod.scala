package typings.angularHttp

import typings.angularHttp.srcInterfacesMod.Connection
import typings.angularHttp.srcInterfacesMod.ConnectionBackend
import typings.angularHttp.srcStaticRequestMod.Request
import typings.angularHttp.srcStaticResponseMod.Response
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBackendsJsonpBackendMod {
  
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
    
    /**
      * An observable that completes with the response, when the request is finished.
      */
    @JSName("response")
    var response_JSONPConnection: Observable_[Response] = js.native
  }
}
