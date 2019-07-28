package typings.activexDashAccess.AccessNs

import typings.activexDashAccess.activexDashAccessNumbers.`10`
import typings.activexDashAccess.activexDashAccessNumbers.`11`
import typings.activexDashAccess.activexDashAccessNumbers.`12`
import typings.activexDashAccess.activexDashAccessNumbers.`13`
import typings.activexDashAccess.activexDashAccessNumbers.`1`
import typings.activexDashAccess.activexDashAccessNumbers.`2`
import typings.activexDashAccess.activexDashAccessNumbers.`3`
import typings.activexDashAccess.activexDashAccessNumbers.`4`
import typings.activexDashAccess.activexDashAccessNumbers.`5`
import typings.activexDashAccess.activexDashAccessNumbers.`6`
import typings.activexDashAccess.activexDashAccessNumbers.`7`
import typings.activexDashAccess.activexDashAccessNumbers.`8`
import typings.activexDashAccess.activexDashAccessNumbers.`9`
import typings.activexDashDao.DAONs.Database
import typings.activexDashDao.DAONs.Workspace
import typings.activexDashOffice.OfficeNs.COMAddIn
import typings.activexDashOffice.OfficeNs.COMAddIns
import typings.activexDashOffice.OfficeNs.CommandBar
import typings.activexDashOffice.OfficeNs.CommandBars
import typings.activexDashOffice.OfficeNs.IAssistance
import typings.activexDashOffice.OfficeNs.MsoAutomationSecurity
import typings.activexDashOffice.OfficeNs.MsoExtraInfoMethod
import typings.activexDashOffice.OfficeNs.MsoFeatureInstall
import typings.activexDashOffice.OfficeNs.MsoFileDialogType
import typings.activexDashOffice.OfficeNs.NewFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Application")
@js.native
class Application protected () extends js.Object {
  val ADOConnectString: String = js.native
  var `Access.Application_typekey`: typings.activexDashAccess.AccessNs.Application = js.native
  val AnswerWizard: typings.activexDashOffice.OfficeNs.AnswerWizard = js.native
  val Application: typings.activexDashAccess.AccessNs.Application = js.native
  val Assistance: IAssistance = js.native
  val Assistant: typings.activexDashOffice.OfficeNs.Assistant = js.native
  val AutoCorrect: typings.activexDashAccess.AccessNs.AutoCorrect = js.native
  var AutomationSecurity: MsoAutomationSecurity = js.native
  val BrokenReference: Boolean = js.native
  val Build: Double = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: COMAddIns = js.native
  val CodeContextObject: js.Any = js.native
  val CodeData: typings.activexDashAccess.AccessNs.CodeData = js.native
  val CodeProject: typings.activexDashAccess.AccessNs.CodeProject = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  val CurrentData: typings.activexDashAccess.AccessNs.CurrentData = js.native
  val CurrentObjectName: String = js.native
  val CurrentObjectType: AcObjectType = js.native
  val CurrentProject: typings.activexDashAccess.AccessNs.CurrentProject = js.native
  val DBEngine: typings.activexDashDao.DAONs.DBEngine = js.native
  @JSName("DataAccessPages")
  val DataAccessPages_Original: DataAccessPages = js.native
  val DefaultWebOptions: typings.activexDashAccess.AccessNs.DefaultWebOptions = js.native
  val DoCmd: typings.activexDashAccess.AccessNs.DoCmd = js.native
  var FeatureInstall: MsoFeatureInstall = js.native
  val FileSearch: typings.activexDashOffice.OfficeNs.FileSearch = js.native
  @JSName("Forms")
  val Forms_Original: Forms = js.native
  val IsCompiled: Boolean = js.native
  val LanguageSettings: typings.activexDashOffice.OfficeNs.LanguageSettings = js.native
  @JSName("LocalVars")
  val LocalVars_Original: LocalVars = js.native
  val MacroError: typings.activexDashAccess.AccessNs.MacroError = js.native
  var MenuBar: String = js.native
  @JSName("Modules")
  val Modules_Original: Modules = js.native
  val MsoDebugOptions: typings.activexDashOffice.OfficeNs.MsoDebugOptions = js.native
  val Name: String = js.native
  val NewFileTaskPane: NewFile = js.native
  val Parent: js.Any = js.native
  var Printer: typings.activexDashAccess.AccessNs.Printer = js.native
  @JSName("Printers")
  val Printers_Original: Printers = js.native
  val ProductCode: String = js.native
  @JSName("References")
  val References_Original: References = js.native
  @JSName("Reports")
  val Reports_Original: Reports = js.native
  @JSName("ReturnVars")
  val ReturnVars_Original: ReturnVars = js.native
  val Screen: typings.activexDashAccess.AccessNs.Screen = js.native
  var ShortcutMenuBar: String = js.native
  @JSName("TempVars")
  val TempVars_Original: TempVars = js.native
  var UserControl: Boolean = js.native
  val VBE: typings.activexDashVbide.VBIDENs.VBE = js.native
  val VGXFrameInterval: js.Any = js.native
  val Version: String = js.native
  var Visible: Boolean = js.native
  @JSName("WebServices")
  val WebServices_Original: WebServices = js.native
  val WizHook: typings.activexDashAccess.AccessNs.WizHook = js.native
  def AccessError(ErrorNumber: Double): String = js.native
  def AddAutoCorrect(ChangeFrom: String, ChangeTo: String): Unit = js.native
  def AddToFavorites(): Unit = js.native
  def AppLoadString(id: Double): js.Any = js.native
  def BeginUndoable(Hwnd: Double): Unit = js.native
  def BuildCriteria(Field: String, FieldType: Double, Expression: String): String = js.native
  def BuilderString(): js.Any = js.native
  def COMAddIns(Index: String): COMAddIn = js.native
  def COMAddIns(Index: Double): COMAddIn = js.native
  def CloseCurrentDatabase(): Unit = js.native
  def CodeDb(): Database = js.native
  def ColumnHistory(TableName: String, ColumnName: String, queryString: String): String = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  /** @param LogFile [LogFile=false] */
  def CompactRepair(SourceFile: String, DestinationFile: String): Boolean = js.native
  def CompactRepair(SourceFile: String, DestinationFile: String, LogFile: Boolean): Boolean = js.native
  def ConvertAccessProject(SourceFilename: String, DestinationFilename: String, DestinationFileFormat: AcFileFormat): Unit = js.native
  def CreateAccessProject(filepath: String): Unit = js.native
  def CreateAccessProject(filepath: String, Connect: String): Unit = js.native
  def CreateAdditionalData(): AdditionalData = js.native
  /** @param Section [Section=0] */
  def CreateControl(
    FormName: String,
    ControlType: AcControlType,
    Section: js.UndefOr[AcFormSection],
    Parent: js.UndefOr[String],
    ColumnName: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Control = js.native
  def CreateControlEx(
    FormName: String,
    ControlType: AcControlType,
    Section: AcFormSection,
    Parent: String,
    ControlSource: String,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double
  ): Control = js.native
  def CreateControlExOld(
    FormName: String,
    ControlType: AcControlType,
    Section: AcFormSection,
    Parent: String,
    ControlSource: String,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double
  ): Control = js.native
  /** @param Section [Section=0] */
  def CreateControlOld(
    FormName: String,
    ControlType: AcControlType,
    Section: js.UndefOr[AcFormSection],
    Parent: js.UndefOr[String],
    ColumnName: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Control = js.native
  /** @param CreateNewFile [CreateNewFile=true] */
  def CreateDataAccessPage(FileName: String): DataAccessPage = js.native
  def CreateDataAccessPage(FileName: String, CreateNewFile: Boolean): DataAccessPage = js.native
  def CreateForm(): Form = js.native
  def CreateForm(Database: String): Form = js.native
  def CreateForm(Database: String, FormTemplate: String): Form = js.native
  def CreateGroupLevel(ReportName: String, Expression: String, Header: Double, Footer: Double): Double = js.native
  /**
    * @param Path [Path=' ']
    * @param Name [Name=' ']
    * @param Company [Company=' ']
    * @param WorkgroupID [WorkgroupID=' ']
    * @param Replace [Replace=false]
    */
  def CreateNewWorkgroupFile(): Unit = js.native
  def CreateNewWorkgroupFile(Path: String): Unit = js.native
  def CreateNewWorkgroupFile(Path: String, Name: String): Unit = js.native
  def CreateNewWorkgroupFile(Path: String, Name: String, Company: String): Unit = js.native
  def CreateNewWorkgroupFile(Path: String, Name: String, Company: String, WorkgroupID: String): Unit = js.native
  def CreateNewWorkgroupFile(Path: String, Name: String, Company: String, WorkgroupID: String, Replace: Boolean): Unit = js.native
  def CreateReport(): Report = js.native
  def CreateReport(Database: String): Report = js.native
  def CreateReport(Database: String, ReportTemplate: String): Report = js.native
  /** @param Section [Section=0] */
  def CreateReportControl(
    ReportName: String,
    ControlType: AcControlType,
    Section: js.UndefOr[AcReportSection],
    Parent: js.UndefOr[String],
    ColumnName: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Control = js.native
  def CreateReportControlEx(
    ReportName: String,
    ControlType: AcControlType,
    Section: AcReportSection,
    Parent: String,
    ControlName: String,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double
  ): Control = js.native
  def CreateReportControlExOld(
    ReportName: String,
    ControlType: AcControlType,
    Section: AcReportSection,
    Parent: String,
    ControlName: String,
    Left: Double,
    Top: Double,
    Width: Double,
    Height: Double
  ): Control = js.native
  /** @param Section [Section=0] */
  def CreateReportControlOld(
    ReportName: String,
    ControlType: AcControlType,
    Section: js.UndefOr[AcReportSection],
    Parent: js.UndefOr[String],
    ColumnName: js.UndefOr[String],
    Left: js.UndefOr[Double],
    Top: js.UndefOr[Double],
    Width: js.UndefOr[Double],
    Height: js.UndefOr[Double]
  ): Control = js.native
  def CurrentDb(): Database = js.native
  def CurrentUser(): String = js.native
  def CurrentWebUser(DisplayOption: AcWebUserDisplay): js.Any = js.native
  def CurrentWebUserGroups(DisplayOption: AcWebUserGroupsDisplay): js.Any = js.native
  def DAvg(Expr: String, Domain: String): Double | Null = js.native
  def DAvg(Expr: String, Domain: String, Criteria: String): Double | Null = js.native
  def DCount(Expr: String, Domain: String): Double | Null = js.native
  def DCount(Expr: String, Domain: String, Criteria: String): Double | Null = js.native
  def DDEExecute(ChanNum: Double, Command: String): Unit = js.native
  def DDEInitiate(Application: String, Topic: String): Double = js.native
  def DDEPoke(ChanNum: Double, Item: String, Data: String): Unit = js.native
  def DDERequest(ChanNum: Double, Item: String): String = js.native
  def DDETerminate(ChanNum: Double): Unit = js.native
  def DDETerminateAll(): Unit = js.native
  def DFirst(Expr: String, Domain: String): js.Any = js.native
  def DFirst(Expr: String, Domain: String, Criteria: String): js.Any = js.native
  def DLast(Expr: String, Domain: String): js.Any = js.native
  def DLast(Expr: String, Domain: String, Criteria: String): js.Any = js.native
  def DLookup(Expr: String, Domain: String): js.Any = js.native
  def DLookup(Expr: String, Domain: String, Criteria: String): js.Any = js.native
  def DMax(Expr: String, Domain: String): js.Any = js.native
  def DMax(Expr: String, Domain: String, Criteria: String): js.Any = js.native
  def DMin(Expr: String, Domain: String): js.Any = js.native
  def DMin(Expr: String, Domain: String, Criteria: String): js.Any = js.native
  def DStDev(Expr: String, Domain: String): Double | Null = js.native
  def DStDev(Expr: String, Domain: String, Criteria: String): Double | Null = js.native
  def DStDevP(Expr: String, Domain: String): Double | Null = js.native
  def DStDevP(Expr: String, Domain: String, Criteria: String): Double | Null = js.native
  def DSum(Expr: String, Domain: String): Double | Null = js.native
  def DSum(Expr: String, Domain: String, Criteria: String): Double | Null = js.native
  def DVar(Expr: String, Domain: String): Double | Null = js.native
  def DVar(Expr: String, Domain: String, Criteria: String): Double | Null = js.native
  def DVarP(Expr: String, Domain: String): Double | Null = js.native
  def DVarP(Expr: String, Domain: String, Criteria: String): Double | Null = js.native
  def DataAccessPages(var_0: js.Any): DataAccessPage = js.native
  def DefaultWorkspaceClone(): Workspace = js.native
  def DelAutoCorrect(ChangeFrom: String): Unit = js.native
  def DeleteControl(FormName: String, ControlName: String): Unit = js.native
  def DeleteReportControl(ReportName: String, ControlName: String): Unit = js.native
  def DirtyObject(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  /** @param bstrStatusBarText [bstrStatusBarText=''] */
  def Echo(EchoOn: Double): Unit = js.native
  def Echo(EchoOn: Double, bstrStatusBarText: String): Unit = js.native
  def EuroConvert(Number: Double, SourceCurrency: String, TargetCurrency: String): Double = js.native
  def EuroConvert(Number: Double, SourceCurrency: String, TargetCurrency: String, FullPrecision: Boolean): Double = js.native
  def EuroConvert(
    Number: Double,
    SourceCurrency: String,
    TargetCurrency: String,
    FullPrecision: Boolean,
    TriangulationPrecision: Double
  ): Double = js.native
  def Eval(StringExpr: String): js.Any = js.native
  /**
    * @param SelectedRecords [SelectedRecords=false]
    * @param FromPage [FromPage=1]
    * @param ToPage [ToPage=-1]
    */
  def ExportCustomFixedFormat(
    ExternalExporter: js.Any,
    OutputFileName: String,
    ObjectName: String,
    ObjectType: AcOutputObjectType
  ): Unit = js.native
  def ExportCustomFixedFormat(
    ExternalExporter: js.Any,
    OutputFileName: String,
    ObjectName: String,
    ObjectType: AcOutputObjectType,
    SelectedRecords: Boolean
  ): Unit = js.native
  def ExportCustomFixedFormat(
    ExternalExporter: js.Any,
    OutputFileName: String,
    ObjectName: String,
    ObjectType: AcOutputObjectType,
    SelectedRecords: Boolean,
    FromPage: Double
  ): Unit = js.native
  def ExportCustomFixedFormat(
    ExternalExporter: js.Any,
    OutputFileName: String,
    ObjectName: String,
    ObjectType: AcOutputObjectType,
    SelectedRecords: Boolean,
    FromPage: Double,
    ToPage: Double
  ): Unit = js.native
  def ExportNavigationPane(Path: String): Unit = js.native
  /**
    * @param DataTarget [DataTarget='']
    * @param SchemaTarget [SchemaTarget='']
    * @param PresentationTarget [PresentationTarget='']
    * @param ImageTarget [ImageTarget='']
    * @param Encoding [Encoding=0]
    * @param OtherFlags [OtherFlags=0]
    * @param WhereCondition [WhereCondition='']
    */
  def ExportXML(
    ObjectType: AcExportXMLObjectType,
    DataSource: String,
    DataTarget: js.UndefOr[String],
    SchemaTarget: js.UndefOr[String],
    PresentationTarget: js.UndefOr[String],
    ImageTarget: js.UndefOr[String],
    Encoding: js.UndefOr[AcExportXMLEncoding],
    OtherFlags: js.UndefOr[AcExportXMLOtherFlags],
    WhereCondition: js.UndefOr[String],
    AdditionalData: js.UndefOr[AdditionalData]
  ): Unit = js.native
  /**
    * @param DataTarget [DataTarget='']
    * @param SchemaTarget [SchemaTarget='']
    * @param PresentationTarget [PresentationTarget='']
    * @param ImageTarget [ImageTarget='']
    * @param Encoding [Encoding=0]
    * @param OtherFlags [OtherFlags=0]
    */
  def ExportXMLOld(
    ObjectType: AcExportXMLObjectType,
    DataSource: String,
    DataTarget: js.UndefOr[String],
    SchemaTarget: js.UndefOr[String],
    PresentationTarget: js.UndefOr[String],
    ImageTarget: js.UndefOr[String],
    Encoding: js.UndefOr[AcExportXMLEncoding],
    OtherFlags: js.UndefOr[Double]
  ): Unit = js.native
  def FileDialog(dialogType: MsoFileDialogType): typings.activexDashOffice.OfficeNs.FileDialog = js.native
  /**
    * @param SubAddress [SubAddress='']
    * @param NewWindow [NewWindow=false]
    * @param AddHistory [AddHistory=true]
    * @param Method [Method=0]
    * @param HeaderInfo [HeaderInfo='']
    */
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[String],
    NewWindow: js.UndefOr[Boolean],
    AddHistory: js.UndefOr[Boolean],
    ExtraInfo: js.UndefOr[ByteArray | String],
    Method: js.UndefOr[MsoExtraInfoMethod],
    HeaderInfo: js.UndefOr[String]
  ): Unit = js.native
  def Forms(Index: String): Form = js.native
  def Forms(Index: Double): Form = js.native
  def GUIDFromString(String: String): ByteArray = js.native
  def GetHiddenAttribute(ObjectType: AcObjectType, ObjectName: String): Boolean = js.native
  /**
    * Returns different types of values based on how the options are set:
    * * If by selecting / clearing a checkbox, returns `boolean`
    * * If by typing a string or numeric value, returns `string` or `number`
    * * If by choosing from a list, will return the 0-based index of the selected item
    */
  def GetOption(OptionName: String): Boolean | String | Double = js.native
  def HtmlEncode(PlainText: String): String = js.native
  def HtmlEncode(PlainText: String, Length: Double): String = js.native
  /** @param Part [Part=0] */
  def HyperlinkPart(Hyperlink: js.Any): String = js.native
  def HyperlinkPart(Hyperlink: js.Any, Part: AcHyperlinkPart): String = js.native
  /** @param fAppendOnly [fAppendOnly=false] */
  def ImportNavigationPane(Path: String): Unit = js.native
  def ImportNavigationPane(Path: String, fAppendOnly: Boolean): Unit = js.native
  /** @param ImportOptions [ImportOptions=1] */
  def ImportXML(DataSource: String): Unit = js.native
  def ImportXML(DataSource: String, ImportOptions: AcImportXMLOption): Unit = js.native
  def InsertText(Text: String, ModuleName: String): Unit = js.native
  def InstantiateTemplate(Path: String): Unit = js.native
  def IsClient(): Boolean = js.native
  def IsCurrentWebUserInGroup(GroupNameOrID: js.Any): Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def LoadCustomUI(CustomUIName: String, CustomUIXML: String): Unit = js.native
  def LoadFromAXL(ObjectType: AcObjectType, ObjectName: String, FileName: String): Unit = js.native
  def LoadFromText(ObjectType: AcObjectType, ObjectName: String, FileName: String): Unit = js.native
  def LoadPicture(FileName: String): js.Any = js.native
  def LocalVars(Index: js.Any): LocalVar = js.native
  def Modules(Index: String): Module = js.native
  def Modules(Index: Double): Module = js.native
  def NewAccessProject(filepath: String): Unit = js.native
  def NewAccessProject(filepath: String, Connect: String): Unit = js.native
  /**
    * @param FileFormat [FileFormat=0]
    * @param SiteAddress [SiteAddress='']
    * @param ListID [ListID='']
    */
  def NewCurrentDatabase(filepath: String): Unit = js.native
  def NewCurrentDatabase(filepath: String, FileFormat: AcNewDatabaseFormat): Unit = js.native
  def NewCurrentDatabase(filepath: String, FileFormat: AcNewDatabaseFormat, Template: String): Unit = js.native
  def NewCurrentDatabase(filepath: String, FileFormat: AcNewDatabaseFormat, Template: String, SiteAddress: String): Unit = js.native
  def NewCurrentDatabase(
    filepath: String,
    FileFormat: AcNewDatabaseFormat,
    Template: String,
    SiteAddress: String,
    ListID: String
  ): Unit = js.native
  def NewCurrentDatabaseOld(filepath: String): Unit = js.native
  def Nz(Value: js.Any): js.Any = js.native
  def Nz(Value: js.Any, ValueIfNull: js.Any): js.Any = js.native
  /** @param Exclusive [Exclusive=false] */
  def OpenAccessProject(filepath: String): Unit = js.native
  def OpenAccessProject(filepath: String, Exclusive: Boolean): Unit = js.native
  /**
    * @param Exclusive [Exclusive=false]
    * @param bstrPassword [bstrPassword='']
    */
  def OpenCurrentDatabase(filepath: String): Unit = js.native
  def OpenCurrentDatabase(filepath: String, Exclusive: Boolean): Unit = js.native
  def OpenCurrentDatabase(filepath: String, Exclusive: Boolean, bstrPassword: String): Unit = js.native
  /** @param Exclusive [Exclusive=false] */
  def OpenCurrentDatabaseOld(filepath: String): Unit = js.native
  def OpenCurrentDatabaseOld(filepath: String, Exclusive: Boolean): Unit = js.native
  def PlainText(RichText: String): String = js.native
  def PlainText(RichText: String, Length: Double): String = js.native
  def Printers(Index: String): Printer = js.native
  def Printers(Index: Double): Printer = js.native
  /** @param Option [Option=1] */
  def Quit(): Unit = js.native
  def Quit(Option: AcQuitOption): Unit = js.native
  def References(var_0: String): Reference = js.native
  def References(var_0: Double): Reference = js.native
  def RefreshDatabaseWindow(): Unit = js.native
  def RefreshTitleBar(): Unit = js.native
  def ReloadAddIns(): Unit = js.native
  def ReplaceModule(objtyp: Double, ModuleName: String, FileName: String, token: Double): Unit = js.native
  def Reports(Index: String): Report = js.native
  def Reports(Index: Double): Report = js.native
  def ReturnVars(Index: String): ReturnVar = js.native
  def ReturnVars(Index: Double): ReturnVar = js.native
  def Run(
    Procedure: String,
    Arg1: js.UndefOr[js.Any],
    Arg2: js.UndefOr[js.Any],
    Arg3: js.UndefOr[js.Any],
    Arg4: js.UndefOr[js.Any],
    Arg5: js.UndefOr[js.Any],
    Arg6: js.UndefOr[js.Any],
    Arg7: js.UndefOr[js.Any],
    Arg8: js.UndefOr[js.Any],
    Arg9: js.UndefOr[js.Any],
    Arg10: js.UndefOr[js.Any],
    Arg11: js.UndefOr[js.Any],
    Arg12: js.UndefOr[js.Any],
    Arg13: js.UndefOr[js.Any],
    Arg14: js.UndefOr[js.Any],
    Arg15: js.UndefOr[js.Any],
    Arg16: js.UndefOr[js.Any],
    Arg17: js.UndefOr[js.Any],
    Arg18: js.UndefOr[js.Any],
    Arg19: js.UndefOr[js.Any],
    Arg20: js.UndefOr[js.Any],
    Arg21: js.UndefOr[js.Any],
    Arg22: js.UndefOr[js.Any],
    Arg23: js.UndefOr[js.Any],
    Arg24: js.UndefOr[js.Any],
    Arg25: js.UndefOr[js.Any],
    Arg26: js.UndefOr[js.Any],
    Arg27: js.UndefOr[js.Any],
    Arg28: js.UndefOr[js.Any],
    Arg29: js.UndefOr[js.Any],
    Arg30: js.UndefOr[js.Any]
  ): js.Any = js.native
  def RunCommand(Command: AcCommand): Unit = js.native
  def SaveAsAXL(ObjectType: AcObjectType, ObjectName: String, FileName: String): Unit = js.native
  def SaveAsTemplate(
    Path: String,
    Title: String,
    IconPath: String,
    CoreTable: String,
    Category: String,
    PreviewPath: js.UndefOr[js.Any],
    Description: js.UndefOr[String],
    InstantiationForm: js.UndefOr[String],
    ApplicationPart: js.UndefOr[Boolean],
    IncludeData: js.UndefOr[Boolean],
    Variation: js.UndefOr[js.Any]
  ): Unit = js.native
  def SaveAsText(ObjectType: AcObjectType, ObjectName: String, FileName: String): Unit = js.native
  def SetDefaultWorkgroupFile(Path: String): Unit = js.native
  def SetHiddenAttribute(ObjectType: AcObjectType, ObjectName: String, fHidden: Boolean): Unit = js.native
  def SetOption(OptionName: String, Setting: String): Unit = js.native
  /**
    * Pass different types of values based on how the option is set in the UI
    * * If by selecting / clearing a checkbox, pass a `boolean`
    * * If by typing a string or numeric value, pass a `string` or `number`
    * * If by choosing from a list, pass the 0-based index of the tiem to select
    */
  def SetOption(OptionName: String, Setting: Boolean): Unit = js.native
  def SetOption(OptionName: String, Setting: Double): Unit = js.native
  def SetUndoRecording(yesno: Double): Unit = js.native
  def StringFromGUID(Guid: ByteArray): String = js.native
  @JSName("SysCmd")
  def SysCmd_1(Action: `1`, StatusText: String, MaxValue: Double): Null = js.native
  @JSName("SysCmd")
  def SysCmd_10(Action: `10`, Argument2: AcObjectType, Argument3: String): `2` | `4` | `1` = js.native
  @JSName("SysCmd")
  def SysCmd_11(Acton: `11`): Null = js.native
  @JSName("SysCmd")
  def SysCmd_12(Acton: `12`): Null = js.native
  @JSName("SysCmd")
  def SysCmd_13(Acton: `13`): Null = js.native
  @JSName("SysCmd")
  def SysCmd_2(Action: `2`, CurrentValue: Double): Null = js.native
  @JSName("SysCmd")
  def SysCmd_3(Acton: `3`): Null = js.native
  @JSName("SysCmd")
  def SysCmd_4(Action: `4`, StatusText: String): Null = js.native
  @JSName("SysCmd")
  def SysCmd_5(Acton: `5`): Null = js.native
  @JSName("SysCmd")
  def SysCmd_6(Acton: `6`): Null = js.native
  @JSName("SysCmd")
  def SysCmd_7(Acton: `7`): Null = js.native
  @JSName("SysCmd")
  def SysCmd_8(Acton: `8`): Null = js.native
  @JSName("SysCmd")
  def SysCmd_9(Acton: `9`): Null = js.native
  def TempVars(Index: String): TempVar = js.native
  def TempVars(Index: Double): TempVar = js.native
  /**
    * @param WellFormedXMLOutput [WellFormedXMLOutput=false]
    * @param ScriptOption [ScriptOption=1]
    */
  def TransformXML(DataSource: String, TransformSource: String, OutputTarget: String): Unit = js.native
  def TransformXML(DataSource: String, TransformSource: String, OutputTarget: String, WellFormedXMLOutput: Boolean): Unit = js.native
  def TransformXML(
    DataSource: String,
    TransformSource: String,
    OutputTarget: String,
    WellFormedXMLOutput: Boolean,
    ScriptOption: AcTransformXMLScriptOption
  ): Unit = js.native
  def WebServices(Index: String): WebService = js.native
  def WebServices(Index: Double): WebService = js.native
  def hWndAccessApp(): Double = js.native
}

