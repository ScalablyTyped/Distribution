package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathFunction extends js.Object {
  val Acc: OMathAcc = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Args: OMathArgs = js.native
  val Bar: OMathBar = js.native
  val BorderBox: OMathBorderBox = js.native
  val Box: OMathBox = js.native
  val Creator: Double = js.native
  val Delim: OMathDelim = js.native
  val EqArray: OMathEqArray = js.native
  val Frac: OMathFrac = js.native
  val Func: OMathFunc = js.native
  val GroupChar: OMathGroupChar = js.native
  val LimLow: OMathLimLow = js.native
  val LimUpp: OMathLimUpp = js.native
  val Mat: OMathMat = js.native
  val Nary: OMathNary = js.native
  val OMath: typings.activexWord.Word.OMath = js.native
  val Parent: js.Any = js.native
  val Phantom: OMathPhantom = js.native
  val Rad: OMathRad = js.native
  val Range: typings.activexWord.Word.Range = js.native
  val ScrPre: OMathScrPre = js.native
  val ScrSub: OMathScrSub = js.native
  val ScrSubSup: OMathScrSubSup = js.native
  val ScrSup: OMathScrSup = js.native
  val Type: WdOMathFunctionType = js.native
  @JSName("Word.OMathFunction_typekey")
  var WordDotOMathFunction_typekey: OMathFunction = js.native
  def Remove(): OMathFunction = js.native
}

object OMathFunction {
  @scala.inline
  def apply(
    Acc: OMathAcc,
    Application: Application,
    Args: OMathArgs,
    Bar: OMathBar,
    BorderBox: OMathBorderBox,
    Box: OMathBox,
    Creator: Double,
    Delim: OMathDelim,
    EqArray: OMathEqArray,
    Frac: OMathFrac,
    Func: OMathFunc,
    GroupChar: OMathGroupChar,
    LimLow: OMathLimLow,
    LimUpp: OMathLimUpp,
    Mat: OMathMat,
    Nary: OMathNary,
    OMath: OMath,
    Parent: js.Any,
    Phantom: OMathPhantom,
    Rad: OMathRad,
    Range: Range,
    Remove: () => OMathFunction,
    ScrPre: OMathScrPre,
    ScrSub: OMathScrSub,
    ScrSubSup: OMathScrSubSup,
    ScrSup: OMathScrSup,
    Type: WdOMathFunctionType,
    WordDotOMathFunction_typekey: OMathFunction
  ): OMathFunction = {
    val __obj = js.Dynamic.literal(Acc = Acc.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Bar = Bar.asInstanceOf[js.Any], BorderBox = BorderBox.asInstanceOf[js.Any], Box = Box.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delim = Delim.asInstanceOf[js.Any], EqArray = EqArray.asInstanceOf[js.Any], Frac = Frac.asInstanceOf[js.Any], Func = Func.asInstanceOf[js.Any], GroupChar = GroupChar.asInstanceOf[js.Any], LimLow = LimLow.asInstanceOf[js.Any], LimUpp = LimUpp.asInstanceOf[js.Any], Mat = Mat.asInstanceOf[js.Any], Nary = Nary.asInstanceOf[js.Any], OMath = OMath.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Phantom = Phantom.asInstanceOf[js.Any], Rad = Rad.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), ScrPre = ScrPre.asInstanceOf[js.Any], ScrSub = ScrSub.asInstanceOf[js.Any], ScrSubSup = ScrSubSup.asInstanceOf[js.Any], ScrSup = ScrSup.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathFunction_typekey")(WordDotOMathFunction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathFunction]
  }
  @scala.inline
  implicit class OMathFunctionOps[Self <: OMathFunction] (val x: Self) extends AnyVal {
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
    def setAcc(value: OMathAcc): Self = this.set("Acc", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: OMathArgs): Self = this.set("Args", value.asInstanceOf[js.Any])
    @scala.inline
    def setBar(value: OMathBar): Self = this.set("Bar", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderBox(value: OMathBorderBox): Self = this.set("BorderBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setBox(value: OMathBox): Self = this.set("Box", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelim(value: OMathDelim): Self = this.set("Delim", value.asInstanceOf[js.Any])
    @scala.inline
    def setEqArray(value: OMathEqArray): Self = this.set("EqArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrac(value: OMathFrac): Self = this.set("Frac", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunc(value: OMathFunc): Self = this.set("Func", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupChar(value: OMathGroupChar): Self = this.set("GroupChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimLow(value: OMathLimLow): Self = this.set("LimLow", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimUpp(value: OMathLimUpp): Self = this.set("LimUpp", value.asInstanceOf[js.Any])
    @scala.inline
    def setMat(value: OMathMat): Self = this.set("Mat", value.asInstanceOf[js.Any])
    @scala.inline
    def setNary(value: OMathNary): Self = this.set("Nary", value.asInstanceOf[js.Any])
    @scala.inline
    def setOMath(value: OMath): Self = this.set("OMath", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhantom(value: OMathPhantom): Self = this.set("Phantom", value.asInstanceOf[js.Any])
    @scala.inline
    def setRad(value: OMathRad): Self = this.set("Rad", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: () => OMathFunction): Self = this.set("Remove", js.Any.fromFunction0(value))
    @scala.inline
    def setScrPre(value: OMathScrPre): Self = this.set("ScrPre", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrSub(value: OMathScrSub): Self = this.set("ScrSub", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrSubSup(value: OMathScrSubSup): Self = this.set("ScrSubSup", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrSup(value: OMathScrSup): Self = this.set("ScrSup", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WdOMathFunctionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathFunction_typekey(value: OMathFunction): Self = this.set("Word.OMathFunction_typekey", value.asInstanceOf[js.Any])
  }
  
}

