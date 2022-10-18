package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupsOlderThanOrderingIdResponse extends StObject {
  
  /**
    *  Summary information for list of groups that are mapped to users before a given ordering or timestamp identifier. 
    */
  var GroupsSummaries: js.UndefOr[ListOfGroupSummaries] = js.undefined
  
  /**
    *  If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of groups that are mapped to users before a given ordering or timestamp identifier. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
}
object ListGroupsOlderThanOrderingIdResponse {
  
  inline def apply(): ListGroupsOlderThanOrderingIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupsOlderThanOrderingIdResponse]
  }
  
  extension [Self <: ListGroupsOlderThanOrderingIdResponse](x: Self) {
    
    inline def setGroupsSummaries(value: ListOfGroupSummaries): Self = StObject.set(x, "GroupsSummaries", value.asInstanceOf[js.Any])
    
    inline def setGroupsSummariesUndefined: Self = StObject.set(x, "GroupsSummaries", js.undefined)
    
    inline def setGroupsSummariesVarargs(value: GroupSummary*): Self = StObject.set(x, "GroupsSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
