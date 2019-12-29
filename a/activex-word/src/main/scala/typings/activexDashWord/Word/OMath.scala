package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.OMath")
@js.native
class OMath protected () extends js.Object {
  var AlignPoint: Double = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  val ArgIndex: Double = js.native
  var ArgSize: Double = js.native
  val Breaks: OMathBreaks = js.native
  val Creator: Double = js.native
  val Functions: OMathFunctions = js.native
  var Justification: WdOMathJc = js.native
  val NestingLevel: Double = js.native
  val Parent: js.Any = js.native
  val ParentArg: OMath = js.native
  val ParentCol: OMathMatCol = js.native
  val ParentFunction: OMathFunction = js.native
  val ParentOMath: OMath = js.native
  val ParentRow: OMathMatRow = js.native
  val Range: typings.activexDashWord.Word.Range = js.native
  var Type: WdOMathType = js.native
  @JSName("Word.OMath_typekey")
  var WordDotOMath_typekey: OMath = js.native
  def BuildUp(): Unit = js.native
  def ConvertToLiteralText(): Unit = js.native
  def ConvertToMathText(): Unit = js.native
  def ConvertToNormalText(): Unit = js.native
  def Linearize(): Unit = js.native
  def Remove(): Unit = js.native
}

