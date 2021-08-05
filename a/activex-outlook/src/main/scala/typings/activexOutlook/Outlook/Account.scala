package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
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
  
  def GetAddressEntryFromID(ID: String): AddressEntry
  
  def GetRecipientFromID(EntryID: String): Recipient
  
  /* private */ @JSName("Outlook.Account_typekey")
  var OutlookDotAccount_typekey: Account
  
  val Parent: js.Any
  
  val Session: NameSpace
  
  val SmtpAddress: String
  
  val UserName: String
}
object Account {
  
  inline def apply(
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
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccountType(value: OlAccountType): Self = StObject.set(x, "AccountType", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoDiscoverConnectionMode(value: OlAutoDiscoverConnectionMode): Self = StObject.set(x, "AutoDiscoverConnectionMode", value.asInstanceOf[js.Any])
    
    inline def setAutoDiscoverXml(value: String): Self = StObject.set(x, "AutoDiscoverXml", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCurrentUser(value: Recipient): Self = StObject.set(x, "CurrentUser", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStore(value: Store): Self = StObject.set(x, "DeliveryStore", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setExchangeConnectionMode(value: OlExchangeConnectionMode): Self = StObject.set(x, "ExchangeConnectionMode", value.asInstanceOf[js.Any])
    
    inline def setExchangeMailboxServerName(value: String): Self = StObject.set(x, "ExchangeMailboxServerName", value.asInstanceOf[js.Any])
    
    inline def setExchangeMailboxServerVersion(value: String): Self = StObject.set(x, "ExchangeMailboxServerVersion", value.asInstanceOf[js.Any])
    
    inline def setGetAddressEntryFromID(value: String => AddressEntry): Self = StObject.set(x, "GetAddressEntryFromID", js.Any.fromFunction1(value))
    
    inline def setGetRecipientFromID(value: String => Recipient): Self = StObject.set(x, "GetRecipientFromID", js.Any.fromFunction1(value))
    
    inline def setOutlookDotAccount_typekey(value: Account): Self = StObject.set(x, "Outlook.Account_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSmtpAddress(value: String): Self = StObject.set(x, "SmtpAddress", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
