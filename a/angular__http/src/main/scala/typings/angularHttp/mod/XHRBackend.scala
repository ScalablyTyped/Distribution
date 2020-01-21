package typings.angularHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http", "XHRBackend")
@js.native
class XHRBackend protected ()
  extends typings.angularHttp.publicApiMod.XHRBackend {
  def this(
    _browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr,
    _baseResponseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions,
    _xsrfStrategy: typings.angularHttp.interfacesMod.XSRFStrategy
  ) = this()
}

