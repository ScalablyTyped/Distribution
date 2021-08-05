package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVirtualNodeOutput extends StObject {
  
  /**
    * The full description of your virtual node following the create call.
    */
  var virtualNode: VirtualNodeData
}
object CreateVirtualNodeOutput {
  
  inline def apply(virtualNode: VirtualNodeData): CreateVirtualNodeOutput = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualNodeOutput]
  }
  
  extension [Self <: CreateVirtualNodeOutput](x: Self) {
    
    inline def setVirtualNode(value: VirtualNodeData): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
  }
}
