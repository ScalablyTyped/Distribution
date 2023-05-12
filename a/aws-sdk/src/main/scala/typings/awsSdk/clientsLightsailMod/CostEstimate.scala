package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostEstimate extends StObject {
  
  /**
    * The cost estimate result that's associated with a time period.
    */
  var resultsByTime: js.UndefOr[EstimatesByTime] = js.undefined
  
  /**
    * The types of usage that are included in the estimate, such as costs, usage, or data transfer.
    */
  var usageType: js.UndefOr[NonEmptyString] = js.undefined
}
object CostEstimate {
  
  inline def apply(): CostEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostEstimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CostEstimate] (val x: Self) extends AnyVal {
    
    inline def setResultsByTime(value: EstimatesByTime): Self = StObject.set(x, "resultsByTime", value.asInstanceOf[js.Any])
    
    inline def setResultsByTimeUndefined: Self = StObject.set(x, "resultsByTime", js.undefined)
    
    inline def setResultsByTimeVarargs(value: EstimateByTime*): Self = StObject.set(x, "resultsByTime", js.Array(value*))
    
    inline def setUsageType(value: NonEmptyString): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
    
    inline def setUsageTypeUndefined: Self = StObject.set(x, "usageType", js.undefined)
  }
}
