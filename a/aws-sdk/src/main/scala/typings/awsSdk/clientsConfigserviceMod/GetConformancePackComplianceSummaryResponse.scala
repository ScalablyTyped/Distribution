package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConformancePackComplianceSummaryResponse extends StObject {
  
  /**
    * A list of ConformancePackComplianceSummary objects. 
    */
  var ConformancePackComplianceSummaryList: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConformancePackComplianceSummaryList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object GetConformancePackComplianceSummaryResponse {
  
  inline def apply(): GetConformancePackComplianceSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConformancePackComplianceSummaryResponse]
  }
  
  extension [Self <: GetConformancePackComplianceSummaryResponse](x: Self) {
    
    inline def setConformancePackComplianceSummaryList(value: ConformancePackComplianceSummaryList): Self = StObject.set(x, "ConformancePackComplianceSummaryList", value.asInstanceOf[js.Any])
    
    inline def setConformancePackComplianceSummaryListUndefined: Self = StObject.set(x, "ConformancePackComplianceSummaryList", js.undefined)
    
    inline def setConformancePackComplianceSummaryListVarargs(value: ConformancePackComplianceSummary*): Self = StObject.set(x, "ConformancePackComplianceSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
