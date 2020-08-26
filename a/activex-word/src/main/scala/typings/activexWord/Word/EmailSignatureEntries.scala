package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailSignatureEntries extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.EmailSignatureEntries_typekey")
  var WordDotEmailSignatureEntries_typekey: EmailSignatureEntries = js.native
  def Add(Name: String, Range: Range): EmailSignatureEntry = js.native
  def Item(Index: js.Any): EmailSignatureEntry = js.native
}

object EmailSignatureEntries {
  @scala.inline
  def apply(
    Add: (String, Range) => EmailSignatureEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => EmailSignatureEntry,
    Parent: js.Any,
    WordDotEmailSignatureEntries_typekey: EmailSignatureEntries
  ): EmailSignatureEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailSignatureEntries_typekey")(WordDotEmailSignatureEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignatureEntries]
  }
  @scala.inline
  implicit class EmailSignatureEntriesOps[Self <: EmailSignatureEntries] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, Range) => EmailSignatureEntry): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => EmailSignatureEntry): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotEmailSignatureEntries_typekey(value: EmailSignatureEntries): Self = this.set("Word.EmailSignatureEntries_typekey", value.asInstanceOf[js.Any])
  }
  
}

