package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegenerateSecurityTokenRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString
}
object RegenerateSecurityTokenRequest {
  
  inline def apply(AccountId: NonEmptyString, BotId: NonEmptyString): RegenerateSecurityTokenRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegenerateSecurityTokenRequest]
  }
  
  extension [Self <: RegenerateSecurityTokenRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: NonEmptyString): Self = StObject.set(x, "BotId", value.asInstanceOf[js.Any])
  }
}
