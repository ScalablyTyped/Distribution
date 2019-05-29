package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.DoCmd")
@js.native
class DoCmd protected () extends js.Object {
  var `Access.DoCmd_typekey`: DoCmd = js.native
  def AddMenu(MenuName: java.lang.String, MenuMacroName: java.lang.String): scala.Unit = js.native
  def AddMenu(MenuName: java.lang.String, MenuMacroName: java.lang.String, StatusBarText: java.lang.String): scala.Unit = js.native
  def ApplyFilter(): scala.Unit = js.native
  def ApplyFilter(FilterName: java.lang.String): scala.Unit = js.native
  def ApplyFilter(FilterName: java.lang.String, WhereCondition: java.lang.String): scala.Unit = js.native
  def ApplyFilter(FilterName: java.lang.String, WhereCondition: java.lang.String, ControlName: js.Any): scala.Unit = js.native
  def ApplyFilterOld0(): scala.Unit = js.native
  def ApplyFilterOld0(FilterName: java.lang.String): scala.Unit = js.native
  def ApplyFilterOld0(FilterName: java.lang.String, WhereCondition: java.lang.String): scala.Unit = js.native
  def Beep(): scala.Unit = js.native
  /** @param DataMode [DataMode=1] */
  def BrowseTo(ObjectType: AcBrowseToObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: java.lang.String,
    PathtoSubformControl: java.lang.String
  ): scala.Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: java.lang.String,
    PathtoSubformControl: java.lang.String,
    WhereCondition: java.lang.String
  ): scala.Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: java.lang.String,
    PathtoSubformControl: java.lang.String,
    WhereCondition: java.lang.String,
    Page: java.lang.String
  ): scala.Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: java.lang.String,
    PathtoSubformControl: java.lang.String,
    WhereCondition: java.lang.String,
    Page: java.lang.String,
    DataMode: AcFormOpenDataMode
  ): scala.Unit = js.native
  def CancelEvent(): scala.Unit = js.native
  def ClearMacroError(): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Save [Save=0]
    */
  def Close(ObjectType: AcObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  def Close(ObjectType: AcObjectType, ObjectName: java.lang.String, Save: AcCloseSave): scala.Unit = js.native
  def CloseDatabase(): scala.Unit = js.native
  def CopyDatabaseFile(DatabaseFileName: java.lang.String): scala.Unit = js.native
  def CopyDatabaseFile(DatabaseFileName: java.lang.String, OverwriteExistingFile: scala.Boolean): scala.Unit = js.native
  def CopyDatabaseFile(
    DatabaseFileName: java.lang.String,
    OverwriteExistingFile: scala.Boolean,
    DisconnectAllUsers: scala.Boolean
  ): scala.Unit = js.native
  /** @param SourceObjectType [SourceObjectType=-1] */
  def CopyObject(DestinationDatabase: java.lang.String, NewName: java.lang.String): scala.Unit = js.native
  def CopyObject(DestinationDatabase: java.lang.String, NewName: java.lang.String, SourceObjectType: AcObjectType): scala.Unit = js.native
  def CopyObject(
    DestinationDatabase: java.lang.String,
    NewName: java.lang.String,
    SourceObjectType: AcObjectType,
    SourceObjectName: java.lang.String
  ): scala.Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def DeleteObject(): scala.Unit = js.native
  def DeleteObject(ObjectType: AcObjectType): scala.Unit = js.native
  def DeleteObject(ObjectType: AcObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  /** @deprecated Use the **RunCommand** method */
  def DoMenuItem(
    MenuBar: Constants | scala.Double,
    MenuName: Constants | scala.Double,
    Command: Constants | scala.Double
  ): scala.Unit = js.native
  def DoMenuItem(
    MenuBar: Constants | scala.Double,
    MenuName: Constants | scala.Double,
    Command: Constants | scala.Double,
    Subcommand: Constants | scala.Double
  ): scala.Unit = js.native
  def DoMenuItem(
    MenuBar: Constants | scala.Double,
    MenuName: Constants | scala.Double,
    Command: Constants | scala.Double,
    Subcommand: Constants | scala.Double,
    Version: Constants
  ): scala.Unit = js.native
  def Echo(EchoOn: scala.Boolean): scala.Unit = js.native
  def Echo(EchoOn: scala.Boolean, StatusBarText: java.lang.String): scala.Unit = js.native
  def FindNext(): scala.Unit = js.native
  /**
    * @param Match [Match=1]
    * @param MatchCase [MatchCase=false]
    * @param Search [Search=2]
    * @param SearchAsFormatted [SearchAsFormatted=false]
    * @param OnlyCurrentField [OnlyCurrentField=-1]
    */
  def FindRecord(
    FindWhat: java.lang.String,
    Match: js.UndefOr[AcFindMatch],
    MatchCase: js.UndefOr[scala.Boolean],
    Search: js.UndefOr[AcSearchDirection],
    SearchAsFormatted: js.UndefOr[scala.Boolean],
    OnlyCurrentField: js.UndefOr[AcFindField],
    FindFirst: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def FindRecord(
    FindWhat: scala.Double,
    Match: js.UndefOr[AcFindMatch],
    MatchCase: js.UndefOr[scala.Boolean],
    Search: js.UndefOr[AcSearchDirection],
    SearchAsFormatted: js.UndefOr[scala.Boolean],
    OnlyCurrentField: js.UndefOr[AcFindField],
    FindFirst: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def FindRecord(
    FindWhat: stdLib.VarDate,
    Match: js.UndefOr[AcFindMatch],
    MatchCase: js.UndefOr[scala.Boolean],
    Search: js.UndefOr[AcSearchDirection],
    SearchAsFormatted: js.UndefOr[scala.Boolean],
    OnlyCurrentField: js.UndefOr[AcFindField],
    FindFirst: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def GoToControl(ControlName: java.lang.String): scala.Unit = js.native
  def GoToPage(PageNumber: scala.Double): scala.Unit = js.native
  def GoToPage(PageNumber: scala.Double, Right: scala.Double): scala.Unit = js.native
  def GoToPage(PageNumber: scala.Double, Right: scala.Double, Down: scala.Double): scala.Unit = js.native
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Record [Record=1]
    */
  def GoToRecord(): scala.Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType): scala.Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: java.lang.String, Record: AcRecord): scala.Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: java.lang.String, Record: AcRecord, Offset: AcRecord): scala.Unit = js.native
  def Hourglass(HourglassOn: scala.Boolean): scala.Unit = js.native
  def LockNavigationPane(Lock: scala.Boolean): scala.Unit = js.native
  def Maximize(): scala.Unit = js.native
  def Minimize(): scala.Unit = js.native
  def MoveSize(): scala.Unit = js.native
  def MoveSize(Right: scala.Double): scala.Unit = js.native
  def MoveSize(Right: scala.Double, Down: scala.Double): scala.Unit = js.native
  def MoveSize(Right: scala.Double, Down: scala.Double, Width: scala.Double): scala.Unit = js.native
  def MoveSize(Right: scala.Double, Down: scala.Double, Width: scala.Double, Height: scala.Double): scala.Unit = js.native
  def NavigateTo(): scala.Unit = js.native
  def NavigateTo(Category: js.Any): scala.Unit = js.native
  def NavigateTo(Category: js.Any, Group: js.Any): scala.Unit = js.native
  /** @param View [View=0] */
  def OpenDataAccessPage(DataAccessPageName: java.lang.String): scala.Unit = js.native
  def OpenDataAccessPage(DataAccessPageName: java.lang.String, View: AcDataAccessPageView): scala.Unit = js.native
  def OpenDiagram(DiagramName: java.lang.String): scala.Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=-1]
    * @param WindowMode [WindowMode=0]
    */
  def OpenForm(
    FormName: java.lang.String,
    View: js.UndefOr[AcFormView],
    FilterName: js.UndefOr[java.lang.String],
    WhereCondition: js.UndefOr[java.lang.String],
    DataMode: js.UndefOr[AcFormOpenDataMode],
    WindowMode: js.UndefOr[AcWindowMode],
    OpenArgs: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenFunction(FunctionName: java.lang.String): scala.Unit = js.native
  def OpenFunction(FunctionName: java.lang.String, View: AcView): scala.Unit = js.native
  def OpenFunction(FunctionName: java.lang.String, View: AcView, DataMode: AcOpenDataMode): scala.Unit = js.native
  def OpenModule(): scala.Unit = js.native
  def OpenModule(ModuleName: java.lang.String): scala.Unit = js.native
  def OpenModule(ModuleName: java.lang.String, ProcedureName: java.lang.String): scala.Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenQuery(QueryName: java.lang.String): scala.Unit = js.native
  def OpenQuery(QueryName: java.lang.String, View: AcView): scala.Unit = js.native
  def OpenQuery(QueryName: java.lang.String, View: AcView, DataMode: AcOpenDataMode): scala.Unit = js.native
  /**
    * @param View [View=0]
    * @param WindowMode [WindowMode=0]
    */
  def OpenReport(ReportName: java.lang.String): scala.Unit = js.native
  def OpenReport(ReportName: java.lang.String, View: AcView): scala.Unit = js.native
  def OpenReport(ReportName: java.lang.String, View: AcView, FilterName: java.lang.String): scala.Unit = js.native
  def OpenReport(
    ReportName: java.lang.String,
    View: AcView,
    FilterName: java.lang.String,
    WhereCondition: java.lang.String
  ): scala.Unit = js.native
  def OpenReport(
    ReportName: java.lang.String,
    View: AcView,
    FilterName: java.lang.String,
    WhereCondition: java.lang.String,
    WindowMode: AcWindowMode
  ): scala.Unit = js.native
  def OpenReport(
    ReportName: java.lang.String,
    View: AcView,
    FilterName: java.lang.String,
    WhereCondition: java.lang.String,
    WindowMode: AcWindowMode,
    OpenArgs: java.lang.String
  ): scala.Unit = js.native
  /** @param View [View=0] */
  def OpenReportOld0(ReportName: js.Any): scala.Unit = js.native
  def OpenReportOld0(ReportName: js.Any, View: AcView): scala.Unit = js.native
  def OpenReportOld0(ReportName: js.Any, View: AcView, FilterName: js.Any): scala.Unit = js.native
  def OpenReportOld0(ReportName: js.Any, View: AcView, FilterName: js.Any, WhereCondition: js.Any): scala.Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenStoredProcedure(ProcedureName: java.lang.String): scala.Unit = js.native
  def OpenStoredProcedure(ProcedureName: java.lang.String, View: AcView): scala.Unit = js.native
  def OpenStoredProcedure(ProcedureName: java.lang.String, View: AcView, DataMode: AcOpenDataMode): scala.Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenTable(TableName: java.lang.String): scala.Unit = js.native
  def OpenTable(TableName: java.lang.String, View: AcView): scala.Unit = js.native
  def OpenTable(TableName: java.lang.String, View: AcView, DataMode: AcOpenDataMode): scala.Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenView(ViewName: java.lang.String): scala.Unit = js.native
  def OpenView(ViewName: java.lang.String, View: AcView): scala.Unit = js.native
  def OpenView(ViewName: java.lang.String, View: AcView, DataMode: AcOpenDataMode): scala.Unit = js.native
  /** @param OutputQuality [OutputQuality=0] */
  def OutputTo(
    ObjectType: AcOutputObjectType,
    ObjectName: js.UndefOr[java.lang.String],
    OutputFormat: js.UndefOr[AcOutputFormat],
    OutputFile: js.UndefOr[java.lang.String],
    AutoStart: js.UndefOr[scala.Boolean],
    TemplateFile: js.UndefOr[java.lang.String],
    Encoding: js.UndefOr[js.Any],
    OutputQuality: js.UndefOr[AcExportQuality]
  ): scala.Unit = js.native
  /** @param OutputQuality [OutputQuality=0] */
  def OutputTo(
    ObjectType: AcOutputObjectType,
    ObjectName: java.lang.String,
    OutputFormat: AcOutputFormat,
    OutputFile: java.lang.String,
    AutoStart: scala.Boolean,
    TemplateFile: java.lang.String,
    Encoding: js.Any
  ): scala.Unit = js.native
  def OutputTo(
    ObjectType: AcOutputObjectType,
    ObjectName: java.lang.String,
    OutputFormat: AcOutputFormat,
    OutputFile: java.lang.String,
    AutoStart: scala.Boolean,
    TemplateFile: java.lang.String,
    Encoding: js.Any,
    OutputQuality: AcExportQuality
  ): scala.Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType): scala.Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: js.Any): scala.Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: js.Any, OutputFormat: js.Any): scala.Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: js.Any, OutputFormat: js.Any, OutputFile: js.Any): scala.Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: js.Any,
    OutputFormat: js.Any,
    OutputFile: js.Any,
    AutoStart: js.Any
  ): scala.Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: js.Any,
    OutputFormat: js.Any,
    OutputFile: js.Any,
    AutoStart: js.Any,
    TemplateFile: js.Any
  ): scala.Unit = js.native
  def OutputToOld1(
    ObjectType: AcOutputObjectType,
    ObjectName: js.UndefOr[js.Any],
    OutputFormat: js.UndefOr[js.Any],
    OutputFile: js.UndefOr[js.Any],
    AutoStart: js.UndefOr[js.Any],
    TemplateFile: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  /**
    * @param PrintRange [PrintRange=0]
    * @param PrintQuality [PrintQuality=0]
    * @param Copies [Copies=1]
    * @param CollateCopies [CollateCopies=true]
    */
  def PrintOut(
    PrintRange: js.UndefOr[AcPrintRange],
    PageFrom: js.UndefOr[scala.Nothing],
    PageTo: js.UndefOr[scala.Nothing],
    PrintQuality: js.UndefOr[AcPrintQuality],
    Copies: js.UndefOr[scala.Double],
    CollateCopies: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  /**
    * @param PrintRange [PrintRange=0]
    * @param PrintQuality [PrintQuality=0]
    * @param Copies [Copies=1]
    * @param CollateCopies [CollateCopies=true]
    */
  def PrintOut(PrintRange: AcPrintRange): scala.Unit = js.native
  def PrintOut(PrintRange: AcPrintRange, PageFrom: scala.Double): scala.Unit = js.native
  def PrintOut(PrintRange: AcPrintRange, PageFrom: scala.Double, PageTo: scala.Double): scala.Unit = js.native
  def PrintOut(
    PrintRange: AcPrintRange,
    PageFrom: scala.Double,
    PageTo: scala.Double,
    PrintQuality: AcPrintQuality
  ): scala.Unit = js.native
  def PrintOut(
    PrintRange: AcPrintRange,
    PageFrom: scala.Double,
    PageTo: scala.Double,
    PrintQuality: AcPrintQuality,
    Copies: scala.Double
  ): scala.Unit = js.native
  def PrintOut(
    PrintRange: AcPrintRange,
    PageFrom: scala.Double,
    PageTo: scala.Double,
    PrintQuality: AcPrintQuality,
    Copies: scala.Double,
    CollateCopies: scala.Boolean
  ): scala.Unit = js.native
  /** @param Options [Options=1] */
  def Quit(): scala.Unit = js.native
  def Quit(Options: AcQuitOption): scala.Unit = js.native
  def RefreshRecord(): scala.Unit = js.native
  def Rename(NewName: java.lang.String): scala.Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def Rename(NewName: java.lang.String, ObjectType: AcObjectType, OldName: java.lang.String): scala.Unit = js.native
  def RepaintObject(): scala.Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def RepaintObject(ObjectType: AcObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  def Requery(): scala.Unit = js.native
  def Requery(ControlName: java.lang.String): scala.Unit = js.native
  def Restore(): scala.Unit = js.native
  def RunCommand(Command: AcCommand): scala.Unit = js.native
  def RunDataMacro(MacroName: java.lang.String): scala.Unit = js.native
  def RunMacro(MacroName: java.lang.String): scala.Unit = js.native
  def RunMacro(MacroName: java.lang.String, RepeatCount: scala.Double): scala.Unit = js.native
  def RunMacro(MacroName: java.lang.String, RepeatCount: scala.Double, RepeatExpression: java.lang.String): scala.Unit = js.native
  def RunSQL(SQLStatement: java.lang.String): scala.Unit = js.native
  def RunSQL(SQLStatement: java.lang.String, UseTransaction: scala.Boolean): scala.Unit = js.native
  def RunSavedImportExport(SavedImportExportName: java.lang.String): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  def Save(ObjectType: js.UndefOr[scala.Nothing], ObjectName: java.lang.String): scala.Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def Save(ObjectType: AcObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Record [Record=2]
    */
  def SearchForRecord(): scala.Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType): scala.Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: java.lang.String, Record: AcRecord): scala.Unit = js.native
  def SearchForRecord(
    ObjectType: AcDataObjectType,
    ObjectName: java.lang.String,
    Record: AcRecord,
    WhereCondition: java.lang.String
  ): scala.Unit = js.native
  def SelectObject(
    ObjectType: AcObjectType,
    ObjectName: js.UndefOr[scala.Nothing],
    InDatabaseWindow: activexDashAccessLib.activexDashAccessLibNumbers.`true`
  ): scala.Unit = js.native
  def SelectObject(ObjectType: AcObjectType, ObjectName: java.lang.String): scala.Unit = js.native
  def SelectObject(
    ObjectType: AcObjectType,
    ObjectName: java.lang.String,
    InDatabaseWindow: activexDashAccessLib.activexDashAccessLibNumbers.`true`
  ): scala.Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def SendObject(
    ObjectType: js.UndefOr[AcSendObjectType],
    ObjectName: js.UndefOr[java.lang.String],
    OutputFormat: js.UndefOr[AcOutputFormat],
    To: js.UndefOr[java.lang.String],
    Cc: js.UndefOr[java.lang.String],
    Bcc: js.UndefOr[java.lang.String],
    Subject: js.UndefOr[java.lang.String],
    MessageText: js.UndefOr[java.lang.String],
    EditMessage: js.UndefOr[scala.Boolean],
    TemplateFile: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  def SetDisplayedCategories(Show: scala.Boolean): scala.Unit = js.native
  def SetDisplayedCategories(Show: scala.Boolean, Category: java.lang.String): scala.Unit = js.native
  def SetFilter(): scala.Unit = js.native
  def SetFilter(FilterName: java.lang.String): scala.Unit = js.native
  def SetFilter(FilterName: java.lang.String, WhereCondition: java.lang.String): scala.Unit = js.native
  def SetFilter(FilterName: java.lang.String, WhereCondition: java.lang.String, ControlName: java.lang.String): scala.Unit = js.native
  def SetMenuItem(MenuIndex: scala.Double): scala.Unit = js.native
  def SetMenuItem(MenuIndex: scala.Double, CommandIndex: scala.Double): scala.Unit = js.native
  def SetMenuItem(MenuIndex: scala.Double, CommandIndex: scala.Double, SubcommandIndex: scala.Double): scala.Unit = js.native
  def SetMenuItem(
    MenuIndex: scala.Double,
    CommandIndex: scala.Double,
    SubcommandIndex: scala.Double,
    Flag: AcSetMenuItemState
  ): scala.Unit = js.native
  def SetOrderBy(OrderBy: java.lang.String): scala.Unit = js.native
  def SetOrderBy(OrderBy: java.lang.String, ControlName: java.lang.String): scala.Unit = js.native
  def SetParameter(Name: java.lang.String, Expression: js.Any): scala.Unit = js.native
  /** @param Property [Property=0] */
  def SetProperty(ControlName: java.lang.String): scala.Unit = js.native
  def SetProperty(ControlName: java.lang.String, Property: AcProperty): scala.Unit = js.native
  def SetProperty(ControlName: java.lang.String, Property: AcProperty, Value: js.Any): scala.Unit = js.native
  def SetWarnings(WarningsOn: scala.Boolean): scala.Unit = js.native
  def ShowAllRecords(): scala.Unit = js.native
  /** @param Show [Show=0] */
  def ShowToolbar(ToolbarName: java.lang.String): scala.Unit = js.native
  def ShowToolbar(ToolbarName: java.lang.String, Show: AcShowToolbar): scala.Unit = js.native
  def SingleStep(): scala.Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param ObjectType [ObjectType=0]
    * @param StructureOnly [StructureOnly=false\]
    * @param StoreLogin [StoreLogin=false]
    */
  def TransferDatabase(
    TransferType: js.UndefOr[AcDataTransferType],
    DatabaseType: js.UndefOr[DatabaseType],
    DatabaseName: js.UndefOr[java.lang.String],
    ObjectType: js.UndefOr[AcObjectType],
    Source: js.UndefOr[java.lang.String],
    Destination: js.UndefOr[java.lang.String],
    StructureOnly: js.UndefOr[scala.Boolean],
    StoreLogin: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def TransferSQLDatabase(Server: java.lang.String, Database: java.lang.String): scala.Unit = js.native
  def TransferSQLDatabase(Server: java.lang.String, Database: java.lang.String, UseTrustedConnection: scala.Boolean): scala.Unit = js.native
  def TransferSQLDatabase(
    Server: java.lang.String,
    Database: java.lang.String,
    UseTrustedConnection: scala.Boolean,
    Login: java.lang.String
  ): scala.Unit = js.native
  def TransferSQLDatabase(
    Server: java.lang.String,
    Database: java.lang.String,
    UseTrustedConnection: scala.Boolean,
    Login: java.lang.String,
    Password: java.lang.String
  ): scala.Unit = js.native
  def TransferSQLDatabase(
    Server: java.lang.String,
    Database: java.lang.String,
    UseTrustedConnection: scala.Boolean,
    Login: java.lang.String,
    Password: java.lang.String,
    TransferCopyData: scala.Boolean
  ): scala.Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: java.lang.String,
    ListID: java.lang.String
  ): scala.Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: java.lang.String,
    ListID: java.lang.String,
    ViewID: java.lang.String
  ): scala.Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: java.lang.String,
    ListID: java.lang.String,
    ViewID: java.lang.String,
    TableName: java.lang.String
  ): scala.Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: java.lang.String,
    ListID: java.lang.String,
    ViewID: java.lang.String,
    TableName: java.lang.String,
    GetLookupDisplayValues: scala.Boolean
  ): scala.Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param SpreadsheetType [SpreadsheetType=10]
    * @param HasFieldNames [HasFieldNames=false]
    */
  def TransferSpreadsheet(): scala.Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param SpreadsheetType [SpreadsheetType=10]
    * @param HasFieldNames [HasFieldNames=false]
    */
  def TransferSpreadsheet(TransferType: AcDataTransferType): scala.Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: AcSpreadSheetType): scala.Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: AcSpreadSheetType, TableName: java.lang.String): scala.Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: java.lang.String,
    FileName: java.lang.String
  ): scala.Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: java.lang.String,
    FileName: java.lang.String,
    HasFieldNames: scala.Boolean
  ): scala.Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: java.lang.String,
    FileName: java.lang.String,
    HasFieldNames: scala.Boolean,
    Range: js.Any
  ): scala.Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param Encoding For valid values see https://msdn.microsoft.com/en-us/library/windows/desktop/dd317756(v=vs.85).aspx
    */
  def TransferText(
    TransferType: js.UndefOr[AcTextTransferType],
    SpecificationName: js.UndefOr[java.lang.String],
    TableName: js.UndefOr[java.lang.String],
    FileName: js.UndefOr[java.lang.String],
    HasFieldNames: js.UndefOr[scala.Boolean],
    HTMLTableName: js.UndefOr[java.lang.String],
    CodePage: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
}

