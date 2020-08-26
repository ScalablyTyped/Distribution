package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSelector extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  @JSName("Outlook.AccountSelector_typekey")
  var OutlookDotAccountSelector_typekey: AccountSelector = js.native
  val Parent: js.Any = js.native
  val SelectedAccount: Account = js.native
  val Session: NameSpace = js.native
}

object AccountSelector {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    OutlookDotAccountSelector_typekey: AccountSelector,
    Parent: js.Any,
    SelectedAccount: Account,
    Session: NameSpace
  ): AccountSelector = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SelectedAccount = SelectedAccount.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AccountSelector_typekey")(OutlookDotAccountSelector_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountSelector]
  }
  @scala.inline
  implicit class AccountSelectorOps[Self <: AccountSelector] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotAccountSelector_typekey(value: AccountSelector): Self = this.set("Outlook.AccountSelector_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedAccount(value: Account): Self = this.set("SelectedAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

