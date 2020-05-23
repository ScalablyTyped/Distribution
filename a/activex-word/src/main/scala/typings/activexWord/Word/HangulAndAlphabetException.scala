package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HangulAndAlphabetException extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.HangulAndAlphabetException_typekey")
  var WordDotHangulAndAlphabetException_typekey: HangulAndAlphabetException
  def Delete(): Unit
}

object HangulAndAlphabetException {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotHangulAndAlphabetException_typekey: HangulAndAlphabetException
  ): HangulAndAlphabetException = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HangulAndAlphabetException_typekey")(WordDotHangulAndAlphabetException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HangulAndAlphabetException]
  }
}

