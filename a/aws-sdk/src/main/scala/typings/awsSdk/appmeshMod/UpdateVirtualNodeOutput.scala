package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualNodeOutput extends StObject {
  
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
  
  @scala.inline
  implicit class UpdateVirtualNodeOutputMutableBuilder[Self <: UpdateVirtualNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNode(value: VirtualNodeData): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
  }
}
