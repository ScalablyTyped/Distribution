package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathFunc extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMath
  val FName: OMath
  val Parent: js.Any
  @JSName("Word.OMathFunc_typekey")
  var WordDotOMathFunc_typekey: OMathFunc
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
}

