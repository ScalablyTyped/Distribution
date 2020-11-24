package typings.angularHttp.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/public_api", "XHRBackend")
@js.native
class XHRBackend protected ()
  extends typings.angularHttp.srcMod.XHRBackend {
  def this(
    _browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr,
    _baseResponseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions,
    _xsrfStrategy: typings.angularHttp.interfacesMod.XSRFStrategy
  ) = this()
}
