package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingAggregatorsRequest extends StObject {
  
  /**
    * The maximum number of results to return. This operation currently only returns a single result.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  
  /**
    * The token returned with the previous set of results. Identifies the next set of results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
}
object ListFindingAggregatorsRequest {
  
  inline def apply(): ListFindingAggregatorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingAggregatorsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFindingAggregatorsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
