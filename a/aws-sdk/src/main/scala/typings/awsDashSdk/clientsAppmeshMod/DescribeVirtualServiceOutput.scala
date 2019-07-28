package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVirtualServiceOutput extends js.Object {
  /**
    * The full description of your virtual service.
    */
  var virtualService: VirtualServiceData
}

object DescribeVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): DescribeVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService)
  
    __obj.asInstanceOf[DescribeVirtualServiceOutput]
  }
}

