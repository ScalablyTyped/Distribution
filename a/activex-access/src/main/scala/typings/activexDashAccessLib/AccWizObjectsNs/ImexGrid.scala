package typings
package activexDashAccessLib.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ImexGrid Control */
@JSGlobal("AccWizObjects.ImexGrid")
@js.native
class ImexGrid protected () extends js.Object {
  var `AccWizObjects.ImexGrid_typekey`: ImexGrid = js.native
  var AllowColumnSizing: scala.Boolean = js.native
  var BackColor: activexDashStdoleLib.stdoleNs.OLE_COLOR = js.native
  var Caption: java.lang.String = js.native
  var ColumnClickBehavior: scala.Double = js.native
  val ColumnCount: scala.Double = js.native
  var ColumnState: js.Any = js.native
  var Delimiters: java.lang.String = js.native
  var DrawTextLogicalOrder: scala.Boolean = js.native
  var FirstRowNumber: scala.Double = js.native
  var Font: activexDashStdoleLib.stdoleNs.IFontDisp = js.native
  var GridBackColor: activexDashStdoleLib.stdoleNs.OLE_COLOR = js.native
  var GridFont: activexDashStdoleLib.stdoleNs.IFontDisp = js.native
  var GridHeader: scala.Double = js.native
  var Painting: scala.Boolean = js.native
  val RowCount: scala.Double = js.native
  var ShowColLines: scala.Boolean = js.native
  var ShowRowHeaders: scala.Boolean = js.native
  var StringDelimiters: java.lang.String = js.native
  def AddColumn(ColumnCaption: java.lang.String, ColumnWidth: scala.Double, Index: scala.Double): scala.Unit = js.native
  def AddRow(RowText: java.lang.String, Index: scala.Double): scala.Unit = js.native
  def CalcBestColumns(): scala.Unit = js.native
  def ClearColumns(): scala.Unit = js.native
  def ClearRows(): scala.Unit = js.native
  def Columns(ColumnNumber: scala.Double): js.Any = js.native
  def DeleteColumn(Index: scala.Double): scala.Unit = js.native
  def DeleteRow(Index: scala.Double): scala.Unit = js.native
  def Refresh(): scala.Unit = js.native
  def ResetHScrollPos(): scala.Unit = js.native
  def ResetVScrollPos(): scala.Unit = js.native
  def RowText(RowNumber: scala.Double): java.lang.String = js.native
}

