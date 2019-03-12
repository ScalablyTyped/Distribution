package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Tables")
@js.native
class Tables protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val NestingLevel: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.Tables_typekey`: Tables = js.native
  def Add(Range: Range, NumRows: scala.Double, NumColumns: scala.Double): Table = js.native
  def Add(Range: Range, NumRows: scala.Double, NumColumns: scala.Double, DefaultTableBehavior: js.Any): Table = js.native
  def Add(
    Range: Range,
    NumRows: scala.Double,
    NumColumns: scala.Double,
    DefaultTableBehavior: js.Any,
    AutoFitBehavior: js.Any
  ): Table = js.native
  def AddOld(Range: Range, NumRows: scala.Double, NumColumns: scala.Double): Table = js.native
  def Item(Index: scala.Double): Table = js.native
}

