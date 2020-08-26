package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualGatewayOutput extends js.Object {
  /**
    * The full description of your virtual gateway.
    */
  var virtualGateway: VirtualGatewayData = js.native
}

object DescribeVirtualGatewayOutput {
  @scala.inline
  def apply(virtualGateway: VirtualGatewayData): DescribeVirtualGatewayOutput = {
    val __obj = js.Dynamic.literal(virtualGateway = virtualGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualGatewayOutput]
  }
  @scala.inline
  implicit class DescribeVirtualGatewayOutputOps[Self <: DescribeVirtualGatewayOutput] (val x: Self) extends AnyVal {
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
    def setVirtualGateway(value: VirtualGatewayData): Self = this.set("virtualGateway", value.asInstanceOf[js.Any])
  }
  
}

