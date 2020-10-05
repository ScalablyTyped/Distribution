package typings.angularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "JsonpClientBackend")
@js.native
class JsonpClientBackend protected () extends HttpBackend {
  def this(callbackMap: ɵangularPackagesCommonHttpHttpB, document: js.Any) = this()
  var callbackMap: js.Any = js.native
  var document: js.Any = js.native
  /**
    * Get the name of the next callback method, by incrementing the global `nextRequestId`.
    */
  var nextCallback: js.Any = js.native
}

