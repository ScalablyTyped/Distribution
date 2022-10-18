package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The Amazon Web Services account identifier of the Security Hub administrator account.
    */
  var AdminAccountId: NonEmptyString
}
object DisableOrganizationAdminAccountRequest {
  
  inline def apply(AdminAccountId: NonEmptyString): DisableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccountId = AdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
  }
  
  extension [Self <: DisableOrganizationAdminAccountRequest](x: Self) {
    
    inline def setAdminAccountId(value: NonEmptyString): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
  }
}
