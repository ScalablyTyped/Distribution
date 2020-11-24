package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftphoneError extends js.Object {
  
  val endPointUrl: String = js.native
  
  val errorMessage: String = js.native
  
  val errorType: String = js.native
  
  def getEndPointUrl(): String = js.native
  
  def getErrorMessage(): String = js.native
  
  def getErrorType(): String = js.native
}
object SoftphoneError {
  
  @scala.inline
  def apply(
    endPointUrl: String,
    errorMessage: String,
    errorType: String,
    getEndPointUrl: () => String,
    getErrorMessage: () => String,
    getErrorType: () => String
  ): SoftphoneError = {
    val __obj = js.Dynamic.literal(endPointUrl = endPointUrl.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], getEndPointUrl = js.Any.fromFunction0(getEndPointUrl), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getErrorType = js.Any.fromFunction0(getErrorType))
    __obj.asInstanceOf[SoftphoneError]
  }
  
  @scala.inline
  implicit class SoftphoneErrorOps[Self <: SoftphoneError] (val x: Self) extends AnyVal {
    
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
    def setEndPointUrl(value: String): Self = this.set("endPointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEndPointUrl(value: () => String): Self = this.set("getEndPointUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorMessage(value: () => String): Self = this.set("getErrorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorType(value: () => String): Self = this.set("getErrorType", js.Any.fromFunction0(value))
  }
}
