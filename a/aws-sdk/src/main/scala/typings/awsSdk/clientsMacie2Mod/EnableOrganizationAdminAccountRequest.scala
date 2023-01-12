package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the account to designate as the delegated Amazon Macie administrator account for the organization.
    */
  var adminAccountId: string
  
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.undefined
}
object EnableOrganizationAdminAccountRequest {
  
  inline def apply(adminAccountId: string): EnableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setAdminAccountId(value: string): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
