package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterAccountResponse extends StObject {
  
  /**
    *  The registration status of the account. 
    */
  var status: js.UndefOr[AccountStatus] = js.undefined
}
object DeregisterAccountResponse {
  
  inline def apply(): DeregisterAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterAccountResponse]
  }
  
  extension [Self <: DeregisterAccountResponse](x: Self) {
    
    inline def setStatus(value: AccountStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
