package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentSelection extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
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
  @scala.inline
  implicit class AttachmentSelectionOps[Self <: AttachmentSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSelection(value: OlSelectionContents => Selection): Self = this.set("GetSelection", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: js.Any => Attachment): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setLocation(value: OlSelectionLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotAttachmentSelection_typekey(value: AttachmentSelection): Self = this.set("Outlook.AttachmentSelection_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

