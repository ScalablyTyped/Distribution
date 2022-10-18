package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesRequest extends StObject {
  
  /**
    * The maximum number of data sources to return.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListIndicesRequest] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of indexes (DataSourceSummaryItems). 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListIndicesRequest {
  
  inline def apply(): ListIndicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesRequest]
  }
  
  extension [Self <: ListIndicesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResultsIntegerForListIndicesRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
