package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCorrectEntries extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.AutoCorrectEntries_typekey")
  var WordDotAutoCorrectEntries_typekey: AutoCorrectEntries
  def Add(Name: String, Value: String): AutoCorrectEntry
  def AddRichText(Name: String, Range: Range): AutoCorrectEntry
  def Item(Index: js.Any): AutoCorrectEntry
}

object AutoCorrectEntries {
  @scala.inline
  def apply(
    Add: (String, String) => AutoCorrectEntry,
    AddRichText: (String, Range) => AutoCorrectEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoCorrectEntry,
    Parent: js.Any,
    WordDotAutoCorrectEntries_typekey: AutoCorrectEntries
  ): AutoCorrectEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddRichText = js.Any.fromFunction2(AddRichText), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrectEntries_typekey")(WordDotAutoCorrectEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrectEntries]
  }
}

