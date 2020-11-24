package typings.angularHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http", "XHRConnection")
@js.native
class XHRConnection protected ()
  extends typings.angularHttp.publicApiMod.XHRConnection {
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
