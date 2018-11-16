package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Application")
@js.native
class Application protected () extends js.Object {
  val ADOConnectString: java.lang.String = js.native
  var `Access.Application_typekey`: Application = js.native
  val AnswerWizard: activexDashOfficeLib.OfficeNs.AnswerWizard = js.native
  val Application: Application = js.native
  val Assistance: activexDashOfficeLib.OfficeNs.IAssistance = js.native
  val Assistant: activexDashOfficeLib.OfficeNs.Assistant = js.native
  val AutoCorrect: AutoCorrect = js.native
  var AutomationSecurity: activexDashOfficeLib.OfficeNs.MsoAutomationSecurity = js.native
  val BrokenReference: scala.Boolean = js.native
  val Build: scala.Double = js.native
  @JSName("COMAddIns")
  val COMAddIns_Original: activexDashOfficeLib.OfficeNs.COMAddIns = js.native
  val CodeContextObject: js.Any = js.native
  val CodeData: CodeData = js.native
  val CodeProject: CodeProject = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  val CurrentData: CurrentData = js.native
  val CurrentObjectName: java.lang.String = js.native
  val CurrentObjectType: AcObjectType = js.native
  val CurrentProject: CurrentProject = js.native
  val DBEngine: activexDashDaoLib.DAONs.DBEngine = js.native
  @JSName("DataAccessPages")
  val DataAccessPages_Original: DataAccessPages = js.native
  val DefaultWebOptions: DefaultWebOptions = js.native
  val DoCmd: DoCmd = js.native
  var FeatureInstall: activexDashOfficeLib.OfficeNs.MsoFeatureInstall = js.native
  val FileSearch: activexDashOfficeLib.OfficeNs.FileSearch = js.native
  @JSName("Forms")
  val Forms_Original: Forms = js.native
  val IsCompiled: scala.Boolean = js.native
  val LanguageSettings: activexDashOfficeLib.OfficeNs.LanguageSettings = js.native
  @JSName("LocalVars")
  val LocalVars_Original: LocalVars = js.native
  val MacroError: MacroError = js.native
  var MenuBar: java.lang.String = js.native
  @JSName("Modules")
  val Modules_Original: Modules = js.native
  val MsoDebugOptions: activexDashOfficeLib.OfficeNs.MsoDebugOptions = js.native
  val Name: java.lang.String = js.native
  val NewFileTaskPane: activexDashOfficeLib.OfficeNs.NewFile = js.native
  val Parent: js.Any = js.native
  var Printer: Printer = js.native
  @JSName("Printers")
  val Printers_Original: Printers = js.native
  val ProductCode: java.lang.String = js.native
  @JSName("References")
  val References_Original: References = js.native
  @JSName("Reports")
  val Reports_Original: Reports = js.native
  @JSName("ReturnVars")
  val ReturnVars_Original: ReturnVars = js.native
  val Screen: Screen = js.native
  var ShortcutMenuBar: java.lang.String = js.native
  @JSName("TempVars")
  val TempVars_Original: TempVars = js.native
  var UserControl: scala.Boolean = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  val VGXFrameInterval: js.Any = js.native
  val Version: java.lang.String = js.native
  var Visible: scala.Boolean = js.native
  @JSName("WebServices")
  val WebServices_Original: WebServices = js.native
  val WizHook: WizHook = js.native
  def AccessError(ErrorNumber: scala.Double): java.lang.String = js.native
  def AddAutoCorrect(ChangeFrom: java.lang.String, ChangeTo: java.lang.String): scala.Unit = js.native
  def AddToFavorites(): scala.Unit = js.native
  def AppLoadString(id: scala.Double): js.Any = js.native
  def BeginUndoable(Hwnd: scala.Double): scala.Unit = js.native
  def BuildCriteria(Field: java.lang.String, FieldType: scala.Double, Expression: java.lang.String): java.lang.String = js.native
  def BuilderString(): js.Any = js.native
  def COMAddIns(Index: java.lang.String): activexDashOfficeLib.OfficeNs.COMAddIn = js.native
  def COMAddIns(Index: scala.Double): activexDashOfficeLib.OfficeNs.COMAddIn = js.native
  def CloseCurrentDatabase(): scala.Unit = js.native
  def CodeDb(): activexDashDaoLib.DAONs.Database = js.native
  def ColumnHistory(TableName: java.lang.String, ColumnName: java.lang.String, queryString: java.lang.String): java.lang.String = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  /** @param LogFile [LogFile=false] */
  def CompactRepair(SourceFile: java.lang.String, DestinationFile: java.lang.String): scala.Boolean = js.native
  /** @param LogFile [LogFile=false] */
  def CompactRepair(SourceFile: java.lang.String, DestinationFile: java.lang.String, LogFile: scala.Boolean): scala.Boolean = js.native
  def ConvertAccessProject(
    SourceFilename: java.lang.String,
    DestinationFilename: java.lang.String,
    DestinationFileFormat: AcFileFormat
  ): scala.Unit = js.native
  def CreateAccessProject(filepath: java.lang.String): scala.Unit = js.native
  def CreateAccessProject(filepath: java.lang.String, Connect: java.lang.String): scala.Unit = js.native
  def CreateAdditionalData(): AdditionalData = js.native
  /** @param Section [Section=0] */
  def CreateControl(
    FormName: java.lang.String,
    ControlType: AcControlType,
    Section: js.UndefOr[AcFormSection],
    Parent: js.UndefOr[java.lang.String],
    ColumnName: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Control = js.native
  def CreateControlEx(
    FormName: java.lang.String,
    ControlType: AcControlType,
    Section: AcFormSection,
    Parent: java.lang.String,
    ControlSource: java.lang.String,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Control = js.native
  def CreateControlExOld(
    FormName: java.lang.String,
    ControlType: AcControlType,
    Section: AcFormSection,
    Parent: java.lang.String,
    ControlSource: java.lang.String,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Control = js.native
  /** @param Section [Section=0] */
  def CreateControlOld(
    FormName: java.lang.String,
    ControlType: AcControlType,
    Section: js.UndefOr[AcFormSection],
    Parent: js.UndefOr[java.lang.String],
    ColumnName: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Control = js.native
  /** @param CreateNewFile [CreateNewFile=true] */
  def CreateDataAccessPage(FileName: java.lang.String): DataAccessPage = js.native
  /** @param CreateNewFile [CreateNewFile=true] */
  def CreateDataAccessPage(FileName: java.lang.String, CreateNewFile: scala.Boolean): DataAccessPage = js.native
  def CreateForm(): Form = js.native
  def CreateForm(Database: java.lang.String): Form = js.native
  def CreateForm(Database: java.lang.String, FormTemplate: java.lang.String): Form = js.native
  def CreateGroupLevel(
    ReportName: java.lang.String,
    Expression: java.lang.String,
    Header: scala.Double,
    Footer: scala.Double
  ): scala.Double = js.native
  /**
           * @param Path [Path=' ']
           * @param Name [Name=' ']
           * @param Company [Company=' ']
           * @param WorkgroupID [WorkgroupID=' ']
           * @param Replace [Replace=false]
           */
  def CreateNewWorkgroupFile(): scala.Unit = js.native
  /**
           * @param Path [Path=' ']
           * @param Name [Name=' ']
           * @param Company [Company=' ']
           * @param WorkgroupID [WorkgroupID=' ']
           * @param Replace [Replace=false]
           */
  def CreateNewWorkgroupFile(Path: java.lang.String): scala.Unit = js.native
  /**
           * @param Path [Path=' ']
           * @param Name [Name=' ']
           * @param Company [Company=' ']
           * @param WorkgroupID [WorkgroupID=' ']
           * @param Replace [Replace=false]
           */
  def CreateNewWorkgroupFile(Path: java.lang.String, Name: java.lang.String): scala.Unit = js.native
  /**
           * @param Path [Path=' ']
           * @param Name [Name=' ']
           * @param Company [Company=' ']
           * @param WorkgroupID [WorkgroupID=' ']
           * @param Replace [Replace=false]
           */
  def CreateNewWorkgroupFile(Path: java.lang.String, Name: java.lang.String, Company: java.lang.String): scala.Unit = js.native
  /**
           * @param Path [Path=' ']
           * @param Name [Name=' ']
           * @param Company [Company=' ']
           * @param WorkgroupID [WorkgroupID=' ']
           * @param Replace [Replace=false]
           */
  def CreateNewWorkgroupFile(
    Path: java.lang.String,
    Name: java.lang.String,
    Company: java.lang.String,
    WorkgroupID: java.lang.String
  ): scala.Unit = js.native
  /**
           * @param Path [Path=' ']
           * @param Name [Name=' ']
           * @param Company [Company=' ']
           * @param WorkgroupID [WorkgroupID=' ']
           * @param Replace [Replace=false]
           */
  def CreateNewWorkgroupFile(
    Path: java.lang.String,
    Name: java.lang.String,
    Company: java.lang.String,
    WorkgroupID: java.lang.String,
    Replace: scala.Boolean
  ): scala.Unit = js.native
  def CreateReport(): Report = js.native
  def CreateReport(Database: java.lang.String): Report = js.native
  def CreateReport(Database: java.lang.String, ReportTemplate: java.lang.String): Report = js.native
  /** @param Section [Section=0] */
  def CreateReportControl(
    ReportName: java.lang.String,
    ControlType: AcControlType,
    Section: js.UndefOr[AcReportSection],
    Parent: js.UndefOr[java.lang.String],
    ColumnName: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Control = js.native
  def CreateReportControlEx(
    ReportName: java.lang.String,
    ControlType: AcControlType,
    Section: AcReportSection,
    Parent: java.lang.String,
    ControlName: java.lang.String,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Control = js.native
  def CreateReportControlExOld(
    ReportName: java.lang.String,
    ControlType: AcControlType,
    Section: AcReportSection,
    Parent: java.lang.String,
    ControlName: java.lang.String,
    Left: scala.Double,
    Top: scala.Double,
    Width: scala.Double,
    Height: scala.Double
  ): Control = js.native
  /** @param Section [Section=0] */
  def CreateReportControlOld(
    ReportName: java.lang.String,
    ControlType: AcControlType,
    Section: js.UndefOr[AcReportSection],
    Parent: js.UndefOr[java.lang.String],
    ColumnName: js.UndefOr[java.lang.String],
    Left: js.UndefOr[scala.Double],
    Top: js.UndefOr[scala.Double],
    Width: js.UndefOr[scala.Double],
    Height: js.UndefOr[scala.Double]
  ): Control = js.native
  def CurrentDb(): activexDashDaoLib.DAONs.Database = js.native
  def CurrentUser(): java.lang.String = js.native
  def CurrentWebUser(DisplayOption: AcWebUserDisplay): js.Any = js.native
  def CurrentWebUserGroups(DisplayOption: AcWebUserGroupsDisplay): js.Any = js.native
  def DAvg(Expr: java.lang.String, Domain: java.lang.String): scala.Double | scala.Null = js.native
  def DAvg(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): scala.Double | scala.Null = js.native
  def DCount(Expr: java.lang.String, Domain: java.lang.String): scala.Double | scala.Null = js.native
  def DCount(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): scala.Double | scala.Null = js.native
  def DDEExecute(ChanNum: scala.Double, Command: java.lang.String): scala.Unit = js.native
  def DDEInitiate(Application: java.lang.String, Topic: java.lang.String): scala.Double = js.native
  def DDEPoke(ChanNum: scala.Double, Item: java.lang.String, Data: java.lang.String): scala.Unit = js.native
  def DDERequest(ChanNum: scala.Double, Item: java.lang.String): java.lang.String = js.native
  def DDETerminate(ChanNum: scala.Double): scala.Unit = js.native
  def DDETerminateAll(): scala.Unit = js.native
  def DFirst(Expr: java.lang.String, Domain: java.lang.String): js.Any = js.native
  def DFirst(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): js.Any = js.native
  def DLast(Expr: java.lang.String, Domain: java.lang.String): js.Any = js.native
  def DLast(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): js.Any = js.native
  def DLookup(Expr: java.lang.String, Domain: java.lang.String): js.Any = js.native
  def DLookup(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): js.Any = js.native
  def DMax(Expr: java.lang.String, Domain: java.lang.String): js.Any = js.native
  def DMax(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): js.Any = js.native
  def DMin(Expr: java.lang.String, Domain: java.lang.String): js.Any = js.native
  def DMin(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): js.Any = js.native
  def DStDev(Expr: java.lang.String, Domain: java.lang.String): scala.Double | scala.Null = js.native
  def DStDev(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): scala.Double | scala.Null = js.native
  def DStDevP(Expr: java.lang.String, Domain: java.lang.String): scala.Double | scala.Null = js.native
  def DStDevP(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): scala.Double | scala.Null = js.native
  def DSum(Expr: java.lang.String, Domain: java.lang.String): scala.Double | scala.Null = js.native
  def DSum(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): scala.Double | scala.Null = js.native
  def DVar(Expr: java.lang.String, Domain: java.lang.String): scala.Double | scala.Null = js.native
  def DVar(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): scala.Double | scala.Null = js.native
  def DVarP(Expr: java.lang.String, Domain: java.lang.String): scala.Double | scala.Null = js.native
  def DVarP(Expr: java.lang.String, Domain: java.lang.String, Criteria: java.lang.String): scala.Double | scala.Null = js.native
  def DataAccessPages(var_0: js.Any): DataAccessPage = js.native
  def DefaultWorkspaceClone(): activexDashDaoLib.DAONs.Workspace = js.native
  def DelAutoCorrect(ChangeFrom: java.lang.String): scala.Unit = js.native
  def DeleteControl(FormName: java.lang.String, ControlName: java.lang.String): scala.Unit = js.native
  def DeleteReportControl(ReportName: java.lang.String, ControlName: java.lang.String): scala.Unit = js.native
  def DirtyObject(ObjectType: AcObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  /** @param bstrStatusBarText [bstrStatusBarText=''] */
  def Echo(EchoOn: scala.Double): scala.Unit = js.native
  /** @param bstrStatusBarText [bstrStatusBarText=''] */
  def Echo(EchoOn: scala.Double, bstrStatusBarText: java.lang.String): scala.Unit = js.native
  def EuroConvert(Number: scala.Double, SourceCurrency: java.lang.String, TargetCurrency: java.lang.String): scala.Double = js.native
  def EuroConvert(
    Number: scala.Double,
    SourceCurrency: java.lang.String,
    TargetCurrency: java.lang.String,
    FullPrecision: scala.Boolean
  ): scala.Double = js.native
  def EuroConvert(
    Number: scala.Double,
    SourceCurrency: java.lang.String,
    TargetCurrency: java.lang.String,
    FullPrecision: scala.Boolean,
    TriangulationPrecision: scala.Double
  ): scala.Double = js.native
  def Eval(StringExpr: java.lang.String): js.Any = js.native
  /**
           * @param SelectedRecords [SelectedRecords=false]
           * @param FromPage [FromPage=1]
           * @param ToPage [ToPage=-1]
           */
  def ExportCustomFixedFormat(
    ExternalExporter: js.Any,
    OutputFileName: java.lang.String,
    ObjectName: java.lang.String,
    ObjectType: AcOutputObjectType
  ): scala.Unit = js.native
  /**
           * @param SelectedRecords [SelectedRecords=false]
           * @param FromPage [FromPage=1]
           * @param ToPage [ToPage=-1]
           */
  def ExportCustomFixedFormat(
    ExternalExporter: js.Any,
    OutputFileName: java.lang.String,
    ObjectName: java.lang.String,
    ObjectType: AcOutputObjectType,
    SelectedRecords: scala.Boolean
  ): scala.Unit = js.native
  /**
           * @param SelectedRecords [SelectedRecords=false]
           * @param FromPage [FromPage=1]
           * @param ToPage [ToPage=-1]
           */
  def ExportCustomFixedFormat(
    ExternalExporter: js.Any,
    OutputFileName: java.lang.String,
    ObjectName: java.lang.String,
    ObjectType: AcOutputObjectType,
    SelectedRecords: scala.Boolean,
    FromPage: scala.Double
  ): scala.Unit = js.native
  /**
           * @param SelectedRecords [SelectedRecords=false]
           * @param FromPage [FromPage=1]
           * @param ToPage [ToPage=-1]
           */
  def ExportCustomFixedFormat(
    ExternalExporter: js.Any,
    OutputFileName: java.lang.String,
    ObjectName: java.lang.String,
    ObjectType: AcOutputObjectType,
    SelectedRecords: scala.Boolean,
    FromPage: scala.Double,
    ToPage: scala.Double
  ): scala.Unit = js.native
  def ExportNavigationPane(Path: java.lang.String): scala.Unit = js.native
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
    DataSource: java.lang.String,
    DataTarget: js.UndefOr[java.lang.String],
    SchemaTarget: js.UndefOr[java.lang.String],
    PresentationTarget: js.UndefOr[java.lang.String],
    ImageTarget: js.UndefOr[java.lang.String],
    Encoding: js.UndefOr[AcExportXMLEncoding],
    OtherFlags: js.UndefOr[AcExportXMLOtherFlags],
    WhereCondition: js.UndefOr[java.lang.String],
    AdditionalData: js.UndefOr[AdditionalData]
  ): scala.Unit = js.native
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
    DataSource: java.lang.String,
    DataTarget: js.UndefOr[java.lang.String],
    SchemaTarget: js.UndefOr[java.lang.String],
    PresentationTarget: js.UndefOr[java.lang.String],
    ImageTarget: js.UndefOr[java.lang.String],
    Encoding: js.UndefOr[AcExportXMLEncoding],
    OtherFlags: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  def FileDialog(dialogType: activexDashOfficeLib.OfficeNs.MsoFileDialogType): activexDashOfficeLib.OfficeNs.FileDialog = js.native
  /**
           * @param SubAddress [SubAddress='']
           * @param NewWindow [NewWindow=false]
           * @param AddHistory [AddHistory=true]
           * @param Method [Method=0]
           * @param HeaderInfo [HeaderInfo='']
           */
  def FollowHyperlink(
    Address: java.lang.String,
    SubAddress: js.UndefOr[java.lang.String],
    NewWindow: js.UndefOr[scala.Boolean],
    AddHistory: js.UndefOr[scala.Boolean],
    ExtraInfo: js.UndefOr[ByteArray | java.lang.String],
    Method: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod],
    HeaderInfo: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  def Forms(Index: java.lang.String): Form = js.native
  def Forms(Index: scala.Double): Form = js.native
  def GUIDFromString(String: java.lang.String): ByteArray = js.native
  def GetHiddenAttribute(ObjectType: AcObjectType, ObjectName: java.lang.String): scala.Boolean = js.native
  /**
           * Returns different types of values based on how the options are set:
           * * If by selecting / clearing a checkbox, returns `boolean`
           * * If by typing a string or numeric value, returns `string` or `number`
           * * If by choosing from a list, will return the 0-based index of the selected item
           */
  def GetOption(OptionName: java.lang.String): scala.Boolean | java.lang.String | scala.Double = js.native
  def HtmlEncode(PlainText: java.lang.String): java.lang.String = js.native
  def HtmlEncode(PlainText: java.lang.String, Length: scala.Double): java.lang.String = js.native
  /** @param Part [Part=0] */
  def HyperlinkPart(Hyperlink: js.Any): java.lang.String = js.native
  /** @param Part [Part=0] */
  def HyperlinkPart(Hyperlink: js.Any, Part: AcHyperlinkPart): java.lang.String = js.native
  /** @param fAppendOnly [fAppendOnly=false] */
  def ImportNavigationPane(Path: java.lang.String): scala.Unit = js.native
  /** @param fAppendOnly [fAppendOnly=false] */
  def ImportNavigationPane(Path: java.lang.String, fAppendOnly: scala.Boolean): scala.Unit = js.native
  /** @param ImportOptions [ImportOptions=1] */
  def ImportXML(DataSource: java.lang.String): scala.Unit = js.native
  /** @param ImportOptions [ImportOptions=1] */
  def ImportXML(DataSource: java.lang.String, ImportOptions: AcImportXMLOption): scala.Unit = js.native
  def InsertText(Text: java.lang.String, ModuleName: java.lang.String): scala.Unit = js.native
  def InstantiateTemplate(Path: java.lang.String): scala.Unit = js.native
  def IsClient(): scala.Boolean = js.native
  def IsCurrentWebUserInGroup(GroupNameOrID: js.Any): scala.Boolean = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def LoadCustomUI(CustomUIName: java.lang.String, CustomUIXML: java.lang.String): scala.Unit = js.native
  def LoadFromAXL(ObjectType: AcObjectType, ObjectName: java.lang.String, FileName: java.lang.String): scala.Unit = js.native
  def LoadFromText(ObjectType: AcObjectType, ObjectName: java.lang.String, FileName: java.lang.String): scala.Unit = js.native
  def LoadPicture(FileName: java.lang.String): js.Any = js.native
  def LocalVars(Index: js.Any): LocalVar = js.native
  def Modules(Index: java.lang.String): Module = js.native
  def Modules(Index: scala.Double): Module = js.native
  def NewAccessProject(filepath: java.lang.String): scala.Unit = js.native
  def NewAccessProject(filepath: java.lang.String, Connect: java.lang.String): scala.Unit = js.native
  /**
           * @param FileFormat [FileFormat=0]
           * @param SiteAddress [SiteAddress='']
           * @param ListID [ListID='']
           */
  def NewCurrentDatabase(filepath: java.lang.String): scala.Unit = js.native
  /**
           * @param FileFormat [FileFormat=0]
           * @param SiteAddress [SiteAddress='']
           * @param ListID [ListID='']
           */
  def NewCurrentDatabase(filepath: java.lang.String, FileFormat: AcNewDatabaseFormat): scala.Unit = js.native
  /**
           * @param FileFormat [FileFormat=0]
           * @param SiteAddress [SiteAddress='']
           * @param ListID [ListID='']
           */
  def NewCurrentDatabase(filepath: java.lang.String, FileFormat: AcNewDatabaseFormat, Template: java.lang.String): scala.Unit = js.native
  /**
           * @param FileFormat [FileFormat=0]
           * @param SiteAddress [SiteAddress='']
           * @param ListID [ListID='']
           */
  def NewCurrentDatabase(
    filepath: java.lang.String,
    FileFormat: AcNewDatabaseFormat,
    Template: java.lang.String,
    SiteAddress: java.lang.String
  ): scala.Unit = js.native
  /**
           * @param FileFormat [FileFormat=0]
           * @param SiteAddress [SiteAddress='']
           * @param ListID [ListID='']
           */
  def NewCurrentDatabase(
    filepath: java.lang.String,
    FileFormat: AcNewDatabaseFormat,
    Template: java.lang.String,
    SiteAddress: java.lang.String,
    ListID: java.lang.String
  ): scala.Unit = js.native
  def NewCurrentDatabaseOld(filepath: java.lang.String): scala.Unit = js.native
  def Nz(Value: js.Any): js.Any = js.native
  def Nz(Value: js.Any, ValueIfNull: js.Any): js.Any = js.native
  /** @param Exclusive [Exclusive=false] */
  def OpenAccessProject(filepath: java.lang.String): scala.Unit = js.native
  /** @param Exclusive [Exclusive=false] */
  def OpenAccessProject(filepath: java.lang.String, Exclusive: scala.Boolean): scala.Unit = js.native
  /**
           * @param Exclusive [Exclusive=false]
           * @param bstrPassword [bstrPassword='']
           */
  def OpenCurrentDatabase(filepath: java.lang.String): scala.Unit = js.native
  /**
           * @param Exclusive [Exclusive=false]
           * @param bstrPassword [bstrPassword='']
           */
  def OpenCurrentDatabase(filepath: java.lang.String, Exclusive: scala.Boolean): scala.Unit = js.native
  /**
           * @param Exclusive [Exclusive=false]
           * @param bstrPassword [bstrPassword='']
           */
  def OpenCurrentDatabase(filepath: java.lang.String, Exclusive: scala.Boolean, bstrPassword: java.lang.String): scala.Unit = js.native
  /** @param Exclusive [Exclusive=false] */
  def OpenCurrentDatabaseOld(filepath: java.lang.String): scala.Unit = js.native
  /** @param Exclusive [Exclusive=false] */
  def OpenCurrentDatabaseOld(filepath: java.lang.String, Exclusive: scala.Boolean): scala.Unit = js.native
  def PlainText(RichText: java.lang.String): java.lang.String = js.native
  def PlainText(RichText: java.lang.String, Length: scala.Double): java.lang.String = js.native
  def Printers(Index: java.lang.String): Printer = js.native
  def Printers(Index: scala.Double): Printer = js.native
  /** @param Option [Option=1] */
  def Quit(): scala.Unit = js.native
  /** @param Option [Option=1] */
  def Quit(Option: AcQuitOption): scala.Unit = js.native
  def References(var_0: java.lang.String): Reference = js.native
  def References(var_0: scala.Double): Reference = js.native
  def RefreshDatabaseWindow(): scala.Unit = js.native
  def RefreshTitleBar(): scala.Unit = js.native
  def ReloadAddIns(): scala.Unit = js.native
  def ReplaceModule(
    objtyp: scala.Double,
    ModuleName: java.lang.String,
    FileName: java.lang.String,
    token: scala.Double
  ): scala.Unit = js.native
  def Reports(Index: java.lang.String): Report = js.native
  def Reports(Index: scala.Double): Report = js.native
  def ReturnVars(Index: java.lang.String): ReturnVar = js.native
  def ReturnVars(Index: scala.Double): ReturnVar = js.native
  def Run(
    Procedure: java.lang.String,
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
  def RunCommand(Command: AcCommand): scala.Unit = js.native
  def SaveAsAXL(ObjectType: AcObjectType, ObjectName: java.lang.String, FileName: java.lang.String): scala.Unit = js.native
  def SaveAsTemplate(
    Path: java.lang.String,
    Title: java.lang.String,
    IconPath: java.lang.String,
    CoreTable: java.lang.String,
    Category: java.lang.String,
    PreviewPath: js.UndefOr[js.Any],
    Description: js.UndefOr[java.lang.String],
    InstantiationForm: js.UndefOr[java.lang.String],
    ApplicationPart: js.UndefOr[scala.Boolean],
    IncludeData: js.UndefOr[scala.Boolean],
    Variation: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def SaveAsText(ObjectType: AcObjectType, ObjectName: java.lang.String, FileName: java.lang.String): scala.Unit = js.native
  def SetDefaultWorkgroupFile(Path: java.lang.String): scala.Unit = js.native
  def SetHiddenAttribute(ObjectType: AcObjectType, ObjectName: java.lang.String, fHidden: scala.Boolean): scala.Unit = js.native
  /**
           * Pass different types of values based on how the option is set in the UI
           * * If by selecting / clearing a checkbox, pass a `boolean`
           * * If by typing a string or numeric value, pass a `string` or `number`
           * * If by choosing from a list, pass the 0-based index of the tiem to select
           */
  def SetOption(OptionName: java.lang.String, Setting: java.lang.String): scala.Unit = js.native
  /**
           * Pass different types of values based on how the option is set in the UI
           * * If by selecting / clearing a checkbox, pass a `boolean`
           * * If by typing a string or numeric value, pass a `string` or `number`
           * * If by choosing from a list, pass the 0-based index of the tiem to select
           */
  def SetOption(OptionName: java.lang.String, Setting: scala.Boolean): scala.Unit = js.native
  /**
           * Pass different types of values based on how the option is set in the UI
           * * If by selecting / clearing a checkbox, pass a `boolean`
           * * If by typing a string or numeric value, pass a `string` or `number`
           * * If by choosing from a list, pass the 0-based index of the tiem to select
           */
  def SetOption(OptionName: java.lang.String, Setting: scala.Double): scala.Unit = js.native
  def SetUndoRecording(yesno: scala.Double): scala.Unit = js.native
  def StringFromGUID(Guid: ByteArray): java.lang.String = js.native
  def SysCmd(Action: AcSysCmdAction, Argument2: AcObjectType, Argument3: java.lang.String): Constants = js.native
  def SysCmd(Action: AcSysCmdAction, CurrentValue: scala.Double): scala.Null = js.native
  def SysCmd(Action: AcSysCmdAction, StatusText: java.lang.String): scala.Null = js.native
  def SysCmd(Action: AcSysCmdAction, StatusText: java.lang.String, MaxValue: scala.Double): scala.Null = js.native
  def SysCmd(Acton: AcSysCmdAction): scala.Null = js.native
  def TempVars(Index: java.lang.String): TempVar = js.native
  def TempVars(Index: scala.Double): TempVar = js.native
  /**
           * @param WellFormedXMLOutput [WellFormedXMLOutput=false]
           * @param ScriptOption [ScriptOption=1]
           */
  def TransformXML(DataSource: java.lang.String, TransformSource: java.lang.String, OutputTarget: java.lang.String): scala.Unit = js.native
  /**
           * @param WellFormedXMLOutput [WellFormedXMLOutput=false]
           * @param ScriptOption [ScriptOption=1]
           */
  def TransformXML(
    DataSource: java.lang.String,
    TransformSource: java.lang.String,
    OutputTarget: java.lang.String,
    WellFormedXMLOutput: scala.Boolean
  ): scala.Unit = js.native
  /**
           * @param WellFormedXMLOutput [WellFormedXMLOutput=false]
           * @param ScriptOption [ScriptOption=1]
           */
  def TransformXML(
    DataSource: java.lang.String,
    TransformSource: java.lang.String,
    OutputTarget: java.lang.String,
    WellFormedXMLOutput: scala.Boolean,
    ScriptOption: AcTransformXMLScriptOption
  ): scala.Unit = js.native
  def WebServices(Index: java.lang.String): WebService = js.native
  def WebServices(Index: scala.Double): WebService = js.native
  def hWndAccessApp(): scala.Double = js.native
}

