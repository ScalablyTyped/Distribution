package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathBox extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Diff: Boolean
  val E: OMath
  var NoBreak: Boolean
  var OpEmu: Boolean
  val Parent: js.Any
  @JSName("Word.OMathBox_typekey")
  var WordDotOMathBox_typekey: OMathBox
}

object OMathBox {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Diff: Boolean,
    E: OMath,
    NoBreak: Boolean,
    OpEmu: Boolean,
    Parent: js.Any,
    WordDotOMathBox_typekey: OMathBox
  ): OMathBox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Diff = Diff.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], NoBreak = NoBreak.asInstanceOf[js.Any], OpEmu = OpEmu.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBox_typekey")(WordDotOMathBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBox]
  }
}

