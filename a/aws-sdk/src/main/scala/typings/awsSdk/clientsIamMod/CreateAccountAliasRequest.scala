package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountAliasRequest extends StObject {
  
  /**
    * The account alias to create. This parameter allows (through its regex pattern) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.
    */
  var AccountAlias: accountAliasType
}
object CreateAccountAliasRequest {
  
  inline def apply(AccountAlias: accountAliasType): CreateAccountAliasRequest = {
    val __obj = js.Dynamic.literal(AccountAlias = AccountAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountAliasRequest]
  }
  
  extension [Self <: CreateAccountAliasRequest](x: Self) {
    
    inline def setAccountAlias(value: accountAliasType): Self = StObject.set(x, "AccountAlias", value.asInstanceOf[js.Any])
  }
}
