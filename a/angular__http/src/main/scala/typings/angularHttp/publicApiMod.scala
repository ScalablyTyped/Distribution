package typings.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.Version
import typings.angularHttp.interfacesMod.RequestArgs
import typings.angularHttp.interfacesMod.RequestOptionsArgs
import typings.angularHttp.interfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicApiMod {
  
  @JSImport("@angular/http/public_api", "BaseRequestOptions")
  @js.native
  class BaseRequestOptions ()
    extends typings.angularHttp.srcMod.BaseRequestOptions
  
  @JSImport("@angular/http/public_api", "BaseResponseOptions")
  @js.native
  class BaseResponseOptions ()
    extends typings.angularHttp.srcMod.BaseResponseOptions
  
  @JSImport("@angular/http/public_api", "BrowserXhr")
  @js.native
  class BrowserXhr ()
    extends typings.angularHttp.srcMod.BrowserXhr
  
  @JSImport("@angular/http/public_api", "Connection")
  @js.native
  abstract class Connection ()
    extends typings.angularHttp.srcMod.Connection
  
  @JSImport("@angular/http/public_api", "ConnectionBackend")
  @js.native
  abstract class ConnectionBackend ()
    extends typings.angularHttp.srcMod.ConnectionBackend
  
  @JSImport("@angular/http/public_api", "CookieXSRFStrategy")
  @js.native
  class CookieXSRFStrategy ()
    extends typings.angularHttp.srcMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: js.UndefOr[scala.Nothing], _headerName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
  }
  
  @JSImport("@angular/http/public_api", "Headers")
  @js.native
  class Headers ()
    extends typings.angularHttp.srcMod.Headers {
    def this(headers: StringDictionary[js.Any]) = this()
    def this(headers: typings.angularHttp.headersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    @JSImport("@angular/http/public_api", "Headers.fromResponseHeaderString")
    @js.native
    def fromResponseHeaderString(headersString: String): typings.angularHttp.headersMod.Headers = js.native
  }
  
  @JSImport("@angular/http/public_api", "Http")
  @js.native
  class Http protected ()
    extends typings.angularHttp.srcMod.Http {
    def this(
      _backend: typings.angularHttp.interfacesMod.ConnectionBackend,
      _defaultOptions: typings.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "HttpModule")
  @js.native
  class HttpModule ()
    extends typings.angularHttp.srcMod.HttpModule
  
  @JSImport("@angular/http/public_api", "JSONPBackend")
  @js.native
  class JSONPBackend ()
    extends typings.angularHttp.srcMod.JSONPBackend
  
  @JSImport("@angular/http/public_api", "JSONPConnection")
  @js.native
  class JSONPConnection ()
    extends typings.angularHttp.srcMod.JSONPConnection
  
  @JSImport("@angular/http/public_api", "Jsonp")
  @js.native
  class Jsonp protected ()
    extends typings.angularHttp.srcMod.Jsonp {
    def this(
      backend: typings.angularHttp.interfacesMod.ConnectionBackend,
      defaultOptions: typings.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "JsonpModule")
  @js.native
  class JsonpModule ()
    extends typings.angularHttp.srcMod.JsonpModule
  
  @JSImport("@angular/http/public_api", "QueryEncoder")
  @js.native
  class QueryEncoder ()
    extends typings.angularHttp.srcMod.QueryEncoder
  
  @JSImport("@angular/http/public_api", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.ReadyState with Double] = js.native
    
    /* 5 */ val Cancelled: typings.angularHttp.enumsMod.ReadyState.Cancelled with Double = js.native
    
    /* 4 */ val Done: typings.angularHttp.enumsMod.ReadyState.Done with Double = js.native
    
    /* 2 */ val HeadersReceived: typings.angularHttp.enumsMod.ReadyState.HeadersReceived with Double = js.native
    
    /* 3 */ val Loading: typings.angularHttp.enumsMod.ReadyState.Loading with Double = js.native
    
    /* 1 */ val Open: typings.angularHttp.enumsMod.ReadyState.Open with Double = js.native
    
    /* 0 */ val Unsent: typings.angularHttp.enumsMod.ReadyState.Unsent with Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "Request")
  @js.native
  class Request protected ()
    extends typings.angularHttp.srcMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.RequestMethod with Double] = js.native
    
    /* 3 */ val Delete: typings.angularHttp.enumsMod.RequestMethod.Delete with Double = js.native
    
    /* 0 */ val Get: typings.angularHttp.enumsMod.RequestMethod.Get with Double = js.native
    
    /* 5 */ val Head: typings.angularHttp.enumsMod.RequestMethod.Head with Double = js.native
    
    /* 4 */ val Options: typings.angularHttp.enumsMod.RequestMethod.Options with Double = js.native
    
    /* 6 */ val Patch: typings.angularHttp.enumsMod.RequestMethod.Patch with Double = js.native
    
    /* 1 */ val Post: typings.angularHttp.enumsMod.RequestMethod.Post with Double = js.native
    
    /* 2 */ val Put: typings.angularHttp.enumsMod.RequestMethod.Put with Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "RequestOptions")
  @js.native
  class RequestOptions ()
    extends typings.angularHttp.srcMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "Response")
  @js.native
  class Response protected ()
    extends typings.angularHttp.srcMod.Response {
    def this(responseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http/public_api", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.ResponseContentType with Double] = js.native
    
    /* 2 */ val ArrayBuffer: typings.angularHttp.enumsMod.ResponseContentType.ArrayBuffer with Double = js.native
    
    /* 3 */ val Blob: typings.angularHttp.enumsMod.ResponseContentType.Blob with Double = js.native
    
    /* 1 */ val Json: typings.angularHttp.enumsMod.ResponseContentType.Json with Double = js.native
    
    /* 0 */ val Text: typings.angularHttp.enumsMod.ResponseContentType.Text with Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "ResponseOptions")
  @js.native
  class ResponseOptions ()
    extends typings.angularHttp.srcMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.ResponseType with Double] = js.native
    
    /* 0 */ val Basic: typings.angularHttp.enumsMod.ResponseType.Basic with Double = js.native
    
    /* 1 */ val Cors: typings.angularHttp.enumsMod.ResponseType.Cors with Double = js.native
    
    /* 2 */ val Default: typings.angularHttp.enumsMod.ResponseType.Default with Double = js.native
    
    /* 3 */ val Error: typings.angularHttp.enumsMod.ResponseType.Error with Double = js.native
    
    /* 4 */ val Opaque: typings.angularHttp.enumsMod.ResponseType.Opaque with Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.angularHttp.srcMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(
      rawParams: js.UndefOr[scala.Nothing],
      queryEncoder: typings.angularHttp.urlSearchParamsMod.QueryEncoder
    ) = this()
    def this(rawParams: String, queryEncoder: typings.angularHttp.urlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http/public_api", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http/public_api", "XHRBackend")
  @js.native
  class XHRBackend protected ()
    extends typings.angularHttp.srcMod.XHRBackend {
    def this(
      _browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr,
      _baseResponseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typings.angularHttp.interfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "XHRConnection")
  @js.native
  class XHRConnection protected ()
    extends typings.angularHttp.srcMod.XHRConnection {
    def this(
      req: typings.angularHttp.staticRequestMod.Request,
      browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr
    ) = this()
    def this(
      req: typings.angularHttp.staticRequestMod.Request,
      browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr,
      baseResponseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "XSRFStrategy")
  @js.native
  abstract class XSRFStrategy ()
    extends typings.angularHttp.srcMod.XSRFStrategy
}
