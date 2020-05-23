package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathAcc extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Char: Double
  val Creator: Double
  val E: OMath
  val Parent: js.Any
  @JSName("Word.OMathAcc_typekey")
  var WordDotOMathAcc_typekey: OMathAcc
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
}

