package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstimatedMonthlySavings extends StObject {
  
  /**
    * The currency of the estimated monthly savings.
    */
  var currency: js.UndefOr[Currency] = js.undefined
  
  /**
    * The value of the estimated monthly savings.
    */
  var value: js.UndefOr[Value] = js.undefined
}
object EstimatedMonthlySavings {
  
  inline def apply(): EstimatedMonthlySavings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimatedMonthlySavings]
  }
  
  extension [Self <: EstimatedMonthlySavings](x: Self) {
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
