package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Row")
@js.native
class Row protected () extends js.Object {
  var Alignment: WdRowAlignment = js.native
  var AllowBreakAcrossPages: scala.Double = js.native
  val Application: Application = js.native
  var Borders: Borders = js.native
  val Cells: Cells = js.native
  val Creator: scala.Double = js.native
  var HeadingFormat: scala.Double = js.native
  var Height: scala.Double = js.native
  var HeightRule: WdRowHeightRule = js.native
  var ID: java.lang.String = js.native
  val Index: scala.Double = js.native
  val IsFirst: scala.Boolean = js.native
  val IsLast: scala.Boolean = js.native
  var LeftIndent: scala.Double = js.native
  val NestingLevel: scala.Double = js.native
  val Next: Row = js.native
  val Parent: js.Any = js.native
  val Previous: Row = js.native
  val Range: Range = js.native
  val Shading: Shading = js.native
  var SpaceBetweenColumns: scala.Double = js.native
  var `Word.Row_typekey`: Row = js.native
  def ConvertToText(): Range = js.native
  def ConvertToText(Separator: js.Any): Range = js.native
  def ConvertToText(Separator: js.Any, NestedTables: js.Any): Range = js.native
  def ConvertToTextOld(): Range = js.native
  def ConvertToTextOld(Separator: js.Any): Range = js.native
  def Delete(): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def SetHeight(RowHeight: scala.Double, HeightRule: WdRowHeightRule): scala.Unit = js.native
  def SetLeftIndent(LeftIndent: scala.Double, RulerStyle: WdRulerStyle): scala.Unit = js.native
}

