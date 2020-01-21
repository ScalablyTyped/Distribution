package typings.angularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpXhrBackend")
@js.native
class HttpXhrBackend protected () extends HttpBackend {
  def this(xhrFactory: XhrFactory) = this()
  var xhrFactory: js.Any = js.native
}

