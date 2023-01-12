package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeFrameworkAttributes extends StObject {
  
  /**
    * Attributes of Ethereum for a node on a Managed Blockchain network that uses Ethereum. 
    */
  var Ethereum: js.UndefOr[NodeEthereumAttributes] = js.undefined
  
  /**
    * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[NodeFabricAttributes] = js.undefined
}
object NodeFrameworkAttributes {
  
  inline def apply(): NodeFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeFrameworkAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeFrameworkAttributes] (val x: Self) extends AnyVal {
    
    inline def setEthereum(value: NodeEthereumAttributes): Self = StObject.set(x, "Ethereum", value.asInstanceOf[js.Any])
    
    inline def setEthereumUndefined: Self = StObject.set(x, "Ethereum", js.undefined)
    
    inline def setFabric(value: NodeFabricAttributes): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    inline def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
