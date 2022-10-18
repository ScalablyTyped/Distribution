package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsResponse extends StObject {
  
  /**
    * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of operation summary information records. In a paginated request, the request returns up to MaxResults records for each call.
    */
  var OperationSummaryList: js.UndefOr[typings.awsSdk.clientsApprunnerMod.OperationSummaryList] = js.undefined
}
object ListOperationsResponse {
  
  inline def apply(): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsResponse]
  }
  
  extension [Self <: ListOperationsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOperationSummaryList(value: OperationSummaryList): Self = StObject.set(x, "OperationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setOperationSummaryListUndefined: Self = StObject.set(x, "OperationSummaryList", js.undefined)
    
    inline def setOperationSummaryListVarargs(value: OperationSummary*): Self = StObject.set(x, "OperationSummaryList", js.Array(value*))
  }
}
