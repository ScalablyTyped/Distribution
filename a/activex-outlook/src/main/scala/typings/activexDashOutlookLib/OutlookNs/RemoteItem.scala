package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.RemoteItem")
@js.native
class RemoteItem protected () extends js.Object {
  val Actions: activexDashOutlookLib.OutlookNs.Actions = js.native
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Attachments: activexDashOutlookLib.OutlookNs.Attachments = js.native
  val AutoResolvedWinner: scala.Boolean = js.native
  var BillingInformation: java.lang.String = js.native
  var Body: java.lang.String = js.native
  var Categories: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Companies: java.lang.String = js.native
  val Conflicts: activexDashOutlookLib.OutlookNs.Conflicts = js.native
  val ConversationID: java.lang.String = js.native
  val ConversationIndex: java.lang.String = js.native
  val ConversationTopic: java.lang.String = js.native
  val CreationTime: stdLib.VarDate = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: java.lang.String = js.native
  val FormDescription: activexDashOutlookLib.OutlookNs.FormDescription = js.native
  val GetInspector: Inspector = js.native
  val HasAttachment: scala.Boolean = js.native
  var Importance: OlImportance = js.native
  val IsConflict: scala.Boolean = js.native
  val ItemProperties: activexDashOutlookLib.OutlookNs.ItemProperties = js.native
  val LastModificationTime: stdLib.VarDate = js.native
  val Links: activexDashOutlookLib.OutlookNs.Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: java.lang.String = js.native
  var Mileage: java.lang.String = js.native
  var NoAging: scala.Boolean = js.native
  var `Outlook.RemoteItem_typekey`: RemoteItem = js.native
  val OutlookInternalVersion: scala.Double = js.native
  val OutlookVersion: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: activexDashOutlookLib.OutlookNs.PropertyAccessor = js.native
  val RemoteMessageClass: java.lang.String = js.native
  val Saved: scala.Boolean = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  var Subject: java.lang.String = js.native
  val TransferSize: scala.Double = js.native
  val TransferTime: scala.Double = js.native
  var UnRead: scala.Boolean = js.native
  val UserProperties: activexDashOutlookLib.OutlookNs.UserProperties = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def GetConversation(): Conversation = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(Path: java.lang.String): scala.Unit = js.native
  def SaveAs(Path: java.lang.String, Type: js.Any): scala.Unit = js.native
  def ShowCategoriesDialog(): scala.Unit = js.native
}

