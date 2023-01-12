package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountStatusResponse extends StObject {
  
  /**
    *  The status of the Amazon Web Services account. 
    */
  var status: js.UndefOr[AccountStatus] = js.undefined
}
object GetAccountStatusResponse {
  
  inline def apply(): GetAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: AccountStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
