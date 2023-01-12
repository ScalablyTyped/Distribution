package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeTrialInfoError extends StObject {
  
  /**
    * The account associated with the Amazon Inspector free trial information.
    */
  var accountId: MeteringAccountId
  
  /**
    * The error code.
    */
  var code: FreeTrialInfoErrorCode
  
  /**
    * The error message returned.
    */
  var message: String
}
object FreeTrialInfoError {
  
  inline def apply(accountId: MeteringAccountId, code: FreeTrialInfoErrorCode, message: String): FreeTrialInfoError = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeTrialInfoError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeTrialInfoError] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: MeteringAccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setCode(value: FreeTrialInfoErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
