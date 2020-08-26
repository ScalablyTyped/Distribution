package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathAutoCorrect extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Entries: OMathAutoCorrectEntries = js.native
  val Functions: OMathRecognizedFunctions = js.native
  val Parent: js.Any = js.native
  var ReplaceText: Boolean = js.native
  var UseOutsideOMath: Boolean = js.native
  @JSName("Word.OMathAutoCorrect_typekey")
  var WordDotOMathAutoCorrect_typekey: OMathAutoCorrect = js.native
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
  @scala.inline
  implicit class OMathAutoCorrectOps[Self <: OMathAutoCorrect] (val x: Self) extends AnyVal {
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
    def setEntries(value: OMathAutoCorrectEntries): Self = this.set("Entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctions(value: OMathRecognizedFunctions): Self = this.set("Functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceText(value: Boolean): Self = this.set("ReplaceText", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseOutsideOMath(value: Boolean): Self = this.set("UseOutsideOMath", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathAutoCorrect_typekey(value: OMathAutoCorrect): Self = this.set("Word.OMathAutoCorrect_typekey", value.asInstanceOf[js.Any])
  }
  
}

