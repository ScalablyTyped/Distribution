package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutMessageErrorEntry extends StObject {
  
  /**
    * The error code.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * A message that describes the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The ID of the message that caused the error. (See the value corresponding to the "messageId" key in the "message" object.)
    */
  var messageId: js.UndefOr[MessageId] = js.undefined
}
object BatchPutMessageErrorEntry {
  
  inline def apply(): BatchPutMessageErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutMessageErrorEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchPutMessageErrorEntry] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
  }
}
