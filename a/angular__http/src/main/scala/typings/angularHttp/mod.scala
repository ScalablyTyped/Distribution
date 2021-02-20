package typings.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.Version
import typings.angularHttp.bodyMod.Body
import typings.angularHttp.browserJsonpMod.BrowserJsonp
import typings.angularHttp.interfacesMod.RequestArgs
import typings.angularHttp.interfacesMod.RequestOptionsArgs
import typings.angularHttp.interfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/http", "BaseRequestOptions")
  @js.native
  class BaseRequestOptions ()
    extends typings.angularHttp.publicApiMod.BaseRequestOptions
  
  @JSImport("@angular/http", "BaseResponseOptions")
  @js.native
  class BaseResponseOptions ()
    extends typings.angularHttp.publicApiMod.BaseResponseOptions
  
  @JSImport("@angular/http", "BrowserXhr")
  @js.native
  class BrowserXhr ()
    extends typings.angularHttp.publicApiMod.BrowserXhr
  
  @JSImport("@angular/http", "Connection")
  @js.native
  abstract class Connection ()
    extends typings.angularHttp.publicApiMod.Connection
  
  @JSImport("@angular/http", "ConnectionBackend")
  @js.native
  abstract class ConnectionBackend ()
    extends typings.angularHttp.publicApiMod.ConnectionBackend
  
  @JSImport("@angular/http", "CookieXSRFStrategy")
  @js.native
  class CookieXSRFStrategy ()
    extends typings.angularHttp.publicApiMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: js.UndefOr[scala.Nothing], _headerName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
  }
  
  @JSImport("@angular/http", "Headers")
  @js.native
  class Headers ()
    extends typings.angularHttp.publicApiMod.Headers {
    def this(headers: StringDictionary[js.Any]) = this()
    def this(headers: typings.angularHttp.headersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    @JSImport("@angular/http", "Headers.fromResponseHeaderString")
    @js.native
    def fromResponseHeaderString(headersString: String): typings.angularHttp.headersMod.Headers = js.native
  }
  
  @JSImport("@angular/http", "Http")
  @js.native
  class Http protected ()
    extends typings.angularHttp.publicApiMod.Http {
    def this(
      _backend: typings.angularHttp.interfacesMod.ConnectionBackend,
      _defaultOptions: typings.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http", "HttpModule")
  @js.native
  class HttpModule ()
    extends typings.angularHttp.publicApiMod.HttpModule
  
  @JSImport("@angular/http", "JSONPBackend")
  @js.native
  class JSONPBackend ()
    extends typings.angularHttp.publicApiMod.JSONPBackend
  
  @JSImport("@angular/http", "JSONPConnection")
  @js.native
  class JSONPConnection ()
    extends typings.angularHttp.publicApiMod.JSONPConnection
  
  @JSImport("@angular/http", "Jsonp")
  @js.native
  class Jsonp protected ()
    extends typings.angularHttp.publicApiMod.Jsonp {
    def this(
      backend: typings.angularHttp.interfacesMod.ConnectionBackend,
      defaultOptions: typings.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http", "JsonpModule")
  @js.native
  class JsonpModule ()
    extends typings.angularHttp.publicApiMod.JsonpModule
  
  @JSImport("@angular/http", "QueryEncoder")
  @js.native
  class QueryEncoder ()
    extends typings.angularHttp.publicApiMod.QueryEncoder
  
  @JSImport("@angular/http", "ReadyState")
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
  
  @JSImport("@angular/http", "Request")
  @js.native
  class Request protected ()
    extends typings.angularHttp.publicApiMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http", "RequestMethod")
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
  
  @JSImport("@angular/http", "RequestOptions")
  @js.native
  class RequestOptions ()
    extends typings.angularHttp.publicApiMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http", "Response")
  @js.native
  class Response protected ()
    extends typings.angularHttp.publicApiMod.Response {
    def this(responseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.ResponseContentType with Double] = js.native
    
    /* 2 */ val ArrayBuffer: typings.angularHttp.enumsMod.ResponseContentType.ArrayBuffer with Double = js.native
    
    /* 3 */ val Blob: typings.angularHttp.enumsMod.ResponseContentType.Blob with Double = js.native
    
    /* 1 */ val Json: typings.angularHttp.enumsMod.ResponseContentType.Json with Double = js.native
    
    /* 0 */ val Text: typings.angularHttp.enumsMod.ResponseContentType.Text with Double = js.native
  }
  
  @JSImport("@angular/http", "ResponseOptions")
  @js.native
  class ResponseOptions ()
    extends typings.angularHttp.publicApiMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http", "ResponseType")
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
  
  @JSImport("@angular/http", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.angularHttp.publicApiMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(
      rawParams: js.UndefOr[scala.Nothing],
      queryEncoder: typings.angularHttp.urlSearchParamsMod.QueryEncoder
    ) = this()
    def this(rawParams: String, queryEncoder: typings.angularHttp.urlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http", "XHRBackend")
  @js.native
  class XHRBackend protected ()
    extends typings.angularHttp.publicApiMod.XHRBackend {
    def this(
      _browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr,
      _baseResponseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typings.angularHttp.interfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http", "XHRConnection")
  @js.native
  class XHRConnection protected ()
    extends typings.angularHttp.publicApiMod.XHRConnection {
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
  
  @JSImport("@angular/http", "XSRFStrategy")
  @js.native
  abstract class XSRFStrategy ()
    extends typings.angularHttp.publicApiMod.XSRFStrategy
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_a")
  @js.native
  def ɵangularPackagesHttpHttpA(): typings.angularHttp.xhrBackendMod.CookieXSRFStrategy = js.native
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_b")
  @js.native
  def ɵangularPackagesHttpHttpB(
    xhrBackend: typings.angularHttp.xhrBackendMod.XHRBackend,
    requestOptions: typings.angularHttp.baseRequestOptionsMod.RequestOptions
  ): typings.angularHttp.httpMod.Http = js.native
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_c")
  @js.native
  def ɵangularPackagesHttpHttpC(
    jsonpBackend: typings.angularHttp.jsonpBackendMod.JSONPBackend,
    requestOptions: typings.angularHttp.baseRequestOptionsMod.RequestOptions
  ): typings.angularHttp.httpMod.Jsonp = js.native
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_e")
  @js.native
  class ɵangularPackagesHttpHttpE () extends BrowserJsonp
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_f")
  @js.native
  abstract class ɵangularPackagesHttpHttpF () extends Body
}
