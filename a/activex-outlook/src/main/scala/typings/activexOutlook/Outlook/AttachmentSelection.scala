package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentSelection extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val Count: Double
  val Location: OlSelectionLocation
  @JSName("Outlook.AttachmentSelection_typekey")
  var OutlookDotAttachmentSelection_typekey: AttachmentSelection
  val Parent: js.Any
  val Session: NameSpace
  def GetSelection(SelectionContents: OlSelectionContents): Selection
  def Item(Index: js.Any): Attachment
}

object AttachmentSelection {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetSelection: OlSelectionContents => Selection,
    Item: js.Any => Attachment,
    Location: OlSelectionLocation,
    OutlookDotAttachmentSelection_typekey: AttachmentSelection,
    Parent: js.Any,
    Session: NameSpace
  ): AttachmentSelection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetSelection = js.Any.fromFunction1(GetSelection), Item = js.Any.fromFunction1(Item), Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AttachmentSelection_typekey")(OutlookDotAttachmentSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentSelection]
  }
}

