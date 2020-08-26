package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrectEntry extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  val RichText: Boolean = js.native
  var Value: String = js.native
  @JSName("Word.AutoCorrectEntry_typekey")
  var WordDotAutoCorrectEntry_typekey: AutoCorrectEntry = js.native
  def Apply(Range: Range): Unit = js.native
  def Delete(): Unit = js.native
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
  @scala.inline
  implicit class AutoCorrectEntryOps[Self <: AutoCorrectEntry] (val x: Self) extends AnyVal {
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
    def setApply(value: Range => Unit): Self = this.set("Apply", js.Any.fromFunction1(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRichText(value: Boolean): Self = this.set("RichText", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotAutoCorrectEntry_typekey(value: AutoCorrectEntry): Self = this.set("Word.AutoCorrectEntry_typekey", value.asInstanceOf[js.Any])
  }
  
}

