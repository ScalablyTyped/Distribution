package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccount Class */
trait FaxAccount extends StObject {
  
  /** Name of the fax account */
  val AccountName: String
  
  @JSName("FAXCOMEXLib.FaxAccount_typekey")
  var FAXCOMEXLibDotFaxAccount_typekey: FaxAccount
  
  /** Folders belonging to the account */
  val Folders: FaxAccountFolders
  
  /** Set bit-wise combination of events the fax account listens to */
  def ListenToAccountEvents(EventTypes: FAX_ACCOUNT_EVENTS_TYPE_ENUM): Unit
  
  /** Events the fax account is listening to */
  val RegisteredEvents: FAX_ACCOUNT_EVENTS_TYPE_ENUM
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
  
  @scala.inline
  implicit class FaxAccountMutableBuilder[Self <: FaxAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxAccount_typekey(value: FaxAccount): Self = StObject.set(x, "FAXCOMEXLib.FaxAccount_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolders(value: FaxAccountFolders): Self = StObject.set(x, "Folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenToAccountEvents(value: FAX_ACCOUNT_EVENTS_TYPE_ENUM => Unit): Self = StObject.set(x, "ListenToAccountEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisteredEvents(value: FAX_ACCOUNT_EVENTS_TYPE_ENUM): Self = StObject.set(x, "RegisteredEvents", value.asInstanceOf[js.Any])
  }
}
