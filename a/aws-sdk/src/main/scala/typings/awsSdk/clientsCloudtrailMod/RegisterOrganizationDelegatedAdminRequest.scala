package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterOrganizationDelegatedAdminRequest extends StObject {
  
  /**
    * An organization member account ID that you want to designate as a delegated administrator.
    */
  var MemberAccountId: AccountId
}
object RegisterOrganizationDelegatedAdminRequest {
  
  inline def apply(MemberAccountId: AccountId): RegisterOrganizationDelegatedAdminRequest = {
    val __obj = js.Dynamic.literal(MemberAccountId = MemberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOrganizationDelegatedAdminRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterOrganizationDelegatedAdminRequest] (val x: Self) extends AnyVal {
    
    inline def setMemberAccountId(value: AccountId): Self = StObject.set(x, "MemberAccountId", value.asInstanceOf[js.Any])
  }
}
