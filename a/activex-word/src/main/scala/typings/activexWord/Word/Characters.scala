package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Characters extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val First: Range = js.native
  val Last: Range = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Characters_typekey")
  var WordDotCharacters_typekey: Characters = js.native
  def Item(Index: Double): Range = js.native
}

object Characters {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    First: Range,
    Item: Double => Range,
    Last: Range,
    Parent: js.Any,
    WordDotCharacters_typekey: Characters
  ): Characters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Last = Last.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Characters_typekey")(WordDotCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characters]
  }
  @scala.inline
  implicit class CharactersOps[Self <: Characters] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst(value: Range): Self = this.set("First", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => Range): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setLast(value: Range): Self = this.set("Last", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotCharacters_typekey(value: Characters): Self = this.set("Word.Characters_typekey", value.asInstanceOf[js.Any])
  }
  
}

