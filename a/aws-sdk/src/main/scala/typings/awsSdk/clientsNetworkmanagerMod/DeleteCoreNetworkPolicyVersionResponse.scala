package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoreNetworkPolicyVersionResponse extends StObject {
  
  /**
    * Returns information about the deleted policy version. 
    */
  var CoreNetworkPolicy: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkPolicy] = js.undefined
}
object DeleteCoreNetworkPolicyVersionResponse {
  
  inline def apply(): DeleteCoreNetworkPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCoreNetworkPolicyVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCoreNetworkPolicyVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setCoreNetworkPolicy(value: CoreNetworkPolicy): Self = StObject.set(x, "CoreNetworkPolicy", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkPolicyUndefined: Self = StObject.set(x, "CoreNetworkPolicy", js.undefined)
  }
}
