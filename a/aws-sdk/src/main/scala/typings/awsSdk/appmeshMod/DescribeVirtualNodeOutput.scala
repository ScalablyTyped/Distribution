package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualNodeOutput extends js.Object {
  /**
    * The full description of your virtual node.
    */
  var virtualNode: VirtualNodeData = js.native
}

object DescribeVirtualNodeOutput {
  @scala.inline
  def apply(virtualNode: VirtualNodeData): DescribeVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeVirtualNodeOutput]
  }
}

