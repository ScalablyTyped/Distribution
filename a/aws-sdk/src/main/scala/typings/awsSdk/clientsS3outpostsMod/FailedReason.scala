package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedReason extends StObject {
  
  /**
    * The failure code, if any, for a create or delete endpoint operation.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.ErrorCode] = js.undefined
  
  /**
    * Additional error details describing the endpoint failure and recommended action.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.Message] = js.undefined
}
object FailedReason {
  
  inline def apply(): FailedReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedReason] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
