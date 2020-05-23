package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMath extends js.Object {
  var AlignPoint: Double
  val Application: typings.activexWord.Word.Application
  val ArgIndex: Double
  var ArgSize: Double
  val Breaks: OMathBreaks
  val Creator: Double
  val Functions: OMathFunctions
  var Justification: WdOMathJc
  val NestingLevel: Double
  val Parent: js.Any
  val ParentArg: OMath
  val ParentCol: OMathMatCol
  val ParentFunction: OMathFunction
  val ParentOMath: OMath
  val ParentRow: OMathMatRow
  val Range: typings.activexWord.Word.Range
  var Type: WdOMathType
  @JSName("Word.OMath_typekey")
  var WordDotOMath_typekey: OMath
  def BuildUp(): Unit
  def ConvertToLiteralText(): Unit
  def ConvertToMathText(): Unit
  def ConvertToNormalText(): Unit
  def Linearize(): Unit
  def Remove(): Unit
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
}

