package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMath extends js.Object {
  
  var AlignPoint: Double = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val ArgIndex: Double = js.native
  
  var ArgSize: Double = js.native
  
  val Breaks: OMathBreaks = js.native
  
  def BuildUp(): Unit = js.native
  
  def ConvertToLiteralText(): Unit = js.native
  
  def ConvertToMathText(): Unit = js.native
  
  def ConvertToNormalText(): Unit = js.native
  
  val Creator: Double = js.native
  
  val Functions: OMathFunctions = js.native
  
  var Justification: WdOMathJc = js.native
  
  def Linearize(): Unit = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: js.Any = js.native
  
  val ParentArg: OMath = js.native
  
  val ParentCol: OMathMatCol = js.native
  
  val ParentFunction: OMathFunction = js.native
  
  val ParentOMath: OMath = js.native
  
  val ParentRow: OMathMatRow = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  def Remove(): Unit = js.native
  
  var Type: WdOMathType = js.native
  
  @JSName("Word.OMath_typekey")
  var WordDotOMath_typekey: OMath = js.native
}
object OMath {
  
  @scala.inline
  def apply(
    AlignPoint: Double,
    Application: Application,
    ArgIndex: Double,
    ArgSize: Double,
    Breaks: OMathBreaks,
    BuildUp: () => Unit,
    ConvertToLiteralText: () => Unit,
    ConvertToMathText: () => Unit,
    ConvertToNormalText: () => Unit,
    Creator: Double,
    Functions: OMathFunctions,
    Justification: WdOMathJc,
    Linearize: () => Unit,
    NestingLevel: Double,
    Parent: js.Any,
    ParentArg: OMath,
    ParentCol: OMathMatCol,
    ParentFunction: OMathFunction,
    ParentOMath: OMath,
    ParentRow: OMathMatRow,
    Range: Range,
    Remove: () => Unit,
    Type: WdOMathType,
    WordDotOMath_typekey: OMath
  ): OMath = {
    val __obj = js.Dynamic.literal(AlignPoint = AlignPoint.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ArgIndex = ArgIndex.asInstanceOf[js.Any], ArgSize = ArgSize.asInstanceOf[js.Any], Breaks = Breaks.asInstanceOf[js.Any], BuildUp = js.Any.fromFunction0(BuildUp), ConvertToLiteralText = js.Any.fromFunction0(ConvertToLiteralText), ConvertToMathText = js.Any.fromFunction0(ConvertToMathText), ConvertToNormalText = js.Any.fromFunction0(ConvertToNormalText), Creator = Creator.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], Justification = Justification.asInstanceOf[js.Any], Linearize = js.Any.fromFunction0(Linearize), NestingLevel = NestingLevel.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentArg = ParentArg.asInstanceOf[js.Any], ParentCol = ParentCol.asInstanceOf[js.Any], ParentFunction = ParentFunction.asInstanceOf[js.Any], ParentOMath = ParentOMath.asInstanceOf[js.Any], ParentRow = ParentRow.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMath_typekey")(WordDotOMath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMath]
  }
  
  @scala.inline
  implicit class OMathOps[Self <: OMath] (val x: Self) extends AnyVal {
    
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
    def setAlignPoint(value: Double): Self = this.set("AlignPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgIndex(value: Double): Self = this.set("ArgIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgSize(value: Double): Self = this.set("ArgSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreaks(value: OMathBreaks): Self = this.set("Breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUp(value: () => Unit): Self = this.set("BuildUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertToLiteralText(value: () => Unit): Self = this.set("ConvertToLiteralText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertToMathText(value: () => Unit): Self = this.set("ConvertToMathText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertToNormalText(value: () => Unit): Self = this.set("ConvertToNormalText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctions(value: OMathFunctions): Self = this.set("Functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustification(value: WdOMathJc): Self = this.set("Justification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearize(value: () => Unit): Self = this.set("Linearize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNestingLevel(value: Double): Self = this.set("NestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentArg(value: OMath): Self = this.set("ParentArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCol(value: OMathMatCol): Self = this.set("ParentCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFunction(value: OMathFunction): Self = this.set("ParentFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentOMath(value: OMath): Self = this.set("ParentOMath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRow(value: OMathMatRow): Self = this.set("ParentRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("Remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: WdOMathType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMath_typekey(value: OMath): Self = this.set("Word.OMath_typekey", value.asInstanceOf[js.Any])
  }
}
