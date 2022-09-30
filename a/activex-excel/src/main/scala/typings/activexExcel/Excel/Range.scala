package typings.activexExcel.Excel

import typings.activexAdodb.ADODB.Recordset
import typings.activexExcel.activexExcelBooleans.`false`
import typings.activexExcel.activexExcelInts.`-4123`
import typings.activexExcel.activexExcelInts.`0`
import typings.activexExcel.activexExcelInts.`10`
import typings.activexExcel.activexExcelInts.`11`
import typings.activexExcel.activexExcelInts.`12`
import typings.activexExcel.activexExcelInts.`13`
import typings.activexExcel.activexExcelInts.`14`
import typings.activexExcel.activexExcelInts.`15`
import typings.activexExcel.activexExcelInts.`1`
import typings.activexExcel.activexExcelInts.`2`
import typings.activexExcel.activexExcelInts.`3`
import typings.activexExcel.activexExcelInts.`4`
import typings.activexExcel.activexExcelInts.`5`
import typings.activexExcel.activexExcelInts.`6`
import typings.activexExcel.activexExcelInts.`7`
import typings.activexExcel.activexExcelInts.`8`
import typings.activexExcel.activexExcelInts.`9`
import typings.activexExcel.activexExcelStrings.Quotationmark
import typings.activexExcel.activexExcelStrings.^
import typings.activexExcel.activexExcelStrings._empty
import typings.activexOffice.Office.MsoLanguageID
import typings.std.Exclude
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends StObject {
  
  def apply(Address: String): Range = js.native
  def apply(RowIndex: Double): Range = js.native
  def apply(RowIndex: Double, ColumnIndex: Double): Range = js.native
  
  def Activate(): Any = js.native
  
  def AddComment(): typings.activexExcel.Excel.Comment = js.native
  def AddComment(Text: String): typings.activexExcel.Excel.Comment = js.native
  
  var AddIndent: Boolean = js.native
  
  /** @param ReferenceStyle [ReferenceStyle=1] */
  def Address(): String = js.native
  def Address(RowAbsolute: Boolean): String = js.native
  def Address(RowAbsolute: Boolean, ColumnAbsolute: Boolean): String = js.native
  def Address(RowAbsolute: Boolean, ColumnAbsolute: Boolean, ReferenceStyle: Unit, External: Boolean): String = js.native
  def Address(
    RowAbsolute: Boolean,
    ColumnAbsolute: Boolean,
    ReferenceStyle: Unit,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def Address(
    RowAbsolute: Boolean,
    ColumnAbsolute: Boolean,
    ReferenceStyle: Unit,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def Address(RowAbsolute: Boolean, ColumnAbsolute: Boolean, ReferenceStyle: XlReferenceStyle): String = js.native
  def Address(RowAbsolute: Boolean, ColumnAbsolute: Boolean, ReferenceStyle: XlReferenceStyle, External: Boolean): String = js.native
  def Address(
    RowAbsolute: Boolean,
    ColumnAbsolute: Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def Address(
    RowAbsolute: Boolean,
    ColumnAbsolute: Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def Address(RowAbsolute: Boolean, ColumnAbsolute: Unit, ReferenceStyle: Unit, External: Boolean): String = js.native
  def Address(
    RowAbsolute: Boolean,
    ColumnAbsolute: Unit,
    ReferenceStyle: Unit,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def Address(
    RowAbsolute: Boolean,
    ColumnAbsolute: Unit,
    ReferenceStyle: Unit,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def Address(RowAbsolute: Boolean, ColumnAbsolute: Unit, ReferenceStyle: XlReferenceStyle): String = js.native
  def Address(RowAbsolute: Boolean, ColumnAbsolute: Unit, ReferenceStyle: XlReferenceStyle, External: Boolean): String = js.native
  def Address(
    RowAbsolute: Boolean,
    ColumnAbsolute: Unit,
    ReferenceStyle: XlReferenceStyle,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def Address(
    RowAbsolute: Boolean,
    ColumnAbsolute: Unit,
    ReferenceStyle: XlReferenceStyle,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def Address(RowAbsolute: Unit, ColumnAbsolute: Boolean): String = js.native
  def Address(RowAbsolute: Unit, ColumnAbsolute: Boolean, ReferenceStyle: Unit, External: Boolean): String = js.native
  def Address(
    RowAbsolute: Unit,
    ColumnAbsolute: Boolean,
    ReferenceStyle: Unit,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def Address(
    RowAbsolute: Unit,
    ColumnAbsolute: Boolean,
    ReferenceStyle: Unit,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def Address(RowAbsolute: Unit, ColumnAbsolute: Boolean, ReferenceStyle: XlReferenceStyle): String = js.native
  def Address(RowAbsolute: Unit, ColumnAbsolute: Boolean, ReferenceStyle: XlReferenceStyle, External: Boolean): String = js.native
  def Address(
    RowAbsolute: Unit,
    ColumnAbsolute: Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def Address(
    RowAbsolute: Unit,
    ColumnAbsolute: Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def Address(RowAbsolute: Unit, ColumnAbsolute: Unit, ReferenceStyle: Unit, External: Boolean): String = js.native
  def Address(
    RowAbsolute: Unit,
    ColumnAbsolute: Unit,
    ReferenceStyle: Unit,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def Address(RowAbsolute: Unit, ColumnAbsolute: Unit, ReferenceStyle: Unit, External: Unit, RelativeTo: Range): String = js.native
  def Address(RowAbsolute: Unit, ColumnAbsolute: Unit, ReferenceStyle: XlReferenceStyle): String = js.native
  def Address(RowAbsolute: Unit, ColumnAbsolute: Unit, ReferenceStyle: XlReferenceStyle, External: Boolean): String = js.native
  def Address(
    RowAbsolute: Unit,
    ColumnAbsolute: Unit,
    ReferenceStyle: XlReferenceStyle,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def Address(
    RowAbsolute: Unit,
    ColumnAbsolute: Unit,
    ReferenceStyle: XlReferenceStyle,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  
  /** @param ReferenceStyle [ReferenceStyle=1] */
  def AddressLocal(): String = js.native
  def AddressLocal(RowAbsolute: Boolean): String = js.native
  def AddressLocal(RowAbsolute: Boolean, ColumnAbsolute: Boolean): String = js.native
  def AddressLocal(RowAbsolute: Boolean, ColumnAbsolute: Boolean, ReferenceStyle: Unit, External: Boolean): String = js.native
  def AddressLocal(
    RowAbsolute: Boolean,
    ColumnAbsolute: Boolean,
    ReferenceStyle: Unit,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(
    RowAbsolute: Boolean,
    ColumnAbsolute: Boolean,
    ReferenceStyle: Unit,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(RowAbsolute: Boolean, ColumnAbsolute: Boolean, ReferenceStyle: XlReferenceStyle): String = js.native
  def AddressLocal(RowAbsolute: Boolean, ColumnAbsolute: Boolean, ReferenceStyle: XlReferenceStyle, External: Boolean): String = js.native
  def AddressLocal(
    RowAbsolute: Boolean,
    ColumnAbsolute: Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(
    RowAbsolute: Boolean,
    ColumnAbsolute: Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(RowAbsolute: Boolean, ColumnAbsolute: Unit, ReferenceStyle: Unit, External: Boolean): String = js.native
  def AddressLocal(
    RowAbsolute: Boolean,
    ColumnAbsolute: Unit,
    ReferenceStyle: Unit,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(
    RowAbsolute: Boolean,
    ColumnAbsolute: Unit,
    ReferenceStyle: Unit,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(RowAbsolute: Boolean, ColumnAbsolute: Unit, ReferenceStyle: XlReferenceStyle): String = js.native
  def AddressLocal(RowAbsolute: Boolean, ColumnAbsolute: Unit, ReferenceStyle: XlReferenceStyle, External: Boolean): String = js.native
  def AddressLocal(
    RowAbsolute: Boolean,
    ColumnAbsolute: Unit,
    ReferenceStyle: XlReferenceStyle,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(
    RowAbsolute: Boolean,
    ColumnAbsolute: Unit,
    ReferenceStyle: XlReferenceStyle,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(RowAbsolute: Unit, ColumnAbsolute: Boolean): String = js.native
  def AddressLocal(RowAbsolute: Unit, ColumnAbsolute: Boolean, ReferenceStyle: Unit, External: Boolean): String = js.native
  def AddressLocal(
    RowAbsolute: Unit,
    ColumnAbsolute: Boolean,
    ReferenceStyle: Unit,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(
    RowAbsolute: Unit,
    ColumnAbsolute: Boolean,
    ReferenceStyle: Unit,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(RowAbsolute: Unit, ColumnAbsolute: Boolean, ReferenceStyle: XlReferenceStyle): String = js.native
  def AddressLocal(RowAbsolute: Unit, ColumnAbsolute: Boolean, ReferenceStyle: XlReferenceStyle, External: Boolean): String = js.native
  def AddressLocal(
    RowAbsolute: Unit,
    ColumnAbsolute: Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(
    RowAbsolute: Unit,
    ColumnAbsolute: Boolean,
    ReferenceStyle: XlReferenceStyle,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(RowAbsolute: Unit, ColumnAbsolute: Unit, ReferenceStyle: Unit, External: Boolean): String = js.native
  def AddressLocal(
    RowAbsolute: Unit,
    ColumnAbsolute: Unit,
    ReferenceStyle: Unit,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(RowAbsolute: Unit, ColumnAbsolute: Unit, ReferenceStyle: Unit, External: Unit, RelativeTo: Range): String = js.native
  def AddressLocal(RowAbsolute: Unit, ColumnAbsolute: Unit, ReferenceStyle: XlReferenceStyle): String = js.native
  def AddressLocal(RowAbsolute: Unit, ColumnAbsolute: Unit, ReferenceStyle: XlReferenceStyle, External: Boolean): String = js.native
  def AddressLocal(
    RowAbsolute: Unit,
    ColumnAbsolute: Unit,
    ReferenceStyle: XlReferenceStyle,
    External: Boolean,
    RelativeTo: Range
  ): String = js.native
  def AddressLocal(
    RowAbsolute: Unit,
    ColumnAbsolute: Unit,
    ReferenceStyle: XlReferenceStyle,
    External: Unit,
    RelativeTo: Range
  ): String = js.native
  
  def AdvancedFilter(Action: XlFilterAction): Any = js.native
  def AdvancedFilter(Action: XlFilterAction, CriteriaRange: Unit, CopyToRange: Unit, Unique: Boolean): Any = js.native
  def AdvancedFilter(Action: XlFilterAction, CriteriaRange: Range): Any = js.native
  def AdvancedFilter(Action: XlFilterAction, CriteriaRange: Range, CopyToRange: Unit, Unique: Boolean): Any = js.native
  @JSName("AdvancedFilter")
  def AdvancedFilter_2(Action: `2`): Any = js.native
  @JSName("AdvancedFilter")
  def AdvancedFilter_2(Action: `2`, CriteriaRange: Unit, CopyToRange: Unit, Unique: Boolean): Any = js.native
  @JSName("AdvancedFilter")
  def AdvancedFilter_2(Action: `2`, CriteriaRange: Unit, CopyToRange: Range): Any = js.native
  @JSName("AdvancedFilter")
  def AdvancedFilter_2(Action: `2`, CriteriaRange: Unit, CopyToRange: Range, Unique: Boolean): Any = js.native
  @JSName("AdvancedFilter")
  def AdvancedFilter_2(Action: `2`, CriteriaRange: Range): Any = js.native
  @JSName("AdvancedFilter")
  def AdvancedFilter_2(Action: `2`, CriteriaRange: Range, CopyToRange: Unit, Unique: Boolean): Any = js.native
  @JSName("AdvancedFilter")
  def AdvancedFilter_2(Action: `2`, CriteriaRange: Range, CopyToRange: Range): Any = js.native
  @JSName("AdvancedFilter")
  def AdvancedFilter_2(Action: `2`, CriteriaRange: Range, CopyToRange: Range, Unique: Boolean): Any = js.native
  
  def AllocateChanges(): Unit = js.native
  
  val AllowEdit: Boolean = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  /** @param Order [Order=1] */
  def ApplyNames(
    Names: js.UndefOr[SafeArray[String]],
    IgnoreRelativeAbsolute: js.UndefOr[Boolean],
    UseRowColumnNames: js.UndefOr[Boolean],
    OmitColumn: js.UndefOr[Boolean],
    OmitRow: js.UndefOr[Boolean],
    Order: js.UndefOr[XlApplyNamesOrder],
    AppendLast: js.UndefOr[Boolean]
  ): Any = js.native
  
  def ApplyOutlineStyles(): Any = js.native
  
  def Areas(Index: Double): Range = js.native
  @JSName("Areas")
  val Areas_Original: Areas = js.native
  
  def AutoComplete(String: String): String = js.native
  
  /** @param Type [Type=0] */
  def AutoFill(Destination: Range): Any = js.native
  def AutoFill(Destination: Range, Type: XlAutoFillType): Any = js.native
  
  /** @param Operator [Operator=1] */
  def AutoFilter(Field: Double, Criteria1: String): Any = js.native
  def AutoFilter(Field: Double, Criteria1: String, Operator: Unit, Criteria2: String): Any = js.native
  def AutoFilter(Field: Double, Criteria1: String, Operator: Unit, Criteria2: String, VisibleDropDown: Boolean): Any = js.native
  def AutoFilter(Field: Double, Criteria1: String, Operator: Unit, Criteria2: Unit, VisibleDropDown: Boolean): Any = js.native
  def AutoFilter(Field: Double, Criteria1: String, Operator: XlAutoFilterOperator): Any = js.native
  def AutoFilter(Field: Double, Criteria1: String, Operator: XlAutoFilterOperator, Criteria2: String): Any = js.native
  def AutoFilter(
    Field: Double,
    Criteria1: String,
    Operator: XlAutoFilterOperator,
    Criteria2: String,
    VisibleDropDown: Boolean
  ): Any = js.native
  def AutoFilter(
    Field: Double,
    Criteria1: String,
    Operator: XlAutoFilterOperator,
    Criteria2: Unit,
    VisibleDropDown: Boolean
  ): Any = js.native
  
  def AutoFit(): Any = js.native
  
  /** @param Format [Format=1] */
  def AutoFormat(
    Format: js.UndefOr[XlRangeAutoFormat],
    Number: js.UndefOr[Any],
    Font: js.UndefOr[Any],
    Alignment: js.UndefOr[Any],
    Border: js.UndefOr[Any],
    Pattern: js.UndefOr[Any],
    Width: js.UndefOr[Any]
  ): Any = js.native
  
  def AutoOutline(): Any = js.native
  
  /**
    * @param Weight [Weight=2]
    * @param ColorIndex [ColorIndex=-4105]
    */
  def BorderAround(): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: Unit, Color: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: Unit, Color: Double, ThemeColor: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: Unit, Color: Double, ThemeColor: XlThemeColor): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: Unit, Color: Unit, ThemeColor: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: Unit, Color: Unit, ThemeColor: XlThemeColor): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: XlColorIndex): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: XlColorIndex, Color: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: XlColorIndex, Color: Double, ThemeColor: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: XlColorIndex, Color: Double, ThemeColor: XlThemeColor): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: XlColorIndex, Color: Unit, ThemeColor: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: Unit, ColorIndex: XlColorIndex, Color: Unit, ThemeColor: XlThemeColor): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight, ColorIndex: Unit, Color: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight, ColorIndex: Unit, Color: Double, ThemeColor: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight, ColorIndex: Unit, Color: Double, ThemeColor: XlThemeColor): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight, ColorIndex: Unit, Color: Unit, ThemeColor: Double): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight, ColorIndex: Unit, Color: Unit, ThemeColor: XlThemeColor): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight, ColorIndex: XlColorIndex): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight, ColorIndex: XlColorIndex, Color: Double): Any = js.native
  def BorderAround(
    LineStyle: Unit,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: Double,
    ThemeColor: Double
  ): Any = js.native
  def BorderAround(
    LineStyle: Unit,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: Double,
    ThemeColor: XlThemeColor
  ): Any = js.native
  def BorderAround(LineStyle: Unit, Weight: XlBorderWeight, ColorIndex: XlColorIndex, Color: Unit, ThemeColor: Double): Any = js.native
  def BorderAround(
    LineStyle: Unit,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: Unit,
    ThemeColor: XlThemeColor
  ): Any = js.native
  def BorderAround(LineStyle: XlLineStyle): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: Unit, Color: Double): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: Unit, Color: Double, ThemeColor: Double): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: Unit, Color: Double, ThemeColor: XlThemeColor): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: Unit, Color: Unit, ThemeColor: Double): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: Unit, Color: Unit, ThemeColor: XlThemeColor): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: XlColorIndex): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: XlColorIndex, Color: Double): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: XlColorIndex, Color: Double, ThemeColor: Double): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: Unit,
    ColorIndex: XlColorIndex,
    Color: Double,
    ThemeColor: XlThemeColor
  ): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: Unit, ColorIndex: XlColorIndex, Color: Unit, ThemeColor: Double): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: Unit,
    ColorIndex: XlColorIndex,
    Color: Unit,
    ThemeColor: XlThemeColor
  ): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: XlBorderWeight): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: XlBorderWeight, ColorIndex: Unit, Color: Double): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: Unit,
    Color: Double,
    ThemeColor: Double
  ): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: Unit,
    Color: Double,
    ThemeColor: XlThemeColor
  ): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: XlBorderWeight, ColorIndex: Unit, Color: Unit, ThemeColor: Double): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: Unit,
    Color: Unit,
    ThemeColor: XlThemeColor
  ): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: XlBorderWeight, ColorIndex: XlColorIndex): Any = js.native
  def BorderAround(LineStyle: XlLineStyle, Weight: XlBorderWeight, ColorIndex: XlColorIndex, Color: Double): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: Double,
    ThemeColor: Double
  ): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: Double,
    ThemeColor: XlThemeColor
  ): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: Unit,
    ThemeColor: Double
  ): Any = js.native
  def BorderAround(
    LineStyle: XlLineStyle,
    Weight: XlBorderWeight,
    ColorIndex: XlColorIndex,
    Color: Unit,
    ThemeColor: XlThemeColor
  ): Any = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  
  def Calculate(): Any = js.native
  
  def CalculateRowMajorOrder(): Any = js.native
  
  def Cells(Address: String): Range = js.native
  def Cells(RowIndex: Double): Range = js.native
  def Cells(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Cells")
  val Cells_Original: Range = js.native
  
  def Characters(): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Unit, Length: Double): typings.activexExcel.Excel.Characters = js.native
  
  def CheckSpelling(): Any = js.native
  def CheckSpelling(CustomDictionary: String): Any = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean): Any = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean): Any = js.native
  def CheckSpelling(
    CustomDictionary: String,
    IgnoreUppercase: Boolean,
    AlwaysSuggest: Boolean,
    SpellLang: MsoLanguageID
  ): Any = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Boolean, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Any = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Boolean): Any = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Any = js.native
  def CheckSpelling(CustomDictionary: String, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Boolean, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Boolean): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Boolean, SpellLang: MsoLanguageID): Any = js.native
  def CheckSpelling(CustomDictionary: Unit, IgnoreUppercase: Unit, AlwaysSuggest: Unit, SpellLang: MsoLanguageID): Any = js.native
  
  def Clear(): Any = js.native
  
  def ClearComments(): Unit = js.native
  
  def ClearContents(): Any = js.native
  
  def ClearFormats(): Any = js.native
  
  def ClearHyperlinks(): Unit = js.native
  
  def ClearNotes(): Any = js.native
  
  def ClearOutline(): Any = js.native
  
  val Column: Double = js.native
  
  def ColumnDifferences(Comparison: Range): Range = js.native
  
  var ColumnWidth: Double | Null = js.native
  
  def Columns(Address: String): Range = js.native
  def Columns(RowIndex: Double): Range = js.native
  def Columns(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Columns")
  val Columns_Original: Range = js.native
  
  val Comment: typings.activexExcel.Excel.Comment = js.native
  
  def Consolidate(): Any = js.native
  def Consolidate(Sources: Unit, Function: Unit, TopRow: Boolean): Any = js.native
  def Consolidate(Sources: Unit, Function: Unit, TopRow: Boolean, LeftColumn: Boolean): Any = js.native
  def Consolidate(Sources: Unit, Function: Unit, TopRow: Boolean, LeftColumn: Boolean, CreateLinks: Boolean): Any = js.native
  def Consolidate(Sources: Unit, Function: Unit, TopRow: Boolean, LeftColumn: Unit, CreateLinks: Boolean): Any = js.native
  def Consolidate(Sources: Unit, Function: Unit, TopRow: Unit, LeftColumn: Boolean): Any = js.native
  def Consolidate(Sources: Unit, Function: Unit, TopRow: Unit, LeftColumn: Boolean, CreateLinks: Boolean): Any = js.native
  def Consolidate(Sources: Unit, Function: Unit, TopRow: Unit, LeftColumn: Unit, CreateLinks: Boolean): Any = js.native
  def Consolidate(Sources: Unit, Function: XlConsolidationFunction): Any = js.native
  def Consolidate(Sources: Unit, Function: XlConsolidationFunction, TopRow: Boolean): Any = js.native
  def Consolidate(Sources: Unit, Function: XlConsolidationFunction, TopRow: Boolean, LeftColumn: Boolean): Any = js.native
  def Consolidate(
    Sources: Unit,
    Function: XlConsolidationFunction,
    TopRow: Boolean,
    LeftColumn: Boolean,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(
    Sources: Unit,
    Function: XlConsolidationFunction,
    TopRow: Boolean,
    LeftColumn: Unit,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(Sources: Unit, Function: XlConsolidationFunction, TopRow: Unit, LeftColumn: Boolean): Any = js.native
  def Consolidate(
    Sources: Unit,
    Function: XlConsolidationFunction,
    TopRow: Unit,
    LeftColumn: Boolean,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(
    Sources: Unit,
    Function: XlConsolidationFunction,
    TopRow: Unit,
    LeftColumn: Unit,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(Sources: SafeArray[String]): Any = js.native
  def Consolidate(Sources: SafeArray[String], Function: Unit, TopRow: Boolean): Any = js.native
  def Consolidate(Sources: SafeArray[String], Function: Unit, TopRow: Boolean, LeftColumn: Boolean): Any = js.native
  def Consolidate(
    Sources: SafeArray[String],
    Function: Unit,
    TopRow: Boolean,
    LeftColumn: Boolean,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(
    Sources: SafeArray[String],
    Function: Unit,
    TopRow: Boolean,
    LeftColumn: Unit,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(Sources: SafeArray[String], Function: Unit, TopRow: Unit, LeftColumn: Boolean): Any = js.native
  def Consolidate(
    Sources: SafeArray[String],
    Function: Unit,
    TopRow: Unit,
    LeftColumn: Boolean,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(Sources: SafeArray[String], Function: Unit, TopRow: Unit, LeftColumn: Unit, CreateLinks: Boolean): Any = js.native
  def Consolidate(Sources: SafeArray[String], Function: XlConsolidationFunction): Any = js.native
  def Consolidate(Sources: SafeArray[String], Function: XlConsolidationFunction, TopRow: Boolean): Any = js.native
  def Consolidate(
    Sources: SafeArray[String],
    Function: XlConsolidationFunction,
    TopRow: Boolean,
    LeftColumn: Boolean
  ): Any = js.native
  def Consolidate(
    Sources: SafeArray[String],
    Function: XlConsolidationFunction,
    TopRow: Boolean,
    LeftColumn: Boolean,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(
    Sources: SafeArray[String],
    Function: XlConsolidationFunction,
    TopRow: Boolean,
    LeftColumn: Unit,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(Sources: SafeArray[String], Function: XlConsolidationFunction, TopRow: Unit, LeftColumn: Boolean): Any = js.native
  def Consolidate(
    Sources: SafeArray[String],
    Function: XlConsolidationFunction,
    TopRow: Unit,
    LeftColumn: Boolean,
    CreateLinks: Boolean
  ): Any = js.native
  def Consolidate(
    Sources: SafeArray[String],
    Function: XlConsolidationFunction,
    TopRow: Unit,
    LeftColumn: Unit,
    CreateLinks: Boolean
  ): Any = js.native
  
  def Copy(): Any = js.native
  def Copy(Destination: Range): Any = js.native
  
  def CopyFromRecordset(Data: Recordset): Double = js.native
  def CopyFromRecordset(Data: Recordset, MaxRows: Double): Double = js.native
  def CopyFromRecordset(Data: Recordset, MaxRows: Double, MaxColumns: Double): Double = js.native
  def CopyFromRecordset(Data: Recordset, MaxRows: Unit, MaxColumns: Double): Double = js.native
  def CopyFromRecordset(Data: typings.activexDao.DAO.Recordset): Double = js.native
  def CopyFromRecordset(Data: typings.activexDao.DAO.Recordset, MaxRows: Double): Double = js.native
  def CopyFromRecordset(Data: typings.activexDao.DAO.Recordset, MaxRows: Double, MaxColumns: Double): Double = js.native
  def CopyFromRecordset(Data: typings.activexDao.DAO.Recordset, MaxRows: Unit, MaxColumns: Double): Double = js.native
  
  /**
    * @param Appearance [Appearance=1]
    * @param Format [Format=-4147]
    */
  def CopyPicture(): Any = js.native
  def CopyPicture(Appearance: Unit, Format: XlCopyPictureFormat): Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance): Any = js.native
  def CopyPicture(Appearance: XlPictureAppearance, Format: XlCopyPictureFormat): Any = js.native
  
  val Count: Double = js.native
  
  val CountLarge: Double = js.native
  
  def CreateNames(): Any = js.native
  def CreateNames(Top: Boolean): Any = js.native
  def CreateNames(Top: Boolean, Left: Boolean): Any = js.native
  def CreateNames(Top: Boolean, Left: Boolean, Bottom: Boolean): Any = js.native
  def CreateNames(Top: Boolean, Left: Boolean, Bottom: Boolean, Right: Boolean): Any = js.native
  def CreateNames(Top: Boolean, Left: Boolean, Bottom: Unit, Right: Boolean): Any = js.native
  def CreateNames(Top: Boolean, Left: Unit, Bottom: Boolean): Any = js.native
  def CreateNames(Top: Boolean, Left: Unit, Bottom: Boolean, Right: Boolean): Any = js.native
  def CreateNames(Top: Boolean, Left: Unit, Bottom: Unit, Right: Boolean): Any = js.native
  def CreateNames(Top: Unit, Left: Boolean): Any = js.native
  def CreateNames(Top: Unit, Left: Boolean, Bottom: Boolean): Any = js.native
  def CreateNames(Top: Unit, Left: Boolean, Bottom: Boolean, Right: Boolean): Any = js.native
  def CreateNames(Top: Unit, Left: Boolean, Bottom: Unit, Right: Boolean): Any = js.native
  def CreateNames(Top: Unit, Left: Unit, Bottom: Boolean): Any = js.native
  def CreateNames(Top: Unit, Left: Unit, Bottom: Boolean, Right: Boolean): Any = js.native
  def CreateNames(Top: Unit, Left: Unit, Bottom: Unit, Right: Boolean): Any = js.native
  
  /** @param Appearance [Appearance=1] */
  def CreatePublisher(Edition: Any): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: Unit, ContainsPICT: Any): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: Unit, ContainsPICT: Any, ContainsBIFF: Any): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: Unit, ContainsPICT: Any, ContainsBIFF: Any, ContainsRTF: Any): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: Unit,
    ContainsPICT: Any,
    ContainsBIFF: Any,
    ContainsRTF: Any,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: Unit,
    ContainsPICT: Any,
    ContainsBIFF: Any,
    ContainsRTF: Unit,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: Unit, ContainsPICT: Any, ContainsBIFF: Unit, ContainsRTF: Any): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: Unit,
    ContainsPICT: Any,
    ContainsBIFF: Unit,
    ContainsRTF: Any,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: Unit,
    ContainsPICT: Any,
    ContainsBIFF: Unit,
    ContainsRTF: Unit,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: Unit, ContainsPICT: Unit, ContainsBIFF: Any): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: Unit, ContainsPICT: Unit, ContainsBIFF: Any, ContainsRTF: Any): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: Unit,
    ContainsPICT: Unit,
    ContainsBIFF: Any,
    ContainsRTF: Any,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: Unit,
    ContainsPICT: Unit,
    ContainsBIFF: Any,
    ContainsRTF: Unit,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: Unit, ContainsPICT: Unit, ContainsBIFF: Unit, ContainsRTF: Any): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: Unit,
    ContainsPICT: Unit,
    ContainsBIFF: Unit,
    ContainsRTF: Any,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: Unit,
    ContainsPICT: Unit,
    ContainsBIFF: Unit,
    ContainsRTF: Unit,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: XlPictureAppearance): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: XlPictureAppearance, ContainsPICT: Any): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: XlPictureAppearance, ContainsPICT: Any, ContainsBIFF: Any): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Any,
    ContainsBIFF: Any,
    ContainsRTF: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Any,
    ContainsBIFF: Any,
    ContainsRTF: Any,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Any,
    ContainsBIFF: Any,
    ContainsRTF: Unit,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Any,
    ContainsBIFF: Unit,
    ContainsRTF: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Any,
    ContainsBIFF: Unit,
    ContainsRTF: Any,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Any,
    ContainsBIFF: Unit,
    ContainsRTF: Unit,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(Edition: Any, Appearance: XlPictureAppearance, ContainsPICT: Unit, ContainsBIFF: Any): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Unit,
    ContainsBIFF: Any,
    ContainsRTF: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Unit,
    ContainsBIFF: Any,
    ContainsRTF: Any,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Unit,
    ContainsBIFF: Any,
    ContainsRTF: Unit,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Unit,
    ContainsBIFF: Unit,
    ContainsRTF: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Unit,
    ContainsBIFF: Unit,
    ContainsRTF: Any,
    ContainsVALU: Any
  ): Any = js.native
  def CreatePublisher(
    Edition: Any,
    Appearance: XlPictureAppearance,
    ContainsPICT: Unit,
    ContainsBIFF: Unit,
    ContainsRTF: Unit,
    ContainsVALU: Any
  ): Any = js.native
  
  val Creator: XlCreator = js.native
  
  def CurrentArray(Address: String): Range = js.native
  def CurrentArray(RowIndex: Double): Range = js.native
  def CurrentArray(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("CurrentArray")
  val CurrentArray_Original: Range = js.native
  
  def CurrentRegion(Address: String): Range = js.native
  def CurrentRegion(RowIndex: Double): Range = js.native
  def CurrentRegion(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("CurrentRegion")
  val CurrentRegion_Original: Range = js.native
  
  def Cut(): Any = js.native
  def Cut(Destination: Range): Any = js.native
  
  /**
    * @param Type [Type=-4132]
    * @param Date [Date=1]
    * @param Step [Step=1]
    */
  def DataSeries(Rowcol: XlRowCol): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: Unit, Step: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: Unit, Step: Double, Stop: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: Unit, Step: Double, Stop: Double, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: Unit, Step: Double, Stop: Unit, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: Unit, Step: Unit, Stop: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: Unit, Step: Unit, Stop: Double, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: Unit, Step: Unit, Stop: Unit, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: XlDataSeriesDate): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: XlDataSeriesDate, Step: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: XlDataSeriesDate, Step: Double, Stop: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: XlDataSeriesDate, Step: Double, Stop: Double, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: XlDataSeriesDate, Step: Double, Stop: Unit, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: XlDataSeriesDate, Step: Unit, Stop: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: XlDataSeriesDate, Step: Unit, Stop: Double, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: Unit, Date: XlDataSeriesDate, Step: Unit, Stop: Unit, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: Unit, Step: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: Unit, Step: Double, Stop: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: Unit, Step: Double, Stop: Double, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: Unit, Step: Double, Stop: Unit, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: Unit, Step: Unit, Stop: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: Unit, Step: Unit, Stop: Double, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: Unit, Step: Unit, Stop: Unit, Trend: Boolean): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: XlDataSeriesDate): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: XlDataSeriesDate, Step: Double): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: XlDataSeriesDate, Step: Double, Stop: Double): Any = js.native
  def DataSeries(
    Rowcol: XlRowCol,
    Type: XlDataSeriesType,
    Date: XlDataSeriesDate,
    Step: Double,
    Stop: Double,
    Trend: Boolean
  ): Any = js.native
  def DataSeries(
    Rowcol: XlRowCol,
    Type: XlDataSeriesType,
    Date: XlDataSeriesDate,
    Step: Double,
    Stop: Unit,
    Trend: Boolean
  ): Any = js.native
  def DataSeries(Rowcol: XlRowCol, Type: XlDataSeriesType, Date: XlDataSeriesDate, Step: Unit, Stop: Double): Any = js.native
  def DataSeries(
    Rowcol: XlRowCol,
    Type: XlDataSeriesType,
    Date: XlDataSeriesDate,
    Step: Unit,
    Stop: Double,
    Trend: Boolean
  ): Any = js.native
  def DataSeries(
    Rowcol: XlRowCol,
    Type: XlDataSeriesType,
    Date: XlDataSeriesDate,
    Step: Unit,
    Stop: Unit,
    Trend: Boolean
  ): Any = js.native
  
  def Delete(): Any = js.native
  def Delete(Shift: XlDeleteShiftDirection): Any = js.native
  
  def Dependents(Address: String): Range = js.native
  def Dependents(RowIndex: Double): Range = js.native
  def Dependents(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Dependents")
  val Dependents_Original: Range = js.native
  
  def DialogBox(): Double | `false` = js.native
  
  def DirectDependents(Address: String): Range = js.native
  def DirectDependents(RowIndex: Double): Range = js.native
  def DirectDependents(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("DirectDependents")
  val DirectDependents_Original: Range = js.native
  
  def DirectPrecedents(Address: String): Range = js.native
  def DirectPrecedents(RowIndex: Double): Range = js.native
  def DirectPrecedents(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("DirectPrecedents")
  val DirectPrecedents_Original: Range = js.native
  
  def Dirty(): Unit = js.native
  
  def DiscardChanges(): Unit = js.native
  
  val DisplayFormat: typings.activexExcel.Excel.DisplayFormat = js.native
  
  /**
    * @param Appearance [Appearance=1]
    * @param ChartSize [ChartSize=1]
    */
  def EditionOptions(Type: XlEditionType, Option: XlEditionOptionsOption, Name: Any, Reference: Any): Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: Any,
    Reference: Any,
    Appearance: Unit,
    ChartSize: Unit,
    Format: Any
  ): Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: Any,
    Reference: Any,
    Appearance: Unit,
    ChartSize: XlPictureAppearance
  ): Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: Any,
    Reference: Any,
    Appearance: Unit,
    ChartSize: XlPictureAppearance,
    Format: Any
  ): Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: Any,
    Reference: Any,
    Appearance: XlPictureAppearance
  ): Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: Any,
    Reference: Any,
    Appearance: XlPictureAppearance,
    ChartSize: Unit,
    Format: Any
  ): Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: Any,
    Reference: Any,
    Appearance: XlPictureAppearance,
    ChartSize: XlPictureAppearance
  ): Any = js.native
  def EditionOptions(
    Type: XlEditionType,
    Option: XlEditionOptionsOption,
    Name: Any,
    Reference: Any,
    Appearance: XlPictureAppearance,
    ChartSize: XlPictureAppearance,
    Format: Any
  ): Any = js.native
  
  def End(Direction: XlDirection): Range = js.native
  
  def EntireColumn(Address: String): Range = js.native
  def EntireColumn(RowIndex: Double): Range = js.native
  def EntireColumn(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("EntireColumn")
  val EntireColumn_Original: Range = js.native
  
  def EntireRow(Address: String): Range = js.native
  def EntireRow(RowIndex: Double): Range = js.native
  def EntireRow(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("EntireRow")
  val EntireRow_Original: Range = js.native
  
  def Errors(Index: Double): Error = js.native
  def Errors(Index: XlErrorChecks): Error = js.native
  @JSName("Errors")
  val Errors_Original: Errors = js.native
  
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
  
  def FillDown(): Any = js.native
  
  def FillLeft(): Any = js.native
  
  def FillRight(): Any = js.native
  
  def FillUp(): Any = js.native
  
  /** @param SearchDirection [SearchDirection=1] */
  def Find(
    What: Any,
    After: js.UndefOr[Any],
    LookIn: js.UndefOr[XlFindLookIn],
    LookAt: js.UndefOr[XlLookAt],
    SearchOrder: js.UndefOr[XlSearchOrder],
    SearchDirection: js.UndefOr[XlSearchDirection],
    MatchCase: js.UndefOr[Boolean],
    MatchByte: js.UndefOr[Boolean],
    SearchFormat: js.UndefOr[Any]
  ): Range = js.native
  
  def FindNext(): Range = js.native
  def FindNext(After: Any): Range = js.native
  
  def FindPrevious(): Range = js.native
  def FindPrevious(After: Any): Range = js.native
  
  val Font: typings.activexExcel.Excel.Font = js.native
  
  def FormatConditions(Index: String): FormatCondition = js.native
  def FormatConditions(Index: Double): FormatCondition = js.native
  @JSName("FormatConditions")
  val FormatConditions_Original: FormatConditions = js.native
  
  var Formula: String | SafeArray[String] = js.native
  
  var FormulaArray: String | SafeArray[String] | Null = js.native
  
  var FormulaHidden: Boolean | Null = js.native
  
  var FormulaLabel: XlFormulaLabel = js.native
  
  var FormulaLocal: String | SafeArray[String] = js.native
  
  var FormulaR1C1: String | SafeArray[String] = js.native
  
  var FormulaR1C1Local: String | SafeArray[String] = js.native
  
  def FunctionWizard(): Any = js.native
  
  def GoalSeek(Goal: Any, ChangingCell: Range): Boolean = js.native
  
  def Group(): Any = js.native
  def Group(Start: Any): Any = js.native
  def Group(Start: Any, End: Any): Any = js.native
  def Group(Start: Any, End: Any, By: Double): Any = js.native
  def Group(Start: Any, End: Any, By: Double, Periods: SafeArray[Boolean]): Any = js.native
  def Group(Start: Any, End: Any, By: Unit, Periods: SafeArray[Boolean]): Any = js.native
  def Group(Start: Any, End: Unit, By: Double): Any = js.native
  def Group(Start: Any, End: Unit, By: Double, Periods: SafeArray[Boolean]): Any = js.native
  def Group(Start: Any, End: Unit, By: Unit, Periods: SafeArray[Boolean]): Any = js.native
  def Group(Start: Unit, End: Any): Any = js.native
  def Group(Start: Unit, End: Any, By: Double): Any = js.native
  def Group(Start: Unit, End: Any, By: Double, Periods: SafeArray[Boolean]): Any = js.native
  def Group(Start: Unit, End: Any, By: Unit, Periods: SafeArray[Boolean]): Any = js.native
  def Group(Start: Unit, End: Unit, By: Double): Any = js.native
  def Group(Start: Unit, End: Unit, By: Double, Periods: SafeArray[Boolean]): Any = js.native
  def Group(Start: Unit, End: Unit, By: Unit, Periods: SafeArray[Boolean]): Any = js.native
  
  val HasArray: Boolean = js.native
  
  val HasFormula: Boolean | Null = js.native
  
  var Height: Double = js.native
  
  var Hidden: Boolean = js.native
  
  var HorizontalAlignment: HorizontalAlignments = js.native
  
  def Hyperlinks(Index: String): Hyperlink = js.native
  def Hyperlinks(Index: Double): Hyperlink = js.native
  @JSName("Hyperlinks")
  val Hyperlinks_Original: Hyperlinks = js.native
  
  var ID: String = js.native
  
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
  
  def Insert(): Any = js.native
  def Insert(Shift: Unit, CopyOrigin: Any): Any = js.native
  def Insert(Shift: XlInsertShiftDirection): Any = js.native
  def Insert(Shift: XlInsertShiftDirection, CopyOrigin: Any): Any = js.native
  
  def InsertIndent(InsertAmount: Double): Unit = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  def Item(Address: String): Range = js.native
  def Item(RowIndex: Double): Range = js.native
  def Item(RowIndex: Double, ColumnIndex: Double): Range = js.native
  
  def Justify(): Any = js.native
  
  val Left: Double = js.native
  
  val ListHeaderRows: Double = js.native
  
  def ListNames(): Any = js.native
  
  val ListObject: typings.activexExcel.Excel.ListObject = js.native
  
  val LocationInTable: XlLocationInTable = js.native
  
  var Locked: Boolean | Null = js.native
  
  val MDX: String = js.native
  
  def Merge(): Unit = js.native
  def Merge(Across: Boolean): Unit = js.native
  
  def MergeArea(Address: String): Range = js.native
  def MergeArea(RowIndex: Double): Range = js.native
  def MergeArea(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("MergeArea")
  val MergeArea_Original: Range = js.native
  
  var MergeCells: Boolean = js.native
  
  var Name: String | typings.activexExcel.Excel.Name = js.native
  
  def NavigateArrow(): Any = js.native
  def NavigateArrow(TowardPrecedent: Boolean): Any = js.native
  def NavigateArrow(TowardPrecedent: Boolean, ArrowNumber: Double): Any = js.native
  def NavigateArrow(TowardPrecedent: Boolean, ArrowNumber: Double, LinkNumber: Double): Any = js.native
  def NavigateArrow(TowardPrecedent: Boolean, ArrowNumber: Unit, LinkNumber: Double): Any = js.native
  def NavigateArrow(TowardPrecedent: Unit, ArrowNumber: Double): Any = js.native
  def NavigateArrow(TowardPrecedent: Unit, ArrowNumber: Double, LinkNumber: Double): Any = js.native
  def NavigateArrow(TowardPrecedent: Unit, ArrowNumber: Unit, LinkNumber: Double): Any = js.native
  
  def Next(Address: String): Range = js.native
  def Next(RowIndex: Double): Range = js.native
  def Next(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Next")
  val Next_Original: Range = js.native
  
  def NoteText(): String = js.native
  def NoteText(Text: String): String = js.native
  def NoteText(Text: String, Start: Double): String = js.native
  def NoteText(Text: String, Start: Double, Length: Double): String = js.native
  def NoteText(Text: String, Start: Unit, Length: Double): String = js.native
  def NoteText(Text: Unit, Start: Double): String = js.native
  def NoteText(Text: Unit, Start: Double, Length: Double): String = js.native
  def NoteText(Text: Unit, Start: Unit, Length: Double): String = js.native
  
  var NumberFormat: String | Null = js.native
  
  var NumberFormatLocal: String | Null = js.native
  
  def Offset(): Range = js.native
  def Offset(RowOffset: Double): Range = js.native
  def Offset(RowOffset: Double, ColumnOffset: Double): Range = js.native
  def Offset(RowOffset: Unit, ColumnOffset: Double): Range = js.native
  
  var Orientation: Double | XlOrientation = js.native
  
  var OutlineLevel: Double = js.native
  
  var PageBreak: Double = js.native
  
  val Parent: Any = js.native
  
  def Parse(): Any = js.native
  def Parse(ParseLine: String): Any = js.native
  def Parse(ParseLine: String, Destination: Range): Any = js.native
  def Parse(ParseLine: Unit, Destination: Range): Any = js.native
  
  /**
    * @param Paste [Paste=-4104]
    * @param Operation [Operation=-4142]
    */
  def PasteSpecial(): Any = js.native
  def PasteSpecial(Paste: Unit, Operation: Unit, SkipBlanks: Boolean): Any = js.native
  def PasteSpecial(Paste: Unit, Operation: Unit, SkipBlanks: Boolean, Transpose: Boolean): Any = js.native
  def PasteSpecial(Paste: Unit, Operation: Unit, SkipBlanks: Unit, Transpose: Boolean): Any = js.native
  def PasteSpecial(Paste: Unit, Operation: XlPasteSpecialOperation): Any = js.native
  def PasteSpecial(Paste: Unit, Operation: XlPasteSpecialOperation, SkipBlanks: Boolean): Any = js.native
  def PasteSpecial(Paste: Unit, Operation: XlPasteSpecialOperation, SkipBlanks: Boolean, Transpose: Boolean): Any = js.native
  def PasteSpecial(Paste: Unit, Operation: XlPasteSpecialOperation, SkipBlanks: Unit, Transpose: Boolean): Any = js.native
  def PasteSpecial(Paste: XlPasteType): Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: Unit, SkipBlanks: Boolean): Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: Unit, SkipBlanks: Boolean, Transpose: Boolean): Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: Unit, SkipBlanks: Unit, Transpose: Boolean): Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation): Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: Boolean): Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: Boolean, Transpose: Boolean): Any = js.native
  def PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: Unit, Transpose: Boolean): Any = js.native
  
  val Phonetic: typings.activexExcel.Excel.Phonetic = js.native
  
  def Phonetics(Index: Double): typings.activexExcel.Excel.Phonetic = js.native
  @JSName("Phonetics")
  val Phonetics_Original: Phonetics = js.native
  
  val PivotCell: typings.activexExcel.Excel.PivotCell = js.native
  
  val PivotField: typings.activexExcel.Excel.PivotField = js.native
  
  val PivotItem: typings.activexExcel.Excel.PivotItem = js.native
  
  val PivotTable: typings.activexExcel.Excel.PivotTable = js.native
  
  def Precedents(Address: String): Range = js.native
  def Precedents(RowIndex: Double): Range = js.native
  def Precedents(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Precedents")
  val Precedents_Original: Range = js.native
  
  val PrefixCharacter: String | Quotationmark | ^ | _empty = js.native
  
  def Previous(Address: String): Range = js.native
  def Previous(RowIndex: Double): Range = js.native
  def Previous(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Previous")
  val Previous_Original: Range = js.native
  
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
  
  def PrintPreview(): Any = js.native
  def PrintPreview(EnableChanges: Boolean): Any = js.native
  
  val QueryTable: typings.activexExcel.Excel.QueryTable = js.native
  
  def Range(Cell1: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: String, Cell2: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: String, Cell2: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range, Cell2: String): typings.activexExcel.Excel.Range = js.native
  def Range(Cell1: typings.activexExcel.Excel.Range, Cell2: typings.activexExcel.Excel.Range): typings.activexExcel.Excel.Range = js.native
  
  var ReadingOrder: Double = js.native
  
  /** @param Header [Header=2] */
  def RemoveDuplicates(Columns: SafeArray[Double]): Unit = js.native
  def RemoveDuplicates(Columns: SafeArray[Double], Header: XlYesNoGuess): Unit = js.native
  
  def RemoveSubtotal(): Any = js.native
  
  def Replace(
    What: String,
    Replacement: String,
    LookAt: js.UndefOr[XlLookAt],
    SearchOrder: js.UndefOr[XlSearchOrder],
    MatchCase: js.UndefOr[Boolean],
    MatchByte: js.UndefOr[Boolean],
    SearchFormat: js.UndefOr[Boolean],
    ReplaceFormat: js.UndefOr[Boolean]
  ): Boolean = js.native
  
  def Resize(): Range = js.native
  def Resize(RowSize: Double): Range = js.native
  def Resize(RowSize: Double, ColumnSize: Double): Range = js.native
  def Resize(RowSize: Unit, ColumnSize: Double): Range = js.native
  
  val Row: Double = js.native
  
  def RowDifferences(Comparison: Range): Range = js.native
  
  var RowHeight: Double | Null = js.native
  
  def Rows(Address: String): Range = js.native
  def Rows(RowIndex: Double): Range = js.native
  def Rows(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Rows")
  val Rows_Original: Range = js.native
  
  def Run(
    Arg1: js.UndefOr[Any],
    Arg2: js.UndefOr[Any],
    Arg3: js.UndefOr[Any],
    Arg4: js.UndefOr[Any],
    Arg5: js.UndefOr[Any],
    Arg6: js.UndefOr[Any],
    Arg7: js.UndefOr[Any],
    Arg8: js.UndefOr[Any],
    Arg9: js.UndefOr[Any],
    Arg10: js.UndefOr[Any],
    Arg11: js.UndefOr[Any],
    Arg12: js.UndefOr[Any],
    Arg13: js.UndefOr[Any],
    Arg14: js.UndefOr[Any],
    Arg15: js.UndefOr[Any],
    Arg16: js.UndefOr[Any],
    Arg17: js.UndefOr[Any],
    Arg18: js.UndefOr[Any],
    Arg19: js.UndefOr[Any],
    Arg20: js.UndefOr[Any],
    Arg21: js.UndefOr[Any],
    Arg22: js.UndefOr[Any],
    Arg23: js.UndefOr[Any],
    Arg24: js.UndefOr[Any],
    Arg25: js.UndefOr[Any],
    Arg26: js.UndefOr[Any],
    Arg27: js.UndefOr[Any],
    Arg28: js.UndefOr[Any],
    Arg29: js.UndefOr[Any],
    Arg30: js.UndefOr[Any]
  ): Any = js.native
  
  def Select(): Any = js.native
  
  def ServerActions(Index: String): Action = js.native
  def ServerActions(Index: Double): Action = js.native
  @JSName("ServerActions")
  val ServerActions_Original: Actions = js.native
  
  def SetPhonetic(): Unit = js.native
  
  def Show(): Any = js.native
  
  def ShowDependents(): Any = js.native
  def ShowDependents(Remove: Boolean): Any = js.native
  
  var ShowDetail: Any = js.native
  
  def ShowErrors(): Any = js.native
  
  def ShowPrecedents(): Any = js.native
  def ShowPrecedents(Remove: Boolean): Any = js.native
  
  var ShrinkToFit: Boolean | Null = js.native
  
  def SmartTags(Index: Any): SmartTag = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  
  /**
    * @param Order1 [Order1=1]
    * @param Order2 [Order2=1]
    * @param Order3 [Order3=1]
    * @param Header [Header=2]
    * @param Orientation [Orientation=2]
    * @param SortMethod [SortMethod=1]
    * @param DataOption1 [DataOption1=0]
    * @param DataOption2 [DataOption2=0]
    * @param DataOption3 [DataOption3=0]
    */
  def Sort(
    Key1: String | Range,
    Order1: js.UndefOr[XlSortOrder],
    Key2: js.UndefOr[Any],
    Type: js.UndefOr[Any],
    Order2: js.UndefOr[XlSortOrder],
    Key3: js.UndefOr[Any],
    Order3: js.UndefOr[XlSortOrder],
    Header: js.UndefOr[XlYesNoGuess],
    OrderCustom: js.UndefOr[Double],
    MatchCase: js.UndefOr[Boolean],
    Orientation: js.UndefOr[XlSortOrientation],
    SortMethod: js.UndefOr[XlSortMethod],
    DataOption1: js.UndefOr[XlSortDataOption],
    DataOption2: js.UndefOr[XlSortDataOption],
    DataOption3: js.UndefOr[XlSortDataOption]
  ): Any = js.native
  
  /**
    * @param SortMethod [SortMethod=1]
    * @param Order1 [Order1=1]
    * @param Order2 [Order2=1]
    * @param Order3 [Order3=1]
    * @param Header [Header=2]
    * @param Orientation [Orientation=2]
    * @param DataOption1 [DataOption1=0]
    * @param DataOption2 [DataOption2=0]
    * @param DataOption3 [DataOption3=0]
    */
  def SortSpecial(
    SortMethod: js.UndefOr[XlSortMethod],
    Key1: js.UndefOr[String | Range],
    Order1: js.UndefOr[XlSortOrder],
    Type: js.UndefOr[Any],
    Key2: js.UndefOr[String | Range],
    Order2: js.UndefOr[XlSortOrder],
    Key3: js.UndefOr[String | Range],
    Order3: js.UndefOr[XlSortOrder],
    Header: js.UndefOr[XlYesNoGuess],
    OrderCustom: js.UndefOr[Double],
    MatchCase: js.UndefOr[Boolean],
    Orientation: js.UndefOr[XlSortOrientation],
    DataOption1: js.UndefOr[XlSortDataOption],
    DataOption2: js.UndefOr[XlSortDataOption],
    DataOption3: js.UndefOr[XlSortDataOption]
  ): Any = js.native
  
  val SoundNote: typings.activexExcel.Excel.SoundNote = js.native
  
  def SparklineGroups(Index: Double): SparklineGroup = js.native
  @JSName("SparklineGroups")
  val SparklineGroups_Original: SparklineGroups = js.native
  
  def Speak(): Unit = js.native
  def Speak(SpeakDirection: Unit, SpeakFormulas: Boolean): Unit = js.native
  def Speak(SpeakDirection: XlSpeakDirection): Unit = js.native
  def Speak(SpeakDirection: XlSpeakDirection, SpeakFormulas: Boolean): Unit = js.native
  
  def SpecialCells(Type: `-4123` | `2` | XlCellType): Range = js.native
  def SpecialCells(Type: `2` | `-4123`, Value: XlSpecialCellsValue): Range = js.native
  
  var Style: typings.activexExcel.Excel.Style = js.native
  
  /** @param Format [Format=-4158] */
  def SubscribeTo(Edition: String): Any = js.native
  def SubscribeTo(Edition: String, Format: XlSubscribeToFormat): Any = js.native
  
  /** @param SummaryBelowData [SummaryBelowData=1] */
  def Subtotal(
    GroupBy: Double,
    Function: XlConsolidationFunction,
    TotalList: SafeArray[Double],
    Replace: Boolean,
    PageBreaks: Boolean
  ): Any = js.native
  def Subtotal(
    GroupBy: Double,
    Function: XlConsolidationFunction,
    TotalList: SafeArray[Double],
    Replace: Boolean,
    PageBreaks: Boolean,
    SummaryBelowData: XlSummaryRow
  ): Any = js.native
  
  val Summary: Boolean = js.native
  
  def Table(): Any = js.native
  def Table(RowInput: Unit, ColumnInput: Range): Any = js.native
  def Table(RowInput: Range): Any = js.native
  def Table(RowInput: Range, ColumnInput: Range): Any = js.native
  
  val Text: String = js.native
  
  /**
    * @param DataType [DataType=1]
    * @param TextQualifier [TextQualifier=1]
    */
  def TextToColumns(
    Destination: Range,
    DataType: js.UndefOr[XlTextParsingType],
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[Boolean],
    Tab: js.UndefOr[Boolean],
    Semicolon: js.UndefOr[Boolean],
    Comma: js.UndefOr[Boolean],
    Space: js.UndefOr[Boolean],
    Other: js.UndefOr[Boolean],
    OtherChar: js.UndefOr[String],
    FieldInfo: js.UndefOr[SafeArray[Any]],
    DecimalSeparator: js.UndefOr[String],
    ThousandsSeparator: js.UndefOr[String],
    TrailingMinusNumbers: js.UndefOr[Any]
  ): Any = js.native
  
  val Top: Double = js.native
  
  def UnMerge(): Unit = js.native
  
  def Ungroup(): Any = js.native
  
  var UseStandardHeight: Boolean | Null = js.native
  
  var UseStandardWidth: Boolean | Null = js.native
  
  val Validation: typings.activexExcel.Excel.Validation = js.native
  
  // tslint:disable-next-line: ban-types
  def Value(): Any = js.native
  def Value(RangeValueDataType: XlRangeValueDataType): Any = js.native
  
  var Value2: Any = js.native
  
  // tslint:disable-next-line: ban-types
  @JSName("Value")
  var Value_Original: (Exclude[Any, js.Function]) & (js.Function1[/* RangeValueDataType */ js.UndefOr[XlRangeValueDataType], Any]) = js.native
  
  var VerticalAlignment: VerticalAlignments = js.native
  
  val Width: Double = js.native
  
  val Worksheet: typings.activexExcel.Excel.Worksheet = js.native
  
  var WrapText: Boolean | Null = js.native
  
  val XPath: typings.activexExcel.Excel.XPath = js.native
  
  /**
    * @param Weight [Weight=2]
    * @param ColorIndex [ColorIndex=-4105]
    */
  def _BorderAround(LineStyle: Any): Any = js.native
  def _BorderAround(LineStyle: Any, Weight: Unit, ColorIndex: Unit, Color: Any): Any = js.native
  def _BorderAround(LineStyle: Any, Weight: Unit, ColorIndex: XlColorIndex): Any = js.native
  def _BorderAround(LineStyle: Any, Weight: Unit, ColorIndex: XlColorIndex, Color: Any): Any = js.native
  def _BorderAround(LineStyle: Any, Weight: XlBorderWeight): Any = js.native
  def _BorderAround(LineStyle: Any, Weight: XlBorderWeight, ColorIndex: Unit, Color: Any): Any = js.native
  def _BorderAround(LineStyle: Any, Weight: XlBorderWeight, ColorIndex: XlColorIndex): Any = js.native
  def _BorderAround(LineStyle: Any, Weight: XlBorderWeight, ColorIndex: XlColorIndex, Color: Any): Any = js.native
  
  def _Default(): Any = js.native
  def _Default(RowIndex: Any): Any = js.native
  def _Default(RowIndex: Any, ColumnIndex: Any): Any = js.native
  def _Default(RowIndex: Unit, ColumnIndex: Any): Any = js.native
  
  /**
    * @param Paste [Paste=-4104]
    * @param Operation [Operation=-4142]
    */
  def _PasteSpecial(): Any = js.native
  def _PasteSpecial(Paste: Unit, Operation: Unit, SkipBlanks: Any): Any = js.native
  def _PasteSpecial(Paste: Unit, Operation: Unit, SkipBlanks: Any, Transpose: Any): Any = js.native
  def _PasteSpecial(Paste: Unit, Operation: Unit, SkipBlanks: Unit, Transpose: Any): Any = js.native
  def _PasteSpecial(Paste: Unit, Operation: XlPasteSpecialOperation): Any = js.native
  def _PasteSpecial(Paste: Unit, Operation: XlPasteSpecialOperation, SkipBlanks: Any): Any = js.native
  def _PasteSpecial(Paste: Unit, Operation: XlPasteSpecialOperation, SkipBlanks: Any, Transpose: Any): Any = js.native
  def _PasteSpecial(Paste: Unit, Operation: XlPasteSpecialOperation, SkipBlanks: Unit, Transpose: Any): Any = js.native
  def _PasteSpecial(Paste: XlPasteType): Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: Unit, SkipBlanks: Any): Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: Unit, SkipBlanks: Any, Transpose: Any): Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: Unit, SkipBlanks: Unit, Transpose: Any): Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation): Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: Any): Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: Any, Transpose: Any): Any = js.native
  def _PasteSpecial(Paste: XlPasteType, Operation: XlPasteSpecialOperation, SkipBlanks: Unit, Transpose: Any): Any = js.native
  
  def _PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    PrToFileName: js.UndefOr[Any]
  ): Any = js.native
  
  def __PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any]
  ): Any = js.native
}
