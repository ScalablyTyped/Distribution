package typings.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.Version
import typings.angularHttp.srcInterfacesMod.RequestArgs
import typings.angularHttp.srcInterfacesMod.RequestOptionsArgs
import typings.angularHttp.srcInterfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@angular/http/src", "BaseRequestOptions")
  @js.native
  open class BaseRequestOptions ()
    extends typings.angularHttp.srcBaseRequestOptionsMod.BaseRequestOptions
  
  @JSImport("@angular/http/src", "BaseResponseOptions")
  @js.native
  open class BaseResponseOptions ()
    extends typings.angularHttp.srcBaseResponseOptionsMod.BaseResponseOptions
  
  @JSImport("@angular/http/src", "BrowserXhr")
  @js.native
  open class BrowserXhr ()
    extends typings.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr
  
  /* note: abstract class */ @JSImport("@angular/http/src", "Connection")
  @js.native
  open class Connection ()
    extends typings.angularHttp.srcInterfacesMod.Connection
  
  /* note: abstract class */ @JSImport("@angular/http/src", "ConnectionBackend")
  @js.native
  open class ConnectionBackend ()
    extends typings.angularHttp.srcInterfacesMod.ConnectionBackend
  
  @JSImport("@angular/http/src", "CookieXSRFStrategy")
  @js.native
  open class CookieXSRFStrategy ()
    extends typings.angularHttp.srcBackendsXhrBackendMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
  }
  
  @JSImport("@angular/http/src", "Headers")
  @js.native
  open class Headers ()
    extends typings.angularHttp.srcHeadersMod.Headers {
    def this(headers: StringDictionary[Any]) = this()
    def this(headers: typings.angularHttp.srcHeadersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    @JSImport("@angular/http/src", "Headers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    inline def fromResponseHeaderString(headersString: String): typings.angularHttp.srcHeadersMod.Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseHeaderString")(headersString.asInstanceOf[js.Any]).asInstanceOf[typings.angularHttp.srcHeadersMod.Headers]
  }
  
  @JSImport("@angular/http/src", "Http")
  @js.native
  open class Http protected ()
    extends typings.angularHttp.srcHttpMod.Http {
    def this(
      _backend: typings.angularHttp.srcInterfacesMod.ConnectionBackend,
      _defaultOptions: typings.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/src", "HttpModule")
  @js.native
  open class HttpModule ()
    extends typings.angularHttp.srcHttpModuleMod.HttpModule
  
  @JSImport("@angular/http/src", "JSONPBackend")
  @js.native
  open class JSONPBackend ()
    extends typings.angularHttp.srcBackendsJsonpBackendMod.JSONPBackend
  
  @JSImport("@angular/http/src", "JSONPConnection")
  @js.native
  open class JSONPConnection ()
    extends typings.angularHttp.srcBackendsJsonpBackendMod.JSONPConnection
  
  @JSImport("@angular/http/src", "Jsonp")
  @js.native
  open class Jsonp protected ()
    extends typings.angularHttp.srcHttpMod.Jsonp {
    def this(
      backend: typings.angularHttp.srcInterfacesMod.ConnectionBackend,
      defaultOptions: typings.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/src", "JsonpModule")
  @js.native
  open class JsonpModule ()
    extends typings.angularHttp.srcHttpModuleMod.JsonpModule
  
  @JSImport("@angular/http/src", "QueryEncoder")
  @js.native
  open class QueryEncoder ()
    extends typings.angularHttp.srcUrlSearchParamsMod.QueryEncoder
  
  @JSImport("@angular/http/src", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.srcEnumsMod.ReadyState & Double] = js.native
    
    /* 5 */ val Cancelled: typings.angularHttp.srcEnumsMod.ReadyState.Cancelled & Double = js.native
    
    /* 4 */ val Done: typings.angularHttp.srcEnumsMod.ReadyState.Done & Double = js.native
    
    /* 2 */ val HeadersReceived: typings.angularHttp.srcEnumsMod.ReadyState.HeadersReceived & Double = js.native
    
    /* 3 */ val Loading: typings.angularHttp.srcEnumsMod.ReadyState.Loading & Double = js.native
    
    /* 1 */ val Open: typings.angularHttp.srcEnumsMod.ReadyState.Open & Double = js.native
    
    /* 0 */ val Unsent: typings.angularHttp.srcEnumsMod.ReadyState.Unsent & Double = js.native
  }
  
  @JSImport("@angular/http/src", "Request")
  @js.native
  open class Request protected ()
    extends typings.angularHttp.srcStaticRequestMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http/src", "RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.srcEnumsMod.RequestMethod & Double] = js.native
    
    /* 3 */ val Delete: typings.angularHttp.srcEnumsMod.RequestMethod.Delete & Double = js.native
    
    /* 0 */ val Get: typings.angularHttp.srcEnumsMod.RequestMethod.Get & Double = js.native
    
    /* 5 */ val Head: typings.angularHttp.srcEnumsMod.RequestMethod.Head & Double = js.native
    
    /* 4 */ val Options: typings.angularHttp.srcEnumsMod.RequestMethod.Options & Double = js.native
    
    /* 6 */ val Patch: typings.angularHttp.srcEnumsMod.RequestMethod.Patch & Double = js.native
    
    /* 1 */ val Post: typings.angularHttp.srcEnumsMod.RequestMethod.Post & Double = js.native
    
    /* 2 */ val Put: typings.angularHttp.srcEnumsMod.RequestMethod.Put & Double = js.native
  }
  
  @JSImport("@angular/http/src", "RequestOptions")
  @js.native
  open class RequestOptions ()
    extends typings.angularHttp.srcBaseRequestOptionsMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/src", "Response")
  @js.native
  open class Response protected ()
    extends typings.angularHttp.srcStaticResponseMod.Response {
    def this(responseOptions: typings.angularHttp.srcBaseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http/src", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.srcEnumsMod.ResponseContentType & Double] = js.native
    
    /* 2 */ val ArrayBuffer: typings.angularHttp.srcEnumsMod.ResponseContentType.ArrayBuffer & Double = js.native
    
    /* 3 */ val Blob: typings.angularHttp.srcEnumsMod.ResponseContentType.Blob & Double = js.native
    
    /* 1 */ val Json: typings.angularHttp.srcEnumsMod.ResponseContentType.Json & Double = js.native
    
    /* 0 */ val Text: typings.angularHttp.srcEnumsMod.ResponseContentType.Text & Double = js.native
  }
  
  @JSImport("@angular/http/src", "ResponseOptions")
  @js.native
  open class ResponseOptions ()
    extends typings.angularHttp.srcBaseResponseOptionsMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/src", "ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.srcEnumsMod.ResponseType & Double] = js.native
    
    /* 0 */ val Basic: typings.angularHttp.srcEnumsMod.ResponseType.Basic & Double = js.native
    
    /* 1 */ val Cors: typings.angularHttp.srcEnumsMod.ResponseType.Cors & Double = js.native
    
    /* 2 */ val Default: typings.angularHttp.srcEnumsMod.ResponseType.Default & Double = js.native
    
    /* 3 */ val Error: typings.angularHttp.srcEnumsMod.ResponseType.Error & Double = js.native
    
    /* 4 */ val Opaque: typings.angularHttp.srcEnumsMod.ResponseType.Opaque & Double = js.native
  }
  
  @JSImport("@angular/http/src", "URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends typings.angularHttp.srcUrlSearchParamsMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(rawParams: String, queryEncoder: typings.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
    def this(rawParams: Unit, queryEncoder: typings.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http/src", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http/src", "XHRBackend")
  @js.native
  open class XHRBackend protected ()
    extends typings.angularHttp.srcBackendsXhrBackendMod.XHRBackend {
    def this(
      _browserXHR: typings.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr,
      _baseResponseOptions: typings.angularHttp.srcBaseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typings.angularHttp.srcInterfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http/src", "XHRConnection")
  @js.native
  open class XHRConnection protected ()
    extends typings.angularHttp.srcBackendsXhrBackendMod.XHRConnection {
    def this(
      req: typings.angularHttp.srcStaticRequestMod.Request,
      browserXHR: typings.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr
    ) = this()
    def this(
      req: typings.angularHttp.srcStaticRequestMod.Request,
      browserXHR: typings.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr,
      baseResponseOptions: typings.angularHttp.srcBaseResponseOptionsMod.ResponseOptions
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@angular/http/src", "XSRFStrategy")
  @js.native
  open class XSRFStrategy ()
    extends typings.angularHttp.srcInterfacesMod.XSRFStrategy
}
