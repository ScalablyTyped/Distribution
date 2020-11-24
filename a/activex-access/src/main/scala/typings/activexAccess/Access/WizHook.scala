package typings.activexAccess.Access

import typings.activexDao.DAO.Database
import typings.activexDao.DAO.Workspace
import typings.activexVbide.VBIDE.VBProject
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizHook extends js.Object {
  
  @JSName("Access.WizHook_typekey")
  var AccessDotWizHook_typekey: WizHook = js.native
  
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
  
  val DbcVbProject: VBProject = js.native
  
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
  
  val Key: Double = js.native
  
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
object WizHook {
  
  @scala.inline
  def apply(
    AccessDotWizHook_typekey: WizHook,
    AccessUserDataDir: () => String,
    AccessWizFilePath: String => String,
    AdpUIDPwd: (String, String) => Boolean,
    AnalyzeQuery: (Workspace, Database, String, String) => Double,
    AnalyzeTable: (Workspace, Database, String, Boolean, String) => Double,
    ArgsOfActid: Double => Double,
    BracketString: (String, Double) => Boolean,
    CacheStatus: String => Unit,
    CloseCurrentDatabase: () => Boolean,
    CreateDataPageControl: (String, String, Double, String, Double, String, Double, Double, Double, Double) => Unit,
    CurrentLangID: () => Double,
    DbcVbProject: VBProject,
    EmbedFileOnDataPage: (String, String) => String,
    EnglishPictToLocal: (String, String) => Boolean,
    ExecuteTempImexSpec: String => Unit,
    FCacheStatus: () => Boolean,
    FCreateNameMap: (Double, String) => Boolean,
    FGetMSDE: Boolean => Boolean,
    FIsFEWch: Double => Boolean,
    FIsPublishedXasTable: String => Boolean,
    FIsValidXasObjectName: (String, AcObjectType) => Boolean,
    FIsXasDb: () => Boolean,
    FileExists: String => Boolean,
    FirstDbcDataObject: (String, AcObjectType, Double) => Boolean,
    FullPath: (String, String) => Double,
    GetAccWizRCPath: () => String,
    GetAdeRegistryPath: () => String,
    GetColumns: String => String,
    GetCurrentView: String => Double,
    GetDisabledExtensions: () => String,
    GetFileName: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean) => Double,
    GetFileName2: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean, js.Any) => Double,
    GetFileOdso: (String, String) => Double,
    GetImexTblName: () => String,
    GetInfoForColumns: String => String,
    GetLinkedListProperty: (String, String, Boolean) => String,
    GetObjPubOption: (String, AcObjectType, Boolean) => Double,
    GetScriptString: (Double, Double, String) => Boolean,
    GetWizGlob: Double => js.Any,
    GlobalProcExists: String => Boolean,
    HideDates: () => Boolean,
    IsMatchToDbcConnectString: String => Boolean,
    IsMemberSafe: Double => Boolean,
    IsValidIdent: String => Boolean,
    Key: Double,
    KeyboardLangID: () => Double,
    KnownWizLeaks: Boolean => Unit,
    LoadImexSpecSolution: String => Unit,
    LocalFont: () => String,
    NameFromActid: Double => String,
    ObjTypOfRecordSource: String => Double,
    OfficeAddInDir: () => String,
    OpenEmScript: (AccessProperty, Double, Double, Double) => Double,
    OpenPictureFile: (String, Boolean) => Boolean,
    OpenScript: (String, String, Double, Double, Double) => Double,
    ReportLeaksToFile: (Boolean, String) => Unit,
    SaveObject: (String, Double) => Unit,
    SaveScriptString: (Double, Double, String) => Boolean,
    SetDefaultSpecName: String => Unit,
    SetDpBlockKeyInput: Boolean => Unit,
    SetVbaPassword: (String, String, String) => Boolean,
    SetWizGlob: (Double, js.Any) => Unit,
    SortStringArray: SafeArray[String] => Unit,
    SplitPath: (String, String, String, String, String) => Unit,
    TableFieldHasUniqueIndex: (String, String) => Boolean,
    TranslateExpression: (String, String, Double, Double) => Boolean,
    TwipsFromFont: (String, Double, Double, Boolean, Boolean, Double, String, Double, Double, Double) => Boolean,
    WizCopyCmdbars: String => Unit,
    WizHelp: (String, Double, Double) => Boolean,
    WizMsgBox: (String, String, Double, Double, String) => Double
  ): WizHook = {
    val __obj = js.Dynamic.literal(AccessUserDataDir = js.Any.fromFunction0(AccessUserDataDir), AccessWizFilePath = js.Any.fromFunction1(AccessWizFilePath), AdpUIDPwd = js.Any.fromFunction2(AdpUIDPwd), AnalyzeQuery = js.Any.fromFunction4(AnalyzeQuery), AnalyzeTable = js.Any.fromFunction5(AnalyzeTable), ArgsOfActid = js.Any.fromFunction1(ArgsOfActid), BracketString = js.Any.fromFunction2(BracketString), CacheStatus = js.Any.fromFunction1(CacheStatus), CloseCurrentDatabase = js.Any.fromFunction0(CloseCurrentDatabase), CreateDataPageControl = js.Any.fromFunction10(CreateDataPageControl), CurrentLangID = js.Any.fromFunction0(CurrentLangID), DbcVbProject = DbcVbProject.asInstanceOf[js.Any], EmbedFileOnDataPage = js.Any.fromFunction2(EmbedFileOnDataPage), EnglishPictToLocal = js.Any.fromFunction2(EnglishPictToLocal), ExecuteTempImexSpec = js.Any.fromFunction1(ExecuteTempImexSpec), FCacheStatus = js.Any.fromFunction0(FCacheStatus), FCreateNameMap = js.Any.fromFunction2(FCreateNameMap), FGetMSDE = js.Any.fromFunction1(FGetMSDE), FIsFEWch = js.Any.fromFunction1(FIsFEWch), FIsPublishedXasTable = js.Any.fromFunction1(FIsPublishedXasTable), FIsValidXasObjectName = js.Any.fromFunction2(FIsValidXasObjectName), FIsXasDb = js.Any.fromFunction0(FIsXasDb), FileExists = js.Any.fromFunction1(FileExists), FirstDbcDataObject = js.Any.fromFunction3(FirstDbcDataObject), FullPath = js.Any.fromFunction2(FullPath), GetAccWizRCPath = js.Any.fromFunction0(GetAccWizRCPath), GetAdeRegistryPath = js.Any.fromFunction0(GetAdeRegistryPath), GetColumns = js.Any.fromFunction1(GetColumns), GetCurrentView = js.Any.fromFunction1(GetCurrentView), GetDisabledExtensions = js.Any.fromFunction0(GetDisabledExtensions), GetFileName = js.Any.fromFunction11(GetFileName), GetFileName2 = js.Any.fromFunction12(GetFileName2), GetFileOdso = js.Any.fromFunction2(GetFileOdso), GetImexTblName = js.Any.fromFunction0(GetImexTblName), GetInfoForColumns = js.Any.fromFunction1(GetInfoForColumns), GetLinkedListProperty = js.Any.fromFunction3(GetLinkedListProperty), GetObjPubOption = js.Any.fromFunction3(GetObjPubOption), GetScriptString = js.Any.fromFunction3(GetScriptString), GetWizGlob = js.Any.fromFunction1(GetWizGlob), GlobalProcExists = js.Any.fromFunction1(GlobalProcExists), HideDates = js.Any.fromFunction0(HideDates), IsMatchToDbcConnectString = js.Any.fromFunction1(IsMatchToDbcConnectString), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), IsValidIdent = js.Any.fromFunction1(IsValidIdent), Key = Key.asInstanceOf[js.Any], KeyboardLangID = js.Any.fromFunction0(KeyboardLangID), KnownWizLeaks = js.Any.fromFunction1(KnownWizLeaks), LoadImexSpecSolution = js.Any.fromFunction1(LoadImexSpecSolution), LocalFont = js.Any.fromFunction0(LocalFont), NameFromActid = js.Any.fromFunction1(NameFromActid), ObjTypOfRecordSource = js.Any.fromFunction1(ObjTypOfRecordSource), OfficeAddInDir = js.Any.fromFunction0(OfficeAddInDir), OpenEmScript = js.Any.fromFunction4(OpenEmScript), OpenPictureFile = js.Any.fromFunction2(OpenPictureFile), OpenScript = js.Any.fromFunction5(OpenScript), ReportLeaksToFile = js.Any.fromFunction2(ReportLeaksToFile), SaveObject = js.Any.fromFunction2(SaveObject), SaveScriptString = js.Any.fromFunction3(SaveScriptString), SetDefaultSpecName = js.Any.fromFunction1(SetDefaultSpecName), SetDpBlockKeyInput = js.Any.fromFunction1(SetDpBlockKeyInput), SetVbaPassword = js.Any.fromFunction3(SetVbaPassword), SetWizGlob = js.Any.fromFunction2(SetWizGlob), SortStringArray = js.Any.fromFunction1(SortStringArray), SplitPath = js.Any.fromFunction5(SplitPath), TableFieldHasUniqueIndex = js.Any.fromFunction2(TableFieldHasUniqueIndex), TranslateExpression = js.Any.fromFunction4(TranslateExpression), TwipsFromFont = js.Any.fromFunction10(TwipsFromFont), WizCopyCmdbars = js.Any.fromFunction1(WizCopyCmdbars), WizHelp = js.Any.fromFunction3(WizHelp), WizMsgBox = js.Any.fromFunction5(WizMsgBox))
    __obj.updateDynamic("Access.WizHook_typekey")(AccessDotWizHook_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizHook]
  }
  
  @scala.inline
  implicit class WizHookOps[Self <: WizHook] (val x: Self) extends AnyVal {
    
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
    def setAccessDotWizHook_typekey(value: WizHook): Self = this.set("Access.WizHook_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUserDataDir(value: () => String): Self = this.set("AccessUserDataDir", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAccessWizFilePath(value: String => String): Self = this.set("AccessWizFilePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdpUIDPwd(value: (String, String) => Boolean): Self = this.set("AdpUIDPwd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAnalyzeQuery(value: (Workspace, Database, String, String) => Double): Self = this.set("AnalyzeQuery", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAnalyzeTable(value: (Workspace, Database, String, Boolean, String) => Double): Self = this.set("AnalyzeTable", js.Any.fromFunction5(value))
    
    @scala.inline
    def setArgsOfActid(value: Double => Double): Self = this.set("ArgsOfActid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBracketString(value: (String, Double) => Boolean): Self = this.set("BracketString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCacheStatus(value: String => Unit): Self = this.set("CacheStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseCurrentDatabase(value: () => Boolean): Self = this.set("CloseCurrentDatabase", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateDataPageControl(value: (String, String, Double, String, Double, String, Double, Double, Double, Double) => Unit): Self = this.set("CreateDataPageControl", js.Any.fromFunction10(value))
    
    @scala.inline
    def setCurrentLangID(value: () => Double): Self = this.set("CurrentLangID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDbcVbProject(value: VBProject): Self = this.set("DbcVbProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedFileOnDataPage(value: (String, String) => String): Self = this.set("EmbedFileOnDataPage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnglishPictToLocal(value: (String, String) => Boolean): Self = this.set("EnglishPictToLocal", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExecuteTempImexSpec(value: String => Unit): Self = this.set("ExecuteTempImexSpec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFCacheStatus(value: () => Boolean): Self = this.set("FCacheStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFCreateNameMap(value: (Double, String) => Boolean): Self = this.set("FCreateNameMap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFGetMSDE(value: Boolean => Boolean): Self = this.set("FGetMSDE", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFIsFEWch(value: Double => Boolean): Self = this.set("FIsFEWch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFIsPublishedXasTable(value: String => Boolean): Self = this.set("FIsPublishedXasTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFIsValidXasObjectName(value: (String, AcObjectType) => Boolean): Self = this.set("FIsValidXasObjectName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFIsXasDb(value: () => Boolean): Self = this.set("FIsXasDb", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileExists(value: String => Boolean): Self = this.set("FileExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstDbcDataObject(value: (String, AcObjectType, Double) => Boolean): Self = this.set("FirstDbcDataObject", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFullPath(value: (String, String) => Double): Self = this.set("FullPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAccWizRCPath(value: () => String): Self = this.set("GetAccWizRCPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAdeRegistryPath(value: () => String): Self = this.set("GetAdeRegistryPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumns(value: String => String): Self = this.set("GetColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentView(value: String => Double): Self = this.set("GetCurrentView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDisabledExtensions(value: () => String): Self = this.set("GetDisabledExtensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFileName(
      value: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean) => Double
    ): Self = this.set("GetFileName", js.Any.fromFunction11(value))
    
    @scala.inline
    def setGetFileName2(
      value: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean, js.Any) => Double
    ): Self = this.set("GetFileName2", js.Any.fromFunction12(value))
    
    @scala.inline
    def setGetFileOdso(value: (String, String) => Double): Self = this.set("GetFileOdso", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetImexTblName(value: () => String): Self = this.set("GetImexTblName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInfoForColumns(value: String => String): Self = this.set("GetInfoForColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLinkedListProperty(value: (String, String, Boolean) => String): Self = this.set("GetLinkedListProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetObjPubOption(value: (String, AcObjectType, Boolean) => Double): Self = this.set("GetObjPubOption", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetScriptString(value: (Double, Double, String) => Boolean): Self = this.set("GetScriptString", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetWizGlob(value: Double => js.Any): Self = this.set("GetWizGlob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGlobalProcExists(value: String => Boolean): Self = this.set("GlobalProcExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHideDates(value: () => Boolean): Self = this.set("HideDates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMatchToDbcConnectString(value: String => Boolean): Self = this.set("IsMatchToDbcConnectString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidIdent(value: String => Boolean): Self = this.set("IsValidIdent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: Double): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardLangID(value: () => Double): Self = this.set("KeyboardLangID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKnownWizLeaks(value: Boolean => Unit): Self = this.set("KnownWizLeaks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadImexSpecSolution(value: String => Unit): Self = this.set("LoadImexSpecSolution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocalFont(value: () => String): Self = this.set("LocalFont", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNameFromActid(value: Double => String): Self = this.set("NameFromActid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObjTypOfRecordSource(value: String => Double): Self = this.set("ObjTypOfRecordSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOfficeAddInDir(value: () => String): Self = this.set("OfficeAddInDir", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenEmScript(value: (AccessProperty, Double, Double, Double) => Double): Self = this.set("OpenEmScript", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOpenPictureFile(value: (String, Boolean) => Boolean): Self = this.set("OpenPictureFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenScript(value: (String, String, Double, Double, Double) => Double): Self = this.set("OpenScript", js.Any.fromFunction5(value))
    
    @scala.inline
    def setReportLeaksToFile(value: (Boolean, String) => Unit): Self = this.set("ReportLeaksToFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSaveObject(value: (String, Double) => Unit): Self = this.set("SaveObject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSaveScriptString(value: (Double, Double, String) => Boolean): Self = this.set("SaveScriptString", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetDefaultSpecName(value: String => Unit): Self = this.set("SetDefaultSpecName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDpBlockKeyInput(value: Boolean => Unit): Self = this.set("SetDpBlockKeyInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVbaPassword(value: (String, String, String) => Boolean): Self = this.set("SetVbaPassword", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetWizGlob(value: (Double, js.Any) => Unit): Self = this.set("SetWizGlob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortStringArray(value: SafeArray[String] => Unit): Self = this.set("SortStringArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplitPath(value: (String, String, String, String, String) => Unit): Self = this.set("SplitPath", js.Any.fromFunction5(value))
    
    @scala.inline
    def setTableFieldHasUniqueIndex(value: (String, String) => Boolean): Self = this.set("TableFieldHasUniqueIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTranslateExpression(value: (String, String, Double, Double) => Boolean): Self = this.set("TranslateExpression", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTwipsFromFont(
      value: (String, Double, Double, Boolean, Boolean, Double, String, Double, Double, Double) => Boolean
    ): Self = this.set("TwipsFromFont", js.Any.fromFunction10(value))
    
    @scala.inline
    def setWizCopyCmdbars(value: String => Unit): Self = this.set("WizCopyCmdbars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWizHelp(value: (String, Double, Double) => Boolean): Self = this.set("WizHelp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWizMsgBox(value: (String, String, Double, Double, String) => Double): Self = this.set("WizMsgBox", js.Any.fromFunction5(value))
  }
}
