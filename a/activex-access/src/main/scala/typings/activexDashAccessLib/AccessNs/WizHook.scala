package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.WizHook")
@js.native
class WizHook protected () extends js.Object {
  var `Access.WizHook_typekey`: WizHook = js.native
  val DbcVbProject: activexDashVbideLib.VBIDENs.VBProject = js.native
  val Key: scala.Double = js.native
  def AccessUserDataDir(): java.lang.String = js.native
  def AccessWizFilePath(bstrWhich: java.lang.String): java.lang.String = js.native
  def AdpUIDPwd(pbstrUID: java.lang.String, pbstrPwd: java.lang.String): scala.Boolean = js.native
  def AnalyzeQuery(
    Workspace: activexDashDaoLib.DAONs.Workspace,
    Database: activexDashDaoLib.DAONs.Database,
    Query: java.lang.String,
    Results: java.lang.String
  ): scala.Double = js.native
  def AnalyzeTable(
    Workspace: activexDashDaoLib.DAONs.Workspace,
    Database: activexDashDaoLib.DAONs.Database,
    Table: java.lang.String,
    ReturnDebugInfo: scala.Boolean,
    Results: java.lang.String
  ): scala.Double = js.native
  def ArgsOfActid(Actid: scala.Double): scala.Double = js.native
  def BracketString(String: java.lang.String, flags: scala.Double): scala.Boolean = js.native
  def CacheStatus(bstrStatus: java.lang.String): scala.Unit = js.native
  def CloseCurrentDatabase(): scala.Boolean = js.native
  def CreateDataPageControl(
    DpName: java.lang.String,
    CtlName: java.lang.String,
    Typ: scala.Double,
    Section: java.lang.String,
    SectionType: scala.Double,
    AppletCode: java.lang.String,
    X: scala.Double,
    Y: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): scala.Unit = js.native
  def CurrentLangID(): scala.Double = js.native
  def EmbedFileOnDataPage(DpName: java.lang.String, FileToInsert: java.lang.String): java.lang.String = js.native
  def EnglishPictToLocal(In: java.lang.String, Out: java.lang.String): scala.Boolean = js.native
  def ExecuteTempImexSpec(bstrSpecXML: java.lang.String): scala.Unit = js.native
  def FCacheStatus(): scala.Boolean = js.native
  def FCreateNameMap(objtyp: scala.Double, bstrObjName: java.lang.String): scala.Boolean = js.native
  def FGetMSDE(fBlockKeys: scala.Boolean): scala.Boolean = js.native
  def FIsFEWch(wch: scala.Double): scala.Boolean = js.native
  def FIsPublishedXasTable(bstrObjectName: java.lang.String): scala.Boolean = js.native
  def FIsValidXasObjectName(bstrObjectName: java.lang.String, iobjtyp: AcObjectType): scala.Boolean = js.native
  def FIsXasDb(): scala.Boolean = js.native
  def FileExists(File: java.lang.String): scala.Boolean = js.native
  def FirstDbcDataObject(Name: java.lang.String, ObjType: AcObjectType, Attribs: scala.Double): scala.Boolean = js.native
  def FullPath(RelativePath: java.lang.String, FullPath: java.lang.String): scala.Double = js.native
  def GetAccWizRCPath(): java.lang.String = js.native
  def GetAdeRegistryPath(): java.lang.String = js.native
  def GetColumns(bstrBase: java.lang.String): java.lang.String = js.native
  def GetCurrentView(bstrTableName: java.lang.String): scala.Double = js.native
  def GetDisabledExtensions(): java.lang.String = js.native
  def GetFileName(
    hwndOwner: scala.Double,
    AppName: java.lang.String,
    DlgTitle: java.lang.String,
    OpenTitle: java.lang.String,
    File: java.lang.String,
    InitialDir: java.lang.String,
    Filter: java.lang.String,
    FilterIndex: scala.Double,
    View: scala.Double,
    flags: scala.Double,
    fOpen: scala.Boolean
  ): scala.Double = js.native
  def GetFileName2(
    hwndOwner: scala.Double,
    AppName: java.lang.String,
    DlgTitle: java.lang.String,
    OpenTitle: java.lang.String,
    File: java.lang.String,
    InitialDir: java.lang.String,
    Filter: java.lang.String,
    FilterIndex: scala.Double,
    View: scala.Double,
    flags: scala.Double,
    fOpen: scala.Boolean,
    fFileSystem: js.Any
  ): scala.Double = js.native
  def GetFileOdso(bstrExt: java.lang.String, bstrFilename: java.lang.String): scala.Double = js.native
  def GetImexTblName(): java.lang.String = js.native
  def GetInfoForColumns(bstrBase: java.lang.String): java.lang.String = js.native
  def GetLinkedListProperty(bstrTableName: java.lang.String, bstrPropertyName: java.lang.String, fServer: scala.Boolean): java.lang.String = js.native
  def GetObjPubOption(bstrObjectName: java.lang.String, iobjtyp: AcObjectType, fTablesAsClient: scala.Boolean): scala.Double = js.native
  def GetScriptString(HScr: scala.Double, ScriptColumn: scala.Double, Value: java.lang.String): scala.Boolean = js.native
  def GetWizGlob(lWhich: scala.Double): js.Any = js.native
  def GlobalProcExists(Name: java.lang.String): scala.Boolean = js.native
  def HideDates(): scala.Boolean = js.native
  def IsMatchToDbcConnectString(bstrConnectionString: java.lang.String): scala.Boolean = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def IsValidIdent(Identifier: java.lang.String): scala.Boolean = js.native
  def KeyboardLangID(): scala.Double = js.native
  def KnownWizLeaks(fStart: scala.Boolean): scala.Unit = js.native
  def LoadImexSpecSolution(bstrFilename: java.lang.String): scala.Unit = js.native
  def LocalFont(): java.lang.String = js.native
  def NameFromActid(Actid: scala.Double): java.lang.String = js.native
  def ObjTypOfRecordSource(RecordSource: java.lang.String): scala.Double = js.native
  def OfficeAddInDir(): java.lang.String = js.native
  def OpenEmScript(pProperty: AccessProperty, OpenMode: scala.Double, Extra: scala.Double, Version: scala.Double): scala.Double = js.native
  def OpenPictureFile(File: java.lang.String, Cancelled: scala.Boolean): scala.Boolean = js.native
  def OpenScript(
    Script: java.lang.String,
    Label: java.lang.String,
    OpenMode: scala.Double,
    Extra: scala.Double,
    Version: scala.Double
  ): scala.Double = js.native
  def ReportLeaksToFile(fRptToFile: scala.Boolean, bstrFileOut: java.lang.String): scala.Unit = js.native
  def SaveObject(bstrName: java.lang.String, objtyp: scala.Double): scala.Unit = js.native
  def SaveScriptString(HScr: scala.Double, ScriptColumn: scala.Double, Value: java.lang.String): scala.Boolean = js.native
  def SetDefaultSpecName(bstrSpecName: java.lang.String): scala.Unit = js.native
  def SetDpBlockKeyInput(fBlockKeys: scala.Boolean): scala.Unit = js.native
  def SetVbaPassword(bstrDbName: java.lang.String, bstrConnect: java.lang.String, bstrPasswd: java.lang.String): scala.Boolean = js.native
  def SetWizGlob(lWhich: scala.Double, vValue: js.Any): scala.Unit = js.native
  def SortStringArray(Array: activexDashInteropLib.SafeArray[java.lang.String]): scala.Unit = js.native
  def SplitPath(
    Path: java.lang.String,
    Drive: java.lang.String,
    Dir: java.lang.String,
    File: java.lang.String,
    Ext: java.lang.String
  ): scala.Unit = js.native
  def TableFieldHasUniqueIndex(Table: java.lang.String, Columns: java.lang.String): scala.Boolean = js.native
  def TranslateExpression(
    In: java.lang.String,
    Out: java.lang.String,
    ParseFlags: scala.Double,
    TranslateFlags: scala.Double
  ): scala.Boolean = js.native
  def TwipsFromFont(
    FontName: java.lang.String,
    Size: scala.Double,
    Weight: scala.Double,
    Italic: scala.Boolean,
    Underline: scala.Boolean,
    Cch: scala.Double,
    Caption: java.lang.String,
    MaxWidthCch: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): scala.Boolean = js.native
  def WizCopyCmdbars(bstrADPName: java.lang.String): scala.Unit = js.native
  def WizHelp(HelpFile: java.lang.String, wCmd: scala.Double, ContextID: scala.Double): scala.Boolean = js.native
  def WizMsgBox(
    bstrText: java.lang.String,
    bstrCaption: java.lang.String,
    wStyle: scala.Double,
    idHelpID: scala.Double,
    bstrHelpFileName: java.lang.String
  ): scala.Double = js.native
}

