package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathLimLow extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  val Lim: OMath
  val Parent: js.Any
  @JSName("Word.OMathLimLow_typekey")
  var WordDotOMathLimLow_typekey: OMathLimLow
  def ToLimUpp(): OMathFunction
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
}

