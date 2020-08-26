package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadingStyles extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.HeadingStyles_typekey")
  var WordDotHeadingStyles_typekey: HeadingStyles = js.native
  def Add(Style: js.Any, Level: Double): HeadingStyle = js.native
  def Item(Index: Double): HeadingStyle = js.native
}

object HeadingStyles {
  @scala.inline
  def apply(
    Add: (js.Any, Double) => HeadingStyle,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => HeadingStyle,
    Parent: js.Any,
    WordDotHeadingStyles_typekey: HeadingStyles
  ): HeadingStyles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadingStyles_typekey")(WordDotHeadingStyles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingStyles]
  }
  @scala.inline
  implicit class HeadingStylesOps[Self <: HeadingStyles] (val x: Self) extends AnyVal {
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
    def setAdd(value: (js.Any, Double) => HeadingStyle): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => HeadingStyle): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotHeadingStyles_typekey(value: HeadingStyles): Self = this.set("Word.HeadingStyles_typekey", value.asInstanceOf[js.Any])
  }
  
}

