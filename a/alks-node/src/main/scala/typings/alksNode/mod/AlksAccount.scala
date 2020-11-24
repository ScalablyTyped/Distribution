package typings.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlksAccount extends js.Object {
  
  var account: String = js.native
  
  var iam: js.UndefOr[Boolean] = js.native
  
  var role: String = js.native
}
object AlksAccount {
  
  @scala.inline
  def apply(account: String, role: String): AlksAccount = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlksAccount]
  }
  
  @scala.inline
  implicit class AlksAccountOps[Self <: AlksAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIam(value: Boolean): Self = this.set("iam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIam: Self = this.set("iam", js.undefined)
  }
}
