package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathLimUpp extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Lim: OMath = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathLimUpp_typekey")
  var WordDotOMathLimUpp_typekey: OMathLimUpp = js.native
  def ToLimLow(): OMathFunction = js.native
}

object OMathLimUpp {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Lim: OMath,
    Parent: js.Any,
    ToLimLow: () => OMathFunction,
    WordDotOMathLimUpp_typekey: OMathLimUpp
  ): OMathLimUpp = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Lim = Lim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ToLimLow = js.Any.fromFunction0(ToLimLow))
    __obj.updateDynamic("Word.OMathLimUpp_typekey")(WordDotOMathLimUpp_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathLimUpp]
  }
  @scala.inline
  implicit class OMathLimUppOps[Self <: OMathLimUpp] (val x: Self) extends AnyVal {
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
    def setE(value: OMath): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def setLim(value: OMath): Self = this.set("Lim", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setToLimLow(value: () => OMathFunction): Self = this.set("ToLimLow", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotOMathLimUpp_typekey(value: OMathLimUpp): Self = this.set("Word.OMathLimUpp_typekey", value.asInstanceOf[js.Any])
  }
  
}

