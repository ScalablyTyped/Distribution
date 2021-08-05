package typings.angularHttp

import typings.angularHttp.baseRequestOptionsMod.RequestOptions
import typings.angularHttp.httpMod.Http
import typings.angularHttp.httpMod.Jsonp
import typings.angularHttp.jsonpBackendMod.JSONPBackend
import typings.angularHttp.xhrBackendMod.CookieXSRFStrategy
import typings.angularHttp.xhrBackendMod.XHRBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpModuleMod {
  
  @JSImport("@angular/http/src/http_module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/http/src/http_module", "HttpModule")
  @js.native
  class HttpModule () extends StObject
  
  @JSImport("@angular/http/src/http_module", "JsonpModule")
  @js.native
  class JsonpModule () extends StObject
  
  inline def createDefaultCookieXSRFStrategy(): CookieXSRFStrategy = ^.asInstanceOf[js.Dynamic].applyDynamic("_createDefaultCookieXSRFStrategy")().asInstanceOf[CookieXSRFStrategy]
  
  inline def httpFactory(xhrBackend: XHRBackend, requestOptions: RequestOptions): Http = (^.asInstanceOf[js.Dynamic].applyDynamic("httpFactory")(xhrBackend.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[Http]
  
  inline def jsonpFactory(jsonpBackend: JSONPBackend, requestOptions: RequestOptions): Jsonp = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonpFactory")(jsonpBackend.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[Jsonp]
}
