package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableIpamOrganizationAdminAccountResult extends StObject {
  
  /**
    * The result of disabling the IPAM account.
    */
  var Success: js.UndefOr[Boolean] = js.undefined
}
object DisableIpamOrganizationAdminAccountResult {
  
  inline def apply(): DisableIpamOrganizationAdminAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableIpamOrganizationAdminAccountResult]
  }
  
  extension [Self <: DisableIpamOrganizationAdminAccountResult](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
  }
}
