package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueueQuickConnectsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * Information about the quick connects.
    */
  var QuickConnectSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.QuickConnectSummaryList] = js.undefined
}
object ListQueueQuickConnectsResponse {
  
  inline def apply(): ListQueueQuickConnectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueueQuickConnectsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQueueQuickConnectsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQuickConnectSummaryList(value: QuickConnectSummaryList): Self = StObject.set(x, "QuickConnectSummaryList", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectSummaryListUndefined: Self = StObject.set(x, "QuickConnectSummaryList", js.undefined)
    
    inline def setQuickConnectSummaryListVarargs(value: QuickConnectSummary*): Self = StObject.set(x, "QuickConnectSummaryList", js.Array(value*))
  }
}
