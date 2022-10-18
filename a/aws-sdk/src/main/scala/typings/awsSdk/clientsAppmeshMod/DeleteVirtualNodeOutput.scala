package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualNodeOutput extends StObject {
  
  /**
    * The virtual node that was deleted.
    */
  var virtualNode: VirtualNodeData
}
object DeleteVirtualNodeOutput {
  
  inline def apply(virtualNode: VirtualNodeData): DeleteVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualNodeOutput]
  }
  
  extension [Self <: DeleteVirtualNodeOutput](x: Self) {
    
    inline def setVirtualNode(value: VirtualNodeData): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
  }
}
