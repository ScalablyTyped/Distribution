package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathAcc extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Char: Double = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathAcc_typekey")
  var WordDotOMathAcc_typekey: OMathAcc = js.native
}

object OMathAcc {
  @scala.inline
  def apply(
    Application: Application,
    Char: Double,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathAcc_typekey: OMathAcc
  ): OMathAcc = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAcc_typekey")(WordDotOMathAcc_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAcc]
  }
  @scala.inline
  implicit class OMathAccOps[Self <: OMathAcc] (val x: Self) extends AnyVal {
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
    def setChar(value: Double): Self = this.set("Char", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: OMath): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathAcc_typekey(value: OMathAcc): Self = this.set("Word.OMathAcc_typekey", value.asInstanceOf[js.Any])
  }
  
}

