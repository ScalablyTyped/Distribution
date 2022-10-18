package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableRequest extends StObject {
  
  /**
    * A list of account IDs you want to enable Amazon Inspector scans for.
    */
  var accountIds: js.UndefOr[AccountIdSet] = js.undefined
  
  /**
    * The idempotency token for the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The resource scan types you want to enable.
    */
  var resourceTypes: EnableResourceTypeList
}
object EnableRequest {
  
  inline def apply(resourceTypes: EnableResourceTypeList): EnableRequest = {
    val __obj = js.Dynamic.literal(resourceTypes = resourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableRequest]
  }
  
  extension [Self <: EnableRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdSet): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setResourceTypes(value: EnableResourceTypeList): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesVarargs(value: ResourceScanType*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
  }
}
