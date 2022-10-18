package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSavingsPlanResponse extends StObject {
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.undefined
}
object CreateSavingsPlanResponse {
  
  inline def apply(): CreateSavingsPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSavingsPlanResponse]
  }
  
  extension [Self <: CreateSavingsPlanResponse](x: Self) {
    
    inline def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanIdUndefined: Self = StObject.set(x, "savingsPlanId", js.undefined)
  }
}
