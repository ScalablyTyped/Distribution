package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountResponse extends StObject {
  
  /**
    * The Amazon Chime account details.
    */
  var Account: js.UndefOr[typings.awsSdk.clientsChimeMod.Account] = js.undefined
}
object GetAccountResponse {
  
  inline def apply(): GetAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
