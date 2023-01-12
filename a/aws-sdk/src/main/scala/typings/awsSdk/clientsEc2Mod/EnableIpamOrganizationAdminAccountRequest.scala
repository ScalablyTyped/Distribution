package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableIpamOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The Organizations member account ID that you want to enable as the IPAM account.
    */
  var DelegatedAdminAccountId: String
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object EnableIpamOrganizationAdminAccountRequest {
  
  inline def apply(DelegatedAdminAccountId: String): EnableIpamOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(DelegatedAdminAccountId = DelegatedAdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableIpamOrganizationAdminAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableIpamOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setDelegatedAdminAccountId(value: String): Self = StObject.set(x, "DelegatedAdminAccountId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
