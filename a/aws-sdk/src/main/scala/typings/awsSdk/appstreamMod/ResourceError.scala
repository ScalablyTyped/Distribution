package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The time the error occurred.
    */
  var ErrorTimestamp: js.UndefOr[Timestamp] = js.undefined
}
object ResourceError {
  
  @scala.inline
  def apply(): ResourceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceError]
  }
  
  @scala.inline
  implicit class ResourceErrorMutableBuilder[Self <: ResourceError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: FleetErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setErrorTimestamp(value: Timestamp): Self = StObject.set(x, "ErrorTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTimestampUndefined: Self = StObject.set(x, "ErrorTimestamp", js.undefined)
  }
}
