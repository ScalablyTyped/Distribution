package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewaysRequest extends StObject {
  
  /**
    * The gateway group ARN for which to list gateways.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The maximum number of gateway summaries to return. The default is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxResults] = js.undefined
  
  /**
    * The token used to paginate though multiple pages of gateway summaries.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
}
object ListGatewaysRequest {
  
  inline def apply(): ListGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysRequest]
  }
  
  extension [Self <: ListGatewaysRequest](x: Self) {
    
    inline def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayGroupArnUndefined: Self = StObject.set(x, "GatewayGroupArn", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
