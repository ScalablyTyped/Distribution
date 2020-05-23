package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathFunctions extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathFunctions_typekey")
  var WordDotOMathFunctions_typekey: OMathFunctions = js.native
  def Add(Range: Range, Type: WdOMathFunctionType): OMathFunction = js.native
  def Add(Range: Range, Type: WdOMathFunctionType, NumArgs: js.Any): OMathFunction = js.native
  def Add(Range: Range, Type: WdOMathFunctionType, NumArgs: js.Any, NumCols: js.Any): OMathFunction = js.native
  def Item(Index: Double): OMathFunction = js.native
}

