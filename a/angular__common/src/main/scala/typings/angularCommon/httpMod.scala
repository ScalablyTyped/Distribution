package typings.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.DELETE
import typings.angularCommon.angularCommonStrings.GET
import typings.angularCommon.angularCommonStrings.HEAD
import typings.angularCommon.angularCommonStrings.JSONP
import typings.angularCommon.angularCommonStrings.OPTIONS
import typings.angularCommon.angularCommonStrings.PATCH
import typings.angularCommon.angularCommonStrings.POST
import typings.angularCommon.angularCommonStrings.PUT
import typings.angularCommon.anon.Body
import typings.angularCommon.anon.CookieName
import typings.angularCommon.anon.Error
import typings.angularCommon.anon.Headers
import typings.angularCommon.anon.Params
import typings.angularCommon.httpHttpMod.HttpInterceptor
import typings.angularCommon.httpHttpMod.HttpParamsOptions
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Injector
import typings.angularCore.mod.ModuleWithProviders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("@angular/common/http", "HTTP_INTERCEPTORS")
  @js.native
  val HTTP_INTERCEPTORS: InjectionToken[js.Array[HttpInterceptor]] = js.native
  
  @JSImport("@angular/common/http", "HttpBackend")
  @js.native
  abstract class HttpBackend ()
    extends typings.angularCommon.httpHttpMod.HttpBackend
  
  @JSImport("@angular/common/http", "HttpClient")
  @js.native
  class HttpClient protected ()
    extends typings.angularCommon.httpHttpMod.HttpClient {
    def this(handler: typings.angularCommon.httpHttpMod.HttpHandler) = this()
  }
  
  @JSImport("@angular/common/http", "HttpClientJsonpModule")
  @js.native
  class HttpClientJsonpModule ()
    extends typings.angularCommon.httpHttpMod.HttpClientJsonpModule
  
  @JSImport("@angular/common/http", "HttpClientModule")
  @js.native
  class HttpClientModule ()
    extends typings.angularCommon.httpHttpMod.HttpClientModule
  
  @JSImport("@angular/common/http", "HttpClientXsrfModule")
  @js.native
  class HttpClientXsrfModule ()
    extends typings.angularCommon.httpHttpMod.HttpClientXsrfModule
  /* static members */
  object HttpClientXsrfModule {
    
    /**
      * Disable the default XSRF protection.
      */
    @JSImport("@angular/common/http", "HttpClientXsrfModule.disable")
    @js.native
    def disable(): ModuleWithProviders[typings.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
    
    /**
      * Configure XSRF protection.
      * @param options An object that can specify either or both
      * cookie name or header name.
      * - Cookie name default is `XSRF-TOKEN`.
      * - Header name default is `X-XSRF-TOKEN`.
      *
      */
    @JSImport("@angular/common/http", "HttpClientXsrfModule.withOptions")
    @js.native
    def withOptions(): ModuleWithProviders[typings.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
    @JSImport("@angular/common/http", "HttpClientXsrfModule.withOptions")
    @js.native
    def withOptions(options: CookieName): ModuleWithProviders[typings.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
  }
  
  @JSImport("@angular/common/http", "HttpErrorResponse")
  @js.native
  class HttpErrorResponse protected ()
    extends typings.angularCommon.httpHttpMod.HttpErrorResponse {
    def this(init: Error) = this()
  }
  
  @JSImport("@angular/common/http", "HttpEventType")
  @js.native
  object HttpEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCommon.httpHttpMod.HttpEventType with Double] = js.native
    
    /* 3 */ val DownloadProgress: typings.angularCommon.httpHttpMod.HttpEventType.DownloadProgress with Double = js.native
    
    /* 4 */ val Response: typings.angularCommon.httpHttpMod.HttpEventType.Response with Double = js.native
    
    /* 2 */ val ResponseHeader: typings.angularCommon.httpHttpMod.HttpEventType.ResponseHeader with Double = js.native
    
    /* 0 */ val Sent: typings.angularCommon.httpHttpMod.HttpEventType.Sent with Double = js.native
    
    /* 1 */ val UploadProgress: typings.angularCommon.httpHttpMod.HttpEventType.UploadProgress with Double = js.native
    
    /* 5 */ val User: typings.angularCommon.httpHttpMod.HttpEventType.User with Double = js.native
  }
  
  @JSImport("@angular/common/http", "HttpHandler")
  @js.native
  abstract class HttpHandler ()
    extends typings.angularCommon.httpHttpMod.HttpHandler
  
  @JSImport("@angular/common/http", "HttpHeaderResponse")
  @js.native
  /**
    * Create a new `HttpHeaderResponse` with the given parameters.
    */
  class HttpHeaderResponse ()
    extends typings.angularCommon.httpHttpMod.HttpHeaderResponse {
    def this(init: Headers) = this()
  }
  
  @JSImport("@angular/common/http", "HttpHeaders")
  @js.native
  /**  Constructs a new HTTP header object with the given values.*/
  class HttpHeaders ()
    extends typings.angularCommon.httpHttpMod.HttpHeaders {
    def this(headers: String) = this()
    def this(headers: StringDictionary[String | js.Array[String]]) = this()
  }
  
  @JSImport("@angular/common/http", "HttpParams")
  @js.native
  class HttpParams ()
    extends typings.angularCommon.httpHttpMod.HttpParams {
    def this(options: HttpParamsOptions) = this()
  }
  
  @JSImport("@angular/common/http", "HttpRequest")
  @js.native
  class HttpRequest[T] protected ()
    extends typings.angularCommon.httpHttpMod.HttpRequest[T] {
    def this(method: String, url: String) = this()
    def this(method: DELETE, url: String) = this()
    def this(method: GET, url: String) = this()
    def this(method: HEAD, url: String) = this()
    def this(method: JSONP, url: String) = this()
    def this(method: OPTIONS, url: String) = this()
    def this(method: PATCH, url: String) = this()
    def this(method: POST, url: String) = this()
    def this(method: PUT, url: String) = this()
    def this(method: String, url: String, body: T) = this()
    def this(method: DELETE, url: String, init: Params) = this()
    def this(method: GET, url: String, init: Params) = this()
    def this(method: HEAD, url: String, init: Params) = this()
    def this(method: JSONP, url: String, init: Params) = this()
    def this(method: OPTIONS, url: String, init: Params) = this()
    def this(method: PATCH, url: String, body: T) = this()
    def this(method: POST, url: String, body: T) = this()
    def this(method: PUT, url: String, body: T) = this()
    def this(method: String, url: String, body: T, init: Params) = this()
    def this(method: String, url: String, body: Null, init: Params) = this()
    def this(method: PATCH, url: String, body: T, init: Params) = this()
    def this(method: PATCH, url: String, body: Null, init: Params) = this()
    def this(method: POST, url: String, body: T, init: Params) = this()
    def this(method: POST, url: String, body: Null, init: Params) = this()
    def this(method: PUT, url: String, body: T, init: Params) = this()
    def this(method: PUT, url: String, body: Null, init: Params) = this()
  }
  
  @JSImport("@angular/common/http", "HttpResponse")
  @js.native
  /**
    * Construct a new `HttpResponse`.
    */
  class HttpResponse[T] ()
    extends typings.angularCommon.httpHttpMod.HttpResponse[T] {
    def this(init: Body[T]) = this()
  }
  
  @JSImport("@angular/common/http", "HttpResponseBase")
  @js.native
  abstract class HttpResponseBase protected ()
    extends typings.angularCommon.httpHttpMod.HttpResponseBase {
    /**
      * Super-constructor for all responses.
      *
      * The single parameter accepted is an initialization hash. Any properties
      * of the response passed there will override the default values.
      */
    def this(init: Headers) = this()
    def this(init: Headers, defaultStatus: Double) = this()
    def this(init: Headers, defaultStatus: js.UndefOr[scala.Nothing], defaultStatusText: String) = this()
    def this(init: Headers, defaultStatus: Double, defaultStatusText: String) = this()
  }
  
  @JSImport("@angular/common/http", "HttpUrlEncodingCodec")
  @js.native
  class HttpUrlEncodingCodec ()
    extends typings.angularCommon.httpHttpMod.HttpUrlEncodingCodec
  
  @JSImport("@angular/common/http", "HttpXhrBackend")
  @js.native
  class HttpXhrBackend protected ()
    extends typings.angularCommon.httpHttpMod.HttpXhrBackend {
    def this(xhrFactory: typings.angularCommon.httpHttpMod.XhrFactory) = this()
  }
  
  @JSImport("@angular/common/http", "HttpXsrfTokenExtractor")
  @js.native
  abstract class HttpXsrfTokenExtractor ()
    extends typings.angularCommon.httpHttpMod.HttpXsrfTokenExtractor
  
  @JSImport("@angular/common/http", "JsonpClientBackend")
  @js.native
  class JsonpClientBackend protected ()
    extends typings.angularCommon.httpHttpMod.JsonpClientBackend {
    def this(callbackMap: typings.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpB, document: js.Any) = this()
  }
  
  @JSImport("@angular/common/http", "JsonpInterceptor")
  @js.native
  class JsonpInterceptor protected ()
    extends typings.angularCommon.httpHttpMod.JsonpInterceptor {
    def this(jsonp: typings.angularCommon.httpHttpMod.JsonpClientBackend) = this()
  }
  
  @JSImport("@angular/common/http", "XhrFactory")
  @js.native
  abstract class XhrFactory ()
    extends typings.angularCommon.httpHttpMod.XhrFactory
  
  @JSImport("@angular/common/http", "\u0275HttpInterceptingHandler")
  @js.native
  class ɵHttpInterceptingHandler protected ()
    extends typings.angularCommon.httpHttpMod.ɵHttpInterceptingHandler {
    def this(backend: typings.angularCommon.httpHttpMod.HttpBackend, injector: Injector) = this()
  }
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_a")
  @js.native
  class ɵangularPackagesCommonHttpHttpA ()
    extends typings.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpA
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_b")
  @js.native
  abstract class ɵangularPackagesCommonHttpHttpB ()
    extends typings.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpB
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_c")
  @js.native
  def ɵangularPackagesCommonHttpHttpC(): js.Object = js.native
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_d")
  @js.native
  class ɵangularPackagesCommonHttpHttpD ()
    extends typings.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpD
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_e")
  @js.native
  val ɵangularPackagesCommonHttpHttpE: InjectionToken[String] = js.native
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_f")
  @js.native
  val ɵangularPackagesCommonHttpHttpF: InjectionToken[String] = js.native
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_g")
  @js.native
  class ɵangularPackagesCommonHttpHttpG protected ()
    extends typings.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpG {
    def this(doc: js.Any, platform: String, cookieName: String) = this()
  }
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_h")
  @js.native
  class ɵangularPackagesCommonHttpHttpH protected ()
    extends typings.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpH {
    def this(tokenService: typings.angularCommon.httpHttpMod.HttpXsrfTokenExtractor, headerName: String) = this()
  }
}
