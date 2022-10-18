package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreNetworkResponse extends StObject {
  
  /**
    * Details about a core network.
    */
  var CoreNetwork: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetwork] = js.undefined
}
object GetCoreNetworkResponse {
  
  inline def apply(): GetCoreNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoreNetworkResponse]
  }
  
  extension [Self <: GetCoreNetworkResponse](x: Self) {
    
    inline def setCoreNetwork(value: CoreNetwork): Self = StObject.set(x, "CoreNetwork", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkUndefined: Self = StObject.set(x, "CoreNetwork", js.undefined)
  }
}
