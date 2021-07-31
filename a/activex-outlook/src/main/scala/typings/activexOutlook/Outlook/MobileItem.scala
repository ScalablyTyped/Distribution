package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileItem extends StObject {
  
  val Actions: typings.activexOutlook.Outlook.Actions = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  
  var BillingInformation: String = js.native
  
  var Body: String = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Companies: String = js.native
  
  val ConversationIndex: String = js.native
  
  val ConversationTopic: String = js.native
  
  def Copy(): js.Any = js.native
  
  val Count: Double = js.native
  
  val CreationTime: VarDate = js.native
  
  def Delete(): Unit = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  
  val EntryID: String = js.native
  
  val FormDescription: typings.activexOutlook.Outlook.FormDescription = js.native
  
  def Forward(): MobileItem = js.native
  
  val GetInspector: Inspector = js.native
  
  var HTMLBody: String = js.native
  
  var Importance: OlImportance = js.native
  
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  val MAPIOBJECT: js.Any = js.native
  
  var MessageClass: String = js.native
  
  var Mileage: String = js.native
  
  val MobileFormat: OlMobileFormat = js.native
  
  def Move(DestFldr: Folder): js.Any = js.native
  
  var NoAging: Boolean = js.native
  
  @JSName("Outlook.MobileItem_typekey")
  var OutlookDotMobileItem_typekey: MobileItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  val Parent: js.Any = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  val ReceivedByEntryID: String = js.native
  
  val ReceivedByName: String = js.native
  
  val ReceivedTime: VarDate = js.native
  
  val Recipients: typings.activexOutlook.Outlook.Recipients = js.native
  
  def Reply(): MobileItem = js.native
  
  def ReplyAll(): MobileItem = js.native
  
  val ReplyRecipientNames: String = js.native
  
  val ReplyRecipients: typings.activexOutlook.Outlook.Recipients = js.native
  
  var SMILBody: String = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  
  val Saved: Boolean = js.native
  
  def Send(ForceSend: Boolean): Unit = js.native
  
  var SendUsingAccount: Account = js.native
  
  val SenderEmailAddress: String = js.native
  
  val SenderEmailType: String = js.native
  
  val SenderName: String = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val Sent: Boolean = js.native
  
  val SentOn: VarDate = js.native
  
  val Session: NameSpace = js.native
  
  val Size: Double = js.native
  
  var Subject: String = js.native
  
  val Submitted: Boolean = js.native
  
  var To: String = js.native
  
  var UnRead: Boolean = js.native
  
  val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
}
