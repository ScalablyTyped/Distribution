package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualRouterOutput extends js.Object {
  /**
    * The full description of your virtual router.
    */
  var virtualRouter: VirtualRouterData = js.native
}

object DescribeVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): DescribeVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualRouterOutput]
  }
}

