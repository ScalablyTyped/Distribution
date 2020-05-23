package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailMessage extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.MailMessage_typekey")
  var WordDotMailMessage_typekey: MailMessage
  def CheckName(): Unit
  def Delete(): Unit
  def DisplayMoveDialog(): Unit
  def DisplayProperties(): Unit
  def DisplaySelectNamesDialog(): Unit
  def Forward(): Unit
  def GoToNext(): Unit
  def GoToPrevious(): Unit
  def Reply(): Unit
  def ReplyAll(): Unit
  def ToggleHeader(): Unit
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
}

