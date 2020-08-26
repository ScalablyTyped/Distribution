package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoHyperlinkType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hyperlink extends js.Object {
  var Address: String = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var EmailSubject: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Hyperlink_typekey")
  var PowerPointDotHyperlink_typekey: Hyperlink = js.native
  var ScreenTip: String = js.native
  var ShowAndReturn: MsoTriState = js.native
  var SubAddress: String = js.native
  var TextToDisplay: String = js.native
  val Type: MsoHyperlinkType = js.native
  def AddToFavorites(): Unit = js.native
  def CreateNewDocument(FileName: String, EditNow: MsoTriState, Overwrite: MsoTriState): Unit = js.native
  def Delete(): Unit = js.native
  def Follow(): Unit = js.native
}

object Hyperlink {
  @scala.inline
  def apply(
    AddToFavorites: () => Unit,
    Address: String,
    Application: Application,
    CreateNewDocument: (String, MsoTriState, MsoTriState) => Unit,
    Delete: () => Unit,
    EmailSubject: String,
    Follow: () => Unit,
    Parent: js.Any,
    PowerPointDotHyperlink_typekey: Hyperlink,
    ScreenTip: String,
    ShowAndReturn: MsoTriState,
    SubAddress: String,
    TextToDisplay: String,
    Type: MsoHyperlinkType
  ): Hyperlink = {
    val __obj = js.Dynamic.literal(AddToFavorites = js.Any.fromFunction0(AddToFavorites), Address = Address.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CreateNewDocument = js.Any.fromFunction3(CreateNewDocument), Delete = js.Any.fromFunction0(Delete), EmailSubject = EmailSubject.asInstanceOf[js.Any], Follow = js.Any.fromFunction0(Follow), Parent = Parent.asInstanceOf[js.Any], ScreenTip = ScreenTip.asInstanceOf[js.Any], ShowAndReturn = ShowAndReturn.asInstanceOf[js.Any], SubAddress = SubAddress.asInstanceOf[js.Any], TextToDisplay = TextToDisplay.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Hyperlink_typekey")(PowerPointDotHyperlink_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlink]
  }
  @scala.inline
  implicit class HyperlinkOps[Self <: Hyperlink] (val x: Self) extends AnyVal {
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
    def setAddToFavorites(value: () => Unit): Self = this.set("AddToFavorites", js.Any.fromFunction0(value))
    @scala.inline
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateNewDocument(value: (String, MsoTriState, MsoTriState) => Unit): Self = this.set("CreateNewDocument", js.Any.fromFunction3(value))
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setEmailSubject(value: String): Self = this.set("EmailSubject", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollow(value: () => Unit): Self = this.set("Follow", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotHyperlink_typekey(value: Hyperlink): Self = this.set("PowerPoint.Hyperlink_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenTip(value: String): Self = this.set("ScreenTip", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowAndReturn(value: MsoTriState): Self = this.set("ShowAndReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubAddress(value: String): Self = this.set("SubAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextToDisplay(value: String): Self = this.set("TextToDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MsoHyperlinkType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

