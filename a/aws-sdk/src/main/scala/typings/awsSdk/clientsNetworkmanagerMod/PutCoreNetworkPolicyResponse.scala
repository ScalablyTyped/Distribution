package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCoreNetworkPolicyResponse extends StObject {
  
  /**
    * Describes the changed core network policy.
    */
  var CoreNetworkPolicy: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkPolicy] = js.undefined
}
object PutCoreNetworkPolicyResponse {
  
  inline def apply(): PutCoreNetworkPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutCoreNetworkPolicyResponse]
  }
  
  extension [Self <: PutCoreNetworkPolicyResponse](x: Self) {
    
    inline def setCoreNetworkPolicy(value: CoreNetworkPolicy): Self = StObject.set(x, "CoreNetworkPolicy", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkPolicyUndefined: Self = StObject.set(x, "CoreNetworkPolicy", js.undefined)
  }
}
