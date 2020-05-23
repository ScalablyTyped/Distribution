package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstLetterException extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.FirstLetterException_typekey")
  var WordDotFirstLetterException_typekey: FirstLetterException
  def Delete(): Unit
}

object FirstLetterException {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotFirstLetterException_typekey: FirstLetterException
  ): FirstLetterException = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FirstLetterException_typekey")(WordDotFirstLetterException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstLetterException]
  }
}

