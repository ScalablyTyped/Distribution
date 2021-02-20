package typings.angularHttp

import typings.angularHttp.baseRequestOptionsMod.RequestOptions
import typings.angularHttp.httpMod.Http
import typings.angularHttp.httpMod.Jsonp
import typings.angularHttp.jsonpBackendMod.JSONPBackend
import typings.angularHttp.xhrBackendMod.CookieXSRFStrategy
import typings.angularHttp.xhrBackendMod.XHRBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpModuleMod {
  
  @JSImport("@angular/http/src/http_module", "HttpModule")
  @js.native
  class HttpModule () extends StObject
  
  @JSImport("@angular/http/src/http_module", "JsonpModule")
  @js.native
  class JsonpModule () extends StObject
  
  @JSImport("@angular/http/src/http_module", "_createDefaultCookieXSRFStrategy")
  @js.native
  def createDefaultCookieXSRFStrategy(): CookieXSRFStrategy = js.native
  
  @JSImport("@angular/http/src/http_module", "httpFactory")
  @js.native
  def httpFactory(xhrBackend: XHRBackend, requestOptions: RequestOptions): Http = js.native
  
  @JSImport("@angular/http/src/http_module", "jsonpFactory")
  @js.native
  def jsonpFactory(jsonpBackend: JSONPBackend, requestOptions: RequestOptions): Jsonp = js.native
}
