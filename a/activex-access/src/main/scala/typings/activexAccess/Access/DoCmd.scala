package typings.activexAccess.Access

import typings.activexAccess.activexAccessBooleans.`true`
import typings.activexAccess.activexAccessNumbers.`0`
import typings.activexAccess.activexAccessNumbers.`11`
import typings.activexAccess.activexAccessNumbers.`1`
import typings.activexAccess.activexAccessNumbers.`20`
import typings.activexAccess.activexAccessNumbers.`2`
import typings.activexAccess.activexAccessNumbers.`3`
import typings.activexAccess.activexAccessNumbers.`4`
import typings.activexAccess.activexAccessNumbers.`5`
import typings.activexAccess.activexAccessNumbers.`6`
import typings.activexAccess.activexAccessNumbers.`70`
import typings.activexAccess.activexAccessNumbers.`7`
import typings.activexAccess.activexAccessNumbers.`8`
import typings.activexAccess.activexAccessNumbers.`9`
import typings.activexAccess.activexAccessStrings.`MS-DOS Text LeftparenthesisAsteriskDottxtRightparenthesis`
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.DoCmd")
@js.native
class DoCmd protected () extends js.Object {
  @JSName("Access.DoCmd_typekey")
  var AccessDotDoCmd_typekey: DoCmd = js.native
  def AddMenu(MenuName: String, MenuMacroName: String): Unit = js.native
  def AddMenu(MenuName: String, MenuMacroName: String, StatusBarText: String): Unit = js.native
  def ApplyFilter(): Unit = js.native
  def ApplyFilter(FilterName: String): Unit = js.native
  def ApplyFilter(FilterName: String, WhereCondition: String): Unit = js.native
  def ApplyFilter(FilterName: String, WhereCondition: String, ControlName: js.Any): Unit = js.native
  def ApplyFilterOld0(): Unit = js.native
  def ApplyFilterOld0(FilterName: String): Unit = js.native
  def ApplyFilterOld0(FilterName: String, WhereCondition: String): Unit = js.native
  def Beep(): Unit = js.native
  /** @param DataMode [DataMode=1] */
  def BrowseTo(ObjectType: AcBrowseToObjectType, ObjectName: String): Unit = js.native
  def BrowseTo(ObjectType: AcBrowseToObjectType, ObjectName: String, PathtoSubformControl: String): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: String
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: String,
    Page: String
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: String,
    Page: String,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  def CancelEvent(): Unit = js.native
  def ClearMacroError(): Unit = js.native
  def Close(): Unit = js.native
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Save [Save=0]
    */
  def Close(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  def Close(ObjectType: AcObjectType, ObjectName: String, Save: AcCloseSave): Unit = js.native
  def CloseDatabase(): Unit = js.native
  def CopyDatabaseFile(DatabaseFileName: String): Unit = js.native
  def CopyDatabaseFile(DatabaseFileName: String, OverwriteExistingFile: Boolean): Unit = js.native
  def CopyDatabaseFile(DatabaseFileName: String, OverwriteExistingFile: Boolean, DisconnectAllUsers: Boolean): Unit = js.native
  /** @param SourceObjectType [SourceObjectType=-1] */
  def CopyObject(DestinationDatabase: String, NewName: String): Unit = js.native
  def CopyObject(DestinationDatabase: String, NewName: String, SourceObjectType: AcObjectType): Unit = js.native
  def CopyObject(
    DestinationDatabase: String,
    NewName: String,
    SourceObjectType: AcObjectType,
    SourceObjectName: String
  ): Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def DeleteObject(): Unit = js.native
  def DeleteObject(ObjectType: AcObjectType): Unit = js.native
  def DeleteObject(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  /** @deprecated Use the **RunCommand** method */
  def DoMenuItem(
    MenuBar: `0` | Double,
    MenuName: `0` | `1` | `5` | Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9` | Double
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0` | Double,
    MenuName: `0` | `1` | `5` | Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9` | Double,
    Subcommand: `0` | `3` | Double
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0` | Double,
    MenuName: `0` | `1` | `5` | Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9` | Double,
    Subcommand: `0` | `3` | Double,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def Echo(EchoOn: Boolean): Unit = js.native
  def Echo(EchoOn: Boolean, StatusBarText: String): Unit = js.native
  def FindNext(): Unit = js.native
  /**
    * @param Match [Match=1]
    * @param MatchCase [MatchCase=false]
    * @param Search [Search=2]
    * @param SearchAsFormatted [SearchAsFormatted=false]
    * @param OnlyCurrentField [OnlyCurrentField=-1]
    */
  def FindRecord(
    FindWhat: String,
    Match: js.UndefOr[AcFindMatch],
    MatchCase: js.UndefOr[Boolean],
    Search: js.UndefOr[AcSearchDirection],
    SearchAsFormatted: js.UndefOr[Boolean],
    OnlyCurrentField: js.UndefOr[AcFindField],
    FindFirst: js.UndefOr[Boolean]
  ): Unit = js.native
  def FindRecord(
    FindWhat: Double,
    Match: js.UndefOr[AcFindMatch],
    MatchCase: js.UndefOr[Boolean],
    Search: js.UndefOr[AcSearchDirection],
    SearchAsFormatted: js.UndefOr[Boolean],
    OnlyCurrentField: js.UndefOr[AcFindField],
    FindFirst: js.UndefOr[Boolean]
  ): Unit = js.native
  def FindRecord(
    FindWhat: VarDate,
    Match: js.UndefOr[AcFindMatch],
    MatchCase: js.UndefOr[Boolean],
    Search: js.UndefOr[AcSearchDirection],
    SearchAsFormatted: js.UndefOr[Boolean],
    OnlyCurrentField: js.UndefOr[AcFindField],
    FindFirst: js.UndefOr[Boolean]
  ): Unit = js.native
  def GoToControl(ControlName: String): Unit = js.native
  def GoToPage(PageNumber: Double): Unit = js.native
  def GoToPage(PageNumber: Double, Right: Double): Unit = js.native
  def GoToPage(PageNumber: Double, Right: Double, Down: Double): Unit = js.native
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Record [Record=1]
    */
  def GoToRecord(): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: String): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord): Unit = js.native
  @JSName("GoToRecord")
  def GoToRecord_0(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord, Offset: `0`): Unit = js.native
  @JSName("GoToRecord")
  def GoToRecord_1(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord, Offset: `1`): Unit = js.native
  @JSName("GoToRecord")
  def GoToRecord_2(ObjectType: AcDataObjectType, ObjectName: String, Record: `2`): Unit = js.native
  @JSName("GoToRecord")
  def GoToRecord_3(ObjectType: AcDataObjectType, ObjectName: String, Record: `3`): Unit = js.native
  @JSName("GoToRecord")
  def GoToRecord_4(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord, Offset: `4`): Unit = js.native
  @JSName("GoToRecord")
  def GoToRecord_5(ObjectType: AcDataObjectType, ObjectName: String, Record: `5`): Unit = js.native
  def Hourglass(HourglassOn: Boolean): Unit = js.native
  def LockNavigationPane(Lock: Boolean): Unit = js.native
  def Maximize(): Unit = js.native
  def Minimize(): Unit = js.native
  def MoveSize(): Unit = js.native
  def MoveSize(Right: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Double, Width: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Double, Width: Double, Height: Double): Unit = js.native
  def NavigateTo(): Unit = js.native
  def NavigateTo(Category: js.Any): Unit = js.native
  def NavigateTo(Category: js.Any, Group: js.Any): Unit = js.native
  /** @param View [View=0] */
  def OpenDataAccessPage(DataAccessPageName: String): Unit = js.native
  def OpenDataAccessPage(DataAccessPageName: String, View: AcDataAccessPageView): Unit = js.native
  def OpenDiagram(DiagramName: String): Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=-1]
    * @param WindowMode [WindowMode=0]
    */
  def OpenForm(
    FormName: String,
    View: js.UndefOr[AcFormView],
    FilterName: js.UndefOr[String],
    WhereCondition: js.UndefOr[String],
    DataMode: js.UndefOr[AcFormOpenDataMode],
    WindowMode: js.UndefOr[AcWindowMode],
    OpenArgs: js.UndefOr[String]
  ): Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenFunction(FunctionName: String): Unit = js.native
  def OpenFunction(FunctionName: String, View: AcView): Unit = js.native
  def OpenFunction(FunctionName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  def OpenModule(): Unit = js.native
  def OpenModule(ModuleName: String): Unit = js.native
  def OpenModule(ModuleName: String, ProcedureName: String): Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenQuery(QueryName: String): Unit = js.native
  def OpenQuery(QueryName: String, View: AcView): Unit = js.native
  def OpenQuery(QueryName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  /**
    * @param View [View=0]
    * @param WindowMode [WindowMode=0]
    */
  def OpenReport(ReportName: String): Unit = js.native
  def OpenReport(ReportName: String, View: AcView): Unit = js.native
  def OpenReport(ReportName: String, View: AcView, FilterName: String): Unit = js.native
  def OpenReport(ReportName: String, View: AcView, FilterName: String, WhereCondition: String): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: String,
    WhereCondition: String,
    WindowMode: AcWindowMode
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: String,
    WhereCondition: String,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  /** @param View [View=0] */
  def OpenReportOld0(ReportName: js.Any): Unit = js.native
  def OpenReportOld0(ReportName: js.Any, View: AcView): Unit = js.native
  def OpenReportOld0(ReportName: js.Any, View: AcView, FilterName: js.Any): Unit = js.native
  def OpenReportOld0(ReportName: js.Any, View: AcView, FilterName: js.Any, WhereCondition: js.Any): Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenStoredProcedure(ProcedureName: String): Unit = js.native
  def OpenStoredProcedure(ProcedureName: String, View: AcView): Unit = js.native
  def OpenStoredProcedure(ProcedureName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenTable(TableName: String): Unit = js.native
  def OpenTable(TableName: String, View: AcView): Unit = js.native
  def OpenTable(TableName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenView(ViewName: String): Unit = js.native
  def OpenView(ViewName: String, View: AcView): Unit = js.native
  def OpenView(ViewName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  /** @param OutputQuality [OutputQuality=0] */
  def OutputTo(
    ObjectType: AcOutputObjectType,
    ObjectName: js.UndefOr[String],
    OutputFormat: js.UndefOr[AcOutputFormat],
    OutputFile: js.UndefOr[String],
    AutoStart: js.UndefOr[Boolean],
    TemplateFile: js.UndefOr[String],
    Encoding: js.UndefOr[js.Any],
    OutputQuality: js.UndefOr[AcExportQuality]
  ): Unit = js.native
  /** @param OutputQuality [OutputQuality=0] */
  def OutputTo(
    ObjectType: `5`,
    ObjectName: String,
    OutputFormat: `MS-DOS Text LeftparenthesisAsteriskDottxtRightparenthesis`,
    OutputFile: String,
    AutoStart: Boolean,
    TemplateFile: String,
    Encoding: js.Any
  ): Unit = js.native
  def OutputTo(
    ObjectType: `5`,
    ObjectName: String,
    OutputFormat: `MS-DOS Text LeftparenthesisAsteriskDottxtRightparenthesis`,
    OutputFile: String,
    AutoStart: Boolean,
    TemplateFile: String,
    Encoding: js.Any,
    OutputQuality: AcExportQuality
  ): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: js.Any): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: js.Any, OutputFormat: js.Any): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: js.Any, OutputFormat: js.Any, OutputFile: js.Any): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: js.Any,
    OutputFormat: js.Any,
    OutputFile: js.Any,
    AutoStart: js.Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: js.Any,
    OutputFormat: js.Any,
    OutputFile: js.Any,
    AutoStart: js.Any,
    TemplateFile: js.Any
  ): Unit = js.native
  def OutputToOld1(
    ObjectType: AcOutputObjectType,
    ObjectName: js.UndefOr[js.Any],
    OutputFormat: js.UndefOr[js.Any],
    OutputFile: js.UndefOr[js.Any],
    AutoStart: js.UndefOr[js.Any],
    TemplateFile: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any]
  ): Unit = js.native
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
    Copies: js.UndefOr[Double],
    CollateCopies: js.UndefOr[Boolean]
  ): Unit = js.native
  /**
    * @param PrintRange [PrintRange=0]
    * @param PrintQuality [PrintQuality=0]
    * @param Copies [Copies=1]
    * @param CollateCopies [CollateCopies=true]
    */
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Double, PrintQuality: AcPrintQuality): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Double, PrintQuality: AcPrintQuality, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Double,
    PrintQuality: AcPrintQuality,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  /** @param Options [Options=1] */
  def Quit(): Unit = js.native
  def Quit(Options: AcQuitOption): Unit = js.native
  def RefreshRecord(): Unit = js.native
  def Rename(NewName: String): Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def Rename(NewName: String, ObjectType: AcObjectType, OldName: String): Unit = js.native
  def RepaintObject(): Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def RepaintObject(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  def Requery(): Unit = js.native
  def Requery(ControlName: String): Unit = js.native
  def Restore(): Unit = js.native
  def RunCommand(Command: AcCommand): Unit = js.native
  def RunDataMacro(MacroName: String): Unit = js.native
  def RunMacro(MacroName: String): Unit = js.native
  def RunMacro(MacroName: String, RepeatCount: Double): Unit = js.native
  def RunMacro(MacroName: String, RepeatCount: Double, RepeatExpression: String): Unit = js.native
  def RunSQL(SQLStatement: String): Unit = js.native
  def RunSQL(SQLStatement: String, UseTransaction: Boolean): Unit = js.native
  def RunSavedImportExport(SavedImportExportName: String): Unit = js.native
  def Save(): Unit = js.native
  def Save(ObjectType: js.UndefOr[scala.Nothing], ObjectName: String): Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def Save(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Record [Record=2]
    */
  def SearchForRecord(): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: String): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord, WhereCondition: String): Unit = js.native
  def SelectObject(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  @JSName("SelectObject")
  def SelectObject_true(ObjectType: AcObjectType, ObjectName: js.UndefOr[scala.Nothing], InDatabaseWindow: `true`): Unit = js.native
  @JSName("SelectObject")
  def SelectObject_true(ObjectType: AcObjectType, ObjectName: String, InDatabaseWindow: `true`): Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def SendObject(
    ObjectType: js.UndefOr[AcSendObjectType],
    ObjectName: js.UndefOr[String],
    OutputFormat: js.UndefOr[AcOutputFormat],
    To: js.UndefOr[String],
    Cc: js.UndefOr[String],
    Bcc: js.UndefOr[String],
    Subject: js.UndefOr[String],
    MessageText: js.UndefOr[String],
    EditMessage: js.UndefOr[Boolean],
    TemplateFile: js.UndefOr[String]
  ): Unit = js.native
  def SetDisplayedCategories(Show: Boolean): Unit = js.native
  def SetDisplayedCategories(Show: Boolean, Category: String): Unit = js.native
  def SetFilter(): Unit = js.native
  def SetFilter(FilterName: String): Unit = js.native
  def SetFilter(FilterName: String, WhereCondition: String): Unit = js.native
  def SetFilter(FilterName: String, WhereCondition: String, ControlName: String): Unit = js.native
  def SetMenuItem(MenuIndex: Double): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Double): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Double, SubcommandIndex: Double): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Double, SubcommandIndex: Double, Flag: AcSetMenuItemState): Unit = js.native
  def SetOrderBy(OrderBy: String): Unit = js.native
  def SetOrderBy(OrderBy: String, ControlName: String): Unit = js.native
  def SetParameter(Name: String, Expression: js.Any): Unit = js.native
  /** @param Property [Property=0] */
  def SetProperty(ControlName: String): Unit = js.native
  def SetProperty(ControlName: String, Property: AcProperty): Unit = js.native
  def SetProperty(ControlName: String, Property: AcProperty, Value: js.Any): Unit = js.native
  def SetWarnings(WarningsOn: Boolean): Unit = js.native
  def ShowAllRecords(): Unit = js.native
  /** @param Show [Show=0] */
  def ShowToolbar(ToolbarName: String): Unit = js.native
  def ShowToolbar(ToolbarName: String, Show: AcShowToolbar): Unit = js.native
  def SingleStep(): Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param ObjectType [ObjectType=0]
    * @param StructureOnly [StructureOnly=false\]
    * @param StoreLogin [StoreLogin=false]
    */
  def TransferDatabase(
    TransferType: js.UndefOr[AcDataTransferType],
    DatabaseType: js.UndefOr[DatabaseType],
    DatabaseName: js.UndefOr[String],
    ObjectType: js.UndefOr[AcObjectType],
    Source: js.UndefOr[String],
    Destination: js.UndefOr[String],
    StructureOnly: js.UndefOr[Boolean],
    StoreLogin: js.UndefOr[Boolean]
  ): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Boolean): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Boolean, Login: String): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Boolean, Login: String, Password: String): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Boolean,
    Login: String,
    Password: String,
    TransferCopyData: Boolean
  ): Unit = js.native
  def TransferSharePointList(TransferType: AcSharePointListTransferType, SiteAddress: String, ListID: String): Unit = js.native
  def TransferSharePointList(TransferType: AcSharePointListTransferType, SiteAddress: String, ListID: String, ViewID: String): Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: String,
    ListID: String,
    ViewID: String,
    TableName: String
  ): Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: String,
    ListID: String,
    ViewID: String,
    TableName: String,
    GetLookupDisplayValues: Boolean
  ): Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param SpreadsheetType [SpreadsheetType=10]
    * @param HasFieldNames [HasFieldNames=false]
    */
  def TransferSpreadsheet(): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: AcSpreadSheetType): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: AcSpreadSheetType, TableName: String): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param SpreadsheetType [SpreadsheetType=10]
    * @param HasFieldNames [HasFieldNames=false]
    */
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: AcSpreadSheetType): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: AcSpreadSheetType, TableName: String): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: AcSpreadSheetType, TableName: String, FileName: String): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean,
    Range: js.Any
  ): Unit = js.native
  def TransferText(
    TransferType: js.UndefOr[AcTextTransferType],
    SpecificationName: js.UndefOr[String],
    TableName: js.UndefOr[String],
    FileName: js.UndefOr[String],
    HasFieldNames: js.UndefOr[Boolean],
    HTMLTableName: js.UndefOr[scala.Nothing],
    CodePage: js.UndefOr[Double]
  ): Unit = js.native
  @JSName("TransferText")
  def TransferText_7(
    TransferType: js.UndefOr[`7`],
    SpecificationName: js.UndefOr[String],
    TableName: js.UndefOr[String],
    FileName: js.UndefOr[String],
    HasFieldNames: js.UndefOr[Boolean],
    HTMLTableName: js.UndefOr[String],
    CodePage: js.UndefOr[Double]
  ): Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param Encoding For valid values see https://msdn.microsoft.com/en-us/library/windows/desktop/dd317756(v=vs.85).aspx
    */
  @JSName("TransferText")
  def TransferText_8(
    TransferType: js.UndefOr[`8`],
    SpecificationName: js.UndefOr[String],
    TableName: js.UndefOr[String],
    FileName: js.UndefOr[String],
    HasFieldNames: js.UndefOr[Boolean],
    HTMLTableName: js.UndefOr[String],
    CodePage: js.UndefOr[Double]
  ): Unit = js.native
}

