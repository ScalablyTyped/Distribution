package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansUtilizationResponse extends StObject {
  
  /**
    * The amount of cost/commitment that you used your Savings Plans. You can use it to specify date ranges.
    */
  var SavingsPlansUtilizationsByTime: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.SavingsPlansUtilizationsByTime] = js.undefined
  
  /**
    * The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
    */
  var Total: SavingsPlansUtilizationAggregates
}
object GetSavingsPlansUtilizationResponse {
  
  inline def apply(Total: SavingsPlansUtilizationAggregates): GetSavingsPlansUtilizationResponse = {
    val __obj = js.Dynamic.literal(Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationResponse]
  }
  
  extension [Self <: GetSavingsPlansUtilizationResponse](x: Self) {
    
    inline def setSavingsPlansUtilizationsByTime(value: SavingsPlansUtilizationsByTime): Self = StObject.set(x, "SavingsPlansUtilizationsByTime", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansUtilizationsByTimeUndefined: Self = StObject.set(x, "SavingsPlansUtilizationsByTime", js.undefined)
    
    inline def setSavingsPlansUtilizationsByTimeVarargs(value: SavingsPlansUtilizationByTime*): Self = StObject.set(x, "SavingsPlansUtilizationsByTime", js.Array(value*))
    
    inline def setTotal(value: SavingsPlansUtilizationAggregates): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
  }
}
