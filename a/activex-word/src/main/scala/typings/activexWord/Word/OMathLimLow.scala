package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathLimLow extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Lim: OMath = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathLimLow_typekey")
  var WordDotOMathLimLow_typekey: OMathLimLow = js.native
  def ToLimUpp(): OMathFunction = js.native
}

object OMathLimLow {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Lim: OMath,
    Parent: js.Any,
    ToLimUpp: () => OMathFunction,
    WordDotOMathLimLow_typekey: OMathLimLow
  ): OMathLimLow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Lim = Lim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ToLimUpp = js.Any.fromFunction0(ToLimUpp))
    __obj.updateDynamic("Word.OMathLimLow_typekey")(WordDotOMathLimLow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathLimLow]
  }
  @scala.inline
  implicit class OMathLimLowOps[Self <: OMathLimLow] (val x: Self) extends AnyVal {
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
    def setToLimUpp(value: () => OMathFunction): Self = this.set("ToLimUpp", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotOMathLimLow_typekey(value: OMathLimLow): Self = this.set("Word.OMathLimLow_typekey", value.asInstanceOf[js.Any])
  }
  
}

