package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workbooks extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Workbook = js.native
  def apply(Index: scala.Double): Workbook = js.native
  def Add(): Workbook = js.native
  def Add(Template: XlWBATemplate): Workbook = js.native
  def Add(Template: java.lang.String): Workbook = js.native
  def CanCheckOut(Filename: java.lang.String): scala.Boolean = js.native
  def CheckOut(Filename: java.lang.String): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def Item(Index: java.lang.String): Workbook = js.native
  def Item(Index: scala.Double): Workbook = js.native
  def Open(
    Filename: java.lang.String,
    UpdateLinks: js.UndefOr[
      activexDashExcelLib.activexDashExcelLibNumbers.`0` | activexDashExcelLib.activexDashExcelLibNumbers.`3`
    ],
    ReadOnly: js.UndefOr[scala.Boolean],
    Format: js.UndefOr[
      activexDashExcelLib.activexDashExcelLibNumbers.`1` | activexDashExcelLib.activexDashExcelLibNumbers.`2` | activexDashExcelLib.activexDashExcelLibNumbers.`3` | activexDashExcelLib.activexDashExcelLibNumbers.`4` | activexDashExcelLib.activexDashExcelLibNumbers.`5` | activexDashExcelLib.activexDashExcelLibNumbers.`6`
    ],
    Password: js.UndefOr[java.lang.String],
    WriteResPassword: js.UndefOr[java.lang.String],
    IgnoreReadOnlyRecommended: js.UndefOr[scala.Boolean],
    Origin: js.UndefOr[XlPlatform],
    Delimiter: js.UndefOr[java.lang.String | js.UndefOr[scala.Nothing]],
    Editable: js.UndefOr[scala.Boolean],
    Notify: js.UndefOr[scala.Boolean],
    Converter: js.UndefOr[scala.Double],
    AddToMru: js.UndefOr[scala.Boolean],
    Local: js.UndefOr[scala.Boolean],
    CorruptLoad: js.UndefOr[XlCorruptLoad]
  ): Workbook = js.native
  def OpenDatabase(Filename: java.lang.String): Workbook = js.native
  def OpenDatabase(Filename: java.lang.String, CommandText: java.lang.String): Workbook = js.native
  def OpenDatabase(Filename: java.lang.String, CommandText: java.lang.String, CommandType: XlCmdType): Workbook = js.native
  def OpenDatabase(
    Filename: java.lang.String,
    CommandText: java.lang.String,
    CommandType: XlCmdType,
    BackgroundQuery: scala.Boolean
  ): Workbook = js.native
  def OpenDatabase(
    Filename: java.lang.String,
    CommandText: java.lang.String,
    CommandType: XlCmdType,
    BackgroundQuery: scala.Boolean,
    ImportDataAs: XlImportDataAs
  ): Workbook = js.native
  /** @param TextQualifier [TextQualifier=1] */
  def OpenText(
    Filename: java.lang.String,
    Origin: XlPlatform,
    StartRow: scala.Double,
    DataType: XlTextParsingType,
    TextQualifier: js.UndefOr[XlTextQualifier],
    ConsecutiveDelimiter: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]],
    Tab: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]],
    Semicolon: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]],
    Comma: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]],
    Space: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]],
    Other: js.UndefOr[
      scala.Boolean | js.UndefOr[scala.Nothing] | activexDashExcelLib.activexDashExcelLibNumbers.`true`
    ],
    OtherChar: js.UndefOr[java.lang.String | js.UndefOr[scala.Nothing]],
    FieldInfo: js.UndefOr[stdLib.SafeArray[_]],
    TextVisualLayout: js.UndefOr[js.Any],
    DecimalSeparator: js.UndefOr[java.lang.String],
    ThousandsSeparator: js.UndefOr[java.lang.String],
    TrailingMinusNumbers: js.UndefOr[scala.Boolean],
    Local: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def OpenXML(Filename: java.lang.String): Workbook = js.native
  def OpenXML(Filename: java.lang.String, Stylesheets: java.lang.String): Workbook = js.native
  def OpenXML(Filename: java.lang.String, Stylesheets: java.lang.String, LoadOption: XlXmlLoadOption): Workbook = js.native
  def OpenXML(Filename: java.lang.String, Stylesheets: stdLib.SafeArray[java.lang.String]): Workbook = js.native
  def OpenXML(
    Filename: java.lang.String,
    Stylesheets: stdLib.SafeArray[java.lang.String],
    LoadOption: XlXmlLoadOption
  ): Workbook = js.native
  def _Default(Index: js.Any): Workbook = js.native
  def _Open(
    Filename: java.lang.String,
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
    Filename: java.lang.String,
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
  ): scala.Unit = js.native
  def _OpenXML(Filename: java.lang.String): Workbook = js.native
  def _OpenXML(Filename: java.lang.String, Stylesheets: js.Any): Workbook = js.native
  /** @param TextQualifier [TextQualifier=1] */
  def __OpenText(
    Filename: java.lang.String,
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
  ): scala.Unit = js.native
}

