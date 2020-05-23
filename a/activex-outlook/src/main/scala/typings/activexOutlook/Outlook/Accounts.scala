package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accounts extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  @JSName("Outlook.Accounts_typekey")
  var OutlookDotAccounts_typekey: Accounts
  val Parent: js.Any
  val Session: NameSpace
  def Item(Index: js.Any): Account
}

object Accounts {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Account,
    OutlookDotAccounts_typekey: Accounts,
    Parent: js.Any,
    Session: NameSpace
  ): Accounts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Accounts_typekey")(OutlookDotAccounts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounts]
  }
}

