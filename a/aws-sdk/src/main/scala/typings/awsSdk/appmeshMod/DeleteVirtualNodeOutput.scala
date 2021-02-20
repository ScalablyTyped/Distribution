package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVirtualNodeOutput extends StObject {
  
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
  
  @scala.inline
  implicit class DeleteVirtualNodeOutputMutableBuilder[Self <: DeleteVirtualNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNode(value: VirtualNodeData): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
  }
}
