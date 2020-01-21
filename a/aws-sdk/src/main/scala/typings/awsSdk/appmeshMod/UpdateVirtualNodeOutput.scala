package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVirtualNodeOutput extends js.Object {
  /**
    * A full description of the virtual node that was updated.
    */
  var virtualNode: VirtualNodeData = js.native
}

object UpdateVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): UpdateVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateVirtualNodeOutput]
  }
}

