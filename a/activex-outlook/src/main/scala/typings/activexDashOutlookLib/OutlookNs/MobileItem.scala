package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.MobileItem")
@js.native
class MobileItem protected () extends js.Object {
  val Actions: Actions = js.native
  val Application: Application = js.native
  val Attachments: Attachments = js.native
  var BillingInformation: java.lang.String = js.native
  var Body: java.lang.String = js.native
  var Categories: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Companies: java.lang.String = js.native
  val ConversationIndex: java.lang.String = js.native
  val ConversationTopic: java.lang.String = js.native
  val Count: scala.Double = js.native
  val CreationTime: stdLib.VarDate = js.native
  val EntryID: java.lang.String = js.native
  val FormDescription: FormDescription = js.native
  val GetInspector: Inspector = js.native
  var HTMLBody: java.lang.String = js.native
  var Importance: OlImportance = js.native
  val ItemProperties: ItemProperties = js.native
  val LastModificationTime: stdLib.VarDate = js.native
  val MAPIOBJECT: js.Any = js.native
  var MessageClass: java.lang.String = js.native
  var Mileage: java.lang.String = js.native
  val MobileFormat: OlMobileFormat = js.native
  var NoAging: scala.Boolean = js.native
  var `Outlook.MobileItem_typekey`: MobileItem = js.native
  val OutlookInternalVersion: scala.Double = js.native
  val OutlookVersion: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val ReceivedByEntryID: java.lang.String = js.native
  val ReceivedByName: java.lang.String = js.native
  val ReceivedTime: stdLib.VarDate = js.native
  val Recipients: Recipients = js.native
  val ReplyRecipientNames: java.lang.String = js.native
  val ReplyRecipients: Recipients = js.native
  var SMILBody: java.lang.String = js.native
  val Saved: scala.Boolean = js.native
  var SendUsingAccount: Account = js.native
  val SenderEmailAddress: java.lang.String = js.native
  val SenderEmailType: java.lang.String = js.native
  val SenderName: java.lang.String = js.native
  var Sensitivity: OlSensitivity = js.native
  val Sent: scala.Boolean = js.native
  val SentOn: stdLib.VarDate = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  var Subject: java.lang.String = js.native
  val Submitted: scala.Boolean = js.native
  var To: java.lang.String = js.native
  var UnRead: scala.Boolean = js.native
  val UserProperties: UserProperties = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def Forward(): MobileItem = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): scala.Unit = js.native
  def Reply(): MobileItem = js.native
  def ReplyAll(): MobileItem = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(Path: java.lang.String): scala.Unit = js.native
  def SaveAs(Path: java.lang.String, Type: js.Any): scala.Unit = js.native
  def Send(ForceSend: scala.Boolean): scala.Unit = js.native
}

