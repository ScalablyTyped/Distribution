package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathAutoCorrectEntries extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.OMathAutoCorrectEntries_typekey")
  var WordDotOMathAutoCorrectEntries_typekey: OMathAutoCorrectEntries
  def Add(Name: String, Value: String): OMathAutoCorrectEntry
  def Item(Index: js.Any): OMathAutoCorrectEntry
}

object OMathAutoCorrectEntries {
  @scala.inline
  def apply(
    Add: (String, String) => OMathAutoCorrectEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OMathAutoCorrectEntry,
    Parent: js.Any,
    WordDotOMathAutoCorrectEntries_typekey: OMathAutoCorrectEntries
  ): OMathAutoCorrectEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrectEntries_typekey")(WordDotOMathAutoCorrectEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrectEntries]
  }
}

