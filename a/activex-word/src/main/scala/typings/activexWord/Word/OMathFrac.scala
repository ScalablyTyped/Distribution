package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathFrac extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Den: OMath
  val Num: OMath
  val Parent: js.Any
  var Type: WdOMathFracType
  @JSName("Word.OMathFrac_typekey")
  var WordDotOMathFrac_typekey: OMathFrac
}

object OMathFrac {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Den: OMath,
    Num: OMath,
    Parent: js.Any,
    Type: WdOMathFracType,
    WordDotOMathFrac_typekey: OMathFrac
  ): OMathFrac = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Den = Den.asInstanceOf[js.Any], Num = Num.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathFrac_typekey")(WordDotOMathFrac_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathFrac]
  }
}

