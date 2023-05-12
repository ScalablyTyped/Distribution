package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageByAccount extends StObject {
  
  /**
    * The type of currency that the value for the metric (estimatedCost) is reported in.
    */
  var currency: js.UndefOr[Currency] = js.undefined
  
  /**
    * The estimated value for the metric.
    */
  var estimatedCost: js.UndefOr[string] = js.undefined
  
  /**
    * The current value for the quota that corresponds to the metric specified by the type field.
    */
  var serviceLimit: js.UndefOr[ServiceLimit] = js.undefined
  
  /**
    * The name of the metric. Possible values are: AUTOMATED_OBJECT_MONITORING, to monitor S3 objects for automated sensitive data discovery; AUTOMATED_SENSITIVE_DATA_DISCOVERY, to analyze S3 objects for automated sensitive data discovery; DATA_INVENTORY_EVALUATION, to monitor S3 buckets; and, SENSITIVE_DATA_DISCOVERY, to run classification jobs.
    */
  var `type`: js.UndefOr[UsageType] = js.undefined
}
object UsageByAccount {
  
  inline def apply(): UsageByAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageByAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsageByAccount] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setEstimatedCost(value: string): Self = StObject.set(x, "estimatedCost", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCostUndefined: Self = StObject.set(x, "estimatedCost", js.undefined)
    
    inline def setServiceLimit(value: ServiceLimit): Self = StObject.set(x, "serviceLimit", value.asInstanceOf[js.Any])
    
    inline def setServiceLimitUndefined: Self = StObject.set(x, "serviceLimit", js.undefined)
    
    inline def setType(value: UsageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
