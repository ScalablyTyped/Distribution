package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathGroupChar extends js.Object {
  var AlignTop: Boolean
  val Application: typings.activexWord.Word.Application
  var Char: Double
  var CharTop: Boolean
  val Creator: Double
  val E: OMath
  val Parent: js.Any
  @JSName("Word.OMathGroupChar_typekey")
  var WordDotOMathGroupChar_typekey: OMathGroupChar
}

object OMathGroupChar {
  @scala.inline
  def apply(
    AlignTop: Boolean,
    Application: Application,
    Char: Double,
    CharTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathGroupChar_typekey: OMathGroupChar
  ): OMathGroupChar = {
    val __obj = js.Dynamic.literal(AlignTop = AlignTop.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharTop = CharTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathGroupChar_typekey")(WordDotOMathGroupChar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathGroupChar]
  }
}

