package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingGroupCostReportsOutput extends StObject {
  
  /**
    * A list of BillingGroupCostReportElement retrieved. 
    */
  var BillingGroupCostReports: js.UndefOr[BillingGroupCostReportList] = js.undefined
  
  /**
    * The pagination token that's used on subsequent calls to get reports. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListBillingGroupCostReportsOutput {
  
  inline def apply(): ListBillingGroupCostReportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupCostReportsOutput]
  }
  
  extension [Self <: ListBillingGroupCostReportsOutput](x: Self) {
    
    inline def setBillingGroupCostReports(value: BillingGroupCostReportList): Self = StObject.set(x, "BillingGroupCostReports", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupCostReportsUndefined: Self = StObject.set(x, "BillingGroupCostReports", js.undefined)
    
    inline def setBillingGroupCostReportsVarargs(value: BillingGroupCostReportElement*): Self = StObject.set(x, "BillingGroupCostReports", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
