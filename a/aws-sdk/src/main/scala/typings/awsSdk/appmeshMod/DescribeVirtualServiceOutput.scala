package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualServiceOutput extends js.Object {
  /**
    * The full description of your virtual service.
    */
  var virtualService: VirtualServiceData = js.native
}

object DescribeVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): DescribeVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualServiceOutput]
  }
}

