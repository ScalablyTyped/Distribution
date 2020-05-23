package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAuthor extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  val Style: typings.activexWord.Word.Style
  @JSName("Word.EmailAuthor_typekey")
  var WordDotEmailAuthor_typekey: EmailAuthor
}

object EmailAuthor {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Style: Style,
    WordDotEmailAuthor_typekey: EmailAuthor
  ): EmailAuthor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailAuthor_typekey")(WordDotEmailAuthor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAuthor]
  }
}

