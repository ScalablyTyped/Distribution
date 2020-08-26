package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstLetterExceptions extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.FirstLetterExceptions_typekey")
  var WordDotFirstLetterExceptions_typekey: FirstLetterExceptions = js.native
  def Add(Name: String): FirstLetterException = js.native
  def Item(Index: js.Any): FirstLetterException = js.native
}

object FirstLetterExceptions {
  @scala.inline
  def apply(
    Add: String => FirstLetterException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => FirstLetterException,
    Parent: js.Any,
    WordDotFirstLetterExceptions_typekey: FirstLetterExceptions
  ): FirstLetterExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FirstLetterExceptions_typekey")(WordDotFirstLetterExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstLetterExceptions]
  }
  @scala.inline
  implicit class FirstLetterExceptionsOps[Self <: FirstLetterExceptions] (val x: Self) extends AnyVal {
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
    def setAdd(value: String => FirstLetterException): Self = this.set("Add", js.Any.fromFunction1(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => FirstLetterException): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotFirstLetterExceptions_typekey(value: FirstLetterExceptions): Self = this.set("Word.FirstLetterExceptions_typekey", value.asInstanceOf[js.Any])
  }
  
}

