package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualGatewaysOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListVirtualGateways
    request. When the results of a ListVirtualGateways request exceed
    limit, you can use this value to retrieve the next page of results. This
    value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of existing virtual gateways for the specified service mesh.
    */
  var virtualGateways: VirtualGatewayList = js.native
}

object ListVirtualGatewaysOutput {
  @scala.inline
  def apply(virtualGateways: VirtualGatewayList): ListVirtualGatewaysOutput = {
    val __obj = js.Dynamic.literal(virtualGateways = virtualGateways.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualGatewaysOutput]
  }
  @scala.inline
  implicit class ListVirtualGatewaysOutputOps[Self <: ListVirtualGatewaysOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVirtualGatewaysVarargs(value: VirtualGatewayRef*): Self = this.set("virtualGateways", js.Array(value :_*))
    @scala.inline
    def setVirtualGateways(value: VirtualGatewayList): Self = this.set("virtualGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

