package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageTotal extends StObject {
  
  /**
    * The type of currency that the value for the metric (estimatedCost) is reported in.
    */
  var currency: js.UndefOr[Currency] = js.undefined
  
  /**
    * The estimated value for the metric.
    */
  var estimatedCost: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the metric. Possible values are: AUTOMATED_OBJECT_MONITORING, to monitor S3 objects for automated sensitive data discovery; AUTOMATED_SENSITIVE_DATA_DISCOVERY, to analyze S3 objects for automated sensitive data discovery; DATA_INVENTORY_EVALUATION, to monitor S3 buckets; and, SENSITIVE_DATA_DISCOVERY, to run classification jobs.
    */
  var `type`: js.UndefOr[UsageType] = js.undefined
}
object UsageTotal {
  
  inline def apply(): UsageTotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageTotal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsageTotal] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setEstimatedCost(value: string): Self = StObject.set(x, "estimatedCost", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCostUndefined: Self = StObject.set(x, "estimatedCost", js.undefined)
    
    inline def setType(value: UsageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
