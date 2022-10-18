package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFrameworkConfiguration extends StObject {
  
  /**
    *  Hyperledger Fabric configuration properties for a Managed Blockchain network that uses Hyperledger Fabric. 
    */
  var Fabric: js.UndefOr[NetworkFabricConfiguration] = js.undefined
}
object NetworkFrameworkConfiguration {
  
  inline def apply(): NetworkFrameworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFrameworkConfiguration]
  }
  
  extension [Self <: NetworkFrameworkConfiguration](x: Self) {
    
    inline def setFabric(value: NetworkFabricConfiguration): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    inline def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
