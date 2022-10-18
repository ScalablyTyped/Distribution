package typings.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.Version
import typings.angularHttp.srcInterfacesMod.RequestArgs
import typings.angularHttp.srcInterfacesMod.RequestOptionsArgs
import typings.angularHttp.srcInterfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicApiMod {
  
  @JSImport("@angular/http/public_api", "BaseRequestOptions")
  @js.native
  open class BaseRequestOptions ()
    extends typings.angularHttp.srcMod.BaseRequestOptions
  
  @JSImport("@angular/http/public_api", "BaseResponseOptions")
  @js.native
  open class BaseResponseOptions ()
    extends typings.angularHttp.srcMod.BaseResponseOptions
  
  @JSImport("@angular/http/public_api", "BrowserXhr")
  @js.native
  open class BrowserXhr ()
    extends typings.angularHttp.srcMod.BrowserXhr
  
  /* note: abstract class */ @JSImport("@angular/http/public_api", "Connection")
  @js.native
  open class Connection ()
    extends typings.angularHttp.srcMod.Connection
  
  /* note: abstract class */ @JSImport("@angular/http/public_api", "ConnectionBackend")
  @js.native
  open class ConnectionBackend ()
    extends typings.angularHttp.srcMod.ConnectionBackend
  
  @JSImport("@angular/http/public_api", "CookieXSRFStrategy")
  @js.native
  open class CookieXSRFStrategy ()
    extends typings.angularHttp.srcMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
  }
  
  @JSImport("@angular/http/public_api", "Headers")
  @js.native
  open class Headers ()
    extends typings.angularHttp.srcMod.Headers {
    def this(headers: StringDictionary[Any]) = this()
    def this(headers: typings.angularHttp.srcHeadersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    @JSImport("@angular/http/public_api", "Headers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    inline def fromResponseHeaderString(headersString: String): typings.angularHttp.srcHeadersMod.Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseHeaderString")(headersString.asInstanceOf[js.Any]).asInstanceOf[typings.angularHttp.srcHeadersMod.Headers]
  }
  
  @JSImport("@angular/http/public_api", "Http")
  @js.native
  open class Http protected ()
    extends typings.angularHttp.srcMod.Http {
    def this(
      _backend: typings.angularHttp.srcInterfacesMod.ConnectionBackend,
      _defaultOptions: typings.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "HttpModule")
  @js.native
  open class HttpModule ()
    extends typings.angularHttp.srcMod.HttpModule
  
  @JSImport("@angular/http/public_api", "JSONPBackend")
  @js.native
  open class JSONPBackend ()
    extends typings.angularHttp.srcMod.JSONPBackend
  
  @JSImport("@angular/http/public_api", "JSONPConnection")
  @js.native
  open class JSONPConnection ()
    extends typings.angularHttp.srcMod.JSONPConnection
  
  @JSImport("@angular/http/public_api", "Jsonp")
  @js.native
  open class Jsonp protected ()
    extends typings.angularHttp.srcMod.Jsonp {
    def this(
      backend: typings.angularHttp.srcInterfacesMod.ConnectionBackend,
      defaultOptions: typings.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "JsonpModule")
  @js.native
  open class JsonpModule ()
    extends typings.angularHttp.srcMod.JsonpModule
  
  @JSImport("@angular/http/public_api", "QueryEncoder")
  @js.native
  open class QueryEncoder ()
    extends typings.angularHttp.srcMod.QueryEncoder
  
  @JSImport("@angular/http/public_api", "ReadyState")
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
  
  @JSImport("@angular/http/public_api", "Request")
  @js.native
  open class Request protected ()
    extends typings.angularHttp.srcMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "RequestMethod")
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
  
  @JSImport("@angular/http/public_api", "RequestOptions")
  @js.native
  open class RequestOptions ()
    extends typings.angularHttp.srcMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "Response")
  @js.native
  open class Response protected ()
    extends typings.angularHttp.srcMod.Response {
    def this(responseOptions: typings.angularHttp.srcBaseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http/public_api", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularHttp.srcEnumsMod.ResponseContentType & Double] = js.native
    
    /* 2 */ val ArrayBuffer: typings.angularHttp.srcEnumsMod.ResponseContentType.ArrayBuffer & Double = js.native
    
    /* 3 */ val Blob: typings.angularHttp.srcEnumsMod.ResponseContentType.Blob & Double = js.native
    
    /* 1 */ val Json: typings.angularHttp.srcEnumsMod.ResponseContentType.Json & Double = js.native
    
    /* 0 */ val Text: typings.angularHttp.srcEnumsMod.ResponseContentType.Text & Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "ResponseOptions")
  @js.native
  open class ResponseOptions ()
    extends typings.angularHttp.srcMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "ResponseType")
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
  
  @JSImport("@angular/http/public_api", "URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends typings.angularHttp.srcMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(rawParams: String, queryEncoder: typings.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
    def this(rawParams: Unit, queryEncoder: typings.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http/public_api", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http/public_api", "XHRBackend")
  @js.native
  open class XHRBackend protected ()
    extends typings.angularHttp.srcMod.XHRBackend {
    def this(
      _browserXHR: typings.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr,
      _baseResponseOptions: typings.angularHttp.srcBaseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typings.angularHttp.srcInterfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "XHRConnection")
  @js.native
  open class XHRConnection protected ()
    extends typings.angularHttp.srcMod.XHRConnection {
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
  
  /* note: abstract class */ @JSImport("@angular/http/public_api", "XSRFStrategy")
  @js.native
  open class XSRFStrategy ()
    extends typings.angularHttp.srcMod.XSRFStrategy
}
