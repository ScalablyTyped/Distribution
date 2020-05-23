package typings.angularHttp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/browser_jsonp", JSImport.Namespace)
@js.native
object browserJsonpMod extends js.Object {
  @js.native
  class BrowserJsonp () extends js.Object {
    def build(url: String): js.Any = js.native
    def cleanup(node: js.Any): Unit = js.native
    def exposeConnection(id: String, connection: js.Any): Unit = js.native
    def nextRequestID(): String = js.native
    def removeConnection(id: String): Unit = js.native
    def requestCallback(id: String): String = js.native
    def send(node: js.Any): Unit = js.native
  }
  
  val JSONP_HOME: /* "__ng_jsonp__" */ String = js.native
}

