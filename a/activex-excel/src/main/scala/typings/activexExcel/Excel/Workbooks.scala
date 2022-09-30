package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`true`
import typings.activexExcel.activexExcelInts.`0`
import typings.activexExcel.activexExcelInts.`1`
import typings.activexExcel.activexExcelInts.`2`
import typings.activexExcel.activexExcelInts.`3`
import typings.activexExcel.activexExcelInts.`4`
import typings.activexExcel.activexExcelInts.`5`
import typings.activexExcel.activexExcelInts.`6`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workbooks extends StObject {
  
  def apply(Index: String): Workbook = js.native
  def apply(Index: Double): Workbook = js.native
  
  def Add(): Workbook = js.native
  def Add(Template: String): Workbook = js.native
  def Add(Template: XlWBATemplate): Workbook = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def CanCheckOut(Filename: String): Boolean = js.native
  
  def CheckOut(Filename: String): Unit = js.native
  
  def Close(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Workbook = js.native
  def Item(Index: Double): Workbook = js.native
  
  def Open(
    Filename: String,
    UpdateLinks: js.UndefOr[`0` | `3`],
    ReadOnly: js.UndefOr[Boolean],
    Format: js.UndefOr[`6`],
    Password: js.UndefOr[String],
    WriteResPassword: js.UndefOr[String],
    IgnoreReadOnlyRecommended: js.UndefOr[Boolean],
    Origin: js.UndefOr[XlPlatform],
    Delimiter: js.UndefOr[String],
    Editable: js.UndefOr[Boolean],
    Notify: js.UndefOr[Boolean],
    Converter: js.UndefOr[Double],
    AddToMru: js.UndefOr[Boolean],
    Local: js.UndefOr[Boolean],
    CorruptLoad: js.UndefOr[XlCorruptLoad]
  ): Workbook = js.native
  def Open(
    Filename: String,
    UpdateLinks: js.UndefOr[`0` | `3`],
    ReadOnly: js.UndefOr[Boolean],
    Format: js.UndefOr[`1` | `2` | `3` | `4` | `5`],
    Password: js.UndefOr[String],
    WriteResPassword: js.UndefOr[String],
    IgnoreReadOnlyRecommended: js.UndefOr[Boolean],
    Origin: js.UndefOr[XlPlatform],
    Delimiter: Unit,
    Editable: js.UndefOr[Boolean],
    Notify: js.UndefOr[Boolean],
    Converter: js.UndefOr[Double],
    AddToMru: js.UndefOr[Boolean],
    Local: js.UndefOr[Boolean],
    CorruptLoad: js.UndefOr[XlCorruptLoad]
  ): Workbook = js.native
  
  def OpenDatabase(Filename: String): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: String): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: String, CommandType: Unit, BackgroundQuery: Boolean): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: Unit,
    BackgroundQuery: Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: Unit,
    BackgroundQuery: Unit,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: String, CommandType: XlCmdType): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: String, CommandType: XlCmdType, BackgroundQuery: Boolean): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: XlCmdType,
    BackgroundQuery: Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: XlCmdType,
    BackgroundQuery: Unit,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: Unit, CommandType: Unit, BackgroundQuery: Boolean): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: Unit,
    CommandType: Unit,
    BackgroundQuery: Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: Unit,
    CommandType: Unit,
    BackgroundQuery: Unit,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: Unit, CommandType: XlCmdType): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: Unit, CommandType: XlCmdType, BackgroundQuery: Boolean): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: Unit,
    CommandType: XlCmdType,
    BackgroundQuery: Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: Unit,
    CommandType: XlCmdType,
    BackgroundQuery: Unit,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  
  /** @param TextQualifier [TextQualifier=1] */
  def OpenText(
    Filename: String,
    Origin: XlPlatform,
    StartRow: Double,
    DataType: XlTextParsingType,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: Unit,
    Tab: Unit,
    Semicolon: Unit,
    Comma: Unit,
    Space: Unit,
    Other: Unit,
    OtherChar: Unit,
    FieldInfo: js.UndefOr[SafeArray[Any]],
    TextVisualLayout: js.UndefOr[Any],
    DecimalSeparator: js.UndefOr[String],
    ThousandsSeparator: js.UndefOr[String],
    TrailingMinusNumbers: js.UndefOr[Boolean],
    Local: js.UndefOr[Boolean]
  ): Unit = js.native
  /** @param TextQualifier [TextQualifier=1] */
  def OpenText(
    Filename: String,
    Origin: XlPlatform,
    StartRow: Double,
    DataType: `1`,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[Boolean],
    Tab: js.UndefOr[Boolean],
    Semicolon: js.UndefOr[Boolean],
    Comma: js.UndefOr[Boolean],
    Space: js.UndefOr[Boolean],
    Other: js.UndefOr[`true`],
    OtherChar: js.UndefOr[String],
    FieldInfo: js.UndefOr[SafeArray[Any]],
    TextVisualLayout: js.UndefOr[Any],
    DecimalSeparator: js.UndefOr[String],
    ThousandsSeparator: js.UndefOr[String],
    TrailingMinusNumbers: js.UndefOr[Boolean],
    Local: js.UndefOr[Boolean]
  ): Unit = js.native
  /** @param TextQualifier [TextQualifier=1] */
  @JSName("OpenText")
  def OpenText_1(
    Filename: String,
    Origin: XlPlatform,
    StartRow: Double,
    DataType: `1`,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[Boolean],
    Tab: js.UndefOr[Boolean],
    Semicolon: js.UndefOr[Boolean],
    Comma: js.UndefOr[Boolean],
    Space: js.UndefOr[Boolean],
    Other: js.UndefOr[Boolean],
    OtherChar: Unit,
    FieldInfo: js.UndefOr[SafeArray[Any]],
    TextVisualLayout: js.UndefOr[Any],
    DecimalSeparator: js.UndefOr[String],
    ThousandsSeparator: js.UndefOr[String],
    TrailingMinusNumbers: js.UndefOr[Boolean],
    Local: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def OpenXML(Filename: String): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: String): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: String, LoadOption: XlXmlLoadOption): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: Unit, LoadOption: XlXmlLoadOption): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: SafeArray[String]): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: SafeArray[String], LoadOption: XlXmlLoadOption): Workbook = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): Workbook = js.native
  
  def _Open(
    Filename: String,
    UpdateLinks: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    Password: js.UndefOr[Any],
    WriteResPassword: js.UndefOr[Any],
    IgnoreReadOnlyRecommended: js.UndefOr[Any],
    Origin: js.UndefOr[Any],
    Delimiter: js.UndefOr[Any],
    Editable: js.UndefOr[Any],
    Notify: js.UndefOr[Any],
    Converter: js.UndefOr[Any],
    AddToMru: js.UndefOr[Any]
  ): Workbook = js.native
  
  /** @param TextQualifier [TextQualifier=1] */
  def _OpenText(
    Filename: String,
    Origin: Any,
    StartRow: Any,
    DataType: Any,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[Any],
    Tab: js.UndefOr[Any],
    Semicolon: js.UndefOr[Any],
    Comma: js.UndefOr[Any],
    Space: js.UndefOr[Any],
    Other: js.UndefOr[Any],
    OtherChar: js.UndefOr[Any],
    FieldInfo: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any],
    DecimalSeparator: js.UndefOr[Any],
    ThousandsSeparator: js.UndefOr[Any]
  ): Unit = js.native
  
  def _OpenXML(Filename: String): Workbook = js.native
  def _OpenXML(Filename: String, Stylesheets: Any): Workbook = js.native
  
  /** @param TextQualifier [TextQualifier=1] */
  def __OpenText(
    Filename: String,
    Origin: Any,
    StartRow: Any,
    DataType: Any,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[Any],
    Tab: js.UndefOr[Any],
    Semicolon: js.UndefOr[Any],
    Comma: js.UndefOr[Any],
    Space: js.UndefOr[Any],
    Other: js.UndefOr[Any],
    OtherChar: js.UndefOr[Any],
    FieldInfo: js.UndefOr[Any],
    TextVisualLayout: js.UndefOr[Any]
  ): Unit = js.native
}
