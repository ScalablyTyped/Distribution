package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccount Class */
trait FaxAccount extends js.Object {
  /** Name of the fax account */
  val AccountName: String
  @JSName("FAXCOMEXLib.FaxAccount_typekey")
  var FAXCOMEXLibDotFaxAccount_typekey: FaxAccount
  /** Folders belonging to the account */
  val Folders: FaxAccountFolders
  /** Events the fax account is listening to */
  val RegisteredEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM
  /** Set bit-wise combination of events the fax account listens to */
  def ListenToAccountEvents(EventTypes: FAX_ACCOUNT_EVENTS_TYPE_ENUM): Unit
}

object FaxAccount {
  @scala.inline
  def apply(
    AccountName: String,
    FAXCOMEXLibDotFaxAccount_typekey: FaxAccount,
    Folders: FaxAccountFolders,
    ListenToAccountEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM => Unit,
    RegisteredEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM
  ): FaxAccount = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Folders = Folders.asInstanceOf[js.Any], ListenToAccountEvents = js.Any.fromFunction1(ListenToAccountEvents), RegisteredEvents = RegisteredEvents.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxAccount_typekey")(FAXCOMEXLibDotFaxAccount_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccount]
  }
}

