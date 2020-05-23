package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val CurrentEmailAuthor: EmailAuthor
  val Parent: js.Any
  @JSName("Word.Email_typekey")
  var WordDotEmail_typekey: Email
}

object Email {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    CurrentEmailAuthor: EmailAuthor,
    Parent: js.Any,
    WordDotEmail_typekey: Email
  ): Email = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CurrentEmailAuthor = CurrentEmailAuthor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Email_typekey")(WordDotEmail_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

