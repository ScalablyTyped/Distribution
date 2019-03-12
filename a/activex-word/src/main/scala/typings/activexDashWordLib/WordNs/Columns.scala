package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Columns")
@js.native
class Columns protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  var Borders: activexDashWordLib.WordNs.Borders = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val First: Column = js.native
  val Last: Column = js.native
  val NestingLevel: scala.Double = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: scala.Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Shading: activexDashWordLib.WordNs.Shading = js.native
  var Width: scala.Double = js.native
  var `Word.Columns_typekey`: Columns = js.native
  def Add(): Column = js.native
  def Add(BeforeColumn: js.Any): Column = js.native
  def AutoFit(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def DistributeWidth(): scala.Unit = js.native
  def Item(Index: scala.Double): Column = js.native
  def Select(): scala.Unit = js.native
  def SetWidth(ColumnWidth: scala.Double, RulerStyle: WdRulerStyle): scala.Unit = js.native
}

