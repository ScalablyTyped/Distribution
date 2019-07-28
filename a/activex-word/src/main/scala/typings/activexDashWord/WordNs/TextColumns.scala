package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextColumns")
@js.native
class TextColumns protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var EvenlySpaced: Double = js.native
  var FlowDirection: WdFlowDirection = js.native
  var LineBetween: Double = js.native
  val Parent: js.Any = js.native
  var Spacing: Double = js.native
  var Width: Double = js.native
  var `Word.TextColumns_typekey`: TextColumns = js.native
  def Add(): TextColumn = js.native
  def Add(Width: js.Any): TextColumn = js.native
  def Add(Width: js.Any, Spacing: js.Any): TextColumn = js.native
  def Add(Width: js.Any, Spacing: js.Any, EvenlySpaced: js.Any): TextColumn = js.native
  def Item(Index: Double): TextColumn = js.native
  def SetCount(NumColumns: Double): Unit = js.native
}

