package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Rows")
@js.native
class Rows protected () extends js.Object {
  var Alignment: WdRowAlignment = js.native
  var AllowBreakAcrossPages: scala.Double = js.native
  var AllowOverlap: scala.Double = js.native
  val Application: activexDashWordLib.WordNs.Application = js.native
  var Borders: activexDashWordLib.WordNs.Borders = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DistanceBottom: scala.Double = js.native
  var DistanceLeft: scala.Double = js.native
  var DistanceRight: scala.Double = js.native
  var DistanceTop: scala.Double = js.native
  val First: Row = js.native
  var HeadingFormat: scala.Double = js.native
  var Height: scala.Double = js.native
  var HeightRule: WdRowHeightRule = js.native
  var HorizontalPosition: scala.Double = js.native
  val Last: Row = js.native
  var LeftIndent: scala.Double = js.native
  val NestingLevel: scala.Double = js.native
  val Parent: js.Any = js.native
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  val Shading: activexDashWordLib.WordNs.Shading = js.native
  var SpaceBetweenColumns: scala.Double = js.native
  var TableDirection: WdTableDirection = js.native
  var VerticalPosition: scala.Double = js.native
  var `Word.Rows_typekey`: Rows = js.native
  var WrapAroundText: scala.Double = js.native
  def Add(): Row = js.native
  def Add(BeforeRow: js.Any): Row = js.native
  def ConvertToText(): Range = js.native
  def ConvertToText(Separator: js.Any): Range = js.native
  def ConvertToText(Separator: js.Any, NestedTables: js.Any): Range = js.native
  def ConvertToTextOld(): Range = js.native
  def ConvertToTextOld(Separator: js.Any): Range = js.native
  def Delete(): scala.Unit = js.native
  def DistributeHeight(): scala.Unit = js.native
  def Item(Index: scala.Double): Row = js.native
  def Select(): scala.Unit = js.native
  def SetHeight(RowHeight: scala.Double, HeightRule: WdRowHeightRule): scala.Unit = js.native
  def SetLeftIndent(LeftIndent: scala.Double, RulerStyle: WdRulerStyle): scala.Unit = js.native
}

