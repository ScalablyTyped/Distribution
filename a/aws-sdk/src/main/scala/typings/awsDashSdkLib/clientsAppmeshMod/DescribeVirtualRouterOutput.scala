package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVirtualRouterOutput extends js.Object {
  /**
    * The full description of your virtual router.
    */
  var virtualRouter: VirtualRouterData
}

object DescribeVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): DescribeVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter)
  
    __obj.asInstanceOf[DescribeVirtualRouterOutput]
  }
}

