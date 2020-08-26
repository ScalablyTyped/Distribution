package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val CurrentEmailAuthor: EmailAuthor = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Email_typekey")
  var WordDotEmail_typekey: Email = js.native
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
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentEmailAuthor(value: EmailAuthor): Self = this.set("CurrentEmailAuthor", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotEmail_typekey(value: Email): Self = this.set("Word.Email_typekey", value.asInstanceOf[js.Any])
  }
  
}

