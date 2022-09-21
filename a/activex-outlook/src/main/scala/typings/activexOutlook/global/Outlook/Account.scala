package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAccountType
import typings.activexOutlook.Outlook.OlAutoDiscoverConnectionMode
import typings.activexOutlook.Outlook.OlExchangeConnectionMode
import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Account")
@js.native
/* private */ open class Account ()
  extends StObject
     with typings.activexOutlook.Outlook.Account {
  
  /* CompleteClass */
  override val AccountType: OlAccountType = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  
  /* CompleteClass */
  override val AutoDiscoverXml: String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val CurrentUser: typings.activexOutlook.Outlook.Recipient = js.native
  
  /* CompleteClass */
  override val DeliveryStore: typings.activexOutlook.Outlook.Store = js.native
  
  /* CompleteClass */
  override val DisplayName: String = js.native
  
  /* CompleteClass */
  override val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  
  /* CompleteClass */
  override val ExchangeMailboxServerName: String = js.native
  
  /* CompleteClass */
  override val ExchangeMailboxServerVersion: String = js.native
  
  /* CompleteClass */
  override def GetAddressEntryFromID(ID: String): typings.activexOutlook.Outlook.AddressEntry = js.native
  
  /* CompleteClass */
  override def GetRecipientFromID(EntryID: String): typings.activexOutlook.Outlook.Recipient = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Account_typekey")
  var OutlookDotAccount_typekey: typings.activexOutlook.Outlook.Account = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val SmtpAddress: String = js.native
  
  /* CompleteClass */
  override val UserName: String = js.native
}
