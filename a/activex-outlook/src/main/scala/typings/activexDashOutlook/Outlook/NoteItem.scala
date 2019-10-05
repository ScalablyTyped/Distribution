package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NoteItem")
@js.native
class NoteItem protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val AutoResolvedWinner: Boolean = js.native
  var Body: String = js.native
  var Categories: String = js.native
  val Class: OlObjectClass = js.native
  var Color: OlNoteColor = js.native
  val Conflicts: typings.activexDashOutlook.Outlook.Conflicts = js.native
  val CreationTime: VarDate = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: String = js.native
  val GetInspector: Inspector = js.native
  var Height: Double = js.native
  val IsConflict: Boolean = js.native
  val ItemProperties: typings.activexDashOutlook.Outlook.ItemProperties = js.native
  val LastModificationTime: VarDate = js.native
  var Left: Double = js.native
  val Links: typings.activexDashOutlook.Outlook.Links = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: String = js.native
  var `Outlook.NoteItem_typekey`: NoteItem = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typings.activexDashOutlook.Outlook.PropertyAccessor = js.native
  val Saved: Boolean = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  val Subject: String = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): Unit = js.native
  def Save(): Unit = js.native
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
}

