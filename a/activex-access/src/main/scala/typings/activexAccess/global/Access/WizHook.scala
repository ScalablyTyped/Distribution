package typings.activexAccess.global.Access

import typings.activexAccess.Access.AcObjectType
import typings.activexDao.DAO.Database
import typings.activexDao.DAO.Workspace
import typings.activexVbide.VBIDE.VBProject
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.WizHook")
@js.native
/* private */ class WizHook ()
  extends StObject
     with typings.activexAccess.Access.WizHook {
  
  /* private */ /* CompleteClass */
  @JSName("Access.WizHook_typekey")
  var AccessDotWizHook_typekey: typings.activexAccess.Access.WizHook = js.native
  
  /* CompleteClass */
  override def AccessUserDataDir(): String = js.native
  
  /* CompleteClass */
  override def AccessWizFilePath(bstrWhich: String): String = js.native
  
  /* CompleteClass */
  override def AdpUIDPwd(pbstrUID: String, pbstrPwd: String): Boolean = js.native
  
  /* CompleteClass */
  override def AnalyzeQuery(Workspace: Workspace, Database: Database, Query: String, Results: String): Double = js.native
  
  /* CompleteClass */
  override def AnalyzeTable(Workspace: Workspace, Database: Database, Table: String, ReturnDebugInfo: Boolean, Results: String): Double = js.native
  
  /* CompleteClass */
  override def ArgsOfActid(Actid: Double): Double = js.native
  
  /* CompleteClass */
  override def BracketString(String: String, flags: Double): Boolean = js.native
  
  /* CompleteClass */
  override def CacheStatus(bstrStatus: String): Unit = js.native
  
  /* CompleteClass */
  override def CloseCurrentDatabase(): Boolean = js.native
  
  /* CompleteClass */
  override def CreateDataPageControl(
    DpName: String,
    CtlName: String,
    Typ: Double,
    Section: String,
    SectionType: Double,
    AppletCode: String,
    X: Double,
    Y: Double,
    dx: Double,
    dy: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def CurrentLangID(): Double = js.native
  
  /* CompleteClass */
  override val DbcVbProject: VBProject = js.native
  
  /* CompleteClass */
  override def EmbedFileOnDataPage(DpName: String, FileToInsert: String): String = js.native
  
  /* CompleteClass */
  override def EnglishPictToLocal(In: String, Out: String): Boolean = js.native
  
  /* CompleteClass */
  override def ExecuteTempImexSpec(bstrSpecXML: String): Unit = js.native
  
  /* CompleteClass */
  override def FCacheStatus(): Boolean = js.native
  
  /* CompleteClass */
  override def FCreateNameMap(objtyp: Double, bstrObjName: String): Boolean = js.native
  
  /* CompleteClass */
  override def FGetMSDE(fBlockKeys: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def FIsFEWch(wch: Double): Boolean = js.native
  
  /* CompleteClass */
  override def FIsPublishedXasTable(bstrObjectName: String): Boolean = js.native
  
  /* CompleteClass */
  override def FIsValidXasObjectName(bstrObjectName: String, iobjtyp: AcObjectType): Boolean = js.native
  
  /* CompleteClass */
  override def FIsXasDb(): Boolean = js.native
  
  /* CompleteClass */
  override def FileExists(File: String): Boolean = js.native
  
  /* CompleteClass */
  override def FirstDbcDataObject(Name: String, ObjType: AcObjectType, Attribs: Double): Boolean = js.native
  
  /* CompleteClass */
  override def FullPath(RelativePath: String, FullPath: String): Double = js.native
  
  /* CompleteClass */
  override def GetAccWizRCPath(): String = js.native
  
  /* CompleteClass */
  override def GetAdeRegistryPath(): String = js.native
  
  /* CompleteClass */
  override def GetColumns(bstrBase: String): String = js.native
  
  /* CompleteClass */
  override def GetCurrentView(bstrTableName: String): Double = js.native
  
  /* CompleteClass */
  override def GetDisabledExtensions(): String = js.native
  
  /* CompleteClass */
  override def GetFileName(
    hwndOwner: Double,
    AppName: String,
    DlgTitle: String,
    OpenTitle: String,
    File: String,
    InitialDir: String,
    Filter: String,
    FilterIndex: Double,
    View: Double,
    flags: Double,
    fOpen: Boolean
  ): Double = js.native
  
  /* CompleteClass */
  override def GetFileName2(
    hwndOwner: Double,
    AppName: String,
    DlgTitle: String,
    OpenTitle: String,
    File: String,
    InitialDir: String,
    Filter: String,
    FilterIndex: Double,
    View: Double,
    flags: Double,
    fOpen: Boolean,
    fFileSystem: js.Any
  ): Double = js.native
  
  /* CompleteClass */
  override def GetFileOdso(bstrExt: String, bstrFilename: String): Double = js.native
  
  /* CompleteClass */
  override def GetImexTblName(): String = js.native
  
  /* CompleteClass */
  override def GetInfoForColumns(bstrBase: String): String = js.native
  
  /* CompleteClass */
  override def GetLinkedListProperty(bstrTableName: String, bstrPropertyName: String, fServer: Boolean): String = js.native
  
  /* CompleteClass */
  override def GetObjPubOption(bstrObjectName: String, iobjtyp: AcObjectType, fTablesAsClient: Boolean): Double = js.native
  
  /* CompleteClass */
  override def GetScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean = js.native
  
  /* CompleteClass */
  override def GetWizGlob(lWhich: Double): js.Any = js.native
  
  /* CompleteClass */
  override def GlobalProcExists(Name: String): Boolean = js.native
  
  /* CompleteClass */
  override def HideDates(): Boolean = js.native
  
  /* CompleteClass */
  override def IsMatchToDbcConnectString(bstrConnectionString: String): Boolean = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  override def IsValidIdent(Identifier: String): Boolean = js.native
  
  /* CompleteClass */
  override val Key: Double = js.native
  
  /* CompleteClass */
  override def KeyboardLangID(): Double = js.native
  
  /* CompleteClass */
  override def KnownWizLeaks(fStart: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def LoadImexSpecSolution(bstrFilename: String): Unit = js.native
  
  /* CompleteClass */
  override def LocalFont(): String = js.native
  
  /* CompleteClass */
  override def NameFromActid(Actid: Double): String = js.native
  
  /* CompleteClass */
  override def ObjTypOfRecordSource(RecordSource: String): Double = js.native
  
  /* CompleteClass */
  override def OfficeAddInDir(): String = js.native
  
  /* CompleteClass */
  override def OpenEmScript(
    pProperty: typings.activexAccess.Access.AccessProperty,
    OpenMode: Double,
    Extra: Double,
    Version: Double
  ): Double = js.native
  
  /* CompleteClass */
  override def OpenPictureFile(File: String, Cancelled: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def OpenScript(Script: String, Label: String, OpenMode: Double, Extra: Double, Version: Double): Double = js.native
  
  /* CompleteClass */
  override def ReportLeaksToFile(fRptToFile: Boolean, bstrFileOut: String): Unit = js.native
  
  /* CompleteClass */
  override def SaveObject(bstrName: String, objtyp: Double): Unit = js.native
  
  /* CompleteClass */
  override def SaveScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean = js.native
  
  /* CompleteClass */
  override def SetDefaultSpecName(bstrSpecName: String): Unit = js.native
  
  /* CompleteClass */
  override def SetDpBlockKeyInput(fBlockKeys: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def SetVbaPassword(bstrDbName: String, bstrConnect: String, bstrPasswd: String): Boolean = js.native
  
  /* CompleteClass */
  override def SetWizGlob(lWhich: Double, vValue: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def SortStringArray(Array: SafeArray[String]): Unit = js.native
  
  /* CompleteClass */
  override def SplitPath(Path: String, Drive: String, Dir: String, File: String, Ext: String): Unit = js.native
  
  /* CompleteClass */
  override def TableFieldHasUniqueIndex(Table: String, Columns: String): Boolean = js.native
  
  /* CompleteClass */
  override def TranslateExpression(In: String, Out: String, ParseFlags: Double, TranslateFlags: Double): Boolean = js.native
  
  /* CompleteClass */
  override def TwipsFromFont(
    FontName: String,
    Size: Double,
    Weight: Double,
    Italic: Boolean,
    Underline: Boolean,
    Cch: Double,
    Caption: String,
    MaxWidthCch: Double,
    dx: Double,
    dy: Double
  ): Boolean = js.native
  
  /* CompleteClass */
  override def WizCopyCmdbars(bstrADPName: String): Unit = js.native
  
  /* CompleteClass */
  override def WizHelp(HelpFile: String, wCmd: Double, ContextID: Double): Boolean = js.native
  
  /* CompleteClass */
  override def WizMsgBox(bstrText: String, bstrCaption: String, wStyle: Double, idHelpID: Double, bstrHelpFileName: String): Double = js.native
}
