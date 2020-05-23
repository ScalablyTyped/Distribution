package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathLimUpp extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  val Lim: OMath
  val Parent: js.Any
  @JSName("Word.OMathLimUpp_typekey")
  var WordDotOMathLimUpp_typekey: OMathLimUpp
  def ToLimLow(): OMathFunction
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
}

