package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextColumns")
@js.native
class TextColumns protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var EvenlySpaced: scala.Double = js.native
  var FlowDirection: WdFlowDirection = js.native
  var LineBetween: scala.Double = js.native
  val Parent: js.Any = js.native
  var Spacing: scala.Double = js.native
  var Width: scala.Double = js.native
  var `Word.TextColumns_typekey`: TextColumns = js.native
  def Add(): TextColumn = js.native
  def Add(Width: js.Any): TextColumn = js.native
  def Add(Width: js.Any, Spacing: js.Any): TextColumn = js.native
  def Add(Width: js.Any, Spacing: js.Any, EvenlySpaced: js.Any): TextColumn = js.native
  def Item(Index: scala.Double): TextColumn = js.native
  def SetCount(NumColumns: scala.Double): scala.Unit = js.native
}

