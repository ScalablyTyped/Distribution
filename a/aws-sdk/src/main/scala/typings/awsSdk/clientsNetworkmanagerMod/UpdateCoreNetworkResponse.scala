package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCoreNetworkResponse extends StObject {
  
  /**
    * Returns information about a core network update.
    */
  var CoreNetwork: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetwork] = js.undefined
}
object UpdateCoreNetworkResponse {
  
  inline def apply(): UpdateCoreNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCoreNetworkResponse]
  }
  
  extension [Self <: UpdateCoreNetworkResponse](x: Self) {
    
    inline def setCoreNetwork(value: CoreNetwork): Self = StObject.set(x, "CoreNetwork", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkUndefined: Self = StObject.set(x, "CoreNetwork", js.undefined)
  }
}
