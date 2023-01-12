package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoreNetworkPolicyVersionsResponse extends StObject {
  
  /**
    * Describes core network policy versions.
    */
  var CoreNetworkPolicyVersions: js.UndefOr[CoreNetworkPolicyVersionList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object ListCoreNetworkPolicyVersionsResponse {
  
  inline def apply(): ListCoreNetworkPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoreNetworkPolicyVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCoreNetworkPolicyVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCoreNetworkPolicyVersions(value: CoreNetworkPolicyVersionList): Self = StObject.set(x, "CoreNetworkPolicyVersions", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkPolicyVersionsUndefined: Self = StObject.set(x, "CoreNetworkPolicyVersions", js.undefined)
    
    inline def setCoreNetworkPolicyVersionsVarargs(value: CoreNetworkPolicyVersion*): Self = StObject.set(x, "CoreNetworkPolicyVersions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
