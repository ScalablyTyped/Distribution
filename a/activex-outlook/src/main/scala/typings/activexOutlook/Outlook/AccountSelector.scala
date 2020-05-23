package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSelector extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  @JSName("Outlook.AccountSelector_typekey")
  var OutlookDotAccountSelector_typekey: AccountSelector
  val Parent: js.Any
  val SelectedAccount: Account
  val Session: NameSpace
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
}

