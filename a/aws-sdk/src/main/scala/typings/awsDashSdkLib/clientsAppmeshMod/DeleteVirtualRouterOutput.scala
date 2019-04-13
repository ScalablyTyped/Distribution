package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVirtualRouterOutput extends js.Object {
  /**
    * The virtual router that was deleted.
    */
  var virtualRouter: VirtualRouterData
}

object DeleteVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): DeleteVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter)
  
    __obj.asInstanceOf[DeleteVirtualRouterOutput]
  }
}

