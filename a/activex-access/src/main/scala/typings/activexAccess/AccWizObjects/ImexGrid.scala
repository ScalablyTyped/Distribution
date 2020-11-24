package typings.activexAccess.AccWizObjects

import typings.activexStdole.stdole.IFontDisp
import typings.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ImexGrid Control */
@js.native
trait ImexGrid extends js.Object {
  
  @JSName("AccWizObjects.ImexGrid_typekey")
  var AccWizObjectsDotImexGrid_typekey: ImexGrid = js.native
  
  def AddColumn(ColumnCaption: String, ColumnWidth: Double, Index: Double): Unit = js.native
  
  def AddRow(RowText: String, Index: Double): Unit = js.native
  
  var AllowColumnSizing: Boolean = js.native
  
  var BackColor: OLE_COLOR = js.native
  
  def CalcBestColumns(): Unit = js.native
  
  var Caption: String = js.native
  
  def ClearColumns(): Unit = js.native
  
  def ClearRows(): Unit = js.native
  
  var ColumnClickBehavior: Double = js.native
  
  val ColumnCount: Double = js.native
  
  var ColumnState: js.Any = js.native
  
  def Columns(ColumnNumber: Double): js.Any = js.native
  
  def DeleteColumn(Index: Double): Unit = js.native
  
  def DeleteRow(Index: Double): Unit = js.native
  
  var Delimiters: String = js.native
  
  var DrawTextLogicalOrder: Boolean = js.native
  
  var FirstRowNumber: Double = js.native
  
  var Font: IFontDisp = js.native
  
  var GridBackColor: OLE_COLOR = js.native
  
  var GridFont: IFontDisp = js.native
  
  var GridHeader: Double = js.native
  
  var Painting: Boolean = js.native
  
  def Refresh(): Unit = js.native
  
  def ResetHScrollPos(): Unit = js.native
  
  def ResetVScrollPos(): Unit = js.native
  
  val RowCount: Double = js.native
  
  def RowText(RowNumber: Double): String = js.native
  
  var ShowColLines: Boolean = js.native
  
  var ShowRowHeaders: Boolean = js.native
  
  var StringDelimiters: String = js.native
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
  
  @scala.inline
  implicit class ImexGridOps[Self <: ImexGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccWizObjectsDotImexGrid_typekey(value: ImexGrid): Self = this.set("AccWizObjects.ImexGrid_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddColumn(value: (String, Double, Double) => Unit): Self = this.set("AddColumn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddRow(value: (String, Double) => Unit): Self = this.set("AddRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAllowColumnSizing(value: Boolean): Self = this.set("AllowColumnSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: OLE_COLOR): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalcBestColumns(value: () => Unit): Self = this.set("CalcBestColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearColumns(value: () => Unit): Self = this.set("ClearColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearRows(value: () => Unit): Self = this.set("ClearRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColumnClickBehavior(value: Double): Self = this.set("ColumnClickBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("ColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnState(value: js.Any): Self = this.set("ColumnState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: Double => js.Any): Self = this.set("Columns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteColumn(value: Double => Unit): Self = this.set("DeleteColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteRow(value: Double => Unit): Self = this.set("DeleteRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelimiters(value: String): Self = this.set("Delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawTextLogicalOrder(value: Boolean): Self = this.set("DrawTextLogicalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstRowNumber(value: Double): Self = this.set("FirstRowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: IFontDisp): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridBackColor(value: OLE_COLOR): Self = this.set("GridBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridFont(value: IFontDisp): Self = this.set("GridFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridHeader(value: Double): Self = this.set("GridHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPainting(value: Boolean): Self = this.set("Painting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetHScrollPos(value: () => Unit): Self = this.set("ResetHScrollPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetVScrollPos(value: () => Unit): Self = this.set("ResetVScrollPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("RowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowText(value: Double => String): Self = this.set("RowText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowColLines(value: Boolean): Self = this.set("ShowColLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRowHeaders(value: Boolean): Self = this.set("ShowRowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringDelimiters(value: String): Self = this.set("StringDelimiters", value.asInstanceOf[js.Any])
  }
}
