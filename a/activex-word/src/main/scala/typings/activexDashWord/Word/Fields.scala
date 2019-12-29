package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Fields")
@js.native
class Fields protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Locked: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Fields_typekey")
  var WordDotFields_typekey: Fields = js.native
  def Add(Range: Range): Field = js.native
  def Add(Range: Range, Type: js.Any): Field = js.native
  def Add(Range: Range, Type: js.Any, Text: js.Any): Field = js.native
  def Add(Range: Range, Type: js.Any, Text: js.Any, PreserveFormatting: js.Any): Field = js.native
  def Item(Index: Double): Field = js.native
  def ToggleShowCodes(): Unit = js.native
  def Unlink(): Unit = js.native
  def Update(): Double = js.native
  def UpdateSource(): Unit = js.native
}

