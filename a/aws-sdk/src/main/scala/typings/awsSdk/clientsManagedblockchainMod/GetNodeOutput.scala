package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodeOutput extends StObject {
  
  /**
    * Properties of the node configuration.
    */
  var Node: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.Node] = js.undefined
}
object GetNodeOutput {
  
  inline def apply(): GetNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNodeOutput]
  }
  
  extension [Self <: GetNodeOutput](x: Self) {
    
    inline def setNode(value: Node): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "Node", js.undefined)
  }
}
