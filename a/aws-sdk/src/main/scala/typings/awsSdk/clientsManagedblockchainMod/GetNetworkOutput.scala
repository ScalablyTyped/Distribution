package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkOutput extends StObject {
  
  /**
    * An object containing network configuration parameters.
    */
  var Network: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.Network] = js.undefined
}
object GetNetworkOutput {
  
  inline def apply(): GetNetworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkOutput] (val x: Self) extends AnyVal {
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "Network", js.undefined)
  }
}
