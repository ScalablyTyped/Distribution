package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVirtualNodeOutput extends js.Object {
  /**
    * The full description of your virtual node following the create call.
    */
  var virtualNode: VirtualNodeData
}

object CreateVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): CreateVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode)
  
    __obj.asInstanceOf[CreateVirtualNodeOutput]
  }
}

