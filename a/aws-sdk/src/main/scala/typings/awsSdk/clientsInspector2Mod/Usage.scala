package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Usage extends StObject {
  
  /**
    * The currency type used when calculating usage data.
    */
  var currency: js.UndefOr[Currency] = js.undefined
  
  /**
    * The estimated monthly cost of Amazon Inspector.
    */
  var estimatedMonthlyCost: js.UndefOr[MonthlyCostEstimate] = js.undefined
  
  /**
    * The total of usage.
    */
  var total: js.UndefOr[UsageValue] = js.undefined
  
  /**
    * The type scan.
    */
  var `type`: js.UndefOr[UsageType] = js.undefined
}
object Usage {
  
  inline def apply(): Usage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Usage] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setEstimatedMonthlyCost(value: MonthlyCostEstimate): Self = StObject.set(x, "estimatedMonthlyCost", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlyCostUndefined: Self = StObject.set(x, "estimatedMonthlyCost", js.undefined)
    
    inline def setTotal(value: UsageValue): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: UsageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
