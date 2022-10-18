package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdministratorAccountResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID for the administrator account. If the accounts are associated by an Amazon Macie membership invitation, this object also provides details about the invitation that was sent to establish the relationship between the accounts.
    */
  var administrator: js.UndefOr[Invitation] = js.undefined
}
object GetAdministratorAccountResponse {
  
  inline def apply(): GetAdministratorAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdministratorAccountResponse]
  }
  
  extension [Self <: GetAdministratorAccountResponse](x: Self) {
    
    inline def setAdministrator(value: Invitation): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
    
    inline def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
  }
}
