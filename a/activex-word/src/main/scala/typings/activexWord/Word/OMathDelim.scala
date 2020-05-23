package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathDelim extends js.Object {
  val Application: typings.activexWord.Word.Application
  var BegChar: Double
  val Creator: Double
  val E: OMathArgs
  var EndChar: Double
  var Grow: Boolean
  var NoLeftChar: Boolean
  var NoRightChar: Boolean
  val Parent: js.Any
  var SepChar: Double
  var Shape: WdOMathShapeType
  @JSName("Word.OMathDelim_typekey")
  var WordDotOMathDelim_typekey: OMathDelim
}

object OMathDelim {
  @scala.inline
  def apply(
    Application: Application,
    BegChar: Double,
    Creator: Double,
    E: OMathArgs,
    EndChar: Double,
    Grow: Boolean,
    NoLeftChar: Boolean,
    NoRightChar: Boolean,
    Parent: js.Any,
    SepChar: Double,
    Shape: WdOMathShapeType,
    WordDotOMathDelim_typekey: OMathDelim
  ): OMathDelim = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BegChar = BegChar.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], EndChar = EndChar.asInstanceOf[js.Any], Grow = Grow.asInstanceOf[js.Any], NoLeftChar = NoLeftChar.asInstanceOf[js.Any], NoRightChar = NoRightChar.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SepChar = SepChar.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathDelim_typekey")(WordDotOMathDelim_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathDelim]
  }
}

