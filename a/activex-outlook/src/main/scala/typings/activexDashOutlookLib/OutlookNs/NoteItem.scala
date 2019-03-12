package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NoteItem")
@js.native
class NoteItem protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val AutoResolvedWinner: scala.Boolean = js.native
  var Body: java.lang.String = js.native
  var Categories: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Color: OlNoteColor = js.native
  val Conflicts: activexDashOutlookLib.OutlookNs.Conflicts = js.native
  val CreationTime: stdLib.VarDate = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: java.lang.String = js.native
  val GetInspector: Inspector = js.native
  var Height: scala.Double = js.native
  val IsConflict: scala.Boolean = js.native
  val ItemProperties: activexDashOutlookLib.OutlookNs.ItemProperties = js.native
  val LastModificationTime: stdLib.VarDate = js.native
  var Left: scala.Double = js.native
  val Links: activexDashOutlookLib.OutlookNs.Links = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: java.lang.String = js.native
  var `Outlook.NoteItem_typekey`: NoteItem = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: activexDashOutlookLib.OutlookNs.PropertyAccessor = js.native
  val Saved: scala.Boolean = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  val Subject: java.lang.String = js.native
  var Top: scala.Double = js.native
  var Width: scala.Double = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(Path: java.lang.String): scala.Unit = js.native
  def SaveAs(Path: java.lang.String, Type: js.Any): scala.Unit = js.native
}

