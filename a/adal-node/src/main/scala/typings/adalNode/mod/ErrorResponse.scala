package typings.adalNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorResponse extends js.Object {
  
  var error: String = js.native
  
  var errorDescription: String = js.native
}
object ErrorResponse {
  
  @scala.inline
  def apply(error: String, errorDescription: String): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorDescription = errorDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
  
  @scala.inline
  implicit class ErrorResponseOps[Self <: ErrorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDescription(value: String): Self = this.set("errorDescription", value.asInstanceOf[js.Any])
  }
}
