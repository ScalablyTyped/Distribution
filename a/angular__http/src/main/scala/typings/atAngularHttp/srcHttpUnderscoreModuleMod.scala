package typings.atAngularHttp

import typings.atAngularHttp.srcBackendsJsonpUnderscoreBackendMod.JSONPBackend
import typings.atAngularHttp.srcBackendsXhrUnderscoreBackendMod.CookieXSRFStrategy
import typings.atAngularHttp.srcBackendsXhrUnderscoreBackendMod.XHRBackend
import typings.atAngularHttp.srcBaseUnderscoreRequestUnderscoreOptionsMod.RequestOptions
import typings.atAngularHttp.srcHttpMod.Http
import typings.atAngularHttp.srcHttpMod.Jsonp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/http_module", JSImport.Namespace)
@js.native
object srcHttpUnderscoreModuleMod extends js.Object {
  @js.native
  class HttpModule () extends js.Object
  
  @js.native
  class JsonpModule () extends js.Object
  
  def _createDefaultCookieXSRFStrategy(): CookieXSRFStrategy = js.native
  def httpFactory(xhrBackend: XHRBackend, requestOptions: RequestOptions): Http = js.native
  def jsonpFactory(jsonpBackend: JSONPBackend, requestOptions: RequestOptions): Jsonp = js.native
}

