package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkerBlockRequest extends StObject {
  
  /**
    * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your Workers. The Worker does not see this message.
    */
  var Reason: String
  
  /**
    * The ID of the Worker to block.
    */
  var WorkerId: CustomerId
}
object CreateWorkerBlockRequest {
  
  inline def apply(Reason: String, WorkerId: CustomerId): CreateWorkerBlockRequest = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkerBlockRequest]
  }
  
  extension [Self <: CreateWorkerBlockRequest](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
  }
}
