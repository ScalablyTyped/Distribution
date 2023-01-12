package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastUpdateStatus extends StObject {
  
  /**
    * If the update wasn't successful, indicates the reason why it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * A value that indicates whether the update was made successful.
    */
  var Status: LastUpdateStatusValue
}
object LastUpdateStatus {
  
  inline def apply(Status: LastUpdateStatusValue): LastUpdateStatus = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastUpdateStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastUpdateStatus] (val x: Self) extends AnyVal {
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setStatus(value: LastUpdateStatusValue): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
