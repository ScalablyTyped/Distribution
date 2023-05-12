package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewaysResponse extends StObject {
  
  /**
    * A list of gateway summaries.
    */
  var Gateways: js.UndefOr[listOfListedGateway] = js.undefined
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListGateways request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListGateways request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListGatewaysResponse {
  
  inline def apply(): ListGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGatewaysResponse] (val x: Self) extends AnyVal {
    
    inline def setGateways(value: listOfListedGateway): Self = StObject.set(x, "Gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "Gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: ListedGateway*): Self = StObject.set(x, "Gateways", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
