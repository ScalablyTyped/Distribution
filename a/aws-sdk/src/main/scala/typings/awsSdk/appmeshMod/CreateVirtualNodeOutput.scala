package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVirtualNodeOutput extends StObject {
  
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
  
  @scala.inline
  implicit class CreateVirtualNodeOutputMutableBuilder[Self <: CreateVirtualNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNode(value: VirtualNodeData): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
  }
}
