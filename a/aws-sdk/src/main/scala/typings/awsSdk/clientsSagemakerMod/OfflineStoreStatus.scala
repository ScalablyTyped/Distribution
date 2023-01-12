package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineStoreStatus extends StObject {
  
  /**
    * The justification for why the OfflineStoreStatus is Blocked (if applicable).
    */
  var BlockedReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BlockedReason] = js.undefined
  
  /**
    * An OfflineStore status.
    */
  var Status: OfflineStoreStatusValue
}
object OfflineStoreStatus {
  
  inline def apply(Status: OfflineStoreStatusValue): OfflineStoreStatus = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineStoreStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfflineStoreStatus] (val x: Self) extends AnyVal {
    
    inline def setBlockedReason(value: BlockedReason): Self = StObject.set(x, "BlockedReason", value.asInstanceOf[js.Any])
    
    inline def setBlockedReasonUndefined: Self = StObject.set(x, "BlockedReason", js.undefined)
    
    inline def setStatus(value: OfflineStoreStatusValue): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
