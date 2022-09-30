package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`false`
import typings.activexExcel.activexExcelInts.`-4104`
import typings.activexExcel.activexExcelInts.`-4122`
import typings.activexExcel.activexExcelInts.`-4123`
import typings.activexExcel.activexExcelInts.`10`
import typings.activexExcel.activexExcelInts.`11`
import typings.activexExcel.activexExcelInts.`12`
import typings.activexExcel.activexExcelInts.`13`
import typings.activexExcel.activexExcelInts.`14`
import typings.activexExcel.activexExcelInts.`15`
import typings.activexExcel.activexExcelInts.`16`
import typings.activexExcel.activexExcelInts.`17`
import typings.activexExcel.activexExcelInts.`18`
import typings.activexExcel.activexExcelInts.`19`
import typings.activexExcel.activexExcelInts.`1`
import typings.activexExcel.activexExcelInts.`20`
import typings.activexExcel.activexExcelInts.`21`
import typings.activexExcel.activexExcelInts.`22`
import typings.activexExcel.activexExcelInts.`23`
import typings.activexExcel.activexExcelInts.`24`
import typings.activexExcel.activexExcelInts.`25`
import typings.activexExcel.activexExcelInts.`26`
import typings.activexExcel.activexExcelInts.`27`
import typings.activexExcel.activexExcelInts.`28`
import typings.activexExcel.activexExcelInts.`29`
import typings.activexExcel.activexExcelInts.`2`
import typings.activexExcel.activexExcelInts.`30`
import typings.activexExcel.activexExcelInts.`31`
import typings.activexExcel.activexExcelInts.`32`
import typings.activexExcel.activexExcelInts.`33`
import typings.activexExcel.activexExcelInts.`34`
import typings.activexExcel.activexExcelInts.`35`
import typings.activexExcel.activexExcelInts.`36`
import typings.activexExcel.activexExcelInts.`37`
import typings.activexExcel.activexExcelInts.`38`
import typings.activexExcel.activexExcelInts.`39`
import typings.activexExcel.activexExcelInts.`3`
import typings.activexExcel.activexExcelInts.`40`
import typings.activexExcel.activexExcelInts.`41`
import typings.activexExcel.activexExcelInts.`42`
import typings.activexExcel.activexExcelInts.`43`
import typings.activexExcel.activexExcelInts.`44`
import typings.activexExcel.activexExcelInts.`45`
import typings.activexExcel.activexExcelInts.`46`
import typings.activexExcel.activexExcelInts.`47`
import typings.activexExcel.activexExcelInts.`48`
import typings.activexExcel.activexExcelInts.`4`
import typings.activexExcel.activexExcelInts.`5`
import typings.activexExcel.activexExcelInts.`6`
import typings.activexExcel.activexExcelInts.`7`
import typings.activexExcel.activexExcelInts.`8`
import typings.activexExcel.activexExcelInts.`9`
import typings.activexOffice.Office.MsoChartElementType
import typings.activexOffice.Office.MsoEnvelope
import typings.activexOffice.Office.MsoLanguageID
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart
  extends StObject
     with AddSheetResult[Any]
     with Sheet {
  
  def Activate(): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def ApplyChartTemplate(Filename: String): Unit = js.native
  
  def ApplyCustomType(ChartType: XlChartType): Unit = js.native
  def ApplyCustomType(ChartType: XlChartType, TypeName: Any): Unit = js.native
  
  /** @param Type [Type=2] */
  def ApplyDataLabels(
    Type: js.UndefOr[XlDataLabelsType],
    LegendKey: js.UndefOr[Boolean],
    AutoText: js.UndefOr[Boolean],
    HasLeaderLines: js.UndefOr[Boolean],
    ShowSeriesName: js.UndefOr[Boolean],
    ShowCategoryName: js.UndefOr[Boolean],
    ShowValue: js.UndefOr[Boolean],
    ShowPercentage: js.UndefOr[Boolean],
    ShowBubbleSize: js.UndefOr[Boolean],
    Separator: js.UndefOr[String]
  ): Unit = js.native
  
  def ApplyLayout(Layout: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): Unit = js.native
  def ApplyLayout(Layout: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`, ChartType: XlChartType): Unit = js.native
  
  def Arcs(): Any = js.native
  def Arcs(Index: Any): Any = js.native
  
  val Area3DGroup: ChartGroup = js.native
  
  def AreaGroups(): Any = js.native
  def AreaGroups(Index: Any): Any = js.native
  
  def AutoFormat(Gallery: Double): Unit = js.native
  def AutoFormat(Gallery: Double, Format: Any): Unit = js.native
  
  var AutoScaling: Boolean = js.native
  
  /** @param AxisGroup [AxisGroup=1] */
  def Axes(): typings.activexExcel.Excel.Axes | Axis = js.native
  def Axes(Type: Unit, AxisGroup: XlAxisGroup): typings.activexExcel.Excel.Axes | Axis = js.native
  def Axes(Type: XlAxisType): typings.activexExcel.Excel.Axes | Axis = js.native
  def Axes(Type: XlAxisType, AxisGroup: XlAxisGroup): typings.activexExcel.Excel.Axes | Axis = js.native
  
  val BackWall: typings.activexExcel.Excel.Walls = js.native
  
  val Bar3DGroup: ChartGroup = js.native
  
  def BarGroups(): Any = js.native
  def BarGroups(Index: Any): Any = js.native
  
  var BarShape: XlBarShape = js.native
  
  def Buttons(): Any = js.native
  def Buttons(Index: Any): Any = js.native
  
  val ChartArea: typings.activexExcel.Excel.ChartArea = js.native
  
  def ChartObjects(): typings.activexExcel.Excel.ChartObjects = js.native
  def ChartObjects(Index: String): ChartObject = js.native
  def ChartObjects(Index: Double): ChartObject = js.native
  def ChartObjects(Index: SafeArray[String | Double]): typings.activexExcel.Excel.ChartObjects = js.native
  
  var ChartStyle: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` | `24` | `25` | `26` | `27` | `28` | `29` | `30` | `31` | `32` | `33` | `34` | `35` | `36` | `37` | `38` | `39` | `40` | `41` | `42` | `43` | `44` | `45` | `46` | `47` | `48` = js.native
  
  val ChartTitle: typings.activexExcel.Excel.ChartTitle = js.native
  
  var ChartType: XlChartType = js.native
  
  def ChartWizard(
    Source: js.UndefOr[Range],
    Gallery: js.UndefOr[XlChartType],
    Format: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`],
    PlotBy: js.UndefOr[XlRowCol],
    CategoryLabels: js.UndefOr[Double],
    SeriesLabels: js.UndefOr[Double],
    HasLegend: js.UndefOr[Boolean],
    Title: js.UndefOr[String],
    CategoryTitle: js.UndefOr[String],
    ValueTitle: js.UndefOr[String],
    ExtraTitle: js.UndefOr[String]
  ): Unit = js.native
  
  def CheckBoxes(): Any = js.native
  def CheckBoxes(Index: Any): Any = js.native
  
  def CheckSpelling(): Unit = js.native
  def CheckSpelling(CustomDictionary: String): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(
    CustomDictionary: String,
    IgnoreUppercase: Boolean,
    AlwaysSuggest: Boolean,
    SpellLang: MsoLanguageID
  ): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Boolean): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Unit = js.native
  
  def ClearToMatchStyle(): Unit = js.native
  
  val CodeName: String = js.native
  
  val Column3DGroup: ChartGroup = js.native
  
  def ColumnGroups(): Any = js.native
  def ColumnGroups(Index: Any): Any = js.native
  
  def Copy(): Unit = js.native
  def Copy(Before: Unit, After: Sheet): Unit = js.native
  def Copy(Before: Sheet): Unit = js.native
  
  def CopyChartBuild(): Unit = js.native
  
  /**
    * @param Appearance [Appearance=1]
    * @param Format [Format=-4147]
    * @param Size [Size=2]
    */
  def CopyPicture(): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: Unit, Size: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: XlCopyPictureFormat): Unit = js.native
  def CopyPicture(Appearance: Unit, Format: XlCopyPictureFormat, Size: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: Unit, Size: XlPictureAppearance): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): Unit = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat, Size: XlPictureAppearance): Unit = js.native
  
  val Corners: typings.activexExcel.Excel.Corners = js.native
  
  /**
    * @param Appearance [Appearance=1]
    * @param Size [Size=1]
    */
  def CreatePublisher(
    Edition: Any,
    Appearance: js.UndefOr[XlPictureAppearance],
    Size: js.UndefOr[XlPictureAppearance],
    ContainsPICT: js.UndefOr[Any],
    ContainsBIFF: js.UndefOr[Any],
    ContainsRTF: js.UndefOr[Any],
    ContainsVALU: js.UndefOr[Any]
  ): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  val DataTable: typings.activexExcel.Excel.DataTable = js.native
  
  def Delete(): Unit = js.native
  
  var DepthPercent: Double = js.native
  
  def Deselect(): Unit = js.native
  
  var DisplayBlanksAs: XlDisplayBlanksAs = js.native
  
  def DoughnutGroups(): Any = js.native
  def DoughnutGroups(Index: Any): Any = js.native
  
  def DrawingObjects(): Any = js.native
  def DrawingObjects(Index: Any): Any = js.native
  
  def Drawings(): Any = js.native
  def Drawings(Index: Any): Any = js.native
  
  def DropDowns(): Any = js.native
  def DropDowns(Index: Any): Any = js.native
  
  var Dummy24: Boolean = js.native
  
  var Dummy25: Boolean = js.native
  
  var Elevation: Double = js.native
  
  def Evaluate(Name: String): Any = js.native
  
  /* private */ @JSName("Excel.Chart_typekey")
  var ExcelDotChart_typekey: Chart = js.native
  
  def Export(Filename: String): Boolean = js.native
  def Export(Filename: String, FilterName: String): Boolean = js.native
  def Export(Filename: String, FilterName: String, Interactive: Boolean): Boolean = js.native
  def Export(Filename: String, FilterName: Unit, Interactive: Boolean): Boolean = js.native
  
  def ExportAsFixedFormat(
    Type: XlFixedFormatType,
    Filename: js.UndefOr[String],
    Quality: js.UndefOr[XlFixedFormatQuality],
    IncludeDocProperties: js.UndefOr[Boolean],
    IgnorePrintAreas: js.UndefOr[Boolean],
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    OpenAfterPublish: js.UndefOr[Boolean],
    FixedFormatExtClassPtr: js.UndefOr[Any]
  ): Unit = js.native
  
  val Floor: typings.activexExcel.Excel.Floor = js.native
  
  var GapDepth: Double = js.native
  
  def GetChartElement(x: Double, y: Double, ElementID: Double, Arg1: Double, Arg2: Double): Unit = js.native
  
  def GroupBoxes(): Any = js.native
  def GroupBoxes(Index: Any): Any = js.native
  
  def GroupObjects(): Any = js.native
  def GroupObjects(Index: Any): Any = js.native
  
  def HasAxis(): Boolean = js.native
  def HasAxis(Index1: Unit, Index2: XlAxisGroup): Boolean = js.native
  def HasAxis(Index1: XlAxisType): Boolean = js.native
  def HasAxis(Index1: XlAxisType, Index2: XlAxisGroup): Boolean = js.native
  
  var HasDataTable: Boolean = js.native
  
  var HasLegend: Boolean = js.native
  
  var HasPivotFields: Boolean = js.native
  
  var HasTitle: Boolean = js.native
  
  var HeightPercent: Double = js.native
  
  def Hyperlinks(Index: String): Hyperlink = js.native
  def Hyperlinks(Index: Double): Hyperlink = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  
  val Index: Double = js.native
  
  def Labels(): Any = js.native
  def Labels(Index: Any): Any = js.native
  
  val Legend: typings.activexExcel.Excel.Legend = js.native
  
  val Line3DGroup: ChartGroup = js.native
  
  def LineGroups(): Any = js.native
  def LineGroups(Index: Any): Any = js.native
  
  def Lines(): Any = js.native
  def Lines(Index: Any): Any = js.native
  
  def ListBoxes(): Any = js.native
  def ListBoxes(Index: Any): Any = js.native
  
  def Location(Where: XlChartLocation): Chart = js.native
  def Location(Where: XlChartLocation, Name: String): Chart = js.native
  @JSName("Location")
  def Location_2(Where: `2`, Name: String): Chart = js.native
  
  val MailEnvelope: MsoEnvelope = js.native
  
  def Move(): Unit = js.native
  def Move(Before: Unit, After: Sheet): Unit = js.native
  def Move(Before: Sheet): Unit = js.native
  def Move(Before: Sheet, After: Sheet): Unit = js.native
  
  var Name: String = js.native
  
  val Next: Sheet = js.native
  
  def OLEObjects(): typings.activexExcel.Excel.OLEObjects = js.native
  def OLEObjects(Index: String): OLEObject = js.native
  def OLEObjects(Index: Double): OLEObject = js.native
  
  var OnDoubleClick: String = js.native
  
  var OnSheetActivate: String = js.native
  
  var OnSheetDeactivate: String = js.native
  
  def OptionButtons(): Any = js.native
  def OptionButtons(Index: Any): Any = js.native
  
  def Ovals(): Any = js.native
  def Ovals(Index: Any): Any = js.native
  
  val PageSetup: typings.activexExcel.Excel.PageSetup = js.native
  
  val Parent: Any = js.native
  
  def Paste(): Unit = js.native
  def Paste(Type: `-4104` | `-4122` | `-4123`): Unit = js.native
  
  var Perspective: Double = js.native
  
  def Pictures(): Any = js.native
  def Pictures(Index: Any): Any = js.native
  
  val Pie3DGroup: ChartGroup = js.native
  
  def PieGroups(): Any = js.native
  def PieGroups(Index: Any): Any = js.native
  
  val PivotLayout: typings.activexExcel.Excel.PivotLayout = js.native
  
  val PlotArea: typings.activexExcel.Excel.PlotArea = js.native
  
  var PlotBy: XlRowCol = js.native
  
  var PlotVisibleOnly: Boolean = js.native
  
  val Previous: Sheet = js.native
  
  def PrintOut[T /* <: js.UndefOr[Boolean] */](
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Copies: js.UndefOr[Double],
    Preview: js.UndefOr[Boolean],
    ActivePrinter: js.UndefOr[String],
    PrintToFile: js.UndefOr[T],
    Collate: js.UndefOr[Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[T]]
  ): Any = js.native
  
  def PrintPreview(): Unit = js.native
  def PrintPreview(EnableChanges: Boolean): Unit = js.native
  
  val PrintedCommentPages: Double = js.native
  
  /** @param Scenarios Passing `true` for this argument is only valid on worksheets */
  def Protect(): Unit = js.native
  def Protect(Password: String): Unit = js.native
  def Protect(Password: String, DrawingObjects: Boolean): Unit = js.native
  def Protect(Password: String, DrawingObjects: Boolean, Contents: Boolean): Unit = js.native
  def Protect(
    Password: String,
    DrawingObjects: Boolean,
    Contents: Boolean,
    Scenarios: Unit,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  def Protect(
    Password: String,
    DrawingObjects: Boolean,
    Contents: Unit,
    Scenarios: Unit,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  def Protect(Password: String, DrawingObjects: Unit, Contents: Boolean): Unit = js.native
  def Protect(
    Password: String,
    DrawingObjects: Unit,
    Contents: Boolean,
    Scenarios: Unit,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  def Protect(
    Password: String,
    DrawingObjects: Unit,
    Contents: Unit,
    Scenarios: Unit,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Boolean): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Boolean, Contents: Boolean): Unit = js.native
  def Protect(
    Password: Unit,
    DrawingObjects: Boolean,
    Contents: Boolean,
    Scenarios: Unit,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  def Protect(
    Password: Unit,
    DrawingObjects: Boolean,
    Contents: Unit,
    Scenarios: Unit,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Boolean): Unit = js.native
  def Protect(
    Password: Unit,
    DrawingObjects: Unit,
    Contents: Boolean,
    Scenarios: Unit,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  def Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Boolean): Unit = js.native
  
  val ProtectContents: Boolean = js.native
  
  var ProtectData: Boolean = js.native
  
  val ProtectDrawingObjects: Boolean = js.native
  
  var ProtectFormatting: Boolean = js.native
  
  var ProtectGoalSeek: Boolean = js.native
  
  var ProtectSelection: Boolean = js.native
  
  @JSName("Protect")
  def Protect_false(Password: String, DrawingObjects: Boolean, Contents: Boolean, Scenarios: `false`): Unit = js.native
  @JSName("Protect")
  def Protect_false(
    Password: String,
    DrawingObjects: Boolean,
    Contents: Boolean,
    Scenarios: `false`,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  @JSName("Protect")
  def Protect_false(Password: String, DrawingObjects: Boolean, Contents: Unit, Scenarios: `false`): Unit = js.native
  @JSName("Protect")
  def Protect_false(
    Password: String,
    DrawingObjects: Boolean,
    Contents: Unit,
    Scenarios: `false`,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  @JSName("Protect")
  def Protect_false(Password: String, DrawingObjects: Unit, Contents: Boolean, Scenarios: `false`): Unit = js.native
  @JSName("Protect")
  def Protect_false(
    Password: String,
    DrawingObjects: Unit,
    Contents: Boolean,
    Scenarios: `false`,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  @JSName("Protect")
  def Protect_false(Password: String, DrawingObjects: Unit, Contents: Unit, Scenarios: `false`): Unit = js.native
  @JSName("Protect")
  def Protect_false(
    Password: String,
    DrawingObjects: Unit,
    Contents: Unit,
    Scenarios: `false`,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  @JSName("Protect")
  def Protect_false(Password: Unit, DrawingObjects: Boolean, Contents: Boolean, Scenarios: `false`): Unit = js.native
  @JSName("Protect")
  def Protect_false(
    Password: Unit,
    DrawingObjects: Boolean,
    Contents: Boolean,
    Scenarios: `false`,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  @JSName("Protect")
  def Protect_false(Password: Unit, DrawingObjects: Boolean, Contents: Unit, Scenarios: `false`): Unit = js.native
  @JSName("Protect")
  def Protect_false(
    Password: Unit,
    DrawingObjects: Boolean,
    Contents: Unit,
    Scenarios: `false`,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  @JSName("Protect")
  def Protect_false(Password: Unit, DrawingObjects: Unit, Contents: Boolean, Scenarios: `false`): Unit = js.native
  @JSName("Protect")
  def Protect_false(
    Password: Unit,
    DrawingObjects: Unit,
    Contents: Boolean,
    Scenarios: `false`,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  @JSName("Protect")
  def Protect_false(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: `false`): Unit = js.native
  @JSName("Protect")
  def Protect_false(
    Password: Unit,
    DrawingObjects: Unit,
    Contents: Unit,
    Scenarios: `false`,
    UserInterfaceOnly: Boolean
  ): Unit = js.native
  
  val ProtectionMode: Boolean = js.native
  
  def RadarGroups(): Any = js.native
  def RadarGroups(Index: Any): Any = js.native
  
  def Rectangles(): Any = js.native
  def Rectangles(Index: Any): Any = js.native
  
  def Refresh(): Unit = js.native
  
  /** `true` if the chart axes are at right angles, independent of chart rotation or elevation. Applies only to 3-D line, column, and bar charts. */
  var RightAngleAxes: Boolean = js.native
  
  var Rotation: Double = js.native
  
  def SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[XlFileFormat],
    Password: js.UndefOr[String],
    WriteResPassword: js.UndefOr[String],
    ReadOnlyRecommended: js.UndefOr[Boolean],
    CreateBackup: js.UndefOr[Boolean],
    AddToMru: js.UndefOr[Boolean],
    TextCodepage: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any],
    Local: js.UndefOr[Any]
  ): Unit = js.native
  
  def SaveChartTemplate(Filename: String): Unit = js.native
  
  def Scripts(Index: Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  def ScrollBars(): Any = js.native
  def ScrollBars(Index: Any): Any = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: Boolean): Unit = js.native
  
  def SeriesCollection(): typings.activexExcel.Excel.SeriesCollection | Series = js.native
  def SeriesCollection(Index: String): typings.activexExcel.Excel.SeriesCollection | Series = js.native
  def SeriesCollection(Index: Double): typings.activexExcel.Excel.SeriesCollection | Series = js.native
  
  def SetBackgroundPicture(Filename: String): Unit = js.native
  
  def SetDefaultChart(Name: Any): Unit = js.native
  
  def SetElement(Element: MsoChartElementType): Unit = js.native
  
  def SetSourceData(Source: Range): Unit = js.native
  def SetSourceData(Source: Range, PlotBy: XlRowCol): Unit = js.native
  
  def Shapes(Index: String): Shape = js.native
  def Shapes(Index: Double): Shape = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  
  var ShowAllFieldButtons: Boolean = js.native
  
  var ShowAxisFieldButtons: Boolean = js.native
  
  var ShowDataLabelsOverMaximum: Boolean = js.native
  
  var ShowLegendFieldButtons: Boolean = js.native
  
  var ShowReportFilterFieldButtons: Boolean = js.native
  
  var ShowValueFieldButtons: Boolean = js.native
  
  var ShowWindow: Boolean = js.native
  
  val SideWall: typings.activexExcel.Excel.Walls = js.native
  
  var SizeWithWindow: Boolean = js.native
  
  def Spinners(): Any = js.native
  def Spinners(Index: Any): Any = js.native
  
  var SubType: Double = js.native
  
  val SurfaceGroup: ChartGroup = js.native
  
  val Tab: typings.activexExcel.Excel.Tab = js.native
  
  def TextBoxes(): Any = js.native
  def TextBoxes(Index: Any): Any = js.native
  
  var Type: Double = js.native
  
  def Unprotect(): Unit = js.native
  def Unprotect(Password: String): Unit = js.native
  
  var Visible: XlSheetVisibility = js.native
  
  val Walls: typings.activexExcel.Excel.Walls = js.native
  
  var WallsAndGridlines2D: Boolean = js.native
  
  def XYGroups(): Any = js.native
  def XYGroups(Index: Any): Any = js.native
  
  /** @param Type [Type=2] */
  def _ApplyDataLabels(): Unit = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Any, AutoText: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Any, AutoText: Any, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Any, AutoText: Unit, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Unit, AutoText: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Unit, AutoText: Any, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: Unit, LegendKey: Unit, AutoText: Unit, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Any, AutoText: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Any, AutoText: Any, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Any, AutoText: Unit, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Unit, AutoText: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Unit, AutoText: Any, HasLeaderLines: Any): Unit = js.native
  def _ApplyDataLabels(Type: XlDataLabelsType, LegendKey: Unit, AutoText: Unit, HasLeaderLines: Any): Unit = js.native
  
  var _CodeName: String = js.native
  
  def _Evaluate(Name: Any): Any = js.native
  
  def _PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    PrToFileName: js.UndefOr[Any]
  ): Unit = js.native
  
  def _Protect(): Unit = js.native
  def _Protect(Password: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Any, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Any, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Any, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Any, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Any, UserInterfaceOnly: Any): Unit = js.native
  def _Protect(Password: Unit, DrawingObjects: Unit, Contents: Unit, Scenarios: Unit, UserInterfaceOnly: Any): Unit = js.native
  
  def _SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    WriteResPassword: js.UndefOr[Any],
    ReadOnlyRecommended: js.UndefOr[Any],
    CreateBackup: js.UndefOr[Any],
    AddToMru: js.UndefOr[Any],
    TextCodepage: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any]
  ): Unit = js.native
  
  def __PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any]
  ): Unit = js.native
}
