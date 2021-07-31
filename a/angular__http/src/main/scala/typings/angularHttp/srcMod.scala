package typings.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.Version
import typings.angularHttp.interfacesMod.RequestArgs
import typings.angularHttp.interfacesMod.RequestOptionsArgs
import typings.angularHttp.interfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@angular/http/src", "BaseRequestOptions")
  @js.native
  class BaseRequestOptions ()
    extends typings.angularHttp.baseRequestOptionsMod.BaseRequestOptions
  
  @JSImport("@angular/http/src", "BaseResponseOptions")
  @js.native
  class BaseResponseOptions ()
    extends typings.angularHttp.baseResponseOptionsMod.BaseResponseOptions
  
  @JSImport("@angular/http/src", "BrowserXhr")
  @js.native
  class BrowserXhr ()
    extends typings.angularHttp.browserXhrMod.BrowserXhr
  
  @JSImport("@angular/http/src", "Connection")
  @js.native
  abstract class Connection ()
    extends typings.angularHttp.interfacesMod.Connection
  
  @JSImport("@angular/http/src", "ConnectionBackend")
  @js.native
  abstract class ConnectionBackend ()
    extends typings.angularHttp.interfacesMod.ConnectionBackend
  
  @JSImport("@angular/http/src", "CookieXSRFStrategy")
  @js.native
  class CookieXSRFStrategy ()
    extends typings.angularHttp.xhrBackendMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
  }
  
  @JSImport("@angular/http/src", "Headers")
  @js.native
  class Headers ()
    extends typings.angularHttp.headersMod.Headers {
    def this(headers: StringDictionary[js.Any]) = this()
    def this(headers: typings.angularHttp.headersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    @JSImport("@angular/http/src", "Headers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    @scala.inline
    def fromResponseHeaderString(headersString: String): typings.angularHttp.headersMod.Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseHeaderString")(headersString.asInstanceOf[js.Any]).asInstanceOf[typings.angularHttp.headersMod.Headers]
  }
  
  @JSImport("@angular/http/src", "Http")
  @js.native
  class Http protected ()
    extends typings.angularHttp.httpMod.Http {
    def this(
      _backend: typings.angularHttp.interfacesMod.ConnectionBackend,
      _defaultOptions: typings.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/src", "HttpModule")
  @js.native
  class HttpModule ()
    extends typings.angularHttp.httpModuleMod.HttpModule
  
  @JSImport("@angular/http/src", "JSONPBackend")
  @js.native
  class JSONPBackend ()
    extends typings.angularHttp.jsonpBackendMod.JSONPBackend
  
  @JSImport("@angular/http/src", "JSONPConnection")
  @js.native
  class JSONPConnection ()
    extends typings.angularHttp.jsonpBackendMod.JSONPConnection
  
  @JSImport("@angular/http/src", "Jsonp")
  @js.native
  class Jsonp protected ()
    extends typings.angularHttp.httpMod.Jsonp {
    def this(
      backend: typings.angularHttp.interfacesMod.ConnectionBackend,
      defaultOptions: typings.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/src", "JsonpModule")
  @js.native
  class JsonpModule ()
    extends typings.angularHttp.httpModuleMod.JsonpModule
  
  @JSImport("@angular/http/src", "QueryEncoder")
  @js.native
  class QueryEncoder ()
    extends typings.angularHttp.urlSearchParamsMod.QueryEncoder
  
  @JSImport("@angular/http/src", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.ReadyState & Double] = js.native
    
    /* 5 */ val Cancelled: typings.angularHttp.enumsMod.ReadyState.Cancelled & Double = js.native
    
    /* 4 */ val Done: typings.angularHttp.enumsMod.ReadyState.Done & Double = js.native
    
    /* 2 */ val HeadersReceived: typings.angularHttp.enumsMod.ReadyState.HeadersReceived & Double = js.native
    
    /* 3 */ val Loading: typings.angularHttp.enumsMod.ReadyState.Loading & Double = js.native
    
    /* 1 */ val Open: typings.angularHttp.enumsMod.ReadyState.Open & Double = js.native
    
    /* 0 */ val Unsent: typings.angularHttp.enumsMod.ReadyState.Unsent & Double = js.native
  }
  
  @JSImport("@angular/http/src", "Request")
  @js.native
  class Request protected ()
    extends typings.angularHttp.staticRequestMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http/src", "RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.RequestMethod & Double] = js.native
    
    /* 3 */ val Delete: typings.angularHttp.enumsMod.RequestMethod.Delete & Double = js.native
    
    /* 0 */ val Get: typings.angularHttp.enumsMod.RequestMethod.Get & Double = js.native
    
    /* 5 */ val Head: typings.angularHttp.enumsMod.RequestMethod.Head & Double = js.native
    
    /* 4 */ val Options: typings.angularHttp.enumsMod.RequestMethod.Options & Double = js.native
    
    /* 6 */ val Patch: typings.angularHttp.enumsMod.RequestMethod.Patch & Double = js.native
    
    /* 1 */ val Post: typings.angularHttp.enumsMod.RequestMethod.Post & Double = js.native
    
    /* 2 */ val Put: typings.angularHttp.enumsMod.RequestMethod.Put & Double = js.native
  }
  
  @JSImport("@angular/http/src", "RequestOptions")
  @js.native
  class RequestOptions ()
    extends typings.angularHttp.baseRequestOptionsMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/src", "Response")
  @js.native
  class Response protected ()
    extends typings.angularHttp.staticResponseMod.Response {
    def this(responseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http/src", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.ResponseContentType & Double] = js.native
    
    /* 2 */ val ArrayBuffer: typings.angularHttp.enumsMod.ResponseContentType.ArrayBuffer & Double = js.native
    
    /* 3 */ val Blob: typings.angularHttp.enumsMod.ResponseContentType.Blob & Double = js.native
    
    /* 1 */ val Json: typings.angularHttp.enumsMod.ResponseContentType.Json & Double = js.native
    
    /* 0 */ val Text: typings.angularHttp.enumsMod.ResponseContentType.Text & Double = js.native
  }
  
  @JSImport("@angular/http/src", "ResponseOptions")
  @js.native
  class ResponseOptions ()
    extends typings.angularHttp.baseResponseOptionsMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/src", "ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.enumsMod.ResponseType & Double] = js.native
    
    /* 0 */ val Basic: typings.angularHttp.enumsMod.ResponseType.Basic & Double = js.native
    
    /* 1 */ val Cors: typings.angularHttp.enumsMod.ResponseType.Cors & Double = js.native
    
    /* 2 */ val Default: typings.angularHttp.enumsMod.ResponseType.Default & Double = js.native
    
    /* 3 */ val Error: typings.angularHttp.enumsMod.ResponseType.Error & Double = js.native
    
    /* 4 */ val Opaque: typings.angularHttp.enumsMod.ResponseType.Opaque & Double = js.native
  }
  
  @JSImport("@angular/http/src", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.angularHttp.urlSearchParamsMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(rawParams: String, queryEncoder: typings.angularHttp.urlSearchParamsMod.QueryEncoder) = this()
    def this(rawParams: Unit, queryEncoder: typings.angularHttp.urlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http/src", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http/src", "XHRBackend")
  @js.native
  class XHRBackend protected ()
    extends typings.angularHttp.xhrBackendMod.XHRBackend {
    def this(
      _browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr,
      _baseResponseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typings.angularHttp.interfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http/src", "XHRConnection")
  @js.native
  class XHRConnection protected ()
    extends typings.angularHttp.xhrBackendMod.XHRConnection {
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
  
  @JSImport("@angular/http/src", "XSRFStrategy")
  @js.native
  abstract class XSRFStrategy ()
    extends typings.angularHttp.interfacesMod.XSRFStrategy
}
