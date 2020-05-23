package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoTextEntries extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.AutoTextEntries_typekey")
  var WordDotAutoTextEntries_typekey: AutoTextEntries
  def Add(Name: String, Range: Range): AutoTextEntry
  def AppendToSpike(Range: Range): AutoTextEntry
  def Item(Index: js.Any): AutoTextEntry
}

object AutoTextEntries {
  @scala.inline
  def apply(
    Add: (String, Range) => AutoTextEntry,
    AppendToSpike: Range => AutoTextEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoTextEntry,
    Parent: js.Any,
    WordDotAutoTextEntries_typekey: AutoTextEntries
  ): AutoTextEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AppendToSpike = js.Any.fromFunction1(AppendToSpike), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoTextEntries_typekey")(WordDotAutoTextEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTextEntries]
  }
}

