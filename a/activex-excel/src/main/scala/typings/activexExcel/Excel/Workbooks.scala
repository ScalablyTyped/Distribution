package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`true`
import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import typings.activexExcel.activexExcelNumbers.`4`
import typings.activexExcel.activexExcelNumbers.`5`
import typings.activexExcel.activexExcelNumbers.`6`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workbooks extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Workbook = js.native
  def apply(Index: Double): Workbook = js.native
  def Add(): Workbook = js.native
  def Add(Template: String): Workbook = js.native
  def Add(Template: XlWBATemplate): Workbook = js.native
  def CanCheckOut(Filename: String): Boolean = js.native
  def CheckOut(Filename: String): Unit = js.native
  def Close(): Unit = js.native
  def Item(Index: String): Workbook = js.native
  def Item(Index: Double): Workbook = js.native
  def Open(
    Filename: String,
    UpdateLinks: js.UndefOr[`0` | `3`],
    ReadOnly: js.UndefOr[Boolean],
    Format: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`],
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
  def OpenDatabase(Filename: String): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: js.UndefOr[scala.Nothing],
    CommandType: js.UndefOr[scala.Nothing],
    BackgroundQuery: js.UndefOr[scala.Nothing],
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: js.UndefOr[scala.Nothing],
    CommandType: js.UndefOr[scala.Nothing],
    BackgroundQuery: Boolean
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: js.UndefOr[scala.Nothing],
    CommandType: js.UndefOr[scala.Nothing],
    BackgroundQuery: Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: js.UndefOr[scala.Nothing], CommandType: XlCmdType): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: js.UndefOr[scala.Nothing],
    CommandType: XlCmdType,
    BackgroundQuery: js.UndefOr[scala.Nothing],
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: js.UndefOr[scala.Nothing],
    CommandType: XlCmdType,
    BackgroundQuery: Boolean
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: js.UndefOr[scala.Nothing],
    CommandType: XlCmdType,
    BackgroundQuery: Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: String): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: js.UndefOr[scala.Nothing],
    BackgroundQuery: js.UndefOr[scala.Nothing],
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: js.UndefOr[scala.Nothing],
    BackgroundQuery: Boolean
  ): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: js.UndefOr[scala.Nothing],
    BackgroundQuery: Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: String, CommandType: XlCmdType): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: XlCmdType,
    BackgroundQuery: js.UndefOr[scala.Nothing],
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  def OpenDatabase(Filename: String, CommandText: String, CommandType: XlCmdType, BackgroundQuery: Boolean): Workbook = js.native
  def OpenDatabase(
    Filename: String,
    CommandText: String,
    CommandType: XlCmdType,
    BackgroundQuery: Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  /** @param TextQualifier [TextQualifier=1] */
  def OpenText(
    Filename: String,
    Origin: XlPlatform,
    StartRow: Double,
    DataType: XlTextParsingType,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[scala.Nothing],
    Tab: js.UndefOr[scala.Nothing],
    Semicolon: js.UndefOr[scala.Nothing],
    Comma: js.UndefOr[scala.Nothing],
    Space: js.UndefOr[scala.Nothing],
    Other: js.UndefOr[scala.Nothing],
    OtherChar: js.UndefOr[scala.Nothing],
    FieldInfo: js.UndefOr[SafeArray[_]],
    TextVisualLayout: js.UndefOr[js.Any],
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
    FieldInfo: js.UndefOr[SafeArray[_]],
    TextVisualLayout: js.UndefOr[js.Any],
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
    OtherChar: js.UndefOr[scala.Nothing],
    FieldInfo: js.UndefOr[SafeArray[_]],
    TextVisualLayout: js.UndefOr[js.Any],
    DecimalSeparator: js.UndefOr[String],
    ThousandsSeparator: js.UndefOr[String],
    TrailingMinusNumbers: js.UndefOr[Boolean],
    Local: js.UndefOr[Boolean]
  ): Unit = js.native
  def OpenXML(Filename: String): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: js.UndefOr[scala.Nothing], LoadOption: XlXmlLoadOption): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: String): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: String, LoadOption: XlXmlLoadOption): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: SafeArray[String]): Workbook = js.native
  def OpenXML(Filename: String, Stylesheets: SafeArray[String], LoadOption: XlXmlLoadOption): Workbook = js.native
  def _Default(Index: js.Any): Workbook = js.native
  def _Open(
    Filename: String,
    UpdateLinks: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    Password: js.UndefOr[js.Any],
    WriteResPassword: js.UndefOr[js.Any],
    IgnoreReadOnlyRecommended: js.UndefOr[js.Any],
    Origin: js.UndefOr[js.Any],
    Delimiter: js.UndefOr[js.Any],
    Editable: js.UndefOr[js.Any],
    Notify: js.UndefOr[js.Any],
    Converter: js.UndefOr[js.Any],
    AddToMru: js.UndefOr[js.Any]
  ): Workbook = js.native
  /** @param TextQualifier [TextQualifier=1] */
  def _OpenText(
    Filename: String,
    Origin: js.Any,
    StartRow: js.Any,
    DataType: js.Any,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[js.Any],
    Tab: js.UndefOr[js.Any],
    Semicolon: js.UndefOr[js.Any],
    Comma: js.UndefOr[js.Any],
    Space: js.UndefOr[js.Any],
    Other: js.UndefOr[js.Any],
    OtherChar: js.UndefOr[js.Any],
    FieldInfo: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any],
    DecimalSeparator: js.UndefOr[js.Any],
    ThousandsSeparator: js.UndefOr[js.Any]
  ): Unit = js.native
  def _OpenXML(Filename: String): Workbook = js.native
  def _OpenXML(Filename: String, Stylesheets: js.Any): Workbook = js.native
  /** @param TextQualifier [TextQualifier=1] */
  def __OpenText(
    Filename: String,
    Origin: js.Any,
    StartRow: js.Any,
    DataType: js.Any,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[js.Any],
    Tab: js.UndefOr[js.Any],
    Semicolon: js.UndefOr[js.Any],
    Comma: js.UndefOr[js.Any],
    Space: js.UndefOr[js.Any],
    Other: js.UndefOr[js.Any],
    OtherChar: js.UndefOr[js.Any],
    FieldInfo: js.UndefOr[js.Any],
    TextVisualLayout: js.UndefOr[js.Any]
  ): Unit = js.native
}

