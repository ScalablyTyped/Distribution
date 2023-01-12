package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueuedReservedInstancesResult extends StObject {
  
  /**
    * Information about the queued purchases that could not be deleted.
    */
  var FailedQueuedPurchaseDeletions: js.UndefOr[FailedQueuedPurchaseDeletionSet] = js.undefined
  
  /**
    * Information about the queued purchases that were successfully deleted.
    */
  var SuccessfulQueuedPurchaseDeletions: js.UndefOr[SuccessfulQueuedPurchaseDeletionSet] = js.undefined
}
object DeleteQueuedReservedInstancesResult {
  
  inline def apply(): DeleteQueuedReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueuedReservedInstancesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteQueuedReservedInstancesResult] (val x: Self) extends AnyVal {
    
    inline def setFailedQueuedPurchaseDeletions(value: FailedQueuedPurchaseDeletionSet): Self = StObject.set(x, "FailedQueuedPurchaseDeletions", value.asInstanceOf[js.Any])
    
    inline def setFailedQueuedPurchaseDeletionsUndefined: Self = StObject.set(x, "FailedQueuedPurchaseDeletions", js.undefined)
    
    inline def setFailedQueuedPurchaseDeletionsVarargs(value: FailedQueuedPurchaseDeletion*): Self = StObject.set(x, "FailedQueuedPurchaseDeletions", js.Array(value*))
    
    inline def setSuccessfulQueuedPurchaseDeletions(value: SuccessfulQueuedPurchaseDeletionSet): Self = StObject.set(x, "SuccessfulQueuedPurchaseDeletions", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulQueuedPurchaseDeletionsUndefined: Self = StObject.set(x, "SuccessfulQueuedPurchaseDeletions", js.undefined)
    
    inline def setSuccessfulQueuedPurchaseDeletionsVarargs(value: SuccessfulQueuedPurchaseDeletion*): Self = StObject.set(x, "SuccessfulQueuedPurchaseDeletions", js.Array(value*))
  }
}
