package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkEthereumAttributes extends StObject {
  
  /**
    * The Ethereum CHAIN_ID associated with the Ethereum network. Chain IDs are as follows:   mainnet = 1    goerli = 5    rinkeby = 4    ropsten = 3   
    */
  var ChainId: js.UndefOr[String] = js.undefined
}
object NetworkEthereumAttributes {
  
  inline def apply(): NetworkEthereumAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEthereumAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkEthereumAttributes] (val x: Self) extends AnyVal {
    
    inline def setChainId(value: String): Self = StObject.set(x, "ChainId", value.asInstanceOf[js.Any])
    
    inline def setChainIdUndefined: Self = StObject.set(x, "ChainId", js.undefined)
  }
}
