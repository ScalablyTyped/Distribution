package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAccountResponse extends StObject {
  
  /**
    *  The status of the account registration request. 
    */
  var status: js.UndefOr[AccountStatus] = js.undefined
}
object RegisterAccountResponse {
  
  inline def apply(): RegisterAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAccountResponse]
  }
  
  extension [Self <: RegisterAccountResponse](x: Self) {
    
    inline def setStatus(value: AccountStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
