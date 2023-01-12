package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSupportedResourceTypesInput extends StObject {
  
  /**
    * The maximum number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value appropriate to the operation. If additional items exist beyond those included in the current response, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results.  An API operation can return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results. 
    */
  var MaxResults: js.UndefOr[ListSupportedResourceTypesInputMaxResultsInteger] = js.undefined
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListSupportedResourceTypesInput {
  
  inline def apply(): ListSupportedResourceTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSupportedResourceTypesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSupportedResourceTypesInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListSupportedResourceTypesInputMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
