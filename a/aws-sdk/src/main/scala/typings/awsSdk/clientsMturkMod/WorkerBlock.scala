package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerBlock extends StObject {
  
  /**
    *  A message explaining the reason the Worker was blocked. 
    */
  var Reason: js.UndefOr[String] = js.undefined
  
  /**
    *  The ID of the Worker who accepted the HIT.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
}
object WorkerBlock {
  
  inline def apply(): WorkerBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerBlock]
  }
  
  extension [Self <: WorkerBlock](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
