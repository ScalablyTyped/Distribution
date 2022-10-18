package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the delegated Amazon Macie administrator account.
    */
  var adminAccountId: string
}
object DisableOrganizationAdminAccountRequest {
  
  inline def apply(adminAccountId: string): DisableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
  }
  
  extension [Self <: DisableOrganizationAdminAccountRequest](x: Self) {
    
    inline def setAdminAccountId(value: string): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
  }
}
