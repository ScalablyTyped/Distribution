package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualNodeOutput extends js.Object {
  /**
    * The virtual node that was deleted.
    */
  var virtualNode: VirtualNodeData = js.native
}

object DeleteVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): DeleteVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualNodeOutput]
  }
}

