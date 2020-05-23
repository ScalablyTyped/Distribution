package typings.activexAccess.global

import typings.activexAccess.AccWizObjects.WIZ_CSIDL_FLAGS
import typings.activexAccess.AccWizObjects.WIZ_SW_FLAGS
import typings.activexAccess.AccWizObjects.WIZ_WIN32_FIND_DATA
import typings.activexStdole.stdole.IFontDisp
import typings.activexStdole.stdole.IPictureDisp
import typings.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AccWizObjects")
@js.native
object AccWizObjects extends js.Object {
  /** Field List Control */
  @js.native
  class FieldList protected ()
    extends typings.activexAccess.AccWizObjects.FieldList {
    /* CompleteClass */
    @JSName("AccWizObjects.FieldList_typekey")
    override var AccWizObjectsDotFieldList_typekey: typings.activexAccess.AccWizObjects.FieldList = js.native
    /* CompleteClass */
    override val FieldListCount: Double = js.native
    /* CompleteClass */
    override var HScrollPos: Double = js.native
    /* CompleteClass */
    override val JoinLineCount: Double = js.native
    /* CompleteClass */
    override var PersistentHighlight: Boolean = js.native
    /* CompleteClass */
    override var Picture: IPictureDisp = js.native
    /* CompleteClass */
    override var PictureCols: Double = js.native
    /* CompleteClass */
    override var PictureRows: Double = js.native
    /* CompleteClass */
    override var ScrollBars: Double = js.native
    /* CompleteClass */
    override var SelectedFieldListIndex: Double = js.native
    /* CompleteClass */
    override var VScrollPos: Double = js.native
    /* CompleteClass */
    override def AddFieldList(
      bstrCaption: String,
      nLeft: Double,
      nTop: Double,
      nWidth: Double,
      nHeight: Double,
      nMultiSelectType: Double,
      cCols: Double,
      fShowPictures: Boolean
    ): Unit = js.native
    /* CompleteClass */
    override def AddJoinLine(
      IFieldList: Double,
      iField: Double,
      iForeignFieldList: Double,
      iForeignField: Double,
      lAttribs: Double
    ): Unit = js.native
    /* CompleteClass */
    override def DeleteFieldList(IFieldList: Double): Unit = js.native
    /* CompleteClass */
    override def DeleteJoinLine(IJoinLine: Double): Unit = js.native
    /* CompleteClass */
    override def FieldLists(IFieldList: Double): js.Any = js.native
    /* CompleteClass */
    override def JoinLines(IJoinLine: Double): js.Any = js.native
    /* CompleteClass */
    override def SetCursor(nCursorID: Double): Unit = js.native
  }
  
  /** ImexGrid Control */
  @js.native
  class ImexGrid protected ()
    extends typings.activexAccess.AccWizObjects.ImexGrid {
    /* CompleteClass */
    @JSName("AccWizObjects.ImexGrid_typekey")
    override var AccWizObjectsDotImexGrid_typekey: typings.activexAccess.AccWizObjects.ImexGrid = js.native
    /* CompleteClass */
    override var AllowColumnSizing: Boolean = js.native
    /* CompleteClass */
    override var BackColor: OLE_COLOR = js.native
    /* CompleteClass */
    override var Caption: String = js.native
    /* CompleteClass */
    override var ColumnClickBehavior: Double = js.native
    /* CompleteClass */
    override val ColumnCount: Double = js.native
    /* CompleteClass */
    override var ColumnState: js.Any = js.native
    /* CompleteClass */
    override var Delimiters: String = js.native
    /* CompleteClass */
    override var DrawTextLogicalOrder: Boolean = js.native
    /* CompleteClass */
    override var FirstRowNumber: Double = js.native
    /* CompleteClass */
    override var Font: IFontDisp = js.native
    /* CompleteClass */
    override var GridBackColor: OLE_COLOR = js.native
    /* CompleteClass */
    override var GridFont: IFontDisp = js.native
    /* CompleteClass */
    override var GridHeader: Double = js.native
    /* CompleteClass */
    override var Painting: Boolean = js.native
    /* CompleteClass */
    override val RowCount: Double = js.native
    /* CompleteClass */
    override var ShowColLines: Boolean = js.native
    /* CompleteClass */
    override var ShowRowHeaders: Boolean = js.native
    /* CompleteClass */
    override var StringDelimiters: String = js.native
    /* CompleteClass */
    override def AddColumn(ColumnCaption: String, ColumnWidth: Double, Index: Double): Unit = js.native
    /* CompleteClass */
    override def AddRow(RowText: String, Index: Double): Unit = js.native
    /* CompleteClass */
    override def CalcBestColumns(): Unit = js.native
    /* CompleteClass */
    override def ClearColumns(): Unit = js.native
    /* CompleteClass */
    override def ClearRows(): Unit = js.native
    /* CompleteClass */
    override def Columns(ColumnNumber: Double): js.Any = js.native
    /* CompleteClass */
    override def DeleteColumn(Index: Double): Unit = js.native
    /* CompleteClass */
    override def DeleteRow(Index: Double): Unit = js.native
    /* CompleteClass */
    override def Refresh(): Unit = js.native
    /* CompleteClass */
    override def ResetHScrollPos(): Unit = js.native
    /* CompleteClass */
    override def ResetVScrollPos(): Unit = js.native
    /* CompleteClass */
    override def RowText(RowNumber: Double): String = js.native
  }
  
