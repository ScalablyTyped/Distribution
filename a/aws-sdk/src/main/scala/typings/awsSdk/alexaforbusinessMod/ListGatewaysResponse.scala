package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGatewaysResponse extends js.Object {
  
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
  implicit class ListGatewaysResponseOps[Self <: ListGatewaysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGatewaysVarargs(value: GatewaySummary*): Self = this.set("Gateways", js.Array(value :_*))
    
    @scala.inline
    def setGateways(value: GatewaySummaries): Self = this.set("Gateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGateways: Self = this.set("Gateways", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
