package typings.activexAccess

import typings.activexAccess.activexAccessNumbers.`0`
import typings.activexAccess.activexAccessNumbers.`10`
import typings.activexAccess.activexAccessNumbers.`11`
import typings.activexAccess.activexAccessNumbers.`16`
import typings.activexAccess.activexAccessNumbers.`17`
import typings.activexAccess.activexAccessNumbers.`18`
import typings.activexAccess.activexAccessNumbers.`19`
import typings.activexAccess.activexAccessNumbers.`1`
import typings.activexAccess.activexAccessNumbers.`20`
import typings.activexAccess.activexAccessNumbers.`21`
import typings.activexAccess.activexAccessNumbers.`22`
import typings.activexAccess.activexAccessNumbers.`23`
import typings.activexAccess.activexAccessNumbers.`24`
import typings.activexAccess.activexAccessNumbers.`25`
import typings.activexAccess.activexAccessNumbers.`26`
import typings.activexAccess.activexAccessNumbers.`27`
import typings.activexAccess.activexAccessNumbers.`2`
import typings.activexAccess.activexAccessNumbers.`3`
import typings.activexAccess.activexAccessNumbers.`4`
import typings.activexAccess.activexAccessNumbers.`5`
import typings.activexAccess.activexAccessNumbers.`6`
import typings.activexAccess.activexAccessNumbers.`7`
import typings.activexAccess.activexAccessNumbers.`8`
import typings.activexAccess.activexAccessNumbers.`9`
import typings.activexAccess.activexAccessStrings.SourceCtlName
import typings.activexAccess.activexAccessStrings.SourceFieldList
import typings.activexAccess.activexAccessStrings.SourceRow
import typings.activexAccess.activexAccessStrings.State
import typings.activexAccess.activexAccessStrings.TargetCtlName
import typings.activexAccess.activexAccessStrings.TargetFieldList
import typings.activexAccess.activexAccessStrings.TargetRow
import typings.activexAccess.activexAccessStrings.X
import typings.activexAccess.activexAccessStrings.Y
import typings.activexStdole.stdole.IFontDisp
import typings.activexStdole.stdole.IPictureDisp
import typings.activexStdole.stdole.OLE_COLOR
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccWizObjects {
  
  object EventHelperTypes {
    
    type FieldListDragOverArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, State, X, Y]
    
    trait FieldListDragOverParameter extends StObject {
      
      val SourceCtlName: String
      
      val SourceFieldList: Double
      
      val SourceRow: Double
      
      val State: Double
      
      val X: Double
      
      val Y: Double
    }
    object FieldListDragOverParameter {
      
      inline def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        State: Double,
        X: Double,
        Y: Double
      ): FieldListDragOverParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListDragOverParameter]
      }
      
      extension [Self <: FieldListDragOverParameter](x: Self) {
        
        inline def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        inline def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        inline def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        inline def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      }
    }
    
    type FieldListFldListDragDropArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow]
    
    trait FieldListFldListDragDropParameter extends StObject {
      
      val SourceCtlName: String
      
      val SourceFieldList: Double
      
      val SourceRow: Double
      
      val TargetCtlName: String
      
      val TargetFieldList: Double
      
      val TargetRow: Double
    }
    object FieldListFldListDragDropParameter {
      
      inline def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        TargetCtlName: String,
        TargetFieldList: Double,
        TargetRow: Double
      ): FieldListFldListDragDropParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListFldListDragDropParameter]
      }
      
      extension [Self <: FieldListFldListDragDropParameter](x: Self) {
        
        inline def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        inline def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        inline def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        inline def setTargetCtlName(value: String): Self = StObject.set(x, "TargetCtlName", value.asInstanceOf[js.Any])
        
        inline def setTargetFieldList(value: Double): Self = StObject.set(x, "TargetFieldList", value.asInstanceOf[js.Any])
        
        inline def setTargetRow(value: Double): Self = StObject.set(x, "TargetRow", value.asInstanceOf[js.Any])
      }
    }
    
    type FieldListFldListDragOverArgNames = js.Tuple7[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow, State]
    
    trait FieldListFldListDragOverParameter extends StObject {
      
      val SourceCtlName: String
      
      val SourceFieldList: Double
      
      val SourceRow: Double
      
      val State: Double
      
      val TargetCtlName: String
      
      val TargetFieldList: Double
      
      val TargetRow: Double
    }
    object FieldListFldListDragOverParameter {
      
      inline def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        State: Double,
        TargetCtlName: String,
        TargetFieldList: Double,
        TargetRow: Double
      ): FieldListFldListDragOverParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListFldListDragOverParameter]
      }
      
      extension [Self <: FieldListFldListDragOverParameter](x: Self) {
        
        inline def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        inline def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        inline def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        inline def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
        
        inline def setTargetCtlName(value: String): Self = StObject.set(x, "TargetCtlName", value.asInstanceOf[js.Any])
        
        inline def setTargetFieldList(value: Double): Self = StObject.set(x, "TargetFieldList", value.asInstanceOf[js.Any])
        
        inline def setTargetRow(value: Double): Self = StObject.set(x, "TargetRow", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /** Field List Control */
  trait FieldList extends StObject {
    
    /* private */ @JSName("AccWizObjects.FieldList_typekey")
    var AccWizObjectsDotFieldList_typekey: FieldList
    
    def AddFieldList(
      bstrCaption: String,
      nLeft: Double,
      nTop: Double,
      nWidth: Double,
      nHeight: Double,
      nMultiSelectType: Double,
      cCols: Double,
      fShowPictures: Boolean
    ): Unit
    
    def AddJoinLine(
      IFieldList: Double,
      iField: Double,
      iForeignFieldList: Double,
      iForeignField: Double,
      lAttribs: Double
    ): Unit
    
    def DeleteFieldList(IFieldList: Double): Unit
    
    def DeleteJoinLine(IJoinLine: Double): Unit
    
    val FieldListCount: Double
    
    def FieldLists(IFieldList: Double): js.Any
    
    var HScrollPos: Double
    
    val JoinLineCount: Double
    
    def JoinLines(IJoinLine: Double): js.Any
    
    var PersistentHighlight: Boolean
    
    var Picture: IPictureDisp
    
    var PictureCols: Double
    
    var PictureRows: Double
    
    var ScrollBars: Double
    
    var SelectedFieldListIndex: Double
    
    def SetCursor(nCursorID: Double): Unit
    
    var VScrollPos: Double
  }
  object FieldList {
    
    inline def apply(
      AccWizObjectsDotFieldList_typekey: FieldList,
      AddFieldList: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit,
      AddJoinLine: (Double, Double, Double, Double, Double) => Unit,
      DeleteFieldList: Double => Unit,
      DeleteJoinLine: Double => Unit,
      FieldListCount: Double,
      FieldLists: Double => js.Any,
      HScrollPos: Double,
      JoinLineCount: Double,
      JoinLines: Double => js.Any,
      PersistentHighlight: Boolean,
      Picture: IPictureDisp,
      PictureCols: Double,
      PictureRows: Double,
      ScrollBars: Double,
      SelectedFieldListIndex: Double,
      SetCursor: Double => Unit,
      VScrollPos: Double
    ): FieldList = {
      val __obj = js.Dynamic.literal(AddFieldList = js.Any.fromFunction8(AddFieldList), AddJoinLine = js.Any.fromFunction5(AddJoinLine), DeleteFieldList = js.Any.fromFunction1(DeleteFieldList), DeleteJoinLine = js.Any.fromFunction1(DeleteJoinLine), FieldListCount = FieldListCount.asInstanceOf[js.Any], FieldLists = js.Any.fromFunction1(FieldLists), HScrollPos = HScrollPos.asInstanceOf[js.Any], JoinLineCount = JoinLineCount.asInstanceOf[js.Any], JoinLines = js.Any.fromFunction1(JoinLines), PersistentHighlight = PersistentHighlight.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureCols = PictureCols.asInstanceOf[js.Any], PictureRows = PictureRows.asInstanceOf[js.Any], ScrollBars = ScrollBars.asInstanceOf[js.Any], SelectedFieldListIndex = SelectedFieldListIndex.asInstanceOf[js.Any], SetCursor = js.Any.fromFunction1(SetCursor), VScrollPos = VScrollPos.asInstanceOf[js.Any])
      __obj.updateDynamic("AccWizObjects.FieldList_typekey")(AccWizObjectsDotFieldList_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldList]
    }
    
    extension [Self <: FieldList](x: Self) {
      
      inline def setAccWizObjectsDotFieldList_typekey(value: FieldList): Self = StObject.set(x, "AccWizObjects.FieldList_typekey", value.asInstanceOf[js.Any])
      
      inline def setAddFieldList(value: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit): Self = StObject.set(x, "AddFieldList", js.Any.fromFunction8(value))
      
      inline def setAddJoinLine(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "AddJoinLine", js.Any.fromFunction5(value))
      
      inline def setDeleteFieldList(value: Double => Unit): Self = StObject.set(x, "DeleteFieldList", js.Any.fromFunction1(value))
      
      inline def setDeleteJoinLine(value: Double => Unit): Self = StObject.set(x, "DeleteJoinLine", js.Any.fromFunction1(value))
      
      inline def setFieldListCount(value: Double): Self = StObject.set(x, "FieldListCount", value.asInstanceOf[js.Any])
      
      inline def setFieldLists(value: Double => js.Any): Self = StObject.set(x, "FieldLists", js.Any.fromFunction1(value))
      
      inline def setHScrollPos(value: Double): Self = StObject.set(x, "HScrollPos", value.asInstanceOf[js.Any])
      
      inline def setJoinLineCount(value: Double): Self = StObject.set(x, "JoinLineCount", value.asInstanceOf[js.Any])
      
      inline def setJoinLines(value: Double => js.Any): Self = StObject.set(x, "JoinLines", js.Any.fromFunction1(value))
      
      inline def setPersistentHighlight(value: Boolean): Self = StObject.set(x, "PersistentHighlight", value.asInstanceOf[js.Any])
      
      inline def setPicture(value: IPictureDisp): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
      
      inline def setPictureCols(value: Double): Self = StObject.set(x, "PictureCols", value.asInstanceOf[js.Any])
      
      inline def setPictureRows(value: Double): Self = StObject.set(x, "PictureRows", value.asInstanceOf[js.Any])
      
      inline def setScrollBars(value: Double): Self = StObject.set(x, "ScrollBars", value.asInstanceOf[js.Any])
      
      inline def setSelectedFieldListIndex(value: Double): Self = StObject.set(x, "SelectedFieldListIndex", value.asInstanceOf[js.Any])
      
      inline def setSetCursor(value: Double => Unit): Self = StObject.set(x, "SetCursor", js.Any.fromFunction1(value))
      
      inline def setVScrollPos(value: Double): Self = StObject.set(x, "VScrollPos", value.asInstanceOf[js.Any])
    }
  }
  
  /** ImexGrid Control */
  trait ImexGrid extends StObject {
    
    /* private */ @JSName("AccWizObjects.ImexGrid_typekey")
    var AccWizObjectsDotImexGrid_typekey: ImexGrid
    
    def AddColumn(ColumnCaption: String, ColumnWidth: Double, Index: Double): Unit
    
    def AddRow(RowText: String, Index: Double): Unit
    
    var AllowColumnSizing: Boolean
    
    var BackColor: OLE_COLOR
    
    def CalcBestColumns(): Unit
    
    var Caption: String
    
    def ClearColumns(): Unit
    
    def ClearRows(): Unit
    
    var ColumnClickBehavior: Double
    
    val ColumnCount: Double
    
    var ColumnState: js.Any
    
    def Columns(ColumnNumber: Double): js.Any
    
    def DeleteColumn(Index: Double): Unit
    
    def DeleteRow(Index: Double): Unit
    
    var Delimiters: String
    
    var DrawTextLogicalOrder: Boolean
    
    var FirstRowNumber: Double
    
    var Font: IFontDisp
    
    var GridBackColor: OLE_COLOR
    
    var GridFont: IFontDisp
    
    var GridHeader: Double
    
    var Painting: Boolean
    
    def Refresh(): Unit
    
    def ResetHScrollPos(): Unit
    
    def ResetVScrollPos(): Unit
    
    val RowCount: Double
    
    def RowText(RowNumber: Double): String
    
    var ShowColLines: Boolean
    
    var ShowRowHeaders: Boolean
    
    var StringDelimiters: String
  }
  object ImexGrid {
    
    inline def apply(
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
    
    extension [Self <: ImexGrid](x: Self) {
      
      inline def setAccWizObjectsDotImexGrid_typekey(value: ImexGrid): Self = StObject.set(x, "AccWizObjects.ImexGrid_typekey", value.asInstanceOf[js.Any])
      
      inline def setAddColumn(value: (String, Double, Double) => Unit): Self = StObject.set(x, "AddColumn", js.Any.fromFunction3(value))
      
      inline def setAddRow(value: (String, Double) => Unit): Self = StObject.set(x, "AddRow", js.Any.fromFunction2(value))
      
      inline def setAllowColumnSizing(value: Boolean): Self = StObject.set(x, "AllowColumnSizing", value.asInstanceOf[js.Any])
      
      inline def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
      
      inline def setCalcBestColumns(value: () => Unit): Self = StObject.set(x, "CalcBestColumns", js.Any.fromFunction0(value))
      
      inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
      
      inline def setClearColumns(value: () => Unit): Self = StObject.set(x, "ClearColumns", js.Any.fromFunction0(value))
      
      inline def setClearRows(value: () => Unit): Self = StObject.set(x, "ClearRows", js.Any.fromFunction0(value))
      
      inline def setColumnClickBehavior(value: Double): Self = StObject.set(x, "ColumnClickBehavior", value.asInstanceOf[js.Any])
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "ColumnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnState(value: js.Any): Self = StObject.set(x, "ColumnState", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: Double => js.Any): Self = StObject.set(x, "Columns", js.Any.fromFunction1(value))
      
      inline def setDeleteColumn(value: Double => Unit): Self = StObject.set(x, "DeleteColumn", js.Any.fromFunction1(value))
      
      inline def setDeleteRow(value: Double => Unit): Self = StObject.set(x, "DeleteRow", js.Any.fromFunction1(value))
      
      inline def setDelimiters(value: String): Self = StObject.set(x, "Delimiters", value.asInstanceOf[js.Any])
      
      inline def setDrawTextLogicalOrder(value: Boolean): Self = StObject.set(x, "DrawTextLogicalOrder", value.asInstanceOf[js.Any])
      
      inline def setFirstRowNumber(value: Double): Self = StObject.set(x, "FirstRowNumber", value.asInstanceOf[js.Any])
      
      inline def setFont(value: IFontDisp): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
      
      inline def setGridBackColor(value: OLE_COLOR): Self = StObject.set(x, "GridBackColor", value.asInstanceOf[js.Any])
      
      inline def setGridFont(value: IFontDisp): Self = StObject.set(x, "GridFont", value.asInstanceOf[js.Any])
      
      inline def setGridHeader(value: Double): Self = StObject.set(x, "GridHeader", value.asInstanceOf[js.Any])
      
      inline def setPainting(value: Boolean): Self = StObject.set(x, "Painting", value.asInstanceOf[js.Any])
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
      
      inline def setResetHScrollPos(value: () => Unit): Self = StObject.set(x, "ResetHScrollPos", js.Any.fromFunction0(value))
      
      inline def setResetVScrollPos(value: () => Unit): Self = StObject.set(x, "ResetVScrollPos", js.Any.fromFunction0(value))
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "RowCount", value.asInstanceOf[js.Any])
      
      inline def setRowText(value: Double => String): Self = StObject.set(x, "RowText", js.Any.fromFunction1(value))
      
      inline def setShowColLines(value: Boolean): Self = StObject.set(x, "ShowColLines", value.asInstanceOf[js.Any])
      
      inline def setShowRowHeaders(value: Boolean): Self = StObject.set(x, "ShowRowHeaders", value.asInstanceOf[js.Any])
      
      inline def setStringDelimiters(value: String): Self = StObject.set(x, "StringDelimiters", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAccess.activexAccessNumbers.`26`
    - typings.activexAccess.activexAccessNumbers.`10`
    - typings.activexAccess.activexAccessNumbers.`25`
    - typings.activexAccess.activexAccessNumbers.`23`
    - typings.activexAccess.activexAccessNumbers.`22`
    - typings.activexAccess.activexAccessNumbers.`24`
    - typings.activexAccess.activexAccessNumbers.`3`
    - typings.activexAccess.activexAccessNumbers.`0`
    - typings.activexAccess.activexAccessNumbers.`16`
    - typings.activexAccess.activexAccessNumbers.`17`
    - typings.activexAccess.activexAccessNumbers.`6`
    - typings.activexAccess.activexAccessNumbers.`20`
    - typings.activexAccess.activexAccessNumbers.`19`
    - typings.activexAccess.activexAccessNumbers.`18`
    - typings.activexAccess.activexAccessNumbers.`5`
    - typings.activexAccess.activexAccessNumbers.`4`
    - typings.activexAccess.activexAccessNumbers.`27`
    - typings.activexAccess.activexAccessNumbers.`2`
    - typings.activexAccess.activexAccessNumbers.`8`
    - typings.activexAccess.activexAccessNumbers.`9`
    - typings.activexAccess.activexAccessNumbers.`11`
    - typings.activexAccess.activexAccessNumbers.`7`
    - typings.activexAccess.activexAccessNumbers.`21`
  */
  trait WIZ_CSIDL_FLAGS extends StObject
  object WIZ_CSIDL_FLAGS {
    
    inline def WIZ_CSIDL_APPDATA: `26` = 26.asInstanceOf[`26`]
    
    inline def WIZ_CSIDL_BITBUCKET: `10` = 10.asInstanceOf[`10`]
    
    inline def WIZ_CSIDL_COMMON_DESKTOPDIRECTORY: `25` = 25.asInstanceOf[`25`]
    
    inline def WIZ_CSIDL_COMMON_PROGRAMS: `23` = 23.asInstanceOf[`23`]
    
    inline def WIZ_CSIDL_COMMON_STARTMENU: `22` = 22.asInstanceOf[`22`]
    
    inline def WIZ_CSIDL_COMMON_STARTUP: `24` = 24.asInstanceOf[`24`]
    
    inline def WIZ_CSIDL_CONTROLS: `3` = 3.asInstanceOf[`3`]
    
    inline def WIZ_CSIDL_DESKTOP: `0` = 0.asInstanceOf[`0`]
    
    inline def WIZ_CSIDL_DESKTOPDIRECTORY: `16` = 16.asInstanceOf[`16`]
    
    inline def WIZ_CSIDL_DRIVES: `17` = 17.asInstanceOf[`17`]
    
    inline def WIZ_CSIDL_FAVORITES: `6` = 6.asInstanceOf[`6`]
    
    inline def WIZ_CSIDL_FONTS: `20` = 20.asInstanceOf[`20`]
    
    inline def WIZ_CSIDL_NETHOOD: `19` = 19.asInstanceOf[`19`]
    
    inline def WIZ_CSIDL_NETWORK: `18` = 18.asInstanceOf[`18`]
    
    inline def WIZ_CSIDL_PERSONAL: `5` = 5.asInstanceOf[`5`]
    
    inline def WIZ_CSIDL_PRINTERS: `4` = 4.asInstanceOf[`4`]
    
    inline def WIZ_CSIDL_PRINTHOOD: `27` = 27.asInstanceOf[`27`]
    
    inline def WIZ_CSIDL_PROGRAMS: `2` = 2.asInstanceOf[`2`]
    
    inline def WIZ_CSIDL_RECENT: `8` = 8.asInstanceOf[`8`]
    
    inline def WIZ_CSIDL_SENDTO: `9` = 9.asInstanceOf[`9`]
    
    inline def WIZ_CSIDL_STARTMENU: `11` = 11.asInstanceOf[`11`]
    
    inline def WIZ_CSIDL_STARTUP: `7` = 7.asInstanceOf[`7`]
    
    inline def WIZ_CSIDL_TEMPLATES: `21` = 21.asInstanceOf[`21`]
  }
  
  trait WIZ_FILETIME extends StObject {
    
    val dwHighDateTime: Double
    
    val dwLowDateTime: Double
  }
  object WIZ_FILETIME {
    
    inline def apply(dwHighDateTime: Double, dwLowDateTime: Double): WIZ_FILETIME = {
      val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[WIZ_FILETIME]
    }
    
    extension [Self <: WIZ_FILETIME](x: Self) {
      
      inline def setDwHighDateTime(value: Double): Self = StObject.set(x, "dwHighDateTime", value.asInstanceOf[js.Any])
      
      inline def setDwLowDateTime(value: Double): Self = StObject.set(x, "dwLowDateTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAccess.activexAccessNumbers.`1`
    - typings.activexAccess.activexAccessNumbers.`2`
  */
  trait WIZ_SLGP_FLAGS extends StObject
  object WIZ_SLGP_FLAGS {
    
    inline def WIZ_SLGP_SHORTPATH: `1` = 1.asInstanceOf[`1`]
    
    inline def WIZ_SLGP_UNCPRIORITY: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAccess.activexAccessNumbers.`2`
    - typings.activexAccess.activexAccessNumbers.`1`
    - typings.activexAccess.activexAccessNumbers.`4`
  */
  trait WIZ_SLR_FLAGS extends StObject
  object WIZ_SLR_FLAGS {
    
    inline def WIZ_SLR_ANY_MATCH: `2` = 2.asInstanceOf[`2`]
    
    inline def WIZ_SLR_NO_UI: `1` = 1.asInstanceOf[`1`]
    
    inline def WIZ_SLR_UPDATE: `4` = 4.asInstanceOf[`4`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexAccess.activexAccessNumbers.`3`
    - typings.activexAccess.activexAccessNumbers.`7`
    - typings.activexAccess.activexAccessNumbers.`5`
  */
  trait WIZ_SW_FLAGS extends StObject
  object WIZ_SW_FLAGS {
    
    inline def WIZ_SW_MAXIMIZE: `3` = 3.asInstanceOf[`3`]
    
    inline def WIZ_SW_MINIMIZE: `7` = 7.asInstanceOf[`7`]
    
    inline def WIZ_SW_NORMAL: `5` = 5.asInstanceOf[`5`]
  }
  
  trait WIZ_WIN32_FIND_DATA extends StObject {
    
    val cAlternate: SafeArray[Double]
    
    val cFileName: SafeArray[Double]
    
    val dwFileAttributes: Double
    
    val dwReserved0: Double
    
    val dwReserved1: Double
    
    val ftCreationTime: WIZ_FILETIME
    
    val ftLastAccessTime: WIZ_FILETIME
    
    val ftLastWriteTime: WIZ_FILETIME
    
    val nFileSizeHigh: Double
    
    val nFileSizeLow: Double
  }
  object WIZ_WIN32_FIND_DATA {
    
    inline def apply(
      cAlternate: SafeArray[Double],
      cFileName: SafeArray[Double],
      dwFileAttributes: Double,
      dwReserved0: Double,
      dwReserved1: Double,
      ftCreationTime: WIZ_FILETIME,
      ftLastAccessTime: WIZ_FILETIME,
      ftLastWriteTime: WIZ_FILETIME,
      nFileSizeHigh: Double,
      nFileSizeLow: Double
    ): WIZ_WIN32_FIND_DATA = {
      val __obj = js.Dynamic.literal(cAlternate = cAlternate.asInstanceOf[js.Any], cFileName = cFileName.asInstanceOf[js.Any], dwFileAttributes = dwFileAttributes.asInstanceOf[js.Any], dwReserved0 = dwReserved0.asInstanceOf[js.Any], dwReserved1 = dwReserved1.asInstanceOf[js.Any], ftCreationTime = ftCreationTime.asInstanceOf[js.Any], ftLastAccessTime = ftLastAccessTime.asInstanceOf[js.Any], ftLastWriteTime = ftLastWriteTime.asInstanceOf[js.Any], nFileSizeHigh = nFileSizeHigh.asInstanceOf[js.Any], nFileSizeLow = nFileSizeLow.asInstanceOf[js.Any])
      __obj.asInstanceOf[WIZ_WIN32_FIND_DATA]
    }
    
    extension [Self <: WIZ_WIN32_FIND_DATA](x: Self) {
      
      inline def setCAlternate(value: SafeArray[Double]): Self = StObject.set(x, "cAlternate", value.asInstanceOf[js.Any])
      
      inline def setCFileName(value: SafeArray[Double]): Self = StObject.set(x, "cFileName", value.asInstanceOf[js.Any])
      
      inline def setDwFileAttributes(value: Double): Self = StObject.set(x, "dwFileAttributes", value.asInstanceOf[js.Any])
      
      inline def setDwReserved0(value: Double): Self = StObject.set(x, "dwReserved0", value.asInstanceOf[js.Any])
      
      inline def setDwReserved1(value: Double): Self = StObject.set(x, "dwReserved1", value.asInstanceOf[js.Any])
      
      inline def setFtCreationTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftCreationTime", value.asInstanceOf[js.Any])
      
      inline def setFtLastAccessTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftLastAccessTime", value.asInstanceOf[js.Any])
      
      inline def setFtLastWriteTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftLastWriteTime", value.asInstanceOf[js.Any])
      
      inline def setNFileSizeHigh(value: Double): Self = StObject.set(x, "nFileSizeHigh", value.asInstanceOf[js.Any])
      
      inline def setNFileSizeLow(value: Double): Self = StObject.set(x, "nFileSizeLow", value.asInstanceOf[js.Any])
    }
  }
  
  /** WizShellLinkA Class */
  trait WizShellLinkA extends StObject {
    
    /* private */ @JSName("AccWizObjects.WizShellLinkA_typekey")
    var AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA
    
    /** GetArguments */
    def GetArguments(pszArgs: String, cchMaxPath: Double): Unit
    
    /** GetDescription */
    def GetDescription(pszName: String, cchMaxName: Double): Unit
    
    /** GetHotkey */
    def GetHotkey(pwHotkey: Double): Unit
    
    /** GetIDList */
    def GetIDList(ppidl: WIZ_CSIDL_FLAGS): Unit
    
    /** GetIconLocation */
    def GetIconLocation(pszIconPath: String, cchIconPath: Double, piIcon: Double): Unit
    
    /** GetPath */
    def GetPath(pszFile: String, cchMaxPath: Double, pfd: WIZ_WIN32_FIND_DATA, fflags: Double): Unit
    
    /** GetShowCmd */
    def GetShowCmd(piShowCmd: WIZ_SW_FLAGS): Unit
    
    /** GetWorkingDirectory */
    def GetWorkingDirectory(pszDir: String, cchMaxPath: Double): Unit
    
    /** Resolve */
    def Resolve(hWnd: Double, fflags: Double): Unit
    
    /** SetArguments */
    def SetArguments(pszArgs: String): Unit
    
    /** SetDescription */
    def SetDescription(pszName: String): Unit
    
    /** SetHotkey */
    def SetHotkey(wHotkey: Double): Unit
    
    /** SetIDList */
    def SetIDList(pidl: WIZ_CSIDL_FLAGS): Unit
    
    /** SetIconLocation */
    def SetIconLocation(pszIconPath: String, iIcon: Double): Unit
    
    /** SetPath */
    def SetPath(pszFile: String): Unit
    
    /** SetRelativePath */
    def SetRelativePath(pszPathRel: String, dwReserved: Double): Unit
    
    /** SetShowCmd */
    def SetShowCmd(iShowCmd: WIZ_SW_FLAGS): Unit
    
    /** SetWorkingDirectory */
    def SetWorkingDirectory(pszDir: String): Unit
  }
  object WizShellLinkA {
    
    inline def apply(
      AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA,
      GetArguments: (String, Double) => Unit,
      GetDescription: (String, Double) => Unit,
      GetHotkey: Double => Unit,
      GetIDList: WIZ_CSIDL_FLAGS => Unit,
      GetIconLocation: (String, Double, Double) => Unit,
      GetPath: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Unit,
      GetShowCmd: WIZ_SW_FLAGS => Unit,
      GetWorkingDirectory: (String, Double) => Unit,
      Resolve: (Double, Double) => Unit,
      SetArguments: String => Unit,
      SetDescription: String => Unit,
      SetHotkey: Double => Unit,
      SetIDList: WIZ_CSIDL_FLAGS => Unit,
      SetIconLocation: (String, Double) => Unit,
      SetPath: String => Unit,
      SetRelativePath: (String, Double) => Unit,
      SetShowCmd: WIZ_SW_FLAGS => Unit,
      SetWorkingDirectory: String => Unit
    ): WizShellLinkA = {
      val __obj = js.Dynamic.literal(GetArguments = js.Any.fromFunction2(GetArguments), GetDescription = js.Any.fromFunction2(GetDescription), GetHotkey = js.Any.fromFunction1(GetHotkey), GetIDList = js.Any.fromFunction1(GetIDList), GetIconLocation = js.Any.fromFunction3(GetIconLocation), GetPath = js.Any.fromFunction4(GetPath), GetShowCmd = js.Any.fromFunction1(GetShowCmd), GetWorkingDirectory = js.Any.fromFunction2(GetWorkingDirectory), Resolve = js.Any.fromFunction2(Resolve), SetArguments = js.Any.fromFunction1(SetArguments), SetDescription = js.Any.fromFunction1(SetDescription), SetHotkey = js.Any.fromFunction1(SetHotkey), SetIDList = js.Any.fromFunction1(SetIDList), SetIconLocation = js.Any.fromFunction2(SetIconLocation), SetPath = js.Any.fromFunction1(SetPath), SetRelativePath = js.Any.fromFunction2(SetRelativePath), SetShowCmd = js.Any.fromFunction1(SetShowCmd), SetWorkingDirectory = js.Any.fromFunction1(SetWorkingDirectory))
      __obj.updateDynamic("AccWizObjects.WizShellLinkA_typekey")(AccWizObjectsDotWizShellLinkA_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizShellLinkA]
    }
    
    extension [Self <: WizShellLinkA](x: Self) {
      
      inline def setAccWizObjectsDotWizShellLinkA_typekey(value: WizShellLinkA): Self = StObject.set(x, "AccWizObjects.WizShellLinkA_typekey", value.asInstanceOf[js.Any])
      
      inline def setGetArguments(value: (String, Double) => Unit): Self = StObject.set(x, "GetArguments", js.Any.fromFunction2(value))
      
      inline def setGetDescription(value: (String, Double) => Unit): Self = StObject.set(x, "GetDescription", js.Any.fromFunction2(value))
      
      inline def setGetHotkey(value: Double => Unit): Self = StObject.set(x, "GetHotkey", js.Any.fromFunction1(value))
      
      inline def setGetIDList(value: WIZ_CSIDL_FLAGS => Unit): Self = StObject.set(x, "GetIDList", js.Any.fromFunction1(value))
      
      inline def setGetIconLocation(value: (String, Double, Double) => Unit): Self = StObject.set(x, "GetIconLocation", js.Any.fromFunction3(value))
      
      inline def setGetPath(value: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Unit): Self = StObject.set(x, "GetPath", js.Any.fromFunction4(value))
      
      inline def setGetShowCmd(value: WIZ_SW_FLAGS => Unit): Self = StObject.set(x, "GetShowCmd", js.Any.fromFunction1(value))
      
      inline def setGetWorkingDirectory(value: (String, Double) => Unit): Self = StObject.set(x, "GetWorkingDirectory", js.Any.fromFunction2(value))
      
      inline def setResolve(value: (Double, Double) => Unit): Self = StObject.set(x, "Resolve", js.Any.fromFunction2(value))
      
      inline def setSetArguments(value: String => Unit): Self = StObject.set(x, "SetArguments", js.Any.fromFunction1(value))
      
      inline def setSetDescription(value: String => Unit): Self = StObject.set(x, "SetDescription", js.Any.fromFunction1(value))
      
      inline def setSetHotkey(value: Double => Unit): Self = StObject.set(x, "SetHotkey", js.Any.fromFunction1(value))
      
      inline def setSetIDList(value: WIZ_CSIDL_FLAGS => Unit): Self = StObject.set(x, "SetIDList", js.Any.fromFunction1(value))
      
      inline def setSetIconLocation(value: (String, Double) => Unit): Self = StObject.set(x, "SetIconLocation", js.Any.fromFunction2(value))
      
      inline def setSetPath(value: String => Unit): Self = StObject.set(x, "SetPath", js.Any.fromFunction1(value))
      
      inline def setSetRelativePath(value: (String, Double) => Unit): Self = StObject.set(x, "SetRelativePath", js.Any.fromFunction2(value))
      
      inline def setSetShowCmd(value: WIZ_SW_FLAGS => Unit): Self = StObject.set(x, "SetShowCmd", js.Any.fromFunction1(value))
      
      inline def setSetWorkingDirectory(value: String => Unit): Self = StObject.set(x, "SetWorkingDirectory", js.Any.fromFunction1(value))
    }
  }
}
