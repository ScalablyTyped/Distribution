package typings
package atAngularHttpLib.srcHttpUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/http_module", JSImport.Namespace)
@js.native
object srcHttpUnderscoreModuleModMembers extends js.Object {
  def _createDefaultCookieXSRFStrategy(): atAngularHttpLib.srcBackendsXhrUnderscoreBackendMod.CookieXSRFStrategy = js.native
  def httpFactory(
    xhrBackend: atAngularHttpLib.srcBackendsXhrUnderscoreBackendMod.XHRBackend,
    requestOptions: atAngularHttpLib.srcBaseUnderscoreRequestUnderscoreOptionsMod.RequestOptions
  ): atAngularHttpLib.srcHttpMod.Http = js.native
  def jsonpFactory(
    jsonpBackend: atAngularHttpLib.srcBackendsJsonpUnderscoreBackendMod.JSONPBackend,
    requestOptions: atAngularHttpLib.srcBaseUnderscoreRequestUnderscoreOptionsMod.RequestOptions
  ): atAngularHttpLib.srcHttpMod.Jsonp = js.native
}

