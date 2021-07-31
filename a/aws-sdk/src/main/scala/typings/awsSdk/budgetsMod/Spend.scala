package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spend extends StObject {
  
  /**
    * The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
    */
  var Amount: NumericValue
  
  /**
    * The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as dollars or GB.
    */
  var Unit: UnitValue
}
object Spend {
  
  @scala.inline
  def apply(Amount: NumericValue, Unit: UnitValue): Spend = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spend]
  }
  
  @scala.inline
  implicit class SpendMutableBuilder[Self <: Spend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: NumericValue): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: UnitValue): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
  }
}
