package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingStyle extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Level: Double
  val Parent: js.Any
  var Style: js.Any
  @JSName("Word.HeadingStyle_typekey")
  var WordDotHeadingStyle_typekey: HeadingStyle
  def Delete(): Unit
}

object HeadingStyle {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Level: Double,
    Parent: js.Any,
    Style: js.Any,
    WordDotHeadingStyle_typekey: HeadingStyle
  ): HeadingStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Level = Level.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadingStyle_typekey")(WordDotHeadingStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingStyle]
  }
}

