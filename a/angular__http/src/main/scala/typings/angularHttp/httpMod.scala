package typings.angularHttp

import typings.angularHttp.baseRequestOptionsMod.RequestOptions
import typings.angularHttp.interfacesMod.ConnectionBackend
import typings.angularHttp.interfacesMod.RequestOptionsArgs
import typings.angularHttp.staticRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("@angular/http/src/http", "Http")
  @js.native
  open class Http protected () extends StObject {
    def this(_backend: ConnectionBackend, _defaultOptions: RequestOptions) = this()
    
    /* protected */ var _backend: ConnectionBackend = js.native
    
    /* protected */ var _defaultOptions: RequestOptions = js.native
    
    /**
      * Performs a request with `delete` http method.
      */
    def delete(url: String): Any = js.native
    def delete(url: String, options: RequestOptionsArgs): Any = js.native
    
    /**
      * Performs a request with `get` http method.
      */
    def get(url: String): Any = js.native
    def get(url: String, options: RequestOptionsArgs): Any = js.native
    
    /**
      * Performs a request with `head` http method.
      */
    def head(url: String): Any = js.native
    def head(url: String, options: RequestOptionsArgs): Any = js.native
    
    /**
      * Performs a request with `options` http method.
      */
    def options(url: String): Any = js.native
    def options(url: String, options: RequestOptionsArgs): Any = js.native
    
    /**
      * Performs a request with `patch` http method.
      */
    def patch(url: String, body: Any): Any = js.native
    def patch(url: String, body: Any, options: RequestOptionsArgs): Any = js.native
    
    /**
      * Performs a request with `post` http method.
      */
    def post(url: String, body: Any): Any = js.native
    def post(url: String, body: Any, options: RequestOptionsArgs): Any = js.native
    
    /**
      * Performs a request with `put` http method.
      */
    def put(url: String, body: Any): Any = js.native
    def put(url: String, body: Any, options: RequestOptionsArgs): Any = js.native
    
    /**
      * Performs any type of http request. First argument is required, and can either be a url or
      * a {@link Request} instance. If the first argument is a url, an optional {@link RequestOptions}
      * object can be provided as the 2nd argument. The options object will be merged with the values
      * of {@link BaseRequestOptions} before performing the request.
      */
    def request(url: String): Any = js.native
    def request(url: String, options: RequestOptionsArgs): Any = js.native
    def request(url: Request): Any = js.native
    def request(url: Request, options: RequestOptionsArgs): Any = js.native
  }
  
  @JSImport("@angular/http/src/http", "Jsonp")
  @js.native
  open class Jsonp protected () extends Http {
    def this(backend: ConnectionBackend, defaultOptions: RequestOptions) = this()
  }
}
