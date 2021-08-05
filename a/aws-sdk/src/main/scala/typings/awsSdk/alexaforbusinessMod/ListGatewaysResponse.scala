package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewaysResponse extends StObject {
  
  /**
    * The gateways in the list.
    */
  var Gateways: js.UndefOr[GatewaySummaries] = js.undefined
  
  /**
    * The token used to paginate though multiple pages of gateway summaries.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
}
object ListGatewaysResponse {
  
  inline def apply(): ListGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysResponse]
  }
  
  extension [Self <: ListGatewaysResponse](x: Self) {
    
    inline def setGateways(value: GatewaySummaries): Self = StObject.set(x, "Gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "Gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: GatewaySummary*): Self = StObject.set(x, "Gateways", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
