package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HangulAndAlphabetExceptions extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.HangulAndAlphabetExceptions_typekey")
  var WordDotHangulAndAlphabetExceptions_typekey: HangulAndAlphabetExceptions = js.native
  def Add(Name: String): HangulAndAlphabetException = js.native
  def Item(Index: js.Any): HangulAndAlphabetException = js.native
}

object HangulAndAlphabetExceptions {
  @scala.inline
  def apply(
    Add: String => HangulAndAlphabetException,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => HangulAndAlphabetException,
    Parent: js.Any,
    WordDotHangulAndAlphabetExceptions_typekey: HangulAndAlphabetExceptions
  ): HangulAndAlphabetExceptions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HangulAndAlphabetExceptions_typekey")(WordDotHangulAndAlphabetExceptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HangulAndAlphabetExceptions]
  }
  @scala.inline
  implicit class HangulAndAlphabetExceptionsOps[Self <: HangulAndAlphabetExceptions] (val x: Self) extends AnyVal {
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
    def setAdd(value: String => HangulAndAlphabetException): Self = this.set("Add", js.Any.fromFunction1(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any => HangulAndAlphabetException): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotHangulAndAlphabetExceptions_typekey(value: HangulAndAlphabetExceptions): Self = this.set("Word.HangulAndAlphabetExceptions_typekey", value.asInstanceOf[js.Any])
  }
  
}

