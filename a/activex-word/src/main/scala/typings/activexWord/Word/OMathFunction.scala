package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathFunction extends js.Object {
  val Acc: OMathAcc
  val Application: typings.activexWord.Word.Application
  val Args: OMathArgs
  val Bar: OMathBar
  val BorderBox: OMathBorderBox
  val Box: OMathBox
  val Creator: Double
  val Delim: OMathDelim
  val EqArray: OMathEqArray
  val Frac: OMathFrac
  val Func: OMathFunc
  val GroupChar: OMathGroupChar
  val LimLow: OMathLimLow
  val LimUpp: OMathLimUpp
  val Mat: OMathMat
  val Nary: OMathNary
  val OMath: typings.activexWord.Word.OMath
  val Parent: js.Any
  val Phantom: OMathPhantom
  val Rad: OMathRad
  val Range: typings.activexWord.Word.Range
  val ScrPre: OMathScrPre
  val ScrSub: OMathScrSub
  val ScrSubSup: OMathScrSubSup
  val ScrSup: OMathScrSup
  val Type: WdOMathFunctionType
  @JSName("Word.OMathFunction_typekey")
  var WordDotOMathFunction_typekey: OMathFunction
  def Remove(): OMathFunction
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
}

