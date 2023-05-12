package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdminScopeRequest extends StObject {
  
  /**
    * The administator account that you want to get the details for.
    */
  var AdminAccount: AWSAccountId
}
object GetAdminScopeRequest {
  
  inline def apply(AdminAccount: AWSAccountId): GetAdminScopeRequest = {
    val __obj = js.Dynamic.literal(AdminAccount = AdminAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAdminScopeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAdminScopeRequest] (val x: Self) extends AnyVal {
    
    inline def setAdminAccount(value: AWSAccountId): Self = StObject.set(x, "AdminAccount", value.asInstanceOf[js.Any])
  }
}
