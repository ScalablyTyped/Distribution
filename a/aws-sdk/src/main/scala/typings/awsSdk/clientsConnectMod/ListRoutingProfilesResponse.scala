package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoutingProfilesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * Information about the routing profiles.
    */
  var RoutingProfileSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.RoutingProfileSummaryList] = js.undefined
}
object ListRoutingProfilesResponse {
  
  inline def apply(): ListRoutingProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutingProfilesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRoutingProfilesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRoutingProfileSummaryList(value: RoutingProfileSummaryList): Self = StObject.set(x, "RoutingProfileSummaryList", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileSummaryListUndefined: Self = StObject.set(x, "RoutingProfileSummaryList", js.undefined)
    
    inline def setRoutingProfileSummaryListVarargs(value: RoutingProfileSummary*): Self = StObject.set(x, "RoutingProfileSummaryList", js.Array(value*))
  }
}
