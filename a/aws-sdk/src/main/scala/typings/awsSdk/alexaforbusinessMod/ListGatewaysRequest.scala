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
  
  @scala.inline
  def apply(): ListGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysRequest]
  }
  
  @scala.inline
  implicit class ListGatewaysRequestMutableBuilder[Self <: ListGatewaysRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayGroupArn(value: Arn): Self = StObject.set(x, "GatewayGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayGroupArnUndefined: Self = StObject.set(x, "GatewayGroupArn", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
