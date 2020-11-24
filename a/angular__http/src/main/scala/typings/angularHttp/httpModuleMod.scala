package typings.angularHttp

import typings.angularHttp.baseRequestOptionsMod.RequestOptions
import typings.angularHttp.httpMod.Http
import typings.angularHttp.httpMod.Jsonp
import typings.angularHttp.jsonpBackendMod.JSONPBackend
import typings.angularHttp.xhrBackendMod.CookieXSRFStrategy
import typings.angularHttp.xhrBackendMod.XHRBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/http_module", JSImport.Namespace)
@js.native
object httpModuleMod extends js.Object {
  
  @JSName("_createDefaultCookieXSRFStrategy")
  def createDefaultCookieXSRFStrategy(): CookieXSRFStrategy = js.native
  
  def httpFactory(xhrBackend: XHRBackend, requestOptions: RequestOptions): Http = js.native
  
  def jsonpFactory(jsonpBackend: JSONPBackend, requestOptions: RequestOptions): Jsonp = js.native
  
  @js.native
  class HttpModule () extends js.Object
  
  @js.native
  class JsonpModule () extends js.Object
}
