package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  val AccountType: OlAccountType = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  val AutoDiscoverXml: String = js.native
  val Class: OlObjectClass = js.native
  val CurrentUser: Recipient = js.native
  val DeliveryStore: Store = js.native
  val DisplayName: String = js.native
  val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  val ExchangeMailboxServerName: String = js.native
  val ExchangeMailboxServerVersion: String = js.native
  @JSName("Outlook.Account_typekey")
  var OutlookDotAccount_typekey: Account = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val SmtpAddress: String = js.native
  val UserName: String = js.native
  def GetAddressEntryFromID(ID: String): AddressEntry = js.native
  def GetRecipientFromID(EntryID: String): Recipient = js.native
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
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
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
    def setAccountType(value: OlAccountType): Self = this.set("AccountType", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoDiscoverConnectionMode(value: OlAutoDiscoverConnectionMode): Self = this.set("AutoDiscoverConnectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoDiscoverXml(value: String): Self = this.set("AutoDiscoverXml", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentUser(value: Recipient): Self = this.set("CurrentUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryStore(value: Store): Self = this.set("DeliveryStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExchangeConnectionMode(value: OlExchangeConnectionMode): Self = this.set("ExchangeConnectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExchangeMailboxServerName(value: String): Self = this.set("ExchangeMailboxServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExchangeMailboxServerVersion(value: String): Self = this.set("ExchangeMailboxServerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAddressEntryFromID(value: String => AddressEntry): Self = this.set("GetAddressEntryFromID", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRecipientFromID(value: String => Recipient): Self = this.set("GetRecipientFromID", js.Any.fromFunction1(value))
    @scala.inline
    def setOutlookDotAccount_typekey(value: Account): Self = this.set("Outlook.Account_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmtpAddress(value: String): Self = this.set("SmtpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

