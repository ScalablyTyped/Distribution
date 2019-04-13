package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVirtualRouterOutput extends js.Object {
  /**
    * The full description of your virtual router following the create call.
    */
  var virtualRouter: VirtualRouterData
}

object CreateVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): CreateVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter)
  
    __obj.asInstanceOf[CreateVirtualRouterOutput]
  }
}

