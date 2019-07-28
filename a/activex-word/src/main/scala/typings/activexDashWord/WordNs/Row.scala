package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Row")
@js.native
class Row protected () extends js.Object {
  var Alignment: WdRowAlignment = js.native
  var AllowBreakAcrossPages: Double = js.native
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var Borders: typings.activexDashWord.WordNs.Borders = js.native
  val Cells: typings.activexDashWord.WordNs.Cells = js.native
  val Creator: Double = js.native
  var HeadingFormat: Double = js.native
  var Height: Double = js.native
  var HeightRule: WdRowHeightRule = js.native
  var ID: String = js.native
  val Index: Double = js.native
  val IsFirst: Boolean = js.native
  val IsLast: Boolean = js.native
  var LeftIndent: Double = js.native
  val NestingLevel: Double = js.native
  val Next: Row = js.native
  val Parent: js.Any = js.native
  val Previous: Row = js.native
  val Range: typings.activexDashWord.WordNs.Range = js.native
  val Shading: typings.activexDashWord.WordNs.Shading = js.native
  var SpaceBetweenColumns: Double = js.native
  var `Word.Row_typekey`: Row = js.native
  def ConvertToText(): typings.activexDashWord.WordNs.Range = js.native
  def ConvertToText(Separator: js.Any): typings.activexDashWord.WordNs.Range = js.native
  def ConvertToText(Separator: js.Any, NestedTables: js.Any): typings.activexDashWord.WordNs.Range = js.native
  def ConvertToTextOld(): typings.activexDashWord.WordNs.Range = js.native
  def ConvertToTextOld(Separator: js.Any): typings.activexDashWord.WordNs.Range = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
  def SetHeight(RowHeight: Double, HeightRule: WdRowHeightRule): Unit = js.native
  def SetLeftIndent(LeftIndent: Double, RulerStyle: WdRulerStyle): Unit = js.native
}

