package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[FleetErrorCode] = js.native
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
}
object FleetError {
  
  @scala.inline
  def apply(): FleetError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetError]
  }
  
  @scala.inline
  implicit class FleetErrorMutableBuilder[Self <: FleetError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: FleetErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
