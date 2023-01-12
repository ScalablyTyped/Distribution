package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueuedSavingsPlanRequest extends StObject {
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: SavingsPlanId
}
object DeleteQueuedSavingsPlanRequest {
  
  inline def apply(savingsPlanId: SavingsPlanId): DeleteQueuedSavingsPlanRequest = {
    val __obj = js.Dynamic.literal(savingsPlanId = savingsPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueuedSavingsPlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteQueuedSavingsPlanRequest] (val x: Self) extends AnyVal {
    
    inline def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
  }
}
