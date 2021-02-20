package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAccountResponse extends StObject {
  
  var Account: js.UndefOr[typings.awsSdk.chimeMod.Account] = js.native
}
object UpdateAccountResponse {
  
  @scala.inline
  def apply(): UpdateAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountResponse]
  }
  
  @scala.inline
  implicit class UpdateAccountResponseMutableBuilder[Self <: UpdateAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
