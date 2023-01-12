package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchItemError extends StObject {
  
  /**
    * The error code associated with the batch request error.
    */
  var Code: js.UndefOr[BatchItemErrorCode] = js.undefined
  
  /**
    * A message with the reason for the batch request error.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object BatchItemError {
  
  inline def apply(): BatchItemError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchItemError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchItemError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: BatchItemErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
