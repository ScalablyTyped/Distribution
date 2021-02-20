package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
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
  
  def GetAddressEntryFromID(ID: String): AddressEntry = js.native
  
  def GetRecipientFromID(EntryID: String): Recipient = js.native
  
  @JSName("Outlook.Account_typekey")
  var OutlookDotAccount_typekey: Account = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val SmtpAddress: String = js.native
  
  val UserName: String = js.native
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
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountType(value: OlAccountType): Self = StObject.set(x, "AccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDiscoverConnectionMode(value: OlAutoDiscoverConnectionMode): Self = StObject.set(x, "AutoDiscoverConnectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDiscoverXml(value: String): Self = StObject.set(x, "AutoDiscoverXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUser(value: Recipient): Self = StObject.set(x, "CurrentUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStore(value: Store): Self = StObject.set(x, "DeliveryStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeConnectionMode(value: OlExchangeConnectionMode): Self = StObject.set(x, "ExchangeConnectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeMailboxServerName(value: String): Self = StObject.set(x, "ExchangeMailboxServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeMailboxServerVersion(value: String): Self = StObject.set(x, "ExchangeMailboxServerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAddressEntryFromID(value: String => AddressEntry): Self = StObject.set(x, "GetAddressEntryFromID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRecipientFromID(value: String => Recipient): Self = StObject.set(x, "GetRecipientFromID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotAccount_typekey(value: Account): Self = StObject.set(x, "Outlook.Account_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmtpAddress(value: String): Self = StObject.set(x, "SmtpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
