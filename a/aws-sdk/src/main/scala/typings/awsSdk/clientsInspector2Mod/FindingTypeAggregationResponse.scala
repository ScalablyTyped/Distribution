package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingTypeAggregationResponse extends StObject {
  
  /**
    * The ID of the Amazon Web Services account associated with the findings.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The value to sort results by.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object FindingTypeAggregationResponse {
  
  inline def apply(): FindingTypeAggregationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingTypeAggregationResponse]
  }
  
  extension [Self <: FindingTypeAggregationResponse](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
