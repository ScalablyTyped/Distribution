package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathAutoCorrect extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Entries: OMathAutoCorrectEntries
  val Functions: OMathRecognizedFunctions
  val Parent: js.Any
  var ReplaceText: Boolean
  var UseOutsideOMath: Boolean
  @JSName("Word.OMathAutoCorrect_typekey")
  var WordDotOMathAutoCorrect_typekey: OMathAutoCorrect
}

object OMathAutoCorrect {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Entries: OMathAutoCorrectEntries,
    Functions: OMathRecognizedFunctions,
    Parent: js.Any,
    ReplaceText: Boolean,
    UseOutsideOMath: Boolean,
    WordDotOMathAutoCorrect_typekey: OMathAutoCorrect
  ): OMathAutoCorrect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], UseOutsideOMath = UseOutsideOMath.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrect_typekey")(WordDotOMathAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrect]
  }
}

