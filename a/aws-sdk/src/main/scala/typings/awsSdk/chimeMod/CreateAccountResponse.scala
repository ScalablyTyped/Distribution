package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountResponse extends StObject {
  
  var Account: js.UndefOr[typings.awsSdk.chimeMod.Account] = js.undefined
}
object CreateAccountResponse {
  
  @scala.inline
  def apply(): CreateAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountResponse]
  }
  
  @scala.inline
  implicit class CreateAccountResponseMutableBuilder[Self <: CreateAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