  /** WizShellLinkA Class */
  @js.native
  class WizShellLinkA protected ()
    extends typings.activexAccess.AccWizObjects.WizShellLinkA {
    /* CompleteClass */
    @JSName("AccWizObjects.WizShellLinkA_typekey")
    override var AccWizObjectsDotWizShellLinkA_typekey: typings.activexAccess.AccWizObjects.WizShellLinkA = js.native
    /** GetArguments */
    /* CompleteClass */
    override def GetArguments(pszArgs: String, cchMaxPath: Double): Unit = js.native
    /** GetDescription */
    /* CompleteClass */
    override def GetDescription(pszName: String, cchMaxName: Double): Unit = js.native
    /** GetHotkey */
    /* CompleteClass */
    override def GetHotkey(pwHotkey: Double): Unit = js.native
    /** GetIDList */
    /* CompleteClass */
    override def GetIDList(ppidl: WIZ_CSIDL_FLAGS): Unit = js.native
    /** GetIconLocation */
    /* CompleteClass */
    override def GetIconLocation(pszIconPath: String, cchIconPath: Double, piIcon: Double): Unit = js.native
    /** GetPath */
    /* CompleteClass */
    override def GetPath(pszFile: String, cchMaxPath: Double, pfd: WIZ_WIN32_FIND_DATA, fflags: Double): Unit = js.native
    /** GetShowCmd */
    /* CompleteClass */
    override def GetShowCmd(piShowCmd: WIZ_SW_FLAGS): Unit = js.native
    /** GetWorkingDirectory */
    /* CompleteClass */
    override def GetWorkingDirectory(pszDir: String, cchMaxPath: Double): Unit = js.native
    /** Resolve */
    /* CompleteClass */
    override def Resolve(hWnd: Double, fflags: Double): Unit = js.native
    /** SetArguments */
    /* CompleteClass */
    override def SetArguments(pszArgs: String): Unit = js.native
    /** SetDescription */
    /* CompleteClass */
    override def SetDescription(pszName: String): Unit = js.native
    /** SetHotkey */
    /* CompleteClass */
    override def SetHotkey(wHotkey: Double): Unit = js.native
    /** SetIDList */
    /* CompleteClass */
    override def SetIDList(pidl: WIZ_CSIDL_FLAGS): Unit = js.native
    /** SetIconLocation */
    /* CompleteClass */
    override def SetIconLocation(pszIconPath: String, iIcon: Double): Unit = js.native
    /** SetPath */
    /* CompleteClass */
    override def SetPath(pszFile: String): Unit = js.native
    /** SetRelativePath */
    /* CompleteClass */
    override def SetRelativePath(pszPathRel: String, dwReserved: Double): Unit = js.native
    /** SetShowCmd */
    /* CompleteClass */
    override def SetShowCmd(iShowCmd: WIZ_SW_FLAGS): Unit = js.native
    /** SetWorkingDirectory */
    /* CompleteClass */
    override def SetWorkingDirectory(pszDir: String): Unit = js.native
  }
  
}

