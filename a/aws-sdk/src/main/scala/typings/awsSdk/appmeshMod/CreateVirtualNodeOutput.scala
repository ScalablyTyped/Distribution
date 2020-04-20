package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVirtualNodeOutput extends js.Object {
  /**
    * The full description of your virtual node following the create call.
    */
  var virtualNode: VirtualNodeData = js.native
}

object CreateVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): CreateVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualNodeOutput]
  }
}

