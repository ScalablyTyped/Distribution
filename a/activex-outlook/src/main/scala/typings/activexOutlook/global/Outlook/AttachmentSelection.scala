package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlSelectionContents
import typings.activexOutlook.Outlook.OlSelectionLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AttachmentSelection")
@js.native
class AttachmentSelection protected ()
  extends typings.activexOutlook.Outlook.AttachmentSelection {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Location: OlSelectionLocation = js.native
  /* CompleteClass */
  @JSName("Outlook.AttachmentSelection_typekey")
  override var OutlookDotAttachmentSelection_typekey: typings.activexOutlook.Outlook.AttachmentSelection = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetSelection(SelectionContents: OlSelectionContents): typings.activexOutlook.Outlook.Selection = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Attachment = js.native
}

