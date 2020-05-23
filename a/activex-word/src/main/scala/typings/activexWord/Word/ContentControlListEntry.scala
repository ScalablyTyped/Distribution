package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentControlListEntry extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Index: Double
  val Parent: js.Any
  var Text: String
  var Value: String
  @JSName("Word.ContentControlListEntry_typekey")
  var WordDotContentControlListEntry_typekey: ContentControlListEntry
  def Delete(): Unit
  def MoveDown(): Unit
  def MoveUp(): Unit
  def Select(): Unit
}

object ContentControlListEntry {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    MoveDown: () => Unit,
    MoveUp: () => Unit,
    Parent: js.Any,
    Select: () => Unit,
    Text: String,
    Value: String,
    WordDotContentControlListEntry_typekey: ContentControlListEntry
  ): ContentControlListEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], MoveDown = js.Any.fromFunction0(MoveDown), MoveUp = js.Any.fromFunction0(MoveUp), Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Text = Text.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ContentControlListEntry_typekey")(WordDotContentControlListEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlListEntry]
  }
}

