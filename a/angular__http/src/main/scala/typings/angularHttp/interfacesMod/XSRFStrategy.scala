package typings.angularHttp.interfacesMod

import typings.angularHttp.staticRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/interfaces", "XSRFStrategy")
@js.native
abstract class XSRFStrategy () extends js.Object {
  def configureRequest(req: Request): Unit = js.native
}

