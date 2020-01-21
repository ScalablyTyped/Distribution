package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Account")
@js.native
class Account protected () extends js.Object {
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

