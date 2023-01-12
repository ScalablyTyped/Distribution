package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathFunction extends StObject {
  
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
  
  val Parent: Any
  
  val Phantom: OMathPhantom
  
  val Rad: OMathRad
  
  val Range: typings.activexWord.Word.Range
  
  def Remove(): OMathFunction
  
  val ScrPre: OMathScrPre
  
  val ScrSub: OMathScrSub
  
  val ScrSubSup: OMathScrSubSup
  
  val ScrSup: OMathScrSup
  
  val Type: WdOMathFunctionType
  
  /* private */ @JSName("Word.OMathFunction_typekey")
  var WordDotOMathFunction_typekey: OMathFunction
}
object OMathFunction {
  
  inline def apply(
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
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: OMathFunction] (val x: Self) extends AnyVal {
    
    inline def setAcc(value: OMathAcc): Self = StObject.set(x, "Acc", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: OMathArgs): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setBar(value: OMathBar): Self = StObject.set(x, "Bar", value.asInstanceOf[js.Any])
    
    inline def setBorderBox(value: OMathBorderBox): Self = StObject.set(x, "BorderBox", value.asInstanceOf[js.Any])
    
    inline def setBox(value: OMathBox): Self = StObject.set(x, "Box", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelim(value: OMathDelim): Self = StObject.set(x, "Delim", value.asInstanceOf[js.Any])
    
    inline def setEqArray(value: OMathEqArray): Self = StObject.set(x, "EqArray", value.asInstanceOf[js.Any])
    
    inline def setFrac(value: OMathFrac): Self = StObject.set(x, "Frac", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: OMathFunc): Self = StObject.set(x, "Func", value.asInstanceOf[js.Any])
    
    inline def setGroupChar(value: OMathGroupChar): Self = StObject.set(x, "GroupChar", value.asInstanceOf[js.Any])
    
    inline def setLimLow(value: OMathLimLow): Self = StObject.set(x, "LimLow", value.asInstanceOf[js.Any])
    
    inline def setLimUpp(value: OMathLimUpp): Self = StObject.set(x, "LimUpp", value.asInstanceOf[js.Any])
    
    inline def setMat(value: OMathMat): Self = StObject.set(x, "Mat", value.asInstanceOf[js.Any])
    
    inline def setNary(value: OMathNary): Self = StObject.set(x, "Nary", value.asInstanceOf[js.Any])
    
    inline def setOMath(value: OMath): Self = StObject.set(x, "OMath", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPhantom(value: OMathPhantom): Self = StObject.set(x, "Phantom", value.asInstanceOf[js.Any])
    
    inline def setRad(value: OMathRad): Self = StObject.set(x, "Rad", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: () => OMathFunction): Self = StObject.set(x, "Remove", js.Any.fromFunction0(value))
    
    inline def setScrPre(value: OMathScrPre): Self = StObject.set(x, "ScrPre", value.asInstanceOf[js.Any])
    
    inline def setScrSub(value: OMathScrSub): Self = StObject.set(x, "ScrSub", value.asInstanceOf[js.Any])
    
    inline def setScrSubSup(value: OMathScrSubSup): Self = StObject.set(x, "ScrSubSup", value.asInstanceOf[js.Any])
    
    inline def setScrSup(value: OMathScrSup): Self = StObject.set(x, "ScrSup", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdOMathFunctionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathFunction_typekey(value: OMathFunction): Self = StObject.set(x, "Word.OMathFunction_typekey", value.asInstanceOf[js.Any])
  }
}
