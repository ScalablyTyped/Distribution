package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePeriod extends StObject {
  
  /**
    * The end date for a budget. If you didn't specify an end date, Amazon Web Services set your end date to 06/15/87 00:00 UTC. The defaults are the same for the Billing and Cost Management console and the API. After the end date, Amazon Web Services deletes the budget and all the associated notifications and subscribers. You can change your end date with the UpdateBudget operation.
    */
  var End: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start date for a budget. If you created your budget and didn't specify a start date, Amazon Web Services defaults to the start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your budget on January 24, 2018, chose DAILY, and didn't set a start date, Amazon Web Services set your start date to 01/24/18 00:00 UTC. If you chose MONTHLY, Amazon Web Services set your start date to 01/01/18 00:00 UTC. The defaults are the same for the Billing and Cost Management console and the API. You can change your start date with the UpdateBudget operation.
    */
  var Start: js.UndefOr[js.Date] = js.undefined
}
object TimePeriod {
  
  inline def apply(): TimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePeriod]
  }
  
  extension [Self <: TimePeriod](x: Self) {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
