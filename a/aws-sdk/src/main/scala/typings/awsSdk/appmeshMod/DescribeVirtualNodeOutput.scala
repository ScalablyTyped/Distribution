package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribeVirtualNodeOutputOps[Self <: DescribeVirtualNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVirtualNode(value: VirtualNodeData): Self = this.set("virtualNode", value.asInstanceOf[js.Any])
  }
}
