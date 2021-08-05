package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVirtualNodeOutput extends StObject {
  
  /**
    * The full description of your virtual node.
    */
  var virtualNode: VirtualNodeData
}
object DescribeVirtualNodeOutput {
  
  inline def apply(virtualNode: VirtualNodeData): DescribeVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualNodeOutput]
  }
  
  extension [Self <: DescribeVirtualNodeOutput](x: Self) {
    
    inline def setVirtualNode(value: VirtualNodeData): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
  }
}
