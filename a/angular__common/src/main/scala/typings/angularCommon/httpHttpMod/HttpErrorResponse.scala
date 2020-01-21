package typings.angularCommon.httpHttpMod

import typings.angularCommon.AnonError
import typings.angularCommon.angularCommonBooleans.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpErrorResponse")
@js.native
class HttpErrorResponse protected ()
  extends HttpResponseBase
     with Error {
  def this(init: AnonError) = this()
  val error: js.Any | Null = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  val name_HttpErrorResponse: typings.angularCommon.angularCommonStrings.HttpErrorResponse = js.native
  /**
    * Errors are never okay, even when the status code is in the 2xx success range.
    */
  @JSName("ok")
  val ok_HttpErrorResponse: `false` = js.native
}

