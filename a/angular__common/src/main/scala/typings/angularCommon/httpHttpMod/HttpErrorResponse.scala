package typings.angularCommon.httpHttpMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpErrorResponse")
@js.native
class HttpErrorResponse protected ()
  extends HttpResponseBase
     with Error {
  def this(init: typings.angularCommon.anon.Error) = this()
  val error: js.Any | Null = js.native
}

