package typings
package atAngularHttpLib.srcBackendsJsonpUnderscoreBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/jsonp_backend", "JSONPConnection")
@js.native
class JSONPConnection ()
  extends atAngularHttpLib.srcInterfacesMod.Connection {
  var _dom: js.Any = js.native
  var _finished: js.Any = js.native
  var _id: js.Any = js.native
  var _responseData: js.Any = js.native
  var _script: js.Any = js.native
  var baseResponseOptions: js.UndefOr[js.Any] = js.native
  /**
       * An observable that completes with the response, when the request is finished.
       */
  @JSName("response")
  var response_JSONPConnection: rxjsLib.rxjsMod.Observable[atAngularHttpLib.srcStaticUnderscoreResponseMod.Response] = js.native
  /**
       * Callback called when the JSONP request completes, to notify the application
       * of the new data.
       */
  def finished(): scala.Unit = js.native
  /**
       * Callback called when the JSONP request completes, to notify the application
       * of the new data.
       */
  def finished(data: js.Any): scala.Unit = js.native
}

