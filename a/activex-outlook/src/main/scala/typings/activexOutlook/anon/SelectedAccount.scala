package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedAccount extends js.Object {
  
  val SelectedAccount: typings.activexOutlook.Outlook.Account = js.native
}
object SelectedAccount {
  
  @scala.inline
  def apply(SelectedAccount: typings.activexOutlook.Outlook.Account): SelectedAccount = {
    val __obj = js.Dynamic.literal(SelectedAccount = SelectedAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedAccount]
  }
  
  @scala.inline
  implicit class SelectedAccountOps[Self <: SelectedAccount] (val x: Self) extends AnyVal {
    
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
    def setSelectedAccount(value: typings.activexOutlook.Outlook.Account): Self = this.set("SelectedAccount", value.asInstanceOf[js.Any])
  }
}
