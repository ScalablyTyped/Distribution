package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCorrectEntry extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  var Name: String
  val Parent: js.Any
  val RichText: Boolean
  var Value: String
  @JSName("Word.AutoCorrectEntry_typekey")
  var WordDotAutoCorrectEntry_typekey: AutoCorrectEntry
  def Apply(Range: Range): Unit
  def Delete(): Unit
}

object AutoCorrectEntry {
  @scala.inline
  def apply(
    Application: Application,
    Apply: Range => Unit,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    RichText: Boolean,
    Value: String,
    WordDotAutoCorrectEntry_typekey: AutoCorrectEntry
  ): AutoCorrectEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction1(Apply), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RichText = RichText.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrectEntry_typekey")(WordDotAutoCorrectEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrectEntry]
  }
}

