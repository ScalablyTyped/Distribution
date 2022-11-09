package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndexesInput extends StObject {
  
  /**
    * The maximum number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included in the current response, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results.  An API operation can return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results. 
    */
  var MaxResults: js.UndefOr[ListIndexesInputMaxResultsInteger] = js.undefined
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[ListIndexesInputNextTokenString] = js.undefined
  
  /**
    * If specified, limits the response to only information about the index in the specified list of Amazon Web Services Regions.
    */
  var Regions: js.UndefOr[ListIndexesInputRegionsList] = js.undefined
  
  /**
    * If specified, limits the output to only indexes of the specified Type, either LOCAL or AGGREGATOR. Use this option to discover the aggregator index for your account.
    */
  var Type: js.UndefOr[IndexType] = js.undefined
}
object ListIndexesInput {
  
  inline def apply(): ListIndexesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndexesInput]
  }
  
  extension [Self <: ListIndexesInput](x: Self) {
    
    inline def setMaxResults(value: ListIndexesInputMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: ListIndexesInputNextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegions(value: ListIndexesInputRegionsList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "Regions", js.Array(value*))
    
    inline def setType(value: IndexType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
