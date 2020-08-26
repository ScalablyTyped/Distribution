package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathScrPre extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val Parent: js.Any = js.native
  val Sub: OMath = js.native
  val Sup: OMath = js.native
  @JSName("Word.OMathScrPre_typekey")
  var WordDotOMathScrPre_typekey: OMathScrPre = js.native
  def ToScrSubSup(): OMathFunction = js.native
}

object OMathScrPre {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    Sub: OMath,
    Sup: OMath,
    ToScrSubSup: () => OMathFunction,
    WordDotOMathScrPre_typekey: OMathScrPre
  ): OMathScrPre = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any], ToScrSubSup = js.Any.fromFunction0(ToScrSubSup))
    __obj.updateDynamic("Word.OMathScrPre_typekey")(WordDotOMathScrPre_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrPre]
  }
  @scala.inline
  implicit class OMathScrPreOps[Self <: OMathScrPre] (val x: Self) extends AnyVal {
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
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSub(value: OMath): Self = this.set("Sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setSup(value: OMath): Self = this.set("Sup", value.asInstanceOf[js.Any])
    @scala.inline
    def setToScrSubSup(value: () => OMathFunction): Self = this.set("ToScrSubSup", js.Any.fromFunction0(value))
    @scala.inline
    def setWordDotOMathScrPre_typekey(value: OMathScrPre): Self = this.set("Word.OMathScrPre_typekey", value.asInstanceOf[js.Any])
  }
  
}

