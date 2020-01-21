package typings.angularHttp.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/public_api", "XHRConnection")
@js.native
class XHRConnection protected ()
  extends typings.angularHttp.srcMod.XHRConnection {
  def this(
    req: typings.angularHttp.staticRequestMod.Request,
    browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr
  ) = this()
  def this(
    req: typings.angularHttp.staticRequestMod.Request,
    browserXHR: typings.angularHttp.browserXhrMod.BrowserXhr,
    baseResponseOptions: typings.angularHttp.baseResponseOptionsMod.ResponseOptions
  ) = this()
}

