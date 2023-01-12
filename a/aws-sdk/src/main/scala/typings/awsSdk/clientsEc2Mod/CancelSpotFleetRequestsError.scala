package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSpotFleetRequestsError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[CancelBatchErrorCode] = js.undefined
  
  /**
    * The description for the error code.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object CancelSpotFleetRequestsError {
  
  inline def apply(): CancelSpotFleetRequestsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelSpotFleetRequestsError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CancelBatchErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
