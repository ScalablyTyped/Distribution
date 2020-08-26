package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailMessage extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.MailMessage_typekey")
  var WordDotMailMessage_typekey: MailMessage = js.native
  def CheckName(): Unit = js.native
  def Delete(): Unit = js.native
  def DisplayMoveDialog(): Unit = js.native
  def DisplayProperties(): Unit = js.native
  def DisplaySelectNamesDialog(): Unit = js.native
  def Forward(): Unit = js.native
  def GoToNext(): Unit = js.native
  def GoToPrevious(): Unit = js.native
  def Reply(): Unit = js.native
  def ReplyAll(): Unit = js.native
  def ToggleHeader(): Unit = js.native
}

object MailMessage {
  @scala.inline
  def apply(
    Application: Application,
    CheckName: () => Unit,
    Creator: Double,
    Delete: () => Unit,
    DisplayMoveDialog: () => Unit,
    DisplayProperties: () => Unit,
    DisplaySelectNamesDialog: () => Unit,
    Forward: () => Unit,
    GoToNext: () => Unit,
    GoToPrevious: () => Unit,
    Parent: js.Any,
    Reply: () => Unit,
    ReplyAll: () => Unit,
    ToggleHeader: () => Unit,
    WordDotMailMessage_typekey: MailMessage
  ): MailMessage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CheckName = js.Any.fromFunction0(CheckName), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayMoveDialog = js.Any.fromFunction0(DisplayMoveDialog), DisplayProperties = js.Any.fromFunction0(DisplayProperties), DisplaySelectNamesDialog = js.Any.fromFunction0(DisplaySelectNamesDialog), Forward = js.Any.fromFunction0(Forward), GoToNext = js.Any.fromFunction0(GoToNext), GoToPrevious = js.Any.fromFunction0(GoToPrevious), Parent = Parent.asInstanceOf[js.Any], Reply = js.Any.fromFunction0(Reply), ReplyAll = js.Any.fromFunction0(ReplyAll), ToggleHeader = js.Any.fromFunction0(ToggleHeader))
    __obj.updateDynamic("Word.MailMessage_typekey")(WordDotMailMessage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMessage]
  }
  @scala.inline
  implicit class MailMessageOps[Self <: MailMessage] (val x: Self) extends AnyVal {
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
    def setCheckName(value: () => Unit): Self = this.set("CheckName", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayMoveDialog(value: () => Unit): Self = this.set("DisplayMoveDialog", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayProperties(value: () => Unit): Self = this.set("DisplayProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplaySelectNamesDialog(value: () => Unit): Self = this.set("DisplaySelectNamesDialog", js.Any.fromFunction0(value))
    @scala.inline
    def setForward(value: () => Unit): Self = this.set("Forward", js.Any.fromFunction0(value))
    @scala.inline
    def setGoToNext(value: () => Unit): Self = this.set("GoToNext", js.Any.fromFunction0(value))
    @scala.inline
    def setGoToPrevious(value: () => Unit): Self = this.set("GoToPrevious", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReply(value: () => Unit): Self = this.set("Reply", js.Any.fromFunction0(value))
    @scala.inline
    def setReplyAll(value: () => Unit): Self = this.set("ReplyAll", js.Any.fromFunction0(value))
    @scala.inline
    def setToggleHeader(value: () => Unit): Self = this.set("ToggleHeader", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotMailMessage_typekey(value: MailMessage): Self = this.set("Word.MailMessage_typekey", value.asInstanceOf[js.Any])
  }
  
}

