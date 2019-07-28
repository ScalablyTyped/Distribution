package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVirtualNodeOutput extends js.Object {
  /**
    * The virtual node that was deleted.
    */
  var virtualNode: VirtualNodeData
}

object DeleteVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): DeleteVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode)
  
    __obj.asInstanceOf[DeleteVirtualNodeOutput]
  }
}

