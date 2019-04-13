package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVirtualNodeOutput extends js.Object {
  /**
    * A full description of the virtual node that was updated.
    */
  var virtualNode: VirtualNodeData
}

object UpdateVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): UpdateVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode)
  
    __obj.asInstanceOf[UpdateVirtualNodeOutput]
  }
}

