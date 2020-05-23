package typings.activexAccess.AccWizObjects

import typings.activexStdole.stdole.IFontDisp
import typings.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ImexGrid Control */
trait ImexGrid extends js.Object {
  @JSName("AccWizObjects.ImexGrid_typekey")
  var AccWizObjectsDotImexGrid_typekey: ImexGrid
  var AllowColumnSizing: Boolean
  var BackColor: OLE_COLOR
  var Caption: String
  var ColumnClickBehavior: Double
  val ColumnCount: Double
  var ColumnState: js.Any
  var Delimiters: String
  var DrawTextLogicalOrder: Boolean
  var FirstRowNumber: Double
  var Font: IFontDisp
  var GridBackColor: OLE_COLOR
  var GridFont: IFontDisp
  var GridHeader: Double
  var Painting: Boolean
  val RowCount: Double
  var ShowColLines: Boolean
  var ShowRowHeaders: Boolean
  var StringDelimiters: String
  def AddColumn(ColumnCaption: String, ColumnWidth: Double, Index: Double): Unit
  def AddRow(RowText: String, Index: Double): Unit
  def CalcBestColumns(): Unit
  def ClearColumns(): Unit
  def ClearRows(): Unit
  def Columns(ColumnNumber: Double): js.Any
  def DeleteColumn(Index: Double): Unit
  def DeleteRow(Index: Double): Unit
  def Refresh(): Unit
  def ResetHScrollPos(): Unit
  def ResetVScrollPos(): Unit
  def RowText(RowNumber: Double): String
}

object ImexGrid {
  @scala.inline
  def apply(
    AccWizObjectsDotImexGrid_typekey: ImexGrid,
    AddColumn: (String, Double, Double) => Unit,
    AddRow: (String, Double) => Unit,
    AllowColumnSizing: Boolean,
    BackColor: OLE_COLOR,
    CalcBestColumns: () => Unit,
    Caption: String,
    ClearColumns: () => Unit,
    ClearRows: () => Unit,
    ColumnClickBehavior: Double,
    ColumnCount: Double,
    ColumnState: js.Any,
    Columns: Double => js.Any,
    DeleteColumn: Double => Unit,
    DeleteRow: Double => Unit,
    Delimiters: String,
    DrawTextLogicalOrder: Boolean,
    FirstRowNumber: Double,
    Font: IFontDisp,
    GridBackColor: OLE_COLOR,
    GridFont: IFontDisp,
    GridHeader: Double,
    Painting: Boolean,
    Refresh: () => Unit,
    ResetHScrollPos: () => Unit,
    ResetVScrollPos: () => Unit,
    RowCount: Double,
    RowText: Double => String,
    ShowColLines: Boolean,
    ShowRowHeaders: Boolean,
    StringDelimiters: String
  ): ImexGrid = {
    val __obj = js.Dynamic.literal(AddColumn = js.Any.fromFunction3(AddColumn), AddRow = js.Any.fromFunction2(AddRow), AllowColumnSizing = AllowColumnSizing.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], CalcBestColumns = js.Any.fromFunction0(CalcBestColumns), Caption = Caption.asInstanceOf[js.Any], ClearColumns = js.Any.fromFunction0(ClearColumns), ClearRows = js.Any.fromFunction0(ClearRows), ColumnClickBehavior = ColumnClickBehavior.asInstanceOf[js.Any], ColumnCount = ColumnCount.asInstanceOf[js.Any], ColumnState = ColumnState.asInstanceOf[js.Any], Columns = js.Any.fromFunction1(Columns), DeleteColumn = js.Any.fromFunction1(DeleteColumn), DeleteRow = js.Any.fromFunction1(DeleteRow), Delimiters = Delimiters.asInstanceOf[js.Any], DrawTextLogicalOrder = DrawTextLogicalOrder.asInstanceOf[js.Any], FirstRowNumber = FirstRowNumber.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], GridBackColor = GridBackColor.asInstanceOf[js.Any], GridFont = GridFont.asInstanceOf[js.Any], GridHeader = GridHeader.asInstanceOf[js.Any], Painting = Painting.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), ResetHScrollPos = js.Any.fromFunction0(ResetHScrollPos), ResetVScrollPos = js.Any.fromFunction0(ResetVScrollPos), RowCount = RowCount.asInstanceOf[js.Any], RowText = js.Any.fromFunction1(RowText), ShowColLines = ShowColLines.asInstanceOf[js.Any], ShowRowHeaders = ShowRowHeaders.asInstanceOf[js.Any], StringDelimiters = StringDelimiters.asInstanceOf[js.Any])
    __obj.updateDynamic("AccWizObjects.ImexGrid_typekey")(AccWizObjectsDotImexGrid_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImexGrid]
  }
}

