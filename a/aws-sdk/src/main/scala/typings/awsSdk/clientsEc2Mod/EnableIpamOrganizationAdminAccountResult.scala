package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableIpamOrganizationAdminAccountResult extends StObject {
  
  /**
    * The result of enabling the IPAM account.
    */
  var Success: js.UndefOr[Boolean] = js.undefined
}
object EnableIpamOrganizationAdminAccountResult {
  
  inline def apply(): EnableIpamOrganizationAdminAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableIpamOrganizationAdminAccountResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableIpamOrganizationAdminAccountResult] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
  }
}
