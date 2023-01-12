package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurringCharge extends StObject {
  
  /**
    * The monetary amount of the recurring charge.
    */
  var RecurringChargeAmount: js.UndefOr[Double] = js.undefined
  
  /**
    * The frequency of the recurring charge.
    */
  var RecurringChargeFrequency: js.UndefOr[String] = js.undefined
}
object RecurringCharge {
  
  inline def apply(): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringCharge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecurringCharge] (val x: Self) extends AnyVal {
    
    inline def setRecurringChargeAmount(value: Double): Self = StObject.set(x, "RecurringChargeAmount", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargeAmountUndefined: Self = StObject.set(x, "RecurringChargeAmount", js.undefined)
    
    inline def setRecurringChargeFrequency(value: String): Self = StObject.set(x, "RecurringChargeFrequency", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargeFrequencyUndefined: Self = StObject.set(x, "RecurringChargeFrequency", js.undefined)
  }
}
