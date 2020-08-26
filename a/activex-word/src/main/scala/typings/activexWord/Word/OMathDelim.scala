package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathDelim extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var BegChar: Double = js.native
  val Creator: Double = js.native
  val E: OMathArgs = js.native
  var EndChar: Double = js.native
  var Grow: Boolean = js.native
  var NoLeftChar: Boolean = js.native
  var NoRightChar: Boolean = js.native
  val Parent: js.Any = js.native
  var SepChar: Double = js.native
  var Shape: WdOMathShapeType = js.native
  @JSName("Word.OMathDelim_typekey")
  var WordDotOMathDelim_typekey: OMathDelim = js.native
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
  @scala.inline
  implicit class OMathDelimOps[Self <: OMathDelim] (val x: Self) extends AnyVal {
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
    def setBegChar(value: Double): Self = this.set("BegChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: OMathArgs): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndChar(value: Double): Self = this.set("EndChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrow(value: Boolean): Self = this.set("Grow", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoLeftChar(value: Boolean): Self = this.set("NoLeftChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoRightChar(value: Boolean): Self = this.set("NoRightChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSepChar(value: Double): Self = this.set("SepChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: WdOMathShapeType): Self = this.set("Shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathDelim_typekey(value: OMathDelim): Self = this.set("Word.OMathDelim_typekey", value.asInstanceOf[js.Any])
  }
  
}

