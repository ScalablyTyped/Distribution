package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  val AccountType: OlAccountType
  val Application: typings.activexOutlook.Outlook.Application
  val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode
  val AutoDiscoverXml: String
  val Class: OlObjectClass
  val CurrentUser: Recipient
  val DeliveryStore: Store
  val DisplayName: String
  val ExchangeConnectionMode: OlExchangeConnectionMode
  val ExchangeMailboxServerName: String
  val ExchangeMailboxServerVersion: String
  @JSName("Outlook.Account_typekey")
  var OutlookDotAccount_typekey: Account
  val Parent: js.Any
  val Session: NameSpace
  val SmtpAddress: String
  val UserName: String
  def GetAddressEntryFromID(ID: String): AddressEntry
  def GetRecipientFromID(EntryID: String): Recipient
}

object Account {
  @scala.inline
  def apply(
    AccountType: OlAccountType,
    Application: Application,
    AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode,
    AutoDiscoverXml: String,
    Class: OlObjectClass,
    CurrentUser: Recipient,
    DeliveryStore: Store,
    DisplayName: String,
    ExchangeConnectionMode: OlExchangeConnectionMode,
    ExchangeMailboxServerName: String,
    ExchangeMailboxServerVersion: String,
    GetAddressEntryFromID: String => AddressEntry,
    GetRecipientFromID: String => Recipient,
    OutlookDotAccount_typekey: Account,
    Parent: js.Any,
    Session: NameSpace,
    SmtpAddress: String,
    UserName: String
  ): Account = {
    val __obj = js.Dynamic.literal(AccountType = AccountType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoDiscoverConnectionMode = AutoDiscoverConnectionMode.asInstanceOf[js.Any], AutoDiscoverXml = AutoDiscoverXml.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CurrentUser = CurrentUser.asInstanceOf[js.Any], DeliveryStore = DeliveryStore.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ExchangeConnectionMode = ExchangeConnectionMode.asInstanceOf[js.Any], ExchangeMailboxServerName = ExchangeMailboxServerName.asInstanceOf[js.Any], ExchangeMailboxServerVersion = ExchangeMailboxServerVersion.asInstanceOf[js.Any], GetAddressEntryFromID = js.Any.fromFunction1(GetAddressEntryFromID), GetRecipientFromID = js.Any.fromFunction1(GetRecipientFromID), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SmtpAddress = SmtpAddress.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Account_typekey")(OutlookDotAccount_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

