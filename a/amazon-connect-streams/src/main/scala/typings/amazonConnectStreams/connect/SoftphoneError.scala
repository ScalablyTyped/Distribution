package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftphoneError extends StObject {
  
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
  implicit class SoftphoneErrorMutableBuilder[Self <: SoftphoneError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPointUrl(value: String): Self = StObject.set(x, "endPointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEndPointUrl(value: () => String): Self = StObject.set(x, "getEndPointUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorMessage(value: () => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorType(value: () => String): Self = StObject.set(x, "getErrorType", js.Any.fromFunction0(value))
  }
}
