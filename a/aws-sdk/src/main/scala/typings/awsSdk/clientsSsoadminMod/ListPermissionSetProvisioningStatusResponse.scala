package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionSetProvisioningStatusResponse extends StObject {
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var PermissionSetsProvisioningStatus: js.UndefOr[PermissionSetProvisioningStatusList] = js.undefined
}
object ListPermissionSetProvisioningStatusResponse {
  
  inline def apply(): ListPermissionSetProvisioningStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionSetProvisioningStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPermissionSetProvisioningStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPermissionSetsProvisioningStatus(value: PermissionSetProvisioningStatusList): Self = StObject.set(x, "PermissionSetsProvisioningStatus", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetsProvisioningStatusUndefined: Self = StObject.set(x, "PermissionSetsProvisioningStatus", js.undefined)
    
    inline def setPermissionSetsProvisioningStatusVarargs(value: PermissionSetProvisioningStatusMetadata*): Self = StObject.set(x, "PermissionSetsProvisioningStatus", js.Array(value*))
  }
}
