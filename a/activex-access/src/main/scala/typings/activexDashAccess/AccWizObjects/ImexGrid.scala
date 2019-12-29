package typings.activexDashAccess.AccWizObjects

import typings.activexDashStdole.stdole.IFontDisp
import typings.activexDashStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ImexGrid Control */
@JSGlobal("AccWizObjects.ImexGrid")
@js.native
class ImexGrid protected () extends js.Object {
  @JSName("AccWizObjects.ImexGrid_typekey")
  var AccWizObjectsDotImexGrid_typekey: ImexGrid = js.native
  var AllowColumnSizing: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var Caption: String = js.native
  var ColumnClickBehavior: Double = js.native
  val ColumnCount: Double = js.native
  var ColumnState: js.Any = js.native
  var Delimiters: String = js.native
  var DrawTextLogicalOrder: Boolean = js.native
  var FirstRowNumber: Double = js.native
  var Font: IFontDisp = js.native
  var GridBackColor: OLE_COLOR = js.native
  var GridFont: IFontDisp = js.native
  var GridHeader: Double = js.native
  var Painting: Boolean = js.native
  val RowCount: Double = js.native
  var ShowColLines: Boolean = js.native
  var ShowRowHeaders: Boolean = js.native
  var StringDelimiters: String = js.native
  def AddColumn(ColumnCaption: String, ColumnWidth: Double, Index: Double): Unit = js.native
  def AddRow(RowText: String, Index: Double): Unit = js.native
  def CalcBestColumns(): Unit = js.native
  def ClearColumns(): Unit = js.native
  def ClearRows(): Unit = js.native
  def Columns(ColumnNumber: Double): js.Any = js.native
  def DeleteColumn(Index: Double): Unit = js.native
  def DeleteRow(Index: Double): Unit = js.native
  def Refresh(): Unit = js.native
  def ResetHScrollPos(): Unit = js.native
  def ResetVScrollPos(): Unit = js.native
  def RowText(RowNumber: Double): String = js.native
}

