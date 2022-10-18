package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spend extends StObject {
  
  /**
    * The cost or usage amount that's associated with a budget forecast, actual spend, or budget threshold.
    */
  var Amount: NumericValue
  
  /**
    * The unit of measurement that's used for the budget forecast, actual spend, or budget threshold, such as USD or GBP.
    */
  var Unit: UnitValue
}
object Spend {
  
  inline def apply(Amount: NumericValue, Unit: UnitValue): Spend = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spend]
  }
  
  extension [Self <: Spend](x: Self) {
    
    inline def setAmount(value: NumericValue): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: UnitValue): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
  }
}
