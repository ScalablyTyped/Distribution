package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGatewaysResponse extends StObject {
  
  /**
    * The gateways in the list.
    */
  var Gateways: js.UndefOr[GatewaySummaries] = js.native
  
  /**
    * The token used to paginate though multiple pages of gateway summaries.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}
object ListGatewaysResponse {
  
  @scala.inline
  def apply(): ListGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysResponse]
  }
  
  @scala.inline
  implicit class ListGatewaysResponseMutableBuilder[Self <: ListGatewaysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGateways(value: GatewaySummaries): Self = StObject.set(x, "Gateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewaysUndefined: Self = StObject.set(x, "Gateways", js.undefined)
    
    @scala.inline
    def setGatewaysVarargs(value: GatewaySummary*): Self = StObject.set(x, "Gateways", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
