package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVirtualNodeOutput extends StObject {
  
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
  implicit class DescribeVirtualNodeOutputMutableBuilder[Self <: DescribeVirtualNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNode(value: VirtualNodeData): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
  }
}
