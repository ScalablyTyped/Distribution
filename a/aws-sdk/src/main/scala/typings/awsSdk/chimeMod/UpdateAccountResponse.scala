package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAccountResponse extends js.Object {
  
  var Account: js.UndefOr[typings.awsSdk.chimeMod.Account] = js.native
}
object UpdateAccountResponse {
  
  @scala.inline
  def apply(): UpdateAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountResponse]
  }
  
  @scala.inline
  implicit class UpdateAccountResponseOps[Self <: UpdateAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount(value: Account): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
  }
}
