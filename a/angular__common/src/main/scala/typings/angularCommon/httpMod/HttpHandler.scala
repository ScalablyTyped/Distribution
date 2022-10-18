package typings.angularCommon.httpMod

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/common/http", "HttpHandler")
@js.native
open class HttpHandler () extends StObject {
  
  def handle(req: HttpRequest[Any]): Observable_[HttpEvent[Any]] = js.native
}
