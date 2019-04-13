package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVirtualNodeOutput extends js.Object {
  /**
    * The full description of your virtual node.
    */
  var virtualNode: VirtualNodeData
}

object DescribeVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): DescribeVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode)
  
    __obj.asInstanceOf[DescribeVirtualNodeOutput]
  }
}

