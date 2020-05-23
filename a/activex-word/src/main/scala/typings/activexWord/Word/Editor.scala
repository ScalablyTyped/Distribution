package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editor extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val ID: String
  val Name: String
  val NextRange: typings.activexWord.Word.Range
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  @JSName("Word.Editor_typekey")
  var WordDotEditor_typekey: Editor
  def Delete(): Unit
  def DeleteAll(): Unit
  def SelectAll(): Unit
}

object Editor {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DeleteAll: () => Unit,
    ID: String,
    Name: String,
    NextRange: Range,
    Parent: js.Any,
    Range: Range,
    SelectAll: () => Unit,
    WordDotEditor_typekey: Editor
  ): Editor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DeleteAll = js.Any.fromFunction0(DeleteAll), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NextRange = NextRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("Word.Editor_typekey")(WordDotEditor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
}

