package typings.angularCommon.httpHttpMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpErrorResponse")
@js.native
class HttpErrorResponse protected ()
  extends HttpResponseBase
     with Error {
  def this(init: typings.angularCommon.anon.Error) = this()
  val error: js.Any | Null = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

