package typings.angularCommon.httpHttpMod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpHandler")
@js.native
abstract class HttpHandler () extends StObject {
  
  def handle(req: HttpRequest[_]): Observable_[HttpEvent[_]] = js.native
}
