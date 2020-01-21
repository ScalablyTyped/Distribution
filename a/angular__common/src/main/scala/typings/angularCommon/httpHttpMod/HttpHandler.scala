package typings.angularCommon.httpHttpMod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpHandler")
@js.native
abstract class HttpHandler () extends js.Object {
  def handle(req: HttpRequest[_]): Observable_[HttpEvent[_]] = js.native
}

