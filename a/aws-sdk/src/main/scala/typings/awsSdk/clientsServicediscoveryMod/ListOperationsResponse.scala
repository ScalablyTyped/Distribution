package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsResponse extends StObject {
  
  /**
    * If the response contains NextToken, submit another ListOperations request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  Cloud Map gets MaxResults operations and then filters them based on the specified criteria. It's possible that no operations in the first MaxResults operations matched the specified criteria but that subsequent groups of MaxResults operations do contain operations that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.NextToken] = js.undefined
  
  /**
    * Summary information about the operations that match the specified criteria.
    */
  var Operations: js.UndefOr[OperationSummaryList] = js.undefined
}
object ListOperationsResponse {
  
  inline def apply(): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsResponse]
  }
  
  extension [Self <: ListOperationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOperations(value: OperationSummaryList): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "Operations", js.undefined)
    
    inline def setOperationsVarargs(value: OperationSummary*): Self = StObject.set(x, "Operations", js.Array(value*))
  }
}
