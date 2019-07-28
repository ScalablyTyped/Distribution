package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Tables")
@js.native
class Tables protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val NestingLevel: Double = js.native
  val Parent: js.Any = js.native
  var `Word.Tables_typekey`: Tables = js.native
  def Add(Range: Range, NumRows: Double, NumColumns: Double): Table = js.native
  def Add(Range: Range, NumRows: Double, NumColumns: Double, DefaultTableBehavior: js.Any): Table = js.native
  def Add(
    Range: Range,
    NumRows: Double,
    NumColumns: Double,
    DefaultTableBehavior: js.Any,
    AutoFitBehavior: js.Any
  ): Table = js.native
  def AddOld(Range: Range, NumRows: Double, NumColumns: Double): Table = js.native
  def Item(Index: Double): Table = js.native
}

