package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingStyles extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.HeadingStyles_typekey")
  var WordDotHeadingStyles_typekey: HeadingStyles
  def Add(Style: js.Any, Level: Double): HeadingStyle
  def Item(Index: Double): HeadingStyle
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
}

