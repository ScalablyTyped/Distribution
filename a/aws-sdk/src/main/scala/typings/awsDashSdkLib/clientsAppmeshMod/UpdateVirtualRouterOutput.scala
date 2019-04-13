package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVirtualRouterOutput extends js.Object {
  /**
    * A full description of the virtual router that was updated.
    */
  var virtualRouter: VirtualRouterData
}

object UpdateVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): UpdateVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter)
  
    __obj.asInstanceOf[UpdateVirtualRouterOutput]
  }
}

