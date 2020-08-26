package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrectEntries extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AutoCorrectEntries_typekey")
  var WordDotAutoCorrectEntries_typekey: AutoCorrectEntries = js.native
  def Add(Name: String, Value: String): AutoCorrectEntry = js.native
  def AddRichText(Name: String, Range: Range): AutoCorrectEntry = js.native
  def Item(Index: js.Any): AutoCorrectEntry = js.native
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
  @scala.inline
  implicit class AutoCorrectEntriesOps[Self <: AutoCorrectEntries] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, String) => AutoCorrectEntry): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setAddRichText(value: (String, Range) => AutoCorrectEntry): Self = this.set("AddRichText", js.Any.fromFunction2(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => AutoCorrectEntry): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotAutoCorrectEntries_typekey(value: AutoCorrectEntries): Self = this.set("Word.AutoCorrectEntries_typekey", value.asInstanceOf[js.Any])
  }
  
}

