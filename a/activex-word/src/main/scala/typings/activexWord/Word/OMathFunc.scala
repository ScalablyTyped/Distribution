package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathFunc extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val E: OMath = js.native
  val FName: OMath = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathFunc_typekey")
  var WordDotOMathFunc_typekey: OMathFunc = js.native
}

object OMathFunc {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    FName: OMath,
    Parent: js.Any,
    WordDotOMathFunc_typekey: OMathFunc
  ): OMathFunc = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], FName = FName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathFunc_typekey")(WordDotOMathFunc_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathFunc]
  }
  @scala.inline
  implicit class OMathFuncOps[Self <: OMathFunc] (val x: Self) extends AnyVal {
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
    def setFName(value: OMath): Self = this.set("FName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathFunc_typekey(value: OMathFunc): Self = this.set("Word.OMathFunc_typekey", value.asInstanceOf[js.Any])
  }
  
}

