package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The Amazon Web Services account identifier of the account to designate as the Security Hub administrator account.
    */
  var AdminAccountId: NonEmptyString
}
object EnableOrganizationAdminAccountRequest {
  
  inline def apply(AdminAccountId: NonEmptyString): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccountId = AdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setAdminAccountId(value: NonEmptyString): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
  }
}
