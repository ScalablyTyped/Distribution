package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUpgradeHistoryResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of objects corresponding to each upgrade or upgrade eligibility check performed on a domain.
    */
  var UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.undefined
}
object GetUpgradeHistoryResponse {
  
  inline def apply(): GetUpgradeHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeHistoryResponse]
  }
  
  extension [Self <: GetUpgradeHistoryResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUpgradeHistories(value: UpgradeHistoryList): Self = StObject.set(x, "UpgradeHistories", value.asInstanceOf[js.Any])
    
    inline def setUpgradeHistoriesUndefined: Self = StObject.set(x, "UpgradeHistories", js.undefined)
    
    inline def setUpgradeHistoriesVarargs(value: UpgradeHistory*): Self = StObject.set(x, "UpgradeHistories", js.Array(value*))
  }
}
