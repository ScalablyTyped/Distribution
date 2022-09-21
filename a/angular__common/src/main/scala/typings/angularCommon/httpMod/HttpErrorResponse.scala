package typings.angularCommon.httpMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpErrorResponse")
@js.native
open class HttpErrorResponse protected ()
  extends HttpResponseBase
     with Error {
  def this(init: typings.angularCommon.anon.Error) = this()
  
  val error: Any | Null = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
