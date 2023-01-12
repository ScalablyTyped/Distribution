package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGovCloudAccountResponse extends StObject {
  
  var CreateAccountStatus: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.CreateAccountStatus] = js.undefined
}
object CreateGovCloudAccountResponse {
  
  inline def apply(): CreateGovCloudAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGovCloudAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGovCloudAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateAccountStatus(value: CreateAccountStatus): Self = StObject.set(x, "CreateAccountStatus", value.asInstanceOf[js.Any])
    
    inline def setCreateAccountStatusUndefined: Self = StObject.set(x, "CreateAccountStatus", js.undefined)
  }
}
