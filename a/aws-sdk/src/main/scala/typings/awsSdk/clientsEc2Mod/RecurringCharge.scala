package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurringCharge extends StObject {
  
  /**
    * The amount of the recurring charge.
    */
  var Amount: js.UndefOr[Double] = js.undefined
  
  /**
    * The frequency of the recurring charge.
    */
  var Frequency: js.UndefOr[RecurringChargeFrequency] = js.undefined
}
object RecurringCharge {
  
  inline def apply(): RecurringCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurringCharge]
  }
  
  extension [Self <: RecurringCharge](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    inline def setFrequency(value: RecurringChargeFrequency): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
  }
}
