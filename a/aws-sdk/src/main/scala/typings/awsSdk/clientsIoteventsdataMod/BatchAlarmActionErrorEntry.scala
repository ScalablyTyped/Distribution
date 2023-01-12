package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAlarmActionErrorEntry extends StObject {
  
  /**
    * The error code.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * A message that describes the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The request ID. Each ID must be unique within each batch.
    */
  var requestId: js.UndefOr[RequestId] = js.undefined
}
object BatchAlarmActionErrorEntry {
  
  inline def apply(): BatchAlarmActionErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAlarmActionErrorEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchAlarmActionErrorEntry] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
