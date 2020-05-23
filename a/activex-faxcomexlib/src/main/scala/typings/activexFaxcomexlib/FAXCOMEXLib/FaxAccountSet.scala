package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountSet Class */
trait FaxAccountSet extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountSet_typekey")
  var FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet
  /** Adds a fax account */
  def AddAccount(bstrAccountName: String): FaxAccount
  /** Get fax account by name */
  def GetAccount(bstrAccountName: String): FaxAccount
  /** Collection of fax accounts */
  def GetAccounts(): FaxAccounts
  /** Removes a fax account by name */
  def RemoveAccount(bstrAccountName: String): Unit
}

object FaxAccountSet {
  @scala.inline
  def apply(
    AddAccount: String => FaxAccount,
    FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet,
    GetAccount: String => FaxAccount,
    GetAccounts: () => FaxAccounts,
    RemoveAccount: String => Unit
  ): FaxAccountSet = {
    val __obj = js.Dynamic.literal(AddAccount = js.Any.fromFunction1(AddAccount), GetAccount = js.Any.fromFunction1(GetAccount), GetAccounts = js.Any.fromFunction0(GetAccounts), RemoveAccount = js.Any.fromFunction1(RemoveAccount))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountSet_typekey")(FAXCOMEXLibDotFaxAccountSet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountSet]
  }
}

