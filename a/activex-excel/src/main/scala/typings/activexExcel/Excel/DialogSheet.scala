package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoEnvelope
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogSheet
  extends StObject
     with AddSheetResult[Any]
     with Sheet {
  
  def Activate(): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Arcs(): Any = js.native
  def Arcs(Index: Any): Any = js.native
  
  val AutoFilter: typings.activexExcel.Excel.AutoFilter = js.native
  
  def Buttons(): Any = js.native
  def Buttons(Index: Any): Any = js.native
  
  def ChartObjects(): Any = js.native
  def ChartObjects(Index: Any): Any = js.native
  
  def CheckBoxes(): Any = js.native
  def CheckBoxes(Index: Any): Any = js.native
  
  def CheckSpelling(): Unit = js.native
  def CheckSpelling(CustomDictionary: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Any, AlwaysSuggest: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Any, AlwaysSuggest: Any, SpellLang: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Any, AlwaysSuggest: Unit, SpellLang: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Unit, AlwaysSuggest: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Unit, AlwaysSuggest: Any, SpellLang: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Any, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Any, AlwaysSuggest: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Any, AlwaysSuggest: Any, SpellLang: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Any, AlwaysSuggest: Unit, SpellLang: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Any, SpellLang: Any): Unit = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: Any): Unit = js.native
  
  def CircleInvalid(): Unit = js.native
  
  def ClearCircles(): Unit = js.native
  
  val CodeName: String = js.native
  
  def Comments(Index: Double): Comment = js.native
  @JSName("Comments")
  val Comments_Original: Comments = js.native
  
  def Copy(): Unit = js.native
  def Copy(Before: Unit, After: Sheet): Unit = js.native
  def Copy(Before: Sheet): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  def CustomProperties(Index: String): CustomProperty = js.native
  def CustomProperties(Index: Double): CustomProperty = js.native
  @JSName("CustomProperties")
  val CustomProperties_Original: CustomProperties = js.native
  
  var DefaultButton: Any = js.native
  
  def Delete(): Unit = js.native
  
  val DialogFrame: typings.activexExcel.Excel.DialogFrame = js.native
  
  var DisplayAutomaticPageBreaks: Boolean = js.native
  
  var DisplayPageBreaks: Boolean = js.native
  
  var DisplayRightToLeft: Boolean = js.native
  
  def DrawingObjects(): Any = js.native
  def DrawingObjects(Index: Any): Any = js.native
  
  def Drawings(): Any = js.native
  def Drawings(Index: Any): Any = js.native
  
  def DropDowns(): Any = js.native
  def DropDowns(Index: Any): Any = js.native
  
  def EditBoxes(): Any = js.native
  def EditBoxes(Index: Any): Any = js.native
  
  var EnableAutoFilter: Boolean = js.native
  
  var EnableCalculation: Boolean = js.native
  
  var EnableFormatConditionsCalculation: Boolean = js.native
  
  var EnableOutlining: Boolean = js.native
  
  var EnablePivotTable: Boolean = js.native
  
  var EnableSelection: XlEnableSelection = js.native
  
  def Evaluate(Name: Any): Any = js.native
  
  /* private */ @JSName("Excel.DialogSheet_typekey")
  var ExcelDotDialogSheet_typekey: DialogSheet = js.native
  
  def ExportAsFixedFormat(
    Type: XlFixedFormatType,
    Filename: js.UndefOr[Any],
    Quality: js.UndefOr[Any],
    IncludeDocProperties: js.UndefOr[Any],
    IgnorePrintAreas: js.UndefOr[Any],
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    OpenAfterPublish: js.UndefOr[Any],
    FixedFormatExtClassPtr: js.UndefOr[Any]
  ): Unit = js.native
  
  var Focus: Any = js.native
  
  def GroupBoxes(): Any = js.native
  def GroupBoxes(Index: Any): Any = js.native
  
  def GroupObjects(): Any = js.native
  def GroupObjects(Index: Any): Any = js.native
  
  def HPageBreaks(Index: Double): HPageBreak = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  
  def Hide(): Boolean = js.native
  def Hide(Cancel: Any): Boolean = js.native
  
  def Hyperlinks(Index: String): Hyperlink = js.native
  def Hyperlinks(Index: Double): Hyperlink = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  
  val Index: Double = js.native
  
  def Labels(): Any = js.native
  def Labels(Index: Any): Any = js.native
  
  def Lines(): Any = js.native
  def Lines(Index: Any): Any = js.native
  
  def ListBoxes(): Any = js.native
  def ListBoxes(Index: Any): Any = js.native
  
  val MailEnvelope: MsoEnvelope = js.native
  
  def Move(): Unit = js.native
  def Move(Before: Unit, After: Sheet): Unit = js.native
  def Move(Before: Sheet): Unit = js.native
  def Move(Before: Sheet, After: Sheet): Unit = js.native
  
  var Name: String = js.native
  
  def Names(Index: String): Name = js.native
  def Names(Index: Double): Name = js.native
  def Names(Index: Unit, IndexLocal: String): Name = js.native
  def Names(Index: Unit, IndexLocal: Unit, RefersTo: String): Name = js.native
  @JSName("Names")
  val Names_Original: Names = js.native
  
  val Next: Any = js.native
  
  def OLEObjects(): Any = js.native
  def OLEObjects(Index: Any): Any = js.native
  
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
  def Paste(Destination: Any): Unit = js.native
  def Paste(Destination: Any, Link: Any): Unit = js.native
  def Paste(Destination: Unit, Link: Any): Unit = js.native
  
  def PasteSpecial(
    Format: js.UndefOr[Any],
    Link: js.UndefOr[Any],
    DisplayAsIcon: js.UndefOr[Any],
    IconFileName: js.UndefOr[Any],
    IconIndex: js.UndefOr[Any],
    IconLabel: js.UndefOr[Any],
    NoHTMLFormatting: js.UndefOr[Any]
  ): Unit = js.native
  
  def Pictures(): Any = js.native
  def Pictures(Index: Any): Any = js.native
  
  val Previous: Any = js.native
  
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
  def PrintPreview(EnableChanges: Any): Unit = js.native
  
  val PrintedCommentPages: Double = js.native
  
  def Protect(
    Password: js.UndefOr[Any],
    DrawingObjects: js.UndefOr[Any],
    Contents: js.UndefOr[Any],
    Scenarios: js.UndefOr[Any],
    UserInterfaceOnly: js.UndefOr[Any],
    AllowFormattingCells: js.UndefOr[Any],
    AllowFormattingColumns: js.UndefOr[Any],
    AllowFormattingRows: js.UndefOr[Any],
    AllowInsertingColumns: js.UndefOr[Any],
    AllowInsertingRows: js.UndefOr[Any],
    AllowInsertingHyperlinks: js.UndefOr[Any],
    AllowDeletingColumns: js.UndefOr[Any],
    AllowDeletingRows: js.UndefOr[Any],
    AllowSorting: js.UndefOr[Any],
    AllowFiltering: js.UndefOr[Any],
    AllowUsingPivotTables: js.UndefOr[Any]
  ): Unit = js.native
  
  val ProtectContents: Boolean = js.native
  
  val ProtectDrawingObjects: Boolean = js.native
  
  val ProtectScenarios: Boolean = js.native
  
  val Protection: typings.activexExcel.Excel.Protection = js.native
  
  val ProtectionMode: Boolean = js.native
  
  def QueryTables(Index: String): QueryTable = js.native
  def QueryTables(Index: Double): QueryTable = js.native
  @JSName("QueryTables")
  val QueryTables_Original: QueryTables = js.native
  
  def Rectangles(): Any = js.native
  def Rectangles(Index: Any): Any = js.native
  
  def ResetAllPageBreaks(): Unit = js.native
  
  def SaveAs(
    Filename: String,
    FileFormat: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    WriteResPassword: js.UndefOr[Any],
    ReadOnlyRecommended: js.UndefOr[Any],
    CreateBackup: js.UndefOr[Any],
    AddToMru: js.UndefOr[Any],
    TextCodepage: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any],
    Local: js.UndefOr[Any]
  ): Unit = js.native
  
  def Scripts(Index: Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  var ScrollArea: String = js.native
  
  def ScrollBars(): Any = js.native
  def ScrollBars(Index: Any): Any = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: Any): Unit = js.native
  
  def Shapes(Index: String): Shape = js.native
  def Shapes(Index: Double): Shape = js.native
  @JSName("Shapes")
  val Shapes_Original: Shapes = js.native
  
  def Show(): Boolean = js.native
  
  def SmartTags(Index: Any): SmartTag = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  
  val Sort: typings.activexExcel.Excel.Sort = js.native
  
  def Spinners(): Any = js.native
  def Spinners(Index: Any): Any = js.native
  
  val Tab: typings.activexExcel.Excel.Tab = js.native
  
  def TextBoxes(): Any = js.native
  def TextBoxes(Index: Any): Any = js.native
  
  def Unprotect(): Unit = js.native
  def Unprotect(Password: Any): Unit = js.native
  
  def VPageBreaks(Index: Double): VPageBreak = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  
  var Visible: XlSheetVisibility = js.native
  
  def _CheckSpelling(
    CustomDictionary: js.UndefOr[Any],
    IgnoreUppercase: js.UndefOr[Any],
    AlwaysSuggest: js.UndefOr[Any],
    SpellLang: js.UndefOr[Any],
    IgnoreFinalYaa: js.UndefOr[Any],
    SpellScript: js.UndefOr[Any]
  ): Unit = js.native
  
  var _CodeName: String = js.native
  
  var _DisplayRightToLeft: Double = js.native
  
  def _Evaluate(Name: Any): Any = js.native
  
  def _PasteSpecial(
    Format: js.UndefOr[Any],
    Link: js.UndefOr[Any],
    DisplayAsIcon: js.UndefOr[Any],
    IconFileName: js.UndefOr[Any],
    IconIndex: js.UndefOr[Any],
    IconLabel: js.UndefOr[Any]
  ): Unit = js.native
  
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
