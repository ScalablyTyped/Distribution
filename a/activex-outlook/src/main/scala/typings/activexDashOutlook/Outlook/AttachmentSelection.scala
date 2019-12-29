package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AttachmentSelection")
@js.native
class AttachmentSelection protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  val Location: OlSelectionLocation = js.native
  @JSName("Outlook.AttachmentSelection_typekey")
  var OutlookDotAttachmentSelection_typekey: AttachmentSelection = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetSelection(SelectionContents: OlSelectionContents): Selection = js.native
  def Item(Index: js.Any): Attachment = js.native
}

