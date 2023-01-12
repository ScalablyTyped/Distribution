package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactFlowsResponse extends StObject {
  
  /**
    * Information about the flows.
    */
  var ContactFlowSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFlowSummaryList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListContactFlowsResponse {
  
  inline def apply(): ListContactFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactFlowsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContactFlowsResponse] (val x: Self) extends AnyVal {
    
    inline def setContactFlowSummaryList(value: ContactFlowSummaryList): Self = StObject.set(x, "ContactFlowSummaryList", value.asInstanceOf[js.Any])
    
    inline def setContactFlowSummaryListUndefined: Self = StObject.set(x, "ContactFlowSummaryList", js.undefined)
    
    inline def setContactFlowSummaryListVarargs(value: ContactFlowSummary*): Self = StObject.set(x, "ContactFlowSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
