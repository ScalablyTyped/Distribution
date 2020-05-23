package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherCorrectionsException extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.OtherCorrectionsException_typekey")
  var WordDotOtherCorrectionsException_typekey: OtherCorrectionsException
  def Delete(): Unit
}

object OtherCorrectionsException {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotOtherCorrectionsException_typekey: OtherCorrectionsException
  ): OtherCorrectionsException = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OtherCorrectionsException_typekey")(WordDotOtherCorrectionsException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCorrectionsException]
  }
}

