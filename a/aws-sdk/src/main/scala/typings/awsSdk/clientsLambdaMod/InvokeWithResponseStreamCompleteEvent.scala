package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeWithResponseStreamCompleteEvent extends StObject {
  
  /**
    * An error code.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The details of any returned error.
    */
  var ErrorDetails: js.UndefOr[String] = js.undefined
  
  /**
    * The last 4 KB of the execution log, which is base64-encoded.
    */
  var LogResult: js.UndefOr[String] = js.undefined
}
object InvokeWithResponseStreamCompleteEvent {
  
  inline def apply(): InvokeWithResponseStreamCompleteEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeWithResponseStreamCompleteEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeWithResponseStreamCompleteEvent] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorDetails(value: String): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setLogResult(value: String): Self = StObject.set(x, "LogResult", value.asInstanceOf[js.Any])
    
    inline def setLogResultUndefined: Self = StObject.set(x, "LogResult", js.undefined)
  }
}
