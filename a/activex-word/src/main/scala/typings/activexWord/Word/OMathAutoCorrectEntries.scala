package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathAutoCorrectEntries extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathAutoCorrectEntries_typekey")
  var WordDotOMathAutoCorrectEntries_typekey: OMathAutoCorrectEntries = js.native
  def Add(Name: String, Value: String): OMathAutoCorrectEntry = js.native
  def Item(Index: js.Any): OMathAutoCorrectEntry = js.native
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
  @scala.inline
  implicit class OMathAutoCorrectEntriesOps[Self <: OMathAutoCorrectEntries] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, String) => OMathAutoCorrectEntry): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => OMathAutoCorrectEntry): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathAutoCorrectEntries_typekey(value: OMathAutoCorrectEntries): Self = this.set("Word.OMathAutoCorrectEntries_typekey", value.asInstanceOf[js.Any])
  }
  
}

