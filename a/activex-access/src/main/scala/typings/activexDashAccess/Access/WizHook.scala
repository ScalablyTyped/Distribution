package typings.activexDashAccess.Access

import typings.activexDashDao.DAO.Database
import typings.activexDashDao.DAO.Workspace
import typings.activexDashVbide.VBIDE.VBProject
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.WizHook")
@js.native
class WizHook protected () extends js.Object {
  var `Access.WizHook_typekey`: WizHook = js.native
  val DbcVbProject: VBProject = js.native
  val Key: Double = js.native
  def AccessUserDataDir(): String = js.native
  def AccessWizFilePath(bstrWhich: String): String = js.native
  def AdpUIDPwd(pbstrUID: String, pbstrPwd: String): Boolean = js.native
  def AnalyzeQuery(Workspace: Workspace, Database: Database, Query: String, Results: String): Double = js.native
  def AnalyzeTable(Workspace: Workspace, Database: Database, Table: String, ReturnDebugInfo: Boolean, Results: String): Double = js.native
  def ArgsOfActid(Actid: Double): Double = js.native
  def BracketString(String: String, flags: Double): Boolean = js.native
  def CacheStatus(bstrStatus: String): Unit = js.native
  def CloseCurrentDatabase(): Boolean = js.native
  def CreateDataPageControl(
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
  def CurrentLangID(): Double = js.native
  def EmbedFileOnDataPage(DpName: String, FileToInsert: String): String = js.native
  def EnglishPictToLocal(In: String, Out: String): Boolean = js.native
  def ExecuteTempImexSpec(bstrSpecXML: String): Unit = js.native
  def FCacheStatus(): Boolean = js.native
  def FCreateNameMap(objtyp: Double, bstrObjName: String): Boolean = js.native
  def FGetMSDE(fBlockKeys: Boolean): Boolean = js.native
  def FIsFEWch(wch: Double): Boolean = js.native
  def FIsPublishedXasTable(bstrObjectName: String): Boolean = js.native
  def FIsValidXasObjectName(bstrObjectName: String, iobjtyp: AcObjectType): Boolean = js.native
  def FIsXasDb(): Boolean = js.native
  def FileExists(File: String): Boolean = js.native
  def FirstDbcDataObject(Name: String, ObjType: AcObjectType, Attribs: Double): Boolean = js.native
  def FullPath(RelativePath: String, FullPath: String): Double = js.native
  def GetAccWizRCPath(): String = js.native
  def GetAdeRegistryPath(): String = js.native
  def GetColumns(bstrBase: String): String = js.native
  def GetCurrentView(bstrTableName: String): Double = js.native
  def GetDisabledExtensions(): String = js.native
  def GetFileName(
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
  def GetFileName2(
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
  def GetFileOdso(bstrExt: String, bstrFilename: String): Double = js.native
  def GetImexTblName(): String = js.native
  def GetInfoForColumns(bstrBase: String): String = js.native
  def GetLinkedListProperty(bstrTableName: String, bstrPropertyName: String, fServer: Boolean): String = js.native
  def GetObjPubOption(bstrObjectName: String, iobjtyp: AcObjectType, fTablesAsClient: Boolean): Double = js.native
  def GetScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean = js.native
  def GetWizGlob(lWhich: Double): js.Any = js.native
  def GlobalProcExists(Name: String): Boolean = js.native
  def HideDates(): Boolean = js.native
  def IsMatchToDbcConnectString(bstrConnectionString: String): Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def IsValidIdent(Identifier: String): Boolean = js.native
  def KeyboardLangID(): Double = js.native
  def KnownWizLeaks(fStart: Boolean): Unit = js.native
  def LoadImexSpecSolution(bstrFilename: String): Unit = js.native
  def LocalFont(): String = js.native
  def NameFromActid(Actid: Double): String = js.native
  def ObjTypOfRecordSource(RecordSource: String): Double = js.native
  def OfficeAddInDir(): String = js.native
  def OpenEmScript(pProperty: AccessProperty, OpenMode: Double, Extra: Double, Version: Double): Double = js.native
  def OpenPictureFile(File: String, Cancelled: Boolean): Boolean = js.native
  def OpenScript(Script: String, Label: String, OpenMode: Double, Extra: Double, Version: Double): Double = js.native
  def ReportLeaksToFile(fRptToFile: Boolean, bstrFileOut: String): Unit = js.native
  def SaveObject(bstrName: String, objtyp: Double): Unit = js.native
  def SaveScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean = js.native
  def SetDefaultSpecName(bstrSpecName: String): Unit = js.native
  def SetDpBlockKeyInput(fBlockKeys: Boolean): Unit = js.native
  def SetVbaPassword(bstrDbName: String, bstrConnect: String, bstrPasswd: String): Boolean = js.native
  def SetWizGlob(lWhich: Double, vValue: js.Any): Unit = js.native
  def SortStringArray(Array: SafeArray[String]): Unit = js.native
  def SplitPath(Path: String, Drive: String, Dir: String, File: String, Ext: String): Unit = js.native
  def TableFieldHasUniqueIndex(Table: String, Columns: String): Boolean = js.native
  def TranslateExpression(In: String, Out: String, ParseFlags: Double, TranslateFlags: Double): Boolean = js.native
  def TwipsFromFont(
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
  def WizCopyCmdbars(bstrADPName: String): Unit = js.native
  def WizHelp(HelpFile: String, wCmd: Double, ContextID: Double): Boolean = js.native
  def WizMsgBox(bstrText: String, bstrCaption: String, wStyle: Double, idHelpID: Double, bstrHelpFileName: String): Double = js.native
}

