package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.JournalItem")
@js.native
class JournalItem protected () extends js.Object {
  val Actions: Actions = js.native
  val Application: Application = js.native
  val Attachments: Attachments = js.native
  val AutoResolvedWinner: scala.Boolean = js.native
  var BillingInformation: java.lang.String = js.native
  var Body: java.lang.String = js.native
  var Categories: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Companies: java.lang.String = js.native
  val Conflicts: Conflicts = js.native
  var ContactNames: java.lang.String = js.native
  val ConversationID: java.lang.String = js.native
  val ConversationIndex: java.lang.String = js.native
  val ConversationTopic: java.lang.String = js.native
  val CreationTime: stdLib.VarDate = js.native
  var DocPosted: scala.Boolean = js.native
  var DocPrinted: scala.Boolean = js.native
  var DocRouted: scala.Boolean = js.native
  var DocSaved: scala.Boolean = js.native
  val DownloadState: OlDownloadState = js.native
  var Duration: scala.Double = js.native
  var End: stdLib.VarDate = js.native
  val EntryID: java.lang.String = js.native
  val FormDescription: FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  val IsConflict: scala.Boolean = js.native
  val ItemProperties: ItemProperties = js.native
  val LastModificationTime: stdLib.VarDate = js.native
  val Links: Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: java.lang.String = js.native
  var Mileage: java.lang.String = js.native
  var NoAging: scala.Boolean = js.native
  var `Outlook.JournalItem_typekey`: JournalItem = js.native
  val OutlookInternalVersion: scala.Double = js.native
  val OutlookVersion: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  val Recipients: Recipients = js.native
  val Saved: scala.Boolean = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  var Start: stdLib.VarDate = js.native
  var Subject: java.lang.String = js.native
  var Type: java.lang.String = js.native
  var UnRead: scala.Boolean = js.native
  val UserProperties: UserProperties = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def Forward(): MailItem = js.native
  def GetConversation(): Conversation = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): scala.Unit = js.native
  def Reply(): MailItem = js.native
  def ReplyAll(): MailItem = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(Path: java.lang.String): scala.Unit = js.native
  def SaveAs(Path: java.lang.String, Type: js.Any): scala.Unit = js.native
  def ShowCategoriesDialog(): scala.Unit = js.native
  def StartTimer(): scala.Unit = js.native
  def StopTimer(): scala.Unit = js.native
}

