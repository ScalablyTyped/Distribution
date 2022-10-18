package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreCoreNetworkPolicyVersionResponse extends StObject {
  
  /**
    * Describes the restored core network policy.
    */
  var CoreNetworkPolicy: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkPolicy] = js.undefined
}
object RestoreCoreNetworkPolicyVersionResponse {
  
  inline def apply(): RestoreCoreNetworkPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreCoreNetworkPolicyVersionResponse]
  }
  
  extension [Self <: RestoreCoreNetworkPolicyVersionResponse](x: Self) {
    
    inline def setCoreNetworkPolicy(value: CoreNetworkPolicy): Self = StObject.set(x, "CoreNetworkPolicy", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkPolicyUndefined: Self = StObject.set(x, "CoreNetworkPolicy", js.undefined)
  }
}
