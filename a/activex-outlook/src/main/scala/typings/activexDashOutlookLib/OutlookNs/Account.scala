package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Account")
@js.native
class Account protected () extends js.Object {
  val AccountType: OlAccountType = js.native
  val Application: Application = js.native
  val AutoDiscoverConnectionMode: OlAutoDiscoverConnectionMode = js.native
  val AutoDiscoverXml: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  val CurrentUser: Recipient = js.native
  val DeliveryStore: Store = js.native
  val DisplayName: java.lang.String = js.native
  val ExchangeConnectionMode: OlExchangeConnectionMode = js.native
  val ExchangeMailboxServerName: java.lang.String = js.native
  val ExchangeMailboxServerVersion: java.lang.String = js.native
  var `Outlook.Account_typekey`: Account = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val SmtpAddress: java.lang.String = js.native
  val UserName: java.lang.String = js.native
  def GetAddressEntryFromID(ID: java.lang.String): AddressEntry = js.native
  def GetRecipientFromID(EntryID: java.lang.String): Recipient = js.native
}

