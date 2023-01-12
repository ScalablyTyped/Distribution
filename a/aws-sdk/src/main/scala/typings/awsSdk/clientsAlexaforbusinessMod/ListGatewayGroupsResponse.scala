package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewayGroupsResponse extends StObject {
  
  /**
    * The gateway groups in the list.
    */
  var GatewayGroups: js.UndefOr[GatewayGroupSummaries] = js.undefined
  
  /**
    * The token used to paginate though multiple pages of gateway group summaries.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}
object ListGatewayGroupsResponse {
  
  inline def apply(): ListGatewayGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewayGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGatewayGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setGatewayGroups(value: GatewayGroupSummaries): Self = StObject.set(x, "GatewayGroups", value.asInstanceOf[js.Any])
    
    inline def setGatewayGroupsUndefined: Self = StObject.set(x, "GatewayGroups", js.undefined)
    
    inline def setGatewayGroupsVarargs(value: GatewayGroupSummary*): Self = StObject.set(x, "GatewayGroups", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
