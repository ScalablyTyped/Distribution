package typings.atAngularCommon.httpHttpMod

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpHandler")
@js.native
abstract class HttpHandler () extends js.Object {
  def handle(req: HttpRequest[_]): Observable[HttpEvent[_]] = js.native
}

